package  com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

     //ARBEJDSSEDDEL:

     Person[] person = new Person[10];

        for (int i = 0; i < person.length; i++) {
            person[i] = new Person();
        }

        //Opg. 1
        indlaesFraFil(person);
        //Opg. 2
        System.out.println("Opg. 2:");
        udsPersonArr(person);
        //Opg. 3
        skrivTilDatFil(person);
        //Opg. 4
        laesFraDatFil(person);
        //Opg. 5
        System.out.println("\nOpg. 5:");
        udsPersonArr(person);
        //Opg. 6
        skrivTilSerFil(person);
        //Opg. 7
        laesFraSerFil(person);
        //Opg. 8
        System.out.println("\nOpg. 8:");
        udsPersonArr(person);
    }

    //Opg. 1.	Lav en funktion som indlæser data fra en tekstfil til et array af personer.
    public static void indlaesFraFil(Person[] person) throws FileNotFoundException {

        File fil = new File("tekstfil.txt");
        Scanner scan = new Scanner(fil);

        for (Person pers : person) {
            pers.setId(scan.next());
            pers.setNavn(scan.next());
            pers.setEfternavn(scan.next());
            pers.setTal1(scan.nextInt());
            pers.setTal2(scan.nextInt());
            pers.setTal3(scan.nextInt());
            pers.setTal4(scan.nextInt());
        }
    }

    //Opg. 2.	Kald udskriv for at udskrive arrayets indhold til skærm.
    public static void udsPersonArr(Person[] person){

        for (Person pers : person) {
            System.out.printf("%-5s %-10s %-10s %-10d %-5d %-5d %d\n",pers.getId(),pers.getNavn(),pers.getEfternavn(),pers.getTal1(),pers.getTal2(),pers.getTal3(),pers.getTal4());
        }
    }

    //Opg. 3.	Lav en funktion som kan skrive arrayets indhold ud til en binær fil .dat fil.
    public static void skrivTilDatFil(Person[] person) throws IOException {

        DataOutputStream filUd = new DataOutputStream(new FileOutputStream("tekstDat.dat"));

        for (int i = 0; i < person.length; i++) {
            filUd.writeUTF(person[i].getId());
            filUd.writeUTF(person[i].getNavn());
            filUd.writeUTF(person[i].getEfternavn());
            filUd.writeInt(person[i].getTal1());
            filUd.writeInt(person[i].getTal2());
            filUd.writeInt(person[i].getTal3());
            filUd.writeInt(person[i].getTal4());
        }
        filUd.close();
    }

    //Opg. 4.	Lav en funktion som kan læse indholdet af .dat filen ind i arrayet af personer.
    public static void laesFraDatFil(Person[] person) throws IOException, ClassNotFoundException {

        DataInputStream filInd = new DataInputStream(new FileInputStream("tekstDat.dat"));

        for (int i = 0; i < 3; i++) {
            person[i].setId(filInd.readUTF());
            person[i].setNavn(filInd.readUTF());
            person[i].setEfternavn(filInd.readUTF());
            person[i].setTal1(filInd.readInt());
            person[i].setTal2(filInd.readInt());
            person[i].setTal3(filInd.readInt());
            person[i].setTal4(filInd.readInt());
        }
    }

    //Opg. 6.	Kald udskriv for at udskrive arrayets indhold til skærm.
    public static void skrivTilSerFil(Person[] person) throws IOException {

        ObjectOutputStream filUd = new ObjectOutputStream(new FileOutputStream("tekstSer.ser"));

        for (int i = 0; i < person.length; i++) {
            filUd.writeObject(person[i]);
        }
    }

    //Opg. 7.	Lav en funktion som kan læse indholdet af .ser filen ind i arrayet af personer.
    public static void laesFraSerFil(Person[] person) throws IOException, ClassNotFoundException {

        ObjectInputStream filInd = new ObjectInputStream(new FileInputStream("tekstSer.ser"));

        for (int i = 0; i < person.length; i++) {
            person[i] = (Person) filInd.readObject();
        }
    }
}
