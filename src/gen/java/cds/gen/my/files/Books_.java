package cds.gen.my.files;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.Integer;
import java.lang.String;

@CdsName("my.files.Books")
public interface Books_ extends StructuredType<Books_> {
  String CDS_NAME = "my.files.Books";

  ElementRef<Integer> ID();

  ElementRef<String> title();

  ElementRef<Integer> stock();
}
