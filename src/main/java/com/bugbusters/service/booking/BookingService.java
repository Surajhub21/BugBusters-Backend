package com.bugbusters.service.booking;


import com.bugbusters.models.Booking;
import com.bugbusters.repository.BookingRepository;
import com.bugbusters.service.pests.PestsServices;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    private BookingRepository bookingRepository;
    @Autowired
    private PestsServices pestsServices;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public Booking bookAService(Booking booked){

        return bookingRepository.save(booked);

    }

    public List<Booking> getBookingsByUserId(ObjectId userId){
        List<Booking> bookingByUserId = bookingRepository.findBookingByUserId(userId);
        bookingByUserId.forEach(it ->
                it.setPests(pestsServices.getPestsById(it.getPestId()))
                );
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
