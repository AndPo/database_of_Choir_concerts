package ua.com.dudaryk.model;

import org.hibernate.validator.constraints.NotEmpty;
import ua.com.dudaryk.service.dto.CommunicationDTO;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "communication")
public class Communication implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "COMMUNICATION_ID")
    private long communicationId;

    @Column(name = "NAME")
    @NotEmpty
    private String name;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "COMMENT")
    private String comment;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "DATE_OF_MEMBERSHIP")
    private LocalDate membershipDate;

    @ManyToOne
    @JoinColumn(name = "CONCERT_ID")
    private Concert concert;


    public static Communication toEntity(CommunicationDTO communicationDTO) {
        Communication communication = new Communication()
                .setName(communicationDTO.getName())
                .setEmail(communicationDTO.getEmail())
                .setDescription(communicationDTO.getDescription())
                .setComment(communicationDTO.getComment())
                .setMembershipDate(communicationDTO.getMembershipDate())
                .setPhone(communicationDTO.getPhone())
                .setConcert(communicationDTO.getConcert());
        if (communicationDTO.getCommunicationId() != 0) {
            communication.setCommunicationId(communicationDTO.getCommunicationId());
        }
        return communication;
    }

    public Concert getConcert() {
        return concert;
    }

    private Communication setConcert(Concert concert) {
        this.concert = concert;
        return this;
    }

    public long getCommunicationId() {
        return communicationId;
    }

    private Communication setCommunicationId(long communicationId) {
        this.communicationId = communicationId;
        return this;
    }

    public String getName() {
        return name;
    }

    public Communication setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    private Communication setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    private Communication setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getComment() {
        return comment;
    }

    private Communication setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getDescription() {
        return description;
    }

    private Communication setDescription(String description) {
        this.description = description;
        return this;
    }

    public LocalDate getMembershipDate() {
        return membershipDate;
    }

    private Communication setMembershipDate(LocalDate membershipDate) {
        this.membershipDate = membershipDate;
        return this;
    }

    @Override
    public String toString() {
        return "Communication{" +
                "communicationId=" + communicationId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", comment='" + comment + '\'' +
                ", description='" + description + '\'' +
                ", membershipDate=" + membershipDate +
                '}';
    }
}
