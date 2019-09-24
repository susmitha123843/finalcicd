package com.cicd.service2;

import com.cicd.DAO.CicdDao;
import com.cicd.DAO.CicdDaoInterface;
import com.cicd.Dao2.CicdDao2;
import com.cicd.Dao2.CicdDaoInterface2;
import com.cicd.entity2.CicdEmployee2;

public class Cicdservice2 implements CicdserviceInterface2 {

	public static Cicdservice2 createServiceObject2() {
		// TODO Auto-generated method stub
		return new Cicdservice2();
	}

	@Override
	public int createProfile2(CicdEmployee2 ce2) {
		CicdDaoInterface2 cd=CicdDao2.createDao2Object1();
		return cd.createProfileDao2(ce2) ;

	}

}
