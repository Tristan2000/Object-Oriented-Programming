/*
Author: Tristan Jones
Date: 4/29/2021
*/
import java.util.Scanner;
import java.sql.*;
import java.util.Date;

public class Account {
	public static void main(String[] args) {
		TestAccount[] account = new TestAccount[10];
		for(int i = 0; i < account.length; i++){
			account[i] = new TestAccount(i + 1, 100);
		}
		Scanner input = new Scanner(System.in);
		double withdraw;
		double deposit;
		
		int options = 1;
		
		System.out.print("Enter an id: ");
		int userId = input.nextInt() - 1;
		while(userId > 11 && userId < 1){
			System.out.print("Invalid id. Enter an id: ");
			userId = input.nextInt();
		}
		while(true){
			System.out.println("Main Menu");
			System.out.println("1: Check Balance");
			System.out.println("2: Withdraw");
			System.out.println("3: Deposit");
			System.out.println("4: Exit");
			System.out.println("Enter a choice: ");
			options = input.nextInt();
			if(options == 1){
				System.out.println("The account balance is: " + account[userId].getBalance());
				continue;
			}
			if(options == 2){
				System.out.println("Enter an amount to withdraw: ");
				withdraw = input.nextDouble();
				account[userId].withdraw(withdraw);
				continue;
			}
			if(options == 3){
				System.out.println("Enter an amount to deposit: ");
				deposit = input.nextDouble();
				account[userId].deposit(deposit);
				continue;
			}
			if (options == 4) {
				System.out.print("Enter an id: ");
				userId = input.nextInt() - 1;
				while(userId > 10 && userId < 0){
					System.out.println("Invalid id. Enter an id: ");
					userId = input.nextInt();
					}
				continue;
			}
		}
		
//		account1.withdraw(2500);
//		account1.deposit(3000);
//		account1.setAnnualInterestRate(4.5);
//		System.out.println("The account balance is: " + account1.getBalance());
//		System.out.println("The monthly interest is: " + account1.getMonthlyInterest());
//		System.out.println("The date the account was created is: " + account1.getDateCreated().toString());
	}
}
class TestAccount{
	private int id;
	private double balance;
	private double annualInterestRate;
	Date date;
	
	TestAccount(){
		id = 1;
		balance = 100;
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
}