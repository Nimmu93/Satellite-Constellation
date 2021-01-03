package com.satelliteconstellation.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "satellite_details")
public class SatelliteInfo {
    @Id
    private Long id;
    private String name;
    private Date initializedDate;
    private BigDecimal longitude;
    private BigDecimal latitude;
    private Long batteryLife;
    private String constellation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getInitializedDate() {
        return initializedDate;
    }

    public void setInitializedDate(Date initializedDate) {
        this.initializedDate = initializedDate;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public Long getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(Long batteryLife) {
        this.batteryLife = batteryLife;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }
}
