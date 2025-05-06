package com.bugbusters.controller;

import com.bugbusters.models.Review;
import com.bugbusters.service.review.ReviewService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/review")
@CrossOrigin(origins = "*")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public Review createReview(@RequestBody Review review){
        try {
            return reviewService.createReview(review);
        }
        catch (Exception e)
        {
            return null;
        }
    }

    @GetMapping
    public List<Review> reviewList(){
        return reviewService.listAllReviews();
    }
}
