package basic.ict.kosovo.growth;

public class Detyre {
    public static void main(String[] args) {
        char shkronja = 'a';

        while (shkronja <= 'z') {
            System.out.println(shkronja++);
        }

        for (char sh = 'a'; sh <= 'z'; sh++) {
            System.out.println(sh);
        }
    }
}
