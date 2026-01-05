package com.codereviewer.aiservice.service;

import com.codereviewer.aiservice.dto.RepoReviewRequest;
import com.codereviewer.aiservice.model.RepoPromptBuilder;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class GeminiReviewService {

    private final ChatClient chatClient;
    private final RepoPromptBuilder promptBuilder;

    public GeminiReviewService(ChatClient.Builder builder,
                               RepoPromptBuilder promptBuilder) {
        this.chatClient = builder.build();
        this.promptBuilder = promptBuilder;
    }

    public String reviewRepo(RepoReviewRequest request) {
        String prompt = promptBuilder.buildPrompt(request);

        return chatClient.prompt()
                .user(prompt)
                .call()
                .content();
    }
}
