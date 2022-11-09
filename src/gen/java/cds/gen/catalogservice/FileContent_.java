package cds.gen.catalogservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.String;

@CdsName("CatalogService.FileContent")
public interface FileContent_ extends StructuredType<FileContent_> {
  String CDS_NAME = "CatalogService.FileContent";

  ElementRef<String> ID();

  ElementRef<byte[]> content();
}
