package lab2;
import java.lang.*;
public class TestAuthor {
    public static void main(String[] args){
        Author a1=new Author("pelevin@yandex.ru","Viktor Pelevin",'m');
        Author a2=new Author("Sorokingov_no@gmail.com","Vladimir Sorokin", 'm');
        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }
}