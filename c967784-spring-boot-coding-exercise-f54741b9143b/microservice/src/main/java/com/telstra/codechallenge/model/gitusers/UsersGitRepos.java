package com.telstra.codechallenge.model.gitusers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class UsersGitRepos {
  private int total_count;
  private boolean incompleteResults;
  private UserItems items[];
}
