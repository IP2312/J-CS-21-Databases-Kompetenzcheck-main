package org.example.enums;

public enum Action {
    NEW_PM("1"),
    UPDATE_PM("2"),
    DELETE_PM("3"),
    EXIT("0");

    private final String actionId;

    Action(String actionId){
        this.actionId = actionId;
    }

    public String getActionId(){
        return actionId;
    }

    public static Action getActionById(String actionId){
        for (Action action : Action.values()){
            if (action.getActionId().equals(actionId)){
                return action;
            }
        }
        throw new IllegalArgumentException("Invalid action!");
    }

}
