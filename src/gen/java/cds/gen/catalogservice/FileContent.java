package cds.gen.catalogservice;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;

@CdsName("CatalogService.FileContent")
public interface FileContent extends CdsData {
  String ID = "ID";

  String CONTENT = "content";

  @CdsName(ID)
  String getId();

  @CdsName(ID)
  void setId(String id);

  byte[] getContent();

  void setContent(byte[] content);

  FileContent_ ref();

  static FileContent create() {
    return Struct.create(FileContent.class);
  }

  static FileContent create(String id) {
    Map<String, Object> keys = new HashMap<>();
    keys.put(ID, id);
    return Struct.access(keys).as(FileContent.class);
  }
}
