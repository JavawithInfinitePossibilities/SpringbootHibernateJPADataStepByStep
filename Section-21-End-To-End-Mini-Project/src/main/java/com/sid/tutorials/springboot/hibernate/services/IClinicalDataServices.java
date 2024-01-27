/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.services;

import com.sid.tutorials.springboot.hibernate.model.db.ClinicalData;

/**
 * @author Lenovo
 *
 */
public interface IClinicalDataServices {
	public ClinicalData save(ClinicalData clinicalData);

	public ClinicalData get(int ClinicalDataId);

	public ClinicalData update(ClinicalData clinicalData);
}
