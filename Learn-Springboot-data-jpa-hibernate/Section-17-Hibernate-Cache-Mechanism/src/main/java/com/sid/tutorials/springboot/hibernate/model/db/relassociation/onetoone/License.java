/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.model.db.relassociation.onetoone;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Lenovo
 *
 */
@Data
@NoArgsConstructor
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class License implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String type;
	@Temporal(TemporalType.DATE)
	private Date validFrom;
	@Temporal(TemporalType.DATE)
	private Date validTo;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "driverId")
	private Driver driver;

	/**
	 * @param type
	 * @param validFrom
	 * @param validTo
	 * @param driver
	 */
	@Builder
	public License(String type, Date validFrom, Date validTo) {
		super();
		this.type = type;
		this.validFrom = validFrom;
		this.validTo = validTo;
	}

}
