/*
Author: Tristan Jones
Date: 4/29/2021
*/
import java.util.Scanner;
import java.sql.*;
import java.util.Date;

public class Account {
	public static void main(String[] args) {
		TestAccount account1 = new TestAccount(1122, 20000);
		account1.withdraw(2500);
		account1.deposit(3000);
		account1.setAnnualInterestRate(4.5);
		System.out.println("The account balance is: " + account1.getBalance());
		System.out.println("The monthly interest is: " + account1.getMonthlyInterest());
		System.out.println("The date the account was created is: " + account1.getDateCreated().toString());
		System.out.println(account1.toString());
	}
}
class TestAccount{
	protected int id;
	protected double balance;
	protected double annualInterestRate;
	private Date date;
	
	TestAccount(){
		id = 1122;
		balance = 20000;
		annualInterestRate = 4.5 / 100;
		date = new Date();
	}
	TestAccount(int id, double balance){
		this.id = id;
		this.balance = balance;
		date = new Date();
	}
	public int getId(){
		return id;
	}
	public double getBalance(){
		return balance;
	}
	public void setId(int id){
		this.id = id;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}
	public double getMonthlyInterestRate(){
		double monthlyir = annualInterestRate / 12.0 / 100;
		return monthlyir;
	}
	public double getMonthlyInterest(){
		
		double monthlyi = balance * getMonthlyInterestRate();
		return monthlyi;
	}
	public Date getDateCreated(){
		return date;
	}
	public void withdraw(double amount){
		balance = balance - amount;
		
	}
	public void deposit(double amount){
		balance = balance + amount;
	
	}
	public String toString(){
		return "Account: balance = " + balance + " Id = " + id + " Annual interest rate = " + annualInterestRate;
	}
}
