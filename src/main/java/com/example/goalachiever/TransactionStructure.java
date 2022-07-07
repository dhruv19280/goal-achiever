package com.example.goalachiever;

import java.util.Date;

public class TransactionStructure {
    
    public Date transactionDate;
    public TransactionType transactionType;
    public float transactionPrice;
    public float transactionUnitsOpeningBalance;
    public float transactionUnits;
    public float transactionUnitsClosingBalance;
    public Number transactionValueOpeningBalance;
    public Number transactionValue;
    public Number transactionValueClosingBalance;

    public boolean mostRecentValue;
    public boolean mostRecentTransaction;    
}
