package com.bilibili.sponge.camera;

import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.text.selection.P0;
import com.bilibili.sponge.callback.ICameraRawDataListener;
import java.util.Objects;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sponge/camera/CameraParameterConfigture.class */
public class CameraParameterConfigture {
    public static final String CAMERA_PARAM_FLASH_MODE_AUTO = "flash_mode_auto";
    public static final String CAMERA_PARAM_FLASH_MODE_CLOSE = "flash_mode_close";
    public static final String CAMERA_PARAM_FLASH_MODE_OPEN = "flash_mode_open";
    public static final String CAMERA_PARAM_FLASH_MODE_TORCH = "flash_mode_torch";
    public static final String CAMERA_PARAM_FOCUS_MODE_AUTO = "focus_mode_auto";
    public static final String CAMERA_PARAM_FOCUS_MODE_CONTINUE_PICTURE = "focus_mode_continue_picture";
    public static final String CAMERA_PARAM_FOCUS_MODE_CONTINUE_VIDEO = "focus_mode_continue_video";
    public static final int CAMERA_RAW_DATA_TYPE_I420 = 18;
    public static final int CAMERA_RAW_DATA_TYPE_NV12 = 17;
    public static final int CAMERA_RAW_DATA_TYPE_NV21 = 16;
    public static final int CAMERA_RAW_DATA_TYPE_YUV_420_888 = 19;
    private String flashMode;
    private String focusMode;
    private int fps = 30;
    private boolean isFrontCamera = true;
    private boolean isNeedTexture = false;
    private int mDisplayRotation = 0;
    private ICameraRawDataListener mFrameRawDataListener;
    private SpongeSize mPreviewSize;
    private SurfaceTexture mTexture;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sponge/camera/CameraParameterConfigture$RawFrameData.class */
    public static class RawFrameData {
        private static final String TAG = "RawFrameData";
        private int height;
        private boolean isFront;
        private byte[] mData;
        private int mType;
        private int rotation;
        private int textureId;
        private long timestamp;
        private int width;

        public int getHeight() {
            return this.height;
        }

        public int getRotation() {
            return this.rotation;
        }

        public int getTextureId() {
            return this.textureId;
        }

        public long getTimestamp() {
            return this.timestamp;
        }

        public int getWidth() {
            return this.width;
        }

        public byte[] getmData() {
            return this.mData;
        }

        public int getmType() {
            return this.mType;
        }

        public boolean isFront() {
            return this.isFront;
        }

        public void setHeight(int i7) {
            this.height = i7;
        }

        public void setIsFront(boolean z6) {
            this.isFront = z6;
        }

        public void setRotation(int i7) {
            this.rotation = i7;
        }

        public void setTextureId(int i7) {
            this.textureId = i7;
        }

        public void setTimestamp(long j7) {
            this.timestamp = j7;
        }

        public void setWidth(int i7) {
            this.width = i7;
        }

        public void setmData(byte[] bArr) {
            this.mData = bArr;
        }

        public void setmType(int i7) {
            this.mType = i7;
        }

        @NonNull
        public String toString() {
            StringBuilder sb = new StringBuilder("toString: mType = ");
            sb.append(this.mType);
            sb.append("--mData = ");
            sb.append(this.mData);
            sb.append("--timestamp = ");
            sb.append(this.timestamp);
            sb.append("--rotation = ");
            sb.append(this.rotation);
            sb.append("--isFront = ");
            sb.append(this.isFront);
            sb.append("--textureId = ");
            sb.append(this.textureId);
            sb.append("--width = ");
            sb.append(this.width);
            sb.append("--height = ");
            P0.a(this.height, TAG, sb);
            return super.toString();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sponge/camera/CameraParameterConfigture$SpongeSize.class */
    public static class SpongeSize implements Comparable {
        int height;
        int width;

        public SpongeSize() {
        }

        public SpongeSize(int i7, int i8) {
            this.width = i7;
            this.height = i8;
        }

        public SpongeSize(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String[] strArrSplit = str.split("x");
            if (strArrSplit.length != 2) {
                BLog.e("SpongeSize", "construct spongeSize fail");
            } else {
                this.width = Integer.parseInt(strArrSplit[0]);
                this.height = Integer.parseInt(strArrSplit[1]);
            }
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            SpongeSize spongeSize = (SpongeSize) obj;
            return (this.width * this.height) - (spongeSize.width * spongeSize.height);
        }

        public boolean equals(SpongeSize spongeSize) {
            return this.width == spongeSize.width && this.height == spongeSize.height;
        }

        public boolean equals(Object obj) {
            boolean z6 = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SpongeSize spongeSize = (SpongeSize) obj;
            if (this.width != spongeSize.width || this.height != spongeSize.height) {
                z6 = false;
            }
            return z6;
        }

        public int getHeight() {
            return this.height;
        }

        public String getString() {
            return this.width + "x" + this.height;
        }

        public int getWidth() {
            return this.width;
        }

        @RequiresApi(api = 19)
        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.width), Integer.valueOf(this.height));
        }

        public void setHeight(int i7) {
            this.height = i7;
        }

        public void setWidth(int i7) {
            this.width = i7;
        }
    }

    public String getFlashMode() {
        return this.flashMode;
    }

    public String getFocusMode() {
        return this.focusMode;
    }

    public int getFps() {
        return this.fps;
    }

    public ICameraRawDataListener getFrameRawDataListener() {
        return this.mFrameRawDataListener;
    }

    public int getmDisplayRotation() {
        return this.mDisplayRotation;
    }

    public SpongeSize getmPreviewSize() {
        return this.mPreviewSize;
    }

    public SurfaceTexture getmTexture() {
        return this.mTexture;
    }

    public boolean isFrontCamera() {
        return this.isFrontCamera;
    }

    public boolean isNeedTexture() {
        return this.isNeedTexture;
    }

    public void setFlashMode(String str) {
        this.flashMode = str;
    }

    public void setFocusMode(String str) {
        this.focusMode = str;
    }

    public void setFps(int i7) {
        this.fps = i7;
    }

    public void setFrameRawDataListener(ICameraRawDataListener iCameraRawDataListener) {
        this.mFrameRawDataListener = iCameraRawDataListener;
    }

    public void setFrontCamera(boolean z6) {
        this.isFrontCamera = z6;
    }

    public void setNeedTexture(boolean z6) {
        this.isNeedTexture = z6;
    }

    public void setmDisplayRotation(int i7) {
        this.mDisplayRotation = i7;
    }

    public void setmPreviewSize(SpongeSize spongeSize) {
        this.mPreviewSize = spongeSize;
    }

    public void setmTexture(SurfaceTexture surfaceTexture) {
        this.mTexture = surfaceTexture;
    }
}
