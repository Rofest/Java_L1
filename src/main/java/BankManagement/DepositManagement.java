package BankManagement;

public interface DepositManagement {
    void changeDepositTerm(String term); // Изменить продолжительность вклада
    String getDepositType(); // Узнать тип вклада (отзывной или безотзывной)
    void closeAndOpenNewDeposit(String currency); // Закрыть вклад и открыть новый в другой валюте
    double calculateInterest(); // Рассчитать начисление процентов
}
