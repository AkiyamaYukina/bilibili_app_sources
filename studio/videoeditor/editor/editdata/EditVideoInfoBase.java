package com.bilibili.studio.videoeditor.editor.editdata;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/editdata/EditVideoInfoBase.class */
@Keep
public class EditVideoInfoBase {
    private String mCaller;
    protected EditVideoGrayControl mEditVideoGrayControl;
    protected EditVideoTimeControl mEditVideoTimeControl;
    protected List<FileInfo> mVideoList;

    public EditVideoInfoBase() {
        this.mCaller = "undefined";
        this.mVideoList = new ArrayList();
        this.mEditVideoTimeControl = new EditVideoTimeControl();
        this.mEditVideoGrayControl = new EditVideoGrayControl();
    }

    public EditVideoInfoBase(String str, List<FileInfo> list, EditVideoTimeControl editVideoTimeControl) {
        this.mCaller = str;
        this.mVideoList = list;
        this.mEditVideoTimeControl = editVideoTimeControl;
    }

    public String getCaller() {
        return this.mCaller;
    }

    public EditVideoGrayControl getEditVideoGrayControl() {
        return this.mEditVideoGrayControl;
    }

    public EditVideoTimeControl getEditVideoTimeControl() {
        return this.mEditVideoTimeControl;
    }

    public List<FileInfo> getVideoList() {
        return this.mVideoList;
    }

    public void setCaller(String str) {
        this.mCaller = str;
    }

    public void setEditVideoGrayControl(EditVideoGrayControl editVideoGrayControl) {
        this.mEditVideoGrayControl = editVideoGrayControl;
    }

    public void setEditVideoTimeControl(EditVideoTimeControl editVideoTimeControl) {
        this.mEditVideoTimeControl = editVideoTimeControl;
    }

    public void setVideoList(List<FileInfo> list) {
        this.mVideoList = list;
    }
}
