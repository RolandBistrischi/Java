package isp.lab7.safehome;

import java.util.HashMap;

public class SafeHome {

    public static void main(String[] args) throws Exception {
        ControllerInterface ctrl = new DoorLockController(new HashMap<>());
        ctrl.addTenant("1234", "Marcel");
        ctrl.addTenant("2345", "Costel");
        //ctrl.addTenant("", "");
        //ctrl.addTenant("9999", "Marcel");
        ctrl.removeTenant("Marcel");
        ctrl.enterPin("2345");
    }
}
