package edu.miracosta.cs134.tipcalculator.model;

public class Bill {
    private double mAmount;
    private double mTipPercent;
    private double mTipAmount;
    private double mTotalAmount;

    public Bill()
    {
        mAmount = 0.0;
        mTipPercent = 0.0;
        mTipAmount = 0.0;
        mTotalAmount = 0.0;
    }

    public double getAmount() {
        return mAmount;
    }

    public double getTipPercent() {
        return mTipPercent;
    }

    public double getTipAmount() {
        return mTipAmount;
    }

    public double getTotalAmount() {
        return mTotalAmount;
    }

    public void setAmount(double amount) {
        mAmount = amount;
        recalculateAmounts();
    }

    public void setTipPercent(double tipPercent) {
        mTipPercent = tipPercent;
        recalculateAmounts();
    }

    private void recalculateAmounts()
    {
        mTipAmount = mAmount * mTipPercent;
        mTotalAmount = mAmount + mTipAmount;
    }
}
