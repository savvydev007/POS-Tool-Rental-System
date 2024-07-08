package com.example.toolrental;

import java.time.LocalDate;

public class RentalAggrement {
    private Tool tool;
    private int rentalDays;
    private int chargeableDays;
    private double preDiscountCharge;
    private int discountPercent;
    private double discountAmount;
    private double finalCharge;
    private LocalDate checkoutDate;
    private LocalDate dueDate;

    // Constructor
    public RentalAggrement(Tool tool, int rentalDays, int chargeableDays, double preDiscountCharge, int discountPercent, double discountAmount, double finalCharge, LocalDate checkoutDate, LocalDate dueDate) {
        this.tool = tool;
        this.rentalDays = rentalDays;
        this.chargeableDays = chargeableDays;
        this.preDiscountCharge = preDiscountCharge;
        this.discountPercent = discountPercent;
        this.discountAmount = discountAmount;
        this.finalCharge = finalCharge;
        this.checkoutDate = checkoutDate;
        this.dueDate = dueDate;
    }

    // Getters
    public int getRentalDays() {
        return rentalDays;
    }

    public int getChargeableDays() {
        return chargeableDays;
    }

    public double getPreDiscountCharge() {
        return preDiscountCharge;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public double getFinalCharge() {
        return finalCharge;
    }

    @Override
    public String toString() {
        return "RentalAggrement{" +
                "tool=" + tool.getType() +
                ", rentalDays=" + rentalDays +
                ", chargeableDays=" + chargeableDays +
                ", preDiscountCharge=" + preDiscountCharge +
                ", discountPercent=" + discountPercent +
                ", discountAmount=" + discountAmount +
                ", finalCharge=" + finalCharge +
                ", checkoutDate=" + checkoutDate +
                ", dueDate=" + dueDate +
                '}';
    }
}