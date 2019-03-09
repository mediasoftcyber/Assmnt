package com.aits.apps.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COUNTRIES_MASTER")
public class CountryModel {

	@Id
	@GeneratedValue
	@Column(name = "COUNTRY_ID")
	private Integer countryId;
	@Column(name = "COUNTRY_NAME")
	private String countryName;
	@Column(name = "COUNTRY_CODE")
	private String countryCode;

	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

}
