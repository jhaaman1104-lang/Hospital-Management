package model;

public class Doctor {
    private int id;
    private String name, specialization, department, phone, email;

    public Doctor() {}

    public Doctor(int id, String name, String specialization, String department, String phone, String email) {
        this.id=id; this.name=name; this.specialization=specialization;
        this.department=department; this.phone=phone; this.email=email;
    }

    public int getId(){return id;} public void setId(int id){this.id=id;}
    public String getName(){return name;} public void setName(String v){name=v;}
    public String getSpecialization(){return specialization;} public void setSpecialization(String v){specialization=v;}
    public String getDepartment(){return department;} public void setDepartment(String v){department=v;}
    public String getPhone(){return phone;} public void setPhone(String v){phone=v;}
    public String getEmail(){return email;} public void setEmail(String v){email=v;}
}
