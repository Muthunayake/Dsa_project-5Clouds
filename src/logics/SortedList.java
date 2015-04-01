/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logics;

import file.HouseFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Ezio
 */
public class SortedList {

    private List<DataStore> houses;

    public void setHouses(List<DataStore> houses) {
        this.houses = houses;
    }

    public List<DataStore> saveFile(DataStore ds) {

        HouseFile hf = new HouseFile();

        houses = hf.readFile();
   
        houses.add(ds);
        
        DataStore[] datastore_obj = new DataStore[houses.size()];

        for (int i = 0; i < houses.size(); i++) {
            
            datastore_obj[i] = houses.get(i);
        }

        
        
        for (int i = datastore_obj.length - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (datastore_obj[j].getLotNo() > datastore_obj[j + 1].getLotNo()) {
                    DataStore temp = datastore_obj[j + 1];
                    datastore_obj[j + 1] = datastore_obj[j];
                    datastore_obj[j] = temp;
                }
            }
        }

        
        List<DataStore> list_oject = new ArrayList<>();
        for(DataStore d:datastore_obj){
         
            list_oject.add(d);
        }

        hf.saveHouseList(list_oject);
        return houses;
    }

}
