package com.bilibili.studio.kaleidoscope.sdk.montage;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bilibili.montage.avinfo.MontageRational;
import com.bilibili.montage.avinfo.MontageVideoResolution;
import com.bilibili.studio.kaleidoscope.sdk.Rational;
import com.bilibili.studio.kaleidoscope.sdk.VideoResolution;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonVideoResolutionImpl.class */
public final class MonVideoResolutionImpl implements VideoResolution {
    private MontageVideoResolution mMontageVideoResolution;

    public MonVideoResolutionImpl() {
        this.mMontageVideoResolution = new MontageVideoResolution();
    }

    private MonVideoResolutionImpl(@NonNull MontageVideoResolution montageVideoResolution) {
        this.mMontageVideoResolution = montageVideoResolution;
    }

    @Nullable
    public static VideoResolution box(@Nullable MontageVideoResolution montageVideoResolution) {
        if (montageVideoResolution == null) {
            return null;
        }
        return new MonVideoResolutionImpl(montageVideoResolution);
    }

    @Nullable
    public static MontageVideoResolution unbox(@Nullable VideoResolution videoResolution) {
        if (videoResolution == null) {
            return null;
        }
        return (MontageVideoResolution) videoResolution.getVideoResolution();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoResolution
    public int getBitDepth() {
        return this.mMontageVideoResolution.bitDepth;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoResolution
    public int getImageHeight() {
        return this.mMontageVideoResolution.imageHeight;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoResolution
    public Rational getImagePAR() {
        MontageRational montageRational = this.mMontageVideoResolution.imagePAR;
        return montageRational != null ? MonRationalImpl.box(montageRational) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoResolution
    public int getImageWidth() {
        return this.mMontageVideoResolution.imageWidth;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoResolution
    public Object getVideoResolution() {
        return this.mMontageVideoResolution;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoResolution
    public void setBitDepth(int i7) {
        this.mMontageVideoResolution.bitDepth = i7;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoResolution
    public void setImageHeight(int i7) {
        this.mMontageVideoResolution.imageHeight = i7;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoResolution
    public void setImagePAR(Rational rational) {
        this.mMontageVideoResolution.imagePAR = rational != null ? MonRationalImpl.unbox(rational) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoResolution
    public void setImageWidth(int i7) {
        this.mMontageVideoResolution.imageWidth = i7;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoResolution
    public void setVideoResolution(Object obj) {
        this.mMontageVideoResolution = (MontageVideoResolution) obj;
    }
}
