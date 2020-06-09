package com.telstra.codechallenge.model.gitusers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class UsersGitRepos {
  private UserItems items[];
}

