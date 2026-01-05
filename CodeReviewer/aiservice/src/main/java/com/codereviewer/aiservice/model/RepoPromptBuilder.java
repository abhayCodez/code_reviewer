package com.codereviewer.aiservice.model;

import com.codereviewer.aiservice.dto.RepoReviewRequest;
import org.springframework.stereotype.Component;

@Component
public class RepoPromptBuilder {

    public String buildPrompt(RepoReviewRequest req) {
        StringBuilder sb = new StringBuilder();

        sb.append("""
        You are a senior backend engineer.
        Review the following GitHub repository code.

        Tasks:
        - Identify design issues
        - Suggest improvements
        - Highlight security concerns
        - Rate code quality (1-10)

        Repository: %s
        Context: %s

        Files:
        """.formatted(req.getRepositoryName(), req.getContext()));

        req.getFiles().forEach(file -> {
            sb.append("""
            ---
            File: %s
            Language: %s
            Code:
            %s
            """.formatted(file.getPath(), file.getLanguage(), file.getContent()));
        });

        return sb.toString();
    }
}
