package oop.ict.kosovo.growth.ushtrimi6_exceptions;

public class TestUncheckedExceptionNew {
    public static void main(String[] args) {
        args = new String[]{"1", "anc", "2", "3"};

        int sum = 0;
        for (String str : args) {
            try {
                sum += Integer.parseInt(str);
            }

            catch (NumberFormatException ex) {
                System.out.println("Nuk mundesh me mbledh dicka qe sosht number: " + str);
            }
            catch (Exception ex) {
                System.out.println("Tjeter gabim spo di spo di!!");
            }

        }
        System.out.println(sum);
    }
}
