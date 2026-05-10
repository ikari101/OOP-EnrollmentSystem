package org.example.service;

import org.example.service.TuitionRegistration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TuitionRegistrationTest {

    @Test
    void testCalculateFee() {

        TuitionRegistration tuitionService =
                new TuitionRegistration();

        double total =
                tuitionService.calculateFee(
                        18,
                        1500
                );

        assertEquals(
                27000,
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
                        6000,
                        2000
                );

        assertEquals(
                4000,
                remaining,
                "Remaining balance calculation is incorrect."
        );
    }
}