package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.domain.People;
import com.thoughtworks.capability.gtb.entrancequiz.domain.PeopleList;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PeopleListService {
    private static PeopleList peopleList = new PeopleList();

    public List<People> getPeopleList() {
        return this.peopleList.peopleList;
    }

    public void addPeople(String name) {
        peopleList.addPeople(name);
    }

    public Map<String, List<People>> getPeopleGroups() {
        return peopleList.randomGroup();
    }

    public void modifyGroupName(String groupName) {
        String[] names = groupName.split(",");
        String newName = names[0];
        String oldName = names[1];
        if (peopleList.getGroupPeople().containsKey(newName))
            return;
        List<People> peoples = peopleList.getGroupPeople().get(oldName);
        peopleList.getGroupPeople().remove(oldName);
        peopleList.getGroupPeople().put(newName, peoples);

    }
}
