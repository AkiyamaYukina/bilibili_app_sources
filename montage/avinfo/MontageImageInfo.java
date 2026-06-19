package com.bilibili.montage.avinfo;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avinfo/MontageImageInfo.class */
public class MontageImageInfo {
    private static final int PIXEL_FORMAT_BGRA = 2;
    private static final int PIXEL_FORMAT_NV12 = 4;
    private static final int PIXEL_FORMAT_NV21 = 0;
    private static final int PIXEL_FORMAT_YUV420 = 1;
    private static final String TAG = "MontageImageInfo";
    public Bitmap bitmap;
    public IGrabImageCallback callback;
    public ByteBuffer data;
    public int height;
    public int pixelFormat;
    public int rotation;
    public int size;
    public long taskCost;
    public long taskId;
    public long timestamp;
    public int width;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avinfo/MontageImageInfo$IExecuteCallback.class */
    public interface IExecuteCallback {
        void onExecuteCallback(int i7, int i8, int i9, Object obj);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avinfo/MontageImageInfo$IGrabImageCallback.class */
    public interface IGrabImageCallback {
    }

    public MontageImageInfo() {
        this.taskId = -1L;
        this.data = null;
        this.bitmap = null;
        this.width = -1;
        this.height = -1;
        this.size = -1;
        this.callback = null;
    }

    public MontageImageInfo(int i7, ByteBuffer byteBuffer, int i8, int i9, int i10, int i11, int i12, long j7, long j8, IGrabImageCallback iGrabImageCallback) {
        this.bitmap = null;
        this.taskId = i7;
        this.data = byteBuffer;
        this.pixelFormat = i8;
        this.width = i9;
        this.height = i10;
        this.size = i11;
        this.rotation = i12;
        this.timestamp = j7;
        this.taskCost = j8;
        this.callback = iGrabImageCallback;
    }

    public static MontageVideoFrameInfo generateMontageVideoFrameInfo(MontageImageInfo montageImageInfo) {
        MontageVideoFrameInfo montageVideoFrameInfo = new MontageVideoFrameInfo();
        montageVideoFrameInfo.frameWidth = montageImageInfo.width;
        montageVideoFrameInfo.frameHeight = montageImageInfo.height;
        montageVideoFrameInfo.rowPitchY = 0;
        montageVideoFrameInfo.rowPitchUV = 0;
        montageVideoFrameInfo.pixelFormat = 2;
        montageVideoFrameInfo.frameTimestamp = montageImageInfo.timestamp;
        montageVideoFrameInfo.isRec601 = false;
        montageVideoFrameInfo.isFullRangeYuv = false;
        montageVideoFrameInfo.displayRotation = 0;
        montageVideoFrameInfo.flipHorizontally = false;
        return montageVideoFrameInfo;
    }
}
