package com.bilibili.studio.kaleidoscope.sdk.montage;

import androidx.annotation.NonNull;
import com.bilibili.montage.FX.MontageVideoTransition;
import com.bilibili.montage.timeline.MontageVideoClip;
import com.bilibili.montage.timeline.MontageVideoTrack;
import com.bilibili.studio.kaleidoscope.sdk.Rational;
import com.bilibili.studio.kaleidoscope.sdk.VideoClip;
import com.bilibili.studio.kaleidoscope.sdk.VideoTrack;
import com.bilibili.studio.kaleidoscope.sdk.VideoTransition;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonVideoTrackImpl.class */
public final class MonVideoTrackImpl extends MonTrackImpl implements VideoTrack {
    private static final String TAG = "Mon.VT.Impl";
    private MontageVideoTrack mMonVideoTrack;

    private MonVideoTrackImpl(@NonNull MontageVideoTrack montageVideoTrack) {
        super(montageVideoTrack);
        this.mMonVideoTrack = montageVideoTrack;
    }

    @NonNull
    public static VideoTrack box(@NonNull MontageVideoTrack montageVideoTrack) {
        return new MonVideoTrackImpl(montageVideoTrack);
    }

    @NonNull
    public static MontageVideoTrack unbox(@NonNull VideoTrack videoTrack) {
        return (MontageVideoTrack) videoTrack.getVideoTrack();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoTrack
    public VideoClip addClip(String str, long j7) {
        MontageVideoClip montageVideoClipAddClip = this.mMonVideoTrack.addClip(str, j7);
        return montageVideoClipAddClip != null ? MonVideoClipImpl.box(montageVideoClipAddClip) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoTrack
    public VideoClip addClip(String str, long j7, long j8, long j9) {
        MontageVideoClip montageVideoClipAddClip = this.mMonVideoTrack.addClip(str, j7, j8, j9);
        return montageVideoClipAddClip != null ? MonVideoClipImpl.box(montageVideoClipAddClip) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoTrack
    public VideoClip appendClip(String str) {
        MontageVideoClip montageVideoClipAppendClip = this.mMonVideoTrack.appendClip(str);
        return montageVideoClipAppendClip != null ? MonVideoClipImpl.box(montageVideoClipAppendClip) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoTrack
    public VideoClip appendClip(String str, long j7, long j8) {
        MontageVideoClip montageVideoClipAppendClip = this.mMonVideoTrack.appendClip(str, j7, j8);
        return montageVideoClipAppendClip != null ? MonVideoClipImpl.box(montageVideoClipAppendClip) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoTrack
    public VideoClip getClipByIndex(int i7) {
        MontageVideoClip clipByIndex = this.mMonVideoTrack.getClipByIndex(i7);
        return clipByIndex != null ? MonVideoClipImpl.box(clipByIndex) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoTrack
    public VideoClip getClipByTimelinePosition(long j7) {
        MontageVideoClip clipByTimelinePosition = this.mMonVideoTrack.getClipByTimelinePosition(j7);
        return clipByTimelinePosition != null ? MonVideoClipImpl.box(clipByTimelinePosition) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoTrack
    public int getClipCount() {
        return this.mMonVideoTrack.getClipCount();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoTrack
    public int getIndex() {
        return this.mMonVideoTrack.getIndex();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoTrack
    public VideoTransition getTransitionBySourceClipIndex(int i7) {
        MontageVideoTransition transitionBySourceClipIndex = this.mMonVideoTrack.getTransitionBySourceClipIndex(i7);
        return transitionBySourceClipIndex != null ? MonVideoTransitionImpl.box(transitionBySourceClipIndex) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoTrack
    public Object getVideoTrack() {
        return this.mMonVideoTrack;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoTrack
    public VideoClip insertClip(String str, int i7) {
        MontageVideoClip montageVideoClipInsertClip = this.mMonVideoTrack.insertClip(str, i7);
        return montageVideoClipInsertClip != null ? MonVideoClipImpl.box(montageVideoClipInsertClip) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoTrack
    public VideoClip insertClip(String str, long j7, long j8, int i7) {
        MontageVideoClip montageVideoClipInsertClip = this.mMonVideoTrack.insertClip(str, j7, j8, i7);
        return montageVideoClipInsertClip != null ? MonVideoClipImpl.box(montageVideoClipInsertClip) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoTrack
    public boolean isSupportOverlapped() {
        return true;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.montage.MonTrackImpl, com.bilibili.studio.kaleidoscope.sdk.Track
    public boolean removeAllClips() {
        return this.mMonVideoTrack.removeAllClips();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoTrack
    public VideoTransition setBuiltinTransition(int i7, String str, boolean z6) {
        MontageVideoTransition builtinTransition = this.mMonVideoTrack.setBuiltinTransition(i7, str, z6);
        return builtinTransition != null ? MonVideoTransitionImpl.box(builtinTransition) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoTrack
    public VideoTransition setPackagedTransition(int i7, String str, boolean z6) {
        MontageVideoTransition packagedTransition = this.mMonVideoTrack.setPackagedTransition(i7, str, z6);
        return packagedTransition != null ? MonVideoTransitionImpl.box(packagedTransition) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoTrack
    public void setProxyScale(Rational rational) {
        Objects.toString(rational);
        this.mMonVideoTrack.setProxyScale(rational != null ? MonRationalImpl.unbox(rational) : null);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoTrack
    public void setVideoTrack(Object obj) {
        this.mMonVideoTrack = (MontageVideoTrack) obj;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.montage.MonTrackImpl, com.bilibili.studio.kaleidoscope.sdk.Track
    public void setVolumeGain(float f7, float f8) {
        this.mMonVideoTrack.setVolumeGain(f7, f8);
    }
}
