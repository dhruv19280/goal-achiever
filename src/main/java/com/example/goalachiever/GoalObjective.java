package com.example.goalachiever;

public enum GoalObjective {    
    CHILD_BIRTH ("Child Birth",  GoalRealizationModelType.EQUITY, GoalRealizationModelType.MUTUAL_FUNDS,  GoalRealizationModelType.SYSTEMATIC_INVESTMENT_PLAN),
    CHILD_BIRTHDAY ("Child Birthday (Annual)", GoalRealizationModelType.FIXED_DEPOSITS,  GoalRealizationModelType.EQUITY,  GoalRealizationModelType.GOLD),
    CHILD_EDUCATION ("Higher Education of a Child", GoalRealizationModelType.SYSTEMATIC_INVESTMENT_PLAN,  GoalRealizationModelType.MUTUAL_FUNDS,  GoalRealizationModelType.EQUITY),
    CHILD_MARRIAGE ("Marriage of a Child",  GoalRealizationModelType.EQUITY, GoalRealizationModelType.MUTUAL_FUNDS,  GoalRealizationModelType.GOLD),
    CHILD_ANNIVERSARY ("Anniversary of a Child", GoalRealizationModelType.SYSTEMATIC_INVESTMENT_PLAN, GoalRealizationModelType.GOLD, GoalRealizationModelType.FIXED_DEPOSITS),
    CHILD_INHERITANCE ("To create a surplus to pass on as inheritance to the Child", GoalRealizationModelType.FIXED_DEPOSITS, GoalRealizationModelType.SYSTEMATIC_INVESTMENT_PLAN, GoalRealizationModelType.GOLD),
    SELF_EDUCATION ("Corpus required for education of Self", GoalRealizationModelType.SYSTEMATIC_INVESTMENT_PLAN, GoalRealizationModelType.FIXED_DEPOSITS, GoalRealizationModelType.EQUITY),
    SELF_BIRTHDAY,
    SELF_MARRIAGE,
    SELF_ANNIVERSARY,
    SELF_HEALTH,
    SELF_TRAVEL,
    SPOUSE_BIRTHDAY,
    SPOUSE_EDUCATION,
    SPOUSE_HEALTH,
    SPOUSE_TRAVEL,
    FAMILY_HEALTH,
    FAMILY_TRAVEL,
    EMERGENCY_COVERAGE,
    PROFESSIONAL_BREAK,
    EARLY_RETIREMENT,
    RETIREMENT_CORPUS,
    CREDIT_CARD_REPAYMENT,
    LOAN_REPAYMENT,
    PROPERTY_ACQUISITION,
    JEWELLERY_ACQUISITION,
    OTHER_ASSET_ACQUISITION,
    ENTREPRENUERSHIP,
    OTHER;


    private String description;
    private GoalRealizationModelType proposedGoalRealizationModel1;
    private GoalRealizationModelType proposedGoalRealizationModel2;
    private GoalRealizationModelType proposedGoalRealizationModel3;

    GoalObjective(String description, GoalRealizationModelType proposal1, GoalRealizationModelType proposal2, GoalRealizationModelType proposal3) {
        this.description = description;
        this.proposedGoalRealizationModel1 = proposal1;
        this.proposedGoalRealizationModel2 = proposal2;
        this.proposedGoalRealizationModel3 = proposal3;
    }
}
