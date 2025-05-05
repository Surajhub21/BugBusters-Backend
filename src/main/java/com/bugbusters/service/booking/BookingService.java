package com.bugbusters.service.booking;


import com.bugbusters.models.Booking;
import com.bugbusters.repository.BookingRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    private BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public Booking bookAService(Booking booked){

        return bookingRepository.save(booked);

    }

    public List<Booking> getBookingsByUserId(ObjectId userId){
        List<Booking> bookingByUserId = bookingRepository.findBookingByUserId(userId);
        return bookingByUserId;
    }

    public List<Booking> getAllBooking(){
        List<Booking> bookingList = bookingRepository.findAll();
        return bookingList;
    }

    public void deleteById(ObjectId id){
        bookingRepository.deleteById(id);
    }
}
