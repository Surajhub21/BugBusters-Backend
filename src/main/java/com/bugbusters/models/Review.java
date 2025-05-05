package com.bugbusters.models;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;

import java.time.Instant;

@Data
public class Review {

    @Id
    private ObjectId id;

    private String comment;
    @CreatedDate
    private Instant createdTime;
    private ObjectId user_id;
}
