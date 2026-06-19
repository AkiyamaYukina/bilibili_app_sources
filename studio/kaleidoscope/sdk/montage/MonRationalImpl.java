package com.bilibili.studio.kaleidoscope.sdk.montage;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.bilibili.montage.avinfo.MontageRational;
import com.bilibili.studio.kaleidoscope.sdk.Rational;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonRationalImpl.class */
@Keep
public final class MonRationalImpl implements Rational {
    private MontageRational mMonRational;

    public MonRationalImpl(int i7, int i8) {
        this.mMonRational = new MontageRational(i7, i8);
    }

    private MonRationalImpl(@NonNull MontageRational montageRational) {
        this.mMonRational = montageRational;
    }

    @NonNull
    public static Rational box(@NonNull MontageRational montageRational) {
        return new MonRationalImpl(montageRational);
    }

    @NonNull
    public static MontageRational unbox(@NonNull Rational rational) {
        return (MontageRational) rational.getRational();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Rational
    public int getDen() {
        return this.mMonRational.den;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Rational
    public int getNum() {
        return this.mMonRational.num;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Rational
    public Object getRational() {
        return this.mMonRational;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Rational
    public void setDen(int i7) {
        this.mMonRational.den = i7;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Rational
    public void setNum(int i7) {
        this.mMonRational.num = i7;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Rational
    public void setRational(Object obj) {
        this.mMonRational = (MontageRational) obj;
    }
}
