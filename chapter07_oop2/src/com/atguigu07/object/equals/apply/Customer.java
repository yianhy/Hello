package com.atguigu07.object.equals.apply;

import java.util.Objects;

/**
 * @author shkstart
 * @create 9:44
 */
public class Customer {
    int age;
    Account account;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age && Objects.equals(account, customer.account);
    }


}
