package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints.Required;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Transaction extends Model {

    @Id
    @GeneratedValue
    public Long id;

    @Required
    public Long transactionId;

    @Column(name = "created_at")
    public Date createdAt;

    public String status;

    public static Finder<Long, Transaction> find = new Finder<>(Transaction.class);

    public static List<Transaction> findAll() {
        return find.all();
    }

    public static Transaction findById(Long id) {
        return find.byId(id);
    }

    public void create() {
        this.save();
    }

    public void update(){
        this.save();
    }


}


