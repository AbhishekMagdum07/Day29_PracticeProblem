package com.state_census;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StateCensusData {
    public void readCsvFile(){ // Reading contacts using CSV File handling.
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\windows\\Desktop\\StateCensusData.csv"));
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        StateCensusData runner = new StateCensusData();
        runner.readCsvFile();
    }
}
