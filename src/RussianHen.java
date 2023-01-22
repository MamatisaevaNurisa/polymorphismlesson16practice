public class RussianHen extends Hen {


    public RussianHen(int counter, String country) {
        super(counter, country);
    }
    public RussianHen(){

    }

    @Override
    public int getCountOfEggsPerMonth() {
        return getCounter()*30;

    }

    @Override
    public void getDescription() {
        System.out.println("Menin olkom " + getCountry()+"bir aida ushuncha jumurtka berem"+getCountOfEggsPerMonth());
    }


}
