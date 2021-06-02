package designpatterns.ict.kosovo.growth.builders;

public class Student {
    private final int id;
    private final String name;
    private String surname;
    private boolean isGraduated;

    public Student(Builder studentBuilder) {
        this.id = studentBuilder.id;
        this.name = studentBuilder.name;
        this.surname = studentBuilder.surname;
        this.isGraduated = studentBuilder.isGraduated;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isGraduated() {
        return isGraduated;
    }

    public void setGraduated(boolean graduated) {
        isGraduated = graduated;
    }

    public static class Builder {
        private final int id;
        private final String name;
        private String surname;
        private boolean isGraduated;

        public Builder(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder isGraduated(boolean isGraduated) {
            this.isGraduated = isGraduated;
            return this;
        }

        public Student build() {
            return new Student(this);
        }

        @Override
        public String toString() {
            return "StudentBuilder{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", isGraduated=" + isGraduated +
                    '}';
        }
    }


}
