public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new AccoutBank(10000.0);
        System.out.println("------ Otabekning balance ------");
        System.out.println("Hisobdagi pull 10.0000 so'm ");
        System.out.println("Keladigon foyda (5%) : " + bankAccount.calculator() + " SO'M");

        BankAccount bankAccount2 = new BankPremium(10000.0);
        System.out.println("------- Alining Balance ------");
        System.out.println("Hisobdagi pull 10.0000 so'm ");
        System.out.println("Keladigon foyda (5%) : " + bankAccount2.calculator() + " SO'M");
    }
}
