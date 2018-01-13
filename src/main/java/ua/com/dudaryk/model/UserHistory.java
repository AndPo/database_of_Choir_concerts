package ua.com.dudaryk.model;

import ua.com.dudaryk.service.dto.UserHistoryDTO;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_history")
public class UserHistory implements Serializable {


    @Id
    @GeneratedValue
    @Column(name = "USER_HISTORY-ID")
    private long userHistoryId;

    @ManyToOne
    @JoinColumn(name = "DUDARYK_ID")
    private Dudaryk dudaryk;

    @Column(name = "DATE")
    private LocalDateTime date;

    @Column(name = "COMMENT")
    private String comment;

    @Column(name = "DESCRIPTION")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "WorkingStatus")
    private WorkingStatus action;

    public static UserHistory toEntity(UserHistoryDTO userHistoryDTO) {
        UserHistory userHistory = new UserHistory()
                .setDudaryk(userHistoryDTO.getDudaryk())
                .setDate(userHistoryDTO.getDate())
                .setComment(userHistoryDTO.getComment())
                .setDescription(userHistoryDTO.getDescription())
                .setAction(userHistoryDTO.getAction());
        if (userHistoryDTO.getUserHistoryId() != 0) {
            userHistory.setUserHistoryId(userHistoryDTO.getUserHistoryId());
        }
        return userHistory;
    }

    public Dudaryk getDudaryk() {
        return dudaryk;
    }

    private UserHistory setDudaryk(Dudaryk dudaryk) {
        this.dudaryk = dudaryk;
        return this;
    }

    public long getUserHistoryId() {
        return userHistoryId;
    }

    private UserHistory setUserHistoryId(long userHistoryId) {
        this.userHistoryId = userHistoryId;
        return this;
    }

    public LocalDateTime getDate() {
        return date;
    }

    private UserHistory setDate(LocalDateTime date) {
        this.date = date;
        return this;
    }

    public String getComment() {
        return comment;
    }

    private UserHistory setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getDescription() {
        return description;
    }

    private UserHistory setDescription(String description) {
        this.description = description;
        return this;
    }

    public WorkingStatus getAction() {
        return action;
    }

    private UserHistory setAction(WorkingStatus action) {
        this.action = action;
        return this;
    }

    @Override
    public String toString() {
        return "UserHistory{" +
                "userHistoryId=" + userHistoryId +
                ", date=" + date +
                ", comment='" + comment + '\'' +
                ", description='" + description + '\'' +
                ", action=" + action +
                '}';
    }

}
