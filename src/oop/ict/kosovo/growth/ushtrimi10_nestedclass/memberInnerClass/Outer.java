package oop.ict.kosovo.growth.ushtrimi10_nestedclass.memberInnerClass;

import java.util.ArrayList;
import java.util.List;

public class Outer {

    List<Inner> inners = new ArrayList<>();

    public void addInners(int id, String name) {
        inners.add(new Inner(id, name));
    }

    public List<Inner> getInners() {
        return inners;
    }

    public void setInners(List<Inner> inners) {
        this.inners = inners;
    }

    class Inner {
        private int id;
        private String name;

        public Inner(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        //... get dhe set
    }
}
