package com.tablePerClass;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="HEmp")
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
