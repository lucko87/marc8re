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



    }
}