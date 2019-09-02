package com.educacionit.hibernate.beginners.entity;

import javax.persistence.*;

    @Entity(name="Teacher2")
    @Table(name = "teacher")
    @AttributeOverrides ({
            @AttributeOverride (name = "firstName", column = @Column (name="per_first_name")),
            @AttributeOverride (name = "lastName",  column = @Column (name="per_last_name"))
    })
    public class Teacher2Annotation extends Person2Annotation{

        @Column (name="school")
        private String school;

        @Column (name="subject")
        private String subject;

        public Teacher2Annotation () {

            super ();
        }

        public Teacher2Annotation (String firstName, String lastName, String school,
                                  String subject) {

            super (firstName, lastName);

            this.school = school;
            this.subject = subject;
        }


        public String school () {

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


