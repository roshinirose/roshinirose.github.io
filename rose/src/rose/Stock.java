package rose;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="stock")
public class Stock {
@Column(name="stock_id")
private String s_id;
@Column(name="no_of_items")
private String item_nos;
@Column(name="material")
private String material;
@Column(name="price")
private String price;
@Column(name="colour")
private String colour;
@Column(name="catchy_code")
private String catchy_code;
public String getS_id() {
	return s_id;
}
public void setS_id(String s_id) {
	this.s_id = s_id;
}
public String getItem_nos() {
	return item_nos;
}
public void setItem_nos(String item_nos) {
	this.item_nos = item_nos;
}
public String getMaterial() {
	return material;
}
public void setMaterial(String material) {
	this.material = material;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
public String getCatchy_code() {
	return catchy_code;
}
public void setCatchy_code(String catchy_code) {
	this.catchy_code = catchy_code;
}

}
