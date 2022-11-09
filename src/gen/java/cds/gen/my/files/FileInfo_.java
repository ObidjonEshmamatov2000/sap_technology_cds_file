package cds.gen.my.files;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.Long;
import java.lang.String;

@CdsName("my.files.FileInfo")
public interface FileInfo_ extends StructuredType<FileInfo_> {
  String CDS_NAME = "my.files.FileInfo";

  ElementRef<String> ID();

  ElementRef<String> name();

  ElementRef<Long> size();

  ElementRef<String> date();
}
