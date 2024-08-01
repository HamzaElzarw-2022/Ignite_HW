package org.example;

public class Subscriber {

    private int id;
    private String name;
    private String surname;
    private String msisdn;
    private int tariffId;
    private long dateTimeStamp;

    public Subscriber(int id, String name, String surname, String msisdn, int tariffId, long dateTimeStamp) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.msisdn = msisdn;
        this.tariffId = tariffId;
        this.dateTimeStamp = dateTimeStamp;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", msisdn='" + msisdn + '\'' +
                ", tariffId=" + tariffId +
                ", dateTimeStamp=" + dateTimeStamp +
                '}';
    }
}
