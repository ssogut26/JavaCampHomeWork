public class App {
    public static void main(String[] args) throws Exception {
        CreditUI creditUI = new CreditUI();
        creditUI.CalculateCredit(new SoldierCreditManager());
        creditUI.CalculateCredit(new AgricultureCreditManager());
    }
}
