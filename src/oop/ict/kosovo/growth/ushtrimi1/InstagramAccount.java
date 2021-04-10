package oop.ict.kosovo.growth.ushtrimi1;

public class InstagramAccount {

    private int id;
    private String Emri;
    private String Email;
    private String Gjinia; // char, boolean

    public InstagramAccount(int id, String emri, String email, String gjinia) {
        this.id = id;
        Emri = emri;
        Email = email;
        Gjinia = gjinia;

        //this. mungon mirepo sosht gabim
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmri() {
        return Emri;
    }

    public void setEmri(String emri) {
        Emri = emri;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getGjinia() {
        return Gjinia;
    }

    public void setGjinia(String gjinia) {
        Gjinia = gjinia;
    }
}
