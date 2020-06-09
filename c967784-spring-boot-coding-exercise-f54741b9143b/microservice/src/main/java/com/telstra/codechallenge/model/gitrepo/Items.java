package com.telstra.codechallenge.model.gitrepo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Items {
    private String name;
    private String description;
    private String language;
    private String watchersCount;
    private String htmlUrl;
}
