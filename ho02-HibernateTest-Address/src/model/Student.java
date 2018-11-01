package model;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import java.util.Date;
import javax.persistence.Embedded;
import javax.persistence.AttributeOverrides;
import javax.persistence.AttributeOverride;

@Entity
@Table (name="USTExcellentStudents")
public class Student {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	
	@Column (name="apelyido", length=50, nullable=false)
	private String lastName;

	@Column (name="panaglan", length=50, nullable=false)
	private String firstName;

	private int yearLevel;

	@Column (name="seksyon", length=10, nullable=false)
	private String section;

	@Column (name="kurso", length=100, nullable=false)
	private String course;

	@Column (name="kasarian", length=50, nullable=false)
	private boolean isMale;
	
	//@Lob
	@Transient
	private String ambition;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "number", column=@Column (name="homeNumber")),
		@AttributeOverride(name = "street", column=@Column (name="homeStreet")),
		@AttributeOverride(name = "city", column=@Column (name="homeCity")),
		@AttributeOverride(name = "zip", column=@Column (name="homeZip")),
		@AttributeOverride(name = "region", column=@Column (name="homeRegion")),
		@AttributeOverride(name = "country", column=@Column (name="homeCountry")),
	})
	private Address hAddress;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "number", column=@Column (name="schoolNumber")),
		@AttributeOverride(name = "street", column=@Column (name="schoolStreet")),
		@AttributeOverride(name = "city", column=@Column (name="schoolCity")),
		@AttributeOverride(name = "zip", column=@Column (name="schoolZip")),
		@AttributeOverride(name = "region", column=@Column (name="schoolRegion")),
		@AttributeOverride(name = "country", column=@Column (name="schoolCountry")),
	})
	private Address sAddress;
	
	@Temporal (TemporalType.TIMESTAMP)
	private Date dateEnrolled;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getYearLevel() {
		return yearLevel;
	}
	public void setYearLevel(int yearLevel) {
		this.yearLevel = yearLevel;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public boolean isMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	public String getAmbition() {
		return ambition;
	}
	public void setAmbition(String ambition) {
		this.ambition = ambition;
	}
	public Date getDateEnrolled() {
		return dateEnrolled;
	}
	public void setDateEnrolled(Date dateEnrolled) {
		this.dateEnrolled = dateEnrolled;
	}
	public Address gethAddress() {
		return hAddress;
	}
	public void sethAddress(Address hAddress) {
		this.hAddress = hAddress;
	}
	public Address getsAddress() {
		return sAddress;
	}
	public void setsAddress(Address sAddress) {
		this.sAddress = sAddress;
	}
	
	
}
