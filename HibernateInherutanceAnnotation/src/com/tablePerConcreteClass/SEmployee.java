package com.tablePerConcreteClass;

import javax.persistence.AssociationOverride;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="HibernateConcreteSEmployee")
@AttributeOverrides({
	@AttributeOverride(name="empid",column=@Column(name="ID")),
	@AttributeOverride(name="name",column=@Column(name="ENAME")),
	
})
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
