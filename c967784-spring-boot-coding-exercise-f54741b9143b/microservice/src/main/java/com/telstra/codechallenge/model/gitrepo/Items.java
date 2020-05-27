package com.telstra.codechallenge.model.gitrepo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Items {
    private String name;
    private String description;
    private String language;
    private String watchers_count;
    private String html_url;
}
