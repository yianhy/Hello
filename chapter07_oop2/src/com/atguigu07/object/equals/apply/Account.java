package com.atguigu07.object.equals.apply;

/**
 * @author shkstart
 * @create 9:44
 */
public class Account {
    double balance;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Double.compare(account.balance, balance) == 0;
    }

}
