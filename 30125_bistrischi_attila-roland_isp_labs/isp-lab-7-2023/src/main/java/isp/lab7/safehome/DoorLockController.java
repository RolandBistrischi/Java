package isp.lab7.safehome;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class DoorLockController implements ControllerInterface {

    private Map<Tenant, AccessKey> validAccess;
    private Door door;
    private List<AccessLog> accessLog;
    private int incercari;

    public DoorLockController(Map<Tenant, AccessKey> validAccess, Door door, List<AccessLog> accessLog) {
        this.validAccess = validAccess;
        this.door = door;
        this.accessLog = accessLog;
        this.incercari = 0;
    }

    public DoorLockController(Map<Tenant, AccessKey> validAccess) {
        this.validAccess = validAccess;
        door = new Door();
        accessLog = new ArrayList<>();
    }

    @Override
    public DoorStatus enterPin(String pin) throws Exception {
        AccessLog accessLog1 = new AccessLog();
        boolean pinFound = false;

        for (Map.Entry<Tenant, AccessKey> entry : validAccess.entrySet()) {
            if (pin.equals(entry.getValue().getPin())) {
                pinFound = true;
                accessLog1.setTenantName(entry.getKey().getName());
                accessLog1.setDateTime(LocalDateTime.now());
                break;
            }
        }
        if (pin.equals(ControllerInterface.MASTER_KEY)) {
            door.unlockDoor();
            accessLog1.setOperation("MASTER_KEY");
            incercari = 0;

        } else if (!pinFound) {
            incercari++;
            if (incercari >= 3) {
                door.lockDoor();
                accessLog1.setOperation("DENIED");
                accessLog1.setErrorMessage("YOU DO NOT PASS INVALID PIN");
                throw new TooManyAttemptsException("Too many attempts, get and admin key to unlock");
            }
            throw new InvalidPinException("invaloid pin");

        } else {
            if (incercari >= 3) {
                door.lockDoor();
                accessLog1.setOperation("DENIED");
                accessLog1.setErrorMessage("YOU DO NOT PASS INVALID PIN");
                throw new TooManyAttemptsException("Too many attempts, get and admin key to unlock");
            }
            if (door.getStatus() == DoorStatus.CLOSE) {
                door.unlockDoor();
                accessLog1.setOperation("ACCESS");
                incercari = 0;
            } else {
                door.lockDoor();
                accessLog1.setOperation("DENIED");
                accessLog1.setErrorMessage("YOU DO NOT PASS INVALID PIN");
            }
        }
        accessLog1.setDoorStatus(door.getStatus());
        this.accessLog.add(accessLog1);
        return door.getStatus();
    }

    @Override
    public void addTenant(String pin, String name) throws Exception {
        if (name == null || name.trim().isEmpty()) {
            throw new EmptyTenantNameException("Tenant is null");
        }
        Tenant tenant = new Tenant(name);
        AccessKey accessKey = new AccessKey(pin);
        if (validAccess.containsKey(tenant)) {
            throw new TenantAlreadyExistsException("Tenant already exist" + name);
        } else {
            validAccess.put(tenant, accessKey);
        }
    }

    @Override
    public void removeTenant(String name) throws Exception {
        Tenant tenant = new Tenant(name);
        if (name == null || name.trim().isEmpty()) {
            throw new EmptyTenantNameException("Tenant is null.Not can remove.");
        }
        if (!validAccess.containsKey(tenant)) {
            throw new TenantNotFoundException("Tenant not found");
        } else {
            validAccess.remove(tenant);
        }
    }

    @Override
    public List<AccessLog> getAccessLog() {
        return null;
    }
}
