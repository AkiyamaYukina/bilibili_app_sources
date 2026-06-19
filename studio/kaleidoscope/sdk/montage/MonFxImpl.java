package com.bilibili.studio.kaleidoscope.sdk.montage;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bilibili.montage.FX.MontageFx;
import com.bilibili.montage.avinfo.MontageArbitraryData;
import com.bilibili.montage.avinfo.MontageControlPointPair;
import com.bilibili.montage.avinfo.MontageMaskRegionInfo;
import com.bilibili.studio.kaleidoscope.sdk.ArbitraryData;
import com.bilibili.studio.kaleidoscope.sdk.Color;
import com.bilibili.studio.kaleidoscope.sdk.ControlPointPair;
import com.bilibili.studio.kaleidoscope.sdk.Fx;
import com.bilibili.studio.kaleidoscope.sdk.extension.FxEx;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonFxImpl.class */
public class MonFxImpl implements Fx {
    private static final String TAG = "Mon.F.Impl";
    private final FxEx mFxEx = new Object();
    private MontageFx mMontageFx;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.bilibili.studio.kaleidoscope.sdk.extension.FxEx, java.lang.Object] */
    public MonFxImpl(@NonNull MontageFx montageFx) {
        this.mMontageFx = montageFx;
    }

    @NonNull
    public static Fx box(@NonNull MontageFx montageFx) {
        return new MonFxImpl(montageFx);
    }

    @NonNull
    public static MontageFx unbox(@NonNull Fx fx) {
        return (MontageFx) fx.getFx();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    public void addStatsExtraInfo(Map<String, String> map) {
        this.mMontageFx.addStatsExtraInfo(map);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    public void enableEffect(boolean z6) {
        this.mMontageFx.enableEffect(z6);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    public ArbitraryData getArbDataVal(String str) {
        MontageArbitraryData arbDataVal = this.mMontageFx.getArbDataVal(str);
        if (arbDataVal instanceof MontageMaskRegionInfo) {
            return MonMaskRegionInfoImpl.box((MontageMaskRegionInfo) arbDataVal);
        }
        return arbDataVal != null ? MonArbitraryDataImpl.box(arbDataVal) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    public ArbitraryData getArbDataValAtTime(String str, @Nullable ArbitraryData arbitraryData, long j7) {
        MontageArbitraryData arbDataValAtTime = this.mMontageFx.getArbDataValAtTime(str, arbitraryData != null ? MonArbitraryDataImpl.unbox(arbitraryData) : null, j7);
        if (arbDataValAtTime instanceof MontageMaskRegionInfo) {
            return MonMaskRegionInfoImpl.box((MontageMaskRegionInfo) arbDataValAtTime);
        }
        ArbitraryData arbitraryDataBox = null;
        if (arbDataValAtTime != null) {
            arbitraryDataBox = MonArbitraryDataImpl.box(arbDataValAtTime);
        }
        return arbitraryDataBox;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    public boolean getBooleanVal(String str) {
        return this.mMontageFx.getBooleanVal(str);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    public Color getColorVal(String str) {
        return this.mMontageFx.getColorVal(str) != null ? MonColorImpl.box(this.mMontageFx.getColorVal(str)) : null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bilibili.studio.kaleidoscope.sdk.Ex
    public FxEx getExtension() {
        return this.mFxEx;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    public float getFilterIntensity() {
        return this.mMontageFx.getFilterIntensity();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    public double getFloatVal(String str) {
        return this.mMontageFx.getFloatVal(str);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    public double getFloatValAtTime(String str, long j7) {
        return this.mMontageFx.getFloatValAtTime(str, j7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    public Object getFx() {
        return this.mMontageFx;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    public boolean getIgnoreBackground() {
        return this.mMontageFx.getIgnoreBackground();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    public int getIntVal(String str) {
        return this.mMontageFx.getIntVal(str);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    public ControlPointPair getKeyFrameControlPoint(String str, long j7) {
        MontageControlPointPair keyFrameControlPoint = this.mMontageFx.getKeyFrameControlPoint(str, j7);
        return keyFrameControlPoint != null ? MonControlPointPairImpl.box(keyFrameControlPoint) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    public String getMenuVal(String str) {
        return this.mMontageFx.getMenuVal(str);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Ex
    public long getObjHashCode() {
        return this.mMontageFx.identity();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    public float[] getRegion() {
        return this.mMontageFx.getRegion();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    public int getRegionCoordinateSystemType() {
        return this.mMontageFx.getRegionCoordinateSystemType();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    public boolean getRegional() {
        return this.mMontageFx.getRegional();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    public String getStringVal(String str) {
        return this.mMontageFx.getStringVal(str);
    }

    public FxEx getmFxEx() {
        return this.mFxEx;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    public boolean removeAllKeyframe(String str) {
        return this.mMontageFx.removeAllKeyframe(str);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    public boolean removeKeyframeAtTime(String str, long j7) {
        return this.mMontageFx.removeKeyframeAtTime(str, j7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    public void setArbDataVal(String str, ArbitraryData arbitraryData) {
        Objects.toString(arbitraryData);
        this.mMontageFx.setArbDataVal(str, arbitraryData != null ? MonArbitraryDataImpl.unbox(arbitraryData) : null);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    public void setArbDataValAtTime(String str, ArbitraryData arbitraryData, long j7) {
        Objects.toString(arbitraryData);
        this.mMontageFx.setArbDataValAtTime(str, arbitraryData != null ? MonArbitraryDataImpl.unbox(arbitraryData) : null, j7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    public void setBooleanVal(String str, boolean z6) {
        this.mMontageFx.setBooleanVal(str, z6);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    public void setBooleanValAtTime(String str, boolean z6, long j7) {
        this.mMontageFx.setBooleanValAtTime(str, z6, j7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    public void setFilterIntensity(float f7) {
        this.mMontageFx.setFilterIntensity(f7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    public void setFloatVal(String str, double d7) {
        this.mMontageFx.setFloatVal(str, d7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    public void setFloatValAtTime(String str, double d7, long j7) {
        this.mMontageFx.setFloatValAtTime(str, d7, j7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    public void setFx(Object obj) {
        this.mMontageFx = (MontageFx) obj;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    public void setIgnoreBackground(boolean z6) {
        this.mMontageFx.setIgnoreBackground(z6);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    public void setIntVal(String str, int i7) {
        this.mMontageFx.setIntVal(str, i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    public void setIntValAtTime(String str, int i7, long j7) {
        this.mMontageFx.setIntValAtTime(str, i7, j7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    public boolean setKeyFrameControlPoint(String str, long j7, ControlPointPair controlPointPair) {
        Objects.toString(controlPointPair);
        return this.mMontageFx.setKeyFrameControlPoint(str, j7, controlPointPair != null ? MonControlPointPairImpl.unbox(controlPointPair) : null);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    public void setRegion(float[] fArr) {
        this.mMontageFx.setRegion(fArr);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    public void setRegionCoordinateSystemType(int i7) {
        this.mMontageFx.setRegionCoordinateSystemType(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    public void setRegional(boolean z6) {
        this.mMontageFx.setRegional(z6);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    public void setStringVal(String str, String str2) {
        this.mMontageFx.setStringVal(str, str2);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    public void setStringValAtTime(String str, String str2, long j7) {
        this.mMontageFx.setStringValAtTime(str, str2, j7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    public void setSupportFloatVal(String str, double d7) {
        this.mMontageFx.setFloatVal(str, d7);
    }
}
