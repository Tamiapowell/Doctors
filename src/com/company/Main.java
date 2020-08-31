package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        String patientName = "Stacey Manson";
        boolean hasInsurance = false;
        float temp = 102.2f;
        int numVisits = 5;

        System.out.println("Patient Details:");
        System.out.println("Name: "+ patientName);
        System.out.println("Patient has insurance: " + hasInsurance);
        System.out.println("Body Temprature: "+ temp );
        System.out.println("Number of visits :" + numVisits);
        double CoPay =  20.50f;
        String apptdate = "2020-09-09";
        int ContactNumber = 1232450710;
System.out.println("CoPay Dollar Amount: $" + CoPay);
System.out.println("Next Appointment Date:" + apptdate);
System.out.println("Contact Number:" + ContactNumber);

    }
}
