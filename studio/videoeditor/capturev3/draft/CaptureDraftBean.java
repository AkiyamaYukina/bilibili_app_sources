package com.bilibili.studio.videoeditor.capturev3.draft;

import androidx.annotation.Keep;
import com.bilibili.studio.videoeditor.capturev3.data.BGMInfo;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/draft/CaptureDraftBean.class */
@Keep
public class CaptureDraftBean {
    private BGMInfo mBGMInfo;
    private CaptureActionBean mCaptureActionBean;
    private CaptureCooperateBean mCaptureCooperateBean;
    private int mFilterId;
    private int mMakeUpid;
    private BGMInfo mRecordBgmInfo;
    private CaptureSchema.SchemaInfo mSchemaInfo;
    private String mSchemeString;
    private String mSelectFaceSegmentPath;
    private String mSelectUploadPath;
    private int mStickerId;
    private int mCountDownState = 1;
    private float mCaptureSpeed = 1.0f;
    private List<ClipBean> mVideoClips = new ArrayList();

    public boolean draftBgmAvailable() {
        BGMInfo bGMInfo = this.mBGMInfo;
        if (bGMInfo == null || bGMInfo.getPath() == null) {
            return false;
        }
        return new File(this.mBGMInfo.getPath()).exists();
    }

    public BGMInfo getBGMInfo() {
        return this.mBGMInfo;
    }

    public CaptureActionBean getCaptureActionBean() {
        return this.mCaptureActionBean;
    }

    public CaptureCooperateBean getCaptureCooperateBean() {
        return this.mCaptureCooperateBean;
    }

    public float getCaptureSpeed() {
        return this.mCaptureSpeed;
    }

    public int getCountDownState() {
        return this.mCountDownState;
    }

    public int getFilterId() {
        return this.mFilterId;
    }

    public int getMakeUpid() {
        return this.mMakeUpid;
    }

    public BGMInfo getRecordBgmInfo() {
        return this.mRecordBgmInfo;
    }

    public CaptureSchema.SchemaInfo getSchemaInfo() {
        return this.mSchemaInfo;
    }

    public String getSchemeString() {
        return this.mSchemeString;
    }

    public String getSelectFaceSegmentPath() {
        return this.mSelectFaceSegmentPath;
    }

    public String getSelectUploadPath() {
        return this.mSelectUploadPath;
    }

    public int getStickerId() {
        return this.mStickerId;
    }

    public List<ClipBean> getVideoClips() {
        return this.mVideoClips;
    }

    public boolean isDraftAvailable(boolean z6) {
        if (this.mVideoClips == null) {
            return false;
        }
        CaptureCooperateBean captureCooperateBean = this.mCaptureCooperateBean;
        if (captureCooperateBean != null && captureCooperateBean.getCaptureMode() != 31) {
            if (!this.mCaptureCooperateBean.cooperateAvailable()) {
                return false;
            }
            if (this.mCaptureCooperateBean.getUseBmmSdk() && !z6) {
                return false;
            }
            if (!this.mCaptureCooperateBean.getUseBmmSdk() && z6) {
                return false;
            }
        }
        for (ClipBean clipBean : this.mVideoClips) {
            if (clipBean.filePath == null || !new File(clipBean.filePath).exists()) {
                return false;
            }
        }
        return true;
    }

    public void setBGMInfo(BGMInfo bGMInfo) {
        this.mBGMInfo = bGMInfo;
    }

    public void setCaptureActionBean(CaptureActionBean captureActionBean) {
        this.mCaptureActionBean = captureActionBean;
    }

    public void setCaptureCooperateBean(CaptureCooperateBean captureCooperateBean) {
        this.mCaptureCooperateBean = captureCooperateBean;
    }

    public void setCaptureSpeed(float f7) {
        this.mCaptureSpeed = f7;
    }

    public void setCountDownState(int i7) {
        this.mCountDownState = i7;
    }

    public void setFilterId(int i7) {
        this.mFilterId = i7;
    }

    public void setMakeUpid(int i7) {
        this.mMakeUpid = i7;
    }

    public void setRecordBgmInfo(BGMInfo bGMInfo) {
        this.mRecordBgmInfo = bGMInfo;
    }

    public void setSchemaInfo(CaptureSchema.SchemaInfo schemaInfo) {
        this.mSchemaInfo = schemaInfo;
    }

    public void setSchemeString(String str) {
        this.mSchemeString = str;
    }

    public void setSelectFaceSegmentPath(String str) {
        this.mSelectFaceSegmentPath = str;
    }

    public void setSelectUploadPath(String str) {
        this.mSelectUploadPath = str;
    }

    public void setStickerId(int i7) {
        this.mStickerId = i7;
    }

    public void setVideoClips(List<ClipBean> list) {
        this.mVideoClips = list;
    }
}
