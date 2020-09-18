package lab2;

public class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String e, String n, char g) {
        name = n;
        email = e;
        gender = g;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public char getGender(){
        return this.gender;
    }

    @Override
    public String toString() {
        return this.name + "'s' email is " + this.email + "gender is " + this.gender;
    }
}
