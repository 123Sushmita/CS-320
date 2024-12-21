import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {

    @Test
    public void testAddContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");

        service.addContact(contact);
        Contact retrieved = service.getContact("12345");
        assertNotNull(retrieved);
        assertEquals("12345", retrieved.getContactId());
    }

    @Test
    public void testAddDuplicateContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("12345", "John
