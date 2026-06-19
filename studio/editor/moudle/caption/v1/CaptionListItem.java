package com.bilibili.studio.editor.moudle.caption.v1;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/v1/CaptionListItem.class */
@Keep
public class CaptionListItem implements Serializable, Cloneable {
    public static final int TEMP_TYPE_BOTH = 3;
    public static final int TEMP_TYPE_LOCATION = 2;
    public static final int TEMP_TYPE_NORMAL = 0;
    public static final int TEMP_TYPE_TIME = 1;
    private String assetID;
    private String assetLic;
    private String assetPath;
    public CaptionAssetBean captionAssetBean;
    private boolean downloaded;
    private boolean downloading;
    private String fontUrl;
    private int id;
    private String imageHttp;
    private int imageLocal;
    private int index;
    private boolean isLocal;
    private Integer mAnimId;
    private String mCategory;
    private long mCircleAnimId;
    private long mDuration;
    private boolean mFontBold;
    private Integer mFontColor;
    private Integer mFontColorId;
    private Integer mFontId;
    private String mFontName;
    private String mFontPath;
    private Float mFontScale;
    private String mFontSize;
    private long mInAnimId;
    private boolean mIsRotated;
    private long mOutAnimId;
    private Integer mOutlineColor;
    private Integer mOutlineColorId;
    private Integer mOutlineWidth;
    private String mTempFormat;
    private int mTempType;
    private String mTmpName;
    private int max;
    private boolean selected;
    private float translationX;
    private float translationY;
    private String url;

    public CaptionListItem() {
        this.max = 60;
        this.downloading = false;
        this.downloaded = false;
        this.selected = false;
        this.isLocal = false;
    }

    public CaptionListItem(int i7) {
        this();
        this.mFontColor = Integer.valueOf(i7);
    }

    public CaptionListItem(int i7, int i8) {
        this();
        this.mFontColor = Integer.valueOf(i7);
        this.id = i8;
    }

