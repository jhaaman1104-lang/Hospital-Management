package model;

public class Patient {
    private int id;
    private String name, gender, dob, phone, address, disease;

    public Patient() {}

    public Patient(int id, String name, String gender, String dob, String phone, String address, String disease) {
        this.id=id; this.name=name; this.gender=gender; this.dob=dob;
        this.phone=phone; this.address=address; this.disease=disease;
    }

    public int getId(){return id;} public void setId(int id){this.id=id;}
    public String getName(){return name;} public void setName(String v){name=v;}
    public String getGender(){return gender;} public void setGender(String v){gender=v;}
    public String getDob(){return dob;} public void setDob(String v){dob=v;}
    public String getPhone(){return phone;} public void setPhone(String v){phone=v;}
    public String getAddress(){return address;} public void setAddress(String v){address=v;}
    public String getDisease(){return disease;} public void setDisease(String v){disease=v;}
}
