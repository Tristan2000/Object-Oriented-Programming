/*
Tristan Jones
*/
import java.util.Scanner;
import java.sql.*;
import java.util.Date;

public class Savings extends TestAccount
	{
	public static void main(String[] args) {
		TestSavings account1 = new TestSavings(1122, 20000);
			account1.withdraw(2500);
			account1.deposit(3000);
			account1.setAnnualInterestRate(4.5);
			System.out.println("The account balance is: " + account1.getBalance());
			System.out.println("The monthly interest is: " + account1.getMonthlyInterest());
			System.out.println("The date the account was created is: " + account1.getDateCreated().toString());
			System.out.println(account1.toString());
	}
}

class TestSavings extends TestAccount
	{

	
	TestSavings(){

	}
	TestSavings(int id, double balance){
		super();
		setId(id);
		setBalance(balance);
		getDateCreated();
		getMonthlyInterest();
		getMonthlyInterestRate();
		setAnnualInterestRate(annualInterestRate);
	}
	public String toString(){
			return "Account: balance = " + balance + " Id = " + id + " Annual interest rate = " + annualInterestRate;
		}
}