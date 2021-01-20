package com.tp.management.vo;

/**
 * @Author: zjuptian
 * @Date: 2021/1/20 16:38
 * @Description:
 */
public class OutputVO {
    private int worker_id;
    private int output;
    private String date;

    public int getWorker_id() {
        return worker_id;
    }

    public void setWorker_id(int worker_id) {
        this.worker_id = worker_id;
    }

    public int getOutput() {
        return output;
    }

    public void setOutput(int output) {
        this.output = output;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
