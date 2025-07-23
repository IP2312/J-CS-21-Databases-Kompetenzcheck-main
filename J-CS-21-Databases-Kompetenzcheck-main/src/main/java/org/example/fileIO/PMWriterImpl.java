package org.example.fileIO;

import org.example.model.PM;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.concurrent.atomic.AtomicInteger;

public class PMWriterImpl implements PMWriter{
    @Override
    public PM read(int id) {
        return null;
    }

    @Override
    public int write(PM pm) {
        File file = new File("data/PM.csv");
        boolean exists = file.exists();
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            if (!exists) {
                //TODO place Atomic integer
                AtomicInteger PMId = new AtomicInteger(1);
                bw.write("ID,Location");
                bw.newLine();
                bw.write(PMId + "," + pm.getLocation());
                return PMId.get();
            }else{

            }
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("Couldn't write PM to file!", e);
        }
    }

    @Override
    public int update(PM pm) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }
}
