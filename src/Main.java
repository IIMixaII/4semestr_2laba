import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.print("Введите номер задания (от 1 до 10): ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Выбрано задание 1");
                Main.task1.printNumericTypeMinMax();
                break;
            case 2:
                System.out.println("Выбрано задание 2");
                Main.GeometricMeanNegatives.main(args);
                break;
            case 3:
                System.out.println("Выбрано задание 3");
                Main.task3.task3();
                break;
            case 4:
                System.out.println("Выбрано задание 4");
                Main.task4.task4();
                break;
            case 5:
                System.out.println("Выбрано задание 5");
                Main.NumberConversion.main(args);
                break;
            case 6:
                System.out.println("Выбрано задание 6");
                Main.task6.viewTables();
                break;
            case 7:
                System.out.println("Выбрано задание 7");
                Main.task7.task(args);
                break;
            case 8:
                System.out.println("Выбрано задание 8");
                break;
            case 9:
                System.out.println("Выбрано задание 9");
                Main.SubstringOccurrences.main(args);
                break;
            case 10:
                System.out.println("Выбрано задание 10");
                Main.CyclicPermutations.main(args);
                break;
            default:
                System.out.println("Неверный выбор");
        }

        scanner.close();
    }

    public class task1 {
        public task1(Main this$0) {
        }

        public static void printNumericTypeMinMax() {
            System.out.println("Numeric Type\t\tMinimum Value\t\tMaximum Value");
            System.out.println("-------------------------------------------------");
            System.out.println("byte\t\t\t-128\t\t\t\t\t127");
            System.out.println("short\t\t\t-32768\t\t\t\t\t32767");
            System.out.println("int\t\t\t\t-2147483648\t\t\t\t2147483647");
            System.out.println("long\t\t\t-9223372036854775808\t9223372036854775807");
            System.out.println("float\t\t\t1.4E-45\t\t\t\t\t3.4028235E38");
            System.out.println("double\t\t\t4.9E-324\t\t\t\t1.7976931348623157E308");
        }
    }

    public class GeometricMeanNegatives {
        public GeometricMeanNegatives(Main this$0) {
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] array = new int[20];
            System.out.println("Введите  20 целых чисел:");

            for(int i = 0; i < 20; ++i) {
                while(!scanner.hasNextInt()) {
                    System.out.println("Введено не число. Пожалуйста, введите число:");
                    scanner.next();
                }

                array[i] = scanner.nextInt();
            }

            double geometricMean = calculateGeometricMeanOfNegatives(array);
            System.out.println("Среднее геометрическое отрицательных элементов: " + geometricMean);
        }

        static double calculateGeometricMeanOfNegatives(int[] array) {
            double product = 1.0;
            int count = 0;
            int[] var4 = array;
            int var5 = array.length;

            for(int var6 = 0; var6 < var5; ++var6) {
                int num = var4[var6];
                if (num < 0) {
                    product *= (double)num;
                    ++count;
                }
            }

            if (count > 0) {
                return Math.pow(product, 1.0 / (double)count);
            } else {
                System.out.println("Отриацательных элементов нет");
                return 0.0;
            }
        }
    }

    public class task3 {
        public task3(Main this$0) {
        }

        public static void task3() {
            float r = 5.2F;
            float R = 10.0F;
            float obj_x = 2.0F;
            float obj_y = 3.0F;
            double distance = Math.sqrt(Math.pow((double)obj_x, 2.0) + Math.pow((double)obj_y, 2.0));
            if (distance > (double)R) {
                System.out.println("Предмет не обнаружен");
            } else if (distance <= (double)R && distance > (double)r) {
                System.out.println("Предмет обнаружен");
            } else if (distance <= (double)r) {
                System.out.println("Тревога!");
            }

        }
    }

    public class task4 {
        public task4(Main this$0) {
        }

        public static void task4() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите значение r: ");
            float r = scanner.nextFloat();
            System.out.print("Введите значение R: ");
            float R = scanner.nextFloat();
            System.out.print("Введите значение x: ");
            float obj_x = scanner.nextFloat();
            System.out.print("Введите значение y: ");
            float obj_y = scanner.nextFloat();
            scanner.close();
            double distance = Math.sqrt(Math.pow((double)obj_x, 2.0) + Math.pow((double)obj_y, 2.0));
            if (distance > (double)R) {
                System.out.println("Предмет не обнаружен");
            } else if (distance <= (double)R && distance > (double)r) {
                System.out.println("Предмет обнаружен");
            } else if (distance <= (double)r) {
                System.out.println("Тревога!");
            }

        }
    }

    public class NumberConversion {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean numberx = false;

            while(true) {
                System.out.println("Введите целое десятичное число:");

                while(!scanner.hasNextInt()) {
                    System.out.println("Введено не число. Пожалуйста, введите число:");
                    scanner.next();
                }

                int number = scanner.nextInt();
                if (number >= 0) {
                    scanner.close();
                    System.out.println("Десятичное число: " + number);
                    System.out.println("Двоичное представление: " + Integer.toBinaryString(number));
                    System.out.println("Восьмеричное представление: " + Integer.toOctalString(number));
                    System.out.println("Шестнадцатеричное представление: " + Integer.toHexString(number));
                    return;
                }

                System.out.println("Введено отрицательное число. Пожалуйста, введите положительное число:");
            }
        }
    }

    public static class task6 {
        public task6() {
        }

        public static void viewTables() {
            viewTable(1024, 16, 16);
            viewTable(8352, 2, 16);
        }

        private static void viewTable(int start_code, int rows, int columns) {
            int i;
            for(i = 0; i < columns; ++i) {
                System.out.printf("%X ", i);
            }

            System.out.println();

            for(i = 0; i < rows; ++i) {
                System.out.printf("%4X ", start_code + i * columns);

                for(int j = 0; j < columns; ++j) {
                    System.out.printf("%c ", (char)(start_code + i * columns + j));
                }

                System.out.println();
            }

        }
    }

    public class task7 {
        public task7(Main this$0) {
        }

        public static void task(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку:");
            String str = scanner.nextLine();
            int len = str.length();
            int upCases = 0;
            int lowCases = 0;
            int arabicNums = 0;
            int nonArabicNums = 0;
            int otherCases = 0;

            for(int i = 0; i < len; ++i) {
                char ch = str.charAt(i);
                if (Character.isLetter(ch)) {
                    if (Character.isUpperCase(ch)) {
                        ++upCases;
                    } else {
                        ++lowCases;
                    }
                } else if (Character.isDigit(ch)) {
                    if (ch >= '0' && ch <= '9') {
                        ++arabicNums;
                    } else {
                        ++nonArabicNums;
                    }
                } else {
                    ++otherCases;
                }
            }

            System.out.println("Общее количество символов: " + len);
            System.out.println("Количество букв: " + (upCases + lowCases));
            System.out.println("Количество прописных букв: " + lowCases);
            System.out.println("Количество заглавных букв: " + upCases);
            System.out.println("Количество цифр: " + (arabicNums + nonArabicNums));
            System.out.println("Количество арабских цифр: " + arabicNums);
            System.out.println("Количество не арабских цифр: " + nonArabicNums);
            System.out.println("Количество других символов: " + otherCases);
        }
    }

    public class SubstringOccurrences {
        public SubstringOccurrences(Main this$0) {
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку: ");
            String string = scanner.nextLine();
            System.out.println("Введите подстроку: ");
            String substring = scanner.nextLine();
            int atIndex = 0;
            int count = 0;

            while(atIndex != -1) {
                atIndex = string.indexOf(substring, atIndex);
                if (atIndex != -1) {
                    ++count;
                    atIndex += substring.length();
                }
            }

            System.out.println("Количество вхождений подстроки: " + count);
        }
    }

    public class CyclicPermutations {
        public CyclicPermutations(Main this$0) {
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите строку: ");
            String input = scanner.nextLine();
            scanner.close();
            List<String> permutations = new ArrayList();
            int n = input.length();

            for(int i = 0; i < n; ++i) {
                String var10001 = input.substring(i);
                permutations.add(var10001 + input.substring(0, i));
            }

            System.out.println("Все циклические перестановки строки:");
            Iterator var7 = permutations.iterator();

            while(var7.hasNext()) {
                String permutation = (String)var7.next();
                System.out.println(permutation);
            }

        }
    }
}
