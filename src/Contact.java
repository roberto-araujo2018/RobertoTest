
public class Contact {
    private String name;
    private String phoneNumber;
    private static MobilePhone mobilePhone = new MobilePhone("0039 330 4404");
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber) {
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            return new Contact(name, phoneNumber);
        } else {
            System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());
        }
        return existingContactRecord;
    }
}
