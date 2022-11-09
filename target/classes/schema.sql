DROP VIEW IF EXISTS localized_fr_CatalogService_DataVolumeSnapshots;
DROP VIEW IF EXISTS localized_de_CatalogService_DataVolumeSnapshots;
DROP VIEW IF EXISTS localized_fr_CatalogService_ReadinessCheckFiles;
DROP VIEW IF EXISTS localized_de_CatalogService_ReadinessCheckFiles;
DROP VIEW IF EXISTS localized_fr_CatalogService_UploadStatuses;
DROP VIEW IF EXISTS localized_de_CatalogService_UploadStatuses;
DROP VIEW IF EXISTS localized_fr_my_files_DataVolumeSnapshots;
DROP VIEW IF EXISTS localized_de_my_files_DataVolumeSnapshots;
DROP VIEW IF EXISTS localized_fr_my_files_ReadinessCheckFiles;
DROP VIEW IF EXISTS localized_de_my_files_ReadinessCheckFiles;
DROP VIEW IF EXISTS localized_fr_my_files_UploadStatuses;
DROP VIEW IF EXISTS localized_de_my_files_UploadStatuses;
DROP VIEW IF EXISTS localized_CatalogService_DataVolumeSnapshots;
DROP VIEW IF EXISTS localized_CatalogService_ReadinessCheckFiles;
DROP VIEW IF EXISTS localized_CatalogService_UploadStatuses;
DROP VIEW IF EXISTS localized_my_files_DataVolumeSnapshots;
DROP VIEW IF EXISTS localized_my_files_ReadinessCheckFiles;
DROP VIEW IF EXISTS localized_my_files_UploadStatuses;
DROP VIEW IF EXISTS CatalogService_UploadStatuses_texts;
DROP VIEW IF EXISTS CatalogService_UploadStatuses;
DROP VIEW IF EXISTS CatalogService_ReadinessCheckFiles;
DROP VIEW IF EXISTS CatalogService_DataVolumeSnapshots;
DROP VIEW IF EXISTS CatalogService_FileContent;
DROP VIEW IF EXISTS CatalogService_FileInfo;
DROP VIEW IF EXISTS CatalogService_Books;

DROP TABLE IF EXISTS my_files_UploadStatuses_texts;
DROP TABLE IF EXISTS my_files_UploadStatuses;
DROP TABLE IF EXISTS my_files_ReadinessCheckFiles;
DROP TABLE IF EXISTS my_files_DataVolumeSnapshots;
DROP TABLE IF EXISTS my_files_FileContent;
DROP TABLE IF EXISTS my_files_FileInfo;
DROP TABLE IF EXISTS my_files_Books;

CREATE TABLE my_files_Books (
  ID INTEGER NOT NULL,
  title NVARCHAR(5000),
  stock INTEGER,
  PRIMARY KEY(ID)
);

CREATE TABLE my_files_FileInfo (
  ID NVARCHAR(5000) NOT NULL,
  name NVARCHAR(5000),
  size BIGINT,
  date NVARCHAR(5000),
  PRIMARY KEY(ID)
);

CREATE TABLE my_files_FileContent (
  ID NVARCHAR(5000) NOT NULL,
  content BINARY LARGE OBJECT,
  PRIMARY KEY(ID)
);

CREATE TABLE my_files_DataVolumeSnapshots (
  ID NVARCHAR(36) NOT NULL,
  readinessCheckFile_ID NVARCHAR(36),
  PRIMARY KEY(ID)
);

CREATE TABLE my_files_ReadinessCheckFiles (
  ID NVARCHAR(36) NOT NULL,
  createdAt TIMESTAMP(7),
  createdBy NVARCHAR(255),
  modifiedAt TIMESTAMP(7),
  modifiedBy NVARCHAR(255),
  file BINARY LARGE OBJECT,
  fileType NVARCHAR(5000),
  fileName NVARCHAR(50),
  notes NVARCHAR(255),
  systemId NVARCHAR(3),
  status_code NVARCHAR(1),
  clientId NVARCHAR(5),
  PRIMARY KEY(ID)
);

CREATE TABLE my_files_UploadStatuses (
  name NVARCHAR(255),
  descr NVARCHAR(1000),
  code NVARCHAR(1) NOT NULL,
  criticality NVARCHAR(20),
  PRIMARY KEY(code)
);

CREATE TABLE my_files_UploadStatuses_texts (
  locale NVARCHAR(14) NOT NULL,
  name NVARCHAR(255),
  descr NVARCHAR(1000),
  code NVARCHAR(1) NOT NULL,
  PRIMARY KEY(locale, code)
);

CREATE VIEW CatalogService_Books AS SELECT
  Books_0.ID,
  Books_0.title,
  Books_0.stock
