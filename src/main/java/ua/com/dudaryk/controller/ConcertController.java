package ua.com.dudaryk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ua.com.dudaryk.model.Concert;
import ua.com.dudaryk.service.interfaces.ConcertService;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("concert/")
public class ConcertController {

    private ConcertService concertService;

    @Autowired
    public ConcertController(ConcertService concertService) {
        this.concertService = concertService;
    }

    @GetMapping(value = "all/")
    public List<Concert> findAll() {
        return concertService.findAll();
    }

    @RequestMapping(value = "update/", method = RequestMethod.POST)
    public Concert update(@RequestBody Concert concert) {

        if (concert.getConcertId() > 0)
            concert = concertService.update(concert);
        return concert;
    }

    @RequestMapping(value = "save/", method = RequestMethod.POST)
    public Concert save(@RequestBody Concert concert) {

        return concertService.save(concert);
    }

    @GetMapping(value = "delete/")
    public void delete(@PathVariable("id") Long id) {
        concertService.delete(id);
    }

    @GetMapping(value = "byId/")
    public Concert findById(@PathVariable("id") Long id) {
        return concertService.findById(id);
    }

    @GetMapping(value = "byParticipantId/")
    public List<Concert> findByParticipant(@PathVariable("id") Long id) {
        return concertService.findByParticipant(id);
    }

    @GetMapping(value = "byDate/")
    public List<Concert> findByDate(@PathVariable("date") LocalDateTime date) {
        return concertService.findByDate(date);
    }

    @GetMapping(value = "byName/")
    public List<Concert> findByName(@PathVariable("name") String name) {
        return concertService.findByName(name);
    }

//    @RequestMapping(value = "concert/",method = RequestMethod.GET)
//    public  String displayConcertPage(Model model){
//        Concert concert = new Concert();
//
//        model.addAttribute("concert",concert);
//        return "concert";
//    }
//
//    @RequestMapping(value="concert/", method = RequestMethod.POST)
//    public String processConcert(@ModelAttribute("concert") Concert concert) {
//        System.out.println(concert);
//
//        return "redirect:index.html";
//    }


}
