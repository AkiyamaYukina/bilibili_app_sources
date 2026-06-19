package com.bilibili.lib.sharewrapper.basic;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.URLUtil;
import androidx.annotation.DrawableRes;
import com.bilibili.lib.sharewrapper.selector.SharePlatform;
import com.bilibili.lib.sharewrapper.util.SessionManager;
import java.net.URI;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/basic/ThirdPartyExtraBuilder.class */
public class ThirdPartyExtraBuilder {
    public static final String CALLBACK_URL = "callback_url";
    public static final String CLIENT_NAME = "client_name";
    public static final String DEFAULT_IMAGE_RES = "defaultImage";
    public static final String KEY_RESULT = "result";
    public static final String KEY_SHARE_IMAGE_CACHE_PATH = "key_share_image_cache_path";
    public static final String META_INFO_SPMID = "meta_info_spmid";
    public static final int MINIPROGRAM_TYPE_PREVIEW = 2;
    public static final int MINIPROGRAM_TYPE_TEST = 1;
    public static final int MINIPTOGRAM_TYPE_RELEASE = 0;
    public static final String MIN_PROGRAM_TYPE = "min_program_type";
    public static final String PARAMS_SUPPORT_MLP_TASK = "params_support_multiple_task";
    public static final String PARAMS_TYPE_AUDIO = "type_audio";

    @Deprecated
    public static final String PARAMS_TYPE_IMAGE = "type_image";
    public static final String PARAMS_TYPE_MIN_PROGRAM = "type_min_program";
    public static final String PARAMS_TYPE_PURE_IMAGE = "type_pure_image";
    public static final String PARAMS_TYPE_TEXT = "type_text";
    public static final String PARAMS_TYPE_TOAST = "type_toast";
    public static final String PARAMS_TYPE_VIDEO = "type_video";
    public static final String PARAMS_TYPE_WEB = "type_web";
    public static final String PLATFORM = "platform";
    public static final int RESULT_CANCEL = 0;
    public static final int RESULT_FAIL = 2;
    public static final int RESULT_OK = 1;
    public static final String SHARE_PARAMS_CONTENT = "params_content";
    public static final String SHARE_PARAMS_HEADER = "params_header";
    public static final String SHARE_PARAMS_IMAGE_BMP = "image_bmp";
    public static final String SHARE_PARAMS_IMAGE_PATH = "image_path";
    public static final String SHARE_PARAMS_IMAGE_RES = "image_res";
    public static final String SHARE_PARAMS_IMAGE_TAG = "image_tag";
    public static final String SHARE_PARAMS_IMAGE_URL = "image_url";
    public static final String SHARE_PARAMS_MEDIA_SRC_UEL = "params_media_src_url";
    public static final String SHARE_PARAMS_PROGRAM_ID = "params_program_id";
    public static final String SHARE_PARAMS_PROGRAM_PATH = "params_program_path";
    public static final String SHARE_PARAMS_SCHEME = "params_scheme";
    public static final String SHARE_PARAMS_SHOW_PROGRESS_TOAST = "params_show_progress_toast";
    public static final String SHARE_PARAMS_SINA_CONTENT_APPEND_URL = "params_sina_content_append_url";
    public static final String SHARE_PARAMS_TITLE = "params_title";
    public static final String SHARE_PARAMS_TYPE = "params_type";
    public static final String SHARE_PARAMS_URL = "params_target_url";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f64426a = new Bundle();

    public static String appendUri(String str, String str2) {
        try {
            URI uri = new URI(str);
            String query = uri.getQuery();
            if (query != null) {
                str2 = query + "&" + str2;
            }
            str = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), str2, uri.getFragment()).toString();
        } catch (Exception e7) {
        }
        return str;
    }

    public Bundle build() {
        return this.f64426a;
    }

    public ThirdPartyExtraBuilder clientName(String str) {
        this.f64426a.putString(CLIENT_NAME, str);
        SharePlatform.allPlatforms();
        return this;
    }

    public ThirdPartyExtraBuilder content(String str) {
        this.f64426a.putString(SHARE_PARAMS_CONTENT, str);
        return this;
    }

    public ThirdPartyExtraBuilder defaultImage(@DrawableRes int i7) {
        this.f64426a.putInt(DEFAULT_IMAGE_RES, i7);
        return this;
    }

    public ThirdPartyExtraBuilder header(String str) {
        this.f64426a.putString(SHARE_PARAMS_HEADER, str);
        return this;
    }

    public ThirdPartyExtraBuilder imageBmp(Bitmap bitmap) {
        this.f64426a.putParcelable(SHARE_PARAMS_IMAGE_BMP, bitmap);
        return this;
    }

    public ThirdPartyExtraBuilder imagePath(String str) {
        this.f64426a.putString("image_path", str);
        return this;
    }

    public ThirdPartyExtraBuilder imageRes(@DrawableRes int i7) {
        this.f64426a.putInt(SHARE_PARAMS_IMAGE_RES, i7);
        return this;
    }

    public ThirdPartyExtraBuilder imageTag(Bundle bundle) {
        this.f64426a.putBundle(SHARE_PARAMS_IMAGE_TAG, bundle);
        return this;
    }

    public ThirdPartyExtraBuilder imageUrl(String str) {
        this.f64426a.putString(SHARE_PARAMS_IMAGE_URL, str);
        return this;
    }

    public ThirdPartyExtraBuilder mediaSrcUrl(String str) {
        this.f64426a.putString(SHARE_PARAMS_MEDIA_SRC_UEL, str);
        return this;
    }

    public ThirdPartyExtraBuilder platform(String str) {
        this.f64426a.putString("platform", str);
        return this;
    }

    public ThirdPartyExtraBuilder programId(String str) {
        this.f64426a.putString(SHARE_PARAMS_PROGRAM_ID, str);
        return this;
    }

    public ThirdPartyExtraBuilder programPath(String str) {
        this.f64426a.putString(SHARE_PARAMS_PROGRAM_PATH, str);
        return this;
    }

    public ThirdPartyExtraBuilder programType(Context context, int i7) {
        if (i7 != 0 && (context.getApplicationInfo().flags & 2) == 0) {
            throw new IllegalArgumentException("The type of mini program must be release version in release apk.");
        }
        this.f64426a.putInt(MIN_PROGRAM_TYPE, i7);
        return this;
    }

    public ThirdPartyExtraBuilder scheme(String str) {
        this.f64426a.putString(SHARE_PARAMS_SCHEME, str);
        return this;
    }

    public ThirdPartyExtraBuilder shareType(String str) {
        this.f64426a.putString(SHARE_PARAMS_TYPE, str);
        return this;
    }

    public ThirdPartyExtraBuilder supportMtpTask(boolean z6) {
        this.f64426a.putBoolean(PARAMS_SUPPORT_MLP_TASK, z6);
        return this;
    }

    public ThirdPartyExtraBuilder targetUrl(String str) {
        String strAppendUri = str;
        if (str != null) {
            try {
                SessionManager sessionManager = SessionManager.INSTANCE;
                strAppendUri = str;
                if (!sessionManager.getSessionId().isEmpty()) {
                    strAppendUri = str;
                    if (URLUtil.isValidUrl(str)) {
                        strAppendUri = appendUri(str, "share_session_id=" + sessionManager.getSessionId());
                    }
                }
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        }
        this.f64426a.putString(SHARE_PARAMS_URL, strAppendUri);
        return this;
    }

    public ThirdPartyExtraBuilder title(String str) {
        this.f64426a.putString(SHARE_PARAMS_TITLE, str);
        return this;
    }
}
