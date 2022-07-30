package max.controller;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "dist10")
public class DistBean {

	@Id
	String dist_code;
	String dist_name;
	String state_code;

	public String getDist_code() {
		return dist_code;
	}

	public void setDist_code(String dist_code) {
		this.dist_code = dist_code;
	}

	public String getDist_name() {
		return dist_name;
	}

	public void setDist_name(String dist_name) {
		this.dist_name = dist_name;
	}

	public String getState_code() {
		return state_code;
	}

	public void setState_code(String state_code) {
		this.state_code = state_code;
	}

}
