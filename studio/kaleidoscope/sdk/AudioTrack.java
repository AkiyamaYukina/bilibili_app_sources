package com.bilibili.studio.kaleidoscope.sdk;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/AudioTrack.class */
public interface AudioTrack extends Track {
    AudioClip addClip(String str, long j7);

    AudioClip addClip(String str, long j7, long j8, long j9);

    AudioClip appendClip(String str);

    AudioClip appendClip(String str, long j7, long j8);

    Object getAudioTrack();

    AudioClip getClipByIndex(int i7);

    AudioClip getClipByTimelinePosition(long j7);

    int getClipCount();

    int getIndex();

    AudioClip insertClip(String str, int i7);

    AudioClip insertClip(String str, long j7, long j8, int i7);

    @Override // com.bilibili.studio.kaleidoscope.sdk.Track
    boolean removeClip(int i7, boolean z6);

    void setAudioTrack(Object obj);
}
