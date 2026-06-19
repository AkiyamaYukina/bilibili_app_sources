package com.bilibili.studio.kaleidoscope.sdk.montage;

import androidx.annotation.NonNull;
import com.bilibili.montage.avinfo.MontageVolume;
import com.bilibili.montage.timeline.MontageTrack;
import com.bilibili.studio.kaleidoscope.sdk.Track;
import com.bilibili.studio.kaleidoscope.sdk.TrackEx;
import com.bilibili.studio.kaleidoscope.sdk.Volume;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonTrackImpl.class */
public class MonTrackImpl implements Track {
    protected final TrackEx mMonTrackEx = new Object();
    private MontageTrack mMontageTrack;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.bilibili.studio.kaleidoscope.sdk.TrackEx, java.lang.Object] */
    public MonTrackImpl(@NonNull MontageTrack montageTrack) {
        this.mMontageTrack = montageTrack;
    }

    @NonNull
    public static Track box(@NonNull MontageTrack montageTrack) {
        return new MonTrackImpl(montageTrack);
    }

    @NonNull
    public static MontageTrack unbox(@NonNull Track track) {
        return (MontageTrack) track.getTrack();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Track
    public long changeInPoint(int i7, long j7) {
        return this.mMontageTrack.changeInPoint(i7, j7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Track
    public long changeOutPoint(int i7, long j7) {
        return this.mMontageTrack.changeOutPoint(i7, j7, false);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Track
    public long getDuration() {
        return this.mMontageTrack.getDuration();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bilibili.studio.kaleidoscope.sdk.Ex
    public TrackEx getExtension() {
        return this.mMonTrackEx;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Ex
    public long getObjHashCode() {
        return this.mMontageTrack.identity();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Track
    public Object getTrack() {
        return this.mMontageTrack;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Track
    public Volume getVolumeGain() {
        MontageVolume volumeGain = this.mMontageTrack.getVolumeGain();
        return volumeGain != null ? MonVolumeImpl.box(volumeGain) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Track
    public boolean moveClip(int i7, int i8) {
        return this.mMontageTrack.moveClip(i7, i8);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Track
    public boolean removeAllClips() {
        return this.mMontageTrack.removeAllClips();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Track
    public boolean removeClip(int i7, boolean z6) {
        return this.mMontageTrack.removeClip(i7, z6);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Track
    public void setTrack(Object obj) {
        this.mMontageTrack = (MontageTrack) obj;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Track
    public void setVolumeGain(float f7, float f8) {
        this.mMontageTrack.setVolumeGain(f7, f8);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Track
    public boolean splitClip(int i7, long j7) {
        return this.mMontageTrack.splitClip(i7, j7);
    }
}
