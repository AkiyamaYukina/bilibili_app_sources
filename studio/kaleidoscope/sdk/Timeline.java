package com.bilibili.studio.kaleidoscope.sdk;

import androidx.annotation.NonNull;
import com.bilibili.studio.kaleidoscope.sdk.CustomVideoFx;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/Timeline.class */
public interface Timeline {
    public static final int CREATE_TIMELINE_FLAG_CAPTION_COMPATIBLE_MODE = 32;

    TimelineAnimatedSticker addAnimatedSticker(long j7, long j8, String str);

    TimelineVideoFx addBuiltinTimelineVideoFx(long j7, long j8, String str);

    TimelineCaption addCaption(String str, long j7, long j8, String str2);

    TimelineCompoundCaption addCompoundCaption(long j7, long j8, String str);

    TimelineAnimatedSticker addCustomAnimatedSticker(long j7, long j8, String str, String str2);

    TimelineVideoFx addCustomTimelineVideoFx(long j7, long j8, CustomVideoFx.Renderer renderer);

    TimelineCaption addModularCaption(String str, long j7, long j8);

    TimelineVideoFx addPackagedTimelineVideoFx(long j7, long j8, String str);

    void addStatsExtraInfo(Map<String, String> map);

    void addWatermark(String str, int i7, int i8, float f7, int i9, int i10, int i11);

    AudioTrack appendAudioTrack();

    VideoTrack appendVideoTrack();

    VideoTrack appendVideoTrack(boolean z6);

    int audioTrackCount();

    boolean changeVideoBitDepth(int i7);

    boolean changeVideoSize(int i7, int i8);

    void enableRenderOrderByZValue(boolean z6);

    List<TimelineAnimatedSticker> getAnimatedStickersByTimelinePosition(long j7);

    AudioTrack getAudioTrackByIndex(int i7);

    List<TimelineCaption> getCaptionsByTimelinePosition(long j7);

    List<TimelineCompoundCaption> getCompoundCaptionsByTimelinePosition(long j7);

    long getDuration();

    TimelineAnimatedSticker getFirstAnimatedSticker();

    TimelineCaption getFirstCaption();

    TimelineCompoundCaption getFirstCompoundCaption();

    TimelineVideoFx getFirstTimelineVideoFx();

    TimelineAnimatedSticker getNextAnimatedSticker(@NonNull TimelineAnimatedSticker timelineAnimatedSticker);

    TimelineCaption getNextCaption(TimelineCaption timelineCaption);

    TimelineCompoundCaption getNextCaption(@NonNull TimelineCompoundCaption timelineCompoundCaption);

    TimelineVideoFx getNextTimelineVideoFx(@NonNull TimelineVideoFx timelineVideoFx);

    Object getTimeline();

    VideoResolution getVideoRes();

    VideoTrack getVideoTrackByIndex(int i7);

    VideoTrack insertVideoTrack(int i7, boolean z6);

    TimelineAnimatedSticker removeAnimatedSticker(TimelineAnimatedSticker timelineAnimatedSticker);

    boolean removeAudioTrack(int i7);

    TimelineCaption removeCaption(TimelineCaption timelineCaption);

    TimelineCompoundCaption removeCompoundCaption(TimelineCompoundCaption timelineCompoundCaption);

    TimelineVideoFx removeTimelineVideoFx(TimelineVideoFx timelineVideoFx);

    boolean removeVideoTrack(int i7);

    void setTimeline(Object obj);

    int videoTrackCount();
}
