public class FiberCalculator {
    public static long calculate(int num) {
        if (num == 1 || num == 2) {
            return 1;
        }
        long index = 1;
        long pre = 1;
        long tmp = 0;
        long current = 0;
        while (index <= num) {
            index ++;
            tmp = current;
            current = pre + tmp;
            pre = tmp;
        }
        return tmp;
    }
}
