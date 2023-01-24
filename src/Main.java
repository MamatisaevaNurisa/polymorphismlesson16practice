public class Main {
    public static void main(String[] args) {
        UkraineHen ukraineHen = new UkraineHen(3, "UKRAINE");
        HenFactory.getHen(ukraineHen.getCountry());
        RussianHen russianHen = new RussianHen(5, "RUSSIA");
        HenFactory.getHen(russianHen.getCountry());

    }
}