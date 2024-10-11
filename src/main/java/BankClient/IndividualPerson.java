package BankClient;

public class  IndividualPerson  extends Client {

    public IndividualPerson(String name, String surname, String status, int totalsumm) {
        super(name, surname, status, totalsumm, null);
    }

    @Override
    public String getType() {
        return "Физическое лицо";
    }

}