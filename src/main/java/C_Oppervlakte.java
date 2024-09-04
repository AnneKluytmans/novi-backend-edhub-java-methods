public class C_Oppervlakte {

    public static void main(String[] args) {
        System.out.println("De oppervlakte van een rechthoek met lengte 2 en breedte 8 is " + oppervlakteRechthoek(2, 8));

        System.out.println("De oppervlakte van een vierkant met zijden van 5 cm is " + oppervlakteVierkant(5));

        System.out.println("De oppervlakte van een doos met lengte 2, breedte 8 en hoogte 5 is " + oppervlakteDoos(2, 8, 5));

        System.out.println("De oppervlakte van een kubus met zijden van 5 cm is " + oppervlakteKubus(5));
    }

    // nieuwe methods komen hier

    private static int oppervlakteRechthoek(int lengte, int breedte) {
        return lengte * breedte;
    }

    private static int oppervlakteVierkant(int breedte) {
        return breedte * breedte;
    }

    private static int oppervlakteDoos(int lengte, int breedte, int hoogte) {
        int boven_onderkant = lengte * breedte * 2;
        int zijkanten = (lengte * hoogte * 2) + (breedte * hoogte * 2);
        return boven_onderkant + zijkanten;
    }

    private static int oppervlakteKubus(int breedte) {
        return oppervlakteVierkant(breedte) * 6;
    }


}
