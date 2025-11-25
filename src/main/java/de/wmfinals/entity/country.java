package de.wmfinals.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

@Entity
@Table (name = "country")
public class country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    public int getcountryId() { return id; }
    public void setcountryId(int id) { this.id = id; }

    public String getCountryname() { return name; }
    public void setCountryname(String name) { this.name = name; }
}
