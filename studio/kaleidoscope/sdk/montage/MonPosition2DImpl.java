package com.bilibili.studio.kaleidoscope.sdk.montage;

import androidx.annotation.NonNull;
import com.bilibili.montage.avinfo.MontagePosition2D;
import com.bilibili.studio.kaleidoscope.sdk.Position2D;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonPosition2DImpl.class */
public final class MonPosition2DImpl implements Position2D {
    private MontagePosition2D mMontagePosition2D;

    public MonPosition2DImpl(float f7, float f8) {
        this.mMontagePosition2D = new MontagePosition2D(f7, f8);
    }

    private MonPosition2DImpl(@NonNull MontagePosition2D montagePosition2D) {
        this.mMontagePosition2D = montagePosition2D;
    }

    @NonNull
    public static Position2D box(@NonNull MontagePosition2D montagePosition2D) {
        return new MonPosition2DImpl(montagePosition2D);
    }

    @NonNull
    public static MontagePosition2D unbox(@NonNull Position2D position2D) {
        return (MontagePosition2D) position2D.getPosition2D();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Position2D
    public Object getPosition2D() {
        return this.mMontagePosition2D;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Position2D
    public float getX() {
        return this.mMontagePosition2D.f66337x;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Position2D
    public float getY() {
        return this.mMontagePosition2D.f66338y;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Position2D
    public void setPosition2D(Object obj) {
        this.mMontagePosition2D = (MontagePosition2D) obj;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Position2D
    public void setX(float f7) {
        this.mMontagePosition2D.f66337x = f7;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Position2D
    public void setY(float f7) {
        this.mMontagePosition2D.f66338y = f7;
    }
}
