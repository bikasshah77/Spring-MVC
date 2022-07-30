package max.controller;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="state10")
public class StateBean {

	@Id
	String state_code;
	String state_name;
	String state_short_name;
	public String getState_code() {
		return state_code;
	}
	public void setState_code(String state_code) {
		this.state_code = state_code;
	}
	public String getState_name() {
		return state_name;
	}
	public void setState_name(String state_name) {
		this.state_name = state_name;
	}
	public String getState_short_name() {
		return state_short_name;
	}
	public void setState_short_name(String state_short_name) {
		this.state_short_name = state_short_name;
	}
	
	
}
