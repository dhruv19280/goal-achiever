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

    public GoalRealizationModel assignRealizationModel(List<GoalRealizationModel> goalRealizationModels) {
        return null;
    }

    public void realizeModels() {

    }

    private String updateGoalSetupStatus() {
        return null;
    }

    private String updateGoalRealizationStatus() {
        return null;
    }

    private String updateGoalImplementationStatus() {
        return null;
    }

}
