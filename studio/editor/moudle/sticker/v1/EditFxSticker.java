package com.bilibili.studio.editor.moudle.sticker.v1;

import OC0.h;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.bilibili.studio.editor.moudle.sticker.v1.VideoFxStickerBean;
import java.io.Serializable;
import java.util.Objects;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/sticker/v1/EditFxSticker.class */
@Keep
public class EditFxSticker implements Serializable, Cloneable {
    private static final String INIT_VERSION = "1.0.0";
    private String mBgmDownloadUrl;
    private String mBgmFilePath;
    private String mDownloadUrl;
    private String mFileId;
    private String mFilePath;
    private String mFxId;
    private int mId;
    private String mLicenseFilePath;
    private String mName;
    private int mPriority;
    private String mVersion;

    public EditFxSticker() {
        this.mName = "";
        this.mDownloadUrl = "";
        this.mFxId = "";
        this.mFilePath = "";
        this.mLicenseFilePath = "";
        this.mVersion = INIT_VERSION;
        this.mFileId = "";
    }

    public EditFxSticker(VideoFxStickerBean.FxDataBean fxDataBean) {
        this();
        this.mId = fxDataBean.id;
        String str = fxDataBean.name;
        this.mName = str == null ? "" : str;
        String str2 = fxDataBean.downloadUrl;
        str2 = str2 == null ? "" : str2;
        this.mDownloadUrl = str2;
        this.mPriority = fxDataBean.rank;
        this.mFileId = h.q(h.p(str2));
        VideoFxStickerBean.SoundInfo soundInfo = fxDataBean.soundInfo;
        if (soundInfo == null || TextUtils.isEmpty(soundInfo.downloadUrl)) {
            return;
        }
        this.mBgmDownloadUrl = fxDataBean.soundInfo.downloadUrl;
    }

    @NonNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public EditFxSticker m10139clone() {
        EditFxSticker editFxSticker = new EditFxSticker();
        editFxSticker.mId = this.mId;
        editFxSticker.mName = this.mName;
        String str = this.mDownloadUrl;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        editFxSticker.mDownloadUrl = str2;
        editFxSticker.mPriority = this.mPriority;
        editFxSticker.mFilePath = this.mFilePath;
        editFxSticker.mLicenseFilePath = this.mLicenseFilePath;
        editFxSticker.mVersion = this.mVersion;
        editFxSticker.mFxId = this.mFxId;
        editFxSticker.mFileId = this.mFileId;
        editFxSticker.mBgmDownloadUrl = this.mBgmDownloadUrl;
        editFxSticker.mBgmFilePath = this.mBgmFilePath;
        return editFxSticker;
    }

    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditFxSticker)) {
            return false;
        }
        EditFxSticker editFxSticker = (EditFxSticker) obj;
        if (this.mId != editFxSticker.mId || this.mPriority != editFxSticker.mPriority || !Objects.equals(this.mName, editFxSticker.mName) || !Objects.equals(this.mDownloadUrl, editFxSticker.mDownloadUrl) || !Objects.equals(this.mFxId, editFxSticker.mFxId) || !Objects.equals(this.mFilePath, editFxSticker.mFilePath) || !Objects.equals(this.mLicenseFilePath, editFxSticker.mLicenseFilePath) || !Objects.equals(this.mVersion, editFxSticker.mVersion) || !Objects.equals(this.mFileId, editFxSticker.mFileId) || !Objects.equals(this.mBgmDownloadUrl, editFxSticker.mBgmDownloadUrl) || !Objects.equals(this.mBgmFilePath, editFxSticker.mBgmFilePath)) {
            z6 = false;
        }
        return z6;
    }

    public String getBgmDownloadUrl() {
        return this.mBgmDownloadUrl;
    }

    public String getBgmFilePath() {
        return this.mBgmFilePath;
    }

    public String getDownloadUrl() {
        return this.mDownloadUrl;
    }

    public String getFileId() {
        return this.mFileId;
    }

    public String getFilePath() {
        return this.mFilePath;
    }

    public String getFxId() {
        return this.mFxId;
    }

    public int getId() {
        return this.mId;
    }

    public String getLicenseFilePath() {
        return this.mLicenseFilePath;
    }

    public String getName() {
        return this.mName;
    }

    public int getPriority() {
        return this.mPriority;
    }

    public boolean hasVoice() {
        return !TextUtils.isEmpty(this.mBgmDownloadUrl);
    }

    public void setBgmDownloadUrl(String str) {
        this.mBgmDownloadUrl = str;
    }

    public void setBgmFilePath(String str) {
        this.mBgmFilePath = str;
    }

    public void setDownloadUrl(String str) {
        this.mDownloadUrl = str;
    }

    public void setFileId(String str) {
        this.mFileId = str;
    }

    public void setFilePath(String str) {
        this.mFilePath = str;
    }

    public void setFxId(String str) {
        this.mFxId = str;
    }

    public void setId(int i7) {
        this.mId = i7;
    }

    public void setLicenseFilePath(String str) {
        this.mLicenseFilePath = str;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setPriority(int i7) {
        this.mPriority = i7;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EditFxSticker{mId=");
        sb.append(this.mId);
        sb.append(", mName='");
        sb.append(this.mName);
        sb.append("', mDownloadUrl='");
        sb.append(this.mDownloadUrl);
        sb.append("', mPriority=");
        sb.append(this.mPriority);
        sb.append(", mFxId='");
        sb.append(this.mFxId);
        sb.append("', mFilePath='");
        sb.append(this.mFilePath);
        sb.append("', mLicenseFilePath='");
        sb.append(this.mLicenseFilePath);
        sb.append("', mVersion='");
        sb.append(this.mVersion);
        sb.append("', mFileId='");
        return C8770a.a(sb, this.mFileId, "'}");
    }

    public void updateDownload(EditFxSticker editFxSticker) {
        this.mFxId = editFxSticker.getFxId();
        this.mFilePath = editFxSticker.getFilePath();
        this.mLicenseFilePath = editFxSticker.getLicenseFilePath();
    }

    public boolean validate() {
        return !TextUtils.isEmpty(this.mFilePath);
    }
}
