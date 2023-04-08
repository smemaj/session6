package lhind.internship.model.dto;

import lhind.internship.model.enums.BookingStatus;

import java.util.Date;

public class BookingDTO {

    private Integer id;
    private Date bookingDate;
    private BookingStatus status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }
}
