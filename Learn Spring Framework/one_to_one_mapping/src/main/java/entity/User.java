package entity;


import jdk.jfr.Category;
import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "User")
public class User<set> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    public String name;

//    @Embedded
//    @AttributeOverrides( {
//            @AttributeOverride(name="state" , column = @Column(name = "home_state")),
//            @AttributeOverride(name="city" , column = @Column(name = "home_city")),
//            @AttributeOverride(name="Pincode" , column = @Column(name = "home_Pincode"))
//    })
//    public Address address;
    @GenericGenerator(name="increment-gen" ,strategy = "increment")
    @CollectionId(columns = {@Column(name = "address_id")} , generator = "increment-gen" , type = @Type(type="int"))
    @ElementCollection
    public Collection<Address> address = new ArrayList<>();


    public User(String name, ArrayList<Address> address) {
        this.name = name;
        this.address = address;
    }

    public User() {

    }
}
