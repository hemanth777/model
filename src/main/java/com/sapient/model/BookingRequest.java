package com.sapient.model;

import java.util.ArrayList;
import java.util.List;

public class BookingRequest {

	private String bookingRequestId;
	
	private String movieId;
	
	private String theaterId;
	
	private List<Seat> seats = new ArrayList<Seat>();

	public String getBookingRequestId() {
		return bookingRequestId;
	}

	public void setBookingRequestId(String bookingRequestId) {
		this.bookingRequestId = bookingRequestId;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getTheaterId() {
		return theaterId;
	}

	public void setTheaterId(String theaterId) {
		this.theaterId = theaterId;
	}

	public List<Seat> getSeats() {
		return seats;
	}

	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}
	
	
	
}
