package BankManagement;
import BankClient.Client;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Bank {
    private List<Client> clients;

    public Bank() {
        clients = new ArrayList<>();
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public List<Client> getClientsByDepositRange(double minDeposit, double maxDeposit) {
        return clients.stream()
                .filter(client -> client.getTotalsumm() >= minDeposit && client.getTotalsumm() <= maxDeposit)
                .collect(Collectors.toList());
    }

    public List<Client> sortClientsByTotalDeposit() {
        return clients.stream()
                .sorted(Comparator.comparing(Client::getTotalsumm).reversed())
                .collect(Collectors.toList());
    }

    public void displayAllClients() {
        clients.forEach(System.out::println);
    }
}
