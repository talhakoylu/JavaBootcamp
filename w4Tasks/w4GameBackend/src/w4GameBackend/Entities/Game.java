package w4GameBackend.Entities;

import w4GameBackend.Interfaces.Entity;

public class Game implements Entity{
	private int id;
	private String title;
	private String genre;
	private double price;
	
	public Game() {
	}


	public Game(int id, String title, String genre, double price) {
		this.id = id;
		this.title = title;
		this.genre = genre;
		this.price = price;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPriceWithTax() {
		return this.price + (this.price * 0.18);
	}
}
