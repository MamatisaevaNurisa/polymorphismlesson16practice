public class UkraineHen extends Hen {


    public UkraineHen(int counter, String country) {
        super(counter, country);
    }
    public UkraineHen(){

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
