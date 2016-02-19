package org.hisrc.openskynetwork.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModelProperty;

@JsonFormat(shape=JsonFormat.Shape.ARRAY)
@JsonPropertyOrder({ "icao24", "callsign", "originCountry", "lastPositionUpdate", "lastVelocityUpdate",
	"latitude", "longitude", "altitude", "isOnGround", "velocity", "heading", "verticalRate", "sensors" })
public class State  {

	private String icao24 = null;
	private String callsign = null;
	private String originCountry = null;
	private Long lastPositionUpdate = null;
	private Long lastVelocityUpdate = null;
	private Double latitude = null;
	private Double longitude = null;
	private Double altitude = null;
	private Boolean isOnGround = null;
	private Double velocity = null;
	private Double heading = null;
	private Double  verticalRate = null;
	private List<Long> sensors = new ArrayList<Long>();

	
	@ApiModelProperty(required = true, value = "")
	@JsonProperty("icao24")
	public String getIcao24() {
		return icao24;
	}

	public void setIcao24(String icao24) {
		this.icao24 = icao24;
	}

	@ApiModelProperty(required = true, value = "")
	@JsonProperty("callsign")
	public String getCallsign() {
		return callsign;
	}

	public void setCallsign(String callsign) {
		this.callsign = callsign;
	}

	@ApiModelProperty(required = true, value = "")
	@JsonProperty("originCountry")
	public String getOriginCountry() {
		return originCountry;
	}

	public void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}

	@ApiModelProperty(required = true, value = "")
	@JsonProperty("lastPositionUpdate")
	public Long getLastPositionUpdate() {
		return lastPositionUpdate;
	}

	public void setLastPositionUpdate(Long lastPositionUpdate) {
		this.lastPositionUpdate = lastPositionUpdate;
	}

	@ApiModelProperty(required = true, value = "")
	@JsonProperty("lastVelocityUpdate")
	public Long getLastVelocityUpdate() {
		return lastVelocityUpdate;
	}

	public void setLastVelocityUpdate(Long lastVelocityUpdate) {
		this.lastVelocityUpdate = lastVelocityUpdate;
	}

	@ApiModelProperty(required = true, value = "")
	@JsonProperty("latitude")
	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	@ApiModelProperty(required = true, value = "")
	@JsonProperty("longitude")
	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	@ApiModelProperty(required = true, value = "")
	@JsonProperty("states")
	public Double getAltitude() {
		return altitude;
	}

	public void setAltitude(Double altitude) {
		this.altitude = altitude;
	}

	@ApiModelProperty(required = true, value = "")
	@JsonProperty("isOnGround")
	public Boolean getIsOnGround() {
		return isOnGround;
	}

	public void setIsOnGround(Boolean isOnGround) {
		this.isOnGround = isOnGround;
	}

	@ApiModelProperty(required = true, value = "")
	@JsonProperty("velocity")
	public Double getVelocity() {
		return velocity;
	}

	public void setVelocity(Double velocity) {
		this.velocity = velocity;
	}

	@ApiModelProperty(required = true, value = "")
	@JsonProperty("heading")
	public Double getHeading() {
		return heading;
	}

	public void setHeading(Double heading) {
		this.heading = heading;
	}

	@ApiModelProperty(required = true, value = "")
	@JsonProperty("verticalRate")
	public Double getVerticalRate() {
		return verticalRate;
	}

	public void setVerticalRate(Double verticalRate) {
		this.verticalRate = verticalRate;
	}

	@ApiModelProperty(required = true, value = "")
	@JsonProperty("sensors")
	public List<Long> getSensors() {
		return sensors;
	}

	public void setSensors(List<Long> sensors) {
		this.sensors = sensors;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		State states = (State) o;
		
		return true
				&&				Objects.equals(icao24, states.icao24)
				&&				Objects.equals(callsign, states.callsign)
				&&				Objects.equals(originCountry, states.originCountry)
				&&				Objects.equals(lastPositionUpdate, states.lastPositionUpdate)
				&&				Objects.equals(lastVelocityUpdate, states.lastVelocityUpdate)
				&&				Objects.equals(latitude, states.latitude)
				&&				Objects.equals(longitude, states.longitude)
				&&				Objects.equals(altitude, states.altitude)
				&&				Objects.equals(isOnGround, states.isOnGround)
				&&				Objects.equals(velocity, states.velocity)
				&&				Objects.equals(heading, states.heading)
				&&				Objects.equals(verticalRate, states.verticalRate)
				&&				Objects.equals(sensors, states.sensors);
				
	}

	@Override
	public int hashCode() {
		return Objects.hash(
				icao24,
				callsign,
				originCountry,
				lastPositionUpdate,
				lastVelocityUpdate,
				latitude,
				longitude,
				altitude,
				isOnGround,
				velocity,
				heading,
				verticalRate,
				sensors);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class State {\n");
		sb.append("    icao24: ").append(toIndentedString(icao24)).append("\n");
		sb.append("    callsign: ").append(toIndentedString(callsign)).append("\n");
		sb.append("    originCountry: ").append(toIndentedString(originCountry)).append("\n");
		sb.append("    lastPositionUpdate: ").append(toIndentedString(lastPositionUpdate)).append("\n");
		sb.append("    lastVelocityUpdate: ").append(toIndentedString(lastVelocityUpdate)).append("\n");
		sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
		sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
		sb.append("    altitude: ").append(toIndentedString(altitude)).append("\n");
		sb.append("    isOnGround: ").append(toIndentedString(isOnGround)).append("\n");
		sb.append("    velocity: ").append(toIndentedString(velocity)).append("\n");
		sb.append("    heading: ").append(toIndentedString(heading)).append("\n");
		sb.append("    verticalRate: ").append(toIndentedString(verticalRate)).append("\n");
		sb.append("    sensors: ").append(toIndentedString(sensors)).append("\n");
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



