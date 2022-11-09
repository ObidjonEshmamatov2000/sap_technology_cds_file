package cds.gen.catalogservice;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Long;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;

@CdsName("CatalogService.FileInfo")
public interface FileInfo extends CdsData {
  String ID = "ID";

  String NAME = "name";

  String SIZE = "size";

  String DATE = "date";

  @CdsName(ID)
  String getId();

  @CdsName(ID)
  void setId(String id);

  String getName();

  void setName(String name);

  Long getSize();

  void setSize(Long size);

  String getDate();

  void setDate(String date);

  FileInfo_ ref();

  static FileInfo create() {
    return Struct.create(FileInfo.class);
  }

  static FileInfo create(String id) {
    Map<String, Object> keys = new HashMap<>();
    keys.put(ID, id);
    return Struct.access(keys).as(FileInfo.class);
  }
}
