/*
 * LocationIQ
 * LocationIQ provides flexible enterprise-grade location based solutions. We work with developers, startups and enterprises worldwide serving billions of requests everyday. This page provides an overview of the technical aspects of our API and will help you get started.
 *
 * The version of the OpenAPI document: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.locationiq.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * Address
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-16T09:31:02.837+03:00[Europe/Bucharest]")
public class Address {
  public static final String SERIALIZED_NAME_HOUSE_NUMBER = "house_number";
  @SerializedName(SERIALIZED_NAME_HOUSE_NUMBER)
  private String houseNumber;

  public static final String SERIALIZED_NAME_ROAD = "road";
  @SerializedName(SERIALIZED_NAME_ROAD)
  private String road;

  public static final String SERIALIZED_NAME_RESIDENTIAL = "residential";
  @SerializedName(SERIALIZED_NAME_RESIDENTIAL)
  private String residential;

  public static final String SERIALIZED_NAME_BOROUGH = "borough";
  @SerializedName(SERIALIZED_NAME_BOROUGH)
  private String borough;

  public static final String SERIALIZED_NAME_NEIGHBOURHOOD = "neighbourhood";
  @SerializedName(SERIALIZED_NAME_NEIGHBOURHOOD)
  private String neighbourhood;

  public static final String SERIALIZED_NAME_QUARTER = "quarter";
  @SerializedName(SERIALIZED_NAME_QUARTER)
  private String quarter;

  public static final String SERIALIZED_NAME_HAMLET = "hamlet";
  @SerializedName(SERIALIZED_NAME_HAMLET)
  private String hamlet;

  public static final String SERIALIZED_NAME_SUBURB = "suburb";
  @SerializedName(SERIALIZED_NAME_SUBURB)
  private String suburb;

  public static final String SERIALIZED_NAME_ISLAND = "island";
  @SerializedName(SERIALIZED_NAME_ISLAND)
  private String island;

  public static final String SERIALIZED_NAME_VILLAGE = "village";
  @SerializedName(SERIALIZED_NAME_VILLAGE)
  private String village;

  public static final String SERIALIZED_NAME_TOWN = "town";
  @SerializedName(SERIALIZED_NAME_TOWN)
  private String town;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_CITY_DISTRICT = "city_district";
  @SerializedName(SERIALIZED_NAME_CITY_DISTRICT)
  private String cityDistrict;

  public static final String SERIALIZED_NAME_COUNTY = "county";
  @SerializedName(SERIALIZED_NAME_COUNTY)
  private String county;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_STATE_DISTRICT = "state_district";
  @SerializedName(SERIALIZED_NAME_STATE_DISTRICT)
  private String stateDistrict;

  public static final String SERIALIZED_NAME_POSTCODE = "postcode";
  @SerializedName(SERIALIZED_NAME_POSTCODE)
  private String postcode;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "country_code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_STATE_CODE = "state_code";
  @SerializedName(SERIALIZED_NAME_STATE_CODE)
  private String stateCode;


  public Address houseNumber(String houseNumber) {
    
    this.houseNumber = houseNumber;
    return this;
  }

   /**
   * Get houseNumber
   * @return houseNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHouseNumber() {
    return houseNumber;
  }



  public void setHouseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
  }


  public Address road(String road) {
    
    this.road = road;
    return this;
  }

   /**
   * Get road
   * @return road
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRoad() {
    return road;
  }



  public void setRoad(String road) {
    this.road = road;
  }


  public Address residential(String residential) {
    
    this.residential = residential;
    return this;
  }

   /**
   * Get residential
   * @return residential
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResidential() {
    return residential;
  }



  public void setResidential(String residential) {
    this.residential = residential;
  }


  public Address borough(String borough) {
    
    this.borough = borough;
    return this;
  }

   /**
   * Get borough
   * @return borough
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBorough() {
    return borough;
  }



  public void setBorough(String borough) {
    this.borough = borough;
  }


  public Address neighbourhood(String neighbourhood) {
    
    this.neighbourhood = neighbourhood;
    return this;
  }

   /**
   * Get neighbourhood
   * @return neighbourhood
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNeighbourhood() {
    return neighbourhood;
  }



  public void setNeighbourhood(String neighbourhood) {
    this.neighbourhood = neighbourhood;
  }


  public Address quarter(String quarter) {
    
    this.quarter = quarter;
    return this;
  }

   /**
   * Get quarter
   * @return quarter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getQuarter() {
    return quarter;
  }



  public void setQuarter(String quarter) {
    this.quarter = quarter;
  }


  public Address hamlet(String hamlet) {
    
    this.hamlet = hamlet;
    return this;
  }

   /**
   * Get hamlet
   * @return hamlet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHamlet() {
    return hamlet;
  }



  public void setHamlet(String hamlet) {
    this.hamlet = hamlet;
  }


  public Address suburb(String suburb) {
    
    this.suburb = suburb;
    return this;
  }

   /**
   * Get suburb
   * @return suburb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSuburb() {
    return suburb;
  }



  public void setSuburb(String suburb) {
    this.suburb = suburb;
  }


  public Address island(String island) {
    
    this.island = island;
    return this;
  }

   /**
   * Get island
   * @return island
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIsland() {
    return island;
  }



  public void setIsland(String island) {
    this.island = island;
  }


  public Address village(String village) {
    
    this.village = village;
    return this;
  }

   /**
   * Get village
   * @return village
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVillage() {
    return village;
  }



  public void setVillage(String village) {
    this.village = village;
  }


  public Address town(String town) {
    
    this.town = town;
    return this;
  }

   /**
   * Get town
   * @return town
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTown() {
    return town;
  }



  public void setTown(String town) {
    this.town = town;
  }


  public Address city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCity() {
    return city;
  }



  public void setCity(String city) {
    this.city = city;
  }


  public Address cityDistrict(String cityDistrict) {
    
    this.cityDistrict = cityDistrict;
    return this;
  }

   /**
   * Get cityDistrict
   * @return cityDistrict
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCityDistrict() {
    return cityDistrict;
  }



  public void setCityDistrict(String cityDistrict) {
    this.cityDistrict = cityDistrict;
  }


  public Address county(String county) {
    
    this.county = county;
    return this;
  }

   /**
   * Get county
   * @return county
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCounty() {
    return county;
  }



  public void setCounty(String county) {
    this.county = county;
  }


  public Address state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getState() {
    return state;
  }



  public void setState(String state) {
    this.state = state;
  }


  public Address stateDistrict(String stateDistrict) {
    
    this.stateDistrict = stateDistrict;
    return this;
  }

   /**
   * Get stateDistrict
   * @return stateDistrict
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStateDistrict() {
    return stateDistrict;
  }



  public void setStateDistrict(String stateDistrict) {
    this.stateDistrict = stateDistrict;
  }


  public Address postcode(String postcode) {
    
    this.postcode = postcode;
    return this;
  }

   /**
   * Get postcode
   * @return postcode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPostcode() {
    return postcode;
  }



  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }


  public Address country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCountry() {
    return country;
  }



  public void setCountry(String country) {
    this.country = country;
  }


  public Address countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCountryCode() {
    return countryCode;
  }



  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public Address stateCode(String stateCode) {
    
    this.stateCode = stateCode;
    return this;
  }

   /**
   * Get stateCode
   * @return stateCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStateCode() {
    return stateCode;
  }



  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.houseNumber, address.houseNumber) &&
        Objects.equals(this.road, address.road) &&
        Objects.equals(this.residential, address.residential) &&
        Objects.equals(this.borough, address.borough) &&
        Objects.equals(this.neighbourhood, address.neighbourhood) &&
        Objects.equals(this.quarter, address.quarter) &&
        Objects.equals(this.hamlet, address.hamlet) &&
        Objects.equals(this.suburb, address.suburb) &&
        Objects.equals(this.island, address.island) &&
        Objects.equals(this.village, address.village) &&
        Objects.equals(this.town, address.town) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.cityDistrict, address.cityDistrict) &&
        Objects.equals(this.county, address.county) &&
        Objects.equals(this.state, address.state) &&
        Objects.equals(this.stateDistrict, address.stateDistrict) &&
        Objects.equals(this.postcode, address.postcode) &&
        Objects.equals(this.country, address.country) &&
        Objects.equals(this.countryCode, address.countryCode) &&
        Objects.equals(this.stateCode, address.stateCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(houseNumber, road, residential, borough, neighbourhood, quarter, hamlet, suburb, island, village, town, city, cityDistrict, county, state, stateDistrict, postcode, country, countryCode, stateCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("    houseNumber: ").append(toIndentedString(houseNumber)).append("\n");
    sb.append("    road: ").append(toIndentedString(road)).append("\n");
    sb.append("    residential: ").append(toIndentedString(residential)).append("\n");
    sb.append("    borough: ").append(toIndentedString(borough)).append("\n");
    sb.append("    neighbourhood: ").append(toIndentedString(neighbourhood)).append("\n");
    sb.append("    quarter: ").append(toIndentedString(quarter)).append("\n");
    sb.append("    hamlet: ").append(toIndentedString(hamlet)).append("\n");
    sb.append("    suburb: ").append(toIndentedString(suburb)).append("\n");
    sb.append("    island: ").append(toIndentedString(island)).append("\n");
    sb.append("    village: ").append(toIndentedString(village)).append("\n");
    sb.append("    town: ").append(toIndentedString(town)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    cityDistrict: ").append(toIndentedString(cityDistrict)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateDistrict: ").append(toIndentedString(stateDistrict)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

