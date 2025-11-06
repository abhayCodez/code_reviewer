package com.codereviewer.githubService.controller;

import com.codereviewer.githubService.dto.RepoRequest;
import com.codereviewer.githubService.model.RepoData;
import com.codereviewer.githubService.service.GithubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/github")
public class GithubController {

    @Autowired
    private GithubService gitHubService;

    @GetMapping("/repo")
    public RepoData getRepoData(@RequestBody RepoRequest request) {
        return gitHubService.fetchRepoFiles(request.getUserId(), request.getOwner(), request.getRepo());
    }
}