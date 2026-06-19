package com.bilibili.studio.editor.timeline;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.frame.FrameZipInfo;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.moudle.danmaku.v1.EditorDanmakuInfo;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateTabItemBean;
import com.bilibili.studio.template.data.MeicamTemplateBean;
import com.bilibili.studio.videoeditor.bean.BMusic;
import com.bilibili.studio.videoeditor.capturev3.data.BiliMusicBeatGalleryBean;
import com.bilibili.studio.videoeditor.capturev3.data.CaptureUsageInfo;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoIntelligenceInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoPartitionPrediction;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoSmartTitle;
import com.bilibili.studio.videoeditor.editor.editdata.EditorEnterInfo;
import com.bilibili.studio.videoeditor.editor.editdata.OperationCover;
import com.bilibili.studio.videoeditor.template.bean.BiliImageTextTemplateBean;
import java.util.List;
import java.util.Map;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/timeline/EditorExtraData.class */
@Keep
public final class EditorExtraData {

    @JvmField
    public boolean autoPlay;

    @JvmField
    @Nullable
    public String mAiContent;

    @JvmField
    @Nullable
    public String mAiKeyword;

    @JvmField
    @Nullable
    public String mAiPrompt;

    @JvmField
    public long mAiStyleId;

    @JvmField
    @Nullable
    public String mAiStyleName;

    @JvmField
    @Nullable
    public String mAiVideoEnding;

    @JvmField
    @Nullable
    public String mAiVideoOpening;

    @Nullable
    private CaptionInfo mAsrDerivedCaptionInfo;

    @JvmField
    public int mBizFrom;

    @JvmField
    @Nullable
    public List<CaptionInfo> mCaptionInfoListTemp;

    @JvmField
    @Nullable
    public BMusic mCaptureBMusic;

    @JvmField
    @Nullable
    public CaptureUsageInfo mCaptureUsageInfo;

    @JvmField
    @Nullable
    public CaptionInfo mDerivedCaptionInfo;

    @JvmField
    @Nullable
    public EditorDanmakuInfo mDerivedDanmakuInfo;

    @JvmField
    @Nullable
    public String mDraftCoverPath;

    @JvmField
    @Nullable
    public EditVideoSmartTitle mEditSmartTitle;

    @JvmField
    @JSONField(name = "edit_template_tab_item_bean")
    @Nullable
    public EditorTemplateTabItemBean mEditTemplateInfo;

    @JvmField
    @Nullable
    public EditorEnterInfo mEditorEnterInfo;

    @JvmField
    public int mExtractedFrameCount;

    @JvmField
    public boolean mForbidEditReport;

    @JvmField
    @Nullable
    public List<FrameZipInfo> mFrameZipInfoList;

    @JvmField
    public boolean mFromDraft;

    @JvmField
    @Nullable
    public String mImageLabels;

    @JvmField
    @Nullable
    public BiliImageTextTemplateBean mImageTextTemplate;

    @JvmField
    @Nullable
    public EditVideoIntelligenceInfo mIntelligenceInfo;

    @JvmField
    public int mIntelligenceState;

    @JvmField
    public boolean mIsEdited;

    @JvmField
    public boolean mIsMultiP;

    @JvmField
    @Nullable
    public String mJumpParam;

    @JvmField
    @Nullable
    public List<CaptionInfo> mLastCaptionInfoList;

    @JvmField
    @Nullable
    public MeicamTemplateBean mMeicamTemplateBean;

    @JvmField
    @Nullable
    public CaptureSchema.MissionInfo mMissionInfo;

    @JvmField
    @Nullable
    public BiliMusicBeatGalleryBean mMusicBeatGalleryBean;

    @JvmField
    @Nullable
    public String mMuxFilePath;

    @JvmField
    @Nullable
    public OperationCover mOperationCover;

    @JvmField
    @Nullable
    public EditVideoPartitionPrediction mPartitionPrediction;

    @JvmField
    @Nullable
    public Map<String, Object> mPublishData;

    @JvmField
    @Nullable
    public String mRecMusicSids;

    @JvmField
    public int mRecommendCount;

    @JvmField
    @Nullable
    public Map<String, String> mReportData;

    @JvmField
    @Nullable
    public CaptureSchema.SchemaInfo mSchemaInfo;

    @JvmField
    public int mUploadedFrameCount;

    @JvmField
    public boolean mUseBmmSdkGray;

    @JvmField
    @Nullable
    public String mUsedFunction;

    @JvmField
    public int mContributeType = 9042;

    @JvmField
    public int mEditorMode = 34;

    @JvmField
    @NotNull
    public String mAITool = CaptureSchema.OLD_INVALID_ID_STRING;

    @JvmField
    @Nullable
    public String engineType = "UpperNvs";

    @Nullable
    public final CaptionInfo getMAsrDerivedCaptionInfo() {
        return this.mAsrDerivedCaptionInfo;
    }

    public final void setMAsrDerivedCaptionInfo(@Nullable CaptionInfo captionInfo) {
        this.mAsrDerivedCaptionInfo = captionInfo;
    }
}
