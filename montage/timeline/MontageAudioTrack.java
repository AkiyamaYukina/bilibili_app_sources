package com.bilibili.montage.timeline;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/timeline/MontageAudioTrack.class */
public class MontageAudioTrack extends MontageTrack {
    private static final String TAG = "MontageAudioTrack";

    private native MontageAudioClip nativeAddClip(long j7, String str, long j8);

    private native MontageAudioClip nativeAddClip(long j7, String str, long j8, long j9, long j10);

    private native MontageAudioClip nativeAppendClip(long j7, String str);

    private native MontageAudioClip nativeAppendClip(long j7, String str, long j8, long j9);

    private native long nativeGetBaseTrack(long j7);

    private native MontageAudioClip nativeGetClipAtIndex(long j7, int i7);

    private native MontageAudioClip nativeGetClipAtTimelinePosition(long j7, long j8);

    private native MontageAudioClip[] nativeGetClipsAtTime(long j7, long j8);

    private native MontageAudioClip nativeInsertClip(long j7, String str, int i7);

    private native MontageAudioClip nativeInsertClip(long j7, String str, long j8, long j9, int i7);

    private native MontageAudioClip nativeInsertClipAtTime(long j7, String str, long j8);

    private native MontageAudioClip nativeInsertClipAtTime(long j7, String str, long j8, long j9, long j10);

    public MontageAudioClip addClip(String str, long j7) {
        return nativeAddClip(this.mInternalObject, str, j7);
    }

    public MontageAudioClip addClip(String str, long j7, long j8, long j9) {
        return nativeAddClip(this.mInternalObject, str, j7, j8, j9);
    }

    public MontageAudioClip appendClip(String str) {
        return nativeAppendClip(this.mInternalObject, str);
    }

    public MontageAudioClip appendClip(String str, long j7, long j8) {
        return nativeAppendClip(this.mInternalObject, str, j7, j8);
    }

    @Override // com.bilibili.montage.timeline.MontageObject
    public long getBaseObject() {
        return nativeGetBaseTrack(this.mInternalObject);
    }

    public MontageAudioClip getClipByIndex(int i7) {
        return nativeGetClipAtIndex(this.mInternalObject, i7);
    }

    public MontageAudioClip getClipByTimelinePosition(long j7) {
        return nativeGetClipAtTimelinePosition(this.mInternalObject, j7);
    }

    public MontageAudioClip[] getClipsAtTime(long j7) {
        return nativeGetClipsAtTime(this.mInternalObject, j7);
    }

    public MontageAudioClip insertClip(String str, int i7) {
        return nativeInsertClip(this.mInternalObject, str, i7);
    }

    public MontageAudioClip insertClip(String str, long j7, long j8, int i7) {
        return nativeInsertClip(this.mInternalObject, str, j7, j8, i7);
    }

    public MontageAudioClip insertClipAtTime(String str, long j7) {
        return nativeInsertClipAtTime(this.mInternalObject, str, j7);
    }

    public MontageAudioClip insertClipAtTime(String str, long j7, long j8, long j9) {
        return nativeInsertClipAtTime(this.mInternalObject, str, j7, j8, j9);
    }
}
