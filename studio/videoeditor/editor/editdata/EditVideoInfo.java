package com.bilibili.studio.videoeditor.editor.editdata;

import L50.a;
import R50.r;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.lib.editor.engine.IRational;
import com.bilibili.lib.editor.engine.studio.StudioRationalImplX;
import com.bilibili.studio.comm.material.bean.MaterialUsedBean;
import com.bilibili.studio.config.UpperFawkesDeviceDecision;
import com.bilibili.studio.editor.frame.FrameZipInfo;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.moudle.danmaku.v1.EditorDanmakuInfo;
import com.bilibili.studio.editor.moudle.music.manager.musicrec.EditorAIRecResult;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTempalteBindMaterialInfoBean;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateBindMusicInfo;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateTabItemBean;
import com.bilibili.studio.template.data.MeicamTemplateBean;
import com.bilibili.studio.videoeditor.EditManager;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.bean.BMusic;
import com.bilibili.studio.videoeditor.bean.SelectVideo;
import com.bilibili.studio.videoeditor.capturev3.data.BiliMusicBeatGalleryBean;
import com.bilibili.studio.videoeditor.capturev3.data.CaptureUsageInfo;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.bilibili.studio.videoeditor.help.mux.MuxInfo;
import com.bilibili.studio.videoeditor.ms.picture.PictureRatioInfo;
import com.bilibili.studio.videoeditor.template.bean.BiliImageTextTemplateBean;
import com.bilibili.studio.videoeditor.util.P;
import com.bilibili.studio.videoeditor.util.ResolutionType;
import com.bilibili.studio.videoeditor.util.V;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/editdata/EditVideoInfo.class */
@Keep
public class EditVideoInfo extends EditVideoInfoCore {
    private static final String TAG = "EditVideoInfo";
    public boolean autoPlay;
    private float configSrcVolume;
    private String engineType;
    public Map<String, String> eventExtraInfo;
    private boolean isAdaptTimelineDraft;
    private boolean isAppliedAiStoryData;
    private boolean isCancelByUser;
    private String liveKey;
    private String mAITool;
    private String mAiContent;
    private String mAiKeyword;
    private String mAiPrompt;
    private int mAiSource;
    private long mAiStyleId;
    private String mAiStyleName;
    private CaptionInfo mAsrDerivedCaptionInfo;
    private int mBizFrom;
    private List<CaptionInfo> mCaptionInfoListTemp;
    private BMusic mCaptureBMusic;
    private CaptureUsageInfo mCaptureUsageInfo;
    private int mContributeType;
    private CaptionInfo mDerivedCaptionInfo;

    @Nullable
    private EditorDanmakuInfo mDerivedDanmakuInfo;
    private String mDraftCoverPath;
    private int mDraftState;
    private int mDraftType;

    @JSONField(name = "edit_template_tab_item_bean")
    private EditorTemplateTabItemBean mEditTemplateInfo;
    private EditVideoSmartTitle mEditVideoSmartTitle;
    private EditorEnterInfo mEditorEnterInfo;
    private int mEditorMode;
    private int mExportHdrType;

    @Deprecated
    private int mExtractedFrameCount;
    private boolean mForbidEditReport;

    @Deprecated
    private List<FrameZipInfo> mFrameZipInfoList;
    private boolean mFromDraft;

    @Nullable
    private String mImageLabels;
    private BiliImageTextTemplateBean mImageTextTemplate;

    @Nullable
    private EditVideoIntelligenceInfo mIntelligenceInfo;
    private int mIntelligenceState;
    private boolean mIsEdited;
    private boolean mIsMultiP;
    private String mJumpParam;
    private List<CaptionInfo> mLastCaptionInfoList;
    private MeicamTemplateBean mMeicamTemplateBean;
    private CaptureSchema.MissionInfo mMissionInfo;
    private BiliMusicBeatGalleryBean mMusicBeatGalleryBean;
    private String mMuxFilePath;

    @Nullable
    @Deprecated
    private OperationCover mOperationCover;
    private EditVideoPartitionPrediction mPartitionPrediction;

    @Nullable
    private Map<String, Object> mPublishData;
    private String mRecMusicSids;

    @Deprecated
    private int mRecommendCount;

    @Nullable
    private Map<String, String> mReportData;
    private ResolutionType mResolutionType;
    private CaptureSchema.SchemaInfo mSchemaInfo;

    @Deprecated
    private int mUploadedFrameCount;
    private boolean mUseBmmSdkGray;
    private String mUsedFunction;
    private String mVideoEnding;
    private String mVideoOpening;

    @JSONField(serialize = false)
    private Set<String> materialSet;

    @JSONField(serialize = false)
    private List<MaterialUsedBean> materialUsedList;
    private List<MultiPArchive> multiP;
    private String originEngineType;
    private String publishNavId;
    private String uploadId;
    private boolean usedAsrMusic;
    private boolean usedAsrRecord;
    private boolean usedAsrVideo;
    private boolean usedSmartTitle;
    private float userLastSrcVolume;
    private ArrayList<Float> userLastVolumeList;

    public EditVideoInfo() {
        this.autoPlay = false;
        this.mIntelligenceState = 0;
        this.mContributeType = 9042;
        this.mEditorMode = 34;
        this.mFromDraft = false;
        this.mDraftState = 0;
        this.mDraftType = 0;
        this.mAiSource = 0;
        this.mAITool = CaptureSchema.OLD_INVALID_ID_STRING;
        this.mResolutionType = ResolutionType.RES_1080;
        this.mExportHdrType = -1;
        this.userLastSrcVolume = 1.0f;
        this.userLastVolumeList = new ArrayList<>();
        this.configSrcVolume = 1.0f;
        this.isCancelByUser = false;
        this.engineType = "UpperNvs";
        this.isAdaptTimelineDraft = false;
        init();
    }

    public EditVideoInfo(EditManager.EnterInfo enterInfo) {
        this();
        setCaller(enterInfo.from);
        List<EditManager.FileInfo> list = enterInfo.files;
        if (list != null) {
            for (EditManager.FileInfo fileInfo : list) {
                this.mVideoList.add(new FileInfo(fileInfo.filePath, fileInfo.bizFrom));
            }
        }
        EditManager.TimeLimit timeLimit = enterInfo.timeLimit;
        if (timeLimit != null) {
            this.mEditVideoTimeControl.setUploadVideoDurationMin(timeLimit.min);
        }
        prepare();
    }

    public EditVideoInfo(String str, List<FileInfo> list, EditVideoTimeControl editVideoTimeControl) {
        super(str, list, editVideoTimeControl);
        this.autoPlay = false;
        this.mIntelligenceState = 0;
        this.mContributeType = 9042;
        this.mEditorMode = 34;
        this.mFromDraft = false;
        this.mDraftState = 0;
        this.mDraftType = 0;
        this.mAiSource = 0;
        this.mAITool = CaptureSchema.OLD_INVALID_ID_STRING;
        this.mResolutionType = ResolutionType.RES_1080;
        this.mExportHdrType = -1;
        this.userLastSrcVolume = 1.0f;
        this.userLastVolumeList = new ArrayList<>();
        this.configSrcVolume = 1.0f;
        this.isCancelByUser = false;
        this.engineType = "UpperNvs";
        this.isAdaptTimelineDraft = false;
        init();
    }

    @Nullable
    private BMusic getCaptureBMusicClone() {
        BMusic bMusic = this.mCaptureBMusic;
        if (bMusic == null) {
            return null;
        }
        return bMusic.mo9886clone();
    }

    private void initCollectMaterials() {
        if (this.materialSet == null) {
            this.materialSet = new LinkedHashSet();
        }
        if (this.materialUsedList == null) {
            this.materialUsedList = new ArrayList();
        }
    }

