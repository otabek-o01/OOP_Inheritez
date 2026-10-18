public class BankPremium extends AccoutBank {

    public BankPremium(double SavingsAccount) {
        super(SavingsAccount);
        this.PremiumAccount = 0.10;
    }

    @Override
    public double calculator() {
        double normaldata = SavingsAccount * PremiumAccount;
        double vipbouns = SavingsAccount * 0.01;
        return normaldata + vipbouns;
    }

}
