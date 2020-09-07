package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.domain.People;
import com.thoughtworks.capability.gtb.entrancequiz.domain.PeopleList;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleListService {
    private static PeopleList peopleList = new PeopleList();

    public List<People> getPeopleList() {
        return this.peopleList.peopleList;
    }

    public void addPeople(String name) {
        peopleList.addPeople(name);
    }
}
