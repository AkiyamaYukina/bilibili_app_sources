package com.bilibili.bmmcaptureandroid;

import android.graphics.SurfaceTexture;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/bmmcaptureandroid/VideoFrame.class */
public class VideoFrame {
    public static final int PIXEL_FORMAT_NV21 = 0;
    public static final int PIXEL_FORMAT_RGBA = 2;
    public static final int PIXEL_FORMAT_YUV420 = 1;
    private static boolean mEnableRecord = false;
    public int animalFaceCount;
    public byte[] dataBuffer;
    public int dataType;
    public float degree;
    public Set<Integer> embedTextureIds;
    public boolean enableRecord;
    public int encodeContentHeight;
    public int encodeContentWidth;
    public int encodeHeight;
    public int encodeTextureId;
    public int encodeWidth;
    public int height;
    public float heightOffset;
    public int humanActionDetectOrientation;
    public int orientation;
    public int pixelFormat;
    public int preProcessTextureId;
    public int previewTextureId;
    public SurfaceTexture surfaceTexture;
    public int textureId;
    public long timeStamp;
    public int width;
    public float widthOffset;
    public float xOffset;
    public float yOffset;

    public VideoFrame() {
        this.previewTextureId = -1;
        this.preProcessTextureId = -1;
        this.encodeTextureId = -1;
        this.encodeContentWidth = Integer.MIN_VALUE;
        this.encodeContentHeight = Integer.MIN_VALUE;
        this.encodeWidth = Integer.MIN_VALUE;
        this.encodeHeight = Integer.MIN_VALUE;
        this.enableRecord = mEnableRecord;
        this.embedTextureIds = new HashSet();
    }

    public VideoFrame(VideoFrame videoFrame) {
        byte[] bArr;
        this.previewTextureId = -1;
        this.preProcessTextureId = -1;
        this.encodeTextureId = -1;
        this.encodeContentWidth = Integer.MIN_VALUE;
        this.encodeContentHeight = Integer.MIN_VALUE;
        this.encodeWidth = Integer.MIN_VALUE;
        this.encodeHeight = Integer.MIN_VALUE;
        this.textureId = videoFrame.textureId;
        this.previewTextureId = videoFrame.previewTextureId;
        this.width = videoFrame.width;
        this.height = videoFrame.height;
        byte[] bArr2 = videoFrame.dataBuffer;
        if (bArr2 != null) {
            bArr = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        } else {
            bArr = null;
        }
        this.dataBuffer = bArr;
        this.pixelFormat = videoFrame.pixelFormat;
        this.orientation = videoFrame.orientation;
        this.humanActionDetectOrientation = videoFrame.humanActionDetectOrientation;
        this.xOffset = videoFrame.xOffset;
        this.yOffset = videoFrame.yOffset;
        this.widthOffset = videoFrame.widthOffset;
        this.heightOffset = videoFrame.heightOffset;
        this.degree = videoFrame.degree;
        this.timeStamp = videoFrame.timeStamp;
        this.encodeContentWidth = videoFrame.encodeContentWidth;
        this.encodeContentHeight = videoFrame.encodeContentHeight;
        this.encodeWidth = videoFrame.encodeWidth;
        this.encodeHeight = videoFrame.encodeHeight;
        this.enableRecord = videoFrame.enableRecord;
        this.embedTextureIds.addAll(videoFrame.embedTextureIds);
        this.animalFaceCount = videoFrame.animalFaceCount;
        this.surfaceTexture = videoFrame.surfaceTexture;
        this.dataType = videoFrame.dataType;
    }

    public static void setRecord(boolean z6) {
        mEnableRecord = z6;
    }
}
