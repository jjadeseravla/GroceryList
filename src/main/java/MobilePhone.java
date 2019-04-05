import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> contactPeople;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contactPeople = new ArrayList<Contacts>();
    }

    public ArrayList<Contacts> getContactPeople() {
        return contactPeople;
    }

//    public void addContactNames(Contacts contacts) {
//        contactPeople.add(contacts);
//    }

    public boolean addNewContact(Contacts contact) {
        if(findContact(contact.getName()) >=0) {
            System.out.println("Contact is already on file");
            return false;
        }
        contactPeople.add(contact);
        return true;
    }

    public boolean updateContact(Contacts oldContact, Contacts newContact) {
        int foundPosition = findContact(oldContact);
        if(foundPosition <0) {
            System.out.println(oldContact.getName() + " was not found");
            return false;
        }
        this.contactPeople.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced by " + newContact.getName());
        return true;
    }

    private int findContact(Contacts contact) {
        return this.contactPeople.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < contactPeople.size(); i++) {
            Contacts contact = this.contactPeople.get(i);
            if(contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }
}
