package com.thoughtworks.capability.gtb.entrancequiz.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
public class PeopleList {
    public List<People> peopleList = new ArrayList<>();

    int len = 0;
    Map<String, List<People>> groupPeople = new HashMap<>();

    public PeopleList() {
        intiData();
    }

    public void intiData(){
        String[] peopleNames = {"沈乐棋", "徐慧慧", "陈思聪", "王江林", "王登宇", "杨思雨", "江雨舟", "廖淼",
                "胡晓", "但杰", "盖迈达", "肖美琦", "黄云洁", "齐瑾浩", "刘亮亮", "肖逸凡", "王作文", "郭瑞凌",
                "李明豪", "党泽", "肖伊佐", "贠晨曦", "李康宁", "马庆", "商婕", "余榕", "谌哲", "董翔锐", "陈泰宇",
                "赵允齐", "张柯", "廖文强", "刘轲", "廖浚斌", "凌凤仪"};
        this.len = peopleNames.length;
        for(int i = 0; i < len; i++){
            People people = new People(i+1, peopleNames[i]);
            peopleList.add(people);
        }
    }

    public void addPeople(String name) {
        People people = new People(++len, name);
        if (!peopleList.contains(people)){
            peopleList.add(people);
        }
    }



}
