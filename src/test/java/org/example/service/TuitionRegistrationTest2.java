package org.example.service;

import org.example.service.TuitionRegistration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TuitionRegistrationTest2 {

    @Test
    void testCalculateFee() {

        TuitionRegistration tuitionService =
                new TuitionRegistration();

        double total =
                tuitionService.calculateFee(
                        3,
                        1500
                );

        assertEquals(
                4500,
                total,
                "Tuition calculation is incorrect."
        );
    }

    @Test
    void testRemainingBalance() {

        TuitionRegistration tuitionService =
                new TuitionRegistration();

        double remaining =
                tuitionService.getRemainingBalance(
                        4500,
                        2000
                );

        assertEquals(
                2500,
                remaining,
                "Remaining balance calculation is incorrect."
        );
    }

    @Test
    void testScholarshipDiscount() {

        TuitionRegistration tuitionService =
                new TuitionRegistration();

        double discounted =
                tuitionService.applyScholarshipDiscount(
                        10000,
                        50
                );

        assertEquals(
                5000,
                discounted,
                "Scholarship discount calculation is incorrect."
        );
    }
}