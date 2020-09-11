public class Main {

    public static void main(String[] args) {
        String name = qwe(8, 36);
        System.out.println(name);
        String name1 = qwe(53, 45);
        System.out.println(name1);
        String name2 = qwe(21, 28);
        System.out.println(name2);
        String name3 = qwe(33, 34);
        System.out.println(name3);
        String name4 = qwe(43, 18);
        System.out.println(name4);
    }

    public static String qwe(int age, int temperature) {
        if (age >= 20 & age <= 45 & temperature >= -20 & temperature <= 30) {
            return "Можно идти гулять";
        } else if (age <= 20 & temperature >= 0 & temperature <= 28) {
            return "Можно идти гулять";
        } else if (age < 45 & temperature >= -10 & temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }

    }
}