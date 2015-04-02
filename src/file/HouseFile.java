package file;

import logics.DataStore;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ezio
 */
public class HouseFile {

    public List<DataStore> readFile() {

        List<DataStore> houses = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("HouseData"));

            String line;
            while ((line = br.readLine()) != null) {
//                System.out.println("line " + line);
                String[] rows = line.split("\t");
//                System.out.println("rows " + Arrays.toString(rows));

                DataStore house = new DataStore();
                house.setLotNo(Long.parseLong(rows[0]));
                house.setFName(rows[1]);
                house.setLName(rows[2]);
                house.setPrice(Long.parseLong(rows[3]));
                house.setSqFeet(Long.parseLong(rows[4]));
                house.setNoOfRoom(Integer.parseInt(rows[5]));

                houses.add(house);
            }

        } catch (FileNotFoundException e) {
            if (e.getMessage().equals("HouseData (The system cannot find the file specified)")) {
                BufferedWriter output = null;
                try {
                    File file = new File("HouseData");
                    output = new BufferedWriter(new FileWriter(file));
                } catch (IOException ex) {
                    Logger.getLogger(HouseFile.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    try {
                        if (output != null) {
                            output.close();
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(HouseFile.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(HouseFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return houses;
    }

    public void saveFile(String fileData) {
        try {
            FileWriter fw = new FileWriter("HouseData", true); //the true will append the new data
            fw.write(fileData + "\n");//appends the string to the file
            fw.close();
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

    public void saveHouseFile(DataStore house) {
        try {
            FileWriter fw = new FileWriter("HouseData", true);
            fw.write(house.getLotNo() + "\t" + house.getFName() + "\t" + house.getLName() + "\t" + house.getPrice() + "\t" + house.getSqFeet() + "\t" + house.getNoOfRoom() + "\n");
            fw.close();
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

    public void saveHouseList(List<DataStore> house) {
        String text = "";
        for (DataStore h : house) {
            text += h.getLotNo() + "\t" + h.getFName() + "\t" + h.getLName() + "\t" + h.getPrice() + "\t" + h.getSqFeet() + "\t" + h.getNoOfRoom() + "\n";
        }
//        System.out.println(text);
        try {
            BufferedWriter output = null;
            File file = new File("HouseData");
            output = new BufferedWriter(new FileWriter(file));
            output.write(text);
            output.close();
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

    public void clearFile() {
        try {
            String text = null;
            BufferedWriter output = null;
            File file = new File("HouseData");
            output = new BufferedWriter(new FileWriter(file));
            output.write("");
            output.close();
        } catch (Exception ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

}
