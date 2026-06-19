package com.bilibili.studio.kaleidoscope.sdk.montage;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bilibili.montage.avutil.MontageIconGenerator;
import com.bilibili.studio.kaleidoscope.sdk.IconGenerator;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonIconGeneratorImpl.class */
public final class MonIconGeneratorImpl implements IconGenerator {
    private MontageIconGenerator mMontageIconGenerator;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonIconGeneratorImpl$a.class */
    public static final class a implements MontageIconGenerator.IconCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IconGenerator.IconCallback f108392a;

        public a(@NonNull IconGenerator.IconCallback iconCallback) {
            this.f108392a = iconCallback;
        }

        @Override // com.bilibili.montage.avutil.MontageIconGenerator.IconCallback
        public final void onIconReady(Bitmap bitmap, long j7, long j8) {
            this.f108392a.onIconReady(bitmap, j7, j8);
        }
    }

    public MonIconGeneratorImpl() {
        this.mMontageIconGenerator = new MontageIconGenerator();
    }

    private MonIconGeneratorImpl(@NonNull MontageIconGenerator montageIconGenerator) {
        this.mMontageIconGenerator = montageIconGenerator;
    }

    @NonNull
    public static IconGenerator box(@NonNull MontageIconGenerator montageIconGenerator) {
        return new MonIconGeneratorImpl(montageIconGenerator);
    }

    @NonNull
    public static MontageIconGenerator unbox(@NonNull IconGenerator iconGenerator) {
        return (MontageIconGenerator) iconGenerator.getIconGenerator();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.IconGenerator
    public long getIcon(String str, long j7, int i7) {
        return this.mMontageIconGenerator.getIcon(str, j7, i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.IconGenerator
    public long getIcon(String str, long j7, int i7, int i8) {
        return this.mMontageIconGenerator.getIcon(str, j7, i7, i8);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.IconGenerator
    public Bitmap getIconFromCache(String str, long j7, int i7) {
        return this.mMontageIconGenerator.getIconFromCache(str, j7, i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.IconGenerator
    public Bitmap getIconFromCache(String str, long j7, int i7, int i8) {
        return this.mMontageIconGenerator.getIconFromCache(str, j7, i7, i8);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.IconGenerator
    public Object getIconGenerator() {
        return this.mMontageIconGenerator;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.IconGenerator
    public boolean isReleased() {
        return this.mMontageIconGenerator.isReleased();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.IconGenerator
    public void release() {
        this.mMontageIconGenerator.release();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.IconGenerator
    public void setIconCallback(IconGenerator.IconCallback iconCallback) {
        this.mMontageIconGenerator.setIconCallback(iconCallback != null ? new a(iconCallback) : null);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.IconGenerator
    public void setIconGenerator(Object obj) {
        this.mMontageIconGenerator = (MontageIconGenerator) obj;
    }
}
