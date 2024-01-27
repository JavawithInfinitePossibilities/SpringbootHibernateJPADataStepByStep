/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sid.tutorials.springboot.hibernate.model.db.ClinicalData;
import com.sid.tutorials.springboot.hibernate.repositories.ClinicalDataRepo;
import com.sid.tutorials.springboot.hibernate.services.IClinicalDataServices;

/**
 * @author Lenovo
 *
 */
@Service
public class ClinicalDataServiceImpl implements IClinicalDataServices {

	@Autowired
	private ClinicalDataRepo clinicalDataRepo;

	@Override
	public ClinicalData save(ClinicalData clinicalData) {
		return null;
	}

	@Override
	public ClinicalData get(int ClinicalDataId) {
		return null;
	}

	@Override
	public ClinicalData update(ClinicalData clinicalData) {
		return null;
	}

}
