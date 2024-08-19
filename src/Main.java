//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int ticketPrice = 200;//СТОИМОСТЬ БИЛЕТА
        int priceForMile = 5;//стоимость за один бонус
        int bonus = ticketPrice/priceForMile;
        System.out.println("Кол-во бонусов " + bonus);
    }
}