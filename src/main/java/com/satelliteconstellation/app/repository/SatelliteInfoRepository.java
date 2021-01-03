package com.satelliteconstellation.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.satelliteconstellation.app.entity.SatelliteInfo;

public interface SatelliteInfoRepository extends JpaRepository<SatelliteInfo,Long> {
}
