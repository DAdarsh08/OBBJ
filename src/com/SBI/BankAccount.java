package com.SBI;

import com.SBI.utilities.Validations;

public class BankAccount {
    String accountno;
    Person customer;
    Currency balance;

    public BankAccount(String accountno, Person customer, Currency balance) throws InvalidAgeException, InvalidAccnoException {
        Validations.ValidAccno(accountno);
        this.accountno = accountno;
//        Validations.ValidAccno(this.accountno);
        this.customer = customer;
        this.balance = balance;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = null;
        try {
            bankAccount = new BankAccount("101", new Person(), new Currency());

            System.out.println(bankAccount);
        } catch (InvalidAgeException ex) {
            System.out.println(ex);
        } catch (InvalidAccnoException e) {
            System.out.println(e);
        }

    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountno='" + accountno + '\'' +
                ", customer=" + customer +
                ", balance=" + balance +
                '}';
    }
}
