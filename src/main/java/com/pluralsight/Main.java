package com.pluralsight;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
       Membership henry = new Membership("Henry Clark", 3, new BigDecimal("30.00"));
       BasicMembership alice = new BasicMembership("Alice Johnson", 6, new BigDecimal("30.00"), true);
       BasicMembership bob = new BasicMembership("Bob Smith", 2, new BigDecimal("27.50"), false);
       PremiumMembership carol = new PremiumMembership("Carol White", 12, new BigDecimal("48.50"), 2);
       PremiumMembership frank = new PremiumMembership("Frank Miller", 3, new BigDecimal("48.50"), 0);
        System.out.println("=== Gym Memberships ===");
        System.out.println("Henry Clark, 3 months, $30.00 per month");
        System.out.println("Alice Johnson, 6 months, $30.00 per month");
        System.out.println("Bob Smith, 2 months, $27.50 per month");
        System.out.println("Carol White, 12 months, $48.50 per month");
        System.out.println("Frank Miller, 3 months, $48.50 per month");

        System.out.println("---Guest passes---");
        carol.useGuestPass();
        carol.useGuestPass();
        carol.useGuestPass();
        frank.useGuestPass();




    }

}
