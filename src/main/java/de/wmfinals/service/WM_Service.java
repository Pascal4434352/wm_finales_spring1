package de.wmfinals.service;

import de.wmfinals.entity.country;
import de.wmfinals.entity.match;
import de.wmfinals.entity.match_team;
import de.wmfinals.repository.CountryRepository;
import de.wmfinals.repository.MatchRepository;
import de.wmfinals.repository.MatchTeamRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class WM_Service {
    private final CountryRepository countryRepository;
    private final MatchRepository matchRepository;
    private final MatchTeamRepository matchTeamRepository;

    public WM_Service(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }
    public WM_Service(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }
    public WM_Service(MatchTeamRepository matchTeamRepository) {
        this.matchTeamRepository = matchTeamRepository;
    }

    //------------------------------------------------------------------------------------------------------------------
    public List<country> getAllCountries(){
        return countryRepository.findAll();
    }
    public country getCountryByName(String name){
        return countryRepository.findByname(name);
    }
    public void deleteCountryByid(int id) {
        countryRepository.deleteById(id);
    }
    public country saveCountry(country country) {
        return countryRepository.save(country);
    }
    //------------------------------------------------------------------------------------------------------------------
    public List<match> getAllMatches(){
        return matchRepository.findAll();
    }
    public List<match> getAllPenalty(){
        return matchRepository.findBypenaltyShootout(true);
    }
    public List<match> getLocation(match location){
        return matchRepository.findBylocation(location);
    }
    public match getDate(Date date){
        return matchRepository.findBydate(date);
    }
    public void deleteMatch(match match){
        matchRepository.delete(match);
    }
    public match saveMatch(match match){
        return matchRepository.save(match);
    }
    //------------------------------------------------------------------------------------------------------------------
    public List<match_team> getAllTeams(){
        return matchTeamRepository.findAll();
    }
    public void deleteTeam(match_team team){
        matchTeamRepository.delete(team);
    }
    public match_team saveTeam(match_team team){
        return matchTeamRepository.save(team);
    }
}
