package com.example.goalachiever;

import java.util.List;

public class Investment {

    public String investmentDescription;
    public GoalRealizationModelType investmentModelType;

    public Beneficiary investmentOwner1;
    public Beneficiary investmentOwner2;
    public Beneficiary investmentOwner3;
    public String investmentHouse;
    public String investmentProduct;
    public String investmentFolio;
    public String investmentISIN;
    public String investmentSymbol;
    public String investmentExchange;
    
    public List<TransactionStructure> investmentTransactionHistory;
}