package com.leosys.adwords.bu4.lead10.google_ads_api.jsons.response;

import java.util.List;

import com.leosys.adwords.bu4.lead10.jsons.response.IntResult;

public class MediaFileResults{
	
	public static class Report extends IntResult {
		
			private MediaFile mediaFile;
			
			public Report() {}
			
			public Report(int result, String description, MediaFile mediaFile) {
					super(result, description);
					this.mediaFile = mediaFile;
			}

			public MediaFile getMediaFile() {
					return mediaFile;
			}
	}
	
	public static class Reports extends IntResult {
		
			private List<MediaFile> mediaFiles;
			
			public Reports() {}
			
			public Reports(int result, String description, List<MediaFile> mediaFiles) {
					super(result, description);
					this.mediaFiles = mediaFiles;
			}

			public List<MediaFile> getMediaFiles() {
					return mediaFiles;
			}
	}
	
	public static class MediaFile{
			
			private long id;
			
			private String type;
			
			private String imageFullSizeImageUrl;
			
			private String imagePreviewSizeImageUrl;
			
			private String mimeType;
			
			private String sourceUrl;
			
			private String name;
			
			private Long fileSize;
			
			public MediaFile() {
			}

			public MediaFile(long id, String type, String imageFullSizeImageUrl, String imagePreviewSizeImageUrl,
					String mimeType, String sourceUrl, String name, Long fileSize) {
					this.id = id;
					this.type = type;
					this.imageFullSizeImageUrl = imageFullSizeImageUrl;
					this.imagePreviewSizeImageUrl = imagePreviewSizeImageUrl;
					this.mimeType = mimeType;
					this.sourceUrl = sourceUrl;
					this.name = name;
					this.fileSize = fileSize;
			}

			public long getId() {
				return id;
			}

			public String getType() {
				return type;
			}

			public String getImageFullSizeImageUrl() {
				return imageFullSizeImageUrl;
			}

			public String getImagePreviewSizeImageUrl() {
				return imagePreviewSizeImageUrl;
			}

			public String getMimeType() {
				return mimeType;
			}

			public String getSourceUrl() {
				return sourceUrl;
			}

			public String getName() {
				return name;
			}

			public Long getFileSize() {
				return fileSize;
			} 
	}
}
