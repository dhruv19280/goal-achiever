package com.example.goalachiever;

import java.util.Date;
import java.util.List;

public class Goal {

    public GoalObjective goalObjective;
    public GoalFrequency GoalFrequency;
    public GoalTenure goalTenure;
    public GoalPriority goalPriority;
    public String goalTitle;
    public String goalDescription;

    public List<Beneficiary> goalLinkedFamilyMembers;
    public List<GoalRealizationModel> goalLinkedRealizationModels;
    public List<Investment> goalLinkedInvestments;
    public List<Liability> goalLinkedLiabilities;
    
    public Date goalTargetDate;
    public Number goalTargetAmountPresentValue;
    public Number goalTargetAmountFutureValue;
    
    public String goalSetupStatus;
    public String goalRealizationStatus;
    public String goalImplementationStatus;

    public List<GoalRealizationModel> suggestRealizationModels() {
        return null;
    }

    public void assignRealizationModel(List<GoalRealizationModel> goalRealizationModels) {

    }

    public void realizeModels() {

    }

    public void implementModels() {

    }

    public float computeGoalSetupStatus() {
        return 0.0f;
    }

    public float computeGoalRealizationStatus() {
        return 0.0f;
    }

    public float computeGoalImplementationStatus() {
        return 0.0f;
    }
}
