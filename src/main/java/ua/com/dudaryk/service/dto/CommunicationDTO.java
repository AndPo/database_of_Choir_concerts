package ua.com.dudaryk.service.dto;

import ua.com.dudaryk.model.Communication;
import ua.com.dudaryk.model.Concert;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CommunicationDTO implements Serializable {

    private long communicationId;

    private String name;

    private String email;

    private String phone;

    private String comment;

    private String description;

    private LocalDate membershipDate;

    private Concert concert;

    private static CommunicationDTO toDto(Communication communication) {
        return new CommunicationDTO()
                .setCommunicationId(communication.getCommunicationId())
                .setName(communication.getName())
                .setEmail(communication.getEmail())
                .setDescription(communication.getDescription())
                .setComment(communication.getComment())
                .setMembershipDate(communication.getMembershipDate())
                .setPhone(communication.getPhone())
                .setConcert(communication.getConcert());
    }

    public static List<CommunicationDTO> toDto(List<Communication> communications) {
        List<CommunicationDTO> communicationDTOList = new ArrayList<>();
        for (Communication communication : communications) {
            communicationDTOList.add(toDto(communication));
        }
        return communicationDTOList;
    }

    public long getCommunicationId() {
        return communicationId;
    }

    private CommunicationDTO setCommunicationId(long communicationId) {
        this.communicationId = communicationId;
        return this;
    }

    public String getName() {
        return name;
    }

    public CommunicationDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    private CommunicationDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    private CommunicationDTO setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getComment() {
        return comment;
    }

    private CommunicationDTO setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getDescription() {
        return description;
    }

    private CommunicationDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public LocalDate getMembershipDate() {
        return membershipDate;
    }

    private CommunicationDTO setMembershipDate(LocalDate membershipDate) {
        this.membershipDate = membershipDate;
        return this;
    }

    public Concert getConcert() {
        return concert;
    }

    private CommunicationDTO setConcert(Concert concert) {
        this.concert = concert;
        return this;
    }
}
