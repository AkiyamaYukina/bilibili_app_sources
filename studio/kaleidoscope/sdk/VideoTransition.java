package com.bilibili.studio.kaleidoscope.sdk;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/VideoTransition.class */
public interface VideoTransition extends Fx {
    public static final int VIDEO_TRANSITION_DURATION_MATCH_MODE_NONE = 0;
    public static final int VIDEO_TRANSITION_DURATION_MATCH_MODE_STRETCH = 1;
    public static final int VIDEO_TRANSITION_TYPE_BUILTIN = 0;
    public static final int VIDEO_TRANSITION_TYPE_CUSTOM = 2;
    public static final int VIDEO_TRANSITION_TYPE_PACKAGE = 1;

    String getBuiltinVideoTransitionName();

    Object getVideoTransition();

    long getVideoTransitionDuration();

    int getVideoTransitionType();

    void setVideoTransition(Object obj);

    void setVideoTransitionDuration(long j7, int i7);
}
