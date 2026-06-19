package com.bilibili.studio.videoeditor.capturev3.data;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/CaptureLatestBeanV3.class */
@Keep
public class CaptureLatestBeanV3 {
    public static final String LATEST_STICKER_INDEX = "64";

    @JSONField(name = "apply_for")
    public int mApplyFor;

    @JSONField(name = "cooperate")
    public long mCooperate;

    @JSONField(name = "cooperate_url")
    public String mCooperateUrl;

    @JSONField(name = "cover")
    public String mCover;

    @JSONField(name = "ctime")
    public long mCtime;

    @JSONField(name = "demo_aid")
    public long mDemoAid;

    @JSONField(name = "demo_cid")
    public long mDemoCid;

    @JSONField(name = "download_url")
    public String mDownloadUrl;

    @JSONField(name = EditCustomizeSticker.TAG_DURATION)
    public long mDuration;

    @JSONField(name = "duration_ms")
    public long mDurationMs;

    @JSONField(name = "fav")
    public int mFav;

    @JSONField(name = "filesize")
    public long mFileSize;

    @JSONField(name = "filter_type")
    public int mFilterType;

    @JSONField(name = "hotval")
    public int mHotVal;

    @JSONField(name = "id")
    public long mId;

    @JSONField(name = "index")
    public int mIndex;

    @JSONField(name = "loop")
    public int mLoop;

    @JSONField(name = "material_aid")
    public long mMaterialAid;

    @JSONField(name = "material_cid")
    public long mMaterialCid;

    @JSONField(name = "max")
    public int mMax;

    @JSONField(name = EditCustomizeSticker.TAG_MID)
    public String mMid;

    @JSONField(name = CaptureSchema.MISSION_ID)
    public long mMissionId;

    @JSONField(name = "mtime")
    public long mMtime;

    @JSONField(name = "musicians")
    public String mMusicians;

    @JSONField(name = "name")
    public String mName;

    @JSONField(name = "playurl")
    public String mPlayUrl;

    @JSONField(name = "position")
    public int mPosition;

    @JSONField(name = "pubtime")
    public long mPubTime;

    @JSONField(name = EditCustomizeSticker.TAG_RANK)
    public int mRank;

    @JSONField(name = "recommend_point")
    public int mRecommendPoint;

    @JSONField(name = "sid")
    public long mSid;

    @JSONField(name = "stat")
    public String mStat;

    @JSONField(name = "state")
    public int mState;

    @JSONField(name = "style")
    public int mStyle;

    @JSONField(name = "subtitle")
    public String mSubtitle;

    @JSONField(name = "tags")
    public List<String> mTags;

    @JSONField(name = "text_attr")
    public int mTextAttr;

    @JSONField(name = "text_fmt")
    public String mTextFmt;

    @JSONField(name = "tid")
    public long mTid;

    @JSONField(name = "timeline")
    public List<String> mTimeline;

    @JSONField(name = "tip")
    public String mTip;

    @JSONField(name = "new")
    public int nNew;
}
