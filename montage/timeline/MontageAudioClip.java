package com.bilibili.montage.timeline;

import com.bilibili.montage.FX.MontageAudioFx;
import com.bilibili.montage.FX.MontageCustomAudioFx;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/timeline/MontageAudioClip.class */
public class MontageAudioClip extends MontageClip {
    private native MontageAudioFx nativeAppendFx(long j7, String str);

    private native long nativeGetBaseClip(long j7);

    private native long nativeGetFadeInDuration(long j7);

    private native long nativeGetFadeOutDuration(long j7);

    private native MontageAudioFx nativeGetFxByIndex(long j7, int i7);

    private native boolean nativeRemoveAllFx(long j7);

    private native boolean nativeRemoveFx(long j7, int i7);

    private native void nativeSetFadeInDuration(long j7, long j8);

    private native void nativeSetFadeOutDuration(long j7, long j8);

    public MontageAudioFx appendCustomFx(MontageCustomAudioFx.Renderer renderer) {
        return null;
    }

    public MontageAudioFx appendFx(String str) {
        return nativeAppendFx(this.mInternalObject, str);
    }

    @Override // com.bilibili.montage.timeline.MontageObject
    public long getBaseObject() {
        return nativeGetBaseClip(this.mInternalObject);
    }

    public long getFadeInDuration() {
        return nativeGetFadeInDuration(this.mInternalObject);
    }

    public long getFadeOutDuration() {
        return nativeGetFadeOutDuration(this.mInternalObject);
    }

    public MontageAudioFx getFxByIndex(int i7) {
        return nativeGetFxByIndex(this.mInternalObject, i7);
    }

    public boolean removeAllFx() {
        return nativeRemoveAllFx(this.mInternalObject);
    }

    public boolean removeFx(int i7) {
        return nativeRemoveFx(this.mInternalObject, i7);
    }

    public void setFadeInDuration(long j7) {
        nativeSetFadeInDuration(this.mInternalObject, j7);
    }

    public void setFadeOutDuration(long j7) {
        nativeSetFadeOutDuration(this.mInternalObject, j7);
    }
}
