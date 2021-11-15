import java.util.Scanner;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        ArrayList<Caine> caine_arr = new ArrayList<Caine>();
        ArrayList<Cameleon> cameleon_arr = new ArrayList<Cameleon>();
        ArrayList<Pisica> pisica_arr = new ArrayList<Pisica>();
        int caine_i = 0;
        int cameleon_i = 0;
        int pisica_i = 0;
        boolean iscontinue = true;
        while (iscontinue = true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n1 - Add new pet \n2 - List pets \n3 - Quit");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    Scanner newpet = new Scanner(System.in);
                    System.out.println("1 - Caine \n2 - Pisica \n3 - Cameleon");
                    int newPet = newpet.nextInt();
                    scanner.nextLine();
                    switch (newPet){
                        case 1:
                            System.out.println("Nume: ");
                            String nume = scanner.nextLine();
                            System.out.println("Varsta: ");
                            String varsta = scanner.nextLine();
                            System.out.println("Proprietate: \n1 - Speriat\n2 - Agitat\n3 - Vedere Slaba");
                            caine_arr.add(new Caine(nume, varsta));
                            char prop1 = '0';
                                    while(prop1 != 'q'){
                                        prop1 = scanner.next().charAt(0);
                                        switch (prop1){
                                            case '1':
                                                caine_arr.get(caine_i).propscaine.add("Speriat");
                                                break;
                                            case '2':
                                                caine_arr.get(caine_i).propscaine.add("Agitat");
                                                break;
                                            case '3':
                                                caine_arr.get(caine_i).propscaine.add("Vedere Slaba");
                                                break;
                                        }
                                    }
                                    break;
                        case 2:
                            System.out.println("Nume: ");
                            nume = scanner.nextLine();
                            System.out.println("Varsta: ");
                            varsta = scanner.nextLine();
                            System.out.println("Proprietate: \n1 - Sperioasa\n2 - Agitata\n3 - Vedere Slaba");
                            pisica_arr.add(new Pisica(nume, varsta));
                            char prop2 = '0';
                            while(prop2 != 'q') {
                                prop2 = scanner.next().charAt(0);
                                switch (prop2) {
                                    case '1':
                                        pisica_arr.get(pisica_i).propspisica.add("Sperioasa");
                                        break;
                                    case '2':
                                        pisica_arr.get(pisica_i).propspisica.add("Agitata");
                                        break;
                                    case '3':
                                        pisica_arr.get(pisica_i).propspisica.add("Vedere Slaba");
                                        break;
                                }
                            }
                                break;
                                case 3:
                                    System.out.println("Nume: ");
                                    nume = scanner.nextLine();
                                    System.out.println("Varsta: ");
                                    varsta = scanner.nextLine();
                                    System.out.println("Proprietate: \n1 - Mancacios\n2 - Verde\n3 - Vedere Buna");
                                    cameleon_arr.add(new Cameleon(nume, varsta));
                                    char prop3 = '0';
                                    while(prop3 != 'q'){
                                        prop3 = scanner.next().charAt(0);
                                        switch (prop3){
                                            case '1':
                                                cameleon_arr.get(cameleon_i).propscameleon.add("Mancacios");
                                                break;
                                            case '2':
                                                cameleon_arr.get(cameleon_i).propscameleon.add("Verde");
                                                break;
                                            case '3':
                                                cameleon_arr.get(cameleon_i).propscameleon.add("Vedere Buna");
                                                break;
                                        }
                            }


                    }


                    break;
                case 2:
                for (int i = 0; i < caine_arr.size(); i++){
                    caine_arr.get(i).getCaine();
                }
                for (int i = 0; i < pisica_arr.size(); i++){
                    pisica_arr.get(i).getPisica();
                }
                for (int i = 0; i < cameleon_arr.size(); i++){
                    cameleon_arr.get(i).getCameleon();
                }

                    break;

                case 3:
                        return;

            }
        }
    }
}


