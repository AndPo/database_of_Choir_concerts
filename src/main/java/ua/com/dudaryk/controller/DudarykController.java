package ua.com.dudaryk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.com.dudaryk.model.Dudaryk;
import ua.com.dudaryk.model.Voice;
import ua.com.dudaryk.service.interfaces.DudarykService;

import java.util.List;

@RestController
@RequestMapping("singer/")
public class DudarykController {

    private DudarykService dudarykService;

    @Autowired
    public DudarykController(DudarykService dudarykService) {
        this.dudarykService = dudarykService;
    }

    @GetMapping(value = "all/")
    public List<Dudaryk> findAll() {
        return dudarykService.findAll();
    }

    @RequestMapping(value = "update/", method = RequestMethod.POST)
    public Dudaryk update(@RequestBody Dudaryk dudaryk) {

        if (dudaryk.getDudarykId() > 0)
            dudaryk = dudarykService.update(dudaryk);
        return dudaryk;
    }

    @RequestMapping(value = "save/", method = RequestMethod.POST)
    public Dudaryk save(@RequestBody Dudaryk dudaryk) {

        return dudarykService.save(dudaryk);
    }

    @GetMapping(value = "delete/")
    public void delete(@PathVariable("id") Long id) {
        dudarykService.delete(id);
    }

    @GetMapping(value = "byId/")
    public Dudaryk findById(@PathVariable("id") Long id) {
        return dudarykService.findById(id);
    }

    @GetMapping(value = "byName/")
    public List<Dudaryk> findByName(@PathVariable("name") String name) {
        return dudarykService.findByName(name);
    }

    @GetMapping(value = "byLastName/")
    public List<Dudaryk> findByLastName(@PathVariable("lastName") String lastName) {
        return dudarykService.findByLastName(lastName);
    }

    @GetMapping(value = "byVoice/")
    public List<Dudaryk> findByVoice(@PathVariable("voice") Voice voice) {
        return dudarykService.findByVoice(voice);
    }

    @GetMapping(value = "action/")
    public List<Dudaryk> findAction() {
        return dudarykService.findAction();
    }

    @GetMapping(value = "byConcert/")
    public List<Dudaryk> findByConcert(@PathVariable("id") Long id) {
        return dudarykService.findByConcert(id);
    }

}
