package com.codereviewer.aiservice.controller;

import com.codereviewer.aiservice.dto.RepoReviewRequest;
import com.codereviewer.aiservice.service.GeminiReviewService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ai/review")
public class RepoReviewController {

    private final GeminiReviewService service;

    public RepoReviewController(GeminiReviewService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<String> review(@RequestBody RepoReviewRequest request) {
        return ResponseEntity.ok(service.reviewRepo(request));
    }
}
