package org.example.fileIO;

import org.example.model.PM;

import java.io.*;

public class PMIOImpl implements PMIO {



    @Override
    public PM read(int id) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("java/data/PM.csv"));
        String currentLine = br.readLine();
        while (currentLine != null){

        }
        return null;
    }

    @Override
    public int write(PM pm) {
        File file = new File("J-CS-21-Databases-Kompetenzcheck-main/data/PM.csv");

        boolean exists = file.exists();
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            if (!exists) {
                bw.write("ID,Location");
                bw.newLine();
                bw.write( 1 + "," + pm.getLocation());
            }else{
                bw.newLine();
                //TODO id
                bw.write(pm.getId() + "," + pm.getLocation());
            }
            bw.flush();
            bw.close();
            return 2;
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
