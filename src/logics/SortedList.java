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

        List<DataStore> dss = dss = hf.readFile();
   
        dss.add(ds);
        
        DataStore[] da = new DataStore[dss.size()];

        for (int i = 0; i < dss.size(); i++) {
            System.out.println("da "+dss.get(i).getLotNo());
            da[i] = dss.get(i);
        }

        
        
        for (int i = da.length - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (da[j].getLotNo() > da[j + 1].getLotNo()) {
                    DataStore temp = da[j + 1];
                    da[j + 1] = da[j];
                    da[j] = temp;
                }
            }
        }

        
        List<DataStore> d1 = new ArrayList<>();
        for(DataStore d:da){
         
            d1.add(d);
        }

        hf.saveHouseList(d1);
        return dss;
    }

}
