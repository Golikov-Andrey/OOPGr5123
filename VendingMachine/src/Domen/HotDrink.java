package Domen;

public class HotDrink extends Product {

    private int temp;

    public HotDrink(String name, int price, int temp) {
        super(name, price);
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
         this.temp = temp;
    }

    @Override
    public String toString()
    {
        return super.toString()+"Hot Drink temperature is "+this.temp;
    }
}
