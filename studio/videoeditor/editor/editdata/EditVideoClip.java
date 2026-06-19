package com.bilibili.studio.videoeditor.editor.editdata;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.material.j;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.bean.BClipDraft;
import com.bilibili.studio.videoeditor.editbase.filter.model.EditFxFilterInfo;
import com.bilibili.studio.videoeditor.editbase.visualeffects.model.EditVisualEffectsInfo;
import com.bilibili.studio.videoeditor.ms.picture.SceneFxInfo;
import com.bilibili.studio.videoeditor.ms.picture.Transform2DFxInfo;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import com.bilibili.studio.videoeditor.util.V;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/editdata/EditVideoClip.class */
@Keep
public class EditVideoClip {
    private static final long CALCULATION_ERROR = 500;
    public static final int INVALID_CLIP_INDEX = -1;
    public static final String KEY_BCLIP_ID = "bclip_id";
    public static final int TRACK_ROLE_OTHER = 11;
    public static final int TRACK_ROLE_USER = 10;
    public static final int TRACK_TYPE_MAIN = 0;
    public static final int TRACK_TYPE_PIP = 1;

    @Deprecated
    private List<BClipDraft> mBClipDraftList;
    private List<BClip> mBClipList;
    private int mCurrentBClipIndex;
    private EditFxFilterInfo mEditFxFilterInfo;
    private EditVisualEffectsInfo mEditVisualEffectsInfo;
    private List<SceneFxInfo> mSceneFxInfoList;
    private List<Transform2DFxInfo> mTransform2DFxInfoList;
    private List<TransitionInfo> mTransitionInfoList;
    private long mVideoDuration;
    private int trackRole;
    private int trackType;
    private float videoTrackVolume;

    public EditVideoClip() {
        this.trackType = 0;
        this.trackRole = 10;
        this.videoTrackVolume = 1.0f;
        this.mBClipList = new ArrayList();
        this.mBClipDraftList = new ArrayList();
        this.mTransitionInfoList = new ArrayList();
        this.mTransform2DFxInfoList = new ArrayList();
        this.mSceneFxInfoList = new ArrayList();
        this.mEditFxFilterInfo = new EditFxFilterInfo();
        this.mEditVisualEffectsInfo = new EditVisualEffectsInfo();
    }

    public EditVideoClip(int i7, int i8) {
        this();
        this.trackType = i7;
        this.trackRole = i8;
    }

    private boolean doSplit(int i7, long j7) {
        BClip bClipAtIndex = getBClipAtIndex(i7);
        if (bClipAtIndex == null) {
            return false;
        }
        boolean z6 = false;
        if (j7 < (bClipAtIndex.getTrimOut() - bClipAtIndex.getTrimIn()) - CALCULATION_ERROR) {
            if (j7 <= CALCULATION_ERROR) {
                z6 = false;
            } else {
                z6 = true;
                bClipAtIndex.setmIsCuted(true);
                long trimIn = bClipAtIndex.getTrimIn() + j7;
                BClip bClipCloneNewId = bClipAtIndex.cloneNewId();
                j jVar = (j) j.f107898a.getValue();
                long jCurrentTimeMillis = System.currentTimeMillis();
                String str = bClipCloneNewId.videoPath;
                jVar.getClass();
                bClipCloneNewId.materialId = j.a(jCurrentTimeMillis, str);
                bClipCloneNewId.setTrimIn(trimIn);
                bClipAtIndex.setTrimOut(trimIn);
                bClipAtIndex.resetOutAnimation();
                bClipAtIndex.setNeedUpdateAnimData(true);
                bClipCloneNewId.resetInAnimation();
                bClipCloneNewId.resetCompoundAnimation();
                bClipCloneNewId.setNeedUpdateAnimData(true);
                this.mBClipList.add(i7 + 1, bClipCloneNewId);
                onBClipUpdated();
            }
        }
        return z6;
    }

    @JSONField(serialize = false)
    private boolean isTrans2DValid(Transform2DFxInfo transform2DFxInfo) {
        return (((double) transform2DFxInfo.opacity) == 1.0d && transform2DFxInfo.rotateAngle == 0.0d && transform2DFxInfo.scaleValueX == 1.0d && transform2DFxInfo.scaleValueY == 1.0d && transform2DFxInfo.transX == 0.0d && transform2DFxInfo.transY == 0.0d) ? false : true;
    }

