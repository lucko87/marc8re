package hu.company;

public class Main {

    public static void main(String[] args) {


        /*1. feladat
        Létrehoztam a két változót (a téglalap hosszúságát és magasságát, értéket adtam nekik,
        majd ki is irattam mindkét értéket.
        Végül a kiírattam a téglap területés és kerületét, így hogy a kiíratáson belül volt a képlet.*/
        float width = 5;
        float height = 6;

        System.out.println("A téglalap szépessége: " + width + "cm. A magassága: " + height + " cm.");
        System.out.println("A téglalap területe: " + (width * height) + " cm^2");
        System.out.println("A téglalap kerülete: " + (width * 2 + height * 2)+ " cm");

        /*2. feladat
        Létrehoztam a deciliter változót, és a kiíratáskor képlettel bemutattam, hogy milyen értékeket
        kapunk, amikor néhány további térfogat mértékegységre váltjuk át.*/
        float deciliter = 20;

        System.out.println(deciliter + " dl = " + (deciliter * 100) + " ml");
        System.out.println(deciliter + " dl = " + (deciliter * 10) + " cl");
        System.out.println(deciliter + " dl = " + (deciliter / 10) + " l");
        System.out.println(deciliter + " dl = " + (deciliter / 1000) + " hl");

        /*3. feladat
        Létrehoztam a pí konstanst, és a gömb sugának is megadtam az értékét, majd létrehoztam a volume változót,
        amelyhez, és képlettel kiszámoltam a gömb térfogatát. Kiíratattam a térfogatát.*/


        final double pi = Math.PI;
        double radius = 2.08;

        double volume =(4.0 / 3.0)  * Math.pow(radius,3.0) * pi;

        System.out.println(volume);

         /*4. feladat
        Létrezotam két változót, majd a kiíratásál képlettel számoltatom az átváltást. */


        double celsius = 10;
        double fahrenheit = 70;

        System.out.println(celsius + " celsius " + " = " + (celsius * 9 / 5 + 32));
        System.out.println(fahrenheit + " fahrenheit " + " = " + ((fahrenheit - 32)* 5 / 9));

        /*5. feladat
        Escape sequencesből a \n kapcsolóval elváltva irattam ki */


        System.out.println("************ \n* Hello    * \n* World    * \n* in       * \n* a        * \n* frame    *\n************");






    }
}