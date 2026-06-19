package com.bilibili.studio.kaleidoscope.sdk;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/VideoFx.class */
public interface VideoFx extends Fx {
    String getBuiltinVideoFxName();

    long getCvConfig();

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    double getFloatVal(String str);

    int getIndex();

    int getMattingMode();

    Object getVideoFx();

    String getVideoFxPackageId();

    int getVideoFxType();

    boolean isCV();

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    boolean removeAllKeyframe(String str);

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    boolean removeKeyframeAtTime(String str, long j7);

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    void setBooleanVal(String str, boolean z6);

    void setDuration(long j7);

    void setExprVar(String str, double d7);

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    void setFloatVal(String str, double d7);

    void setMenuVal(String str, String str2);

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    void setStringVal(String str, String str2);

    void setVideoFx(Object obj);
}
