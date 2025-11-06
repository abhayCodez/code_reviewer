package com.codereviewer.githubService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RepoRequest {
    String owner;
    String repo;
    String userId;
}