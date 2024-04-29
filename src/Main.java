//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Объявляем переменные для входных данных.
        double ticket = 24895; // для хранения стоимости билета.
        int rub = 20; // для хранения количества рублей для одной бонусной мили.

        // Рассчитываем количество бонусных миль.

        int mile = (int) (ticket / rub);

        // Выврдим на экран.
        System.out.println(mile);
    }
}

