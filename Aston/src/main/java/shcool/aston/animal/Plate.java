package shcool.aston.animal;



public class Plate extends Animal{
    public int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void increaseFood(int x) {
        food += x;
        if (food < 0) {
            System.out.println("В тарелке не может быть отрицательное значение " + food);
        }
    }
    @Override
    public void run() {

    }

    @Override
    public void torun() {

    }
}