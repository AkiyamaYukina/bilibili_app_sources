package com.bilibili.studio.kaleidoscope.sdk.montage;

import androidx.annotation.NonNull;
import com.bilibili.montage.avinfo.MontageSize;
import com.bilibili.studio.kaleidoscope.sdk.Size;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonSizeImpl.class */
public final class MonSizeImpl implements Size {
    private MontageSize mMontageSize;

    public MonSizeImpl(int i7, int i8) {
        this.mMontageSize = new MontageSize(i7, i8);
    }

    private MonSizeImpl(@NonNull MontageSize montageSize) {
        this.mMontageSize = montageSize;
    }

    @NonNull
    public static Size box(@NonNull MontageSize montageSize) {
        return new MonSizeImpl(montageSize);
    }

    @NonNull
    public static MontageSize unbox(@NonNull Size size) {
        return (MontageSize) size.getSize();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Size
    public int getHeight() {
        MontageSize montageSize = this.mMontageSize;
        return montageSize == null ? 0 : montageSize.height;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Size
    public Object getSize() {
        return this.mMontageSize;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Size
    public int getWidth() {
        MontageSize montageSize = this.mMontageSize;
        return montageSize == null ? 0 : montageSize.width;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Size
    public void setHeight(int i7) {
        MontageSize montageSize = this.mMontageSize;
        if (montageSize != null) {
            montageSize.height = i7;
        }
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Size
    public void setSize(Object obj) {
        this.mMontageSize = (MontageSize) obj;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Size
    public void setWidth(int i7) {
        MontageSize montageSize = this.mMontageSize;
        if (montageSize != null) {
            montageSize.width = i7;
        }
    }
}
