package com.bilibili.studio.videoeditor.capturev3.filter;

import androidx.annotation.Keep;
import com.bilibili.studio.videoeditor.editor.common.PreviewItem;
import com.bilibili.studio.videoeditor.ms.filter.FilterInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/filter/FilterListItemV3.class */
@Keep
public class FilterListItemV3 implements Serializable {
    private int mDownLoadStatus;
    private int mFilterFileStatus;
    private FilterInfo mFilterInfo;
    private String mFilterUrl;
    private boolean mIsCollected;
    private PreviewItem mPreviewItem;
    private int mPriority;

    public FilterListItemV3() {
        this.mFilterUrl = "";
        this.mIsCollected = false;
        this.mDownLoadStatus = 1;
        this.mFilterFileStatus = -1;
        this.mFilterInfo = new FilterInfo();
        this.mPreviewItem = new PreviewItem();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x010f, code lost:
    
        r7 = r0.getAbsolutePath();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FilterListItemV3(com.bilibili.studio.videoeditor.capturev3.data.CaptureFilterBean r7, java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.capturev3.filter.FilterListItemV3.<init>(com.bilibili.studio.videoeditor.capturev3.data.CaptureFilterBean, java.lang.String):void");
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

    public boolean isCollected() {
        return this.mIsCollected;
    }

    public void resetStatisticData() {
        setCollected(false);
    }

    public void setCollected(boolean z6) {
        this.mIsCollected = z6;
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
