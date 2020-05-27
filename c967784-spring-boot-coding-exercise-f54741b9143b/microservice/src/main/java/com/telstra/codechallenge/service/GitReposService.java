package com.telstra.codechallenge.service;

import com.telstra.codechallenge.model.gitrepo.GitRepos;
import com.telstra.codechallenge.model.gitusers.UsersGitRepos;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;

@Service
public class GitReposService {

  @Value("${git.base.url}")
  private String gitRepoBaseUrl;

  private RestTemplate restTemplate;

  public GitReposService(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  public GitRepos getHighestRepoByStarred(Integer noOfRepos) {
    StringBuilder query = new StringBuilder("/repositories?q=");
    query.append("created:>");
    LocalDate currentDate = LocalDate.now();
    LocalDate result = currentDate.minusWeeks(1);
    query.append(result);
    query.append("&order=desc&sort=stars&page=1&&per_page=");
    query.append(noOfRepos);
    return restTemplate.getForObject(gitRepoBaseUrl + query.toString(), GitRepos.class);
  }

 }
