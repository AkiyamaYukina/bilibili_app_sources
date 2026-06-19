package com.bilibili.studio.kaleidoscope.sdk;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/Clip.class */
public interface Clip {
    public static final int CLIP_SPEED_TYPE_SONIC = 1;
    public static final int CLIP_SPEED_TYPE_SOUND_TOUCH = 0;
    public static final int CLIP_TYPE_AUDIO = 1;
    public static final int CLIP_TYPE_VIDEO = 0;

    long GetClipPosByTimelinePosCurvesVariableSpeed(long j7);

    long GetTimelinePosByClipPosCurvesVariableSpeed(long j7);

    boolean changeCurvesVariableSpeed(String str, boolean z6, int i7);

    boolean changeFilePath(String str);

    void changeSpeed(double d7);

    void changeSpeed(double d7, int i7);

    void changeSpeed(double d7, boolean z6);

    void changeSpeed(double d7, boolean z6, int i7);

    long changeTrimInPoint(long j7, boolean z6);

    long changeTrimOutPoint(long j7, boolean z6);

    Object getClip();

    String getClipVariableSpeedCurvesString();

    ClipEx getExtension();

    String getFilePath();

    int getFxCount();

    long getInPoint();

    long getInPoint(boolean z6);

    int getIndex();

    long getObjHashCode();

    long getOutPoint();

    double getSpeed();

    long getTrimIn();

    long getTrimIn(boolean z6);

    long getTrimOut();

    int getType();

    Volume getVolumeGain();

    void setClip(Object obj);

    void setVolumeGain(float f7, float f8);
}
