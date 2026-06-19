package com.bilibili.studio.kaleidoscope.sdk.montage;

import android.os.Handler;
import androidx.annotation.NonNull;
import com.bilibili.montage.avinfo.MontageVideoFrameInfo;
import com.bilibili.montage.avutil.MontageMediaFileVideoRetriever;
import com.bilibili.studio.kaleidoscope.sdk.MediaFileVideoRetriever;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonMediaFileVideoRetrieverImpl.class */
public final class MonMediaFileVideoRetrieverImpl implements MediaFileVideoRetriever {
    private static final String TAG = "Mon.MFVR.Impl";
    private MontageMediaFileVideoRetriever mMontageMediaFileVideoRetriever;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonMediaFileVideoRetrieverImpl$a.class */
    public static final class a implements MontageMediaFileVideoRetriever.MeidaFileVideoRetrieverCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaFileVideoRetriever.MeidaFileVideoRetrieverCallback f108394a;

        public a(@NonNull MediaFileVideoRetriever.MeidaFileVideoRetrieverCallback meidaFileVideoRetrieverCallback) {
            this.f108394a = meidaFileVideoRetrieverCallback;
        }

        @Override // com.bilibili.montage.avutil.MontageMediaFileVideoRetriever.MeidaFileVideoRetrieverCallback
        public final void notifyFinsih(long j7, int i7) {
            this.f108394a.notifyFinsih(j7, i7);
        }

        @Override // com.bilibili.montage.avutil.MontageMediaFileVideoRetriever.MeidaFileVideoRetrieverCallback
        public final void notifyProgress(long j7, float f7) {
            this.f108394a.notifyProgress(j7, f7);
        }

        @Override // com.bilibili.montage.avutil.MontageMediaFileVideoRetriever.MeidaFileVideoRetrieverCallback
        public final void notifySengmentData(long j7, MontageVideoFrameInfo montageVideoFrameInfo, ByteBuffer byteBuffer) {
            this.f108394a.notifySengmentData(j7, MonVideoFrameInfoImpl.box(montageVideoFrameInfo), byteBuffer);
        }

        @Override // com.bilibili.montage.avutil.MontageMediaFileVideoRetriever.MeidaFileVideoRetrieverCallback
        public final void notifySengmentData(long j7, ByteBuffer byteBuffer, int i7, int i8, int i9, int i10) {
            this.f108394a.notifySengmentData(j7, byteBuffer, i7, i8, i9, i10);
        }
    }

    public MonMediaFileVideoRetrieverImpl() {
        this.mMontageMediaFileVideoRetriever = new MontageMediaFileVideoRetriever();
    }

    private MonMediaFileVideoRetrieverImpl(@NonNull MontageMediaFileVideoRetriever montageMediaFileVideoRetriever) {
        this.mMontageMediaFileVideoRetriever = montageMediaFileVideoRetriever;
    }

    @NonNull
    public static MediaFileVideoRetriever box(@NonNull MontageMediaFileVideoRetriever montageMediaFileVideoRetriever) {
        return new MonMediaFileVideoRetrieverImpl(montageMediaFileVideoRetriever);
    }

    @NonNull
    public static MontageMediaFileVideoRetriever unbox(@NonNull MediaFileVideoRetriever mediaFileVideoRetriever) {
        return (MontageMediaFileVideoRetriever) mediaFileVideoRetriever.getMediaFileVideoRetriever();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.MediaFileVideoRetriever
    public void cancelTask(long j7) {
        this.mMontageMediaFileVideoRetriever.cancelTask(j7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.MediaFileVideoRetriever
    public long decodeVideoSegment(String str, long j7, long j8, int i7, int i8, int i9, int i10) {
        return this.mMontageMediaFileVideoRetriever.decodeVideoSegment(str, j7, j8, i7, i8, i9, i10);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.MediaFileVideoRetriever
    public Object getMediaFileVideoRetriever() {
        return this.mMontageMediaFileVideoRetriever;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.MediaFileVideoRetriever
    public void release() {
        this.mMontageMediaFileVideoRetriever.release();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.MediaFileVideoRetriever
    public void setMediaFileVideoRetriever(Object obj) {
        this.mMontageMediaFileVideoRetriever = (MontageMediaFileVideoRetriever) obj;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.MediaFileVideoRetriever
    public void setMeidaFileVideoRetrieverCallback(MediaFileVideoRetriever.MeidaFileVideoRetrieverCallback meidaFileVideoRetrieverCallback, Handler handler) {
        Objects.toString(meidaFileVideoRetrieverCallback);
        Objects.toString(handler);
        this.mMontageMediaFileVideoRetriever.setMeidaFileVideoRetrieverCallback(meidaFileVideoRetrieverCallback != null ? new a(meidaFileVideoRetrieverCallback) : null, handler);
    }
}
