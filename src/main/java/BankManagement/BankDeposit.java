package BankManagement;

public class BankDeposit implements DepositManagement {
    private String depositTerm; // Долгосрочный, краткосрочный, бессрочный
    private String depositType; // Отзывной или безотзывной
    private String currency; // Валюта вклада
    private double balance; // Сумма вклада
    private double interestRate; // Процентная ставка

    public BankDeposit(String depositTerm, String depositType, String currency, double balance, double interestRate) {
        this.depositTerm = depositTerm;
        this.depositType = depositType;
        this.currency = currency;
        this.balance = balance;
        this.interestRate = interestRate;
    }
    @Override
    public void changeDepositTerm(String term) {
        this.depositTerm = term;
        System.out.println("Срок вклада изменён на: " + this.depositTerm);
    }
    @Override
    public String getDepositType() {
        return this.depositType;
    }
    @Override
    public void closeAndOpenNewDeposit(String newCurrency) {
        System.out.println("Вклад закрыт. Открыт новый вклад с той же суммой и условиями, но в валюте: " + newCurrency);
        this.currency = newCurrency;
    }
    @Override
    public double calculateInterest() {
        return this.balance * (this.interestRate / 100);
    }
    public void displayDepositDetails() {
        System.out.println("Информация о вкладе:");
        System.out.println("Срок вклада: " + this.depositTerm);
        System.out.println("Тип вклада: " + this.depositType);
        System.out.println("Валюта вклада: " + this.currency);
        System.out.println("Баланс: " + this.balance);
        System.out.println("Процентная ставка: " + this.interestRate);
        System.out.println("Начисленные проценты: " + calculateInterest());
    }
}
