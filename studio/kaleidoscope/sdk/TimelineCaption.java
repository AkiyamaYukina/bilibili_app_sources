package com.bilibili.studio.kaleidoscope.sdk;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/TimelineCaption.class */
public interface TimelineCaption extends Caption {
    long changeOutPoint(long j7);

    long getInPoint();

    long getOutPoint();

    String getTemplateAttachment(String str);

    Object getTimelineCaption();

    void movePosition(long j7);

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    boolean removeAllKeyframe(String str);

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    boolean removeKeyframeAtTime(String str, long j7);

    void setClipAffinityEnabled(boolean z6);
}
