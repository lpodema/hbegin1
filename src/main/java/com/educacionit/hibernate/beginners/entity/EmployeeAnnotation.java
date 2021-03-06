
package com.educacionit.hibernate.beginners.entity;


import java.util.Date;

import javax.persistence.*;


@Entity (name =  "Employee")
@Table (name = "employee")
public class EmployeeAnnotation {


	@Id
	@GeneratedValue (strategy=GenerationType.AUTO, generator = "employee_seq")
	@SequenceGenerator (name="employee_seq", sequenceName = "employee_seq")
	@Column (name="emp_id", nullable=false, unique=true)
	private int id;

	/* PARA MYSQL
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column (name="emp_id", nullable=false, unique=true)
	private int id;
	 */

	/*
	PARA POSTGRES
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO, generator = "employee_seq")
	@SequenceGenerator (name="employee_seq", sequenceName = "employee_seq")
	@Column (name="emp_id", nullable=false, unique=true)
	private int id;
	 */
	
	@Column(name="emp_name", length=28, nullable=false)
	private String name;
	
	@Column(name="emp_role", length=28, nullable=false)
	private String role;
	
	@Column(name="sys_creation", nullable=false)
	private Date insertTime;


    public EmployeeAnnotation () {

        super ();
    }

    public EmployeeAnnotation (String name, String role, Date insertTime) {

        super ();

        this.name = name;
        this.role = role;
        this.insertTime = insertTime;
    }


	public int getId () {

		return this.id;
	}

	public void setId (int id) {

		this.id = id;
	}

	public String getName () {

		return this.name;
	}

	public void setName (String name) {

	    this.name = name;
	}

	public String getRole () {

		return this.role;
	}

	public void setRole (String role) {

	    this.role = role;
	}

	public Date getInsertTime () {

		return this.insertTime;
	}

	public void setInsertTime (Date insertTime) {

		this.insertTime = insertTime;
	}
}
