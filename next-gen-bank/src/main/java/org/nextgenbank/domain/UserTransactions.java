package org.nextgenbank.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the user_transactions database table.
 * 
 */
@Entity
@Table(name="user_transactions")
@NamedQuery(name="UserTransactions.findAll", query="SELECT u FROM UserTransactions u")
public class UserTransactions implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="ACCOUNT_NUMBER")
	private String accountNumber;

	@Column(name="IS_DEBIT")
	private String isDebit;

	@Column(name="TRANSACTION_SHORT_FORM")
	private String transactionShortForm;

	@Column(name="TRANSACTION_AMOUNT")
	private int transactionAmount;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TRANSACTION_DATE")
	private Date transactionDate;

	@Column(name="TRANSACTION_DETAIL")
	private String transactionDetail;

	@Column(name="TRANSACTION_TYPE")
	private String transactionType;

	public UserTransactions() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getIsDebit() {
		return this.isDebit;
	}

	public void setIsDebit(String isDebit) {
		this.isDebit = isDebit;
	}

	public String getTransactionShortForm() {
		return this.transactionShortForm;
	}

	public void setTransactionShortForm(String transactionShortForm) {
		this.transactionShortForm = transactionShortForm;
	}

	public int getTransactionAmount() {
		return this.transactionAmount;
	}

	public void setTransactionAmount(int transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public Date getTransactionDate() {
		return this.transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionDetail() {
		return this.transactionDetail;
	}

	public void setTransactionDetail(String transactionDetail) {
		this.transactionDetail = transactionDetail;
	}

	public String getTransactionType() {
		return this.transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

}