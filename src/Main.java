public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
}
    public static void task1() {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lasteName = "Ivanov";
        String fullName = firstName + " " + middleName + " " + lasteName;
        System.out.println("ФИО сотрудника- " + fullName);
    }

    public static void task2() {
        System.out.println("Задача 2");
        String fullName = "Ivan Ivanovich Ivanov";
        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета- " + upperFullName);
    }
    public static void task3() {
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника- " + fullName.replace("ё", "е"));
    }
    }
