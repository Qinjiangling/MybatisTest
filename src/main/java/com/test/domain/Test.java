package com.test.domain;

import java.io.Serializable;

public class Test  implements Serializable{
	private static final long serialVersionUID = 1L;
	private String zl;
	private String kfs;
	private String yjje;
	private String pch;
	private String id;
	private String pkid;
	public String getZl() {
		return zl;
	}
	public void setZl(String zl) {
		this.zl = zl;
	}
	public String getKfs() {
		return kfs;
	}
	public void setKfs(String kfs) {
		this.kfs = kfs;
	}
	public String getYjje() {
		return yjje;
	}
	public void setYjje(String yjje) {
		this.yjje = yjje;
	}
	public String getPch() {
		return pch;
	}
	public void setPch(String pch) {
		this.pch = pch;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPkid() {
		return pkid;
	}
	public void setPkid(String pkid) {
		this.pkid = pkid;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
