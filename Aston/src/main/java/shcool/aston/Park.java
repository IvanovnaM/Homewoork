package shcool.aston;
/*Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию
        об аттракционах, времени их работы и стоимости.*/

public class Park {
    private Attraction attr1;
    private Attraction attr2;
    private Attraction attr3;
    private Attraction attr4;
    private Attraction attr5;

    public Park() {
    }


    public class Attraction {
        private String attrName;
        private String workingHours;
        private int price;

        public void getAttrInfo() {
            System.out.println("Name : " + attrName + "\n"
                    + "Working Hours : " + workingHours + "\n"
                    + "Price : " + price);
        }

    }

    public static void main(String[] args) {
        Park park = new Park();
        Attraction attr1 = park.new Attraction();
        Attraction attr2 = park.new Attraction();
        Attraction attr3 = park.new Attraction();
        Attraction attr4 = park.new Attraction();
        Attraction attr5 = park.new Attraction();

        attr1.attrName = "Ferris wheel";
        attr1.workingHours = "9:00 - 17:00";
        attr1.price = 42;
        attr1.getAttrInfo();

        attr2.attrName = "Carousel";
        attr2.workingHours = "9:00 - 17:00";
        attr2.price = 5;
        attr2.getAttrInfo();

        attr3.attrName = "Roller coaster";
        attr3.workingHours = "9:00 - 17:00";
        attr3.price = 16;
        attr3.getAttrInfo();

        attr4.attrName = "Pirate ship rides";
        attr4.workingHours = "9:00 - 17:00";
        attr4.price = 18;
        attr4.getAttrInfo();

        attr5.attrName = "Train rides";
        attr5.workingHours = "9:00 - 17:00";
        attr5.price = 12;
        attr5.getAttrInfo();
    }
}
