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
        } else if (findContact(newContact.getName()) != -1){
            System.out.println("Contact with name " + newContact.getName() + " already exists.  Update not successful");
            return false;

        }
        this.contactPeople.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced by " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contacts contact) {
        int foundPosition = findContact(contact);
        if(foundPosition <0) {
            System.out.println(contact.getName() + " was not found");
            return false;
        }
        this.contactPeople.remove(foundPosition);
        System.out.println(contact.getName() + " was deleted");
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

    public String queryContact(Contacts contact) {
        if(findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contacts queryContact(String name) {
       int position = findContact(name);
       if (position >= 0) {
           return this.contactPeople.get(position);
       }
       return null;
    }

    public void printContacts() {
        System.out.println("Contact list");
        for(int i = 0; i < this.contactPeople.size(); i++) {
            System.out.println((i+1) + "." +
                    this.contactPeople.get(i).getName() + "-->" +
                    this.contactPeople.get(i).getPhoneNumber());
        }
    }
}
