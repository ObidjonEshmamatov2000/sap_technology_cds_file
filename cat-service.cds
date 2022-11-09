using my.files as my from '../db/data-model';

service CatalogService {
    @readonly entity Books as projection on my.Books;
    @readonly entity FileInfo as projection on my.FileInfo;
    @readonly entity FileContent as projection on my.FileContent;
    @readonly entity DataVolumeSnapshots as projection on my.DataVolumeSnapshots;
    @readonly entity ReadinessCheckFiles as projection on my.ReadinessCheckFiles;
    @readonly entity UploadStatuses as projection on my.UploadStatuses;
}