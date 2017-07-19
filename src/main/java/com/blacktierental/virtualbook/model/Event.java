package com.blacktierental.virtualbook.model;

import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.*;
import java.time.format.DateTimeFormatter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="tbl_event")
public class Event {

	public Event() {
		contactPersonEmail = "";
		contactPersonName = "";
		contactPersonPhoneNumber = "";
		contact_date = LocalDate.now();
		dateAndHour= LocalDateTime.now();
		dropOffTime= LocalDateTime.now();
		pickUpTime= LocalDateTime.now();
		items = new ArrayList<EventItem>();
		items.add(new EventItem());
		contactSameAsClient = 1;
	}
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@OneToMany(fetch=FetchType.EAGER, cascade = {CascadeType.ALL})
	@JoinColumn(name="event_id",referencedColumnName="id")
	private List<EventItem> items;
	
	public List<EventItem> getItems() {
		return items;
	}

	public void setItems(List<EventItem> items) {
		this.items = items;
	}

	@ManyToOne
	@JoinColumn(name="client_id")
	private Client client;

	/**
	 * values: [0: false | 1:true]
	 */
	@Column(name="client_same_as_client")
	private int contactSameAsClient;
	
	@Column(name="contact_person_name")
	private String contactPersonName;
	
	@Column(name="contact_person_number")
	private String contactPersonPhoneNumber;
	
	@Column(name="contact_person_email")
	private String contactPersonEmail;
	
	@ManyToOne
	@JoinColumn(name="location_id")
	private Location location;

	@NotNull
	@Column(name="taxPercentage")
	private Double taxPercentage;
	
	@NotNull
	@Column(name="delivery")
	private Double delivery;
	
	@NotNull
	@Column(name="forward_payment")
	private Double advance;
	
	@Column(name="comments")
	private String Comments;
	
	
	@Column(name="event_date")
	//@MyLocalDateTime
	private LocalDateTime dateAndHour;
	
	@Column(name="contact_date")
	//@MyLocalDateTime
	private LocalDate contact_date;
	
	@Column(name="drop_off_time")
	//@MyLocalDateTime
	private LocalDateTime dropOffTime;
	
	@Column(name="pick_up_time")
	//@MyLocalDateTime
	private LocalDateTime pickUpTime;
	
	@NotEmpty
	@Column(name="event_name")
	private String eventName;
	
	@NotEmpty
	@Column(name="state",nullable=false)
	private String state = State.ACTIVE.getState();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getContactPersonName() {
		return contactPersonName==null?" ":contactPersonName;
	}

	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}

	public String getContactPersonPhoneNumber() {
		return contactPersonPhoneNumber==null?" ":contactPersonPhoneNumber;
	}

	public void setContactPersonPhoneNumber(String contactPersonPhoneNumber) {
		this.contactPersonPhoneNumber = contactPersonPhoneNumber;
	}

	public String getContactPersonEmail() {
		return contactPersonEmail==null?" ":contactPersonEmail;
	}

	public void setContactPersonEmail(String contactPersonEmail) {
		this.contactPersonEmail = contactPersonEmail;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Double getTaxPercentage() {
		return taxPercentage;
	}

	public void setTaxPercentage(Double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}

	public Double getDelivery() {
		return delivery;
	}

	public void setDelivery(Double delivery) {
		this.delivery = delivery;
	}

	public Double getAdvance() {
		return advance;
	}

	public void setAdvance(Double advance) {
		this.advance = advance;
	}

	public String getComments() {
		return Comments;
	}

	public LocalDate getContact_date() {
		return contact_date;
	}

	public void setContact_date(LocalDate contact_date) {
		this.contact_date = contact_date;
	}

	public void setComments(String comments) {
		Comments = comments;
	}

	public LocalDateTime getDateAndHour() {
		return dateAndHour;
	}

	public void setDateAndHour(LocalDateTime dateAndHour) {
		this.dateAndHour = dateAndHour;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public LocalDateTime getDropOffTime() {
		return dropOffTime;
	}

	public void setDropOffTime(LocalDateTime dropOffTime) {
		this.dropOffTime = dropOffTime;
	}

	public LocalDateTime getPickUpTime() {
		return pickUpTime;
	}

	public void setPickUpTime(LocalDateTime pickUpTime) {
		this.pickUpTime = pickUpTime;
	}

	public int getContactSameAsClient() {
		return contactSameAsClient;
	}

	public void setContactSameAsClient(int contactSameAsClient) {
		this.contactSameAsClient = contactSameAsClient;
	}

	@Override
	public int hashCode(){
		final int prime = 38;
		int result = 1;
		result = prime * result + ((id==null)?0:id.hashCode());
		result = prime * result + ((client==null)?0: client.getName().hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(this== obj)
			return true;
		if(obj==null)
			return false;
		if(!(obj instanceof Event))
			return false;
		Event other = (Event) obj;
		if( id == null){
			if(other.id!= null)
				return false;
		}else if(!id.equals(other.id))
			return false;
		return true;
	}
	
	@Override
	public String toString(){
		return "Event [id="+id+",Client="+client!=null?client.getCompanyName():null+",Location="+location!=null?location.getBuildingName():null
				+",Date="+dateAndHour+",Balance='N/A']";
	}
	
	public boolean isPaid(){
		if(advance >= getTotal()){
			return true;
		}else{
			return false;
		}
	}
	
	public Double getTaxes(){
		Double subTotal = getSubTotal();
		if(taxPercentage>0){
			DecimalFormatSymbols decimalSymbols = DecimalFormatSymbols.getInstance();
	        decimalSymbols.setDecimalSeparator('.');
	        DecimalFormat df = new DecimalFormat("#.##",decimalSymbols);
			return Double.valueOf(df.format(subTotal * (taxPercentage/100)));
		}else{
			return 0.0d;
		}
	}
	
	public Double getSubTotal(){
		Double subTotal= 0.0;
		if(items!=null && !items.isEmpty()){
			for(EventItem eventItem: items){
				subTotal += eventItem.getPricePerUnit() * eventItem.getQuantity();
			}
		}
		subTotal += delivery;
		return subTotal;
	}
	
	public Double getTotal(){
		Double total = getSubTotal();
		total += getTaxes();
		return total;
	}
	
	public String getFormatedDateAndHour(){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        if(dateAndHour!=null){
        	String formatDateTime = dateAndHour.format(formatter);
            return formatDateTime;
        }else{
        	return "";
        }
	}
	public String getFormatedDropOff(){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        if(dropOffTime!=null){
        	String formatDateTime = dropOffTime.format(formatter);
            return formatDateTime;
        }else{
        	return "";
        }
	}
	public String getFormatedPickUp(){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        if(pickUpTime!=null){
        	String formatDateTime = pickUpTime.format(formatter);
            return formatDateTime;
        }else{
        	return "";
        }
	}
	public String getFormatedContactDate(){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        if(contact_date!=null){
        	String formatDateTime = contact_date.format(formatter);
            return formatDateTime;
        }else{
        	return "";
        }
	}
}
