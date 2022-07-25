public class PhoneMain {
    public static void main(String[] args) {
        Phone<Integer, String> phone1 = new Phone<>();
        phone1.addContact(111, "Help Vodafon");
        Phone<String, String> phone2 = new Phone<>();
        phone2.addContact("*101#", "Сhecking account");
        Phone<Long, String> phone3 = new Phone<>();
        phone3.addContact(380665110181L, "Roman");
        phone1.call();
        System.out.println(phone2.getNumberPhone());
        phone3.sendSMS("Hello!!!!");

    }
}
