package day2.homework;

public class Address {
    private String place;
    private String streetAndNumber;

    public Address(String place, String streetAndNumber) {
        this.place = place;
        this.streetAndNumber = streetAndNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "place='" + place + '\'' +
                ", streetAndNumber='" + streetAndNumber + '\'' +
                '}';
    }

    public String getPlace() {
        return place;
    }

}