FROM my_files_Books AS Books_0;

CREATE VIEW CatalogService_FileInfo AS SELECT
  FileInfo_0.ID,
  FileInfo_0.name,
  FileInfo_0.size,
  FileInfo_0.date
FROM my_files_FileInfo AS FileInfo_0;

CREATE VIEW CatalogService_FileContent AS SELECT
  FileContent_0.ID,
  FileContent_0.content
FROM my_files_FileContent AS FileContent_0;

CREATE VIEW CatalogService_DataVolumeSnapshots AS SELECT
  DataVolumeSnapshots_0.ID,
  DataVolumeSnapshots_0.readinessCheckFile_ID
FROM my_files_DataVolumeSnapshots AS DataVolumeSnapshots_0;

CREATE VIEW CatalogService_ReadinessCheckFiles AS SELECT
  ReadinessCheckFiles_0.ID,
  ReadinessCheckFiles_0.createdAt,
  ReadinessCheckFiles_0.createdBy,
  ReadinessCheckFiles_0.modifiedAt,
  ReadinessCheckFiles_0.modifiedBy,
  ReadinessCheckFiles_0.file,
  ReadinessCheckFiles_0.fileType,
  ReadinessCheckFiles_0.fileName,
  ReadinessCheckFiles_0.notes,
  ReadinessCheckFiles_0.systemId,
  ReadinessCheckFiles_0.status_code,
  ReadinessCheckFiles_0.clientId
FROM my_files_ReadinessCheckFiles AS ReadinessCheckFiles_0;

CREATE VIEW CatalogService_UploadStatuses AS SELECT
  UploadStatuses_0.name,
  UploadStatuses_0.descr,
  UploadStatuses_0.code,
  UploadStatuses_0.criticality
FROM my_files_UploadStatuses AS UploadStatuses_0;

CREATE VIEW CatalogService_UploadStatuses_texts AS SELECT
  texts_0.locale,
  texts_0.name,
  texts_0.descr,
  texts_0.code
FROM my_files_UploadStatuses_texts AS texts_0;

CREATE VIEW localized_my_files_UploadStatuses AS SELECT
  coalesce(localized_1.name, L_0.name) AS name,
  coalesce(localized_1.descr, L_0.descr) AS descr,
  L_0.code,
  L_0.criticality
FROM (my_files_UploadStatuses AS L_0 LEFT JOIN my_files_UploadStatuses_texts AS localized_1 ON localized_1.code = L_0.code AND localized_1.locale = 'en');

CREATE VIEW localized_my_files_ReadinessCheckFiles AS SELECT
  L.ID,
  L.createdAt,
  L.createdBy,
  L.modifiedAt,
  L.modifiedBy,
  L.file,
  L.fileType,
  L.fileName,
  L.notes,
  L.systemId,
  L.status_code,
  L.clientId
FROM my_files_ReadinessCheckFiles AS L;

CREATE VIEW localized_my_files_DataVolumeSnapshots AS SELECT
  L.ID,
  L.readinessCheckFile_ID
FROM my_files_DataVolumeSnapshots AS L;

CREATE VIEW localized_CatalogService_UploadStatuses AS SELECT
  UploadStatuses_0.name,
  UploadStatuses_0.descr,
  UploadStatuses_0.code,
  UploadStatuses_0.criticality
FROM localized_my_files_UploadStatuses AS UploadStatuses_0;

CREATE VIEW localized_CatalogService_ReadinessCheckFiles AS SELECT
  ReadinessCheckFiles_0.ID,
  ReadinessCheckFiles_0.createdAt,
  ReadinessCheckFiles_0.createdBy,
  ReadinessCheckFiles_0.modifiedAt,
  ReadinessCheckFiles_0.modifiedBy,
  ReadinessCheckFiles_0.file,
  ReadinessCheckFiles_0.fileType,
  ReadinessCheckFiles_0.fileName,
  ReadinessCheckFiles_0.notes,
  ReadinessCheckFiles_0.systemId,
  ReadinessCheckFiles_0.status_code,
  ReadinessCheckFiles_0.clientId
FROM localized_my_files_ReadinessCheckFiles AS ReadinessCheckFiles_0;

CREATE VIEW localized_CatalogService_DataVolumeSnapshots AS SELECT
  DataVolumeSnapshots_0.ID,
  DataVolumeSnapshots_0.readinessCheckFile_ID
FROM localized_my_files_DataVolumeSnapshots AS DataVolumeSnapshots_0;

CREATE VIEW localized_de_my_files_UploadStatuses AS SELECT
  coalesce(localized_de_1.name, L_0.name) AS name,
  coalesce(localized_de_1.descr, L_0.descr) AS descr,
  L_0.code,
  L_0.criticality
