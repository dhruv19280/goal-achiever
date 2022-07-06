package com.example.goalachiever;

public class BasicAssumptions {


    // Rate of Return that is assumed for Debt Investments that 
    // you make after retirement. Used to make post retirement cash
    // flow recommendations and for calculations pertaining to
    // retirementp planning.
    public static float debtAssumedPreRetirementCAGR;


    // Rate of Return that is assumed for Debt Investments that 
    // you make before retirement. Used to determine cash flow
    // and for asset mapping.
    public static float debtAssumedPostRetirementCAGR;


    // Rate of Return that is assumed for Equity Investments that 
    // you make after retirement. Used to make post retirement cash
    // flow recommendations and for calculations pertaining to
    // retirementp planning.
    public static float equityAssumedPreRetirementCAGR;
    
    // Rate of Return that is assumed for Equity Investments that 
    // you make before retirement. Used to determine cash flow
    // and for asset mapping.
    public static float equityAssumedPostRetirementCAGR;

    // Rate of Return that is assumed for Gold Investments
    // Could be physical gold, Gold ETFs or Gold Mutual Funds.
    // Used to determine cash flow and for asset mapping.
    public static float goldAssumedCAGR;

    // Human Life value Rate which is used to calcuate the life
    // insurance corpus required for you. Basically the assumption
    // is if something unfortunate happens to you and your family
    // claims the insurance money from the company, then they would
    // be investing the entire sum assured at this rate.
    public static float humanLifeValueAssumedCAGR;

    // Rate of Return for short term liquic fund investments that you
    // make for building an emergency fund. Used to make cash flow
    // recommendations and for asset mapping.
    public static float liquidFundAssumedCAGR;


    // Rate of Return assumed for all real estate investments.
    // Used to make cash flow recommendations and for asset mapping.
    public static float realEstateAssumedCAGR;

    // All expense you incur before retirement (household/education etc)
    // are inflated at this rate. Used to calculate the corpus you
    // will need for your retirement years.
    public static float inflationAssumedPreRetirement;

    // All expense you incur after retirement (household/education etc)
    // are inflated at this rate. Used to make post retirement cash flow
    // recommendations and to determine quantum of corpus needed for your
    // retirement.
    public static float inflationAssumedPostRetirement;   
}
