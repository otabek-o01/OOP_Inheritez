public abstract class  BankAccount {
    protected double SavingsAccount;
    protected double PremiumAccount;

    public BankAccount(double SavingsAccount) {
        this.SavingsAccount = SavingsAccount;
    }
    public abstract double calculator();
}

