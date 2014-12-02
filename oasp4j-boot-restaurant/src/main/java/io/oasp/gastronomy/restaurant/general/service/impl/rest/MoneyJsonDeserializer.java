package io.oasp.gastronomy.restaurant.general.service.impl.rest;

import io.oasp.gastronomy.restaurant.general.common.api.datatype.Money;

import java.io.IOException;
import java.math.BigDecimal;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

/**
 * The {@link com.fasterxml.jackson.databind.JsonDeserializer JSON deserializer} for {@link io.oasp.gastronomy.restaurant.general.common.api.datatype.Money}.
 *
 * @author agreul
 */
public final class MoneyJsonDeserializer extends JsonDeserializer<Money> {

  /**
   * {@inheritDoc}
   */
  @Override
  public Money deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {

    BigDecimal value = jp.readValueAs(BigDecimal.class);
    if (value == null) {
      return null;
    } else {
      return new Money(value);
    }
  }

}
