package cds.gen.sap.common;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;

@CdsName("sap.common.Languages.texts")
public interface LanguagesTexts extends CdsData {
  String LOCALE = "locale";

  String NAME = "name";

  String DESCR = "descr";

  String CODE = "code";

  /**
   * Type for a language code
   */
  String getLocale();

  /**
   * Type for a language code
   */
  void setLocale(String locale);

  String getName();

  void setName(String name);

  String getDescr();

  void setDescr(String descr);

  /**
   * Type for a language code
   */
  String getCode();

  /**
   * Type for a language code
   */
  void setCode(String code);

  LanguagesTexts_ ref();

  static LanguagesTexts create() {
    return Struct.create(LanguagesTexts.class);
  }
}
