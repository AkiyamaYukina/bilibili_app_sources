package com.bilibili.upper.module.cover_v2.model.template;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/model/template/MultiCoverCaptionTemplate.class */
@StabilityInferred(parameters = 0)
@Keep
public final class MultiCoverCaptionTemplate {
    public static final int $stable = 8;
    public static final int APPLY_FOR_ALL = 3;
    public static final int APPLY_FOR_COVER = 2;
    public static final int APPLY_FOR_EDITOR = 1;
    public static final int ATT_FLAG_USE_TIME = 1;

    @NotNull
    public static final a Companion = new Object();
    public static final int ID_DEFAULT = -1;
    public static final int ID_PROMPT = -2;
    public static final int SUBTITLE_COMPOUND = 1;
    public static final int SUBTITLE_DEFAULT = 0;
    private int attribute;

    @Nullable
    private String coverUrl;

    @Nullable
    private Integer fontColor;

    @Nullable
    private Integer fontId;

    @Nullable
    private List<Integer> fontIds;

    @Nullable
    private String fontPath;

    @Nullable
    private Float fontScale;
    private int id;
    private boolean isDownloaded;
    private boolean isDownloading;
    private boolean isFailed;
    private boolean isFav;

    @Nullable
    private String licencePath;

    @Nullable
    private Integer outlineColor;

    @Nullable
    private Double outlineWidth;

    @Nullable
    private String packagePath;

    @Nullable
    private ArrayList<String> packagePathList;

    @Nullable
    private String packageUrl;
    private int rank;

    @JSONField(name = "subtitle_type")
    private int subtitleType;

    @Nullable
    private String textFormat;
    private final boolean useLocation;
    private int inAnimationId = -1;
    private int outAnimationId = -1;
    private int circleAnimationId = -1;
    private int italic = -1;
    private int applyFor = 3;
    private int maxLength = 60;
    private long duration = TransitionInfo.DEFAULT_DURATION;

    @NotNull
    private ArrayList<String> fontPaths = new ArrayList<>();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/model/template/MultiCoverCaptionTemplate$a.class */
    public static final class a {
        public static int a(@Nullable String str) {
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            List listR = StringsKt.R(str, new String[]{","}, 0, 6);
            if (listR.isEmpty()) {
                return -1;
            }
            return Integer.parseInt((String) listR.get(0));
        }
    }

    public final int getApplyFor() {
        return this.applyFor;
    }

    public final int getAttribute() {
        return this.attribute;
    }

    public final int getCircleAnimationId() {
        return this.circleAnimationId;
    }

    @Nullable
    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final long getDuration() {
        return this.duration;
    }

    @Nullable
    public final Integer getFontColor() {
        return this.fontColor;
    }

    @Nullable
    public final Integer getFontId() {
        return this.fontId;
    }

    @Nullable
    public final List<Integer> getFontIds() {
        return this.fontIds;
    }

    @Nullable
    public final String getFontPath() {
        return this.fontPath;
    }

    @NotNull
    public final ArrayList<String> getFontPaths() {
        return this.fontPaths;
    }

    @Nullable
    public final Float getFontScale() {
        return this.fontScale;
    }

    public final int getId() {
        return this.id;
    }

    public final int getInAnimationId() {
        return this.inAnimationId;
    }

    public final int getItalic() {
        return this.italic;
    }

    @Nullable
    public final String getLicencePath() {
        return this.licencePath;
    }

    public final int getMaxLength() {
        return this.maxLength;
    }

    public final int getOutAnimationId() {
        return this.outAnimationId;
    }

    @Nullable
    public final Integer getOutlineColor() {
        return this.outlineColor;
    }

    @Nullable
    public final Double getOutlineWidth() {
        return this.outlineWidth;
    }

    @Nullable
    public final String getPackagePath() {
        return this.packagePath;
    }

    @Nullable
    public final ArrayList<String> getPackagePathList() {
        return this.packagePathList;
    }

    @Nullable
    public final String getPackageUrl() {
        return this.packageUrl;
    }

    public final int getRank() {
        return this.rank;
    }

    public final int getSubtitleType() {
        return this.subtitleType;
    }

    @Nullable
    public final String getTextFormat() {
        return this.textFormat;
    }

    public final boolean getUseLocation() {
        return this.useLocation;
    }

    public final boolean getUseTime() {
        boolean z6 = true;
        if ((this.attribute & 1) == 0) {
            z6 = false;
        }
        return z6;
    }

    public final boolean isDefault() {
        return this.id == -1;
    }

    public final boolean isDownloaded() {
        return this.isDownloaded;
    }

    public final boolean isDownloading() {
        return this.isDownloading;
    }

    public final boolean isFailed() {
        return this.isFailed;
    }

    public final boolean isFav() {
        return this.isFav;
    }

    public final boolean isPrompt() {
        return this.id == -2;
    }

    public final void setApplyFor(int i7) {
        this.applyFor = i7;
    }

    public final void setAttribute(int i7) {
        this.attribute = i7;
    }

    public final void setCircleAnimationId(int i7) {
        this.circleAnimationId = i7;
    }

    public final void setCoverUrl(@Nullable String str) {
        this.coverUrl = str;
    }

    public final void setDownloaded(boolean z6) {
        this.isDownloaded = z6;
    }

    public final void setDownloading(boolean z6) {
        this.isDownloading = z6;
    }

    public final void setDuration(long j7) {
        this.duration = j7;
    }

    public final void setFailed(boolean z6) {
        this.isFailed = z6;
    }

    public final void setFav(boolean z6) {
        this.isFav = z6;
    }

    public final void setFontColor(@Nullable Integer num) {
        this.fontColor = num;
    }

    public final void setFontId(@Nullable Integer num) {
        this.fontId = num;
    }

    public final void setFontIds(@Nullable List<Integer> list) {
        this.fontIds = list;
    }

    public final void setFontPath(@Nullable String str) {
        this.fontPath = str;
    }

    public final void setFontPaths(@NotNull ArrayList<String> arrayList) {
        this.fontPaths = arrayList;
    }

    public final void setFontScale(@Nullable Float f7) {
        this.fontScale = f7;
    }

    public final void setId(int i7) {
        this.id = i7;
    }

    public final void setInAnimationId(int i7) {
        this.inAnimationId = i7;
    }

    public final void setItalic(int i7) {
        this.italic = i7;
    }

    public final void setLicencePath(@Nullable String str) {
        this.licencePath = str;
    }

    public final void setMaxLength(int i7) {
        this.maxLength = i7;
    }

    public final void setOutAnimationId(int i7) {
        this.outAnimationId = i7;
    }

    public final void setOutlineColor(@Nullable Integer num) {
        this.outlineColor = num;
    }

    public final void setOutlineWidth(@Nullable Double d7) {
        this.outlineWidth = d7;
    }

    public final void setPackagePath(@Nullable String str) {
        this.packagePath = str;
    }

    public final void setPackagePathList(@Nullable ArrayList<String> arrayList) {
        this.packagePathList = arrayList;
    }

    public final void setPackageUrl(@Nullable String str) {
        this.packageUrl = str;
    }

    public final void setRank(int i7) {
        this.rank = i7;
    }

    public final void setSubtitleType(int i7) {
        this.subtitleType = i7;
    }

    public final void setTextFormat(@Nullable String str) {
        this.textFormat = str;
    }
}
