package cds.gen.catalogservice;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.io.InputStream;
import java.lang.String;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

/**
 * Represents information about readiness check files.
 * The content of a file is represented by DataVolumeSnaphot entity.
 */
@CdsName("CatalogService.ReadinessCheckFiles")
public interface ReadinessCheckFiles extends CdsData {
  String ID = "ID";

  String CREATED_AT = "createdAt";

  String CREATED_BY = "createdBy";

  String MODIFIED_AT = "modifiedAt";

  String MODIFIED_BY = "modifiedBy";

  String FILE = "file";

  String FILE_TYPE = "fileType";

  String FILE_NAME = "fileName";

  String NOTES = "notes";

  String SYSTEM_ID = "systemId";

  String STATUS = "status";

  String STATUS_CODE = "status_code";

  String CLIENT_ID = "clientId";

  @CdsName(ID)
  String getId();

  @CdsName(ID)
  void setId(String id);

  Instant getCreatedAt();

  void setCreatedAt(Instant createdAt);

  /**
   * Canonical user ID
   */
  String getCreatedBy();

  /**
   * Canonical user ID
   */
  void setCreatedBy(String createdBy);

  Instant getModifiedAt();

  void setModifiedAt(Instant modifiedAt);

  /**
   * Canonical user ID
   */
  String getModifiedBy();

  /**
   * Canonical user ID
   */
  void setModifiedBy(String modifiedBy);

  InputStream getFile();

  void setFile(InputStream file);

  String getFileType();

  void setFileType(String fileType);

  String getFileName();

  void setFileName(String fileName);

  String getNotes();

  void setNotes(String notes);

  String getSystemId();

  void setSystemId(String systemId);

  UploadStatuses getStatus();

  void setStatus(Map<String, ?> status);

  @CdsName(STATUS_CODE)
  String getStatusCode();

  @CdsName(STATUS_CODE)
  void setStatusCode(String statusCode);

  String getClientId();

  void setClientId(String clientId);

  ReadinessCheckFiles_ ref();

  static ReadinessCheckFiles create() {
    return Struct.create(ReadinessCheckFiles.class);
  }

  static ReadinessCheckFiles create(String id) {
    Map<String, Object> keys = new HashMap<>();
    keys.put(ID, id);
    return Struct.access(keys).as(ReadinessCheckFiles.class);
  }
}
