package com.acme.banking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * OBReadParty3Data
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-15T11:04:50.818Z[GMT]")


public class OBReadParty3Data   {
  @JsonProperty("Party")
  @Valid
  private List<OBParty2> party = null;

  public OBReadParty3Data party(List<OBParty2> party) {
    this.party = party;
    return this;
  }

  public OBReadParty3Data addPartyItem(OBParty2 partyItem) {
    if (this.party == null) {
      this.party = new ArrayList<OBParty2>();
    }
    this.party.add(partyItem);
    return this;
  }

  /**
   * Get party
   * @return party
   **/
  @Schema(description = "")
      @Valid
    public List<OBParty2> getParty() {
    return party;
  }

  public void setParty(List<OBParty2> party) {
    this.party = party;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadParty3Data obReadParty3Data = (OBReadParty3Data) o;
    return Objects.equals(this.party, obReadParty3Data.party);
  }

  @Override
  public int hashCode() {
    return Objects.hash(party);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadParty3Data {\n");
    
    sb.append("    party: ").append(toIndentedString(party)).append("\n");
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
