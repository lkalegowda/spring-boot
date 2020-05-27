package com.telstra.codechallenge.controller;

import com.telstra.codechallenge.model.gitusers.UsersGitRepos;
import com.telstra.codechallenge.service.GitUsersService;
import org.springframework.web.bind.annotation.*;

@RestController
public class GitUsersController {

  private GitUsersService gitUsersService;

  public GitUsersController(
          GitUsersService gitUsersService) {
    this.gitUsersService = gitUsersService;
  }

  @RequestMapping(path = "/git-user/with-zero-follower", method = RequestMethod.GET)
  public UsersGitRepos getUsersWithZeroFollowers(@RequestParam(name = "numberOfAccounts", defaultValue = "5") Integer numberOfAccounts) {
   return gitUsersService.getUsersWithZeroFollowers(numberOfAccounts);
  }
}
