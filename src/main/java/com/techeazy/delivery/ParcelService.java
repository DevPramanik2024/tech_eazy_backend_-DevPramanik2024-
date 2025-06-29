package com.techeazy.delivery;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ParcelService {

		private final ParcelRepository repo;
		
		public ParcelService(ParcelRepository repo) {
			this.repo = repo;
		}
		
		public Parcel createParcel(Parcel p) {
			return repo.save(p);
		}
		
		public List<Parcel> getAll() {
			return repo.findAll();
		}
		
		public Parcel getByTrackingId(String
trackingId) {
			return
repo.findByTrackingId(trackingId).orElse(null);
		}
		
		public void deleteParcel(Long id) {
			repo.deleteById(id);
		}
}
