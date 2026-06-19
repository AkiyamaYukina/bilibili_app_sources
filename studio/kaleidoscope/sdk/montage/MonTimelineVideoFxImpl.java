package com.bilibili.studio.kaleidoscope.sdk.montage;

import androidx.annotation.NonNull;
import com.bilibili.montage.FX.MontageTimelineVideoFx;
import com.bilibili.montage.avinfo.MontageColor;
import com.bilibili.studio.kaleidoscope.sdk.Color;
import com.bilibili.studio.kaleidoscope.sdk.TimelineVideoFx;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonTimelineVideoFxImpl.class */
public final class MonTimelineVideoFxImpl extends MonFxImpl implements TimelineVideoFx {
    private static final String TAG = "Mon.TVF.Impl";
    private MontageTimelineVideoFx mMontageTimelineVideoFx;

    private MonTimelineVideoFxImpl(@NonNull MontageTimelineVideoFx montageTimelineVideoFx) {
        super(montageTimelineVideoFx);
        this.mMontageTimelineVideoFx = montageTimelineVideoFx;
    }

    @NonNull
    public static TimelineVideoFx box(@NonNull MontageTimelineVideoFx montageTimelineVideoFx) {
        return new MonTimelineVideoFxImpl(montageTimelineVideoFx);
    }

    @NonNull
    public static MontageTimelineVideoFx unbox(@NonNull TimelineVideoFx timelineVideoFx) {
        return (MontageTimelineVideoFx) timelineVideoFx.getTimelineVideoFx();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineVideoFx
    public long changeInPoint(long j7) {
        return this.mMontageTimelineVideoFx.changeInPoint(j7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineVideoFx
    public long changeOutPoint(long j7) {
        return this.mMontageTimelineVideoFx.changeOutPoint(j7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineVideoFx
    public String getBuiltinTimelineVideoFxName() {
        return this.mMontageTimelineVideoFx.getBuiltinTimelineVideoFxName();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineVideoFx
    public Object getExprObjectVar(String str) {
        Object exprObjectVar = this.mMontageTimelineVideoFx.getExprObjectVar(str);
        Object objBox = exprObjectVar;
        if (exprObjectVar instanceof MontageColor) {
            objBox = MonColorImpl.box((MontageColor) exprObjectVar);
        }
        return objBox;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineVideoFx
    public double getExprVar(String str) {
        return this.mMontageTimelineVideoFx.getExprVar(str);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineVideoFx
    public long getInPoint() {
        return this.mMontageTimelineVideoFx.getInPoint();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineVideoFx
    public long getOutPoint() {
        return this.mMontageTimelineVideoFx.getOutPoint();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineVideoFx
    public Object getTimelineVideoFx() {
        return this.mMontageTimelineVideoFx;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineVideoFx
    public String getTimelineVideoFxPackageId() {
        return this.mMontageTimelineVideoFx.getTimelineVideoFxPackageId();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineVideoFx
    public int getTimelineVideoFxType() {
        return this.mMontageTimelineVideoFx.getTimelineVideoFxType();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineVideoFx
    public float getZValue() {
        return this.mMontageTimelineVideoFx.getZValue();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineVideoFx
    public void movePosition(long j7) {
        this.mMontageTimelineVideoFx.movePosition(j7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineVideoFx
    public void setExprObjectVar(String str, Object obj) {
        Objects.toString(obj);
        if (obj instanceof Color) {
            this.mMontageTimelineVideoFx.setExprObjectVar(str, MonColorImpl.unbox((Color) obj));
        } else {
            this.mMontageTimelineVideoFx.setExprObjectVar(str, obj);
        }
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineVideoFx
    public void setExprVar(String str, double d7) {
        this.mMontageTimelineVideoFx.setExprVar(str, d7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineVideoFx
    public void setTimelineVideoFx(Object obj) {
        this.mMontageTimelineVideoFx = (MontageTimelineVideoFx) obj;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineVideoFx
    public void setZValue(float f7) {
        this.mMontageTimelineVideoFx.setZValue(f7);
    }
}
