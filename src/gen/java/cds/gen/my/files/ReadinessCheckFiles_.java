package cds.gen.my.files;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.io.InputStream;
import java.lang.String;
import java.time.Instant;
import java.util.function.Function;

/**
 * Represents information about readiness check files.
 * The content of a file is represented by DataVolumeSnaphot entity.
 */
@CdsName("my.files.ReadinessCheckFiles")
public interface ReadinessCheckFiles_ extends StructuredType<ReadinessCheckFiles_> {
  String CDS_NAME = "my.files.ReadinessCheckFiles";

  ElementRef<String> ID();

  ElementRef<Instant> createdAt();

  ElementRef<String> createdBy();

  ElementRef<Instant> modifiedAt();

  ElementRef<String> modifiedBy();

  ElementRef<InputStream> file();

  ElementRef<String> fileType();

  ElementRef<String> fileName();

  ElementRef<String> notes();

  ElementRef<String> systemId();

  UploadStatuses_ status();

  UploadStatuses_ status(Function<UploadStatuses_, CqnPredicate> filter);

  ElementRef<String> status_code();

  ElementRef<String> clientId();
}
