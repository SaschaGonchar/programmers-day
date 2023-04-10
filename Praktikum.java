import java.util.Scanner;
    public class Praktikum {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите год:");
            int year = scanner.nextInt();
            String strDate;

            if (isLeapYear(year)) {
                System.out.println(year + "-й год - високосный, будте осторожны!!!");
                strDate="12.09.";
            } else {
                System.out.println(year + "-й год - НЕ високосный, живите спокойно!!!");
                strDate= "13.09.";
            }
            isPrintDate(strDate,year);
        }

        public static boolean isLeapYear(int year) {
            // здесь нужно определить, является ли переданный год високосным
            if ((year % 4==0)&&(!(year%100==0)|| (year % 400 ==0))) {
                    return true;
            }
            return false;
        }

        public static void isPrintDate(String strDate, int inYear) {
            System.out.println("В этом году профессиональный праздник будет: "+ strDate+inYear);
        }
    }

