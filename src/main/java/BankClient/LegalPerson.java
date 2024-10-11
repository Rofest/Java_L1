package BankClient;

public  class LegalPerson extends Client {

    public LegalPerson(String nameF, String type, int totalsumm) {
        super(null, null, type, totalsumm,nameF);
    }

    @Override
    public String getType() {
        return "Юридическое лицо";
    }
    @Override
    public String toString() {
        return  "Название фирмы:'" + nameF + '\'' + "," +
                type  +
                ",Сумма вклада:" + totalsumm;
    }

}