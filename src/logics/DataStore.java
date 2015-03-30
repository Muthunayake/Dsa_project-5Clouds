
package logics;


public class DataStore {
    
    private Long lotNo;
    private String fName;
    private String lName;
    private Long price;
    private Long sqFeet;
    private Integer noOfRoom;

    public Long getLotNo() {
        return lotNo;
    }

    public void setLotNo(Long lotNo) {
        this.lotNo = lotNo;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getSqFeet() {
        return sqFeet;
    }

    public void setSqFeet(Long sqFeet) {
        this.sqFeet = sqFeet;
    }

    public Integer getNoOfRoom() {
        return noOfRoom;
    }

    public void setNoOfRoom(Integer noOfRoom) {
        this.noOfRoom = noOfRoom;
    }
      
}
