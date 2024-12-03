public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println(miles);


        System.out.println(service.calculate(500000));
        System.out.println(service.calculate(19));
        System.out.println(service.calculate(20));
        System.out.println(service.calculate(6523254));
    }
}

