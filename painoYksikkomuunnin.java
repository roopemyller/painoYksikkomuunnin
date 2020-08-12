import java.util.Scanner;

public class painoYksikkomuunnin {

    public static void main (String[] args){
        Scanner lukija = new Scanner(System.in);

        System.out.println("Tämä ohjelma muuntaa kilogrammat(kg) paunoiksi(lbs) ja toisin päin.");
        while(true){
            System.out.print("Anna tiedetyn arvon yksikkö:");
            String yksikko = lukija.nextLine();
            
            double paino2 = 0;
            String yksikko2 = ("");
            
            if(yksikko.equals("kg") || yksikko.equals("lbs")){
                System.out.println("Kuinka paljon painaa?");
                double paino1 = Double.valueOf(lukija.nextLine());
                if(yksikko.equals("kg")){
                    paino2 = paino1 * 2.20462247604;
                    yksikko2 = ("lbs");
                }else{
                    paino2 = paino1 / 2.20462247604;
                    yksikko2 = ("kg");
                }

                System.out.println(paino1 + " " + yksikko + " on muunnettuna " + paino2 + " " + yksikko2);
                break;
            }else{
                System.out.println("Yksikkö on väärä. Yritä uudelleen.");
                continue;
            }
        }

        lukija.close();
    }
}