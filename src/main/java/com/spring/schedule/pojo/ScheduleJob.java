package com.spring.schedule.pojo;

public class ScheduleJob {
    private Integer id;

    private String cronClass;

    private String cronMethod;

    private String cronExpression;

    private String initialdelay;

    private String taskType;

    private String params;

    private Integer status;

    private String desc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCronClass() {
        return cronClass;
    }

    public void setCronClass(String cronClass) {
        this.cronClass = cronClass == null ? null : cronClass.trim();
    }

    public String getCronMethod() {
        return cronMethod;
    }

    public void setCronMethod(String cronMethod) {
        this.cronMethod = cronMethod == null ? null : cronMethod.trim();
    }

    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression == null ? null : cronExpression.trim();
    }

    public String getInitialdelay() {
        return initialdelay;
    }

    public void setInitialdelay(String initialdelay) {
        this.initialdelay = initialdelay == null ? null : initialdelay.trim();
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType == null ? null : taskType.trim();
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params == null ? null : params.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ScheduleJob other = (ScheduleJob) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCronClass() == null ? other.getCronClass() == null : this.getCronClass().equals(other.getCronClass()))
            && (this.getCronMethod() == null ? other.getCronMethod() == null : this.getCronMethod().equals(other.getCronMethod()))
            && (this.getCronExpression() == null ? other.getCronExpression() == null : this.getCronExpression().equals(other.getCronExpression()))
            && (this.getInitialdelay() == null ? other.getInitialdelay() == null : this.getInitialdelay().equals(other.getInitialdelay()))
            && (this.getTaskType() == null ? other.getTaskType() == null : this.getTaskType().equals(other.getTaskType()))
            && (this.getParams() == null ? other.getParams() == null : this.getParams().equals(other.getParams()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCronClass() == null) ? 0 : getCronClass().hashCode());
        result = prime * result + ((getCronMethod() == null) ? 0 : getCronMethod().hashCode());
        result = prime * result + ((getCronExpression() == null) ? 0 : getCronExpression().hashCode());
        result = prime * result + ((getInitialdelay() == null) ? 0 : getInitialdelay().hashCode());
        result = prime * result + ((getTaskType() == null) ? 0 : getTaskType().hashCode());
        result = prime * result + ((getParams() == null) ? 0 : getParams().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cronClass=").append(cronClass);
        sb.append(", cronMethod=").append(cronMethod);
        sb.append(", cronExpression=").append(cronExpression);
        sb.append(", initialdelay=").append(initialdelay);
        sb.append(", taskType=").append(taskType);
        sb.append(", params=").append(params);
        sb.append(", status=").append(status);
        sb.append(", desc=").append(desc);
        sb.append("]");
        return sb.toString();
    }
}