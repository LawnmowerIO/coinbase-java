package com.coinbase.api.entity;

import java.util.List;

import org.joda.money.Money;

import com.coinbase.api.entity.UserNode;

public class Response {
    
    private String _success;
    private Transaction _transaction;
    private List<UserNode> _users;
    private List<TransactionNode> _transactions;
    private User _currentUser;
    private Money _balance;
    private Money _nativeBalance;
    private int _totalCount;
    private int _numPages;
    private int _currentPage;
    private List<TransferNode> _transfers;
    private List<AddressNode> _addresses;

    public List<TransferNode> getTransfers() {
        return _transfers;
    }

    public void setTransfers(List<TransferNode> transfers) {
        _transfers = transfers;
    }

    public List<TransactionNode> getTransactions() {
        return _transactions;
    }

    public void setTransactions(List<TransactionNode> transactions) {
        _transactions = transactions;
    }

    public User getCurrentUser() {
        return _currentUser;
    }

    public void setCurrentUser(User currentUser) {
        _currentUser = currentUser;
    }

    public Money getBalance() {
        return _balance;
    }

    public void setBalance(Money balance) {
        _balance = balance;
    }

    public Money getNativeBalance() {
        return _nativeBalance;
    }

    public void setNativeBalance(Money nativeBalance) {
        _nativeBalance = nativeBalance;
    }

    public int getTotalCount() {
        return _totalCount;
    }

    public void setTotalCount(int totalCount) {
        _totalCount = totalCount;
    }

    public int getNumPages() {
        return _numPages;
    }

    public void setNumPages(int numPages) {
        _numPages = numPages;
    }

    public int getCurrentPage() {
        return _currentPage;
    }

    public void setCurrentPage(int currentPage) {
        _currentPage = currentPage;
    }

    public List<UserNode> getUsers() {
        return _users;
    }

    public void setUsers(List<UserNode> users) {
        _users = users;
    }

    public String getSuccess() {
        return _success;
    }

    public void setSuccess(String success) {
        this._success = success;
    }

    public Transaction getTransaction() {
        return _transaction;
    }

    public void setTransaction(Transaction transaction) {
        _transaction = transaction;
    }

    public List<AddressNode> getAddresses() {
	return _addresses;
    }

    public void setAddresses(List<AddressNode> addresses) {
	_addresses = addresses;
    }

}
