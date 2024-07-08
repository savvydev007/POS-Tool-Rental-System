package com.example.toolrental;

class Tool {
    private String type;
    private double dailyCharge;
    private boolean weekdayCharge;
    private boolean weekendCharge;

    public Tool(String type, double dailyCharge, boolean weekdayCharge, boolean weekendCharge) {
        this.type = type;
        this.dailyCharge = dailyCharge;
        this.weekdayCharge = weekdayCharge;
        this.weekendCharge = weekendCharge;
    }

    public String getType() {
        return type;
    }

    public double getDailyCharge() {
        return dailyCharge;
    }

    public boolean isWeekdayCharge() {
        return weekdayCharge;
    }

    public boolean isWeekendCharge() {
        return weekendCharge;
    }
}
