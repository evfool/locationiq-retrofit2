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

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * Location
 */

public class Location implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PLACE_ID = "place_id";
  @SerializedName(SERIALIZED_NAME_PLACE_ID)
  private String placeId;

  public static final String SERIALIZED_NAME_LICENCE = "licence";
  @SerializedName(SERIALIZED_NAME_LICENCE)
  private String licence;

  public static final String SERIALIZED_NAME_OSM_TYPE = "osm_type";
  @SerializedName(SERIALIZED_NAME_OSM_TYPE)
  private String osmType;

  public static final String SERIALIZED_NAME_OSM_ID = "osm_id";
  @SerializedName(SERIALIZED_NAME_OSM_ID)
  private String osmId;

  public static final String SERIALIZED_NAME_BOUNDINGBOX = "boundingbox";
  @SerializedName(SERIALIZED_NAME_BOUNDINGBOX)
  private List<String> boundingbox = null;

  public static final String SERIALIZED_NAME_LAT = "lat";
  @SerializedName(SERIALIZED_NAME_LAT)
  private String lat;

  public static final String SERIALIZED_NAME_LON = "lon";
  @SerializedName(SERIALIZED_NAME_LON)
  private String lon;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_PROPERTY_CLASS = "class";
  @SerializedName(SERIALIZED_NAME_PROPERTY_CLASS)
  private String propertyClass;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_IMPORTANCE = "importance";
  @SerializedName(SERIALIZED_NAME_IMPORTANCE)
  private BigDecimal importance;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private Address address;

  public static final String SERIALIZED_NAME_NAMEDETAILS = "namedetails";
  @SerializedName(SERIALIZED_NAME_NAMEDETAILS)
  private Namedetails namedetails;


  public Location placeId(String placeId) {
    
    this.placeId = placeId;
    return this;
  }

   /**
   * Get placeId
   * @return placeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPlaceId() {
    return placeId;
  }



  public void setPlaceId(String placeId) {
    this.placeId = placeId;
  }


  public Location licence(String licence) {
    
    this.licence = licence;
    return this;
  }

   /**
   * Get licence
   * @return licence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLicence() {
    return licence;
  }



  public void setLicence(String licence) {
    this.licence = licence;
  }


  public Location osmType(String osmType) {
    
    this.osmType = osmType;
    return this;
  }

   /**
   * Get osmType
   * @return osmType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOsmType() {
    return osmType;
  }



  public void setOsmType(String osmType) {
    this.osmType = osmType;
  }


  public Location osmId(String osmId) {
    
    this.osmId = osmId;
    return this;
  }

   /**
   * Get osmId
   * @return osmId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOsmId() {
    return osmId;
  }



  public void setOsmId(String osmId) {
    this.osmId = osmId;
  }


  public Location boundingbox(List<String> boundingbox) {
    
    this.boundingbox = boundingbox;
    return this;
  }

  public Location addBoundingboxItem(String boundingboxItem) {
    if (this.boundingbox == null) {
      this.boundingbox = new ArrayList<>();
    }
    this.boundingbox.add(boundingboxItem);
    return this;
  }

   /**
   * Get boundingbox
   * @return boundingbox
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getBoundingbox() {
    return boundingbox;
  }



  public void setBoundingbox(List<String> boundingbox) {
    this.boundingbox = boundingbox;
  }


  public Location lat(String lat) {
    
    this.lat = lat;
    return this;
  }

   /**
   * Get lat
   * @return lat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLat() {
    return lat;
  }



  public void setLat(String lat) {
    this.lat = lat;
  }


  public Location lon(String lon) {
    
    this.lon = lon;
    return this;
  }

   /**
   * Get lon
   * @return lon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLon() {
    return lon;
  }



  public void setLon(String lon) {
    this.lon = lon;
  }


  public Location displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayName() {
    return displayName;
  }



  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public Location propertyClass(String propertyClass) {
    
    this.propertyClass = propertyClass;
    return this;
  }

   /**
   * Get propertyClass
   * @return propertyClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPropertyClass() {
    return propertyClass;
  }



  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }


  public Location type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }



  public void setType(String type) {
    this.type = type;
  }


  public Location importance(BigDecimal importance) {
    
    this.importance = importance;
    return this;
  }

   /**
   * Get importance
   * @return importance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getImportance() {
    return importance;
  }



  public void setImportance(BigDecimal importance) {
    this.importance = importance;
  }


  public Location address(Address address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Address getAddress() {
    return address;
  }



  public void setAddress(Address address) {
    this.address = address;
  }


  public Location namedetails(Namedetails namedetails) {
    
    this.namedetails = namedetails;
    return this;
  }

   /**
   * Get namedetails
   * @return namedetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Namedetails getNamedetails() {
    return namedetails;
  }



  public void setNamedetails(Namedetails namedetails) {
    this.namedetails = namedetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.placeId, location.placeId) &&
        Objects.equals(this.licence, location.licence) &&
        Objects.equals(this.osmType, location.osmType) &&
        Objects.equals(this.osmId, location.osmId) &&
        Objects.equals(this.boundingbox, location.boundingbox) &&
        Objects.equals(this.lat, location.lat) &&
        Objects.equals(this.lon, location.lon) &&
        Objects.equals(this.displayName, location.displayName) &&
        Objects.equals(this.propertyClass, location.propertyClass) &&
        Objects.equals(this.type, location.type) &&
        Objects.equals(this.importance, location.importance) &&
        Objects.equals(this.address, location.address) &&
        Objects.equals(this.namedetails, location.namedetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placeId, licence, osmType, osmId, boundingbox, lat, lon, displayName, propertyClass, type, importance, address, namedetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    sb.append("    placeId: ").append(toIndentedString(placeId)).append("\n");
    sb.append("    licence: ").append(toIndentedString(licence)).append("\n");
    sb.append("    osmType: ").append(toIndentedString(osmType)).append("\n");
    sb.append("    osmId: ").append(toIndentedString(osmId)).append("\n");
    sb.append("    boundingbox: ").append(toIndentedString(boundingbox)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lon: ").append(toIndentedString(lon)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    importance: ").append(toIndentedString(importance)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    namedetails: ").append(toIndentedString(namedetails)).append("\n");
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

