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
    public String goalStatus;

    public GoalRealizationModel goalRealizationModel;
    public String goalRealizationStatus;

    public GoalRealizationModel suggestRealizationModel() {
        return null;
    }

    public GoalRealizationModel assignRealizationModel(GoalRealizationModel goalRealizationModel) {
        return null;
    }


}
