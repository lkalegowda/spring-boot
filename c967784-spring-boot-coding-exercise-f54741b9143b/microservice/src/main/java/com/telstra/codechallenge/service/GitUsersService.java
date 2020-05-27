package com.telstra.codechallenge.service;

import com.telstra.codechallenge.model.gitusers.UsersGitRepos;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GitUsersService {

  @Value("${git.base.url}")
  private String gitBaseUrl;

  private RestTemplate restTemplate;

  public GitUsersService(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  public UsersGitRepos getUsersWithZeroFollowers(Integer numberOfAccounts) {
    StringBuilder query = new StringBuilder("/users?q=");
    query.append("followers:0");
    query.append("&order=asc&sort=joined&page=1&&per_page=");
    query.append(numberOfAccounts);
    return  restTemplate.getForObject(gitBaseUrl + query.toString(), UsersGitRepos.class);
  }
 }
