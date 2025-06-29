package com.techeazy.delivery;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parcels")
@CrossOrigin
public class ParcelController {
	
	private final ParcelService service;
	
	public ParcelController(ParcelService service)
	{
		this.service = service;
	}
	
		@PostMapping
		public Parcel create(@RequestBody Parcel parcel) 
		{
			return service.createParcel(parcel);
		}
		
		@GetMapping
		public List<Parcel> getAll() {
			return service.getAll();
		}
		
		@GetMapping("/{trackingId}")
		public Parcel getByTrackingId(@PathVariable String trackingId) {
			return
		service.getByTrackingId(trackingId);
		}
		
		@DeleteMapping("/{id}")
		public void deleteParcel(@PathVariable Long id) {
			service.deleteParcel(id);
		}
		
}
