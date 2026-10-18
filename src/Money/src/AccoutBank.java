public class AccoutBank extends BankAccount {

    public AccoutBank(double SavingsAccount) {
        super(SavingsAccount);
        this.PremiumAccount = 0.5;
    }

    @Override
    public double calculator() {
        return SavingsAccount * PremiumAccount;
    }
}
