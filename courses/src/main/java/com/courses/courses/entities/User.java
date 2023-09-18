package com.courses.courses.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;
        private String firstName;
        private String lastName;
        private int phoneNumber;
        private String emailadress;


        public User(long id, String firstName, String lastName, int phoneNumber, String emailadress) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.phoneNumber = phoneNumber;
            this.emailadress = emailadress;
        }

        public User()
        {

        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
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

        public int getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getEmailadress() {
            return emailadress;
        }

        public void setEmailadress(String emailadress) {
            this.emailadress = emailadress;
        }

    }

