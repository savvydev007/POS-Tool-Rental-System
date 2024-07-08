package com.example.toolrental;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class ToolRentalApplication {
    public static void main(String[] args) {
        try {
            ToolRentalApplication app = new ToolRentalApplication();
            RentalAggrement aggrement = app.checkout("LADW", 5, 20, LocalDate.of(2024,7,8));
            System.out.println(aggrement);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private Map<String, Tool> tools = new HashMap<>();

    public ToolRentalApplication() {
        tools.put("CHNS", new Tool("Chainsaw", 1.49, false, true));
        tools.put("LADW", new Tool("Ladder", 1.99, true, false));
        tools.put("JAKR", new Tool("Jackhammer", 2.99, false, false));
    }

    public RentalAggrement checkout(String toolCode, int rentalDays, int discountPercent, LocalDate checkoutDate) throws Exception {
        if(rentalDays < 1) {
            throw new Exception("Rental days must be 1 or greater");
        }
        if(discountPercent < 0 || discountPercent > 100) {
            throw new Exception("Discount percent must be between 0 and 100");
        }

        Tool tool = tools.get(toolCode);
        if(tool == null) {
            throw new Exception("Tool not found");
        }

        LocalDate dueDate = checkoutDate.plusDays(rentalDays);
        int chargeableDays = calculateChargeableDays(tool, checkoutDate, dueDate);
        double preDiscountCharge = chargeableDays * tool.getDailyCharge();
        double discountAmount = preDiscountCharge * discountPercent / 100.0;
        double finalCharge = preDiscountCharge - discountAmount;

        return new RentalAggrement(tool, rentalDays, chargeableDays, preDiscountCharge, discountPercent, discountAmount, finalCharge, checkoutDate, dueDate);
    }

    private int calculateChargeableDays(Tool tool, LocalDate start, LocalDate end) {
        int chargeableDays = 0;
        for (LocalDate date = start; date.isBefore(end); date = date.plusDays(1)) {
            if((tool.isWeekdayCharge() && isWeekday(date)) ||
               (tool.isWeekendCharge() && isWeekend(date)) ||
               (!isHoliday(date))) {
                chargeableDays ++;
            }
        }
        return chargeableDays;
    }

    private boolean isWeekday(LocalDate date) {
        return !(date.getDayOfWeek().getValue() == 6 || date.getDayOfWeek().getValue() == 7);
    }

    private boolean isWeekend(LocalDate date) {
        return !isWeekday(date);
    }

    private boolean isHoliday(LocalDate date) {
        return (date.getMonthValue() == 7 && date.getDayOfMonth() == 4) ||
               (date.getMonthValue() == 9 && date.getDayOfWeek().getValue() == 1);
    }
}