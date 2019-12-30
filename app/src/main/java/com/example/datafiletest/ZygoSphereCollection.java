package com.example.datafiletest;

import android.content.Context;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class ZygoSphereCollection extends ZygoSphere {
    Context mContext;

    static List<String> listOfSpheres = new ArrayList<String>();

    public ZygoSphereCollection(double fNumber, double sphereRadius, String name) {
        super(fNumber, sphereRadius, name);
    }

    static public void getListofSpheres(){
        return;
    }

    private void fillListOfSpheres(Context context) throws IOException {
        this.mContext = context;
        Reader fileReader = null;
        String inString;
        ArrayList<String> list  = new ArrayList<String>();
        String currentLine;

        try {
            fileReader = new FileReader("zygoAttributes.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(fileReader);

        while (true){
            currentLine = br.readLine();
            
            if (currentLine != null){
                System.out.println(currentLine);
            } else {break;}
            
        }

        return;
    }

}
