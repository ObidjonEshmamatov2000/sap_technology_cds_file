package cds.gen.my.files;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.String;

@CdsName("my.files.FileContent")
public interface FileContent_ extends StructuredType<FileContent_> {
  String CDS_NAME = "my.files.FileContent";

  ElementRef<String> ID();

  ElementRef<byte[]> content();
}
