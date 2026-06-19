package com.bilibili.studio.videoeditor.ms.animation.bean;

import androidx.annotation.Keep;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/ms/animation/bean/VideoClipAnimation.class */
@Keep
public class VideoClipAnimation implements Serializable, Cloneable {
    public VideoClipAnimationInfo compoundAnim;
    public VideoClipAnimationInfo inAnim;
    public VideoClipAnimationInfo outAnim;

    public VideoClipAnimation() {
    }

    public VideoClipAnimation(VideoClipAnimation videoClipAnimation) {
        if (videoClipAnimation == null) {
            return;
        }
        VideoClipAnimationInfo videoClipAnimationInfo = videoClipAnimation.inAnim;
        if (videoClipAnimationInfo != null) {
            this.inAnim = videoClipAnimationInfo.m10476clone();
        } else {
            this.inAnim = null;
        }
        VideoClipAnimationInfo videoClipAnimationInfo2 = videoClipAnimation.outAnim;
        if (videoClipAnimationInfo2 != null) {
            this.outAnim = videoClipAnimationInfo2.m10476clone();
        } else {
            this.outAnim = null;
        }
        VideoClipAnimationInfo videoClipAnimationInfo3 = videoClipAnimation.compoundAnim;
        if (videoClipAnimationInfo3 != null) {
            this.compoundAnim = videoClipAnimationInfo3.m10476clone();
        } else {
            this.compoundAnim = null;
        }
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public VideoClipAnimation m10475clone() {
        return new VideoClipAnimation(this);
    }

    public boolean isAvailable() {
        return isInAnimAvailable() || isOutAnimAvailable() || isCompoundAnimAvailable();
    }

    public boolean isCompoundAnimAvailable() {
        VideoClipAnimationInfo videoClipAnimationInfo = this.compoundAnim;
        return videoClipAnimationInfo != null && videoClipAnimationInfo.isAvailable();
    }

    public boolean isInAnimAvailable() {
        VideoClipAnimationInfo videoClipAnimationInfo = this.inAnim;
        return videoClipAnimationInfo != null && videoClipAnimationInfo.isAvailable();
    }

    public boolean isOutAnimAvailable() {
        VideoClipAnimationInfo videoClipAnimationInfo = this.outAnim;
        return videoClipAnimationInfo != null && videoClipAnimationInfo.isAvailable();
    }

    public void reset() {
        this.inAnim = null;
        this.outAnim = null;
        this.compoundAnim = null;
    }

    public String toString() {
        return "VideoClipAnimation{inAnim=" + this.inAnim + ", outAnim=" + this.outAnim + ", compoundAnim=" + this.compoundAnim + '}';
    }
}
