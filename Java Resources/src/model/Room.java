package model;

public class Room {
    private int id;
    private String roomNumber, roomType, status;
    private int patientId;

    public Room() {}

    public int getId(){return id;} public void setId(int v){id=v;}
    public String getRoomNumber(){return roomNumber;} public void setRoomNumber(String v){roomNumber=v;}
    public String getRoomType(){return roomType;} public void setRoomType(String v){roomType=v;}
    public String getStatus(){return status;} public void setStatus(String v){status=v;}
    public int getPatientId(){return patientId;} public void setPatientId(int v){patientId=v;}
}
