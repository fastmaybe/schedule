package com.spring.schedule.pojo;

import java.io.Serializable;

public class DyQuartzJob implements Serializable {
    private Integer id;

    private String name;

    private String desc;

    private String group;

    private String invokeClass;

    private String invokeMethod;

    private String params;

    private String cron;

    private Integer misfirepolicy;

    private Integer concurrent;

    private Integer status;

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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group == null ? null : group.trim();
    }

    public String getInvokeClass() {
        return invokeClass;
    }

    public void setInvokeClass(String invokeClass) {
        this.invokeClass = invokeClass == null ? null : invokeClass.trim();
    }

    public String getInvokeMethod() {
        return invokeMethod;
    }

    public void setInvokeMethod(String invokeMethod) {
        this.invokeMethod = invokeMethod == null ? null : invokeMethod.trim();
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params == null ? null : params.trim();
    }

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron == null ? null : cron.trim();
    }

    public Integer getMisfirepolicy() {
        return misfirepolicy;
    }

    public void setMisfirepolicy(Integer misfirepolicy) {
        this.misfirepolicy = misfirepolicy;
    }

    public Integer getConcurrent() {
        return concurrent;
    }

    public void setConcurrent(Integer concurrent) {
        this.concurrent = concurrent;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        DyQuartzJob other = (DyQuartzJob) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()))
            && (this.getGroup() == null ? other.getGroup() == null : this.getGroup().equals(other.getGroup()))
            && (this.getInvokeClass() == null ? other.getInvokeClass() == null : this.getInvokeClass().equals(other.getInvokeClass()))
            && (this.getInvokeMethod() == null ? other.getInvokeMethod() == null : this.getInvokeMethod().equals(other.getInvokeMethod()))
            && (this.getParams() == null ? other.getParams() == null : this.getParams().equals(other.getParams()))
            && (this.getCron() == null ? other.getCron() == null : this.getCron().equals(other.getCron()))
            && (this.getMisfirepolicy() == null ? other.getMisfirepolicy() == null : this.getMisfirepolicy().equals(other.getMisfirepolicy()))
            && (this.getConcurrent() == null ? other.getConcurrent() == null : this.getConcurrent().equals(other.getConcurrent()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        result = prime * result + ((getGroup() == null) ? 0 : getGroup().hashCode());
        result = prime * result + ((getInvokeClass() == null) ? 0 : getInvokeClass().hashCode());
        result = prime * result + ((getInvokeMethod() == null) ? 0 : getInvokeMethod().hashCode());
        result = prime * result + ((getParams() == null) ? 0 : getParams().hashCode());
        result = prime * result + ((getCron() == null) ? 0 : getCron().hashCode());
        result = prime * result + ((getMisfirepolicy() == null) ? 0 : getMisfirepolicy().hashCode());
        result = prime * result + ((getConcurrent() == null) ? 0 : getConcurrent().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", desc=").append(desc);
        sb.append(", group=").append(group);
        sb.append(", invokeClass=").append(invokeClass);
        sb.append(", invokeMethod=").append(invokeMethod);
        sb.append(", params=").append(params);
        sb.append(", cron=").append(cron);
        sb.append(", misfirepolicy=").append(misfirepolicy);
        sb.append(", concurrent=").append(concurrent);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}