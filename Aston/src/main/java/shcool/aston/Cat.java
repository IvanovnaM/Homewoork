package shcool.aston;

public class Cat extends Animal {
    private static int count;

    public int appetite;
    public boolean fullness;

    public Cat(String name, int swim, int run, int appetite, boolean fullness) {
        this.name = name;
        this.swim = swim;
        this.run = run;
        this.maxRun = 200;
        this.maxSwim = 0;
        this.appetite = appetite;
        this.fullness = fullness;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }

    @Override
    public void toSwim(int swim) {
        System.out.println(name + " не любит плавать.");
    }
}


