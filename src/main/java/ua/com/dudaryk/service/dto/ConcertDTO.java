package ua.com.dudaryk.service.dto;

import ua.com.dudaryk.model.Communication;
import ua.com.dudaryk.model.Concert;
import ua.com.dudaryk.model.Dudaryk;
import ua.com.dudaryk.model.Participant;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ConcertDTO implements Serializable {


    private long concertId;

    private LocalDateTime date;

    private String name;

    private String genre;

    private String poster;

    private static ConcertDTO toDto(Concert concert) {
        return new ConcertDTO()
                .setConcertId(concert.getConcertId())
                .setCommunications(concert.getCommunications())
                .setDate(concert.getDate())
                .setDudaryks(concert.getDudaryks())
                .setGenre(concert.getGenre())
                .setName(concert.getName())
                .setParticipants(concert.getParticipants())
                .setPoster(concert.getPoster());
    }

    public static List<ConcertDTO> toDto(List<Concert> concerts) {
        List<ConcertDTO> concertDTOList = new ArrayList<>();
        for (Concert concert : concerts) {
            concertDTOList.add(toDto(concert));
        }
        return concertDTOList;
    }

    private List<Participant> participants;

    private List<Communication> communications = new ArrayList<>();

    private List<Dudaryk> dudaryks;

    public long getConcertId() {
        return concertId;
    }

    private ConcertDTO setConcertId(long concertId) {
        this.concertId = concertId;
        return this;
    }

    public LocalDateTime getDate() {
        return date;
    }

    private ConcertDTO setDate(LocalDateTime date) {
        this.date = date;
        return this;
    }

    public String getName() {
        return name;
    }

    private ConcertDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getGenre() {
        return genre;
    }

    private ConcertDTO setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public String getPoster() {
        return poster;
    }

    private ConcertDTO setPoster(String poster) {
        this.poster = poster;
        return this;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    private ConcertDTO setParticipants(List<Participant> participants) {
        this.participants = participants;
        return this;
    }

    public List<Communication> getCommunications() {
        return communications;
    }

    private ConcertDTO setCommunications(List<Communication> communications) {
        this.communications = communications;
        return this;
    }

    public List<Dudaryk> getDudaryks() {
        return dudaryks;
    }

    private ConcertDTO setDudaryks(List<Dudaryk> dudaryks) {
        this.dudaryks = dudaryks;
        return this;
    }
}
