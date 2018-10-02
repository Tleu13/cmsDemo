package com.tleu.cms.domain.models;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class News {
    private String id;

    private String title;

    private String content;

    private User author;

    private Set<User> mandatoryReviewers = new HashSet<>();

    private Set<Review> reviewers = new HashSet<>();

    private Set<Category> categories = new HashSet<>();

    private Set<Tag> tags = new HashSet<>();

    public Boolean revised() {
        return this.mandatoryReviewers.stream().allMatch(reviewer -> this.reviewers.stream()
                .anyMatch(review -> reviewer.getId().equals(review.getUserId()) && "approved".equals(review.getStatus())));
    }

    public Review review(String userId, String status) {
        final Review review = new Review(userId, status);
        this.reviewers.add(review);
        return review;
    }

}
