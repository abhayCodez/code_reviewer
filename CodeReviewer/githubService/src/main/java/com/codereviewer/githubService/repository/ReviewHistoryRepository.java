package com.codereviewer.githubService.repository;

import com.codereviewer.githubService.model.ReviewHistory;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface ReviewHistoryRepository extends MongoRepository<ReviewHistory, String> {
    List<ReviewHistory> findByRepoNameOrderByCreatedAtDesc(String repoName);

    Optional<ReviewHistory> findByRepoName(String repo);
}