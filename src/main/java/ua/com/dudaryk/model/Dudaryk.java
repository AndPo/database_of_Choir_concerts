package ua.com.dudaryk.model;

import ua.com.dudaryk.service.dto.DudarykDTO;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "dudaryk")
public class Dudaryk implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "DUDARYK_ID")
    private long dudarykId;

    @ManyToMany(mappedBy = "dudaryks")
    private List<Concert> concerts;

    @OneToMany(mappedBy = "dudaryk", cascade = CascadeType.ALL)
    private List<UserHistory> userHistories = new ArrayList<>();

    @OneToMany(mappedBy = "dudaryk", cascade = CascadeType.ALL)
    private List<Category> categories = new ArrayList<>();

    @Column(name = "NAME")
    private String name;

    @Column(name = "LASTNAME")
    private String lastName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "DATE_OF_BIRTHDAY")
    private LocalDate birthday;

    @Column(name = "voice")
    @Enumerated(EnumType.STRING)
    private Voice voice;

    @Column(name = "IS_ACTION")
    private boolean isAction;


    @Column(name = "PHOTO")
    private String photo;

    public static Dudaryk toEntity(DudarykDTO dudarykDTO) {
        Dudaryk dudaryk = new Dudaryk()
                .setAction(dudarykDTO.isAction())
                .setCategories(dudarykDTO.getCategories())
                .setConcerts(dudarykDTO.getConcerts())
                .setBirthday(dudarykDTO.getBirthday())
                .setDescription(dudarykDTO.getDescription())
                .setEmail(dudarykDTO.getEmail())
                .setLastName(dudarykDTO.getLastName())
                .setName(dudarykDTO.getName())
                .setPhone(dudarykDTO.getPhone())
                .setPhoto(dudarykDTO.getPhoto())
                .setUserHistories(dudarykDTO.getUserHistories())
                .setVoice(dudarykDTO.getVoice());
        if (dudarykDTO.getDudarykId() != 0) {
            dudaryk.setDudarykId(dudarykDTO.getDudarykId());
        }
        return dudaryk;
    }


    public List<UserHistory> getUserHistories() {
        return userHistories;
    }

    private Dudaryk setUserHistories(List<UserHistory> userHistories) {
        this.userHistories = userHistories;
        return this;
    }

    private Dudaryk setVoice(Voice voice) {
        this.voice = voice;
        return this;
    }

    public List<Concert> getConcerts() {
        return concerts;
    }

    private Dudaryk setConcerts(List<Concert> concerts) {
        this.concerts = concerts;
        return this;
    }

    public List<Category> getCategories() {
        return categories;
    }

    private Dudaryk setCategories(List<Category> categories) {
        this.categories = categories;
        return this;
    }

    public long getDudarykId() {
        return dudarykId;
    }

    private Dudaryk setDudarykId(long dudarykId) {
        this.dudarykId = dudarykId;
        return this;
    }

    public String getName() {
        return name;
    }

    private Dudaryk setName(String name) {
        this.name = name;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    private Dudaryk setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    private Dudaryk setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    private Dudaryk setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getDescription() {
        return description;
    }

    private Dudaryk setDescription(String description) {
        this.description = description;
        return this;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    private Dudaryk setBirthday(LocalDate dateOfBirthday) {
        this.birthday = dateOfBirthday;
        return this;
    }

    public Voice getVoice() {
        return voice;
    }

    public boolean isAction() {
        return isAction;
    }

    private Dudaryk setAction(boolean action) {
        isAction = action;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    private Dudaryk setPhoto(String photo) {
        this.photo = photo;
        return this;
    }


    @Override
    public String toString() {
        return "Dudaryk{" +
                "dudarykId=" + dudarykId +
                ", userHistories=" + userHistories +
                ", categories=" + categories +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", description='" + description + '\'' +
                ", dateOfBirthday=" + birthday +
                ", voice=" + voice +
                ", isAction=" + isAction +
                ", photo='" + photo + '\'' +
                '}';
    }
}
