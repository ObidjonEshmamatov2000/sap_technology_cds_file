package cds.gen;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;
import java.time.Instant;

/**
 * Aspect for entities with temporal data
 *
 * See https://cap.cloud.sap/docs/cds/common#aspect-temporal
 */
@CdsName("temporal")
public interface Temporal extends CdsData {
  String VALID_FROM = "validFrom";

  String VALID_TO = "validTo";

  Instant getValidFrom();

  void setValidFrom(Instant validFrom);

  Instant getValidTo();

  void setValidTo(Instant validTo);

  static Temporal create() {
    return Struct.create(Temporal.class);
  }
}
