package com.esrx.hateos.hateoas;

import org.springframework.hateoas.Link;

import java.util.ArrayList;
import java.util.List;

public class StudentHateoas {
    public List<Link> links=new ArrayList<>();

    public void addLink(Link link){
        links.add(link);
    }
}
