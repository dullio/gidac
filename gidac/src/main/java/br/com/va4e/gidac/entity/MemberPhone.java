package br.com.va4e.gidac.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"ddd", "phone", "extension", "type", "member_id"}), name = "member_phone")
public class MemberPhone extends AbstractEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String ddd;

	private String phone;

	private String extension;

	private String note;

	private int type;	
	
	public MemberPhone(String ddd, String phone, String extension, String note, int type) {

		this.ddd = ddd;
		this.phone = phone;
		this.extension = extension;
		this.note = note;
		this.type = type;

	}
	
	public MemberPhone() {

	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}