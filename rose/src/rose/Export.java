package rose;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="export")
public class Export {
@Column(name="username")
private String u_name;
@Column(name="deliver_address")
private String d_address;
@Column(name="delivery_date")
private Date d_date;
@Column(name="stock_id")
private String s_id;
@Column(name="membership_id")
private int m_id;
public String getU_name() {
	return u_name;
}
public void setU_name(String u_name) {
	this.u_name = u_name;
}
public String getD_address() {
	return d_address;
}
public void setD_address(String d_address) {
	this.d_address = d_address;
}
public Date getD_date() {
	return d_date;
}
public void setD_date(Date d_date) {
	this.d_date = d_date;
}
public String getS_id() {
	return s_id;
}
public void setS_id(String s_id) {
	this.s_id = s_id;
}
public int getM_id() {
	return m_id;
}
public void setM_id(int m_id) {
	this.m_id = m_id;
}

}
