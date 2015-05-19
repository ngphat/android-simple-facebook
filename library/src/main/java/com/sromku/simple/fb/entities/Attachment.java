package com.sromku.simple.fb.entities;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Media content associated with a story or comment.
 *
 * // @see https://developers.facebook.com/docs/graph-api/reference/story_attachment
 */
public class Attachment {

	private static final String DATA = "data";
	private static final String DESCRIPTION = "description";
	private static final String DESCRIPTION_TAGS = "description_tags";
	private static final String MEDIA = "media";
	private static final String SUBATTACHMENTS = "subattachments";
	private static final String TARGET = "target";
	private static final String TITLE = "title";
	private static final String TYPE = "type";
	private static final String URL = "url";

    @SerializedName(DESCRIPTION)
	private String mDescription;

    @SerializedName(DESCRIPTION_TAGS)
	private List<Profile> mDescriptionTags;

    @SerializedName(MEDIA)
	private StoryAttachmentMedia mMedia;

    @SerializedName(SUBATTACHMENTS)
	private List<Attachment> mSubAttachments;

    @SerializedName(TARGET)
	private StoryAttachmentTarget mTarget;

    @SerializedName(TITLE)
	private String mTitle;

    @SerializedName(TYPE)
	private String mType;

    @SerializedName(URL)
	private String mUrl;

//	private Attachment(GraphObject graphObject) {
//
//		if (graphObject == null)
//			return;
//
//		// description
//		mDescription = Utils.getPropertyString(graphObject, DESCRIPTION);
//
//		// description_tags
//		mDescriptionTags = Utils.createList(graphObject, DESCRIPTION_TAGS, DATA, new Converter<Profile>() {
//			@Override
//			public Profile convert(GraphObject graphObject) {
//				return Profile.create(graphObject);
//			}
//		});
//
//		// media
//		mMedia = StoryAttachmentMedia.create(Utils.getPropertyGraphObject(graphObject, MEDIA));
//
//		// target
//		mTarget = StoryAttachmentTarget.create(Utils.getPropertyGraphObject(graphObject, TARGET));
//
//		// subattachments
//		mSubAttachments = Utils.createList(graphObject, SUBATTACHMENTS, DATA, new Converter<Attachment>() {
//			@Override
//			public Attachment convert(GraphObject graphObject) {
//				return Attachment.create(graphObject);
//			}
//		});
//
//		// type
//		mTitle = Utils.getPropertyString(graphObject, TITLE);
//
//		// type
//		mType = Utils.getPropertyString(graphObject, TYPE);
//
//		// type
//		mUrl = Utils.getPropertyString(graphObject, URL);
//	}
//
//	public static Attachment create(GraphObject graphObject) {
//		return new Attachment(graphObject);
//	}

	public String getDescription() {
		return mDescription;
	}

	public StoryAttachmentMedia getMedia() {
		return mMedia;
	}

	public List<Attachment> getSubAttachments() {
		return mSubAttachments;
	}

	public StoryAttachmentTarget getTarget() {
		return mTarget;
	}

	public String getTitle() {
		return mTitle;
	}

	public String getType() {
		return mType;
	}

	public String getUrl() {
		return mUrl;
	}

	public static class StoryAttachmentMedia {

		private static final String IMAGE = "image";

        @SerializedName(IMAGE)
		private Image mImage;

//		private StoryAttachmentMedia(GraphObject graphObject) {
//			mImage = Image.create(Utils.getPropertyGraphObject(graphObject, IMAGE));
//		}
//
//		public static StoryAttachmentMedia create(GraphObject graphObject) {
//			return new StoryAttachmentMedia(graphObject);
//		}

		public Image getImage() {
			return mImage;
		}
	}

	public static class StoryAttachmentTarget {

		private static final String ID = "id";
		private static final String URL = "url";

        @SerializedName(ID)
		private String mId;

        @SerializedName(URL)
		private String mUrl;

//		private StoryAttachmentTarget(GraphObject graphObject) {
//			mId = Utils.getPropertyString(graphObject, ID);
//			mUrl = Utils.getPropertyString(graphObject, URL);
//		}
//
//		public static StoryAttachmentTarget create(GraphObject graphObject) {
//			return new StoryAttachmentTarget(graphObject);
//		}

		public String getId() {
			return mId;
		}

		public String getUrl() {
			return mUrl;
		}
	}
}
