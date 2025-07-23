package org.example.controller;

import org.example.dao.PMDAOImpl;
import org.example.model.PM;
import org.example.view.View;

public class PMController {
    private final PMDAOImpl pmDAO;
    private final View view;

    public PMController(PMDAOImpl pmDAO, View view) {
        this.pmDAO = pmDAO;
        this.view = view;
    }



    public void addPM(boolean storeInDB){
        PM pm = view.getPMInfo();
        if (storeInDB){
            pmDAO.insert(pm);
        }else{

        }


    }
}
