package com.thoughtworks.capability.gtb.entrancequiz.api;

import com.thoughtworks.capability.gtb.entrancequiz.domain.People;
import com.thoughtworks.capability.gtb.entrancequiz.service.PeopleListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PeopleListApi {
    @Autowired
    private PeopleListService peopleListService;

    @GetMapping("/peoples")
    public ResponseEntity<List<People>> getPeopleList() {
        return ResponseEntity.ok(peopleListService.getPeopleList());
    }

}
