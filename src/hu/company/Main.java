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


    }
}