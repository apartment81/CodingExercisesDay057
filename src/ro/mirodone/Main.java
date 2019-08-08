package ro.mirodone;

public class Main {

    public static void main(String[] args) {

        PhoneNumber phoneNumber = new PhoneNumber();

        System.out.println(phoneNumber.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}));

        CleverSolution1 cs = new CleverSolution1();

        System.out.println(cs.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}));

    }
}
