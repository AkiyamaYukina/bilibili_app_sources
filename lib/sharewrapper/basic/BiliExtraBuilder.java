package com.bilibili.lib.sharewrapper.basic;

import android.os.Bundle;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/basic/BiliExtraBuilder.class */
public class BiliExtraBuilder {
    public static final String CALLBACK_URL = "share_callback_url";
    public static final String KEY_RESULT = "share_result";
    public static final String KEY_RESULT_ID = "share_to_id";
    public static final String KEY_RESULT_MESSAGE = "share_message";
    public static final String KEY_RESULT_WHERE = "share_to_where";
    public static final String KEY_TOPIC_ID = "share_from_topic_id";
    public static final String KEY_TOPIC_NAME = "share_from_topic_name";
    public static final int LANDSCAPE = 1;
    public static final int RESULT_CANCEL = 0;
    public static final int RESULT_FAIL = 2;
    public static final int RESULT_FROM_LOGIN = 3;
    public static final int RESULT_OK = 1;
    public static final String SHARE_APPENDTIME = "share_video_appendtime";
    public static final String SHARE_AUTHOR_ID = "share_author_id";
    public static final String SHARE_AUTHOR_NAME = "share_author_name";
    public static final String SHARE_BIZ_ID = "share_biz_id";
    public static final String SHARE_BIZ_NAME = "share_biz_name";
    public static final String SHARE_BIZ_TYPE = "share_biz_type";
    public static final String SHARE_CONTENT_ID = "share_content_id";
    public static final String SHARE_CONTENT_TYPE = "share_content_type";
    public static final String SHARE_CONTENT_URL = "share_content_url";
    public static final String SHARE_COVER_URL = "share_cover_url";
    public static final String SHARE_CTRL = "share_ctrl";
    public static final String SHARE_DESCRIPTION = "share_description";
    public static final String SHARE_EDIT_CONTENT = "share_edit_content";
    public static final String SHARE_EXTENSION = "share_extension";
    public static final String SHARE_EXTRA_DATA = "share_extra_data";
    public static final String SHARE_FROM = "share_from";
    public static final String SHARE_FROM_PROMPT_SCENE = "share_from_prompt_scene";
    public static final String SHARE_IMAGES = "share_images";
    public static final String SHARE_IMAGES_SUPPORT_ONLINE = "share_images_support_online";
    public static final String SHARE_IMG_PATH = "share_img_path";
    public static final String SHARE_INFO = "share_info";
    public static final String SHARE_LIVE_CARD_TYPE = "share_live_card_type";
    public static final String SHARE_MESSAGE_ORIENTATION = "share_message_orientation";
    public static final String SHARE_PAGE = "share_page";
    public static final String SHARE_PUBLISH = "share_publish";
    public static final String SHARE_REPOST_CODE = "share_repost_code";
    public static final String SHARE_REQUEST_CODE = "share_request_code";
    public static final String SHARE_SHOW_PUBLIC = "share_show_public";
    public static final String SHARE_SID = "share_sid";
    public static final String SHARE_SKETCH = "share_sketch";
    public static final String SHARE_TITLE = "share_title";
    public static final String SHARE_TRANSFORM_TYPE = "share_transform_type";
    public static final String SHARE_VIDEO_PATH = "share_video_path";
    public static final String SHARE_VIDEO_TAG = "share_video_tag";
    public static final String SHARE_VIDEO_TID = "share_video_tid";
    public static final int VERTICAL = 0;
    public static final int WHERE_ENDAN = 0;
    public static final int WHERE_GROUP_CHAT = 1;
    public static final int WHERE_SINGLE_CHAT = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f64425a = new Bundle();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/basic/BiliExtraBuilder$ContentType.class */
    @Target({ElementType.PARAMETER, ElementType.FIELD, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ContentType {
        public static final int ARTICLE = 6;
        public static final int ARTICLE_LIST = 26;
        public static final int BANGUMI = 7;
        public static final int CHEESE = 21;
        public static final int COMIC = 18;
        public static final int DOCUMENTARY = 16;
        public static final int DOMESTIC = 9;
        public static final int DYNAMIC = 11;
        public static final int GUOCHUANG = 17;
        public static final int IMAGE = 10;
        public static final int IMAGE_TEXT = 2;
        public static final int IM_COMMON = 23;
        public static final int LIVE = 4;
        public static final int MINI_APP = 20;
        public static final int MOVIE = 14;
        public static final int MUSIC = 8;
        public static final int OGV_EP = 22;
        public static final int OGV_V2 = 25;
        public static final int PLAYLIST = 19;
        public static final int PUBLISH = 13;
        public static final int TELEPLAY = 15;
        public static final int TEXT = 3;
        public static final int UGC_SEASON = 24;
        public static final int VIDEO_NORMAL = 5;
        public static final int WEB_CONTENT = 12;
    }

    public BiliExtraBuilder appendTime(boolean z6) {
        this.f64425a.putBoolean(SHARE_APPENDTIME, z6);
        return this;
    }

    public BiliExtraBuilder authorId(long j7) {
        this.f64425a.putLong(SHARE_AUTHOR_ID, j7);
        return this;
    }

    public BiliExtraBuilder authorName(String str) {
        this.f64425a.putString(SHARE_AUTHOR_NAME, str);
        return this;
    }

    public BiliExtraBuilder bizId(long j7) {
        this.f64425a.putLong(SHARE_BIZ_ID, j7);
        return this;
    }

    public BiliExtraBuilder bizName(String str) {
        this.f64425a.putString(SHARE_BIZ_NAME, str);
        return this;
    }

    public BiliExtraBuilder bizType(int i7) {
        this.f64425a.putLong(SHARE_BIZ_TYPE, i7);
        return this;
    }

    public Bundle build() {
        if (this.f64425a.getString(SHARE_FROM) == null) {
            from("create.share_component");
        }
        return this.f64425a;
    }

    public BiliExtraBuilder contentId(long j7) {
        this.f64425a.putLong(SHARE_CONTENT_ID, j7);
        return this;
    }

    public BiliExtraBuilder contentType(int i7) {
        this.f64425a.putInt(SHARE_CONTENT_TYPE, i7);
        return this;
    }

    public BiliExtraBuilder contentUrl(String str) {
        this.f64425a.putString(SHARE_CONTENT_URL, str);
        return this;
    }

    public BiliExtraBuilder cover(String str) {
        this.f64425a.putString(SHARE_COVER_URL, str);
        return this;
    }

    public BiliExtraBuilder ctrl(String str) {
        this.f64425a.putString(SHARE_CTRL, str);
        return this;
    }

    public BiliExtraBuilder description(String str) {
        this.f64425a.putString(SHARE_DESCRIPTION, str);
        return this;
    }

    public BiliExtraBuilder editContent(String str) {
        this.f64425a.putString(SHARE_EDIT_CONTENT, str);
        return this;
    }

    public BiliExtraBuilder extension(String str) {
        this.f64425a.putString(SHARE_EXTENSION, str);
        return this;
    }

    public BiliExtraBuilder extraData(Bundle bundle) {
        this.f64425a.putBundle(SHARE_EXTRA_DATA, bundle);
        return this;
    }

    public BiliExtraBuilder from(String str) {
        this.f64425a.putString(SHARE_FROM, str);
        return this;
    }

    public BiliExtraBuilder imgPath(String str) {
        this.f64425a.putString(SHARE_IMG_PATH, str);
        return this;
    }

    public BiliExtraBuilder localImages(String[] strArr) {
        this.f64425a.putStringArray(SHARE_IMAGES, strArr);
        return this;
    }

    public BiliExtraBuilder messageOrientation(int i7) {
        this.f64425a.putInt(SHARE_MESSAGE_ORIENTATION, i7);
        return this;
    }

    public BiliExtraBuilder page(int i7) {
        this.f64425a.putLong(SHARE_PAGE, i7);
        return this;
    }

    public BiliExtraBuilder promptScene(String str) {
        this.f64425a.putString(SHARE_FROM_PROMPT_SCENE, str);
        return this;
    }

    public BiliExtraBuilder publish(boolean z6) {
        this.f64425a.putBoolean(SHARE_PUBLISH, z6);
        return this;
    }

    public BiliExtraBuilder remoteImages(String str) {
        this.f64425a.putString(SHARE_IMAGES_SUPPORT_ONLINE, str);
        return this;
    }

    public BiliExtraBuilder repostCode(int i7) {
        this.f64425a.putInt(SHARE_REPOST_CODE, i7);
        return this;
    }

    public BiliExtraBuilder sId(long j7) {
        return sId(String.valueOf(j7));
    }

    public BiliExtraBuilder sId(String str) {
        this.f64425a.putString(SHARE_SID, str);
        return this;
    }

    public BiliExtraBuilder shareCallbackUrl(String str) {
        this.f64425a.putString(CALLBACK_URL, str);
        return this;
    }

    public BiliExtraBuilder shareInfoParam(String str) {
        this.f64425a.putString(SHARE_INFO, str);
        return this;
    }

    public BiliExtraBuilder showPublic(boolean z6) {
        this.f64425a.putBoolean(SHARE_SHOW_PUBLIC, z6);
        return this;
    }

    public BiliExtraBuilder sketchParam(String str) {
        this.f64425a.putString(SHARE_SKETCH, str);
        return this;
    }

    public BiliExtraBuilder title(String str) {
        this.f64425a.putString(SHARE_TITLE, str);
        return this;
    }

    public BiliExtraBuilder topicId(long j7) {
        this.f64425a.putLong(KEY_TOPIC_ID, j7);
        return this;
    }

    public BiliExtraBuilder topicName(String str) {
        this.f64425a.putString(KEY_TOPIC_NAME, str);
        return this;
    }

    public BiliExtraBuilder transFormType(boolean z6) {
        this.f64425a.putBoolean(SHARE_TRANSFORM_TYPE, z6);
        return this;
    }

    public BiliExtraBuilder videoPath(String str) {
        this.f64425a.putString(SHARE_VIDEO_PATH, str);
        return this;
    }

    public BiliExtraBuilder videoTag(ArrayList<String> arrayList) {
        this.f64425a.putSerializable(SHARE_VIDEO_TAG, arrayList);
        return this;
    }

    public BiliExtraBuilder videoTid(long j7) {
        this.f64425a.putLong(SHARE_VIDEO_TID, j7);
        return this;
    }
}
