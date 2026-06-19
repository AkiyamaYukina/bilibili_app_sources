package com.bilibili.studio.videoeditor.editor.editdata;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.api.BiliConfig;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.moudle.danmaku.v1.EditorDanmakuInfo;
import com.bilibili.studio.editor.moudle.music.common.EditorMusicInfo;
import com.bilibili.studio.editor.moudle.sticker.v1.EditFxStickerClip;
import com.bilibili.studio.editor.repository.data.BiliEditorStickerInfo;
import com.bilibili.studio.editor.repository.data.BiliEditorTimelineVideoFx;
import com.bilibili.studio.editor.repository.entity.BiliEditorMusicBeatEntity;
import com.bilibili.studio.editor.repository.entity.BiliEditorMusicRhythmEntity;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.bean.BMusic;
import com.bilibili.studio.videoeditor.bean.SelectVideo;
import com.bilibili.studio.videoeditor.bgm.Bgm;
import com.bilibili.studio.videoeditor.editbase.filter.model.EditFxFilterInfo;
import com.bilibili.studio.videoeditor.editbase.visualeffects.model.EditVisualEffectsInfo;
import com.bilibili.studio.videoeditor.ms.filter.FilterInfo;
import com.bilibili.studio.videoeditor.ms.picture.PictureRatioInfo;
import com.bilibili.studio.videoeditor.ms.picture.SceneFxInfo;
import com.bilibili.studio.videoeditor.ms.picture.Transform2DFxInfo;
import com.bilibili.studio.videoeditor.ms.record.RecordInfo;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import com.bilibili.studio.videoeditor.nvsstreaming.EditNvsTimelineInfoBase;
import com.bilibili.studio.videoeditor.util.V;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/editdata/EditVideoInfoCore.class */
@Keep
public class EditVideoInfoCore extends EditVideoInfoBase {

    @Deprecated
    private BMusic mBMusic;

    @Deprecated
    private BiliEditorMusicBeatEntity mBiliEditorMusicBeatEntity;
    private BiliEditorMusicRhythmEntity mBiliEditorMusicRhythmEntity;
    private ArrayList<BiliEditorStickerInfo> mBiliEditorStickerInfoList;
    private List<BiliEditorTimelineVideoFx> mBiliEditorTimelineFxList;
    private List<CaptionInfo> mCaptionInfoList;

    @Nullable
    private List<EditorDanmakuInfo> mDanmakuInfoList;
    private volatile long mDraftId;

    @Deprecated
    private EditFxFilterInfo mEditFxFilterInfo;

    @Deprecated
    private List<EditFxStickerClip> mEditFxStickerClipList;
    protected EditNvsTimelineInfoBase mEditNvsTimelineInfoBase;

    @Deprecated
    private EditVideoClip mEditVideoClip;
    private List<EditVideoClip> mEditVideoTracks;

    @Deprecated
    private EditVisualEffectsInfo mEditVisualEffectsInfo;
    private EditorMusicInfo mEditorMusicInfo;

    @Deprecated
    private boolean mEnableVolume;

    @Nullable
    @Deprecated
    private FilterInfo mFilterInfo;

    @Deprecated
    private float mNativeVolume;
    private Size mOriginSize;
    protected PictureRatioInfo mPictureRatioInfo;
    private List<RecordInfo> mRecordInfoList;

    @Deprecated
    private List<SceneFxInfo> mSceneFxInfoList;
    protected List<SelectVideo> mSelectVideoList;
    private int mTimeLineFillMode;

    @Deprecated
    private List<Transform2DFxInfo> mTransform2DFxInfoList;

    @Deprecated
    private List<TransitionInfo> mTransitionInfoList;
    private List<EditTtsInfo> mTtsInfoList;
    private long projectVersion;

    public EditVideoInfoCore() {
        this.projectVersion = 0L;
        this.mTimeLineFillMode = 26770;
    }

    public EditVideoInfoCore(String str, List<FileInfo> list, EditVideoTimeControl editVideoTimeControl) {
        super(str, list, editVideoTimeControl);
        this.projectVersion = 0L;
        this.mTimeLineFillMode = 26770;
    }

