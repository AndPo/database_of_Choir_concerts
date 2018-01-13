package ua.com.dudaryk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.com.dudaryk.model.Participant;
import ua.com.dudaryk.service.interfaces.ParticipantService;

import java.util.List;

@RestController
@RequestMapping("participant/")
public class ParticipantController {

    private ParticipantService participantService;

    @Autowired
    public ParticipantController(ParticipantService participantService) {
        this.participantService = participantService;
    }

    @RequestMapping(value = "save/", method = RequestMethod.POST)
    public Participant save(@RequestBody Participant participant) {

        return participantService.save(participant);
    }

    @GetMapping(value = "delete/")
    public void delete(@PathVariable("id") Long id) {
        participantService.delete(id);
    }

    @GetMapping(value = "byId/")
    public Participant findById(@PathVariable("id") Long id) {
        return participantService.findById(id);
    }

    @GetMapping(value = "byName/")
    public List<Participant> findByName(@PathVariable("name") String name) {
        return participantService.findByName(name);
    }
}
