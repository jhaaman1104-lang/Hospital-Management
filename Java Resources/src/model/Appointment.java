package model;

public class Appointment {
    private int id, patientId, doctorId;
    private String appointmentDate, appointmentTime, reason, status;

    public Appointment() {}

    public int getId(){return id;} public void setId(int v){id=v;}
    public int getPatientId(){return patientId;} public void setPatientId(int v){patientId=v;}
    public int getDoctorId(){return doctorId;} public void setDoctorId(int v){doctorId=v;}
    public String getAppointmentDate(){return appointmentDate;} public void setAppointmentDate(String v){appointmentDate=v;}
    public String getAppointmentTime(){return appointmentTime;} public void setAppointmentTime(String v){appointmentTime=v;}
    public String getReason(){return reason;} public void setReason(String v){reason=v;}
    public String getStatus(){return status;} public void setStatus(String v){status=v;}
}
