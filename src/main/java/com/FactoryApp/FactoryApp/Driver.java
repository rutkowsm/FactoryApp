package com.FactoryApp.FactoryApp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "DRIVER")
public class Driver {


    private Long id;
    private String firstName;
    private String lastName;
    private Date dateOfDriverExam;
    private int age;
    private String addressLine1;

    public Driver() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public Driver(Long id, String firstName, String lastName, Date dateOfDriverExam, int age, String addressLine1) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfDriverExam = dateOfDriverExam;
        this.age = age;
        this.addressLine1 = addressLine1;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfDriverExam() {
        return dateOfDriverExam;
    }

    public void setDateOfDriverExam(Date dateOfDriverExam) {
        this.dateOfDriverExam = dateOfDriverExam;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }
}
