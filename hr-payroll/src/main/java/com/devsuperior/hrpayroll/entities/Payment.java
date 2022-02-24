package com.devsuperior.hrpayroll.entities;

public class Payment {

    private String nome;

    private Double dailyIncome;

    private Integer days;

    public Payment(String nome, Double dailyIncome, Integer days) {
        this.nome = nome;
        this.dailyIncome = dailyIncome;
        this.days = days;
    }

    public Payment() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getDailyIncome() {
        return dailyIncome;
    }

    public void setDailyIncome(Double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }


    public double getTotal(){
        return days * dailyIncome;
    }
}
