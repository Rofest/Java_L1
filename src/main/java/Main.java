import BankClient.Client;
import BankClient.IndividualPerson;
import BankClient.LegalPerson;
import BankManagement.Bank;
import BankManagement.BankDeposit;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        Client ivanov = new IndividualPerson("Иван" ,"Иванов","Физическое лицо" ,5000);
        Client rogKopyta = new LegalPerson("ООО Рога и Копыта","Юридическое лицо", 15000);
        Client petrova = new IndividualPerson("Мария" ," Петрова", "Физическое лицо",8000);

        bank.addClient(ivanov);
        bank.addClient(rogKopyta);
        bank.addClient(petrova);

        // Вывод всех клиентов
        System.out.println("Все клиенты:");
        bank.displayAllClients();

        // Создаем вклад для клиента Иванова
        BankDeposit deposit = new BankDeposit("долгосрочный", "безотзывной", "USD", 10000, 5.0);
        System.out.println("\nИван Иванов открыл вклад:");
        deposit.displayDepositDetails();

        // Изменение продолжительности вклада
        deposit.changeDepositTerm("краткосрочный");

        // Закрытие вклада и открытие в другой валюте
        deposit.closeAndOpenNewDeposit("EUR");

        // Рассчитываем проценты
        System.out.println("Проценты по вкладу Иванова: " + deposit.calculateInterest());

        // Сортировка клиентов по объему вклада
        System.out.println("\nКлиенты, отсортированные по объему вклада:");
        List<Client> sortedClients = (List<Client>) bank.sortClientsByTotalDeposit();
        sortedClients.forEach(System.out::println);

        // Поиск клиентов по диапазону вкладов
        System.out.println("\nКлиенты с вкладами от 6000 до 16000:");
        List<Client> clientsInRange = (List<Client>) bank.getClientsByDepositRange(6000, 16000);
        clientsInRange.forEach(System.out::println);
    }
}
