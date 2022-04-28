import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);    
        boolean loop = true;
        while (loop) {
            loop = false;
            System.out.println("Zadej počet hlav a počet rytířů");
            int pocetHlav = sc.nextInt();
            int[] arrayHlavy = new int[pocetHlav];
            int pocetRytiru = sc.nextInt();
            int[] arrayRytiru = new int[pocetRytiru];
            System.out.println("Zadej jednotlivé hlavy");
            for (int i = 0; i < arrayHlavy.length; i++) {
                arrayHlavy[i] = sc.nextInt();
            }
            System.out.println("Zadej jednotlivé rytíře");
            for (int i = 0; i < arrayRytiru.length; i++) {
                arrayRytiru[i] = sc.nextInt();
            }
            int posledni = 0;
            int vysledek = 0;
            int pocet = 0;
            for (int i = 0; i < arrayHlavy.length; i++) {
                for (int j = 0; j < arrayRytiru.length; j++) {
                    if(arrayRytiru[j] >= arrayHlavy[i] && posledni != arrayHlavy[i]){
                        posledni = arrayHlavy[i];
                        vysledek += arrayRytiru[j];
                        pocet++;
                    }
                }
            }
    
            if(pocet == arrayHlavy.length){
                System.out.println("Za zabití draka je potřeba " + vysledek + " mincí.");
            } else {
                System.out.println("Draka nelze zabít");
            }

            System.out.println("Chceš pokračovat?");
            if(sc.nextLine().equals("ano")){
                loop = true;
            } 
        }

    }
}
