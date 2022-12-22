
import controllers.MainController;
import models.Contact;
import models.User;
import java.io.IOException;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        var controller = new MainController();
        User user1 = new User();
        user1.setId(2);
        user1.setName("Semen");

        Contact contact = new Contact();
        contact.setPhone("+71112223346");
        contact.setContactName("_Semen");
        contact.setEmail("Semen@mail.ru");

        var meta = new HashMap<String, Object>();
        meta.put("Music", "Club");
        meta.put("Rating", 11);
        meta.put("time", new Date().getTime());

        controller.addContact(user1, contact, meta);
        controller.close();
    }
}

