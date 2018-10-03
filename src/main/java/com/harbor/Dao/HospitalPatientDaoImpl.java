package com.harbor.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.harbor.bo.HospitalpatientBo;

@Repository
public class HospitalPatientDaoImpl implements HospitalPatientDao {

	@Autowired
	HibernateTemplate ht; 
	
	@Override
	public int insertPatient(HospitalpatientBo hpbo) {
		int idval=0;
		idval=(int) ht.save(hpbo);
		return 0;
	}

}