    private boolean validClipIndex(int i7) {
        return i7 >= 0 && i7 < this.mBClipList.size();
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public EditVideoClip m10449clone() {
        EditVideoClip editVideoClip = new EditVideoClip(this.trackType, this.trackRole);
        editVideoClip.setBClipList(getBClipListClone());
        editVideoClip.setCurrentBClipIndex(this.mCurrentBClipIndex);
        editVideoClip.setVideoDuration(getVideoDuration());
        editVideoClip.setTransitionInfoList(getTransitionInfoListClone());
        editVideoClip.setTransform2DFxInfoList(getTransform2DFxInfoListClone());
        editVideoClip.setSceneFxInfoList(getSceneInfoListClone());
        editVideoClip.setEditFxFilterInfo(getEditFxFilterInfoClone());
        editVideoClip.setVideoTrackVolume(this.videoTrackVolume);
        editVideoClip.setEditVisualEffectsInfo(getEditVisualEffectsInfoClone());
        return editVideoClip;
    }

    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditVideoClip)) {
            return false;
        }
        EditVideoClip editVideoClip = (EditVideoClip) obj;
        if (this.mCurrentBClipIndex != editVideoClip.mCurrentBClipIndex || this.mVideoDuration != editVideoClip.mVideoDuration || this.trackType != editVideoClip.trackType || this.trackRole != editVideoClip.trackRole || Float.compare(editVideoClip.videoTrackVolume, this.videoTrackVolume) != 0 || !Objects.equals(this.mBClipList, editVideoClip.mBClipList) || !Objects.equals(this.mTransitionInfoList, editVideoClip.mTransitionInfoList) || !Objects.equals(this.mTransform2DFxInfoList, editVideoClip.mTransform2DFxInfoList) || !Objects.equals(this.mSceneFxInfoList, editVideoClip.mSceneFxInfoList) || !Objects.equals(this.mEditFxFilterInfo, editVideoClip.mEditFxFilterInfo) || !Objects.equals(this.mEditVisualEffectsInfo, editVideoClip.mEditVisualEffectsInfo)) {
            z6 = false;
        }
        return z6;
    }

    @Nullable
    @JSONField(serialize = false)
    public BClip getBClipAtIndex(int i7) {
        if (validClipIndex(i7)) {
            return this.mBClipList.get(i7);
        }
        return null;
    }

    @Deprecated
    public List<BClipDraft> getBClipDraftList() {
        return this.mBClipDraftList;
    }

    @Nullable
    public List<BClip> getBClipList() {
        return this.mBClipList;
    }

    @JSONField(serialize = false)
    public List<BClip> getBClipListClone() {
        ArrayList arrayList = new ArrayList();
        if (!V.e(this.mBClipList)) {
            Iterator<BClip> it = this.mBClipList.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m10399clone());
            }
        }
        return arrayList;
    }

    @JSONField(serialize = false)
    public List<BClip> getBClipListExcludeRoleTheme() {
        ArrayList arrayList = new ArrayList();
        Iterator<BClip> it = this.mBClipList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @JSONField(serialize = false)
    public long getCurrVideoDuration() {
        int size = this.mBClipList.size();
        if (size > 0) {
            return this.mBClipList.get(size - 1).getOutPoint();
        }
        return 0L;
    }

    public int getCurrentBClipIndex() {
        return this.mCurrentBClipIndex;
    }

    @Nullable
    public EditFxFilterInfo getEditFxFilterInfo() {
        return this.mEditFxFilterInfo;
    }

    @JSONField(serialize = false)
    public EditFxFilterInfo getEditFxFilterInfoClone() {
        EditFxFilterInfo editFxFilterInfo = this.mEditFxFilterInfo;
        if (editFxFilterInfo != null) {
            return editFxFilterInfo.m10437clone();
        }
        return null;
    }

    @Nullable
    public EditVisualEffectsInfo getEditVisualEffectsInfo() {
        return this.mEditVisualEffectsInfo;
    }

    @JSONField(serialize = false)
    public EditVisualEffectsInfo getEditVisualEffectsInfoClone() {
        EditVisualEffectsInfo editVisualEffectsInfo = this.mEditVisualEffectsInfo;
        return editVisualEffectsInfo != null ? editVisualEffectsInfo.m10443clone() : new EditVisualEffectsInfo();
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

    public int getTrackRole() {
        return this.trackRole;
    }

    public int getTrackType() {
        return this.trackType;
    }

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

    @JSONField(serialize = false)
    public List<TransitionInfo> getTransitionInfoListClone() {
        ArrayList arrayList = new ArrayList();
        if (!V.e(this.mTransitionInfoList)) {
            Iterator<TransitionInfo> it = this.mTransitionInfoList.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m10485clone());
            }
        }
        return arrayList;
    }

    @JSONField(serialize = false)
    public List<Transform2DFxInfo> getValidTransform2DFxInfoListClone() {
        ArrayList arrayList = new ArrayList();
        if (!V.e(this.mTransform2DFxInfoList)) {
            for (Transform2DFxInfo transform2DFxInfo : this.mTransform2DFxInfoList) {
                if (isTrans2DValid(transform2DFxInfo)) {
                    arrayList.add(transform2DFxInfo.m10481clone());
                }
            }
        }
        return arrayList;
    }

    public long getVideoDuration() {
        if (this.mVideoDuration == 0) {
            onBClipUpdated();
        }
        return this.mVideoDuration;
    }

    public float getVideoTrackVolume() {
        return this.videoTrackVolume;
    }

    public int hashCode() {
        return Objects.hash(this.mBClipList, Integer.valueOf(this.mCurrentBClipIndex), Long.valueOf(this.mVideoDuration), Integer.valueOf(this.trackType), Integer.valueOf(this.trackRole), this.mTransitionInfoList, this.mTransform2DFxInfoList, this.mSceneFxInfoList, this.mEditFxFilterInfo, this.mEditVisualEffectsInfo, Float.valueOf(this.videoTrackVolume));
    }

    public int indexOfClip(String str) {
        for (int i7 = 0; i7 < this.mBClipList.size(); i7++) {
            if (TextUtils.equals(str, this.mBClipList.get(i7).id)) {
                return i7;
            }
        }
        return -1;
    }

    public void insertBClipAtIndex(int i7, BClip bClip) {
        if (i7 < 0 || i7 > this.mBClipList.size()) {
            return;
        }
        this.mBClipList.add(i7, bClip);
        onBClipUpdated();
    }

    @JSONField(serialize = false)
    public boolean isMainTypeTrack() {
        return this.trackType == 0;
    }

    @JSONField(serialize = false)
    public boolean isPipTypeTrack() {
        boolean z6 = true;
        if (this.trackType != 1) {
            z6 = false;
        }
        return z6;
    }

    @JSONField(serialize = false)
    public boolean isUserRoleTrack() {
        return this.trackRole == 10;
    }

    public void onBClipUpdated() {
        if (V.e(this.mBClipList)) {
            return;
        }
        long duration = 0;
        for (BClip bClip : this.mBClipList) {
            if (isUserRoleTrack() || isMainTypeTrack()) {
                bClip.setInPoint(duration);
                duration = bClip.getDuration(true) + duration;
                bClip.setOutPoint(duration);
            } else {
                bClip.setOutPoint(bClip.getDuration(true) + bClip.getInPoint());
                duration = bClip.getOutPoint();
            }
        }
        this.mVideoDuration = duration;
    }

    @Deprecated
    public void setBClipDraftList(List<BClipDraft> list) {
        this.mBClipDraftList = list;
    }

    public void setBClipList(List<BClip> list) {
        this.mBClipList = list;
    }

    @JSONField(serialize = false)
    public void setBClipListAndUpdate(List<BClip> list) {
        this.mBClipList = list;
        onBClipUpdated();
    }

    public void setClipBackgroundBlur(boolean z6) {
        if (V.e(this.mBClipList)) {
            EditVideoInfoUtils.throwDebugException("EditVideoClip.setClipBackgroundBlur bClipList.isEmpty");
            return;
        }
        for (BClip bClip : this.mBClipList) {
            if (bClip != null) {
                bClip.setBackgroundMode(z6);
            }
        }
    }

    public void setCurrentBClipIndex(int i7) {
        this.mCurrentBClipIndex = i7;
    }

    public void setEditFxFilterInfo(EditFxFilterInfo editFxFilterInfo) {
        this.mEditFxFilterInfo = editFxFilterInfo;
    }

    public void setEditVisualEffectsInfo(EditVisualEffectsInfo editVisualEffectsInfo) {
        this.mEditVisualEffectsInfo = editVisualEffectsInfo;
    }

    public void setSceneFxInfoList(List<SceneFxInfo> list) {
        this.mSceneFxInfoList = list;
    }

    public void setTrackRole(int i7) {
        this.trackRole = i7;
    }

    public void setTrackType(int i7) {
        this.trackType = i7;
    }

    public void setTransform2DFxInfoList(List<Transform2DFxInfo> list) {
        this.mTransform2DFxInfoList = list;
    }

    public void setTransitionInfoList(List<TransitionInfo> list) {
        this.mTransitionInfoList = list;
    }

    public void setVideoDuration(long j7) {
        this.mVideoDuration = j7;
    }

    public void setVideoTrackVolume(float f7) {
        this.videoTrackVolume = f7;
    }

    @JSONField(serialize = false)
    public boolean splitBClip(long j7) {
        boolean zDoSplit = doSplit(this.mCurrentBClipIndex, j7);
        if (zDoSplit) {
            setCurrentBClipIndex(this.mCurrentBClipIndex + 1);
        }
        return zDoSplit;
    }
}
