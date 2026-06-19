package com.bilibili.studio.kaleidoscope.sdk;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/VideoTrack.class */
public interface VideoTrack extends Track {
    VideoClip addClip(String str, long j7);

    VideoClip addClip(String str, long j7, long j8, long j9);

    VideoClip appendClip(String str);

    VideoClip appendClip(String str, long j7, long j8);

    VideoClip getClipByIndex(int i7);

    VideoClip getClipByTimelinePosition(long j7);

    int getClipCount();

    int getIndex();

    @Nullable
    VideoTransition getTransitionBySourceClipIndex(int i7);

    Object getVideoTrack();

    VideoClip insertClip(String str, int i7);

    VideoClip insertClip(String str, long j7, long j8, int i7);

    boolean isSupportOverlapped();

    @Override // com.bilibili.studio.kaleidoscope.sdk.Track
    boolean removeAllClips();

    VideoTransition setBuiltinTransition(int i7, String str, boolean z6);

    VideoTransition setPackagedTransition(int i7, String str, boolean z6);

    void setProxyScale(Rational rational);

    void setVideoTrack(Object obj);

    @Override // com.bilibili.studio.kaleidoscope.sdk.Track
    void setVolumeGain(float f7, float f8);
}
