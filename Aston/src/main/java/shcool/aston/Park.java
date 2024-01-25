package shcool.aston;
/*Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию
        об аттракционах, времени их работы и стоимости.*/

public class Park {
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
        Park.Attraction attr1 = park.new Attraction();

        attr1.attrName = "Ferris wheel";
        attr1.workingHours = "9:00 - 17:00";
        attr1.price = 42;
        attr1.getAttrInfo();
    }
}