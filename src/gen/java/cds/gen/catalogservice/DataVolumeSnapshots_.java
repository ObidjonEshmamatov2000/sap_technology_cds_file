package cds.gen.catalogservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.String;
import java.util.function.Function;

/**
 * Represents information about performed readiness check.
 * In particular, can be provided as a content of a Readiness Check File.
 */
@CdsName("CatalogService.DataVolumeSnapshots")
public interface DataVolumeSnapshots_ extends StructuredType<DataVolumeSnapshots_> {
  String CDS_NAME = "CatalogService.DataVolumeSnapshots";

  ElementRef<String> ID();

  ReadinessCheckFiles_ readinessCheckFile();

  ReadinessCheckFiles_ readinessCheckFile(Function<ReadinessCheckFiles_, CqnPredicate> filter);

  ElementRef<String> readinessCheckFile_ID();
}
