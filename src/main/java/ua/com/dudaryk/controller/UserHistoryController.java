package ua.com.dudaryk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.com.dudaryk.model.UserHistory;
import ua.com.dudaryk.service.interfaces.UserHistoryService;

import java.util.List;

@RestController
@RequestMapping("userHistory/")
public class UserHistoryController {

    private UserHistoryService userHistoryService;

    @Autowired
    public UserHistoryController(UserHistoryService userHistoryService) {
        this.userHistoryService = userHistoryService;
    }

    @GetMapping(value = "all/")
    public List<UserHistory> findAll() {
        return userHistoryService.findAll();
    }

    @RequestMapping(value = "update/", method = RequestMethod.POST)
    public UserHistory update(@RequestBody UserHistory userHistory) {

        if (userHistory.getUserHistoryId() > 0)
            userHistory = userHistoryService.update(userHistory);
        return userHistory;
    }

    @RequestMapping(value = "save/", method = RequestMethod.POST)
    public UserHistory save(@RequestBody UserHistory userHistory) {

        return userHistoryService.save(userHistory);
    }

    @GetMapping(value = "delete/")
    public void delete(@PathVariable("id") Long id) {
        userHistoryService.delete(id);
    }

    @GetMapping(value = "byId/")
    public UserHistory findById(@PathVariable("id") Long id) {
        return userHistoryService.findById(id);
    }

    @GetMapping(value = "byDudaryk/")
    public List<UserHistory> findByDudarykId(@PathVariable("id") Long id) {
        return userHistoryService.findByDudarykId(id);
    }
}
