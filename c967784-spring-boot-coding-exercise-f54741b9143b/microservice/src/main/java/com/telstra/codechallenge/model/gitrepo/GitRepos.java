package com.telstra.codechallenge.model.gitrepo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class GitRepos {
  private int total_count;
  private boolean incompleteResults;
  @Getter @Setter
  private Items items[];
}
