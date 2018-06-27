package br.com.va4e.gidac.entity;

import java.io.Serializable;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = { "firstName", "lastName" }), name = "member")
public class Member implements Serializable {

	public Member(String firstName, String lastName, String userName, String cpf, String rg, String gender, String note,
			boolean active, Date birthday) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.cpf = cpf;
		this.rg = rg;
		this.gender = gender;
		this.note = note;
		this.active = active;
		this.birthday = birthday;
	}

	public Member() {

	}

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Size(min = 2, max = 25)
	@Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
	private String firstName;

	@NotNull
	@Size(min = 2, max = 25)
	@Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
	private String lastName;

	@Column(unique = true)
	@Pattern(regexp = "[A-Za-z]*", message = "must contain only letters")
	private String userName;

	private String cpf;

	private String rg;

	private String gender;

	private String note;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "member_id")
	private Set<MemberAddress> addresses = new HashSet<MemberAddress>();

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "member_id")
	private Set<MemberEmail> emails = new HashSet<MemberEmail>();

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "member_id")
	//@RestResource(path = "MemberPhonerepositorys", rel="phones")
	private Set<MemberPhone> phones = new HashSet<MemberPhone>();

	public void addAddress(MemberAddress address) {

		if (address != null) {
			this.addresses.add(address);
		}

	}

	public Set<MemberAddress> getAddresses() {
		return Collections.unmodifiableSet(addresses);
	}

	public void addEmail(MemberEmail email) {

		if (email != null) {
			this.emails.add(email);
		}

	}

	public Set<MemberEmail> getEmails() {
		return Collections.unmodifiableSet(emails);
	}

	public void addPhone(MemberPhone phone) {

		if (phone != null) {
			this.phones.add(phone);
		}

	}

	public Set<MemberPhone> getPhones() {
		return Collections.unmodifiableSet(phones);
	}

	@Version
	private Integer version;

	@NotNull
	private boolean active;

	@Temporal(TemporalType.DATE)
	private Date birthday;

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}