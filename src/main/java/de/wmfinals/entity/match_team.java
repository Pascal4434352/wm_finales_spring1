package de.wmfinals.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "match_team")
public class match_team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int match_id;

    private int country_id;
    private int score;
    private int is_winner;

    public int getmatchmatchId() { return match_id; }
    public void setmatchmatchId(int match_id) { this.match_id = match_id; }

    public int getCountry_id() { return country_id; }
    public void setCountry_id(int country_id) { this.country_id = country_id; }

    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }

    public int getIs_winner() { return is_winner; }
    public void setIs_winner(int is_winner) { this.is_winner = is_winner; }
}
