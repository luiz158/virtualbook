package com.blacktierental.virtualbook.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_event_item")
public class EventItem {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne(fetch=FetchType.EAGER, optional=true )
	@JoinColumn(name="event_id",referencedColumnName="id")
	private Event event;
	
	@ManyToOne(fetch=FetchType.EAGER, optional=true)
	@JoinColumn(name="item_id")
	private Item item;
	
	@Column(name="quantity")
	private Integer quantity;
	
	@Column(name="price")
	private Double pricePerUnit;
	
	@Column(name="comment")
	private String comment;

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(Double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public int hashCode(){
		final int prime = 38;
		int result = 1;
		result = prime * result + ((event==null)?0:event.hashCode());
		result = prime * result + ((item==null)?0: item.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(this== obj)
			return true;
		if(obj==null)
			return false;
		if(!(obj instanceof Item))
			return false;
		return true;
	}
	
	@Override
	public String toString(){
		String result = "EventItem";
		result += "[Event="+event!=null?event.getId():0;
		result += ",Item="+item!=null?item.getId():0;
		result += ",Quantity="+quantity;
		result += ",Price per unit="+pricePerUnit;
		result += "]";
		return result;
	}
}