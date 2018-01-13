package ua.com.dudaryk.service.dto;

import ua.com.dudaryk.model.Concert;
import ua.com.dudaryk.model.Participant;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ParticipantDTO implements Serializable {

    private long participantId;

    private List<Concert> concerts = new ArrayList<>();

    private String name;

    private String email;

    private String phone;

    private String comment;

    private String description;

    private static ParticipantDTO toDto(Participant participant) {
        return new ParticipantDTO()
                .setParticipantId(participant.getParticipantId())
                .setComment(participant.getComment())
                .setConcerts(participant.getConcerts())
                .setDescription(participant.getDescription())
                .setEmail(participant.getEmail())
                .setName(participant.getName())
                .setPhone(participant.getPhone());
    }

    public static List<ParticipantDTO> toDto(List<Participant> participants) {
        List<ParticipantDTO> participantDTOList = new ArrayList<>();
        for (Participant participant : participants) {
            participantDTOList.add(toDto(participant));
        }
        return participantDTOList;
    }

    public long getParticipantId() {
        return participantId;
    }

    private ParticipantDTO setParticipantId(long participantId) {
        this.participantId = participantId;
        return this;
    }

    public List<Concert> getConcerts() {
        return concerts;
    }

    private ParticipantDTO setConcerts(List<Concert> concerts) {
        this.concerts = concerts;
        return this;
    }

    public String getName() {
        return name;
    }

    private ParticipantDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    private ParticipantDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    private ParticipantDTO setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getComment() {
        return comment;
    }

    private ParticipantDTO setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getDescription() {
        return description;
    }

    private ParticipantDTO setDescription(String description) {
        this.description = description;
        return this;
    }
}
