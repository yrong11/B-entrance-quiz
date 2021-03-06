package com.thoughtworks.capability.gtb.entrancequiz.api;

import com.thoughtworks.capability.gtb.entrancequiz.domain.People;
import com.thoughtworks.capability.gtb.entrancequiz.service.PeopleListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class PeopleListApi {
    @Autowired
    private PeopleListService peopleListService;

    @CrossOrigin
    @GetMapping("/peoples")
    public ResponseEntity<List<People>> getPeopleList() {
        return ResponseEntity.ok(peopleListService.getPeopleList());
    }

    @CrossOrigin
    @PostMapping(path = "/people")
    public ResponseEntity addPeople(@RequestBody String name) {
        peopleListService.addPeople(name);
        return ResponseEntity.ok().build();
    }

    @CrossOrigin
    @GetMapping("/group")
    public ResponseEntity getPeopleGroups() {
        Map<String, List<People>> groupsPeople = peopleListService.getPeopleGroups();
        return ResponseEntity.ok(groupsPeople);
    }

    @CrossOrigin
    @PostMapping("/group/modify")
    public ResponseEntity modifyGroupName(@RequestBody String groupName) {
        return ResponseEntity.ok(peopleListService.modifyGroupName(groupName));
    }

}
