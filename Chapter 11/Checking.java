/*
Tristan Jones
*/
import java.util.Scanner;
import java.sql.*;
import java.util.Date;

public class Checking extends TestAccount
	{
	public static void main(String[] args) {
		TestCheking account1 = new TestCheking(1122, 20000);
			double checkingBalance = account1.getBalance();
			double withdraw = 20600;
			double overdraft = 500;
			System.out.println("You have an overdraft limit of " + overdraft);
			System.out.println("How much would you like to withdraw? ");
			Scanner input = new Scanner(System.in);
			withdraw = input.nextDouble();
			if (withdraw > (checkingBalance + overdraft)){
				withdraw = checkingBalance + overdraft;
			}
			account1.withdraw(withdraw);
			account1.deposit(3000);
			account1.overdraft(overdraft);
			account1.setAnnualInterestRate(4.5);
			System.out.println("The account balance is: " + account1.getBalance());
			System.out.println("The monthly interest is: " + account1.getMonthlyInterest());
			System.out.println("The date the account was created is: " + account1.getDateCreated().toString());
			System.out.println(account1.toString());
	}
}

class TestCheking extends TestAccount {
	double overdraft;
	TestCheking(){
		
	}
	
	TestCheking(int id, double balance){
		super();
		setId(id);
		setBalance(balance);
		getDateCreated();
		getMonthlyInterest();
		getMonthlyInterestRate();
		setAnnualInterestRate(annualInterestRate);
		}
		
	public double getOverDraft(){
		return overdraft;
	}
	public void overdraft(double overdraft){
		this.overdraft = overdraft;
	}
	public  String toString(){
		return "Account: balance = " + balance + " id = " + id + " Annual interst rate =  " + annualInterestRate + " Overdraft = " + overdraft; 
	}
}