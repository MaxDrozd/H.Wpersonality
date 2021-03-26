package com.company;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2021, 02, 24) ;
        PersonalInfo Max = new PersonalInfo();
        Max.setFirstName("Max");
        Max.setMidName("Sergiyovuch");
        Max.setLastName("Drozd");
        Max.setNativeCity("Storozhynets");
        Max.setAddress("Vydynivskogo street");
        Max.setDateOfBirth(LocalDate.of(1999 ,05 ,26 ));
        Max.setFaculty("Foreign Language");
        Max.setSpeciality("Secondary Education");
        System.out.println(Max);


    }
}
