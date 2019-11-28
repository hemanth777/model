package com.sapient.model;

public class SeatRequest {

	private String seatRequestId;
	
	private String movieId;
	
	private String theatreId;

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(String theatreId) {
		this.theatreId = theatreId;
	}

	public String getSeatRequestId() {
		return seatRequestId;
	}

	public void setSeatRequestId(String seatRequestId) {
		this.seatRequestId = seatRequestId;
	}
	
	
}

