import java.util.ArrayList;

public class Pisica extends Animale {
    public ArrayList<String> propspisica = new ArrayList<String>();
    public Pisica(String name, String age){
        this.name = name;
        this.age = age;
    }
    public void getPisica(){
        System.out.println("\nPisica: Numele: " + name + ", Varsta: " + age + ", Proprietati: ");
        for (int i = 0; i < propspisica.size(); i++ )
            System.out.println(propspisica.get(i) + "; ");
    }
}
