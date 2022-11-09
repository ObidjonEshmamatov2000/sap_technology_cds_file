package cds.gen.my.files;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Upload status of a readiness check file.
 */
@CdsName("my.files.UploadStatuses")
public interface UploadStatuses extends CdsData {
  String NAME = "name";

  String DESCR = "descr";

  String CODE = "code";

  String CRITICALITY = "criticality";

  String TEXTS = "texts";

  String LOCALIZED = "localized";

  String getName();

  void setName(String name);

  String getDescr();

  void setDescr(String descr);

  String getCode();

  void setCode(String code);

  String getCriticality();

  void setCriticality(String criticality);

  List<UploadStatusesTexts> getTexts();

  void setTexts(List<? extends Map<String, ?>> texts);

  UploadStatusesTexts getLocalized();

  void setLocalized(Map<String, ?> localized);

  UploadStatuses_ ref();

  static UploadStatuses create() {
    return Struct.create(UploadStatuses.class);
  }

  static UploadStatuses create(String code) {
    Map<String, Object> keys = new HashMap<>();
    keys.put(CODE, code);
    return Struct.access(keys).as(UploadStatuses.class);
  }
}
