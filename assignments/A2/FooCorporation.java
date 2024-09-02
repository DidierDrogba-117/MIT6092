class FooCorporation {
    public static void calPay(double basepay, int hours) {
        // corner cases
        // check if base pay < min wage
        if (basepay < 8) {
            System.out.println("basepay < 8, error");
            return;
        }
        // check if hours > 60
        if (hours > 60) {
            System.out.println("hours > 60, error");
            return;
        }

        // regular cases
        double regularPay = 0.0;
        double extraPay = 0.0;
        // check if hours <= 40
        if (hours <= 40) {
            regularPay = hours * basepay;
            System.err.println(regularPay);
        } else { // cal extra hours
            regularPay = 40 * basepay;
            extraPay = (hours - 40) * basepay * 1.5;
            System.err.println(regularPay + extraPay);
        }

    }

    public static void main(String[] args) {
        calPay(7.5, 35);
        calPay(8.2, 47);
        calPay(10.0, 73);

    }
}