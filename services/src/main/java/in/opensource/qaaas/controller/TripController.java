package in.opensource.qaaas.controller;

import in.opensource.qaaas.model.trip.Trip;

import java.util.ArrayList;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service/")
public class TripController 
{
	@RequestMapping(value="/trips", method = RequestMethod.GET, headers="Accept=application/json")
	public ArrayList<Trip> getTrips()
	{
		return null;
	}
	
	@RequestMapping(value="/trip/{ticket}", method = RequestMethod.GET, headers="Accept=application/json")
	public Trip getTrip(@PathVariable String ticket)
	{
		return null;
	}
	
	@RequestMapping(value="/trip", method = RequestMethod.POST, headers="Accept=application/json")
	public String setTrip(HttpRequest request)
	{
		return null;
	}
	
	@RequestMapping(value="/trip/{ticket}", method = RequestMethod.DELETE, headers="Accept=application/json")
	public String deleteTrip(HttpRequest request)
	{
		return null;
	}
}
