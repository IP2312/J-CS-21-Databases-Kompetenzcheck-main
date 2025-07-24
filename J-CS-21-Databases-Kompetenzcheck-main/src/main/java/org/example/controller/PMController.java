package org.example.controller;

import org.example.dao.PMDAOImpl;
import org.example.fileIO.PMIOImpl;
import org.example.model.PM;
import org.example.view.View;

public class PMController {
    private final PMDAOImpl pmDAO = new PMDAOImpl();
    private final PMIOImpl pmIO = new PMIOImpl();
    private final View view;

    public PMController(View view) {
        this.view = view;
    }



    public void addPM(boolean storeInDB){
        PM pm = view.getPMInfo();
        if (storeInDB){
                pmDAO.insert(pm);
        }else{
            pmIO.write(pm);
        }


    }
}
