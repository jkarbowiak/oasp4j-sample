package io.oasp.gastronomy.restaurant.general.service.impl.rest;

import io.oasp.gastronomy.restaurant.general.common.api.datatype.Money;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * The {@link com.fasterxml.jackson.databind.JsonSerializer} for {@link io.oasp.gastronomy.restaurant.general.common.api.datatype.Money}.
 *
 * @author agreul
 */
public final class MoneyJsonSerializer extends JsonSerializer<Money> {

  /**
   * {@inheritDoc}
   */
  @Override
  public void serialize(Money value, JsonGenerator jgen, SerializerProvider provider) throws IOException {

    if (value != null) {
      jgen.writeString(value.getValue().toString());
    }
  }
}
