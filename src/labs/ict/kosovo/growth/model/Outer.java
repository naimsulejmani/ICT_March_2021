package labs.ict.kosovo.growth.model;

class Outer {
    int n;

    class Inner {
        int ten = 10;

        void setNToTen() {
            n = ten;
        }

        public void print() {
            System.out.println("AA");
        }
    }

    void setInner(Inner i) {

    }

    Inner getInner() {
        return new Inner();
    }
    void setN() {
        new Inner().setNToTen();
    }


}
