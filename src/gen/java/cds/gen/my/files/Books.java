package cds.gen.my.files;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;

@CdsName("my.files.Books")
public interface Books extends CdsData {
  String ID = "ID";

  String TITLE = "title";

  String STOCK = "stock";

  @CdsName(ID)
  Integer getId();

  @CdsName(ID)
  void setId(Integer id);

  String getTitle();

  void setTitle(String title);

  Integer getStock();

  void setStock(Integer stock);

  Books_ ref();

  static Books create() {
    return Struct.create(Books.class);
  }

  static Books create(Integer id) {
    Map<String, Object> keys = new HashMap<>();
    keys.put(ID, id);
    return Struct.access(keys).as(Books.class);
  }
}
