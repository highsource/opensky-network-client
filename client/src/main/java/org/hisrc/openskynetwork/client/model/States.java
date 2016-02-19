package org.hisrc.openskynetwork.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class States {

	private Long time = null;
	private Long earliest = null;
	private List<State> states = new ArrayList<State>();

	/**
	 **/

	@ApiModelProperty(required = true, value = "")
	@JsonProperty("time")
	public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	/**
	 **/

	@ApiModelProperty(required = true, value = "")
	@JsonProperty("earliest")
	public Long getEarliest() {
		return earliest;
	}

	public void setEarliest(Long earliest) {
		this.earliest = earliest;
	}

	/**
	 **/

	@ApiModelProperty(required = true, value = "")
	@JsonProperty("states")
	public List<State> getStates() {
		return states;
	}

	public void setStates(List<State> states) {
		this.states = states;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		States states = (States) o;

		return true && Objects.equals(time, states.time) && Objects.equals(earliest, states.earliest)
				&& Objects.equals(states, states.states);
	}

	@Override
	public int hashCode() {
		return Objects.hash(time, earliest, states);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class States {\n");

		sb.append("    time: ").append(toIndentedString(time)).append("\n");
		sb.append("    earliest: ").append(toIndentedString(earliest)).append("\n");
		sb.append("    states: ").append(toIndentedString(states)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
