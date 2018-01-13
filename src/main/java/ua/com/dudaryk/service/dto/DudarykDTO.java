package ua.com.dudaryk.service.dto;

import ua.com.dudaryk.model.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DudarykDTO implements Serializable {


    private long dudarykId;

    private List<Concert> concerts;

    private List<UserHistory> userHistories = new ArrayList<>();

    private List<Category> categories = new ArrayList<>();

    private String name;

    private String lastName;

    private String email;

    private String phone;

    private String description;

    private LocalDate birthday;

    private Voice voice;

    private boolean isAction;

    private String photo;

    private static DudarykDTO toDto(Dudaryk dudaryk) {
        return new DudarykDTO()
                .setDudarykId(dudaryk.getDudarykId())
                .setAction(dudaryk.isAction())
                .setCategories(dudaryk.getCategories())
                .setConcerts(dudaryk.getConcerts())
                .setBirthday(dudaryk.getBirthday())
                .setDescription(dudaryk.getDescription())
                .setEmail(dudaryk.getEmail())
                .setLastName(dudaryk.getLastName())
                .setName(dudaryk.getName())
                .setPhone(dudaryk.getPhone())
                .setPhoto(dudaryk.getPhoto())
                .setUserHistories(dudaryk.getUserHistories())
                .setVoice(dudaryk.getVoice());
    }

    public static List<DudarykDTO> toDto(List<Dudaryk> dudaryks) {
        List<DudarykDTO> dudarykDTOList = new ArrayList<>();
        for (Dudaryk dudaryk : dudaryks) {
            dudarykDTOList.add(toDto(dudaryk));
        }
        return dudarykDTOList;
    }

    public long getDudarykId() {
        return dudarykId;
    }

    private DudarykDTO setDudarykId(long dudarykId) {
        this.dudarykId = dudarykId;
        return this;
    }

    public List<Concert> getConcerts() {
        return concerts;
    }

    private DudarykDTO setConcerts(List<Concert> concerts) {
        this.concerts = concerts;
        return this;
    }

    public List<UserHistory> getUserHistories() {
        return userHistories;
    }

    private DudarykDTO setUserHistories(List<UserHistory> userHistories) {
        this.userHistories = userHistories;
        return this;
    }

    public List<Category> getCategories() {
        return categories;
    }

    private DudarykDTO setCategories(List<Category> categories) {
        this.categories = categories;
        return this;
    }

    public String getName() {
        return name;
    }

    private DudarykDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    private DudarykDTO setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    private DudarykDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    private DudarykDTO setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getDescription() {
        return description;
    }

    private DudarykDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    private DudarykDTO setBirthday(LocalDate birthday) {
        this.birthday = birthday;
        return this;
    }

    public Voice getVoice() {
        return voice;
    }

    private DudarykDTO setVoice(Voice voice) {
        this.voice = voice;
        return this;
    }

    public boolean isAction() {
        return isAction;
    }

    private DudarykDTO setAction(boolean action) {
        isAction = action;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    private DudarykDTO setPhoto(String photo) {
        this.photo = photo;
        return this;
    }
}
