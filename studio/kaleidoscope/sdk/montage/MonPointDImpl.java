package com.bilibili.studio.kaleidoscope.sdk.montage;

import androidx.annotation.NonNull;
import com.bilibili.montage.avinfo.MontagePointD;
import com.bilibili.studio.kaleidoscope.sdk.PointD;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonPointDImpl.class */
public final class MonPointDImpl implements PointD {
    private MontagePointD mMontagePointD;

    public MonPointDImpl(double d7, double d8) {
        MontagePointD montagePointD = new MontagePointD();
        this.mMontagePointD = montagePointD;
        montagePointD.f66335x = d7;
        montagePointD.f66336y = d8;
    }

    private MonPointDImpl(@NonNull MontagePointD montagePointD) {
        this.mMontagePointD = montagePointD;
    }

    @NonNull
    public static PointD box(@NonNull MontagePointD montagePointD) {
        return new MonPointDImpl(montagePointD);
    }

    @NonNull
    public static MontagePointD unbox(@NonNull PointD pointD) {
        return (MontagePointD) pointD.getPointD();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.PointD
    public Object getPointD() {
        return this.mMontagePointD;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.PointD
    public double getX() {
        return this.mMontagePointD.f66335x;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.PointD
    public double getY() {
        return this.mMontagePointD.f66336y;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.PointD
    public void setPointD(Object obj) {
        this.mMontagePointD = (MontagePointD) obj;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.PointD
    public void setX(double d7) {
        this.mMontagePointD.f66335x = d7;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.PointD
    public void setY(double d7) {
        this.mMontagePointD.f66336y = d7;
    }
}
