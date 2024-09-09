/*
 * Dropbox Sign API
 * Dropbox Sign v3 API
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: apisupport@hellosign.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.dropbox.sign.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.dropbox.sign.JSON;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;


import com.dropbox.sign.ApiException;
/**
 * Contains pagination information about the data returned.
 */
@JsonPropertyOrder({
  ListInfoResponse.JSON_PROPERTY_NUM_PAGES,
  ListInfoResponse.JSON_PROPERTY_NUM_RESULTS,
  ListInfoResponse.JSON_PROPERTY_PAGE,
  ListInfoResponse.JSON_PROPERTY_PAGE_SIZE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class ListInfoResponse {
  public static final String JSON_PROPERTY_NUM_PAGES = "num_pages";
  private Integer numPages;

  public static final String JSON_PROPERTY_NUM_RESULTS = "num_results";
  private Integer numResults;

  public static final String JSON_PROPERTY_PAGE = "page";
  private Integer page;

  public static final String JSON_PROPERTY_PAGE_SIZE = "page_size";
  private Integer pageSize;

  public ListInfoResponse() { 
  }

  /**
   * Attempt to instantiate and hydrate a new instance of this class
   * @param jsonData String of JSON data representing target object
   */
  static public ListInfoResponse init(String jsonData) throws Exception {
    return new ObjectMapper().readValue(jsonData, ListInfoResponse.class);
  }

  static public ListInfoResponse init(HashMap data) throws Exception {
    return new ObjectMapper().readValue(
      new ObjectMapper().writeValueAsString(data),
      ListInfoResponse.class
    );
  }

  public ListInfoResponse numPages(Integer numPages) {
    this.numPages = numPages;
    return this;
  }

  /**
   * Total number of pages available.
   * @return numPages
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUM_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumPages() {
    return numPages;
  }


  @JsonProperty(JSON_PROPERTY_NUM_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumPages(Integer numPages) {
    this.numPages = numPages;
  }


  public ListInfoResponse numResults(Integer numResults) {
    this.numResults = numResults;
    return this;
  }

  /**
   * Total number of objects available.
   * @return numResults
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUM_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumResults() {
    return numResults;
  }


  @JsonProperty(JSON_PROPERTY_NUM_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumResults(Integer numResults) {
    this.numResults = numResults;
  }


  public ListInfoResponse page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Number of the page being returned.
   * @return page
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPage() {
    return page;
  }


  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPage(Integer page) {
    this.page = page;
  }


  public ListInfoResponse pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Objects returned per page.
   * @return pageSize
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageSize() {
    return pageSize;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  /**
   * Return true if this ListInfoResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListInfoResponse listInfoResponse = (ListInfoResponse) o;
    return Objects.equals(this.numPages, listInfoResponse.numPages) &&
        Objects.equals(this.numResults, listInfoResponse.numResults) &&
        Objects.equals(this.page, listInfoResponse.page) &&
        Objects.equals(this.pageSize, listInfoResponse.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numPages, numResults, page, pageSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListInfoResponse {\n");
    sb.append("    numPages: ").append(toIndentedString(numPages)).append("\n");
    sb.append("    numResults: ").append(toIndentedString(numResults)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (numPages != null) {
        if (isFileTypeOrListOfFiles(numPages)) {
            fileTypeFound = true;
        }

        if (numPages.getClass().equals(java.io.File.class) ||
            numPages.getClass().equals(Integer.class) ||
            numPages.getClass().equals(String.class) ||
            numPages.getClass().isEnum()) {
            map.put("num_pages", numPages);
        } else if (isListOfFile(numPages)) {
            for(int i = 0; i< getListSize(numPages); i++) {
                map.put("num_pages[" + i + "]", getFromList(numPages, i));
            }
        }
        else {
            map.put("num_pages", JSON.getDefault().getMapper().writeValueAsString(numPages));
        }
    }
    if (numResults != null) {
        if (isFileTypeOrListOfFiles(numResults)) {
            fileTypeFound = true;
        }

        if (numResults.getClass().equals(java.io.File.class) ||
            numResults.getClass().equals(Integer.class) ||
            numResults.getClass().equals(String.class) ||
            numResults.getClass().isEnum()) {
            map.put("num_results", numResults);
        } else if (isListOfFile(numResults)) {
            for(int i = 0; i< getListSize(numResults); i++) {
                map.put("num_results[" + i + "]", getFromList(numResults, i));
            }
        }
        else {
            map.put("num_results", JSON.getDefault().getMapper().writeValueAsString(numResults));
        }
    }
    if (page != null) {
        if (isFileTypeOrListOfFiles(page)) {
            fileTypeFound = true;
        }

        if (page.getClass().equals(java.io.File.class) ||
            page.getClass().equals(Integer.class) ||
            page.getClass().equals(String.class) ||
            page.getClass().isEnum()) {
            map.put("page", page);
        } else if (isListOfFile(page)) {
            for(int i = 0; i< getListSize(page); i++) {
                map.put("page[" + i + "]", getFromList(page, i));
            }
        }
        else {
            map.put("page", JSON.getDefault().getMapper().writeValueAsString(page));
        }
    }
    if (pageSize != null) {
        if (isFileTypeOrListOfFiles(pageSize)) {
            fileTypeFound = true;
        }

        if (pageSize.getClass().equals(java.io.File.class) ||
            pageSize.getClass().equals(Integer.class) ||
            pageSize.getClass().equals(String.class) ||
            pageSize.getClass().isEnum()) {
            map.put("page_size", pageSize);
        } else if (isListOfFile(pageSize)) {
            for(int i = 0; i< getListSize(pageSize); i++) {
                map.put("page_size[" + i + "]", getFromList(pageSize, i));
            }
        }
        else {
            map.put("page_size", JSON.getDefault().getMapper().writeValueAsString(pageSize));
        }
    }
    } catch (Exception e) {
        throw new ApiException(e);
    }

    return fileTypeFound ? map : new HashMap<>();
  }

  private boolean isFileTypeOrListOfFiles(Object obj) throws Exception {
    return obj.getClass().equals(java.io.File.class) || isListOfFile(obj);
  }

  private boolean isListOfFile(Object obj) throws Exception {
      return obj instanceof java.util.List && !isListEmpty(obj) && getFromList(obj, 0) instanceof java.io.File;
  }

  private boolean isListEmpty(Object obj) throws Exception {
    return (boolean) Class.forName(java.util.List.class.getName()).getMethod("isEmpty").invoke(obj);
  }

  private Object getFromList(Object obj, int index) throws Exception {
    return Class.forName(java.util.List.class.getName()).getMethod("get", int.class).invoke(obj, index);
  }

  private int getListSize(Object obj) throws Exception {
    return (int) Class.forName(java.util.List.class.getName()).getMethod("size").invoke(obj);
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

