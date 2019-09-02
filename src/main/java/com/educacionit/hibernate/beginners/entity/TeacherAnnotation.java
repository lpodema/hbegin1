package com.educacionit.hibernate.beginners.entity;


import java.util.Date;

import javax.persistence.*;


@Entity(name="Teacher")
@Table(name = "entity")
@DiscriminatorValue("T")
public class TeacherAnnotation extends WorkerAnnotation{

    public TeacherAnnotation () {

        super ();
    }

    public TeacherAnnotation (String firstname, String lastname, Date joiningDate,
                              String departmentName) {

        super (firstname, lastname, joiningDate, departmentName);

    }

}
