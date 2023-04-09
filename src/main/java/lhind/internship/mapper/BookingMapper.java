package lhind.internship.mapper;

import lhind.internship.model.dto.BookingDTO;
import lhind.internship.model.entity.Booking;

public class BookingMapper extends AbstractMapper<Booking, BookingDTO>{
    @Override
    public Booking toEntity(BookingDTO bookingDTO) {
        return null;
    }

    @Override
    public BookingDTO toDto(Booking booking) {
        if(booking == null){
            return null;
        }
        BookingDTO bookingDTO = new BookingDTO();
        bookingDTO.setId(booking.getId());
        bookingDTO.setBookingDate(booking.getBookingDate());
        bookingDTO.setStatus(booking.getStatus());
        return bookingDTO;
    }
}
