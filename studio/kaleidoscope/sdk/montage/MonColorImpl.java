package com.bilibili.studio.kaleidoscope.sdk.montage;

import androidx.annotation.NonNull;
import com.bilibili.montage.avinfo.MontageColor;
import com.bilibili.studio.kaleidoscope.sdk.Color;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonColorImpl.class */
public final class MonColorImpl implements Color {
    private static final String TAG = "Mon.C.Impl";
    private MontageColor mMontageColor;

    public MonColorImpl(float f7, float f8, float f9, float f10) {
        this.mMontageColor = new MontageColor(f7, f8, f9, f10);
    }

    private MonColorImpl(@NonNull MontageColor montageColor) {
        this.mMontageColor = montageColor;
    }

    @NonNull
    public static Color box(@NonNull MontageColor montageColor) {
        return new MonColorImpl(montageColor);
    }

    @NonNull
    public static MontageColor unbox(@NonNull Color color) {
        return (MontageColor) color.getColor();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Color
    public float getA() {
        return this.mMontageColor.f66329a;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Color
    public float getB() {
        return this.mMontageColor.f66330b;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Color
    public Object getColor() {
        return this.mMontageColor;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Color
    public float getG() {
        return this.mMontageColor.f66331g;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Color
    public float getR() {
        return this.mMontageColor.f66332r;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Color
    public void setA(float f7) {
        this.mMontageColor.f66329a = f7;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Color
    public void setB(float f7) {
        this.mMontageColor.f66330b = f7;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Color
    public void setColor(Object obj) {
        this.mMontageColor = (MontageColor) obj;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Color
    public void setG(float f7) {
        this.mMontageColor.f66331g = f7;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Color
    public void setR(float f7) {
        this.mMontageColor.f66332r = f7;
    }
}
