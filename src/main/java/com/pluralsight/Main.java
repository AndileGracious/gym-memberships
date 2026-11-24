package com.pluralsight;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
       Membership henry = new Membership("Henry Clark", 3, new BigDecimal("30.00"));
        System.out.println("Gym Memberships");
        System.out.println("Welcome Henry Clark. Your gym membership is valid for 3 months, paying 30.00 a month.");



    }

}
