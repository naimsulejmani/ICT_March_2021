package oop.ict.kosovo.growth.ushtrimi4_associations;

public class TestPerson {
    public static void main(String[] args) {
        //Wrapper -> Mbeshtjellsit e tipeve primtive, kur deshirojme
        //q eketo tipe primitive qe i peroderim me u sjelle si objekte

        int nr = 10;//stack
        Integer nrW = nr;//heap -> ktu ka adrese
        nrW = nrW + 100;
        System.out.println(nrW);
        Double d = 100.4d;
        Character ch = 'A';
        Boolean b = false;

        double vlx = Double.parseDouble("200.34");

        int x = Integer.valueOf("100");
        //per arsye se eshte wrapper -> int -> Integer - e ben unwrap
        String vlera = Integer.toString(x);

        System.out.println(Integer.parseInt("300"));


        String fileContent = "Naim Sulejmani,2000,1,1,50;Anita Hajdari,2002,12,1,100;" +
                "Flamur Gashi,2001,11,30,125;";

        //edhe ne java file, readALlFile -> lexo rresht per rresht

        // \r\n
        String[] lines = fileContent.split(";");

        for (String line : lines) {
            System.out.println(line);
            String[] attribute = line.split(",");
            String fullName = attribute[0];
            int year = Integer.parseInt(attribute[1]);
            int month = Integer.parseInt(attribute[2]);
            int day = Integer.parseInt(attribute[3]);
            int iq = Integer.parseInt(attribute[4]);
            Person person = new Person(fullName, new Date(day, month, year), new Brain(iq));

            System.out.println(person);
        }

    }
}
