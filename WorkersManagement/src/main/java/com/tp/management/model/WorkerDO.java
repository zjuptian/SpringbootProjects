package com.tp.management.model;

import java.io.Serializable;

public class WorkerDO implements Serializable {
    private Integer id;

    private String name;

    private String department;

    private Integer outputMonth;

    private String month;

    private static final long serialVersionUID = 1L;

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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public Integer getOutputMonth() {
        return outputMonth;
    }

    public void setOutputMonth(Integer outputMonth) {
        this.outputMonth = outputMonth;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }
}