package mtm;

import javax.persistence.*;

/**
 * Created by azhilin on 31.01.2017.
 */
@Entity(name = "clients")
public class Client {
    @Id
    @GeneratedValue
    int id;
    @Column(name = "name")
    String name;
    @Column(name = "surname")
    String surname;

    public Client() {
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
