package br.com.va4e.gidac.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = { "email", "member_id" }), name = "member_email")
public class MemberEmail extends AbstractEntity implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@NotNull
	@Email
	private String email;

	@NotNull
	private int type;

	@NotNull
	private boolean isDefault;

	@NotNull
	private boolean isActive;
	
	public MemberEmail(String email, int type, boolean isDefault, boolean isActive) {

		this.email = email;
		this.type = type;
		this.isDefault = isDefault;
		this.isActive = isActive;
	}

	public MemberEmail() {

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public boolean isDefault() {
		return isDefault;
	}

	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

}