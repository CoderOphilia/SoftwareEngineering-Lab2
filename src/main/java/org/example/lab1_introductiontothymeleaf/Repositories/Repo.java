package org.example.lab1_introductiontothymeleaf.Repositories;

import org.example.lab1_introductiontothymeleaf.Entities.Customer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Repo {

    List<Customer> list1 = new ArrayList<Customer>();

    public ArrayList<Customer> initialdata() {
        Customer cc, dd;

        cc = new Customer();
        cc.setCname("Joe");
        cc.setCemail("xxx@yahoo.com");

        list1.add(cc);

        return (ArrayList<Customer>) list1;
    }
}
