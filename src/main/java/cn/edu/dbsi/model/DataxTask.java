package cn.edu.dbsi.model;

import java.util.Date;

public class DataxTask {
    private Integer id;

    private String name;

    private Integer businessPackageId;

    private String hiveIp;

    private String taskStatus;

    private Date createTime;

    private Date finishTime;

    private String isDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getBusinessPackageId() {
        return businessPackageId;
    }

    public void setBusinessPackageId(Integer businessPackageId) {
        this.businessPackageId = businessPackageId;
    }

    public String getHiveIp() {
        return hiveIp;
    }

    public void setHiveIp(String hiveIp) {
        this.hiveIp = hiveIp == null ? null : hiveIp.trim();
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus == null ? null : taskStatus.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }
}