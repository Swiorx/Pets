import java.util.ArrayList;

public class Caine extends Animale {
    public ArrayList<String> propscaine = new ArrayList<String>();
    public Caine(String name, String age){
        this.name = name;
        this.age = age;
    }

    public void getCaine(){
        System.out.println("\nCaine: Numele: " + name + ", Varsta: " + age + ", Proprietati: ");
        for (int i = 0; i < propscaine.size(); i++ )
            System.out.println(propscaine.get(i) + "; ");
    }
}
