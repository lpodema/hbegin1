package com.educacionit.hibernate.beginners.entity;


import javax.persistence.*;
import java.util.Date;


@Entity (name = "Teacher3")
@Table (name="teacher3")
@PrimaryKeyJoinColumn (name="per_person_id")
public class Teacher3Annotation extends Person3Annotation {


    @Column (name="school")
    private String school;

    @Column (name="subject")
    private String subject;


    public Teacher3Annotation () {

        super ();
    }

    public Teacher3Annotation (String firstName, String lastName, String school,
                               String subject) {

        super (firstName, lastName);

        this.school = school;
        this.subject = subject;
    }


    public String getSchool () {

        return this.school;
    }

    public void setSchool (String school) {

        this.school = school;
    }

    public String getSubject () {

        return this.subject;
    }

    public void setSubject (String subject) {

        this.subject = subject;
    }
}