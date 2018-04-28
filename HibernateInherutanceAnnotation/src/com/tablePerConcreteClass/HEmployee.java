package com.tablePerConcreteClass;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="HibernateConcreteHEmployee")
@AttributeOverrides({
	@AttributeOverride(name="empid",column=@Column(name="ID")),
	@AttributeOverride(name="name",column=@Column(name="ENAME")),
	
})
public class HEmployee extends Employee {
	
	@Column(name="SPerHour")
	double salaryperhour;
	@Column(name="SHour")
	int hours;
	public double getSalaryperhour() {
		return salaryperhour;
	}
	public void setSalaryperhour(double salaryperhour) {
		this.salaryperhour = salaryperhour;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
}
