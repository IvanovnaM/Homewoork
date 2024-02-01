package shcool.aston.animal;

public class Dog extends Animal {
    private static int count;

    public Dog(String name, int swim, int run) {

        this.name = name;
        this.swim = swim;
        this.run = run;
        this.maxRun = 500;
        this.maxSwim = 10;
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void run() {

    }

    @Override
    public void torun() {

    }


}

