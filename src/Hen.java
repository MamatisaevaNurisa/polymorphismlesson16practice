public class Hen {

    private int  counter; //kununo kancha
    private String country;




    public Hen(int counter, String country) {
        this.counter = counter;
        this.country = country;


    }
    public Hen (){

    }

    public int getCountOfEggsPerMonth(){
        int sum = counter*30;
        return sum;
    }

    public void getDescription(){

    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    }

