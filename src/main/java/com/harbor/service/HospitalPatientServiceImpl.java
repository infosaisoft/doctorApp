package com.harbor.service;
import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Propagation;

import com.harbor.Dao.HospitalPatientDao;
import com.harbor.bo.HospitalpatientBo;
import com.harbor.dto.HosptialPatientDto;
@Service
@EnableTransactionManagement
//@Transactional(propagation=Propagation.REQUIRED,transactionManager="hbTxMgmr"
public class HospitalPatientServiceImpl implements HospitalPatientService {

	@Autowired
	HospitalPatientDao hdao;
		public String insert(HosptialPatientDto hdto) {
			int count=0;
			HospitalpatientBo bo=null;
			//convert DTO to BO
			bo=new HospitalpatientBo();
			BeanUtils.copyProperties(hdto,bo);
			//use DAO
			count=hdao.insertPatient(bo);
		   if(count==0)
			     return "Record not inserted";
		   else 
			   return "Record inserted";
		}
	}
	


