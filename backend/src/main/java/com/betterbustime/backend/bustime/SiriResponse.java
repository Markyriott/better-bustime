package com.betterbustime.backend.bustime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record SiriResponse(@JsonProperty("Siri") Siri siri) {
    public record Siri(@JsonProperty("ServiceDelivery") ServiceDelivery serviceDelivery){}

    @JsonIgnoreProperties(ignoreUnknown = true)
    public record ServiceDelivery(
            @JsonProperty("ResponseTimestamp") String responseTimestamp,
            @JsonProperty("VehicleMonitoringDelivery") List<VehicleMonitoringDelivery> vehicleMonitoringDelivery,
            @JsonProperty("SituationExchangeDelivery") List<SituationExchangeDelivery> situationExchangeDelivery
    ){}

    public record VehicleMonitoringDelivery(
            /*@JsonProperty("VehicleActivity")*/ List<VehicleActivity> VehicleActivity,
            @JsonProperty("ResponseTimestamp") String responseTimestamp,
            @JsonProperty("ValidUntil") String validUntil
    ){}

    public record VehicleActivity(
            @JsonProperty("MonitoredVehicleJourney") MonitoredVehicleJourney monitoredVehicleJourney,
            String RecordedAtTime //@JsonProperty("RecordedAtTime") String recordedAtTime
    ){}

    public record MonitoredVehicleJourney(){}

    public record SituationExchangeDelivery(){}
}
