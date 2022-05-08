package com.example.goalachiever;

import java.util.Date;
import java.util.List;

public class Goal {

    public GoalObjective goalType;
    public GoalTenure goalTenure;
    public GoalPriority goalPriority;
    public String goalTitle;
    public String goalDescription;

    public List<FamilyMember> goalFamilyMembers;
    public Date goalTargetDate;
    public Number goalTargetAmount;
    public String goalSetupStatus;

    public List<GoalRealizationModel> goalRealizationModels;
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

    private float computeGoalSetupStatus() {
        return 0.0f;
    }

    private float computeGoalRealizationStatus() {
        return 0.0f;
    }

    private float computeGoalImplementationStatus() {
        return 0.0f;
    }
}
