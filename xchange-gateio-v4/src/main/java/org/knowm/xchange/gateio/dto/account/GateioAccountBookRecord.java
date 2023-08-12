package org.knowm.xchange.gateio.dto.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.math.BigDecimal;
import java.time.Instant;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;
import org.knowm.xchange.currency.Currency;
import org.knowm.xchange.gateio.config.StringToCurrencyConverter;

@Data
@Builder
@Jacksonized
public class GateioAccountBookRecord {

  @JsonProperty("id")
  String id;

  @JsonProperty("time")
  Instant timestamp;

  @JsonProperty("currency")
  @JsonDeserialize(converter = StringToCurrencyConverter.class)
  Currency currency;

  @JsonProperty("change")
  BigDecimal change;

  @JsonProperty("balance")
  BigDecimal balance;

  @JsonProperty("type")
  String type;

}
