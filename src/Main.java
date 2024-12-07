//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        //2
        fullName = "Ivanov Ivan Ivanovich";
        System.out.println(fullName.toUpperCase());
//3
        String s = "Иванов Семён Семёнович";
        String s2 = s.replace('ё', 'е');
        System.out.println(s2);
    }
}
