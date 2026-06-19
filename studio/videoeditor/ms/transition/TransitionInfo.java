package com.bilibili.studio.videoeditor.ms.transition;

import androidx.annotation.Keep;
import androidx.collection.C3269h;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/ms/transition/TransitionInfo.class */
@Keep
public class TransitionInfo implements Serializable, Cloneable {
    public static final long DEFAULT_DURATION = 1000000;
    public String imgUrl;
    public String nextBClipId;
    public int overlap;
    public String preBClipId;
    public int selectId;
    public String transitionFile;
    public String transitionFileLic;
    public String transitionUUID;
    private int mRoleInTheme = 0;
    public long duration = DEFAULT_DURATION;

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public TransitionInfo m10485clone() {
        TransitionInfo transitionInfo = new TransitionInfo();
        transitionInfo.preBClipId = this.preBClipId;
        transitionInfo.nextBClipId = this.nextBClipId;
        transitionInfo.transitionUUID = this.transitionUUID;
        transitionInfo.imgUrl = this.imgUrl;
        transitionInfo.selectId = this.selectId;
        transitionInfo.mRoleInTheme = this.mRoleInTheme;
        transitionInfo.transitionFile = this.transitionFile;
        transitionInfo.transitionFileLic = this.transitionFileLic;
        transitionInfo.overlap = this.overlap;
        transitionInfo.duration = this.duration;
        return transitionInfo;
    }

    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransitionInfo)) {
            return false;
        }
        TransitionInfo transitionInfo = (TransitionInfo) obj;
        if (this.selectId != transitionInfo.selectId || this.mRoleInTheme != transitionInfo.mRoleInTheme || !Objects.equals(this.preBClipId, transitionInfo.preBClipId) || !Objects.equals(this.nextBClipId, transitionInfo.nextBClipId) || !Objects.equals(this.transitionUUID, transitionInfo.transitionUUID) || !Objects.equals(this.imgUrl, transitionInfo.imgUrl) || !Objects.equals(this.transitionFile, transitionInfo.transitionFile) || !Objects.equals(this.transitionFileLic, transitionInfo.transitionFileLic) || !Integer.valueOf(this.overlap).equals(Integer.valueOf(transitionInfo.overlap)) || !Long.valueOf(this.duration).equals(Long.valueOf(transitionInfo.duration))) {
            z6 = false;
        }
        return z6;
    }

    public int getRoleInTheme() {
        return this.mRoleInTheme;
    }

    public void setRoleInTheme(int i7) {
        this.mRoleInTheme = i7;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TransitionInfo{preBClipId='");
        sb.append(this.preBClipId);
        sb.append("', nextBClipId='");
        sb.append(this.nextBClipId);
        sb.append("', transitionUUID='");
        sb.append(this.transitionUUID);
        sb.append("', imgUrl='");
        sb.append(this.imgUrl);
        sb.append("', selectId=");
        sb.append(this.selectId);
        sb.append(", mRoleInTheme=");
        sb.append(this.mRoleInTheme);
        sb.append(", transitionFile='");
        sb.append(this.transitionFile);
        sb.append("', transitionFileLic='");
        sb.append(this.transitionFileLic);
        sb.append("', overlapped=");
        return C3269h.a(sb, this.overlap, '}');
    }
}
