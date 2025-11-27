package de.wmfinals.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table (name = "matchmatch")
public class match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Date date;
    private String location;
    private boolean penaltyShootout;

    public int getmatchId() { return id; }
    public void setmatchId(int id) { this.id = id; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public boolean getPenaltyShootout() { return penaltyShootout; }
    public void setPenaltyShootout(boolean penaltyShootout) { this.penaltyShootout = penaltyShootout; }
}
