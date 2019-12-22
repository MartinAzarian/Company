package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Company company1 = new Company("Synergy", " sdjasdkjabsk ", 5210, " www.google.com", "asdas");

        HashMap<String, Company> company = new HashMap<>();
        company.put("Synergy", company1);
    }
}
