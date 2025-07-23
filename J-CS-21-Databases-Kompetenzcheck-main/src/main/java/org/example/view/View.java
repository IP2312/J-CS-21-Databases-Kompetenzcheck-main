package org.example.view;

import org.example.enums.Action;
import org.example.model.PM;

import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);

    public boolean chooseStorage(){
        System.out.println("Store Data in Database? (y/n)");
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("y")) {
                return true;
            }else if (input.equalsIgnoreCase("n")){
                return false;
            }
            System.out.println("Please enter y or n!");
        }
    }

    public Action chooseAction(){
        System.out.println("Choose an action:");
        for (Action action : Action.values()){
            System.out.println(action.getActionId() + " " + action.name());
        }
        while (true){
            String input = scanner.nextLine().trim();
            try{
                return Action.getActionById(input);
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }


    public PM getPMInfo(){
        System.out.println("Please enter the location of the PM:");
        String location = scanner.nextLine().trim();
        return new PM(location);
    }
}
