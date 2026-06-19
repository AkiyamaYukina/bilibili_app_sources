package com.bilibili.studio.videoeditor.editbase.filter.model;

import S9.b;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSON;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.ms.filter.FilterInfo;
import com.bilibili.studio.videoeditor.util.V;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editbase/filter/model/EditFxFilterInfo.class */
@Keep
public class EditFxFilterInfo implements Serializable {
    private static final String CREATE_VERSION = "1.0.0";
    private static final String CURRENT_VERSION = "1.0.0";
    private static final String ORIGIN_VERSION = "0.0.0";
    private static final String TAG = "EditFxFilterInfo";

    @Nullable
    private FilterInfo mFilterInfo;
    private String mVersion = "1.0.0";
    private List<EditFxFilterClip> mFilterClips = new ArrayList();

    public boolean checkRefreshInfo() {
        b.a(new StringBuilder("checkRefreshInfo: "), this.mVersion, TAG);
        return TextUtils.equals(this.mVersion, ORIGIN_VERSION);
    }

    public void checkUpgrade(FilterInfo filterInfo) {
        BLog.e(TAG, "checkUpgrade: " + filterInfo);
        if (filterInfo != null) {
            this.mFilterInfo = filterInfo;
            this.mVersion = ORIGIN_VERSION;
        }
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public EditFxFilterInfo m10437clone() {
        return (EditFxFilterInfo) JSON.parseObject(JSON.toJSONString(this), EditFxFilterInfo.class);
    }

    public List<EditFxFilterClip> getFilterClips() {
        return this.mFilterClips;
    }

    @Nullable
    public FilterInfo getFilterInfo() {
        return this.mFilterInfo;
    }

    public String getVersion() {
        return this.mVersion;
    }

    public boolean isFilterValid() {
        return (this.mFilterInfo == null && V.e(this.mFilterClips)) ? false : true;
    }

    public void refresh(List<EditFxFilterClip> list) {
        BLog.e(TAG, "checkRefreshInfo: " + list);
        this.mVersion = "1.0.0";
        this.mFilterClips = list;
        this.mFilterInfo = null;
    }

    public void setFilterClips(List<EditFxFilterClip> list) {
        this.mFilterClips = list;
    }

    public void setFilterInfo(FilterInfo filterInfo) {
        this.mFilterInfo = filterInfo;
    }

    public void setVersion(String str) {
        this.mVersion = str;
    }

    public void split(BClip bClip, long j7) {
        if (V.e(this.mFilterClips)) {
            return;
        }
        for (EditFxFilterClip editFxFilterClip : this.mFilterClips) {
            if (editFxFilterClip.getInPoint() <= j7 && j7 <= editFxFilterClip.getOutPoint()) {
                EditFxFilterClip editFxFilterClipM10436clone = editFxFilterClip.m10436clone();
                editFxFilterClip.setOutPoint(j7);
                editFxFilterClipM10436clone.setInPoint(j7);
                editFxFilterClipM10436clone.setAppendClipId(bClip.id);
                this.mFilterClips.add(editFxFilterClipM10436clone);
                Collections.sort(this.mFilterClips);
                return;
            }
        }
    }
}
