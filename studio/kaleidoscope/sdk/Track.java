package com.bilibili.studio.kaleidoscope.sdk;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/Track.class */
public interface Track extends Ex<TrackEx> {
    long changeInPoint(int i7, long j7);

    long changeOutPoint(int i7, long j7);

    long getDuration();

    Object getTrack();

    Volume getVolumeGain();

    boolean moveClip(int i7, int i8);

    boolean removeAllClips();

    boolean removeClip(int i7, boolean z6);

    void setTrack(Object obj);

    void setVolumeGain(float f7, float f8);

    boolean splitClip(int i7, long j7);
}
