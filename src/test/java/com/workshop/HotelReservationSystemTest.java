package com.workshop;

import org.junit.Assert;
import org.junit.Test;
public class HotelReservationSystemTest {
    HotelReservationSystem Obj = new HotelReservationSystem();

    @Test
    void checkAllThreeHotelsAreAdded(){
        Obj.addHotelDetails();
        Assert.assertEquals( 3, Obj.hotelList.size());
    }
}