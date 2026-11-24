package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       Membership henry = new Membership("Henry Clark", 3, new BigDecimal("30.00"));
       BasicMembership alice = new BasicMembership("Alice Johnson", 6, new BigDecimal("30.00"), true);
       BasicMembership bob = new BasicMembership("Bob Smith", 2, new BigDecimal("27.50"), false);
       PremiumMembership carol = new PremiumMembership("Carol White", 12, new BigDecimal("30.00"), 2);
       PremiumMembership frank = new PremiumMembership("Frank Miller", 3, new BigDecimal("30.00"), 0);
       FamilyMembership grace = new FamilyMembership("Grace Lee", 12, new BigDecimal("30.00"),3);
       FamilyMembership emma = new FamilyMembership("Emma Wilson", 6, new BigDecimal("30"), 1);

       henry.setFrontDeskNotes("likes morning check-in");
       alice.setFrontDeskNotes("Wants a locker near the front");
       bob.setFrontDeskNotes("Likes a quiet corner");
       carol.setFrontDeskNotes("Loves spin class");
       frank.setFrontDeskNotes("Needs help with form on the first day");
       grace.setFrontDeskNotes("Brings company on weekends");
       emma.setFrontDeskNotes("Prefers evening work outs");



        System.out.println("=== Gym Memberships ===");
        ArrayList<Membership> myList = new ArrayList<Membership>();
        myList.add(henry);
        myList.add(alice);
        myList.add(bob);
        myList.add(carol);
        myList.add(frank);
        myList.add(grace);
        myList.add(emma);

        for (int i = 0; i < myList.size(); i++) {
            System.out.println((myList.get(i)));
            System.out.println("Kind: " + myList.get(i).getMembershipKind());

        }


        System.out.println("--- Guest passes ---");
        carol.useGuestPass();
        carol.useGuestPass();
        carol.useGuestPass();
        frank.useGuestPass();

        System.out.println("--- Sign-Up fee and contract total ---");
        System.out.println("Henry Clark: fee $" + henry.getSignUpFee() + ", total $" + henry.getContractTotal());
        System.out.println("Carol White: fee $" + carol.getSignUpFee() + ", total $" + carol.getContractTotal());
        System.out.println("Frank Miller: fee $" + frank.getSignUpFee() + ", total $" + frank.getContractTotal());
        System.out.println("Grace Lee: fee $" + grace.getSignUpFee() + ", total $" + grace.getContractTotal());



    }

}
