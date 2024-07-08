package com.example.toolrental;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToolRentalApplicationTest {
    @Test
    public void testCheckout() {
        // Adjust the constructor parameters to match the Tool class constructor
        Tool tool = new Tool("LADW", 50.0, true, false);
        RentalAggrement rentalAgreement = new RentalAggrement(
                tool,
                5,  // rentalDays
                4,  // chargeableDays
                10.0,  // preDiscountCharge
                20,  // discountPercent
                2.0,  // discountAmount
                8.0,  // finalCharge
                LocalDate.now(),
                LocalDate.now().plusDays(5)
        );

        assertEquals(5, rentalAgreement.getRentalDays());
        assertEquals(4, rentalAgreement.getChargeableDays());
        assertEquals(10.0, rentalAgreement.getPreDiscountCharge(), 0.001);
        assertEquals(20, rentalAgreement.getDiscountPercent());
        assertEquals(2.0, rentalAgreement.getDiscountAmount(), 0.001);
        assertEquals(8.0, rentalAgreement.getFinalCharge(), 0.001);
        assertEquals(4, rentalAgreement.getChargeableDays());
    }
}