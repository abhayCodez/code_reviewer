package com.codereviewer.aiservice.dto;

@Data
public class RepoReviewRequest {
    private String repositoryName;
    private String context;
    private List<RepoFile> files;
}