package com.bilibili.studio.videoeditor.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.snapshots.z;
import com.bilibili.studio.videoeditor.nvsstreaming.AudioClipInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bean/BClipNativeAudio.class */
@Keep
public final class BClipNativeAudio extends AudioClipInfo {
    private long fadeInTime;
    private long fadeOutTime;

    @NotNull
    public final BClipNativeAudio copy() {
        BClipNativeAudio bClipNativeAudio = new BClipNativeAudio();
        bClipNativeAudio.fadeInTime = this.fadeInTime;
        bClipNativeAudio.fadeOutTime = this.fadeOutTime;
        bClipNativeAudio.setLeftVolume(getLeftVolume());
        bClipNativeAudio.setRightVolume(getRightVolume());
        return bClipNativeAudio;
    }

    public final long getFadeInTime() {
        return this.fadeInTime;
    }

    public final long getFadeOutTime() {
        return this.fadeOutTime;
    }

    public final void setFadeInTime(long j7) {
        this.fadeInTime = j7;
    }

    public final void setFadeOutTime(long j7) {
        this.fadeOutTime = j7;
    }

    @Override // com.bilibili.studio.videoeditor.editor.editdata.EditFxClip
    @NotNull
    public String toString() {
        long j7 = this.fadeInTime;
        long j8 = this.fadeOutTime;
        float leftVolume = getLeftVolume();
        float rightVolume = getRightVolume();
        StringBuilder sbA = z.a(j7, "BClipNativeAudio(fadeIn=", ", fadeOut=");
        sbA.append(j8);
        sbA.append(", leftVolume=");
        sbA.append(leftVolume);
        sbA.append(", rightVolume=");
        sbA.append(rightVolume);
        sbA.append(")");
        return sbA.toString();
    }
}
