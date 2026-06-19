package com.bilibili.opd.app.bizcommon.imageselector.page;

import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.JSON;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/MallMediaParams.class */
@StabilityInferred(parameters = 0)
@Keep
public final class MallMediaParams {
    public static final int $stable = 8;

    @NotNull
    public static final String BKEY_MALL_MEDIA_PARAMS = "bundle_key_mall_media_params";

    @NotNull
    public static final String BKEY_SCENE_TYPE = "sceneType";

    @NotNull
    public static final a Companion = new Object();

    @JvmField
    @NotNull
    public static final MallMediaParams DEFAULT = new MallMediaParams();

    @NotNull
    public static final String DOMAIN_UP_TYPE_DEF = "mall";
    public static final int MAX_SELECT_COUNT = 9;
    public static final int MIN_SELECT_COUNT = 1;

    @NotNull
    public static final String VIDEO_PROFILE_DEF = "ugcupos/mall-android";
    private boolean isModifyText;
    private boolean isNeedText;
    private boolean isSync;
    private long maxVideoSize;
    private boolean showSkip;
    private int tabIndex;
    private long text2ImgTemplateId;
    private int version;
    private boolean videoCameraEnable;
    private boolean videoEnable;

    @NotNull
    private String sceneType = "";

    @NotNull
    private String domain = "";

    @NotNull
    private String domainUpType = "mall";

    @NotNull
    private String videoProfile = VIDEO_PROFILE_DEF;
    private boolean cameraEnable = true;
    private boolean imageCameraEnable = true;
    private int maxImageCount = 9;
    private int minImageCount = 1;
    private boolean isOriginalMedia = true;
    private boolean originalMediaButtonEnable = true;

    @NotNull
    private String hintMsg = "";
    private boolean imageEnable = true;
    private boolean editVideoEnable = true;
    private boolean isNeedUpload = true;

    @NotNull
    private String text2ImgContent = "";

    @NotNull
    private String text2ImgUrl = "";

    @NotNull
    private String bossUploadUrl = "";

    @NotNull
    private String bossKey = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/MallMediaParams$Builder.class */
    @StabilityInferred(parameters = 0)
    public static final class Builder {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f73806a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f73809d;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f73818n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public long f73820p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f73821q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f73822r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f73824t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f73825u;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public long f73828x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public boolean f73829y;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f73807b = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f73808c = true;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f73810e = 9;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f73811f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f73812g = true;
        public boolean h = true;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public String f73813i = "";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public String f73814j = "";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public String f73815k = "mall";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        public String f73816l = MallMediaParams.VIDEO_PROFILE_DEF;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f73817m = true;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f73819o = true;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f73823s = true;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @NotNull
        public String f73826v = "";

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @NotNull
        public String f73827w = "";

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        @NotNull
        public String f73830z = "";

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        @NotNull
        public String f73805A = "";

        @NotNull
        public final Builder bossKey(@NotNull String str) {
            this.f73805A = str;
            return this;
        }

        @NotNull
        public final Builder bossUploadUrl(@NotNull String str) {
            this.f73830z = str;
            return this;
        }

        @NotNull
        public final MallMediaParams build() {
            MallMediaParams mallMediaParams = new MallMediaParams();
            mallMediaParams.setVersion(this.f73806a);
            mallMediaParams.setCameraEnable(this.f73807b);
            mallMediaParams.setImageCameraEnable(this.f73808c);
            mallMediaParams.setVideoCameraEnable(this.f73809d);
            mallMediaParams.setMaxImageCount(this.f73810e);
            mallMediaParams.setMinImageCount(this.f73811f);
            mallMediaParams.setOriginalMedia(this.f73812g);
            mallMediaParams.setOriginalMediaButtonEnable(this.h);
            mallMediaParams.setSceneType(this.f73813i);
            mallMediaParams.setDomain(this.f73814j);
            mallMediaParams.setDomainUpType(this.f73815k);
            mallMediaParams.setVideoProfile(this.f73816l);
            mallMediaParams.setImageEnable(this.f73817m);
            mallMediaParams.setVideoEnable(this.f73818n);
            mallMediaParams.setEditVideoEnable(this.f73819o);
            mallMediaParams.setMaxVideoSize(this.f73820p);
            mallMediaParams.setShowSkip(this.f73821q);
            mallMediaParams.setSync(this.f73822r);
            mallMediaParams.setNeedUpload(this.f73823s);
            mallMediaParams.setNeedText(this.f73824t);
            mallMediaParams.setTabIndex(this.f73825u);
            mallMediaParams.setText2ImgContent(this.f73826v);
            mallMediaParams.setText2ImgUrl(this.f73827w);
            mallMediaParams.setText2ImgTemplateId(this.f73828x);
            mallMediaParams.setModifyText(this.f73829y);
            mallMediaParams.setBossUploadUrl(this.f73830z);
            mallMediaParams.setBossKey(this.f73805A);
            return mallMediaParams;
        }

