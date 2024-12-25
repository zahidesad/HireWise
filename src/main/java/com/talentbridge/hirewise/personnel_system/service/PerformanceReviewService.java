package com.talentbridge.hirewise.personnel_system.service;

import com.talentbridge.hirewise.personnel_system.dao.PerformanceReviewDAO;
import com.talentbridge.hirewise.personnel_system.model.PerformanceReview;

import java.util.List;

/**
 *
 * @author zahid
 */
public class PerformanceReviewService {

    private PerformanceReviewDAO performanceReviewDAO = new PerformanceReviewDAO();

    public void addPerformanceReview(PerformanceReview pr) {
        if (pr.getPerformanceScore() < 1 || pr.getPerformanceScore() > 10) {
            System.out.println("Performance score must be between 1 and 10.");
            return;
        }
        performanceReviewDAO.insert(pr);
    }

    public PerformanceReview getPerformanceReviewById(int reviewId) {
        return performanceReviewDAO.findById(reviewId);
    }

    public List<PerformanceReview> getAllPerformanceReviews() {
        return performanceReviewDAO.findAll();
    }

    public void updatePerformanceReview(PerformanceReview pr) {
        performanceReviewDAO.update(pr);
    }

    public void deletePerformanceReview(int reviewId) {
        performanceReviewDAO.delete(reviewId);
    }
}
