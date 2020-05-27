package com.telstra.codechallenge.controller;

import com.telstra.codechallenge.service.GitReposService;
import com.telstra.codechallenge.model.gitrepo.GitRepos;
import org.springframework.web.bind.annotation.*;

@RestController
public class GitReposController {

  private GitReposService gitReposService;

  public GitReposController(
          GitReposService gitReposService) {
    this.gitReposService = gitReposService;
  }

  @RequestMapping(path = "/git-repo/highest-starred", method = RequestMethod.GET)
  public GitRepos getHighestRepoByStarred(@RequestParam(name = "numberOfRepo", defaultValue = "5") Integer noOfRepos) {
    return gitReposService.getHighestRepoByStarred(noOfRepos);
  }

}