        @NotNull
        public final Builder bundle(@Nullable Bundle bundle) {
            return this;
        }

        @NotNull
        public final Builder cameraEnable(boolean z6) {
            this.f73807b = z6;
            return this;
        }

        @NotNull
        public final Builder domain(@NotNull String str) {
            this.f73814j = str;
            return this;
        }

        @NotNull
        public final Builder domainUpType(@NotNull String str) {
            this.f73815k = str;
            return this;
        }

        @NotNull
        public final Builder editVideoEnable(boolean z6) {
            this.f73819o = z6;
            return this;
        }

        @NotNull
        public final Builder imageCameraEnable(boolean z6) {
            this.f73808c = z6;
            return this;
        }

        @NotNull
        public final Builder imageEnable(boolean z6) {
            this.f73817m = z6;
            return this;
        }

        @NotNull
        public final Builder isModifyText(boolean z6) {
            this.f73829y = z6;
            return this;
        }

        @NotNull
        public final Builder isNeedText(boolean z6) {
            this.f73824t = z6;
            return this;
        }

        @NotNull
        public final Builder isNeedUpload(boolean z6) {
            this.f73823s = z6;
            return this;
        }

        @NotNull
        public final Builder isOriginalMedia(boolean z6) {
            this.f73812g = z6;
            return this;
        }

        @NotNull
        public final Builder isSync(boolean z6) {
            this.f73822r = z6;
            return this;
        }

        @NotNull
        public final Builder maxImageCount(int i7) {
            this.f73810e = i7;
            return this;
        }

        @NotNull
        public final Builder maxVideoSize(long j7) {
            this.f73820p = j7;
            return this;
        }

        @NotNull
        public final Builder minImageCount(int i7) {
            this.f73811f = i7;
            return this;
        }

        @NotNull
        public final Builder originalMediaButtonEnable(boolean z6) {
            this.h = z6;
            return this;
        }

        @NotNull
        public final Builder sceneType(@NotNull String str) {
            this.f73813i = str;
            return this;
        }

        @NotNull
        public final Builder showSkip(boolean z6) {
            this.f73821q = z6;
            return this;
        }

        @NotNull
        public final Builder tabIndex(int i7) {
            this.f73825u = i7;
            return this;
        }

        @NotNull
        public final Builder text2ImgContent(@NotNull String str) {
            this.f73826v = str;
            return this;
        }

        @NotNull
        public final Builder text2ImgTemplateId(long j7) {
            this.f73828x = j7;
            return this;
        }

        @NotNull
        public final Builder text2ImgUrl(@NotNull String str) {
            this.f73827w = str;
            return this;
        }

        @NotNull
        public final Builder version(int i7) {
            this.f73806a = i7;
            return this;
        }

        @NotNull
        public final Builder videoCameraEnable(boolean z6) {
            this.f73809d = z6;
            return this;
        }

        @NotNull
        public final Builder videoEnable(boolean z6) {
            this.f73818n = z6;
            return this;
        }

