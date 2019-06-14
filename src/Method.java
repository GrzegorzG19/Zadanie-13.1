public class Method {
    public static double average(Employee[] employees) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getPayment();
        }
        sum = sum / employees.length;
        return sum;
    }

    public static double lowest(Employee[] employees) {
        double low = employees[0].getPayment();
        for (int i = 0; i < employees.length; i++) {
            if (low > employees[i].getPayment()) {
                low = employees[i].getPayment();
            }
        }
        return low;
    }

    public static double highest(Employee[] employees) {
        double high = employees[0].getPayment();
        for (int i = 0; i < employees.length; i++) {
            if (high < employees[i].getPayment()) {
                high = employees[i].getPayment();
            }
        }
        return high;
    }

    public static double numberIT(Employee[] employees) {

        double numb = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getCategory().equals("it")) {
                numb++;
            }
        }
        return numb;
    }

    public static double numberS(Employee[] employees) {

        double numb = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getCategory().equals("Support")) {
                numb++;
            }
        }
        return numb;
    }

    public static double numberM(Employee[] employees) {

        double numb = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getCategory().equals("Management")) {
                numb++;
            }
        }
        return numb;
    }
}
