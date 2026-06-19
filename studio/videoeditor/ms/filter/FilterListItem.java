package com.bilibili.studio.videoeditor.ms.filter;

import OC0.h;
import androidx.annotation.Keep;
import androidx.collection.LruCache;
import com.bilibili.studio.videoeditor.capturev3.data.CaptureFilterBean;
import com.bilibili.studio.videoeditor.editor.common.PreviewItem;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Pair;
import mw0.C8045a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/ms/filter/FilterListItem.class */
@Keep
public class FilterListItem implements Serializable {
    private int mDownLoadStatus;
    private int mFilterFileStatus;
    private FilterInfo mFilterInfo;
    private String mFilterUrl;
    private PreviewItem mPreviewItem;
    private int mPriority;

    public FilterListItem() {
        this.mFilterUrl = "";
        this.mDownLoadStatus = 1;
        this.mFilterFileStatus = -1;
        this.mFilterInfo = new FilterInfo();
        this.mPreviewItem = new PreviewItem();
    }

    public FilterListItem(CaptureFilterBean captureFilterBean, String str) {
        this();
        this.mFilterFileStatus = 2;
        if (captureFilterBean != null) {
            this.mFilterUrl = captureFilterBean.mDownloadUrl;
            this.mPriority = captureFilterBean.mRank;
            this.mPreviewItem = new PreviewItem(1, captureFilterBean.mCover);
            FilterInfo filterInfo = this.mFilterInfo;
            filterInfo.filter_name = captureFilterBean.mName;
            filterInfo.filter_id = "Lut";
            filterInfo.setCategory(str);
            this.mFilterInfo.setId(captureFilterBean.mId);
            this.mFilterInfo.setFilterType(captureFilterBean.mFilterType);
            String str2 = h.f17810a;
            HashMap map = new HashMap();
            h.I(h.f17833y, map);
            h.I(h.f17834z, map);
            String strQ = h.q(h.o(this.mFilterUrl));
            if (map.containsKey(strQ)) {
                this.mFilterFileStatus = 1;
                FilterInfo filterInfo2 = ((FilterListItem) map.get(strQ)).getFilterInfo();
                FilterInfo filterInfo3 = this.mFilterInfo;
                filterInfo3.filter_path = filterInfo2.filter_path;
                filterInfo3.filter_lic = filterInfo2.filter_lic;
                if (filterInfo3.getFilterType() == 0) {
                    LruCache<String, Pair<String, String>> lruCache = C8045a.f123886a;
                    C8045a.d(r0.getId(), this.mFilterInfo.filter_path, this.mFilterInfo.filter_name);
                    FilterInfo filterInfo4 = this.mFilterInfo;
                    String str3 = filterInfo4.filter_path;
                    filterInfo4.filter_id = "";
                }
            }
        }
    }

    public String getDisplayNameText() {
        return this.mFilterInfo.filter_name;
    }

    public int getDownloadStatus() {
        return this.mDownLoadStatus;
    }

    public int getFilterFileStatus() {
        return this.mFilterFileStatus;
    }

    public FilterInfo getFilterInfo() {
        return this.mFilterInfo;
    }

    public String getFilterUrl() {
        return this.mFilterUrl;
    }

    public PreviewItem getPreviewItem() {
        return this.mPreviewItem;
    }

    public int getPriority() {
        return this.mPriority;
    }

    public void setDownloadStatus(int i7) {
        this.mDownLoadStatus = i7;
    }

    public void setFilterFileStatus(int i7) {
        this.mFilterFileStatus = i7;
    }

    public void setFilterInfo(FilterInfo filterInfo) {
        this.mFilterInfo = filterInfo;
    }

    public void setFilterUrl(String str) {
        this.mFilterUrl = str;
    }

    public void setPreviewItem(PreviewItem previewItem) {
        this.mPreviewItem = previewItem;
    }

    public void setPriority(int i7) {
        this.mPriority = i7;
    }
}