        @NotNull
        public final Builder videoProfile(@NotNull String str) {
            this.f73816l = str;
            return this;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/MallMediaParams$a.class */
    public static final class a {
        @NotNull
        public static MallMediaParams a(@Nullable Bundle bundle) {
            MallMediaParams mallMediaParams;
            if (bundle == null) {
                return MallMediaParams.DEFAULT;
            }
            String string = bundle.getString(MallMediaParams.BKEY_MALL_MEDIA_PARAMS);
            if (string == null || string.length() == 0) {
                return MallMediaParams.DEFAULT;
            }
            try {
                mallMediaParams = (MallMediaParams) JSON.parseObject(string, MallMediaParams.class);
            } catch (Exception e7) {
                BLog.e("MallMediaParams", e7.getMessage());
                mallMediaParams = MallMediaParams.DEFAULT;
            }
            return mallMediaParams;
        }
    }

    @Deprecated(message = "version > 0", replaceWith = @ReplaceWith(expression = "imageCameraEnable, videoCameraEnable", imports = {}))
    public static /* synthetic */ void getCameraEnable$annotations() {
    }

    @NotNull
    public final String getBossKey() {
        return this.bossKey;
    }

    @NotNull
    public final String getBossUploadUrl() {
        return this.bossUploadUrl;
    }

    public final boolean getCameraEnable() {
        return this.cameraEnable;
    }

    @NotNull
    public final String getDomain() {
        return this.domain;
    }

    @NotNull
    public final String getDomainUpType() {
        return this.domainUpType;
    }

    public final boolean getEditVideoEnable() {
        return this.editVideoEnable;
    }

    @NotNull
    public final String getHintMsg() {
        return this.hintMsg;
    }

    public final boolean getImageCameraEnable() {
        return this.imageCameraEnable;
    }

    public final boolean getImageEnable() {
        return this.imageEnable;
    }

    public final int getMaxImageCount() {
        return this.maxImageCount;
    }

    public final long getMaxVideoSize() {
        return this.maxVideoSize;
    }

    public final int getMinImageCount() {
        return this.minImageCount;
    }

    public final boolean getOriginalMediaButtonEnable() {
        return this.originalMediaButtonEnable;
    }

    @NotNull
    public final String getSceneType() {
        return this.sceneType;
    }

    public final boolean getShowSkip() {
        return this.showSkip;
    }

    public final int getTabIndex() {
        return this.tabIndex;
    }

    @NotNull
    public final String getText2ImgContent() {
        return this.text2ImgContent;
    }

    public final long getText2ImgTemplateId() {
        return this.text2ImgTemplateId;
    }

    @NotNull
    public final String getText2ImgUrl() {
        return this.text2ImgUrl;
    }

    public final int getVersion() {
        return this.version;
    }

    public final boolean getVideoCameraEnable() {
        return this.videoCameraEnable;
    }

    public final boolean getVideoEnable() {
        return this.videoEnable;
    }

    @NotNull
    public final String getVideoProfile() {
        return this.videoProfile;
    }

    public final boolean isModifyText() {
        return this.isModifyText;
    }

    public final boolean isNeedText() {
        return this.isNeedText;
    }

    public final boolean isNeedUpload() {
        return this.isNeedUpload;
    }

    public final boolean isOriginalMedia() {
        return this.isOriginalMedia;
    }

    public final boolean isSync() {
        return this.isSync;
    }

    public final void setBossKey(@NotNull String str) {
        this.bossKey = str;
    }

    public final void setBossUploadUrl(@NotNull String str) {
        this.bossUploadUrl = str;
    }

    public final void setCameraEnable(boolean z6) {
        this.cameraEnable = z6;
    }

    public final void setDomain(@NotNull String str) {
        this.domain = str;
    }

    public final void setDomainUpType(@NotNull String str) {
        this.domainUpType = str;
    }

    public final void setEditVideoEnable(boolean z6) {
        this.editVideoEnable = z6;
    }

    public final void setHintMsg(@NotNull String str) {
        this.hintMsg = str;
    }

    public final void setImageCameraEnable(boolean z6) {
        this.imageCameraEnable = z6;
    }

    public final void setImageEnable(boolean z6) {
        this.imageEnable = z6;
    }

    public final void setMaxImageCount(int i7) {
        this.maxImageCount = i7;
    }

    public final void setMaxVideoSize(long j7) {
        this.maxVideoSize = j7;
    }

    public final void setMinImageCount(int i7) {
        this.minImageCount = i7;
    }

    public final void setModifyText(boolean z6) {
        this.isModifyText = z6;
    }

    public final void setNeedText(boolean z6) {
        this.isNeedText = z6;
    }

    public final void setNeedUpload(boolean z6) {
        this.isNeedUpload = z6;
    }

    public final void setOriginalMedia(boolean z6) {
        this.isOriginalMedia = z6;
    }

    public final void setOriginalMediaButtonEnable(boolean z6) {
        this.originalMediaButtonEnable = z6;
    }

    public final void setSceneType(@NotNull String str) {
        this.sceneType = str;
    }

    public final void setShowSkip(boolean z6) {
        this.showSkip = z6;
    }

    public final void setSync(boolean z6) {
        this.isSync = z6;
    }

    public final void setTabIndex(int i7) {
        this.tabIndex = i7;
    }

    public final void setText2ImgContent(@NotNull String str) {
        this.text2ImgContent = str;
    }

    public final void setText2ImgTemplateId(long j7) {
        this.text2ImgTemplateId = j7;
    }

    public final void setText2ImgUrl(@NotNull String str) {
        this.text2ImgUrl = str;
    }

    public final void setVersion(int i7) {
        this.version = i7;
    }

    public final void setVideoCameraEnable(boolean z6) {
        this.videoCameraEnable = z6;
    }

    public final void setVideoEnable(boolean z6) {
        this.videoEnable = z6;
    }

    public final void setVideoProfile(@NotNull String str) {
        this.videoProfile = str;
    }
}