    public int addMainVideoTrack(EditVideoClip editVideoClip) {
        if (editVideoClip == null || !editVideoClip.isMainTypeTrack()) {
            return -1;
        }
        this.mEditVideoTracks.add(0, editVideoClip);
        return 0;
    }

    public int addPipVideoTrack(EditVideoClip editVideoClip) {
        if (!editVideoClip.isPipTypeTrack()) {
            return -1;
        }
        this.mEditVideoTracks.add(editVideoClip);
        return this.mEditVideoTracks.size() - 1;
    }

    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditVideoInfoCore)) {
            return false;
        }
        EditVideoInfoCore editVideoInfoCore = (EditVideoInfoCore) obj;
        if (this.projectVersion != editVideoInfoCore.projectVersion || this.mDraftId != editVideoInfoCore.mDraftId || this.mTimeLineFillMode != editVideoInfoCore.mTimeLineFillMode || Float.compare(editVideoInfoCore.mNativeVolume, this.mNativeVolume) != 0 || this.mEnableVolume != editVideoInfoCore.mEnableVolume || !Objects.equals(this.mEditNvsTimelineInfoBase, editVideoInfoCore.mEditNvsTimelineInfoBase) || !Objects.equals(this.mCaptionInfoList, editVideoInfoCore.mCaptionInfoList) || !Objects.equals(this.mDanmakuInfoList, editVideoInfoCore.mDanmakuInfoList) || !Objects.equals(this.mRecordInfoList, editVideoInfoCore.mRecordInfoList) || !Objects.equals(this.mEditorMusicInfo, editVideoInfoCore.mEditorMusicInfo) || !Objects.equals(this.mBiliEditorStickerInfoList, editVideoInfoCore.mBiliEditorStickerInfoList) || !Objects.equals(this.mPictureRatioInfo, editVideoInfoCore.mPictureRatioInfo) || !Objects.equals(this.mBiliEditorTimelineFxList, editVideoInfoCore.mBiliEditorTimelineFxList) || !Objects.equals(this.mBiliEditorMusicRhythmEntity, editVideoInfoCore.mBiliEditorMusicRhythmEntity) || !Objects.equals(this.mSelectVideoList, editVideoInfoCore.mSelectVideoList) || !Objects.equals(this.mOriginSize, editVideoInfoCore.mOriginSize) || !Objects.equals(this.mEditVideoTracks, editVideoInfoCore.mEditVideoTracks) || !Objects.equals(this.mTtsInfoList, editVideoInfoCore.mTtsInfoList) || !Objects.equals(this.mEditVideoClip, editVideoInfoCore.mEditVideoClip) || !Objects.equals(this.mTransitionInfoList, editVideoInfoCore.mTransitionInfoList) || !Objects.equals(this.mTransform2DFxInfoList, editVideoInfoCore.mTransform2DFxInfoList) || !Objects.equals(this.mSceneFxInfoList, editVideoInfoCore.mSceneFxInfoList) || !Objects.equals(this.mEditFxFilterInfo, editVideoInfoCore.mEditFxFilterInfo) || !Objects.equals(this.mEditVisualEffectsInfo, editVideoInfoCore.mEditVisualEffectsInfo) || !Objects.equals(this.mFilterInfo, editVideoInfoCore.mFilterInfo) || !Objects.equals(this.mBMusic, editVideoInfoCore.mBMusic) || !Objects.equals(this.mEditFxStickerClipList, editVideoInfoCore.mEditFxStickerClipList) || !Objects.equals(this.mBiliEditorMusicBeatEntity, editVideoInfoCore.mBiliEditorMusicBeatEntity)) {
            z6 = false;
        }
        return z6;
    }

    @JSONField(serialize = false)
    @Deprecated
    public List<BClip> getBClipList() {
        EditVideoClip editVideoClip = this.mEditVideoClip;
        if (editVideoClip == null) {
            return null;
        }
        return editVideoClip.getBClipList();
    }

    public BMusic getBMusic() {
        return this.mBMusic;
    }

    @Nullable
    public BiliEditorMusicBeatEntity getBiliEditorMusicBeatEntity() {
        return this.mBiliEditorMusicBeatEntity;
    }

    @Nullable
    public BiliEditorMusicRhythmEntity getBiliEditorMusicRhythmEntity() {
        return this.mBiliEditorMusicRhythmEntity;
    }

    public ArrayList<BiliEditorStickerInfo> getBiliEditorStickerInfoList() {
        return this.mBiliEditorStickerInfoList;
    }

    @JSONField(serialize = false)
    public ArrayList<BiliEditorStickerInfo> getBiliEditorStickerInfoListClone() {
        ArrayList<BiliEditorStickerInfo> arrayList = new ArrayList<>();
        Iterator<BiliEditorStickerInfo> it = this.mBiliEditorStickerInfoList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo9886clone());
        }
        return arrayList;
    }

    public List<BiliEditorTimelineVideoFx> getBiliEditorTimelineFxList() {
        return this.mBiliEditorTimelineFxList;
    }

    @JSONField(serialize = false)
    public List<BiliEditorTimelineVideoFx> getBiliEditorTimelineFxListClone() {
        ArrayList arrayList = new ArrayList();
        if (!V.e(this.mBiliEditorTimelineFxList)) {
            Iterator<BiliEditorTimelineVideoFx> it = this.mBiliEditorTimelineFxList.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m10167clone());
            }
        }
        return arrayList;
    }

    @NonNull
    public List<CaptionInfo> getCaptionInfoList() {
        if (this.mCaptionInfoList == null) {
            this.mCaptionInfoList = new ArrayList();
        }
        return this.mCaptionInfoList;
    }

    @JSONField(serialize = false)
    public List<CaptionInfo> getCaptionInfoListClone() {
        ArrayList arrayList = new ArrayList();
        if (!V.e(this.mCaptionInfoList)) {
            Iterator<CaptionInfo> it = this.mCaptionInfoList.iterator();
            while (it.hasNext()) {
                arrayList.add(CaptionInfo.duplicate(it.next()));
            }
        }
        return arrayList;
    }

    @Nullable
    public List<EditorDanmakuInfo> getDanmakuInfoList() {
        return this.mDanmakuInfoList;
    }

    @JSONField(serialize = false)
    public List<EditorDanmakuInfo> getDanmakuInfoListClone() {
        ArrayList arrayList = new ArrayList();
        if (!V.e(this.mDanmakuInfoList)) {
            Iterator<EditorDanmakuInfo> it = this.mDanmakuInfoList.iterator();
            while (it.hasNext()) {
                arrayList.add(EditorDanmakuInfo.duplicateDanmaku(it.next()));
            }
        }
        return arrayList;
    }

    public long getDraftId() {
        return this.mDraftId;
    }

    public EditFxFilterInfo getEditFxFilterInfo() {
        return this.mEditFxFilterInfo;
    }

    public List<EditFxStickerClip> getEditFxStickerClipList() {
        return this.mEditFxStickerClipList;
    }

    public EditNvsTimelineInfoBase getEditNvsTimelineInfoBase() {
        return this.mEditNvsTimelineInfoBase;
    }

    public EditNvsTimelineInfoBase getEditNvsTimelineInfoBaseClone() {
        EditNvsTimelineInfoBase editNvsTimelineInfoBase = this.mEditNvsTimelineInfoBase;
        if (editNvsTimelineInfoBase == null) {
            return null;
        }
        return editNvsTimelineInfoBase.m10486clone();
    }

    public EditVideoClip getEditVideoClip() {
        return this.mEditVideoClip;
    }

    public List<String> getEditVideoTrackFile() {
        ArrayList arrayList = new ArrayList();
        EditVideoClip userVideoTrack = getUserVideoTrack();
        if (userVideoTrack != null && userVideoTrack.getBClipList() != null) {
            Iterator<BClip> it = userVideoTrack.getBClipList().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().videoPath);
            }
        }
        return arrayList;
    }

    @Nullable
    public List<EditVideoClip> getEditVideoTracks() {
        return this.mEditVideoTracks;
    }

    @JSONField(serialize = false)
    public List<EditVideoClip> getEditVideoTracksClone() {
        ArrayList arrayList = new ArrayList();
        List<EditVideoClip> list = this.mEditVideoTracks;
        if (list != null) {
            Iterator<EditVideoClip> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m10449clone());
            }
        }
        return arrayList;
    }

    public EditVisualEffectsInfo getEditVisualEffectsInfo() {
        return this.mEditVisualEffectsInfo;
    }

    public EditorMusicInfo getEditorMusicInfo() {
        return this.mEditorMusicInfo;
    }

    @JSONField(serialize = false)
    public EditorMusicInfo getEditorMusicInfoClone() {
        EditorMusicInfo editorMusicInfo = new EditorMusicInfo();
        if (this.mEditorMusicInfo == null) {
            editorMusicInfo.bMusicList = new ArrayList<>();
            return editorMusicInfo;
        }
        ArrayList<BMusic> arrayList = new ArrayList<>();
        if (!V.e(this.mEditorMusicInfo.bMusicList)) {
            for (BMusic bMusic : this.mEditorMusicInfo.bMusicList) {
                BMusic bMusicMo9886clone = bMusic.mo9886clone();
                Bgm bgm = bMusic.bgm;
                if (bgm != null) {
                    bMusicMo9886clone.bgm = bgm.m10406clone();
                }
                arrayList.add(bMusicMo9886clone);
            }
        }
        editorMusicInfo.bMusicList = arrayList;
        BMusic bMusic2 = this.mEditorMusicInfo.themeMusic;
        if (bMusic2 != null) {
            editorMusicInfo.themeMusic = BMusic.duplicate(bMusic2);
        }
        return editorMusicInfo;
    }

    public FilterInfo getFilterInfo() {
        return this.mFilterInfo;
    }

    @Nullable
    @JSONField(serialize = false)
    public EditVideoClip getMainVideoTrack() {
        List<EditVideoClip> list = this.mEditVideoTracks;
        if (list == null || list.size() == 0) {
            return null;
        }
        return this.mEditVideoTracks.get(0);
    }

    public float getNativeVolume() {
        return this.mNativeVolume;
    }

    public Size getOriginSize() {
        PictureRatioInfo pictureRatioInfo;
        return (this.mOriginSize != null || (pictureRatioInfo = getPictureRatioInfo()) == null) ? this.mOriginSize : new Size(pictureRatioInfo.widthStand, pictureRatioInfo.heightStand);
    }

    public PictureRatioInfo getPictureRatioInfo() {
        return this.mPictureRatioInfo;
    }

    public PictureRatioInfo getPictureRatioInfoClone() {
        PictureRatioInfo pictureRatioInfo = this.mPictureRatioInfo;
        if (pictureRatioInfo == null) {
            return null;
        }
        return pictureRatioInfo.m10479clone();
    }

    @Nullable
    public EditVideoClip getPipVideoTrack(int i7) {
        if (i7 > 0 && i7 < this.mEditVideoTracks.size()) {
            return this.mEditVideoTracks.get(i7);
        }
        return null;
    }

    public long getProjectVersion() {
        return this.projectVersion;
    }

    public List<RecordInfo> getRecordInfoList() {
        return this.mRecordInfoList;
    }

    @JSONField(serialize = false)
    public List<RecordInfo> getRecordInfoListClone() {
        ArrayList arrayList = new ArrayList();
        if (!V.e(this.mRecordInfoList)) {
            for (RecordInfo recordInfo : this.mRecordInfoList) {
                if (recordInfo != null) {
                    arrayList.add(recordInfo.mo9886clone());
                }
            }
        }
        return arrayList;
    }

    public List<SceneFxInfo> getSceneFxInfoList() {
        return this.mSceneFxInfoList;
    }

    @JSONField(serialize = false)
    public List<SceneFxInfo> getSceneInfoListClone() {
        ArrayList arrayList = new ArrayList();
        if (!V.e(this.mSceneFxInfoList)) {
            Iterator<SceneFxInfo> it = this.mSceneFxInfoList.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m10480clone());
            }
        }
        return arrayList;
    }

    public List<SelectVideo> getSelectVideoList() {
        return this.mSelectVideoList;
    }

    @JSONField(serialize = false)
    public List<SelectVideo> getSelectVideoListClone() {
        ArrayList arrayList = new ArrayList();
        if (!V.e(this.mSelectVideoList)) {
            Iterator<SelectVideo> it = this.mSelectVideoList.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m10404clone());
            }
        }
        return arrayList;
    }

    @JSONField(serialize = false)
    public List<SelectVideo> getSingleSelectVideoList() {
        ArrayList arrayList = new ArrayList();
        for (SelectVideo selectVideo : this.mSelectVideoList) {
            if (!TextUtils.isEmpty(selectVideo.videoPath)) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        arrayList.add(selectVideo);
                        break;
                    }
                    if (selectVideo.videoPath.equals(((SelectVideo) it.next()).videoPath)) {
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    public int getTimeLineFillMode() {
        return this.mTimeLineFillMode;
    }

    @Deprecated
    public List<Transform2DFxInfo> getTransform2DFxInfoList() {
        return this.mTransform2DFxInfoList;
    }

    @JSONField(serialize = false)
    public List<Transform2DFxInfo> getTransform2DFxInfoListClone() {
        ArrayList arrayList = new ArrayList();
        if (!V.e(this.mTransform2DFxInfoList)) {
            Iterator<Transform2DFxInfo> it = this.mTransform2DFxInfoList.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m10481clone());
            }
        }
        return arrayList;
    }

    public List<TransitionInfo> getTransitionInfoList() {
        return this.mTransitionInfoList;
    }

    @NonNull
    public List<EditTtsInfo> getTtsInfoList() {
        if (this.mTtsInfoList == null) {
            this.mTtsInfoList = new ArrayList();
        }
        return this.mTtsInfoList;
    }

    @JSONField(serialize = false)
    public List<EditTtsInfo> getTtsInfoListClone() {
        ArrayList arrayList = new ArrayList();
        if (!V.e(this.mTtsInfoList)) {
            Iterator<EditTtsInfo> it = this.mTtsInfoList.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(it.next().m10448clone());
                } catch (CloneNotSupportedException e7) {
                    e7.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    @Nullable
    @JSONField(serialize = false)
    public List<BClip> getUserTrackBClipList() {
        EditVideoClip userVideoTrack = getUserVideoTrack();
        if (userVideoTrack == null) {
            return null;
        }
        return userVideoTrack.getBClipList();
    }

    @JSONField(serialize = false)
    public float getUserTrackNativeVolume() {
        EditVideoClip userVideoTrack = getUserVideoTrack();
        if (userVideoTrack != null) {
            return userVideoTrack.getVideoTrackVolume();
        }
        EditVideoInfoUtils.throwDebugException("EditVideoInfoClone-getUserTrackNativeVolume userVideoTrack==null");
        return 1.0f;
    }

    @Nullable
    @JSONField(serialize = false)
    public EditVideoClip getUserVideoTrack() {
        List<EditVideoClip> list = this.mEditVideoTracks;
        if (list == null) {
            return null;
        }
        for (EditVideoClip editVideoClip : list) {
            if (editVideoClip.isUserRoleTrack()) {
                return editVideoClip;
            }
        }
        return null;
    }

    @Nullable
    @JSONField(serialize = false)
    public EditVideoClip getUserVideoTrackClone() {
        EditVideoClip userVideoTrack = getUserVideoTrack();
        if (userVideoTrack == null) {
            return null;
        }
        return userVideoTrack.m10449clone();
    }

    @JSONField(serialize = false)
    public long getVideoDuration() {
        EditVideoClip userVideoTrack = getUserVideoTrack();
        if (userVideoTrack != null) {
            return userVideoTrack.getVideoDuration();
        }
        return 0L;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.projectVersion), Long.valueOf(this.mDraftId), this.mEditNvsTimelineInfoBase, this.mCaptionInfoList, this.mDanmakuInfoList, this.mRecordInfoList, this.mEditorMusicInfo, this.mBiliEditorStickerInfoList, this.mPictureRatioInfo, this.mBiliEditorTimelineFxList, Integer.valueOf(this.mTimeLineFillMode), this.mBiliEditorMusicRhythmEntity, this.mSelectVideoList, this.mOriginSize, this.mEditVideoTracks, this.mTtsInfoList, Float.valueOf(this.mNativeVolume), this.mEditVideoClip, this.mTransitionInfoList, this.mTransform2DFxInfoList, this.mSceneFxInfoList, this.mEditFxFilterInfo, this.mEditVisualEffectsInfo, this.mFilterInfo, this.mBMusic, Boolean.valueOf(this.mEnableVolume), this.mEditFxStickerClipList, this.mBiliEditorMusicBeatEntity);
    }

    public void init() {
        this.projectVersion = BiliConfig.getBiliVersionCode();
        this.mDraftId = System.currentTimeMillis();
        this.mEditNvsTimelineInfoBase = new EditNvsTimelineInfoBase();
        this.mEditVideoTracks = new ArrayList();
        addMainVideoTrack(EditVideoInfoUtils.createMainVideoTrack(10));
        this.mEditVideoClip = new EditVideoClip();
        this.mCaptionInfoList = new ArrayList();
        this.mDanmakuInfoList = new ArrayList();
        this.mRecordInfoList = new ArrayList();
        this.mTransitionInfoList = new ArrayList();
        this.mSelectVideoList = new ArrayList();
        this.mEditorMusicInfo = new EditorMusicInfo();
        this.mEditFxStickerClipList = new ArrayList();
        this.mBiliEditorStickerInfoList = new ArrayList<>();
        this.mNativeVolume = 1.0f;
        this.mEditFxFilterInfo = new EditFxFilterInfo();
        this.mEditVisualEffectsInfo = new EditVisualEffectsInfo();
        this.mBiliEditorTimelineFxList = new ArrayList();
        this.mTtsInfoList = new ArrayList();
    }

    public void setBMusic(@Nullable BMusic bMusic) {
        this.mBMusic = bMusic;
    }

    public void setBiliEditorMusicBeatEntity(BiliEditorMusicBeatEntity biliEditorMusicBeatEntity) {
        this.mBiliEditorMusicBeatEntity = biliEditorMusicBeatEntity;
    }

    public void setBiliEditorMusicRhythmEntity(BiliEditorMusicRhythmEntity biliEditorMusicRhythmEntity) {
        this.mBiliEditorMusicRhythmEntity = biliEditorMusicRhythmEntity;
    }

    public void setBiliEditorStickerInfoList(ArrayList<BiliEditorStickerInfo> arrayList) {
        this.mBiliEditorStickerInfoList = arrayList;
    }

    public void setBiliEditorTimelineFxList(List<BiliEditorTimelineVideoFx> list) {
        this.mBiliEditorTimelineFxList = list;
    }

    public void setCaptionInfoList(List<CaptionInfo> list) {
        this.mCaptionInfoList = list;
    }

    public void setDanmakuInfoList(List<EditorDanmakuInfo> list) {
        this.mDanmakuInfoList = list;
    }

    public void setDraftId(long j7) {
        this.mDraftId = j7;
    }

    public void setEditFxFilterInfo(EditFxFilterInfo editFxFilterInfo) {
        this.mEditFxFilterInfo = editFxFilterInfo;
    }

    public void setEditFxStickerClipList(List<EditFxStickerClip> list) {
        this.mEditFxStickerClipList = list;
    }

    public void setEditNvsTimelineInfoBase(EditNvsTimelineInfoBase editNvsTimelineInfoBase) {
        this.mEditNvsTimelineInfoBase = editNvsTimelineInfoBase;
    }

    public void setEditVideoClip(EditVideoClip editVideoClip) {
        this.mEditVideoClip = editVideoClip;
    }

    public void setEditVideoTracks(List<EditVideoClip> list) {
        this.mEditVideoTracks = list;
    }

    public void setEditVisualEffectsInfo(EditVisualEffectsInfo editVisualEffectsInfo) {
        this.mEditVisualEffectsInfo = editVisualEffectsInfo;
    }

    public void setEditorMusicInfo(EditorMusicInfo editorMusicInfo) {
        this.mEditorMusicInfo = editorMusicInfo;
    }

    public void setFilterInfo(@Nullable FilterInfo filterInfo) {
        this.mFilterInfo = filterInfo;
    }

    public int setMainVideoTrack(EditVideoClip editVideoClip) {
        if (this.mEditVideoTracks == null) {
            EditVideoInfoUtils.throwDebugException("EditVideoInfoCore-setMainVideoTrack");
            return -1;
        }
        EditVideoClip mainVideoTrack = getMainVideoTrack();
        if (mainVideoTrack != null && mainVideoTrack.isMainTypeTrack()) {
            this.mEditVideoTracks.remove(0);
        }
        return addMainVideoTrack(editVideoClip);
    }

    public void setNativeVolume(float f7) {
        this.mNativeVolume = f7;
    }

    public void setOriginSize(Size size) {
        this.mOriginSize = size;
    }

    public void setPictureRatioInfo(PictureRatioInfo pictureRatioInfo) {
        this.mPictureRatioInfo = pictureRatioInfo;
    }

    public void setProjectVersion(long j7) {
        this.projectVersion = j7;
    }

    public void setRecordInfoList(List<RecordInfo> list) {
        this.mRecordInfoList = list;
    }

    public void setSceneFxInfoList(List<SceneFxInfo> list) {
        this.mSceneFxInfoList = list;
    }

    public void setSelectVideoList(List<SelectVideo> list) {
        this.mSelectVideoList = list;
    }

    public void setTimeLineFillMode(int i7) {
        this.mTimeLineFillMode = i7;
    }

    @Deprecated
    public void setTransform2DFxInfoList(List<Transform2DFxInfo> list) {
        this.mTransform2DFxInfoList = list;
    }

    public void setTransitionInfoList(List<TransitionInfo> list) {
        this.mTransitionInfoList = list;
    }

    public void setTtsInfoList(List<EditTtsInfo> list) {
        this.mTtsInfoList = list;
    }

    @JSONField(serialize = false)
    public void setUserTrackBClipList(List<BClip> list) {
        EditVideoClip userVideoTrack = getUserVideoTrack();
        if (userVideoTrack != null) {
            userVideoTrack.setBClipListAndUpdate(list);
            return;
        }
        EditVideoClip editVideoClipCreateMainVideoTrack = EditVideoInfoUtils.createMainVideoTrack(10);
        if (editVideoClipCreateMainVideoTrack == null) {
            return;
        }
        addMainVideoTrack(editVideoClipCreateMainVideoTrack);
        editVideoClipCreateMainVideoTrack.setBClipListAndUpdate(list);
    }

    @JSONField(serialize = false)
    public void setUserTrackNativeVolume(float f7) {
        EditVideoClip userVideoTrack = getUserVideoTrack();
        if (userVideoTrack == null) {
            EditVideoInfoUtils.throwDebugException("EditVideoInfoClone-setUserTrackNativeVolume userVideoTrack==null");
        } else {
            userVideoTrack.setVideoTrackVolume(f7);
        }
    }

    @JSONField(serialize = false)
    public boolean setUserVideoTrack(EditVideoClip editVideoClip) {
        int i7 = 0;
        while (true) {
            if (i7 >= this.mEditVideoTracks.size()) {
                i7 = -1;
                break;
            }
            if (this.mEditVideoTracks.get(i7).isUserRoleTrack()) {
                break;
            }
            i7++;
        }
        if (i7 != -1) {
            this.mEditVideoTracks.remove(i7);
            this.mEditVideoTracks.add(i7, editVideoClip);
            return true;
        }
        this.mEditVideoTracks.add(editVideoClip);
        EditVideoInfoUtils.throwDebugException("EditVideoInfoCore-setUserVideoTrack index=" + i7);
        return true;
    }
}
