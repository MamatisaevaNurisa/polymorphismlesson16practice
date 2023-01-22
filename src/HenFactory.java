public class HenFactory {

    public static void getHen(String country) {

        if (country.equals("UKRAINE")) {
            UkraineHen ukraineHen1 = new UkraineHen(3, "Ukraina");
            ukraineHen1.getDescription();

        } else if (country.equals("RUSSIA")) {
            RussianHen russianHen2 = new RussianHen(5, "Russia");
            russianHen2.getDescription();
        }

    }

}

