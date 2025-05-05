package com.bugbusters.models;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class Pricing {

    @Id
    private ObjectId id;



}
