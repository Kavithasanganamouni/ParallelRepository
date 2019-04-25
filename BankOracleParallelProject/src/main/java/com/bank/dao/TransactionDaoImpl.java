package com.bank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TransactionDaoImpl implements TransactionDao {


	
		Scanner sc = new Scanner(System.in);

	//withdraw
		public int withdraw(long accountNo, int amount,int amt) {
			int i = 0;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "kavitha1", "root");

//				System.out.println("enter amount to be withdraw");
//				int amt = sc.nextInt();
				if (amt > amount) {
					System.out.println("insufficient balance plz deposit");
				} else {
					PreparedStatement ps = con.prepareStatement("update customer_info1 set balance=? where accountNo=?");
					ps.setInt(1, (amount - amt));
					ps.setLong(2, accountNo);
					i = ps.executeUpdate();

				}

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (i == 1)
				return i;
			else
				return 0;

		}

	//deposit
		public int deposit(long accountNo, int amount,int amt) {
			int i = 0;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "kavitha1", "root");

				PreparedStatement ps1 = con.prepareStatement("update customer_info1 set balance=? where accountNo=?");
				ps1.setInt(1, (amount + amt));
				ps1.setLong(2, accountNo);
				i = ps1.executeUpdate();

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (i == 1)
				return i;
			else
				return 0;

		}

	//fundTransfer
		public int fundTransfer(long fromAccountNo,int amount,long toAccountNo,int amt)
		{	int i=0;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","kavitha1","root");			
					if(amt>amount)
					{
						System.out.println("insufficient balance in your account to transfer");
					}else
					{
						PreparedStatement ps1 = con.prepareStatement("update customer_info1 set balance=? where accountNo=?");
						ps1.setInt(1,(amount-amt) );
						ps1.setLong(2,fromAccountNo);
						ps1.executeUpdate();
						
						
						PreparedStatement ps2=con.prepareStatement("select * from customer_info1 where accountNo=? ");
						ps2.setLong(1,toAccountNo);
						ResultSet rs2 = ps2.executeQuery();	
						while(rs2.next())
						{
						int toAmount=rs2.getInt(10);
						PreparedStatement ps3 = con.prepareStatement("update customer_info1 set balance=? where accountNo=?");
						ps3.setInt(1,(toAmount+amt) );
						ps3.setLong(2,toAccountNo);
						ps3.executeUpdate();
						}
						
						//inserting into transation_details table
						PreparedStatement ps4 = con.prepareStatement("insert into transaction_details values(account_seq.nextval,?,?,?)");
						ps4.setLong(1, fromAccountNo);
						ps4.setLong(2, toAccountNo);
						ps4.setLong(3, amt);
						i=ps4.executeUpdate();
						}
				
			
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (i == 1)
				return i;
			else
				return 0;
		}
		
		
	}



