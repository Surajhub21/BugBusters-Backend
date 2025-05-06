package com.bugbusters.service.review;

import com.bugbusters.models.Review;
import com.bugbusters.repository.ReviewRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    public Review createReview(Review review){
        return reviewRepository.save(review);
    }

    public List<Review> listAllReviews(){
        return reviewRepository.findAll();
    }

    public List<Review> giveAllReviewOfAnUser(ObjectId id){
        return reviewRepository.findAllById(Collections.singleton(id));
    }

}
