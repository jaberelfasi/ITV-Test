package com.itv.talentpaymentskata;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader {

	public ArrayList<String[]> readCSV(String csvFileLocation) {
		
		ArrayList<String[]> csvConvertedToArrayList = new ArrayList<String[]>();
		
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFileLocation));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] csvRow = line.split(cvsSplitBy);
                
                //add csv row
                csvConvertedToArrayList.add(csvRow);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
		
		

		return csvConvertedToArrayList;

	}
}
