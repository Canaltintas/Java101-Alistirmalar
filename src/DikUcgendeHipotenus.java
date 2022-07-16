/*
Patika.dev Profil : https://app.patika.dev/cans06
* *\
 */

import java.util.Scanner;
public class DikUcgendeHipotenus {
    public static void main(String[] args) {
        double dikKenar1,dikKenar2,hipotenus,cevre,alan;
        Scanner input =new Scanner(System.in);

        System.out.print("1.Kenar Uzunluğunu Giriniz :");
        dikKenar1=input.nextDouble();
        System.out.print("2.Kenar Uzunluğunu Giriniz :");
        dikKenar2=input.nextDouble();
        hipotenus=Math.sqrt((dikKenar1*dikKenar1)+(dikKenar2*dikKenar2));
        double u =(dikKenar1+dikKenar2+hipotenus)/2;
        cevre = 2*u;
        alan =Math.sqrt(u *(u-dikKenar1)*(u-dikKenar2)*(u-hipotenus));

        System.out.println("Dik Üçgenin Hipotenüsü :"+hipotenus);
        System.out.println("Üçgenin Çevresi :" +cevre);
        System.out.println("Üçgenin ALanı : " +alan);






    }
}
