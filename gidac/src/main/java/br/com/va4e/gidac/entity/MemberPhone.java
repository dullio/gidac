package br.com.va4e.gidac.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"ddd", "phone", "extension", "type", "member_id"}), name = "member_phone")
public class MemberPhone implements Serializable {
	
	public MemberPhone(String ddd, String phone, String extension, String note, int type) {

		this.ddd = ddd;
		this.phone = phone;
		this.extension = extension;
		this.note = note;
		this.type = type;

	}
	
	@Version
    private Integer version;
	
	public MemberPhone() {

	}

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String ddd;

	private String phone;

	private String extension;

	private String note;

	private int type;

	@Override
	public String toString() {
		return "MemberPhone [id=" + id + ", ddd=" + ddd + ", phone=" + phone + ", extension=" + extension + ", note="
				+ note + ", type=" + type + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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