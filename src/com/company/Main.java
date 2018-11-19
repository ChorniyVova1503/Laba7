package com.company;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Drug drug= new Drug();
        drug.setManufacturingCompany("Company");
        drug.setNameOfTheDrug("paracetamol");


        System.out.println(drug.getManufacturingCompany());
        System.out.println(drug.getNameOfTheDrug());

        System.out.println("--------------------------");
        drug.setShelfLife("12.11.2018");
        System.out.println(drug.getShelfLife());


    }
}