FROM (my_files_UploadStatuses AS L_0 LEFT JOIN my_files_UploadStatuses_texts AS localized_de_1 ON localized_de_1.code = L_0.code AND localized_de_1.locale = 'de');

CREATE VIEW localized_fr_my_files_UploadStatuses AS SELECT
  coalesce(localized_fr_1.name, L_0.name) AS name,
  coalesce(localized_fr_1.descr, L_0.descr) AS descr,
  L_0.code,
  L_0.criticality
FROM (my_files_UploadStatuses AS L_0 LEFT JOIN my_files_UploadStatuses_texts AS localized_fr_1 ON localized_fr_1.code = L_0.code AND localized_fr_1.locale = 'fr');

CREATE VIEW localized_de_my_files_ReadinessCheckFiles AS SELECT
  L.ID,
  L.createdAt,
  L.createdBy,
  L.modifiedAt,
  L.modifiedBy,
  L.file,
  L.fileType,
  L.fileName,
  L.notes,
  L.systemId,
  L.status_code,
  L.clientId
FROM my_files_ReadinessCheckFiles AS L;

CREATE VIEW localized_fr_my_files_ReadinessCheckFiles AS SELECT
  L.ID,
  L.createdAt,
  L.createdBy,
  L.modifiedAt,
  L.modifiedBy,
  L.file,
  L.fileType,
  L.fileName,
  L.notes,
  L.systemId,
  L.status_code,
  L.clientId
FROM my_files_ReadinessCheckFiles AS L;

CREATE VIEW localized_de_my_files_DataVolumeSnapshots AS SELECT
  L.ID,
  L.readinessCheckFile_ID
FROM my_files_DataVolumeSnapshots AS L;

CREATE VIEW localized_fr_my_files_DataVolumeSnapshots AS SELECT
  L.ID,
  L.readinessCheckFile_ID
FROM my_files_DataVolumeSnapshots AS L;

CREATE VIEW localized_de_CatalogService_UploadStatuses AS SELECT
  UploadStatuses_0.name,
  UploadStatuses_0.descr,
  UploadStatuses_0.code,
  UploadStatuses_0.criticality
FROM localized_de_my_files_UploadStatuses AS UploadStatuses_0;

CREATE VIEW localized_fr_CatalogService_UploadStatuses AS SELECT
  UploadStatuses_0.name,
  UploadStatuses_0.descr,
  UploadStatuses_0.code,
  UploadStatuses_0.criticality
FROM localized_fr_my_files_UploadStatuses AS UploadStatuses_0;

CREATE VIEW localized_de_CatalogService_ReadinessCheckFiles AS SELECT
  ReadinessCheckFiles_0.ID,
  ReadinessCheckFiles_0.createdAt,
  ReadinessCheckFiles_0.createdBy,
  ReadinessCheckFiles_0.modifiedAt,
  ReadinessCheckFiles_0.modifiedBy,
  ReadinessCheckFiles_0.file,
  ReadinessCheckFiles_0.fileType,
  ReadinessCheckFiles_0.fileName,
  ReadinessCheckFiles_0.notes,
  ReadinessCheckFiles_0.systemId,
  ReadinessCheckFiles_0.status_code,
  ReadinessCheckFiles_0.clientId
FROM localized_de_my_files_ReadinessCheckFiles AS ReadinessCheckFiles_0;

CREATE VIEW localized_fr_CatalogService_ReadinessCheckFiles AS SELECT
  ReadinessCheckFiles_0.ID,
  ReadinessCheckFiles_0.createdAt,
  ReadinessCheckFiles_0.createdBy,
  ReadinessCheckFiles_0.modifiedAt,
  ReadinessCheckFiles_0.modifiedBy,
  ReadinessCheckFiles_0.file,
  ReadinessCheckFiles_0.fileType,
  ReadinessCheckFiles_0.fileName,
  ReadinessCheckFiles_0.notes,
  ReadinessCheckFiles_0.systemId,
  ReadinessCheckFiles_0.status_code,
  ReadinessCheckFiles_0.clientId
FROM localized_fr_my_files_ReadinessCheckFiles AS ReadinessCheckFiles_0;

CREATE VIEW localized_de_CatalogService_DataVolumeSnapshots AS SELECT
  DataVolumeSnapshots_0.ID,
  DataVolumeSnapshots_0.readinessCheckFile_ID
FROM localized_de_my_files_DataVolumeSnapshots AS DataVolumeSnapshots_0;

CREATE VIEW localized_fr_CatalogService_DataVolumeSnapshots AS SELECT
  DataVolumeSnapshots_0.ID,
  DataVolumeSnapshots_0.readinessCheckFile_ID
FROM localized_fr_my_files_DataVolumeSnapshots AS DataVolumeSnapshots_0;

