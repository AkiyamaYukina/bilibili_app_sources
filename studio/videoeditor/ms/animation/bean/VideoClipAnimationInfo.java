package com.bilibili.studio.videoeditor.ms.animation.bean;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.collection.C3269h;
import com.bilibili.studio.videoeditor.LocalPath;
import com.bilibili.studio.videoeditor.VideoClip;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/ms/animation/bean/VideoClipAnimationInfo.class */
@Keep
public class VideoClipAnimationInfo implements Serializable, Cloneable {
    public int animType;
    public long duration;
    public long id;
    public String packagePath;
    public String packageUrl;

    public VideoClipAnimationInfo() {
        this.duration = 3000000L;
        this.animType = 1;
    }

    public VideoClipAnimationInfo(VideoClip.Animation animation, int i7) {
        this.duration = 3000000L;
        this.animType = 1;
        if (animation == null) {
            return;
        }
        this.id = animation.getId();
        this.duration = animation.getDuration() * 1000;
        setPackageInfo(animation.getPackagePath());
        this.animType = i7;
    }

    public VideoClipAnimationInfo(VideoClipAnimationInfo videoClipAnimationInfo) {
        this.duration = 3000000L;
        this.animType = 1;
        if (videoClipAnimationInfo == null) {
            return;
        }
        this.id = videoClipAnimationInfo.id;
        this.duration = videoClipAnimationInfo.duration;
        this.packagePath = videoClipAnimationInfo.packagePath;
        this.packageUrl = videoClipAnimationInfo.packageUrl;
        this.animType = videoClipAnimationInfo.animType;
    }

    private void setPackageInfo(LocalPath localPath) {
        this.packagePath = "";
        this.packageUrl = "";
        if (localPath != null) {
            String fullPath = localPath.getFullPath();
            if (!TextUtils.isEmpty(fullPath)) {
                this.packagePath = fullPath;
            }
            String remotePath = localPath.getRemotePath();
            if (TextUtils.isEmpty(remotePath)) {
                return;
            }
            this.packageUrl = remotePath;
        }
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public VideoClipAnimationInfo m10476clone() {
        return new VideoClipAnimationInfo(this);
    }

    public boolean isAvailable() {
        return this.id > 0 && !TextUtils.isEmpty(this.packagePath);
    }

    public boolean isNoAnimation() {
        return this.id == -1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VideoClipAnimationInfo{id=");
        sb.append(this.id);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", packagePath='");
        sb.append(this.packagePath);
        sb.append("', packageUrl='");
        sb.append(this.packageUrl);
        sb.append("', animType=");
        return C3269h.a(sb, this.animType, '}');
    }
}
