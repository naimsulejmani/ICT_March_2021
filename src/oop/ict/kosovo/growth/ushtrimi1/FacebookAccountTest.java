package oop.ict.kosovo.growth.ushtrimi1;

import java.time.LocalDate;

public class FacebookAccountTest {
    public static void main(String[] args) {
        FacebookAccount fbBesnikMazreku = new FacebookAccount();
        FacebookAccount fbEdisonBoqaj = new FacebookAccount();
        FacebookAccount fbElfeteTotaj = new FacebookAccount();

        fbBesnikMazreku.setName("Besnik");
        fbBesnikMazreku.setSurname("Mazreku");
        fbBesnikMazreku.setGender('M');
        fbBesnikMazreku.setEmail("besnikmazreku@gmail.com");
        fbBesnikMazreku.setMobileNo("049123123");
        fbBesnikMazreku.setAccountName("besnikxmazreku");
        fbBesnikMazreku.setBirthdate(LocalDate.of(1997, 1, 1));

        fbBesnikMazreku.printAccount();
//        System.out.printf("Llogaria: %s%nEmail: %s%nEmri dhe mbiemri: %s%nGjinia: %s%nDatalindjes: %s",
//                fbBesnikMazreku.getAccountName(),
//                fbBesnikMazreku.getEmail(),
//                fbBesnikMazreku.getName()+" "+fbBesnikMazreku.getSurname(),
//                fbBesnikMazreku.getGender(),
//                fbBesnikMazreku.getBirthdate()
//                );

        fbEdisonBoqaj.setName("Edison@");

        fbEdisonBoqaj.printAccount();

        fbElfeteTotaj.setName("Elfete");

        fbElfeteTotaj.printAccount();
    }
}
