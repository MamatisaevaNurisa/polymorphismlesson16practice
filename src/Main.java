public class Main {
    public static void main(String[] args) {
        UkraineHen ukraineHen = new UkraineHen(3, "Ukraine");
        HenFactory.getHen(ukraineHen.getCountry());
        RussianHen russianHen = new RussianHen(5, "Russia");
        HenFactory.getHen(russianHen.getCountry());


    }
}