    public CaptionListItem(String str) {
        this();
        this.url = str;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public CaptionListItem m9890clone() {
        CaptionListItem captionListItem;
        try {
            captionListItem = (CaptionListItem) super.clone();
        } catch (CloneNotSupportedException e7) {
            e7.printStackTrace();
            captionListItem = null;
        }
        return captionListItem;
    }

    public Integer getAnimId() {
        return this.mAnimId;
    }

    public String getAssetID() {
        return this.assetID;
    }

    public String getAssetLic() {
        return this.assetLic;
    }

    public String getAssetPath() {
        return this.assetPath;
    }

    public String getCategory() {
        return this.mCategory;
    }

    public long getCircleAnimId() {
        return this.mCircleAnimId;
    }

    public long getDuration() {
        return this.mDuration;
    }

    @Nullable
    public Integer getFontColor() {
        return this.mFontColor;
    }

    @Nullable
    public Integer getFontColorId() {
        return this.mFontColorId;
    }

    @Nullable
    public Integer getFontId() {
        return this.mFontId;
    }

    public String getFontName() {
        return this.mFontName;
    }

    public String getFontPath() {
        return this.mFontPath;
    }

    @Nullable
    public Float getFontScale() {
        return this.mFontScale;
    }

    public String getFontSize() {
        return this.mFontSize;
    }

    public String getFontUrl() {
        return this.fontUrl;
    }

    public int getId() {
        return this.id;
    }

    public String getImageHttp() {
        return this.imageHttp;
    }

    public int getImageLocal() {
        return this.imageLocal;
    }

    public long getInAnimId() {
        return this.mInAnimId;
    }

    public int getIndex() {
        return this.index;
    }

    public int getMax() {
        return this.max;
    }

    public long getOutAnimId() {
        return this.mOutAnimId;
    }

    @Nullable
    public Integer getOutlineColor() {
        return this.mOutlineColor;
    }

    @Nullable
    public Integer getOutlineColorId() {
        return this.mOutlineColorId;
    }

    @Nullable
    public Integer getOutlineWidth() {
        return this.mOutlineWidth;
    }

    public String getTempFormat() {
        return this.mTempFormat;
    }

    public int getTempType() {
        return this.mTempType;
    }

    public String getTmpName() {
        return this.mTmpName;
    }

    public float getTranslationX() {
        return this.translationX;
    }

    public float getTranslationY() {
        return this.translationY;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isDownloaded() {
        return this.downloaded;
    }

    public boolean isDownloading() {
        return this.downloading;
    }

    public boolean isExistsAssetPath() {
        CaptionAssetBean captionAssetBean = this.captionAssetBean;
        return (captionAssetBean == null || (TextUtils.isEmpty(captionAssetBean.captionStylePackagePath) && TextUtils.isEmpty(this.captionAssetBean.captionAnimationPackagePath) && TextUtils.isEmpty(this.captionAssetBean.captionInAnimationPackagePath) && TextUtils.isEmpty(this.captionAssetBean.captionOutAnimationPackagePath) && TextUtils.isEmpty(this.captionAssetBean.captionContextPackagePath) && TextUtils.isEmpty(this.captionAssetBean.captionRendererPackagePath))) ? false : true;
    }

    public boolean isFontBold() {
        return this.mFontBold;
    }

    public boolean isLocal() {
        return this.isLocal;
    }

    public boolean isRotated() {
        return this.mIsRotated;
    }

    public boolean isSelected() {
        return this.selected;
    }

    public void setAnimId(Integer num) {
        this.mAnimId = num;
    }

    public void setAssetID(String str) {
        this.assetID = str;
    }

    public void setAssetLic(String str) {
        this.assetLic = str;
    }

    public void setAssetPath(String str) {
        this.assetPath = str;
    }

    public void setCategory(String str) {
        this.mCategory = str;
    }

    public void setCircleAnimId(long j7) {
        this.mCircleAnimId = j7;
    }

    public void setDownloaded(boolean z6) {
        this.downloaded = z6;
    }

    public void setDownloading(boolean z6) {
        this.downloading = z6;
    }

    public void setDuration(long j7) {
        this.mDuration = j7;
    }

    public void setFontBold(boolean z6) {
        this.mFontBold = z6;
    }

    public void setFontColor(Integer num) {
        this.mFontColor = num;
    }

    public void setFontColorId(Integer num) {
        this.mFontColorId = num;
    }

    public void setFontId(Integer num) {
        this.mFontId = num;
    }

    public void setFontName(String str) {
        this.mFontName = str;
    }

    public void setFontPath(String str) {
        this.mFontPath = str;
    }

    @Nullable
    public void setFontScale(Float f7) {
        this.mFontScale = f7;
    }

    public void setFontSize(String str) {
        this.mFontSize = str;
    }

    public void setFontUrl(String str) {
        this.fontUrl = str;
    }

    public void setId(int i7) {
        this.id = i7;
    }

    public void setImageHttp(String str) {
        this.imageHttp = str;
    }

    public void setImageLocal(int i7) {
        this.imageLocal = i7;
    }

    public void setInAnimId(long j7) {
        this.mInAnimId = j7;
    }

    public void setIndex(int i7) {
        this.index = i7;
    }

    public void setLocal(boolean z6) {
        this.isLocal = z6;
    }

    public void setMax(int i7) {
        this.max = i7;
    }

    public void setOutAnimId(long j7) {
        this.mOutAnimId = j7;
    }

    public void setOutlineColor(Integer num) {
        this.mOutlineColor = num;
    }

    public void setOutlineColorId(Integer num) {
        this.mOutlineColorId = num;
    }

    public void setOutlineWidth(Integer num) {
        this.mOutlineWidth = num;
    }

    public void setRotated(boolean z6) {
        this.mIsRotated = z6;
    }

    public void setSelected(boolean z6) {
        this.selected = z6;
    }

    public void setTempFormat(String str) {
        this.mTempFormat = str;
    }

    public void setTempType(int i7) {
        this.mTempType = i7;
    }

    public void setTmpName(String str) {
        this.mTmpName = str;
    }

    public void setTranslationX(float f7) {
        this.translationX = f7;
    }

    public void setTranslationY(float f7) {
        this.translationY = f7;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
