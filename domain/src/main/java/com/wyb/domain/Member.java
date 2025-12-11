package com.wyb.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 30142
 */
@Data
public class Member {
    private Long id;
    private String name;
    private List<Object> domainEvents =new ArrayList<>();
    public void  creat(){

    }
    private void addEvent(Object event){
        domainEvents.add(event);

    }
    public  List<Object> pullDomainEvents(){
        List<Object> events=new ArrayList<>(domainEvents);
        domainEvents.clear();
        return events;
    }

}
