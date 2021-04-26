package oop.ict.kosovo.growth.ushtrimi7_loggingexceptions;

public class TestNoNetworkException {
    public static void main(String[] args) {
        try {
            System.out.println("po fillojme me try");
            connect();
            System.out.println("po perfundojme me try");


        } catch (NoNetworkException e) {
            System.out.println("ska rrjet");
        } catch (NullPointerException ex) {
            System.out.println("null pointer");
        } catch (Exception ex) {
            System.out.println("Exception general");
        } finally {
            //nese koneksioni me databaze ka me qene ihapur, mbylle
            System.out.println("Kjo do te ekzetuhet cdohere");
        }
    }

    public static void connect() throws NoNetworkException, NullPointerException {
        if (1 == 1) return;
        if (true)
            throw new NoNetworkException("Mungon lidhja me serverin!!!");
        else
            throw new NullPointerException();

    }
}
