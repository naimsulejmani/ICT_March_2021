package basic.workshop.one;

public class MenaxhimiTekstit {
    public static void main(String[] args) {
        String teksti = "AAA BBB CCC DDD EEE FFFF";

        String[] fjalet = teksti.split(" ");
        System.out.printf("Total fjale: %d%n", teksti.split(" ").length);

        System.out.println(teksti.replace("mire", "keqe"));

        String newCipherText = "";

        for (int i = 0; i < teksti.length(); i++) {
            char ch = teksti.charAt(i);
            ch++;
            ch++;
            newCipherText += ch;
        }
        System.out.println(newCipherText);
    }
}
