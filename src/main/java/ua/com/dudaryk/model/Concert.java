package ua.com.dudaryk.model;

import ua.com.dudaryk.service.dto.ConcertDTO;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "concert")
public class Concert implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "CONCERT_ID")
    private long concertId;

    @Column(name = "DATE")
    private LocalDateTime date;

    @Column(name = "NAME")
    private String name;

    @Column(name = "GENRE")
    private String genre;

    @Column(name = "POSTER")
    private String poster;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "concert_participant", joinColumns = @JoinColumn(name = "CONCERT_ID"),
            inverseJoinColumns = @JoinColumn(name = "PARTICIPANT_ID"))
    private List<Participant> participants;

    @OneToMany(mappedBy = "concert", cascade = CascadeType.ALL)
    private List<Communication> communications = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "concert_dudaryk", joinColumns = @JoinColumn(name = "CONCERT_ID"),
            inverseJoinColumns = @JoinColumn(name = "DUDARYK_ID"))
    private List<Dudaryk> dudaryks;


    public static Concert toEntity(ConcertDTO concertDTO) {
        Concert concert = new Concert()
                .setCommunications(concertDTO.getCommunications())
                .setDate(concertDTO.getDate())
                .setDudaryks(concertDTO.getDudaryks())
                .setGenre(concertDTO.getGenre())
                .setName(concertDTO.getName())
                .setParticipants(concertDTO.getParticipants())
                .setPoster(concertDTO.getPoster());
        if (concertDTO.getConcertId() != 0) {
            concert.setConcertId(concertDTO.getConcertId());
        }
        return concert;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    private Concert setParticipants(List<Participant> participants) {
        this.participants = participants;
        return this;
    }

    public List<Communication> getCommunications() {
        return communications;
    }

    private Concert setCommunications(List<Communication> communications) {
        this.communications = communications;
        return this;
    }

    public List<Dudaryk> getDudaryks() {
        return dudaryks;
    }

    private Concert setDudaryks(List<Dudaryk> dudaryks) {
        this.dudaryks = dudaryks;
        return this;
    }

    public long getConcertId() {
        return concertId;
    }

    private Concert setConcertId(long concertId) {
        this.concertId = concertId;
        return this;
    }

    public LocalDateTime getDate() {
        return date;
    }

    private Concert setDate(LocalDateTime date) {
        this.date = date;
        return this;
    }

    public String getName() {
        return name;
    }

    private Concert setName(String name) {
        this.name = name;
        return this;
    }

    public String getGenre() {
        return genre;
    }

    private Concert setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public String getPoster() {
        return poster;
    }

    private Concert setPoster(String poster) {
        this.poster = poster;
        return this;
    }

    @Override
    public String toString() {
        return "Concert{" +
                "concertId=" + concertId +
                ", date=" + date +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", poster='" + poster + '\'' +
                '}';
    }
}
