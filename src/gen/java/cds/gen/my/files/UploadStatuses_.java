package cds.gen.my.files;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.String;
import java.util.function.Function;

/**
 * Upload status of a readiness check file.
 */
@CdsName("my.files.UploadStatuses")
public interface UploadStatuses_ extends StructuredType<UploadStatuses_> {
  String CDS_NAME = "my.files.UploadStatuses";

  ElementRef<String> name();

  ElementRef<String> descr();

  ElementRef<String> code();

  ElementRef<String> criticality();

  UploadStatusesTexts_ texts();

  UploadStatusesTexts_ texts(Function<UploadStatusesTexts_, CqnPredicate> filter);

  UploadStatusesTexts_ localized();

  UploadStatusesTexts_ localized(Function<UploadStatusesTexts_, CqnPredicate> filter);
}
