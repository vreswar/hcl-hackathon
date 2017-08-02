package org.nextgenbank.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the user_details database table.
 * 
 */
@Entity
@Table(name="user_details")
@NamedQuery(name="UserDetail.findAll", query="SELECT u FROM UserDetail u")
public class UserDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Column(name="LAST_NAME")
	private String lastName;

	private String password;

	@Column(name="ROLE_ID")
	private String roleId;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_DATE")
	private Date updatedDate;

	@Column(name="USER_NAME")
	private String userName;

	//bi-directional many-to-one association to UserAccountSummary
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name ="id",referencedColumnName ="USER_ID")
	private List<UserAccountSummary> userAccountSummaries1;

	//bi-directional many-to-one association to UserAccountSummary
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name ="USER_ID",referencedColumnName ="id")
	private List<UserAccountSummary> userAccountSummaries2;

	//bi-directional many-to-one association to UserProfile
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name ="id",referencedColumnName ="USER_ID")
	private List<UserProfile> userProfiles1;

	//bi-directional many-to-one association to UserProfile
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name ="id",referencedColumnName ="USER_ID")
	private List<UserProfile> userProfiles2;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<UserAccountSummary> getUserAccountSummaries1() {
		return this.userAccountSummaries1;
	}

	public void setUserAccountSummaries1(List<UserAccountSummary> userAccountSummaries1) {
		this.userAccountSummaries1 = userAccountSummaries1;
	}

	public UserAccountSummary addUserAccountSummaries1(UserAccountSummary userAccountSummaries1) {
		getUserAccountSummaries1().add(userAccountSummaries1);
		userAccountSummaries1.setUserDetail1(this);

		return userAccountSummaries1;
	}

	public UserAccountSummary removeUserAccountSummaries1(UserAccountSummary userAccountSummaries1) {
		getUserAccountSummaries1().remove(userAccountSummaries1);
		userAccountSummaries1.setUserDetail1(null);

		return userAccountSummaries1;
	}

	public List<UserAccountSummary> getUserAccountSummaries2() {
		return this.userAccountSummaries2;
	}

	public void setUserAccountSummaries2(List<UserAccountSummary> userAccountSummaries2) {
		this.userAccountSummaries2 = userAccountSummaries2;
	}

	public UserAccountSummary addUserAccountSummaries2(UserAccountSummary userAccountSummaries2) {
		getUserAccountSummaries2().add(userAccountSummaries2);
		userAccountSummaries2.setUserDetail2(this);

		return userAccountSummaries2;
	}

	public UserAccountSummary removeUserAccountSummaries2(UserAccountSummary userAccountSummaries2) {
		getUserAccountSummaries2().remove(userAccountSummaries2);
		userAccountSummaries2.setUserDetail2(null);

		return userAccountSummaries2;
	}

	public List<UserProfile> getUserProfiles1() {
		return this.userProfiles1;
	}

	public void setUserProfiles1(List<UserProfile> userProfiles1) {
		this.userProfiles1 = userProfiles1;
	}

	public UserProfile addUserProfiles1(UserProfile userProfiles1) {
		getUserProfiles1().add(userProfiles1);
		userProfiles1.setUserDetail1(this);

		return userProfiles1;
	}

	public UserProfile removeUserProfiles1(UserProfile userProfiles1) {
		getUserProfiles1().remove(userProfiles1);
		userProfiles1.setUserDetail1(null);

		return userProfiles1;
	}

	public List<UserProfile> getUserProfiles2() {
		return this.userProfiles2;
	}

	public void setUserProfiles2(List<UserProfile> userProfiles2) {
		this.userProfiles2 = userProfiles2;
	}

	public UserProfile addUserProfiles2(UserProfile userProfiles2) {
		getUserProfiles2().add(userProfiles2);
		userProfiles2.setUserDetail2(this);

		return userProfiles2;
	}

	public UserProfile removeUserProfiles2(UserProfile userProfiles2) {
		getUserProfiles2().remove(userProfiles2);
		userProfiles2.setUserDetail2(null);

		return userProfiles2;
	}

}