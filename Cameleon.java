import java.util.ArrayList;

public class Cameleon extends Animale {
    public ArrayList<String> propscameleon = new ArrayList<String>();
    public Cameleon(String name, String age){
        this.name = name;
        this.age = age;
    }
    public void getCameleon(){
        System.out.println("\nCameleon: Numele: " + name + ", Varsta: " + age + ", Proprietati: ");
        for (int i = 0; i < propscameleon.size(); i++ )
            System.out.println(propscameleon.get(i) + "; ");
    }
}
