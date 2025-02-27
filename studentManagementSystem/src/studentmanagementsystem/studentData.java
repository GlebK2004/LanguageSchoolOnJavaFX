/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

import java.sql.Date;


public class studentData {

    private Integer studentNum;
    private String year;
    private String course;
    private String firstName;
    private String lastName;
    private String gender;
    private Date birth;
    private String status;
    private String image;
    private Double firstSem;
    private Double secondSem;
    private Double finals;

    // MAKE SURE THAT SAME DATATYPE THAT YOU WILL PUT THERE 
    public studentData(Integer studentNum, String year, String course, String firstName, String lastName, String gender, Date birth, String status, String image) {
        this.studentNum = studentNum;
        this.year = year;
        this.course = course;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birth = birth;
        this.status = status;
        this.image = image;
    }

    public studentData(Integer studentNum, String year, String course, Double firstSem, Double secondSem, Double finals) {
        this.studentNum = studentNum;
        this.year = year;
        this.course = course;
        this.firstSem = firstSem;
        this.secondSem = secondSem;
        this.finals = finals;
    }

    public Integer getStudentNum() {
        return studentNum;
    }

    public String getYear() {
        return year;
    }

    public String getCourse() {
        return course;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public Date getBirth() {
        return birth;
    }

    public String getStatus() {
        return status;
    }

    public String getImage() {
        return image;
    }

    public Double getFirstSem() {
        return firstSem;
    }

    public Double getSecondSem() {
        return secondSem;
    }

    public Double getFinals() {
        return finals;
    }

    public String ectsFirst()
    {
        if (firstSem==10.0) return "A+";
        if (firstSem==9.0) return "A";
        if (firstSem==8.0) return "A-";
        if (firstSem==7.0) return "B+";
        if (firstSem==6.0) return "B-";
        if (firstSem==5.0) return "C+";
        if (firstSem==4.0) return "C-";
        else return "F";
    }

    public String ectsSecond()
    {
        if (secondSem==10.0) return "A+";
        if (secondSem==9.0) return "A";
        if (secondSem==8.0) return "A-";
        if (secondSem==7.0) return "B+";
        if (secondSem==6.0) return "B-";
        if (secondSem==5.0) return "C+";
        if (secondSem==4.0) return "C-";
        else return "F";
    }

    // PLEASE FOLLOW ME IF THE VARS ARE THE SAME TO ME 
}
