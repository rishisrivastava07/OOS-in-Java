package com.rishi.ExceptionHandling;

class LowBalanceException extends Exception{
    long amount;
    LowBalanceException(long amount) {
        this.amount = amount;
    }
}

class ExcessBalanceException extends Exception{
    long amount;
    ExcessBalanceException(long amount) {
        this.amount = amount;
    }
}

class Bank{
    static long MaxAmount = 35000;
    public void withdraw(long accNo, long amount) throws LowBalanceException, ExcessBalanceException{
        long balance = getBalance(accNo);
        if(balance < amount){
            throw new LowBalanceException(amount);
        }
        if(amount > MaxAmount){
            throw new ExcessBalanceException(amount);
        }
        else System.out.println("Amount Withdrawn : Rs. " + amount);
    }

    private long getBalance(long accNo){
        return 50000;
    }
}

public class UserException {
    public static void main(String[] args) {
        Bank bank = new Bank();
        try{
            bank.withdraw(0, 5000);
        } catch(LowBalanceException le) {
            System.out.println("Low balance exception is thrown : " + le.amount);
        } catch(ExcessBalanceException eb) {
            System.out.println("Excess balance exception is thrown : " + eb.amount);
        }
    }
}
