package isp.lab7.safehome;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AccessLog {
    private String tenantName;
    private LocalDateTime dateTime;
    private String operation;
    private DoorStatus doorStatus;
    private String errorMessage;
    //private List<AccessLog> accessLogList = new ArrayList<>();

    public AccessLog(String tenantName, LocalDateTime dateTime, String operation, DoorStatus doorStatus, String errorMessage/*, List<AccessLog> accessLogList*/) {
        this.tenantName = tenantName;
        this.dateTime = dateTime;
        this.operation = operation;
        this.doorStatus = doorStatus;
        this.errorMessage = errorMessage;
        //this.accessLogList = accessLogList;
    }

    public AccessLog() {
    }

    /*public void logAccess(String name, Door door, DoorStatus doorStatus, String errorMessage) {
        AccessLog accessLog = new AccessLog(name, LocalDateTime.now(), "ACCESS", doorStatus, errorMessage);
        accessLogList.add(accessLog);
    }*/

    /*public List<AccessLog> getAccessLogList() {
        return accessLogList;
    }*/

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public DoorStatus getDoorStatus() {
        return doorStatus;
    }

    public void setDoorStatus(DoorStatus doorStatus) {
        this.doorStatus = doorStatus;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /*public void setAccessLogList(List<AccessLog> accessLogList) {
        this.accessLogList = accessLogList;
    }*/
}
