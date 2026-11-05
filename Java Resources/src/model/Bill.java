package model;

public class Bill {
    private int id, patientId;
    private double consultationFee, roomCharge, medicineCharge, otherCharge, total;
    private String billDate, paymentStatus;

    public Bill() {}

    public int getId(){return id;} public void setId(int v){id=v;}
    public int getPatientId(){return patientId;} public void setPatientId(int v){patientId=v;}
    public double getConsultationFee(){return consultationFee;} public void setConsultationFee(double v){consultationFee=v;}
    public double getRoomCharge(){return roomCharge;} public void setRoomCharge(double v){roomCharge=v;}
    public double getMedicineCharge(){return medicineCharge;} public void setMedicineCharge(double v){medicineCharge=v;}
    public double getOtherCharge(){return otherCharge;} public void setOtherCharge(double v){otherCharge=v;}
    public double getTotal(){return total;} public void setTotal(double v){total=v;}
    public String getBillDate(){return billDate;} public void setBillDate(String v){billDate=v;}
    public String getPaymentStatus(){return paymentStatus;} public void setPaymentStatus(String v){paymentStatus=v;}
}
