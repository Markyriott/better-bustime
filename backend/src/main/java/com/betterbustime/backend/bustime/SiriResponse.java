package com.betterbustime.backend.bustime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record SiriResponse(Siri Siri) {

    public record Siri(ServiceDelivery ServiceDelivery){}

    @JsonIgnoreProperties(ignoreUnknown = true)
    public record ServiceDelivery(
            String ResponseTimestamp,
            List<VehicleMonitoringDelivery> VehicleMonitoringDelivery,
            List<SituationExchangeDelivery> SituationExchangeDelivery
    ){}

    public record VehicleMonitoringDelivery(
            List<VehicleActivity> VehicleActivity,
            String ResponseTimestamp,
            String ValidUntil
    ){}

    public record VehicleActivity(
            MonitoredVehicleJourney MonitoredVehicleJourney,
            String RecordedAtTime
    ){}

    public record MonitoredVehicleJourney(
            String LineRef,
            String DirectionRef,
            //@JsonProperty("FramedVehicleJourneyRef") Object framedVehicleJourney
            String JourneyPatternRef,
            String PublishedLineName,
            String OperatorRef,
            String OriginRef,
            String DestinationName,
            //@JsonProperty("SituationRef") Object situationRef,
            String Monitored,
            VehicleLocation VehicleLocation,
            Double Bearing,
            String ProgressRate,
            String BlockRef,
            String VehicleRef,
            MonitoredCall MonitoredCall
            //@JsonProperty("OnwardCalls") Object onwardCalls
    ){}

    //public record FramedVehicleJourney(){}
    //public record SituationRef(){}
    public record VehicleLocation(
            String Longitude,
            String Latitude
    ){}

    public record MonitoredCall(
            Extensions Extensions
    ){}

    public record Extensions(
            Distances Distances,
            //@JsonProperty("Capacities") Object capacities,
            VehicleFeatures VehicleFeatures
    ){}

    public record Distances(
            String PresentableDistance,
            Double DistanceFromCall,
            Integer StopsFromCall,
            Double CallDistanceAlongRoute
    ){}

    //public record Capacities(){}
    public record VehicleFeatures(
            Boolean StrollerVehicle
    ){}

    public record SituationExchangeDelivery(){}
}
