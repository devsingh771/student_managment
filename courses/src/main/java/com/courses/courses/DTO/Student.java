package com.courses.courses.DTO;

public class Student {
    private String date;
    private String chequeNo;
    private String name;
    private double amount;
    private String category;
    private double balance;


    public Student(){}

    public Student(String date, String chequeNo, String name, double amount, String category, double balance) {
        this.date = date;
        this.chequeNo = chequeNo;
        this.name = name;
        this.amount = amount;
        this.category = category;
        this.balance = balance;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getChequeNo() {
        return chequeNo;
    }

    public void setChequeNo(String chequeNo) {
        this.chequeNo = chequeNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String description) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Student{" +
                "date=" + date +
                ", chequeNo='" + chequeNo + '\'' +
                ", description='" + name + '\'' +
                ", amount=" + amount +
                ", category='" + category + '\'' +
                ", balance=" + balance +
                '}';
    }
}

