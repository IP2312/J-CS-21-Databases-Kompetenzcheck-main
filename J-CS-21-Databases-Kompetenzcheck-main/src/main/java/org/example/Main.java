package org.example;

import org.example.controller.Controller;
import org.example.controller.PMController;
import org.example.dao.PMDAOImpl;
import org.example.enums.Action;
import org.example.view.View;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Controller controller = new Controller(view);
        PMController pmController = new PMController(new PMDAOImpl(), view);



        boolean exit = false;
        while (!exit){
            boolean storeInDB = view.chooseStorage();
            Action action = view.chooseAction();
            switch (action){
                case NEW_PM:
                    pmController.addPM(storeInDB);
                    break;
                case EXIT:
                    exit = true;
            }
        }


    }
}