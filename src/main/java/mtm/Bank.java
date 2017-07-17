package mtm;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by azhilin on 31.01.2017.
 */
@Entity(name = "banks")
public class Bank {
    @Id
    @GeneratedValue
    int id;
    @Column
    String name;
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    List<Client> client = new ArrayList<Client>();

    public Bank() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Client> getClient() {
        return client;
    }

    public void setClient(List<Client> client) {
        this.client = client;
    }
}
