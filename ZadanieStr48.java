public class ZadanieStr48 {
    public static void main(String[] args) {
        String [] listaSlow1 = {"architektura wielowarstwowa", "30000 metrow", "roziwazanie B-do-B", "aplikacja kliencka",
                                "interfejs interenetowy", "inteligentna karta", "rozwiazanie dynamiczne", "szesc sigma",
                                "przenikliwosc"};

        String[] listaSlow2 = {"zwieksza mozliwosci", "poprawia arakcyjnosc", "pomnaza wartosc", "opracowana dla",
                                "bazujaca na", "rozproszona", "sieciowa", "skoncentrowana na", "podniesiona na wyzszy poziom",
                                "skierwoanej", "udostepniona"};

        String[] listaSlow3 = {"procesu", "punktu wpisywania", "rozwiazania", "strategii", "paradygmatu", "portalu",
                                "witryny", "wersji", "misji"};

        int lista1Dlugosc = listaSlow1.length;
        int lista2Dlugosc = listaSlow2.length;
        int lista3Dlugosc = listaSlow3.length;

        int rnd1 = (int) (Math.random() * lista1Dlugosc);
        int rnd2 = (int) (Math.random() * lista2Dlugosc);
        int rnd3 = (int) (Math.random() * lista3Dlugosc);

        String zdanie = listaSlow1[rnd1] + " " + listaSlow2[rnd2] + " " + listaSlow3[rnd3];

        System.out.println("To jest to, czego nam trzeba " + zdanie + ".");
    }
}