    private boolean prepareEditNvsTimelineInfo() {
        if (V.e(this.mVideoList)) {
            return false;
        }
        PictureRatioInfo pictureRatioInfo = this.mPictureRatioInfo;
        if (pictureRatioInfo != null && pictureRatioInfo.width != 0 && pictureRatioInfo.height != 0) {
            return true;
        }
        Size sizeD = P.d(this.mVideoList);
        this.mEditNvsTimelineInfoBase.setVideoSize(sizeD);
        setOriginSize(sizeD.m10451clone());
        if (this.mEditNvsTimelineInfoBase.isVideoSizeInvalid()) {
            return false;
        }
        for (FileInfo fileInfo : this.mVideoList) {
            if (fileInfo != null && fileInfo.getFilePath() != null && (fileInfo.getFilePath().endsWith(".wmv") || fileInfo.getFilePath().endsWith(".WMV") || fileInfo.getFilePath().endsWith(".rmvb") || fileInfo.getFilePath().endsWith(".RMVB"))) {
                return false;
            }
        }
        if (this.mPictureRatioInfo == null) {
            this.mPictureRatioInfo = new PictureRatioInfo();
        }
        Size videoSize = this.mEditNvsTimelineInfoBase.getVideoSize();
        if (videoSize == null) {
            return true;
        }
        if (videoSize.getHeight() != 0 && videoSize.getWidth() != 0) {
            this.mPictureRatioInfo.ratio = (videoSize.getWidth() * 1.0f) / videoSize.getHeight();
        }
        this.mPictureRatioInfo.widthStand = videoSize.getWidth();
        this.mPictureRatioInfo.heightStand = videoSize.getHeight();
        return true;
    }

