public class BonusMilesService {
    public int calculate(int price) {
        int result;
        if(price >= 20) {
            result = price / 20;

        } else {
            result = 0;
        }
        return result;


    }
}
