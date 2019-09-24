package com.cicd.service;

import com.cicd.DAO.CicdDao;
import com.cicd.DAO.CicdDaoInterface;
import com.cicd.entity.CicdEmployee;

public class Cicdservice implements CicdServiceInterface {

	public static CicdServiceInterface createServiceObject() {
		// TODO Auto-generated method stub
		return new Cicdservice();
	}

	@Override
	public int createProfile(CicdEmployee ce) {
		// TODO Auto-generated method stub
		CicdDaoInterface ad=CicdDao.createDaoObject();
		return ad.createProfileDao(ce) ;
	
	}

}
