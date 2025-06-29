package com.techeazy.delivery;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ParcelRepository extends JpaRepository<Parcel, Long> {
Optional<Parcel> findByTrackingId(String
trackingId);
}
