package com.educacionit.hibernate.beginners.entity;


import java.util.Date;

import javax.persistence.*;


@Entity(name="Teacher")
@Table(name = "entity")
@DiscriminatorValue("T")
public class TeacherAnnotation extends PersonAnnotation{

    @Column (name="ENT_JOINING_DATE")
    private Date joiningDate;

    @Column (name="ENT_DEPARTMENT_NAME")
    private String departmentName;


    public TeacherAnnotation () {

        super ();
    }

    public TeacherAnnotation (String firstname, String lastname, Date joiningDate,
                              String departmentName) {

        super (firstname, lastname);

        this.joiningDate    = joiningDate;
        this.departmentName = departmentName;
    }

}
