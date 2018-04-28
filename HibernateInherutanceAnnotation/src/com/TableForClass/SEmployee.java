package com.TableForClass;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="HibernateSEmployee")
@PrimaryKeyJoinColumn(name="ID")
public class SEmployee extends Employee {
	@Column(name="salary")
	double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
