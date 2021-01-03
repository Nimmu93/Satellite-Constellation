package com.satelliteconstellation.app.controller;

import com.satelliteconstellation.app.entity.SatelliteInfo;
import com.satelliteconstellation.app.repository.SatelliteInfoRepository;
import com.satelliteconstellation.app.utils.SatelliteUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/satelliteInfo")
public class SatelliteInfoController {
    @Autowired
    private SatelliteInfoRepository satelliteInfoRepository;

    @PostMapping("/{id}")
    public String addSatellite(@PathVariable Long id, @RequestBody SatelliteInfo satelliteInfo){
        satelliteInfo.setId(id);
        satelliteInfoRepository.save(satelliteInfo);
        return "Satellite saved.";
    }

    @DeleteMapping("/{id}")
    public String deleteSatellite(@PathVariable Long id){
        satelliteInfoRepository.deleteById(id);
        return "Satellite deleted";
    }

    @GetMapping("/getConstellation/{id}")
    public String getConstellation(@PathVariable Long id){
        String ConstellationName = satelliteInfoRepository.getOne(id).getConstellation();
        return ConstellationName;
    }

    @PutMapping("/constellation/{id}/{constellationName}")
    public String updateConstellation(@PathVariable Long id,@PathVariable String constellationName){
        SatelliteInfo satelliteInfo = new SatelliteInfo();
        satelliteInfo = satelliteInfoRepository.getOne(id);
        satelliteInfo.setConstellation(constellationName);
        satelliteInfoRepository.save(satelliteInfo);
        return "Constellation details updated successfully.";
    }

    @GetMapping("/getHealth/{id}")
    public float getHealth(@PathVariable Long id){
        SatelliteInfo satelliteInfo = new SatelliteInfo();
        satelliteInfo = satelliteInfoRepository.getOne(id);
        return SatelliteUtils.getSatelliteHealth(satelliteInfo);
    }
}
