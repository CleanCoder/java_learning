package com.example.lesson03.models;

public class ArrayResultModel {
    public ArrayResultModel(long startTime, long endTime, double costInMillis, int[] result) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.costInMillis = costInMillis;
        this.result = result;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public double getCostInMillis() {
        return costInMillis;
    }

    public int[] getResult() {
        return result;
    }

    private long startTime;
    private long endTime;
    private double costInMillis;
    private int[] result;
}
