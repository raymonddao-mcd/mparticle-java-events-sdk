
package com.mparticle.sdk.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Location {

    @JsonProperty("latitude")
    private Double latitude;
    @JsonProperty("longitude")
    private Double longitude;
    @JsonProperty("accuracy")
    private Double accuracy;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("country_name")
    private String countryName;
    @JsonProperty("region_code")
    private String regionCode;
    @JsonProperty("region_name")
    private String regionName;
    @JsonProperty("city_name")
    private String cityName;
    @JsonProperty("postal_code")
    private String postalCode;
    @JsonProperty("dma_code")
    private Integer dmaCode;
    @JsonProperty("area_code")
    private Integer areaCode;
    @JsonProperty("metro_code")
    private Integer metroCode;

    /**
     * 
     * @return
     *     The latitude
     */
    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    /**
     * 
     * @param latitude
     *     The latitude
     */
    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * 
     * @return
     *     The longitude
     */
    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    /**
     * 
     * @param longitude
     *     The longitude
     */
    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * 
     * @return
     *     The accuracy
     */
    @JsonProperty("accuracy")
    public Double getAccuracy() {
        return accuracy;
    }

    /**
     * 
     * @param accuracy
     *     The accuracy
     */
    @JsonProperty("accuracy")
    public void setAccuracy(Double accuracy) {
        this.accuracy = accuracy;
    }

    /**
     * 
     * @return
     *     The countryCode
     */
    @JsonProperty("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 
     * @param countryCode
     *     The country_code
     */
    @JsonProperty("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * 
     * @return
     *     The countryName
     */
    @JsonProperty("country_name")
    public String getCountryName() {
        return countryName;
    }

    /**
     * 
     * @param countryName
     *     The country_name
     */
    @JsonProperty("country_name")
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * 
     * @return
     *     The regionCode
     */
    @JsonProperty("region_code")
    public String getRegionCode() {
        return regionCode;
    }

    /**
     * 
     * @param regionCode
     *     The region_code
     */
    @JsonProperty("region_code")
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    /**
     * 
     * @return
     *     The regionName
     */
    @JsonProperty("region_name")
    public String getRegionName() {
        return regionName;
    }

    /**
     * 
     * @param regionName
     *     The region_name
     */
    @JsonProperty("region_name")
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
     * 
     * @return
     *     The cityName
     */
    @JsonProperty("city_name")
    public String getCityName() {
        return cityName;
    }

    /**
     * 
     * @param cityName
     *     The city_name
     */
    @JsonProperty("city_name")
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * 
     * @return
     *     The postalCode
     */
    @JsonProperty("postal_code")
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * 
     * @param postalCode
     *     The postal_code
     */
    @JsonProperty("postal_code")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * 
     * @return
     *     The dmaCode
     */
    @JsonProperty("dma_code")
    public Integer getDmaCode() {
        return dmaCode;
    }

    /**
     * 
     * @param dmaCode
     *     The dma_code
     */
    @JsonProperty("dma_code")
    public void setDmaCode(Integer dmaCode) {
        this.dmaCode = dmaCode;
    }

    /**
     * 
     * @return
     *     The areaCode
     */
    @JsonProperty("area_code")
    public Integer getAreaCode() {
        return areaCode;
    }

    /**
     * 
     * @param areaCode
     *     The area_code
     */
    @JsonProperty("area_code")
    public void setAreaCode(Integer areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * 
     * @return
     *     The metroCode
     */
    @JsonProperty("metro_code")
    public Integer getMetroCode() {
        return metroCode;
    }

    /**
     * 
     * @param metroCode
     *     The metro_code
     */
    @JsonProperty("metro_code")
    public void setMetroCode(Integer metroCode) {
        this.metroCode = metroCode;
    }

}
