/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.model.db.relassociation.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
public class Programmer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pgrmid;
	private String name;
	private int salary;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "programmer_project", joinColumns = @JoinColumn(referencedColumnName = "pgrmid"), 
				inverseJoinColumns = @JoinColumn(referencedColumnName = "pjid"))
	private List<Project> projects;

	/**
	 * @param name
	 * @param salary
	 * @param projects
	 */
	@Builder
	public Programmer(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public void addProject(Project project) {
		if (project != null) {
			if (projects == null) {
				projects = new ArrayList<Project>();
			}
			projects.add(project);
		}
	}

}
