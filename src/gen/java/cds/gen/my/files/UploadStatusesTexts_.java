package cds.gen.my.files;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.String;

@CdsName("my.files.UploadStatuses.texts")
public interface UploadStatusesTexts_ extends StructuredType<UploadStatusesTexts_> {
  String CDS_NAME = "my.files.UploadStatuses.texts";

  ElementRef<String> locale();

  ElementRef<String> name();

  ElementRef<String> descr();

  ElementRef<String> code();
}
