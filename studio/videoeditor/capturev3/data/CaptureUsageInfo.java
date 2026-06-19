package com.bilibili.studio.videoeditor.capturev3.data;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/CaptureUsageInfo.class */
@Keep
public class CaptureUsageInfo implements Serializable {
    public String beautifyData;
    public String beautifyTemplateData;
    public boolean countdown;
    public int filterId;
    public boolean flash;
    public int mCameraFacing;
    public boolean mSpeed;
    public long mVideoCooperateId;
    public int makeupId;
    public long musicId;
    public int stickerId;
    private boolean recordByUser = false;
    public List<Integer> mStickerIds = new ArrayList();
    public List<String> stickerTags = new ArrayList();
    public List<Integer> mCameraFacings = new ArrayList();
    public List<Integer> mFilterIds = new ArrayList();
    public List<Long> mMusicIds = new ArrayList();
    public List<Boolean> mSpeeds = new ArrayList();
    public List<Integer> mMakeupIds = new ArrayList();
    public List<Long> videoCooperateIds = new ArrayList();
    public List<CaptureCrossYearInfo> crossYearInfos = new ArrayList();
    public CaptureCrossYearInfo crossYearInfo = new CaptureCrossYearInfo();

    public boolean isRecordByUser() {
        return this.recordByUser;
    }

    public void setRecordByUser(boolean z6) {
        this.recordByUser = z6;
    }
}
