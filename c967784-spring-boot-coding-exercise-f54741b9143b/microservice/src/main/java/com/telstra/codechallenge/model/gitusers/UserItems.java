package com.telstra.codechallenge.model.gitusers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class UserItems {
    private String id;
    private String login;
    private String htmlUrl;
}
