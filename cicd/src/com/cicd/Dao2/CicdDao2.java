package com.cicd.Dao2;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.cicd.DAO.CicdDao;
import com.cicd.entity2.CicdEmployee2;

public class CicdDao2  implements CicdDaoInterface2{


	public static CicdDaoInterface2 createDao2Object1() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createProfileDao2(CicdEmployee2 ce2) {
		int i2=0;
		try{
			
			InitialContext ctx=new InitialContext();
			DataSource ds;
			ds=(DataSource)ctx.lookup("java:/Zensar");
			
			
			
			
			Connection con=ds.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into facebookemployee values(?,?,?,?)");
			ps.setString(1, ce2.getName());
			ps.setString(2, ce2.getPass());
			i2=ps.executeUpdate();
			System.out.println(i2);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return i2 ;
	}
	}

