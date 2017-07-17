package mtm;

import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by azhilin on 31.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = (SessionFactory) Persistence.createEntityManagerFactory("org.hibernate.jpa");
        EntityManager entityManager = sessionFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Client client1 = new Client();
        Client client2 = new Client();
        Client client3 = new Client();
        client1.setName("Alex");
        client1.setSurname("Zhilin");
        client2.setName("Bob");
        client2.setSurname("Smith");
        client3.setName("Vasia");
        client3.setSurname("Vasiliev");

        entityManager.persist(client1);
        entityManager.persist(client2);
        entityManager.persist(client3);

        Bank bank1 = new Bank();
        Bank bank2 = new Bank();

        bank1.setName("Privat");
        bank2.setName("Oschad");

        List<Client> clients1 = new ArrayList<Client>();
        clients1.add(client1);
        clients1.add(client2);

        bank1.setClient(clients1);

        List<Client> clients2 = new ArrayList<Client>();
        clients2.add(client1);

        bank2.setClient(clients2);

        entityManager.persist(bank1);
        entityManager.persist(bank2);


        entityManager.getTransaction().commit();


        entityManager.close();
        sessionFactory.close();
    }
}
