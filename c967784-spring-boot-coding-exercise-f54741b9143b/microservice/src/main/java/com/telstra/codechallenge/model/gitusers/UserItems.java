package com.telstra.codechallenge.model.gitusers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class UserItems {
    private String id;
    private String login;
    private String html_url;
}
