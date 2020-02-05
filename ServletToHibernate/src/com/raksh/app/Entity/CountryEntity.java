package com.raksh.app.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@Entity
@Table(name = "country_details")
public class CountryEntity implements Serializable{
	@Id
	@Column(name = "c_name")
	private String CountryName;
	@Column(name = "c_continent")
	private String CountryContinent;
	@Column(name = "c_president")
	private String President;
	@Column(name = "c_nos")
	private int NoOfStates;
	
	public CountryEntity() {
		System.out.println("entity created");
	}

}
