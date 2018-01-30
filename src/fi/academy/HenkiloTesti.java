package fi.academy;

import fi.academy.harjoitukset.Henkilo;

class Henkilotesti {

    public static void main(String[] args) {

        Henkilo[] hlot = {new Henkilo("John", "Doe", 21),
                new Henkilo("Jane", "Doe", 28),
                new Henkilo("John", "Doe", 55),
                new Henkilo("John", "Deere", 21),
                new Henkilo("James", "Gosling", 55)
        };

        for (Henkilo h : hlot) {
            System.out.println(h);
        }
        Henkilo john = new Henkilo("John", "Doe", 21);
        System.out.println(hlot[0] == john); //false
        System.out.println(hlot[0].equals(john)); //true
    }


}