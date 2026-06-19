package com.bilibili.studio.kaleidoscope.sdk;

import androidx.annotation.Nullable;
import com.bilibili.studio.kaleidoscope.sdk.extension.FxEx;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/Fx.class */
public interface Fx extends Ex<FxEx> {
    void addStatsExtraInfo(Map<String, String> map);

    void enableEffect(boolean z6);

    ArbitraryData getArbDataVal(String str);

    ArbitraryData getArbDataValAtTime(String str, @Nullable ArbitraryData arbitraryData, long j7);

    boolean getBooleanVal(String str);

    Color getColorVal(String str);

    float getFilterIntensity();

    double getFloatVal(String str);

    double getFloatValAtTime(String str, long j7);

    Object getFx();

    boolean getIgnoreBackground();

    int getIntVal(String str);

    ControlPointPair getKeyFrameControlPoint(String str, long j7);

    String getMenuVal(String str);

    float[] getRegion();

    int getRegionCoordinateSystemType();

    boolean getRegional();

    String getStringVal(String str);

    boolean removeAllKeyframe(String str);

    boolean removeKeyframeAtTime(String str, long j7);

    void setArbDataVal(String str, ArbitraryData arbitraryData);

    void setArbDataValAtTime(String str, ArbitraryData arbitraryData, long j7);

    void setBooleanVal(String str, boolean z6);

    void setBooleanValAtTime(String str, boolean z6, long j7);

    void setFilterIntensity(float f7);

    void setFloatVal(String str, double d7);

    void setFloatValAtTime(String str, double d7, long j7);

    void setFx(Object obj);

    void setIgnoreBackground(boolean z6);

    void setIntVal(String str, int i7);

    void setIntValAtTime(String str, int i7, long j7);

    boolean setKeyFrameControlPoint(String str, long j7, ControlPointPair controlPointPair);

    void setRegion(float[] fArr);

    void setRegionCoordinateSystemType(int i7);

    void setRegional(boolean z6);

    void setStringVal(String str, String str2);

    void setStringValAtTime(String str, String str2, long j7);

    void setSupportFloatVal(String str, double d7);
}
