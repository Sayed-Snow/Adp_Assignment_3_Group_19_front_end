package za.ac.cput.client;

import java.util.HashSet;
import java.util.Set;

public class ContactClient {
    private RestClient client = new RestClient();

    public Contact createContact(Contact contact) {
        return client.post("http://localhost:8080/Contact/create", contact, Contact.class);
    }

    public Contact readContact(String id) {
        return client.get("http://localhost:8080/Contact/read/" + id, Contact.class);
    }

    public Contact updateContact(Contact contact) {
        return client.post("http://localhost:8080/Contact/update", contact, Contact.class);
    }

    public Boolean deleteContact(String id) {
        return client.get("http://localhost:8080/Contact/delete/" + id, Boolean.class);
    }

    public Set<Contact> getAllContacts() {
        return client.get("http://localhost:8080/Contact/getall", new HashSet<Contact>().getClass());
    }
}

