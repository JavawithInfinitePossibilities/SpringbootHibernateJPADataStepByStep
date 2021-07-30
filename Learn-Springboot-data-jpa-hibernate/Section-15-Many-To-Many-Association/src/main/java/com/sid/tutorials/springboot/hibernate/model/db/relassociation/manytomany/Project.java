/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.model.db.relassociation.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

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
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pjid;
	private String name;

	@ManyToMany(mappedBy = "projects", fetch = FetchType.LAZY)
	private List<Programmer> programmers;

	/**
	 * @param name
	 * @param programmers
	 */
	@Builder
	public Project(String name) {
		super();
		this.name = name;
	}

	public void addProgrammer(Programmer programmer) {
		if (programmer != null) {
			if (programmers == null) {
				programmers = new ArrayList<Programmer>();
			}
			programmers.add(programmer);
		}
	}

}
