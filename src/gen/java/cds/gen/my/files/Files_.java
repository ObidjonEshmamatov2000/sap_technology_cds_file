package cds.gen.my.files;

import com.sap.cds.ql.CdsName;
import java.lang.Class;
import java.lang.String;

@CdsName("my.files")
public interface Files_ {
  String CDS_NAME = "my.files";

  Class<FileInfo_> FILE_INFO = FileInfo_.class;

  Class<ReadinessCheckFiles_> READINESS_CHECK_FILES = ReadinessCheckFiles_.class;

  Class<DataVolumeSnapshots_> DATA_VOLUME_SNAPSHOTS = DataVolumeSnapshots_.class;

  Class<UploadStatusesTexts_> UPLOAD_STATUSES_TEXTS = UploadStatusesTexts_.class;

  Class<FileContent_> FILE_CONTENT = FileContent_.class;

  Class<Books_> BOOKS = Books_.class;

  Class<UploadStatuses_> UPLOAD_STATUSES = UploadStatuses_.class;
}
