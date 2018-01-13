package ua.com.dudaryk.service.dto;

import ua.com.dudaryk.model.Dudaryk;
import ua.com.dudaryk.model.UserHistory;
import ua.com.dudaryk.model.WorkingStatus;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UserHistoryDTO implements Serializable {

    private long userHistoryId;

    private Dudaryk dudaryk;

    private LocalDateTime date;

    private String comment;

    private String description;

    private WorkingStatus action;

    private static UserHistoryDTO toDto(UserHistory userHistory) {
        return new UserHistoryDTO()
                .setUserHistoryId(userHistory.getUserHistoryId())
                .setAction(userHistory.getAction())
                .setComment(userHistory.getComment())
                .setDate(userHistory.getDate())
                .setDescription(userHistory.getDescription())
                .setDudaryk(userHistory.getDudaryk());
    }

    public static List<UserHistoryDTO> toDto(List<UserHistory> userHistories) {
        List<UserHistoryDTO> userHistoryDTOList = new ArrayList<>();
        for (UserHistory userHistory : userHistories) {
            userHistoryDTOList.add(toDto(userHistory));
        }
        return userHistoryDTOList;
    }

    public Dudaryk getDudaryk() {
        return dudaryk;
    }

    private UserHistoryDTO setDudaryk(Dudaryk dudaryk) {
        this.dudaryk = dudaryk;
        return this;
    }

    public LocalDateTime getDate() {
        return date;
    }

    private UserHistoryDTO setDate(LocalDateTime date) {
        this.date = date;
        return this;
    }

    public String getComment() {
        return comment;
    }

    private UserHistoryDTO setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getDescription() {
        return description;
    }

    private UserHistoryDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public WorkingStatus getAction() {
        return action;
    }

    private UserHistoryDTO setAction(WorkingStatus action) {
        this.action = action;
        return this;
    }

    public long getUserHistoryId() {
        return userHistoryId;
    }

    private UserHistoryDTO setUserHistoryId(long userHistoryId) {
        this.userHistoryId = userHistoryId;
        return this;
    }
}
