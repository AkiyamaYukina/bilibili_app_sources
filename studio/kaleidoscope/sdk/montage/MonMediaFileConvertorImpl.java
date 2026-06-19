package com.bilibili.studio.kaleidoscope.sdk.montage;

import androidx.annotation.NonNull;
import com.bilibili.montage.avutil.MontageMediaFileConvertor;
import com.bilibili.studio.kaleidoscope.sdk.MediaFileConvertor;
import java.util.Hashtable;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonMediaFileConvertorImpl.class */
public final class MonMediaFileConvertorImpl implements MediaFileConvertor {
    private static final String TAG = "Mon.MFC.Impl";
    private MontageMediaFileConvertor mMontageMediaFileConvertor;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonMediaFileConvertorImpl$a.class */
    public static final class a implements MontageMediaFileConvertor.MediaFileConvertorCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaFileConvertor.MediaFileConvertorCallback f108393a;

        public a(@NonNull MediaFileConvertor.MediaFileConvertorCallback mediaFileConvertorCallback) {
            this.f108393a = mediaFileConvertorCallback;
        }

        @Override // com.bilibili.montage.avutil.MontageMediaFileConvertor.MediaFileConvertorCallback
        public final void notifyAudioMuteRage(long j7, long j8, long j9) {
            this.f108393a.notifyAudioMuteRage(j7, j8, j9);
        }

        @Override // com.bilibili.montage.avutil.MontageMediaFileConvertor.MediaFileConvertorCallback
        public final void onFinish(long j7, String str, String str2, int i7) {
            this.f108393a.onFinish(j7, str, str2, i7);
        }

        @Override // com.bilibili.montage.avutil.MontageMediaFileConvertor.MediaFileConvertorCallback
        public final void onProgress(long j7, float f7) {
            this.f108393a.onProgress(j7, f7);
        }
    }

    public MonMediaFileConvertorImpl() {
        this.mMontageMediaFileConvertor = new MontageMediaFileConvertor();
    }

    private MonMediaFileConvertorImpl(@NonNull MontageMediaFileConvertor montageMediaFileConvertor) {
        this.mMontageMediaFileConvertor = montageMediaFileConvertor;
    }

    @NonNull
    public static MediaFileConvertor box(@NonNull MontageMediaFileConvertor montageMediaFileConvertor) {
        return new MonMediaFileConvertorImpl(montageMediaFileConvertor);
    }

    @NonNull
    public static MontageMediaFileConvertor unbox(@NonNull MediaFileConvertor mediaFileConvertor) {
        return (MontageMediaFileConvertor) mediaFileConvertor.getMediaFileConvertor();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.MediaFileConvertor
    public void cancelTask(long j7) {
        this.mMontageMediaFileConvertor.cancelTask(j7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.MediaFileConvertor
    public long convertMediaFile(String str, String str2, boolean z6, long j7, long j8, Hashtable hashtable) {
        Objects.toString(hashtable);
        return this.mMontageMediaFileConvertor.convertMediaFile(str, str2, z6, j7, j8, hashtable);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.MediaFileConvertor
    public Object getMediaFileConvertor() {
        return this.mMontageMediaFileConvertor;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.MediaFileConvertor
    public boolean isReleased() {
        return this.mMontageMediaFileConvertor.isReleased();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.MediaFileConvertor
    public void release() {
        this.mMontageMediaFileConvertor.release();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.MediaFileConvertor
    public void setMediaFileConvertor(Object obj) {
        this.mMontageMediaFileConvertor = (MontageMediaFileConvertor) obj;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.MediaFileConvertor
    public void setMediaFileConvertorCallback(MediaFileConvertor.MediaFileConvertorCallback mediaFileConvertorCallback, boolean z6) {
        Objects.toString(mediaFileConvertorCallback);
        this.mMontageMediaFileConvertor.setMediaFileConvertorCallback(mediaFileConvertorCallback != null ? new a(mediaFileConvertorCallback) : null, z6);
    }
}
