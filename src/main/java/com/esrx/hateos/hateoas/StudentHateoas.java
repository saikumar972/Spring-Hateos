package com.esrx.hateos.hateoas;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.hateoas.Link;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentHateoas {
//    public List<Link> links=new ArrayList<>();
//
//    public void addLink(Link link){
//        links.add(link);
//    }
@JsonProperty("_links")
private Map<String, Link> links = new HashMap<>();

    public void addLink(Link link) {
        links.put(link.getRel().value(), link);
    }

    public Map<String, Link> getLinks() {
        return links;
    }
}
