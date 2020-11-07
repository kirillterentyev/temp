package com.gridnine.testing;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        FlightFilters flightFilters = new FlightFilters();

        System.out.println("вылет до текущего момента времени :"
                + flightFilters.flightsBeforeCurrent(FlightBuilder.createFlights()));
        System.out.println("имеются сегменты с датой прилёта раньше даты вылета"
                + flightFilters.flightsArrBeforeDep(FlightBuilder.createFlights()));
        System.out.println("общее время, проведённое на земле превышает два часа"
                + flightFilters.overallGroundTime(FlightBuilder.createFlights()));
    }



}
