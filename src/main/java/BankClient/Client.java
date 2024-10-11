package BankClient;

import java.util.Objects;

public  class Client {
    protected  String name;
    protected  String surname;
    protected  String type;
    protected  int totalsumm;
    protected  String nameF;

 public Client(String name,String surname,String type, int totalsumm,String nameF){
     this.name = name;
     this.surname = surname;
     this.type = type;
     this.totalsumm = totalsumm;
     this.nameF = nameF;
 }
    public String getName(){
     return name;
    }

    public String getSurname(){
     return surname;
    }
    public String getType(){
     return type;
    }
    public int getTotalsumm(){
     return totalsumm;
    }

    @Override
    public String toString() {
        return  "Имя:" + name +","  +
                "Фамилия:" +surname + "," +
                 type + ","  +
                "Сумма вклада:" + totalsumm                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client client)) return false;
        return totalsumm == client.totalsumm && Objects.equals(name, client.name) && Objects.equals(surname, client.surname) && Objects.equals(type, client.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, type, totalsumm);
    }



}
