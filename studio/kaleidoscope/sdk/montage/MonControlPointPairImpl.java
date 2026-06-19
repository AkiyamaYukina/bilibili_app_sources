package com.bilibili.studio.kaleidoscope.sdk.montage;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bilibili.montage.avinfo.MontageControlPointPair;
import com.bilibili.studio.kaleidoscope.sdk.ControlPointPair;
import com.bilibili.studio.kaleidoscope.sdk.PointD;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonControlPointPairImpl.class */
public final class MonControlPointPairImpl implements ControlPointPair {
    private MontageControlPointPair mMontageControlPointPair;

    private MonControlPointPairImpl(@NonNull MontageControlPointPair montageControlPointPair) {
        this.mMontageControlPointPair = montageControlPointPair;
    }

    public MonControlPointPairImpl(@Nullable PointD pointD, @Nullable PointD pointD2) {
        this.mMontageControlPointPair = new MontageControlPointPair(pointD != null ? MonPointDImpl.unbox(pointD) : null, pointD2 != null ? MonPointDImpl.unbox(pointD2) : null);
    }

    @NonNull
    public static ControlPointPair box(@NonNull MontageControlPointPair montageControlPointPair) {
        return new MonControlPointPairImpl(montageControlPointPair);
    }

    @NonNull
    public static MontageControlPointPair unbox(@NonNull ControlPointPair controlPointPair) {
        return (MontageControlPointPair) controlPointPair.getControlPointPair();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.ControlPointPair
    public PointD getBackwardControlPoint() {
        return MonPointDImpl.box(this.mMontageControlPointPair.backwardControlPoint);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.ControlPointPair
    public Object getControlPointPair() {
        return this.mMontageControlPointPair;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.ControlPointPair
    public PointD getForwardControlPoint() {
        return MonPointDImpl.box(this.mMontageControlPointPair.forwardControlPoint);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.ControlPointPair
    public void setBackwardControlPoint(PointD pointD) {
        this.mMontageControlPointPair.backwardControlPoint = MonPointDImpl.unbox(pointD);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.ControlPointPair
    public void setControlPointPair(Object obj) {
        this.mMontageControlPointPair = (MontageControlPointPair) obj;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.ControlPointPair
    public void setForwardControlPoint(PointD pointD) {
        this.mMontageControlPointPair.forwardControlPoint = MonPointDImpl.unbox(pointD);
    }
}
