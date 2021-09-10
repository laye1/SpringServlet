package com.saraya.car;

public class Car {
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((mark == null) ? 0 : mark.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (mark == null) {
			if (other.mark != null)
				return false;
		} else if (!mark.equals(other.mark))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}



	

	private String name;
	private String mark;
	private String description;
	private String price;
	


	public Car(String name, String mark, String description, String price) {
	
		this.name = name;
		this.mark = mark;
		this.description = description;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}


	public String getMark() {
		return mark;
	}



	public void setMark(String mark) {
		this.mark = mark;
	}


	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}



	public String getPrice() {
		return price;
	}




	public void setPrice(String price) {
		this.price = price;
	}




	@Override
	public String toString() {
		
		return name;
	}

}
