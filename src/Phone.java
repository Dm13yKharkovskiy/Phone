public class Phone<T, V> {
    private T numberPhone;
    private V nameSubscriber;


    public T getNumberPhone(){
        return numberPhone;
    }
    public V getNameSubscriber(){
        return nameSubscriber;
    }
    void addContact(T numberPhone, V nameSubscriber){
        this.numberPhone = numberPhone;
        this.nameSubscriber = nameSubscriber;
    }
    void  call(){
        System.out.println("Call subscriber " + nameSubscriber + " " + numberPhone);
    }
    void sendSMS(String text) {
        System.out.println("Send SMS: " + text + ". " + nameSubscriber + " " + numberPhone);

    }

}
