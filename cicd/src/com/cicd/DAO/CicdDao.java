package com.cicd.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.cicd.entity.CicdEmployee;

public class CicdDao implements CicdDaoInterface {

	public static CicdDaoInterface createDaoObject() {
		// TODO Auto-generated method stub
		return new CicdDao();
	}

	@Override
	public int createProfileDao(CicdEmployee ce) {

		int i=0;
		try{
			/*Properties props=new Properties();
			props.put(Context.INITIAL_CONTEXT_FACTORY,"org.jnp.interfaces.NamingContextFactory");
			props.put(Context.PROVIDER_URL,"localhost:8080");
			props.put(Context.URL_PKG_PREFIXES,"org.jboss.naming:org_jnp.interfaces");
			*/
			InitialContext ctx=new InitialContext();
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Zensar123");
			DataSource ds;
			ds=(DataSource)ctx.lookup("java:/Zensar");
			
			
			
			
			Connection con=ds.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into facebookemployee values(?,?,?,?)");
			ps.setString(1, ce.getName());
			ps.setString(2, ce.getPass());
			ps.setString(3, ce.getEmail());
			i=ps.executeUpdate();
			System.out.println(i);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return i ;
	}

}