    private boolean prepareSelectVideoList() {
        if (!V.e(this.mSelectVideoList)) {
            return false;
        }
        this.mSelectVideoList = new ArrayList();
        if (V.e(this.mVideoList)) {
            return false;
        }
        for (FileInfo fileInfo : this.mVideoList) {
            if (fileInfo != null) {
                this.mSelectVideoList.add(new SelectVideo(fileInfo.getFilePath(), fileInfo.getBizFrom()));
            }
        }
        return !V.e(this.mSelectVideoList);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public EditVideoInfo m10450clone() {
        EditVideoInfo editVideoInfo = new EditVideoInfo(getCaller(), getVideoList(), getEditVideoTimeControl());
        editVideoInfo.autoPlay = this.autoPlay;
        editVideoInfo.setRecordInfoList(getRecordInfoListClone());
        editVideoInfo.setCaptionInfoList(getCaptionInfoListClone());
        editVideoInfo.setDanmakuInfoList(getDanmakuInfoListClone());
        editVideoInfo.setTtsInfoList(getTtsInfoListClone());
        if (this.mSelectVideoList == null) {
            editVideoInfo.prepareSelectVideoList();
        }
        editVideoInfo.setSelectVideoList(getSelectVideoListClone());
        editVideoInfo.setEditVideoTracks(getEditVideoTracksClone());
        editVideoInfo.setEditNvsTimelineInfoBase(getEditNvsTimelineInfoBaseClone());
        editVideoInfo.setDraftId(getDraftId());
        editVideoInfo.setProjectVersion(getProjectVersion());
        editVideoInfo.setBiliEditorStickerInfoList(getBiliEditorStickerInfoListClone());
        editVideoInfo.setEditorMusicInfo(getEditorMusicInfoClone());
        editVideoInfo.setTimeLineFillMode(getTimeLineFillMode());
        editVideoInfo.setPictureRatioInfo(getPictureRatioInfoClone());
        editVideoInfo.setBiliEditorMusicRhythmEntity(getBiliEditorMusicRhythmEntity());
        editVideoInfo.setBiliEditorTimelineFxList(getBiliEditorTimelineFxListClone());
        if (getOriginSize() != null) {
            editVideoInfo.setOriginSize(getOriginSize().m10451clone());
        }
        editVideoInfo.setIntelligenceInfo(this.mIntelligenceInfo);
        editVideoInfo.setIntelligenceState(this.mIntelligenceState);
        editVideoInfo.setImageTextTemplate(this.mImageTextTemplate);
        editVideoInfo.setUseBmmSdkGray(this.mUseBmmSdkGray);
        editVideoInfo.setEditVideoGrayControl(this.mEditVideoGrayControl);
        editVideoInfo.setCaptionInfoListTemp(getCaptionInfoListTempClone());
        editVideoInfo.setLastCaptionInfoList(getLastCaptionInfoListClone());
        CaptionInfo captionInfo = this.mDerivedCaptionInfo;
        if (captionInfo != null) {
            editVideoInfo.setDerivedCaptionInfo(captionInfo.mo9886clone());
        }
        CaptionInfo captionInfo2 = this.mAsrDerivedCaptionInfo;
        if (captionInfo2 != null) {
            editVideoInfo.setAsrDerivedCaptionInfo(captionInfo2.mo9886clone());
        }
        EditorDanmakuInfo editorDanmakuInfo = this.mDerivedDanmakuInfo;
        if (editorDanmakuInfo != null) {
            editVideoInfo.setDerivedDanmakuInfo(editorDanmakuInfo.mo9886clone());
        }
        editVideoInfo.setMissionInfo(this.mMissionInfo);
        editVideoInfo.setSchemaInfo(this.mSchemaInfo);
        editVideoInfo.setIsEdited(this.mIsEdited);
        editVideoInfo.setForbidEditReport(this.mForbidEditReport);
        editVideoInfo.setIsMultiP(this.mIsMultiP);
        editVideoInfo.setContributeType(this.mContributeType);
        editVideoInfo.setCaptureUsageInfo(this.mCaptureUsageInfo);
        editVideoInfo.setJumpParam(this.mJumpParam);
        editVideoInfo.setCaptureBMusic(getCaptureBMusicClone());
        editVideoInfo.setDraftCoverPath(this.mDraftCoverPath);
        editVideoInfo.setEditorMode(this.mEditorMode);
        editVideoInfo.setMusicBeatGalleryBean(this.mMusicBeatGalleryBean);
        editVideoInfo.setMeicamTemplateBean(this.mMeicamTemplateBean);
        editVideoInfo.setBizFrom(this.mBizFrom);
        editVideoInfo.setMuxFilePath(this.mMuxFilePath);
        editVideoInfo.setExtractedFrameCount(this.mExtractedFrameCount);
        editVideoInfo.setUploadedFrameCount(this.mUploadedFrameCount);
        editVideoInfo.setRecommendCount(this.mRecommendCount);
        editVideoInfo.setFrameZipInfoList(this.mFrameZipInfoList);
        editVideoInfo.setPartitionPrediction(this.mPartitionPrediction);
        editVideoInfo.setEditVideoSmartTitle(this.mEditVideoSmartTitle);
        EditorTemplateTabItemBean editorTemplateTabItemBean = this.mEditTemplateInfo;
        if (editorTemplateTabItemBean != null) {
            editVideoInfo.setEditTemplateInfo(editorTemplateTabItemBean.m10146clone());
        }
        editVideoInfo.setReportData(this.mReportData);
        editVideoInfo.setPublishData(this.mPublishData);
        editVideoInfo.setOperationCover(this.mOperationCover);
        editVideoInfo.setRecMusicSids(this.mRecMusicSids);
        editVideoInfo.setImageLabels(this.mImageLabels);
        editVideoInfo.setEditorEnterInfo(this.mEditorEnterInfo);
        editVideoInfo.setUsedFunction(this.mUsedFunction);
        editVideoInfo.setFromDraft(this.mFromDraft);
        editVideoInfo.setAITool(this.mAITool);
        editVideoInfo.setAiStyleId(this.mAiStyleId);
        editVideoInfo.setAiStyleName(this.mAiStyleName);
        editVideoInfo.setAiPrompt(this.mAiPrompt);
        editVideoInfo.setAiKeyword(this.mAiKeyword);
        editVideoInfo.setAiContent(this.mAiContent);
        editVideoInfo.setAppliedAiStoryData(this.isAppliedAiStoryData);
        editVideoInfo.setVideoOpening(this.mVideoOpening);
        editVideoInfo.setVideoEnding(this.mVideoEnding);
        editVideoInfo.setExportHdrType(this.mExportHdrType);
        editVideoInfo.setAiSource(this.mAiSource);
        Set<String> set = this.materialSet;
        if (set != null) {
            editVideoInfo.setMaterialSet(set);
        }
        List<MaterialUsedBean> list = this.materialUsedList;
        if (list != null) {
            editVideoInfo.setMaterialUsedList(list);
        }
        editVideoInfo.setEngineType(this.engineType);
        editVideoInfo.setOriginEngineType(this.originEngineType);
        editVideoInfo.setIsAdaptTimelineDraft(this.isAdaptTimelineDraft);
        editVideoInfo.setResolutionType(this.mResolutionType);
        editVideoInfo.setUserLastSrcVolume(this.userLastSrcVolume);
        editVideoInfo.setConfigSrcVolume(this.configSrcVolume);
        editVideoInfo.setEventExtraInfo(this.eventExtraInfo);
        editVideoInfo.setPublishNavId(this.publishNavId);
        editVideoInfo.setUploadId(this.uploadId);
        editVideoInfo.setMultiP(this.multiP);
        editVideoInfo.setDraftState(this.mDraftState);
        editVideoInfo.setDraftType(this.mDraftType);
        editVideoInfo.setLiveKey(this.liveKey);
        editVideoInfo.mIsEdited = this.mIsEdited;
        return editVideoInfo;
    }

    public void collectAddMaterials(List<SelectVideo> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        initCollectMaterials();
        for (SelectVideo selectVideo : list) {
            this.materialSet.add(selectVideo.videoPath);
            this.materialUsedList.add(new MaterialUsedBean(selectVideo.videoPath));
        }
    }

    public void collectDeleteMaterials(List<BClip> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        initCollectMaterials();
        for (BClip bClip : list) {
            this.materialSet.add(bClip.videoPath);
            this.materialUsedList.add(new MaterialUsedBean(bClip.videoPath, MaterialUsedBean.MATERIAL_DELETE));
        }
    }

    public void collectMaterialsWhenInitialization() {
        initCollectMaterials();
        if (getEditVideoTracks() != null) {
            for (EditVideoClip editVideoClip : getEditVideoTracks()) {
                if (editVideoClip.getBClipList() != null) {
                    for (BClip bClip : editVideoClip.getBClipList()) {
                        this.materialSet.add(bClip.videoPath);
                        this.materialUsedList.add(new MaterialUsedBean(bClip.videoPath));
                    }
                }
            }
        }
    }

    public boolean didAllFrameZipUploaded() {
        EditVideoPartitionPrediction editVideoPartitionPrediction = this.mPartitionPrediction;
        return (editVideoPartitionPrediction == null || TextUtils.isEmpty(editVideoPartitionPrediction.partitionTaskId)) ? false : true;
    }

    @Override // com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfoCore
    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditVideoInfo) || !super.equals(obj)) {
            return false;
        }
        EditVideoInfo editVideoInfo = (EditVideoInfo) obj;
        if (this.mIntelligenceState != editVideoInfo.mIntelligenceState || this.mIsMultiP != editVideoInfo.mIsMultiP || this.mIsEdited != editVideoInfo.mIsEdited || this.mContributeType != editVideoInfo.mContributeType || this.mEditorMode != editVideoInfo.mEditorMode || this.mUseBmmSdkGray != editVideoInfo.mUseBmmSdkGray || this.mBizFrom != editVideoInfo.mBizFrom || this.mExtractedFrameCount != editVideoInfo.mExtractedFrameCount || this.mUploadedFrameCount != editVideoInfo.mUploadedFrameCount || this.mRecommendCount != editVideoInfo.mRecommendCount || !Objects.equals(this.mIntelligenceInfo, editVideoInfo.mIntelligenceInfo) || !Objects.equals(this.mRecMusicSids, editVideoInfo.mRecMusicSids) || !Objects.equals(this.mImageLabels, editVideoInfo.mImageLabels) || !Objects.equals(this.mCaptionInfoListTemp, editVideoInfo.mCaptionInfoListTemp) || !Objects.equals(this.mLastCaptionInfoList, editVideoInfo.mLastCaptionInfoList) || !Objects.equals(this.mDerivedCaptionInfo, editVideoInfo.mDerivedCaptionInfo) || !Objects.equals(this.mAsrDerivedCaptionInfo, editVideoInfo.mAsrDerivedCaptionInfo) || !Objects.equals(this.mDerivedDanmakuInfo, editVideoInfo.mDerivedDanmakuInfo) || !Objects.equals(this.mCaptureBMusic, editVideoInfo.mCaptureBMusic) || !Objects.equals(this.mMissionInfo, editVideoInfo.mMissionInfo) || !Objects.equals(this.mCaptureUsageInfo, editVideoInfo.mCaptureUsageInfo) || !Objects.equals(this.mSchemaInfo, editVideoInfo.mSchemaInfo) || !Objects.equals(this.mFrameZipInfoList, editVideoInfo.mFrameZipInfoList) || !Objects.equals(this.mPartitionPrediction, editVideoInfo.mPartitionPrediction) || !Objects.equals(this.mEditVideoSmartTitle, editVideoInfo.mEditVideoSmartTitle) || !Boolean.valueOf(this.usedSmartTitle).equals(Boolean.valueOf(editVideoInfo.usedSmartTitle)) || !Objects.equals(this.mEditTemplateInfo, editVideoInfo.mEditTemplateInfo) || !Objects.equals(this.mMuxFilePath, editVideoInfo.mMuxFilePath) || !Objects.equals(this.mJumpParam, editVideoInfo.mJumpParam) || !Objects.equals(this.mDraftCoverPath, editVideoInfo.mDraftCoverPath) || !Objects.equals(this.mMusicBeatGalleryBean, editVideoInfo.mMusicBeatGalleryBean) || !Objects.equals(this.mMeicamTemplateBean, editVideoInfo.mMeicamTemplateBean) || !Objects.equals(this.mImageTextTemplate, editVideoInfo.mImageTextTemplate) || !Objects.equals(this.mPublishData, editVideoInfo.mPublishData) || !Objects.equals(this.mReportData, editVideoInfo.mReportData) || !Objects.equals(this.mEditorEnterInfo, editVideoInfo.mEditorEnterInfo) || !Objects.equals(this.mUsedFunction, editVideoInfo.mUsedFunction) || !Objects.equals(this.engineType, editVideoInfo.engineType) || !Objects.equals(this.originEngineType, editVideoInfo.originEngineType) || !Boolean.valueOf(this.isAdaptTimelineDraft).equals(Boolean.valueOf(editVideoInfo.isAdaptTimelineDraft)) || !Objects.equals(this.mOperationCover, editVideoInfo.mOperationCover) || !Float.valueOf(this.userLastSrcVolume).equals(Float.valueOf(editVideoInfo.userLastSrcVolume)) || !Float.valueOf(this.configSrcVolume).equals(Float.valueOf(editVideoInfo.configSrcVolume)) || !Objects.equals(this.eventExtraInfo, editVideoInfo.eventExtraInfo) || !Objects.equals(this.publishNavId, editVideoInfo.publishNavId) || !Objects.equals(this.uploadId, editVideoInfo.uploadId) || this.mDraftState != editVideoInfo.mDraftState || this.mDraftType != editVideoInfo.mDraftType) {
            z6 = false;
        }
        return z6;
    }

    public boolean expectSkipVideoTranscode() {
        return ((UpperFawkesDeviceDecision.ExportSpeedOptimizationConfig) UpperFawkesDeviceDecision.h.getValue()).getEnableSkipVideoTranscode() && getResolutionType().getSize() == this.mEditNvsTimelineInfoBase.getResolutionType().getSize();
    }

    public String getAITool() {
        return TextUtils.isEmpty(this.mAITool) ? CaptureSchema.OLD_INVALID_ID_STRING : this.mAITool;
    }

    public String getAiContent() {
        return this.mAiContent;
    }

    public String getAiKeyword() {
        return this.mAiKeyword;
    }

    public String getAiPrompt() {
        return this.mAiPrompt;
    }

    public int getAiSource() {
        return this.mAiSource;
    }

    public long getAiStyleId() {
        return this.mAiStyleId;
    }

    public String getAiStyleName() {
        return this.mAiStyleName;
    }

    public boolean getAppliedAiStoryData() {
        return this.isAppliedAiStoryData;
    }

    public CaptionInfo getAsrDerivedCaptionInfo() {
        return this.mAsrDerivedCaptionInfo;
    }

    public int getBizFrom() {
        return this.mBizFrom;
    }

    public List<CaptionInfo> getCaptionInfoListTemp() {
        if (this.mCaptionInfoListTemp == null) {
            this.mCaptionInfoListTemp = new ArrayList();
        }
        return this.mCaptionInfoListTemp;
    }

    @JSONField(serialize = false)
    public List<CaptionInfo> getCaptionInfoListTempClone() {
        ArrayList arrayList = new ArrayList();
        if (!V.e(this.mCaptionInfoListTemp)) {
            Iterator<CaptionInfo> it = this.mCaptionInfoListTemp.iterator();
            while (it.hasNext()) {
                arrayList.add(CaptionInfo.duplicate(it.next()));
            }
        }
        return arrayList;
    }

    @Nullable
    public BMusic getCaptureBMusic() {
        return this.mCaptureBMusic;
    }

    public CaptureUsageInfo getCaptureUsageInfo() {
        return this.mCaptureUsageInfo;
    }

    public float getConfigSrcVolume() {
        return this.configSrcVolume;
    }

    public int getContributeType() {
        return this.mContributeType;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008a A[EDGE_INSN: B:34:0x008a->B:28:0x008a BREAK  A[LOOP:0: B:12:0x0034->B:35:0x0034], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0034 A[SYNTHETIC] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bilibili.studio.videoeditor.capturev3.data.CaptureCrossYearInfo.CrossYearBean getCrossYearBean() {
        /*
            r3 = this;
            r0 = r3
            com.bilibili.studio.videoeditor.capturev3.data.CaptureUsageInfo r0 = r0.mCaptureUsageInfo
            r5 = r0
            r0 = 0
            r6 = r0
            r0 = 0
            r4 = r0
            r0 = r5
            if (r0 != 0) goto Lf
            r0 = 0
            return r0
        Lf:
            r0 = r5
            java.util.List<com.bilibili.studio.videoeditor.capturev3.data.CaptureCrossYearInfo> r0 = r0.crossYearInfos
            r7 = r0
            r0 = r6
            r5 = r0
            r0 = r7
            if (r0 == 0) goto L8a
            r0 = r7
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2b
            r0 = r6
            r5 = r0
            goto L8a
        L2b:
            r0 = r7
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
        L34:
            r0 = r4
            r5 = r0
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L8a
            r0 = r7
            java.lang.Object r0 = r0.next()
            com.bilibili.studio.videoeditor.capturev3.data.CaptureCrossYearInfo r0 = (com.bilibili.studio.videoeditor.capturev3.data.CaptureCrossYearInfo) r0
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L34
            r0 = r6
            java.util.List<com.bilibili.studio.videoeditor.capturev3.data.CaptureCrossYearInfo$CrossYearBean> r0 = r0.imageShotInfos
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L34
            r0 = r5
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L64
            goto L34
        L64:
            r0 = r6
            java.util.List<com.bilibili.studio.videoeditor.capturev3.data.CaptureCrossYearInfo$CrossYearBean> r0 = r0.imageShotInfos
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.bilibili.studio.videoeditor.capturev3.data.CaptureCrossYearInfo$CrossYearBean r0 = (com.bilibili.studio.videoeditor.capturev3.data.CaptureCrossYearInfo.CrossYearBean) r0
            r6 = r0
            r0 = r4
            if (r0 == 0) goto L7f
            r0 = r4
            r5 = r0
            r0 = r6
            boolean r0 = r0.hitShot
            if (r0 == 0) goto L81
        L7f:
            r0 = r6
            r5 = r0
        L81:
            r0 = r5
            r4 = r0
            r0 = r6
            boolean r0 = r0.hitShot
            if (r0 == 0) goto L34
        L8a:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo.getCrossYearBean():com.bilibili.studio.videoeditor.capturev3.data.CaptureCrossYearInfo$CrossYearBean");
    }

    public CaptionInfo getDerivedCaptionInfo() {
        return this.mDerivedCaptionInfo;
    }

    public EditorDanmakuInfo getDerivedDanmakuInfo() {
        return this.mDerivedDanmakuInfo;
    }

    public String getDraftCoverPath() {
        return this.mDraftCoverPath;
    }

    public int getDraftState() {
        return this.mDraftState;
    }

    public int getDraftType() {
        return this.mDraftType;
    }

    @Nullable
    public EditorTemplateTabItemBean getEditTemplateInfo() {
        return this.mEditTemplateInfo;
    }

    @Nullable
    public EditVideoSmartTitle getEditVideoSmartTitle() {
        return this.mEditVideoSmartTitle;
    }

    @Nullable
    public EditorEnterInfo getEditorEnterInfo() {
        return this.mEditorEnterInfo;
    }

    public int getEditorMode() {
        return this.mEditorMode;
    }

    public String getEngineType() {
        return this.engineType;
    }

    public Map<String, String> getEventExtraInfo() {
        return this.eventExtraInfo;
    }

    public int getExportHdrType() {
        return this.mExportHdrType;
    }

    @Deprecated
    public int getExtractedFrameCount() {
        return this.mExtractedFrameCount;
    }

    @JSONField(serialize = false)
    public int getFrameExtractCount() {
        EditVideoPartitionPrediction editVideoPartitionPrediction = this.mPartitionPrediction;
        if (editVideoPartitionPrediction != null) {
            return editVideoPartitionPrediction.frameExtractCount;
        }
        return 0;
    }

    @JSONField(serialize = false)
    public int getFrameUploadCount() {
        EditVideoPartitionPrediction editVideoPartitionPrediction = this.mPartitionPrediction;
        if (editVideoPartitionPrediction != null) {
            return editVideoPartitionPrediction.frameUploadCount;
        }
        return 0;
    }

    public List<FrameZipInfo> getFrameZipInfoList() {
        return this.mFrameZipInfoList;
    }

    public String getImageLabels() {
        return this.mImageLabels;
    }

    public BiliImageTextTemplateBean getImageTextTemplate() {
        return this.mImageTextTemplate;
    }

    public EditVideoIntelligenceInfo getIntelligenceInfo() {
        return this.mIntelligenceInfo;
    }

    public int getIntelligenceState() {
        return this.mIntelligenceState;
    }

    public boolean getIsEdited() {
        return this.mIsEdited;
    }

    public boolean getIsMultiP() {
        return this.mIsMultiP;
    }

    public String getJumpParam() {
        return this.mJumpParam;
    }

    public List<CaptionInfo> getLastCaptionInfoList() {
        if (this.mLastCaptionInfoList == null) {
            this.mLastCaptionInfoList = new ArrayList();
        }
        return this.mLastCaptionInfoList;
    }

    @JSONField(serialize = false)
    public List<CaptionInfo> getLastCaptionInfoListClone() {
        ArrayList arrayList = new ArrayList();
        if (!V.e(this.mLastCaptionInfoList)) {
            Iterator<CaptionInfo> it = this.mLastCaptionInfoList.iterator();
            while (it.hasNext()) {
                arrayList.add(CaptionInfo.duplicate(it.next()));
            }
        }
        return arrayList;
    }

    public String getLiveKey() {
        return this.liveKey;
    }

    @Nullable
    @JSONField(serialize = false)
    public Set<String> getMaterialSet() {
        return this.materialSet;
    }

    @Nullable
    @JSONField(serialize = false)
    public List<MaterialUsedBean> getMaterialUsedList() {
        return this.materialUsedList;
    }

    @Nullable
    public MeicamTemplateBean getMeicamTemplateBean() {
        return this.mMeicamTemplateBean;
    }

    public CaptureSchema.MissionInfo getMissionInfo() {
        return this.mMissionInfo;
    }

    public List<MultiPArchive> getMultiP() {
        return this.multiP;
    }

    public BiliMusicBeatGalleryBean getMusicBeatGalleryBean() {
        return this.mMusicBeatGalleryBean;
    }

    public String getMuxFilePath() {
        return this.mMuxFilePath;
    }

    public MuxInfo getMuxInfo(Context context) {
        return c.g(context, this, false);
    }

    public MuxInfo getMuxInfo(Context context, boolean z6) {
        return c.g(context, this, z6);
    }

    @Nullable
    public OperationCover getOperationCover() {
        return this.mOperationCover;
    }

    public String getOriginEngineType() {
        return this.originEngineType;
    }

    @Nullable
    public EditVideoPartitionPrediction getPartitionPrediction() {
        return this.mPartitionPrediction;
    }

    @Nullable
    public <T> T getPublishData(@NotNull String str) {
        Map<String, Object> map = this.mPublishData;
        if (map == null) {
            return null;
        }
        try {
            T t7 = (T) map.get(str);
            if (t7 != null) {
                return t7;
            }
            return null;
        } catch (Exception e7) {
            return null;
        }
    }

    public Map<String, Object> getPublishData() {
        return this.mPublishData;
    }

    @Nullable
    public <T> T getPublishDataSafe(@NotNull String str, Class<T> cls) {
        Map<String, Object> map = this.mPublishData;
        T tCast = null;
        if (map != null) {
            try {
                Object obj = map.get(str);
                if (obj == null) {
                    return null;
                }
                tCast = null;
                if (cls.isInstance(obj)) {
                    tCast = cls.cast(obj);
                }
            } catch (Exception e7) {
                tCast = null;
            }
        }
        return tCast;
    }

    public String getPublishNavId() {
        return this.publishNavId;
    }

    public String getRecMusicSids() {
        return this.mRecMusicSids;
    }

    @Deprecated
    public int getRecommendCount() {
        return this.mRecommendCount;
    }

    @NotNull
    public String getReportData(String str) {
        return getReportData(str, "");
    }

    @NotNull
    public String getReportData(String str, String str2) {
        Map<String, String> map = this.mReportData;
        if (map == null) {
            return str2;
        }
        String str3 = map.get(str);
        if (str3 != null) {
            str2 = str3;
        }
        return str2;
    }

    public Map<String, String> getReportData() {
        return this.mReportData;
    }

    public ResolutionType getResolutionType() {
        return this.mResolutionType;
    }

    public CaptureSchema.SchemaInfo getSchemaInfo() {
        return this.mSchemaInfo;
    }

    @JSONField(serialize = false)
    public List<String> getTemplateMusicList() {
        EditorTemplateTabItemBean editTemplateInfo = getEditTemplateInfo();
        if (editTemplateInfo == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        if (!V.e(editTemplateInfo.bindMusicInfo)) {
            for (EditorTemplateBindMusicInfo editorTemplateBindMusicInfo : editTemplateInfo.bindMusicInfo) {
                if (!TextUtils.isEmpty(editorTemplateBindMusicInfo.sid) && !arrayList.contains(editorTemplateBindMusicInfo.sid)) {
                    arrayList.add(editorTemplateBindMusicInfo.sid);
                }
            }
        }
        EditorTempalteBindMaterialInfoBean editorTempalteBindMaterialInfoBean = editTemplateInfo.bindMaterialInfo;
        if (editorTempalteBindMaterialInfoBean != null && !V.e(editorTempalteBindMaterialInfoBean.getAudioId())) {
            for (String str : editTemplateInfo.bindMaterialInfo.getAudioId()) {
                if (!TextUtils.isEmpty(str) && !arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    @Nullable
    public String getUploadId() {
        return this.uploadId;
    }

    @Deprecated
    public int getUploadedFrameCount() {
        return this.mUploadedFrameCount;
    }

    public boolean getUseBmmSdkGray() {
        return this.mUseBmmSdkGray;
    }

    public String getUsedFunction() {
        return this.mUsedFunction;
    }

    public boolean getUsedSmartTitle() {
        return this.usedSmartTitle;
    }

    public float getUserLastSrcVolume() {
        return this.userLastSrcVolume;
    }

    public ArrayList<Float> getUserLastVolumeList() {
        return this.userLastVolumeList;
    }

    public String getVideoEnding() {
        return this.mVideoEnding;
    }

    public String getVideoOpening() {
        return this.mVideoOpening;
    }

    public Size getVideoSize() {
        if (getEditNvsTimelineInfoBase() != null) {
            return getEditNvsTimelineInfoBase().getVideoSize();
        }
        return null;
    }

    @Override // com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfoCore
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), Boolean.valueOf(this.autoPlay), this.mIntelligenceInfo, Integer.valueOf(this.mIntelligenceState), this.mRecMusicSids, this.mImageLabels, this.mCaptionInfoListTemp, this.mLastCaptionInfoList, this.mDerivedCaptionInfo, this.mAsrDerivedCaptionInfo, this.mDerivedDanmakuInfo, this.mCaptureBMusic, this.mMissionInfo, this.mCaptureUsageInfo, this.mSchemaInfo, this.mFrameZipInfoList, this.mPartitionPrediction, this.mEditVideoSmartTitle, this.mEditTemplateInfo, this.mMuxFilePath, Boolean.valueOf(this.mIsMultiP), Boolean.valueOf(this.mIsEdited), Boolean.valueOf(this.usedSmartTitle), Boolean.valueOf(this.mForbidEditReport), this.mJumpParam, this.mDraftCoverPath, Integer.valueOf(this.mContributeType), Integer.valueOf(this.mEditorMode), this.mMusicBeatGalleryBean, this.mMeicamTemplateBean, this.mImageTextTemplate, Boolean.valueOf(this.mUseBmmSdkGray), Integer.valueOf(this.mBizFrom), this.mPublishData, this.mReportData, Integer.valueOf(this.mExtractedFrameCount), Integer.valueOf(this.mUploadedFrameCount), Integer.valueOf(this.mRecommendCount), this.mEditorEnterInfo, this.mUsedFunction, Integer.valueOf(this.mDraftState), Integer.valueOf(this.mDraftType), this.mOperationCover, Boolean.valueOf(this.mFromDraft), this.mAITool, Long.valueOf(this.mAiStyleId), this.mAiStyleName, this.mAiPrompt, this.mAiKeyword, this.mAiContent, Boolean.valueOf(this.isAppliedAiStoryData), this.mVideoOpening, this.mVideoEnding, this.mResolutionType, Integer.valueOf(this.mExportHdrType), this.materialSet, this.materialUsedList, Float.valueOf(this.userLastSrcVolume), Float.valueOf(this.configSrcVolume), this.engineType, this.originEngineType, Boolean.valueOf(this.isAdaptTimelineDraft), this.eventExtraInfo, this.publishNavId, this.uploadId);
    }

    @Override // com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfoCore
    public void init() {
        super.init();
        this.mCaptionInfoListTemp = new ArrayList();
        this.mLastCaptionInfoList = new ArrayList();
        this.mFrameZipInfoList = new ArrayList();
        this.mIsEdited = false;
        this.mForbidEditReport = false;
        this.mIsMultiP = false;
    }

    public Boolean isAdaptTimelineDraft() {
        return Boolean.valueOf(this.isAdaptTimelineDraft);
    }

    public boolean isCancelByUser() {
        return this.isCancelByUser;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isEditReportAvailable() {
        /*
            r4 = this;
            kotlin.Lazy r0 = zw0.b.f130950a
            r8 = r0
            com.bilibili.lib.dd.DeviceDecision r0 = com.bilibili.lib.dd.DeviceDecision.INSTANCE
            r8 = r0
            r0 = 1
            r7 = r0
            r0 = r8
            java.lang.String r1 = "uper.editor_fast_publish_report"
            r2 = 1
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 == 0) goto L20
            r0 = r4
            boolean r0 = r0.isFastVideoByBizfrom()
            r6 = r0
            goto L25
        L20:
            r0 = r4
            boolean r0 = r0.usedSmartTitle
            r6 = r0
        L25:
            r0 = r4
            boolean r0 = r0.mForbidEditReport
            if (r0 != 0) goto L35
            r0 = r7
            r5 = r0
            r0 = r4
            boolean r0 = r0.mIsEdited
            if (r0 != 0) goto L40
        L35:
            r0 = r6
            if (r0 == 0) goto L3e
            r0 = r7
            r5 = r0
            goto L40
        L3e:
            r0 = 0
            r5 = r0
        L40:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo.isEditReportAvailable():boolean");
    }

    @JSONField(serialize = false)
    public boolean isExportHdr() {
        return this.mExportHdrType == 2;
    }

    @JSONField(serialize = false)
    public boolean isExportHdrTypeValid() {
        int i7 = this.mExportHdrType;
        boolean z6 = true;
        if (i7 != 2) {
            z6 = i7 == 1;
        }
        return z6;
    }

    public boolean isFastVideoByBizfrom() {
        int i7 = this.mBizFrom;
        return 107 == i7 || 108 == i7;
    }

    public boolean isForbidEditReport() {
        return this.mForbidEditReport;
    }

    public boolean isFromAutoDraft() {
        return this.mFromDraft && this.mDraftType == 2;
    }

    public boolean isFromDraft() {
        return this.mFromDraft;
    }

    public boolean isUsedAsrMusic() {
        return this.usedAsrMusic;
    }

    public boolean isUsedAsrRecord() {
        return this.usedAsrRecord;
    }

    public boolean isUsedAsrVideo() {
        return this.usedAsrVideo;
    }

    public boolean needMakeVideo() {
        List<EditVideoClip> editVideoTracks = getEditVideoTracks();
        if (editVideoTracks == null) {
            BLog.e(TAG, "needMakeVideoNew error,视频轨道数据异常");
            return true;
        }
        if (editVideoTracks.size() > 1) {
            return true;
        }
        List<BClip> userTrackBClipList = getUserTrackBClipList();
        if (userTrackBClipList == null) {
            BLog.e(TAG, "needMakeVideoNew error,用户素材轨道节点数据异常");
            EditVideoInfoUtils.throwDebugException("EditVideoInfo.needMakeVideoNew userTrackBClipList==null");
            return true;
        }
        boolean z6 = this.mIsEdited || userTrackBClipList.size() > 1 || (userTrackBClipList.size() == 1 && userTrackBClipList.get(0).clipMediaType == 0);
        boolean z7 = z6;
        if (userTrackBClipList.size() == 1) {
            String str = userTrackBClipList.get(0).videoPath;
            z7 = z6;
            if (!TextUtils.isEmpty(str)) {
                z7 = z6;
                if (str.toLowerCase(Locale.getDefault()).endsWith("mov")) {
                    R50.a aVarS = null;
                    r rVarU = a.a.a.a != null ? r.u() : null;
                    if (rVarU != null) {
                        aVarS = rVarU.s(str);
                    }
                    z7 = z6;
                    if (aVarS != null) {
                        z7 = z6;
                        if (aVarS.a.getAudioStreamCount() > 1) {
                            z7 = true;
                        }
                    }
                }
            }
        }
        boolean z8 = true;
        if (!z7) {
            z8 = getResolutionType().getSize() != getEditNvsTimelineInfoBase().getResolutionType().getSize();
        }
        return z8;
    }

    public boolean prepare() {
        if (V.e(this.mVideoList)) {
            BLog.e(TAG, "failed prepare select video list for no videos to be edited");
            return false;
        }
        prepareSelectVideoList();
        if (prepareEditNvsTimelineInfo()) {
            return true;
        }
        BLog.e(TAG, "prepareEditNvsTimelineInfo fail");
        return false;
    }

    public void putPublishData(@NotNull String str, @Nullable Object obj) {
        if (this.mPublishData == null) {
            this.mPublishData = new HashMap();
        }
        this.mPublishData.put(str, obj);
    }

    public EditVideoInfo putReportData(String str, String str2) {
        if (this.mReportData == null) {
            this.mReportData = new HashMap();
        }
        this.mReportData.put(str, str2);
        return this;
    }

    public void setAITool(String str) {
        this.mAITool = str;
    }

    public void setAiContent(String str) {
        this.mAiContent = str;
    }

    public void setAiKeyword(String str) {
        this.mAiKeyword = str;
    }

    public void setAiPrompt(String str) {
        this.mAiPrompt = str;
    }

    public void setAiSource(int i7) {
        this.mAiSource = i7;
    }

    public void setAiStyleId(long j7) {
        this.mAiStyleId = j7;
    }

    public void setAiStyleName(String str) {
        this.mAiStyleName = str;
    }

    public void setAppliedAiStoryData(boolean z6) {
        this.isAppliedAiStoryData = z6;
    }

    public void setAsrDerivedCaptionInfo(CaptionInfo captionInfo) {
        this.mAsrDerivedCaptionInfo = captionInfo;
    }

    public void setBizFrom(int i7) {
        this.mBizFrom = i7;
    }

    public void setCancelByUser(boolean z6) {
        this.isCancelByUser = z6;
    }

    public void setCaptionInfoListTemp(List<CaptionInfo> list) {
        this.mCaptionInfoListTemp = list;
    }

    public void setCaptureBMusic(BMusic bMusic) {
        this.mCaptureBMusic = bMusic;
    }

    public void setCaptureUsageInfo(CaptureUsageInfo captureUsageInfo) {
        this.mCaptureUsageInfo = captureUsageInfo;
    }

    public void setClipBackgroundBlur(boolean z6) {
        EditVideoClip mainVideoTrack = getMainVideoTrack();
        if (mainVideoTrack == null) {
            EditVideoInfoUtils.throwDebugException("EditVideoInfo.setClipBackgroundBlur mainVideoTrack==null");
        } else {
            mainVideoTrack.setClipBackgroundBlur(z6);
        }
    }

    public void setConfigSrcVolume(float f7) {
        this.configSrcVolume = f7;
    }

    public void setContributeType(int i7) {
        if (i7 != 9297) {
            this.mContributeType = 9042;
        } else {
            this.mContributeType = 9297;
        }
    }

    public void setDerivedCaptionInfo(CaptionInfo captionInfo) {
        this.mDerivedCaptionInfo = captionInfo;
    }

    public void setDerivedDanmakuInfo(EditorDanmakuInfo editorDanmakuInfo) {
        this.mDerivedDanmakuInfo = editorDanmakuInfo;
    }

    public void setDraftCoverPath(String str) {
        this.mDraftCoverPath = str;
    }

    public void setDraftState(int i7) {
        this.mDraftState = i7;
    }

    public void setDraftType(int i7) {
        this.mDraftType = i7;
    }

    public void setEditTemplateInfo(EditorTemplateTabItemBean editorTemplateTabItemBean) {
        this.mEditTemplateInfo = editorTemplateTabItemBean;
    }

    public void setEditVideoSmartTitle(EditVideoSmartTitle editVideoSmartTitle) {
        this.mEditVideoSmartTitle = editVideoSmartTitle;
    }

    public void setEditorEnterInfo(EditorEnterInfo editorEnterInfo) {
        this.mEditorEnterInfo = editorEnterInfo;
    }

    public void setEditorMode(int i7) {
        this.mEditorMode = i7;
    }

    public void setEngineType(String str) {
        this.engineType = str;
    }

    public void setEventExtraInfo(Map<String, String> map) {
        this.eventExtraInfo = map;
    }

    public void setExportHdrType(int i7) {
        this.mExportHdrType = i7;
    }

    public void setExtractedFrameCount(int i7) {
        this.mExtractedFrameCount = i7;
    }

    public void setForbidEditReport(boolean z6) {
        this.mForbidEditReport = z6;
    }

    @JSONField(serialize = false)
    public void setFrameExtractCount(int i7) {
        if (this.mPartitionPrediction == null) {
            this.mPartitionPrediction = new EditVideoPartitionPrediction();
        }
        this.mPartitionPrediction.frameExtractCount = i7;
    }

    @JSONField(serialize = false)
    public void setFrameUploadCount(int i7) {
        if (this.mPartitionPrediction == null) {
            this.mPartitionPrediction = new EditVideoPartitionPrediction();
        }
        this.mPartitionPrediction.frameUploadCount = i7;
    }

    public void setFrameZipInfoList(List<FrameZipInfo> list) {
        this.mFrameZipInfoList = list;
    }

    public void setFromDraft(boolean z6) {
        this.mFromDraft = z6;
    }

    public void setImageLabels(String str) {
        this.mImageLabels = str;
    }

    public void setImageTextTemplate(BiliImageTextTemplateBean biliImageTextTemplateBean) {
        this.mImageTextTemplate = biliImageTextTemplateBean;
    }

    public void setIntelligenceInfo(EditVideoIntelligenceInfo editVideoIntelligenceInfo) {
        this.mIntelligenceInfo = editVideoIntelligenceInfo;
    }

    public void setIntelligenceState(int i7) {
        this.mIntelligenceState = i7;
    }

    public void setIsAdaptTimelineDraft(boolean z6) {
        this.isAdaptTimelineDraft = z6;
    }

    public void setIsEdited(boolean z6) {
        this.mIsEdited = z6;
    }

    public void setIsMultiP(boolean z6) {
        this.mIsMultiP = z6;
    }

    public void setJumpParam(String str) {
        this.mJumpParam = str;
    }

    public void setLastCaptionInfoList(List<CaptionInfo> list) {
        this.mLastCaptionInfoList = list;
    }

    public void setLiveKey(String str) {
        this.liveKey = str;
    }

    @JSONField(serialize = false)
    public void setMaterialSet(Set<String> set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.materialSet = linkedHashSet;
        linkedHashSet.addAll(set);
    }

    @JSONField(serialize = false)
    public void setMaterialUsedList(List<MaterialUsedBean> list) {
        this.materialUsedList = new ArrayList();
        for (MaterialUsedBean materialUsedBean : list) {
            this.materialUsedList.add(new MaterialUsedBean(materialUsedBean.filePath, materialUsedBean.usedType));
        }
    }

    public void setMeicamTemplateBean(MeicamTemplateBean meicamTemplateBean) {
        this.mMeicamTemplateBean = meicamTemplateBean;
    }

    public void setMissionInfo(CaptureSchema.MissionInfo missionInfo) {
        this.mMissionInfo = missionInfo;
    }

    public void setMultiP(List<MultiPArchive> list) {
        this.multiP = list;
    }

    public void setMusicBeatGalleryBean(BiliMusicBeatGalleryBean biliMusicBeatGalleryBean) {
        this.mMusicBeatGalleryBean = biliMusicBeatGalleryBean;
    }

    public void setMuxFilePath(String str) {
        this.mMuxFilePath = str;
    }

    public void setOperationCover(@Nullable OperationCover operationCover) {
        this.mOperationCover = operationCover;
    }

    public void setOriginEngineType(String str) {
        this.originEngineType = str;
    }

    public void setPartitionPrediction(EditVideoPartitionPrediction editVideoPartitionPrediction) {
        this.mPartitionPrediction = editVideoPartitionPrediction;
    }

    @JSONField(serialize = false)
    public void setPartitionTaskId(String str, String str2) {
        if (this.mPartitionPrediction == null) {
            this.mPartitionPrediction = new EditVideoPartitionPrediction();
        }
        EditVideoPartitionPrediction editVideoPartitionPrediction = this.mPartitionPrediction;
        editVideoPartitionPrediction.partitionTaskId = str;
        editVideoPartitionPrediction.zipUrl = str2;
    }

    public void setPublishData(Map<String, Object> map) {
        this.mPublishData = map;
    }

    public void setPublishNavId(String str) {
        this.publishNavId = str;
    }

    public void setRecMusicSids(String str) {
        this.mRecMusicSids = str;
    }

    public void setRecommendCount(int i7) {
        this.mRecommendCount = i7;
    }

    public void setReportData(Map<String, String> map) {
        this.mReportData = map;
    }

    public void setResolutionType(ResolutionType resolutionType) {
        this.mResolutionType = resolutionType;
    }

    public void setSchemaInfo(CaptureSchema.SchemaInfo schemaInfo) {
        this.mSchemaInfo = schemaInfo;
    }

    @JSONField(serialize = false)
    public void setSmartTitleFirstFrameZip(String str) {
        synchronized (this) {
            if (this.mEditVideoSmartTitle == null) {
                this.mEditVideoSmartTitle = new EditVideoSmartTitle();
            }
            this.mEditVideoSmartTitle.firstFrameZipUrl = str;
        }
    }

    @JSONField(serialize = false)
    public void setSmartTitleLabel(EditorAIRecResult editorAIRecResult) {
        synchronized (this) {
            if (editorAIRecResult == null) {
                return;
            }
            if (this.mEditVideoSmartTitle == null) {
                this.mEditVideoSmartTitle = new EditVideoSmartTitle();
            }
            EditVideoSmartTitle editVideoSmartTitle = this.mEditVideoSmartTitle;
            editVideoSmartTitle.smartTitleLabel = editorAIRecResult.materialLabel;
            editVideoSmartTitle.recResultCode = editorAIRecResult.labelError.getErrorCode();
            this.mEditVideoSmartTitle.recResultMsg = editorAIRecResult.labelError.getErrorMsg();
            this.mEditVideoSmartTitle.recFrameAndTag = editorAIRecResult.frameAndTag;
        }
    }

    @JSONField(serialize = false)
    public void setSmartTitleRound(int i7, int i8) {
        synchronized (this) {
            if (this.mEditVideoSmartTitle == null) {
                this.mEditVideoSmartTitle = new EditVideoSmartTitle();
            }
            EditVideoSmartTitle editVideoSmartTitle = this.mEditVideoSmartTitle;
            editVideoSmartTitle.curUploadRound = i7;
            editVideoSmartTitle.totalUploadRound = i8;
        }
    }

    @JSONField(serialize = false)
    public void setSmartTitleUrls(String str) {
        synchronized (this) {
            if (this.mEditVideoSmartTitle == null) {
                this.mEditVideoSmartTitle = new EditVideoSmartTitle();
            }
            this.mEditVideoSmartTitle.zipUrls = str;
        }
    }

    public void setUploadId(String str) {
        this.uploadId = str;
    }

    public void setUploadedFrameCount(int i7) {
        this.mUploadedFrameCount = i7;
    }

    public void setUseBmmSdkGray(boolean z6) {
        this.mUseBmmSdkGray = z6;
    }

    public void setUsedAsrMusic(boolean z6) {
        this.usedAsrMusic = z6;
    }

    public void setUsedAsrRecord(boolean z6) {
        this.usedAsrRecord = z6;
    }

    public void setUsedAsrVideo(boolean z6) {
        this.usedAsrVideo = z6;
    }

    public void setUsedFunction(String str) {
        this.mUsedFunction = str;
    }

    public void setUsedSmartTitle(boolean z6) {
        this.usedSmartTitle = z6;
    }

    public void setUserLastSrcVolume(float f7) {
        this.userLastSrcVolume = f7;
    }

    public void setUserLastVolumeList(ArrayList<Float> arrayList) {
        this.userLastVolumeList.clear();
        this.userLastVolumeList.addAll(arrayList);
    }

    public void setVideoEnding(String str) {
        this.mVideoEnding = str;
    }

    public void setVideoOpening(String str) {
        this.mVideoOpening = str;
    }

    public void update(EditVideoInfo editVideoInfo, boolean z6) {
        if (editVideoInfo == null) {
            return;
        }
        setProjectVersion(editVideoInfo.getProjectVersion());
        setDraftId(editVideoInfo.getDraftId());
        setEditNvsTimelineInfoBase(editVideoInfo.getEditNvsTimelineInfoBaseClone());
        setEditVideoTracks(editVideoInfo.getEditVideoTracksClone());
        setCaptionInfoList(editVideoInfo.getCaptionInfoListClone());
        setDanmakuInfoList(editVideoInfo.getDanmakuInfoListClone());
        setRecordInfoList(editVideoInfo.getRecordInfoListClone());
        setTtsInfoList(editVideoInfo.getTtsInfoListClone());
        setEditorMusicInfo(editVideoInfo.getEditorMusicInfoClone());
        setBiliEditorStickerInfoList(editVideoInfo.getBiliEditorStickerInfoListClone());
        setPictureRatioInfo(editVideoInfo.getPictureRatioInfoClone());
        if (editVideoInfo.getOriginSize() != null) {
            setOriginSize(editVideoInfo.getOriginSize().m10451clone());
        } else {
            setOriginSize(null);
        }
        setBiliEditorMusicRhythmEntity(editVideoInfo.getBiliEditorMusicRhythmEntity());
        setBiliEditorTimelineFxList(editVideoInfo.getBiliEditorTimelineFxListClone());
        setTimeLineFillMode(editVideoInfo.getTimeLineFillMode());
        setSelectVideoList(getSelectVideoListClone());
        this.mIntelligenceInfo = editVideoInfo.mIntelligenceInfo;
        this.mIntelligenceState = editVideoInfo.mIntelligenceState;
        this.mCaptionInfoListTemp = editVideoInfo.getCaptionInfoListTempClone();
        this.mLastCaptionInfoList = editVideoInfo.getLastCaptionInfoListClone();
        CaptionInfo captionInfo = editVideoInfo.mDerivedCaptionInfo;
        if (captionInfo != null) {
            this.mDerivedCaptionInfo = captionInfo.mo9886clone();
        } else {
            this.mDerivedCaptionInfo = null;
        }
        CaptionInfo captionInfo2 = editVideoInfo.mAsrDerivedCaptionInfo;
        if (captionInfo2 != null) {
            this.mAsrDerivedCaptionInfo = captionInfo2.mo9886clone();
        } else {
            this.mAsrDerivedCaptionInfo = null;
        }
        EditorDanmakuInfo editorDanmakuInfo = editVideoInfo.mDerivedDanmakuInfo;
        if (editorDanmakuInfo != null) {
            this.mDerivedDanmakuInfo = editorDanmakuInfo.mo9886clone();
        } else {
            this.mDerivedDanmakuInfo = null;
        }
        this.mCaptureBMusic = editVideoInfo.getCaptureBMusicClone();
        this.mMissionInfo = editVideoInfo.mMissionInfo;
        this.mCaptureUsageInfo = editVideoInfo.mCaptureUsageInfo;
        this.mSchemaInfo = editVideoInfo.mSchemaInfo;
        this.mFrameZipInfoList = editVideoInfo.mFrameZipInfoList;
        if (z6) {
            EditVideoPartitionPrediction editVideoPartitionPrediction = editVideoInfo.mPartitionPrediction;
            if (editVideoPartitionPrediction != null) {
                this.mPartitionPrediction = editVideoPartitionPrediction;
            } else {
                this.mPartitionPrediction = null;
            }
            EditVideoSmartTitle editVideoSmartTitle = editVideoInfo.mEditVideoSmartTitle;
            if (editVideoSmartTitle != null) {
                this.mEditVideoSmartTitle = editVideoSmartTitle;
            } else {
                this.mEditVideoSmartTitle = null;
            }
        }
        EditorTemplateTabItemBean editorTemplateTabItemBean = editVideoInfo.mEditTemplateInfo;
        if (editorTemplateTabItemBean != null) {
            this.mEditTemplateInfo = editorTemplateTabItemBean.m10146clone();
        } else {
            this.mEditTemplateInfo = null;
        }
        this.mMuxFilePath = editVideoInfo.mMuxFilePath;
        this.mIsMultiP = editVideoInfo.mIsMultiP;
        this.mIsEdited = editVideoInfo.mIsEdited;
        this.mForbidEditReport = editVideoInfo.mForbidEditReport;
        this.mJumpParam = editVideoInfo.mJumpParam;
        this.mDraftCoverPath = editVideoInfo.mDraftCoverPath;
        this.mContributeType = editVideoInfo.getContributeType();
        this.mEditorMode = editVideoInfo.mEditorMode;
        this.mMusicBeatGalleryBean = editVideoInfo.mMusicBeatGalleryBean;
        this.mMeicamTemplateBean = editVideoInfo.mMeicamTemplateBean;
        this.mImageTextTemplate = editVideoInfo.mImageTextTemplate;
        this.mUseBmmSdkGray = editVideoInfo.mUseBmmSdkGray;
        this.mEditVideoGrayControl = editVideoInfo.mEditVideoGrayControl;
        this.mBizFrom = editVideoInfo.mBizFrom;
        this.mPublishData = editVideoInfo.mPublishData;
        this.mReportData = editVideoInfo.mReportData;
        this.mExtractedFrameCount = editVideoInfo.mExtractedFrameCount;
        this.mUploadedFrameCount = editVideoInfo.mUploadedFrameCount;
        this.mRecommendCount = editVideoInfo.mRecommendCount;
        this.mUsedFunction = editVideoInfo.getUsedFunction();
        this.mFromDraft = editVideoInfo.isFromDraft();
        this.mAITool = editVideoInfo.getAITool();
        this.mAiStyleId = editVideoInfo.getAiStyleId();
        this.mAiStyleName = editVideoInfo.getAiStyleName();
        this.mAiPrompt = editVideoInfo.getAiPrompt();
        this.mAiKeyword = editVideoInfo.getAiKeyword();
        this.mAiContent = editVideoInfo.getAiContent();
        this.isAppliedAiStoryData = editVideoInfo.getAppliedAiStoryData();
        this.mVideoOpening = editVideoInfo.getVideoOpening();
        this.mVideoEnding = editVideoInfo.getVideoEnding();
        this.mExportHdrType = editVideoInfo.getExportHdrType();
        this.engineType = editVideoInfo.engineType;
        this.originEngineType = editVideoInfo.originEngineType;
        this.isAdaptTimelineDraft = editVideoInfo.isAdaptTimelineDraft;
        this.userLastSrcVolume = editVideoInfo.userLastSrcVolume;
        this.configSrcVolume = editVideoInfo.configSrcVolume;
        this.eventExtraInfo = editVideoInfo.eventExtraInfo;
        this.usedSmartTitle = editVideoInfo.usedSmartTitle;
        this.publishNavId = editVideoInfo.publishNavId;
        this.uploadId = editVideoInfo.uploadId;
        this.multiP = editVideoInfo.multiP;
        this.mDraftState = editVideoInfo.mDraftState;
        this.mDraftType = editVideoInfo.mDraftType;
    }

    public void updateCaptureUsageInfo(@Nullable CaptureUsageInfo captureUsageInfo) {
        if (captureUsageInfo != null) {
            this.mCaptureUsageInfo.mStickerIds.addAll(captureUsageInfo.mStickerIds);
            this.mCaptureUsageInfo.mCameraFacings.addAll(captureUsageInfo.mCameraFacings);
            this.mCaptureUsageInfo.mFilterIds.addAll(captureUsageInfo.mFilterIds);
            this.mCaptureUsageInfo.mMusicIds.addAll(captureUsageInfo.mMusicIds);
            this.mCaptureUsageInfo.mMakeupIds.addAll(captureUsageInfo.mMakeupIds);
            this.mCaptureUsageInfo.mSpeeds.addAll(captureUsageInfo.mSpeeds);
            this.mCaptureUsageInfo.videoCooperateIds.addAll(captureUsageInfo.videoCooperateIds);
        }
    }

    public int updateFPS() {
        int i7 = 30;
        if (((UpperFawkesDeviceDecision.ExportQualityOptimizationConfig) UpperFawkesDeviceDecision.f105490i.getValue()).getSupport60FPS()) {
            Iterator<FileInfo> it = this.mVideoList.iterator();
            while (true) {
                i7 = 30;
                if (!it.hasNext()) {
                    break;
                }
                String filePath = it.next().getFilePath();
                R50.a aVarS = null;
                r rVarU = a.a.a.a != null ? r.u() : null;
                if (rVarU != null) {
                    aVarS = rVarU.s(filePath);
                }
                if (aVarS != null && aVarS.a.getAVFileType() == 0) {
                    IRational iRationalBox = StudioRationalImplX.box(aVarS.a.getVideoStreamFrameRate(0));
                    if (iRationalBox.getDen() > 0 && iRationalBox.getNum() / iRationalBox.getDen() >= 60) {
                        i7 = 60;
                        break;
                    }
                }
            }
            this.mEditNvsTimelineInfoBase.setFps(i7);
        }
        T7.a.a(i7, "updateFPS: ", TAG);
        return i7;
    }

    public Size updateVideoSize() {
        Size sizeD = P.d(this.mVideoList);
        PictureRatioInfo pictureRatioInfo = this.mPictureRatioInfo;
        Size sizeA = sizeD;
        if (pictureRatioInfo != null) {
            sizeA = sizeD;
            if (pictureRatioInfo.ratio > 0.0f) {
                sizeA = P.a(this.mPictureRatioInfo.ratio, sizeD.getWidth(), sizeD.getHeight());
            }
        }
        this.mEditNvsTimelineInfoBase.setVideoSize(sizeA);
        BLog.e(TAG, "updateVideoSize: " + sizeA);
        return sizeA;
    }
}
