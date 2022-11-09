package cds.gen.catalogservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.String;

@CdsName("CatalogService.UploadStatuses.texts")
public interface UploadStatusesTexts_ extends StructuredType<UploadStatusesTexts_> {
  String CDS_NAME = "CatalogService.UploadStatuses.texts";

  ElementRef<String> locale();

  ElementRef<String> name();

  ElementRef<String> descr();

  ElementRef<String> code();
}
