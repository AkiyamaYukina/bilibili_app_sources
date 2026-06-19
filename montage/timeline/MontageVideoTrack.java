package com.bilibili.montage.timeline;

import com.bilibili.biligame.ui.feed.preload.b;
import com.bilibili.montage.FX.MontageVideoTransition;
import com.bilibili.montage.avinfo.MontageRational;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/timeline/MontageVideoTrack.class */
public class MontageVideoTrack extends MontageTrack {
    private static final String TAG = "MontageVideoTrack";

    private native MontageVideoClip nativeAddClip(long j7, String str, long j8);

    private native MontageVideoClip nativeAddClip(long j7, String str, long j8, long j9, long j10);

    private native MontageVideoClip nativeAppendClip(long j7, String str);

    private native MontageVideoClip nativeAppendClip(long j7, String str, long j8, long j9);

    private native MontageVideoClip nativeGetClipAtIndex(long j7, int i7);

    private native MontageVideoClip nativeGetClipAtTimelinePosition(long j7, long j8);

    private native MontageVideoTransition nativeGetTransitionBySourceClipIndex(long j7, int i7);

    private native MontageVideoClip nativeInsertClip(long j7, String str, int i7);

    private native MontageVideoClip nativeInsertClip(long j7, String str, int i7, long j8, long j9);

    private native MontageVideoTransition nativeSetBuiltinTransition(long j7, int i7, String str, boolean z6);

    private native MontageVideoTransition nativeSetPackagedTransition(long j7, int i7, String str, boolean z6);

    private native void nativeSetProxyScale(long j7, MontageRational montageRational);

    public MontageVideoClip addClip(String str, long j7) {
        return nativeAddClip(this.mInternalObject, str, j7);
    }

    public MontageVideoClip addClip(String str, long j7, long j8, long j9) {
        return nativeAddClip(this.mInternalObject, str, j7, j8, j9);
    }

    public MontageVideoClip appendClip(String str) {
        b.a("appendClip: filePath = ", str, TAG);
        return nativeAppendClip(this.mInternalObject, str);
    }

    public MontageVideoClip appendClip(String str, long j7, long j8) {
        return nativeAppendClip(this.mInternalObject, str, j7, j8);
    }

    public MontageVideoClip getClipByIndex(int i7) {
        return nativeGetClipAtIndex(this.mInternalObject, i7);
    }

    public MontageVideoClip getClipByTimelinePosition(long j7) {
        return nativeGetClipAtTimelinePosition(this.mInternalObject, j7);
    }

    public MontageVideoTransition getTransitionBySourceClipIndex(int i7) {
        return nativeGetTransitionBySourceClipIndex(this.mInternalObject, i7);
    }

    public MontageVideoClip insertClip(String str, int i7) {
        return nativeInsertClip(this.mInternalObject, str, i7);
    }

    public MontageVideoClip insertClip(String str, long j7, long j8, int i7) {
        return nativeInsertClip(this.mInternalObject, str, i7, j7, j8);
    }

    public MontageVideoTransition setBuiltinTransition(int i7, String str, boolean z6) {
        return nativeSetBuiltinTransition(this.mInternalObject, i7, str, z6);
    }

    public MontageVideoTransition setPackagedTransition(int i7, String str, boolean z6) {
        return nativeSetPackagedTransition(this.mInternalObject, i7, str, z6);
    }

    public void setProxyScale(MontageRational montageRational) {
        nativeSetProxyScale(this.mInternalObject, montageRational);
    }
}
