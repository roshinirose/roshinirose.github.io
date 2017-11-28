package rose;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="membership")
public class Membership {
@Column(name="membership_id")
private String m_id;
@Column(name="no_of_items_purchased")
private int items_purchased;
@Column(name="active_hours")
private int active_hours;
public String getM_id() {
	return m_id;
}
public void setM_id(String m_id) {
	this.m_id = m_id;
}
public int getItems_purchased() {
	return items_purchased;
}
public void setItems_purchased(int items_purchased) {
	this.items_purchased = items_purchased;
}
public int getActive_hours() {
	return active_hours;
}
public void setActive_hours(int active_hours) {
	this.active_hours = active_hours;
}

}
