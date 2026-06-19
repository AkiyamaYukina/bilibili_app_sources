package com.bilibili.studio.kaleidoscope.sdk.montage;

import J1.z;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.c;
import com.bilibili.biligame.utils.B;
import com.bilibili.montage.timeline.MontageAudioClip;
import com.bilibili.montage.timeline.MontageAudioTrack;
import com.bilibili.studio.kaleidoscope.sdk.AudioClip;
import com.bilibili.studio.kaleidoscope.sdk.AudioTrack;
import q4.r;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonAudioTrackImpl.class */
public final class MonAudioTrackImpl extends MonTrackImpl implements AudioTrack {
    private static final String TAG = "Mon.AT.Impl";
    private MontageAudioTrack mMonAudioTrack;

    private MonAudioTrackImpl(@NonNull MontageAudioTrack montageAudioTrack) {
        super(montageAudioTrack);
        this.mMonAudioTrack = montageAudioTrack;
    }

    @NonNull
    public static AudioTrack box(@NonNull MontageAudioTrack montageAudioTrack) {
        return new MonAudioTrackImpl(montageAudioTrack);
    }

    @NonNull
    public static MontageAudioTrack unbox(@NonNull AudioTrack audioTrack) {
        return (MontageAudioTrack) audioTrack.getAudioTrack();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioTrack
    public AudioClip addClip(String str, long j7) {
        bilibili.live.app.service.resolver.b.a(com.bilibili.playerbizcommon.features.background.b.a(j7, "addClip:\targ0=", str, "\targ1="), "", TAG);
        MontageAudioClip montageAudioClipAddClip = this.mMonAudioTrack.addClip(str, j7);
        return montageAudioClipAddClip != null ? MonAudioClipImpl.box(montageAudioClipAddClip) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioTrack
    public AudioClip addClip(String str, long j7, long j8, long j9) {
        StringBuilder sbA = com.bilibili.playerbizcommon.features.background.b.a(j7, "addClip:\targ0=", str, "\targ1=");
        z.a(j8, "\targ2=", "\targ3=", sbA);
        sbA.append(j9);
        sbA.append("");
        BLog.i(TAG, sbA.toString());
        MontageAudioClip montageAudioClipAddClip = this.mMonAudioTrack.addClip(str, j7, j8, j9);
        return montageAudioClipAddClip != null ? MonAudioClipImpl.box(montageAudioClipAddClip) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioTrack
    public AudioClip appendClip(String str) {
        r.a("appendClip:\targ0=", str, "", TAG);
        MontageAudioClip montageAudioClipAppendClip = this.mMonAudioTrack.appendClip(str);
        return montageAudioClipAppendClip != null ? MonAudioClipImpl.box(montageAudioClipAppendClip) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioTrack
    public AudioClip appendClip(String str, long j7, long j8) {
        BLog.i(TAG, androidx.exifinterface.media.a.a(j8, "\targ2=", "", com.bilibili.playerbizcommon.features.background.b.a(j7, "appendClip:\targ0=", str, "\targ1=")));
        MontageAudioClip montageAudioClipAppendClip = this.mMonAudioTrack.appendClip(str, j7, j8);
        return montageAudioClipAppendClip != null ? MonAudioClipImpl.box(montageAudioClipAppendClip) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioTrack
    public Object getAudioTrack() {
        return this.mMonAudioTrack;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioTrack
    public AudioClip getClipByIndex(int i7) {
        MontageAudioClip clipByIndex = this.mMonAudioTrack.getClipByIndex(i7);
        return clipByIndex != null ? MonAudioClipImpl.box(clipByIndex) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioTrack
    public AudioClip getClipByTimelinePosition(long j7) {
        MontageAudioClip clipByTimelinePosition = this.mMonAudioTrack.getClipByTimelinePosition(j7);
        return clipByTimelinePosition != null ? MonAudioClipImpl.box(clipByTimelinePosition) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioTrack
    public int getClipCount() {
        return this.mMonAudioTrack.getClipCount();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioTrack
    public int getIndex() {
        return this.mMonAudioTrack.getIndex();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioTrack
    public AudioClip insertClip(String str, int i7) {
        BLog.i(TAG, c.a(i7, "insertClip:\targ0=", str, "\targ1=", ""));
        MontageAudioClip montageAudioClipInsertClip = this.mMonAudioTrack.insertClip(str, i7);
        return montageAudioClipInsertClip != null ? MonAudioClipImpl.box(montageAudioClipInsertClip) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioTrack
    public AudioClip insertClip(String str, long j7, long j8, int i7) {
        StringBuilder sbA = com.bilibili.playerbizcommon.features.background.b.a(j7, "insertClip:\targ0=", str, "\targ1=");
        z.a(j8, "\targ2=", "\targ3=", sbA);
        B.a(i7, "", TAG, sbA);
        MontageAudioClip montageAudioClipInsertClip = this.mMonAudioTrack.insertClip(str, j7, j8, i7);
        return montageAudioClipInsertClip != null ? MonAudioClipImpl.box(montageAudioClipInsertClip) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.montage.MonTrackImpl, com.bilibili.studio.kaleidoscope.sdk.Track
    public boolean removeClip(int i7, boolean z6) {
        BLog.i(TAG, "removeClip:\targ0=" + i7 + "\targ1=" + z6 + "");
        return this.mMonAudioTrack.removeClip(i7, z6);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioTrack
    public void setAudioTrack(Object obj) {
        ga.b.a(obj, "setAudioTrack: arg0=", TAG);
        this.mMonAudioTrack = (MontageAudioTrack) obj;
    }
}
