package com.infosky.yjj.dto;

public class Movies {
	
	public Movies(){}
	
	protected String nameEn;
	protected int id;
	protected String nameCn;

	/**
	 * @return the nameEn
	 */
	public String getNameEn() {
		return nameEn;
	}

	/**
	 * @param nameEn
	 *            the nameEn to set
	 */
	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nameCn
	 */
	public String getNameCn() {
		return nameCn;
	}

	/**
	 * @param nameCn
	 *            the nameCn to set
	 */
	public void setNameCn(String nameCn) {
		this.nameCn = nameCn;
	}
}
