package cds.gen.catalogservice;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;

/**
 * Represents information about performed readiness check.
 * In particular, can be provided as a content of a Readiness Check File.
 */
@CdsName("CatalogService.DataVolumeSnapshots")
public interface DataVolumeSnapshots extends CdsData {
  String ID = "ID";

  String READINESS_CHECK_FILE = "readinessCheckFile";

  String READINESS_CHECK_FILE_ID = "readinessCheckFile_ID";

  @CdsName(ID)
  String getId();

  @CdsName(ID)
  void setId(String id);

  ReadinessCheckFiles getReadinessCheckFile();

  void setReadinessCheckFile(Map<String, ?> readinessCheckFile);

  @CdsName(READINESS_CHECK_FILE_ID)
  String getReadinessCheckFileId();

  @CdsName(READINESS_CHECK_FILE_ID)
  void setReadinessCheckFileId(String readinessCheckFileId);

  DataVolumeSnapshots_ ref();

  static DataVolumeSnapshots create() {
    return Struct.create(DataVolumeSnapshots.class);
  }

  static DataVolumeSnapshots create(String id) {
    Map<String, Object> keys = new HashMap<>();
    keys.put(ID, id);
    return Struct.access(keys).as(DataVolumeSnapshots.class);
  }
}
