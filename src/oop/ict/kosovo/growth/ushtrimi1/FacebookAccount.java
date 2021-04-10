package oop.ict.kosovo.growth.ushtrimi1;


import java.time.LocalDate;

public class FacebookAccount {

    //emri i variablave ne Java - me shkronja te vogla
    //Identifiers -> Identifikatoret e qasjes
    //duhet me fillu me shkronje, _ ose $, mundet me permbajt edhe numra
    // nuk guxon me pas karaktere speciale,;.!'
    //class - PascalCase (CamelCase) -> Shkronja e madhe dhe cdo fjale tjete re madhe Person
    //metodat dhe variablat -> camelCase -> shkronja e pare e vogel dhe tjerat te madha gjejNumrin,
    // constanat - UPPERCASE -> me capslock -> te gjithe te madhe, fjalet ndahet me underline CONST_PI

    private String accountName;
    private String name;
    private String surname;
    private String email;
    private String mobileNo;
    private LocalDate birthdate;
    private char gender;


    //getters & setters
    //metoda get -> eshte metode me tip kthyes varesisht nga variabla
    //metoda set -> pranon nje parameter me datatyp varesisht nga variabla

    //get dhe set po na mundesojkan encapsulimin e variablave instance
    public String getName() {
        return name;
    }

    //kontrollo per domainin e vlerave (kufijt e velrave)
    public void setName(String name) {

        if (name.isEmpty() || name.isBlank()) {
            System.out.println("Nuk mundesh me lane keso lloj emri");
            return;
        }
        if (name.contains("@")) {
            System.out.println("Shkronja @ eshte e ndaluar te perdoret ne emer");
            return;
        }
        //regex -> me eliminu vlera qe nuk lejohet

        //ne rastin kur emri i parameterit (variables se metodes) eshte i ngjajshem me emrin
        //e variables instance
        this.name = name;
        //name = _name;
    }

    //Right Click mous -> Generate apo ALT + Insert -> Getters & Setters -> zgjidhni variablat instance
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void printAccount() {
        System.out.printf("Llogaria: %s%nEmail: %s%nEmri dhe mbiemri: %s%nGjinia: %s%nDatalindjes: %s%n",
                accountName, email, name + " " + surname, gender, birthdate);
    }
}
