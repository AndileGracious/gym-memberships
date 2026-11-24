package com.pluralsight;

import java.math.BigDecimal;

public class BasicMembership extends Membership {
    private boolean offPeakOnly;

    public BasicMembership(String memberName, int months, BigDecimal baseRate, boolean offPeakOnly) {
        super(memberName, months, baseRate);
        this.offPeakOnly = offPeakOnly;
    }

    public boolean isOffPeakOnly() {
        return offPeakOnly;
    }

    public void setOffPeakOnly(boolean offPeakOnly) {
        this.offPeakOnly = offPeakOnly;
    }

    @Override
    public BigDecimal getMonthlyPrice() {
        if (offPeakOnly){
            return super.getMonthlyPrice().subtract(new BigDecimal("5.00"));
        }
        else {
            return super.getMonthlyPrice();
        }
    }

    @Override
    public String toString(){
        return "Basic | " + getMemberName() + " | " + getMonths() + " months | off-peak only: " + isOffPeakOnly();
    }

    @Override
    public String getMembershipKind() {
        return "Basic";
    }
}
