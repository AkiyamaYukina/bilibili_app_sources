package com.bilibili.live.streaming.source;

import android.media.Image;
import android.media.ImageReader;
import android.opengl.GLES31;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.bilibili.live.streaming.gl.BGLDrawer;
import com.bilibili.live.streaming.gl.BGLException;
import com.bilibili.live.streaming.gl.BGLTexture;
import com.bilibili.live.streaming.gl.BGLUtil;
import com.bilibili.live.streaming.source.CameraGlobalConfig;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/CameraP010Receiver.class */
public final class CameraP010Receiver extends CameraReceiver {

    @Nullable
    private Image mCameraImage;

    @NotNull
    private final ImageReader mImageReader;

    @Nullable
    private BGLTexture mUVTex;

    @Nullable
    private BGLTexture mYTex;

    public CameraP010Receiver(int i7, int i8, @NotNull Handler handler) {
        super(i7, i8, handler);
        ImageReader imageReaderNewInstance = ImageReader.newInstance(getMWidth(), getMHeight(), 54, 2);
        imageReaderNewInstance.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener(this) { // from class: com.bilibili.live.streaming.source.CameraP010Receiver$1$1
            final CameraP010Receiver this$0;

            {
                this.this$0 = this;
            }

            @Override // android.media.ImageReader.OnImageAvailableListener
            public void onImageAvailable(ImageReader imageReader) {
                CameraP010Receiver cameraP010Receiver = this.this$0;
                synchronized (cameraP010Receiver) {
                    Image mCameraImage = cameraP010Receiver.getMCameraImage();
                    Image imageAcquireNextImage = null;
                    if (mCameraImage != null) {
                        mCameraImage.close();
                        cameraP010Receiver.setMCameraImage(null);
                    }
                    if (imageReader != null) {
                        imageAcquireNextImage = imageReader.acquireNextImage();
                    }
                    cameraP010Receiver.setMCameraImage(imageAcquireNextImage);
                    Image mCameraImage2 = cameraP010Receiver.getMCameraImage();
                    if (mCameraImage2 != null) {
                        cameraP010Receiver.setMWidth(mCameraImage2.getWidth());
                        cameraP010Receiver.setMHeight(mCameraImage2.getHeight());
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }, new Handler(Looper.myLooper()));
        this.mImageReader = imageReaderNewInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void close$lambda$3$lambda$2$lambda$1(BGLTexture bGLTexture, BGLTexture bGLTexture2) {
        if (bGLTexture != null) {
            bGLTexture.destroy();
        }
        if (bGLTexture2 != null) {
            bGLTexture2.destroy();
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.mImageReader.close();
        final BGLTexture bGLTexture = this.mYTex;
        final BGLTexture bGLTexture2 = this.mUVTex;
        getMHandler().post(new Runnable(bGLTexture, bGLTexture2) { // from class: com.bilibili.live.streaming.source.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BGLTexture f65379a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BGLTexture f65380b;

            {
                this.f65379a = bGLTexture;
                this.f65380b = bGLTexture2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CameraP010Receiver.close$lambda$3$lambda$2$lambda$1(this.f65379a, this.f65380b);
            }
        });
        this.mYTex = null;
        this.mUVTex = null;
    }

    @Nullable
    public final Image getMCameraImage() {
        return this.mCameraImage;
    }

    @NotNull
    public final ImageReader getMImageReader() {
        return this.mImageReader;
    }

    @Nullable
    public final BGLTexture getMUVTex() {
        return this.mUVTex;
    }

    @Nullable
    public final BGLTexture getMYTex() {
        return this.mYTex;
    }

    @Override // com.bilibili.live.streaming.source.ICameraReceiver
    public boolean render(@NotNull BGLDrawer bGLDrawer) {
        BGLTexture bGLTexture;
        synchronized (this) {
            BGLTexture bGLTexture2 = this.mYTex;
            if (bGLTexture2 == null || (bGLTexture = this.mUVTex) == null) {
                return false;
            }
            CameraGlobalConfig.Companion companion = CameraGlobalConfig.Companion;
            bGLDrawer.drawP010TexMix(bGLTexture2, bGLTexture, 1.0f, companion.getYuvMatrix() == 0 ? 601 : companion.getYuvMatrix() == 1 ? 709 : 2020, companion.getRange());
            return true;
        }
    }

    public final void setMCameraImage(@Nullable Image image) {
        this.mCameraImage = image;
    }

    public final void setMUVTex(@Nullable BGLTexture bGLTexture) {
        this.mUVTex = bGLTexture;
    }

    public final void setMYTex(@Nullable BGLTexture bGLTexture) {
        this.mYTex = bGLTexture;
    }

    @Override // com.bilibili.live.streaming.source.ICameraReceiver
    @NotNull
    public Surface surface() {
        return this.mImageReader.getSurface();
    }

    @Override // com.bilibili.live.streaming.source.ICameraReceiver
    public void tick() {
        BGLTexture bGLTextureCreateTex2D;
        BGLTexture bGLTexture;
        BGLTexture bGLTexture2;
        synchronized (this) {
            Image image = this.mCameraImage;
            if (image != null) {
                BGLTexture bGLTexture3 = this.mYTex;
                if (bGLTexture3 == null || bGLTexture3 == null || bGLTexture3.getWidth() != image.getWidth() || (bGLTexture2 = this.mYTex) == null || bGLTexture2.getHeight() != image.getHeight()) {
                    setMWidth(image.getWidth());
                    setMHeight(image.getHeight());
                    BGLTexture bGLTexture4 = this.mYTex;
                    if (bGLTexture4 != null) {
                        bGLTexture4.destroy();
                    }
                    this.mYTex = null;
                    bGLTextureCreateTex2D = BGLTexture.createTex2D();
                    this.mYTex = bGLTextureCreateTex2D;
                    try {
                        bGLTextureCreateTex2D.setNearestSampler();
                        bGLTextureCreateTex2D.setRepeatWrap();
                        bGLTextureCreateTex2D.bind();
                        GLES31.glTexImage2D(3553, 0, 33332, getMWidth(), getMHeight(), 0, 36244, 5123, null);
                        BGLUtil.logGLErrAndThrow("Camera2Source", BGLException.ID.TEXTURE_ERROR, "Fail to define Y Planar Texture");
                        bGLTextureCreateTex2D.setSize(getMWidth(), getMHeight());
                    } finally {
                    }
                }
                BGLTexture bGLTexture5 = this.mUVTex;
                if (bGLTexture5 == null || bGLTexture5 == null || bGLTexture5.getWidth() != image.getWidth() / 2 || (bGLTexture = this.mUVTex) == null || bGLTexture.getHeight() != image.getHeight() / 2) {
                    BGLTexture bGLTexture6 = this.mUVTex;
                    if (bGLTexture6 != null) {
                        bGLTexture6.destroy();
                    }
                    this.mUVTex = null;
                    bGLTextureCreateTex2D = BGLTexture.createTex2D();
                    this.mUVTex = bGLTextureCreateTex2D;
                    try {
                        bGLTextureCreateTex2D.setNearestSampler();
                        bGLTextureCreateTex2D.setRepeatWrap();
                        bGLTextureCreateTex2D.bind();
                        GLES31.glTexImage2D(3553, 0, 33338, getMWidth() / 2, getMHeight() / 2, 0, 33320, 5123, null);
                        BGLUtil.logGLErrAndThrow("Camera2Source", BGLException.ID.TEXTURE_ERROR, "Fail to define UV Planar Texture");
                        bGLTextureCreateTex2D.setSize(getMWidth() / 2, getMHeight() / 2);
                    } finally {
                    }
                }
                Image.Plane plane = image.getPlanes()[0];
                BGLTexture bGLTexture7 = this.mYTex;
                if (bGLTexture7 != null) {
                    try {
                        bGLTexture7.bind();
                        GLES31.glPixelStorei(3314, plane.getRowStride() / 2);
                        BGLException.ID id = BGLException.ID.TEXTURE_ERROR;
                        BGLUtil.logGLErrAndThrow("Camera2Source", id, "Fail to set unpack row length to " + (plane.getRowStride() / 2));
                        plane.getBuffer().position(0);
                        GLES31.glTexSubImage2D(3553, 0, 0, 0, getMWidth(), getMHeight(), 36244, 5123, plane.getBuffer());
                        BGLUtil.logGLErrAndThrow("Camera2Source", id, "Fail to upload Y Planar");
                        GLES31.glPixelStorei(3314, 0);
                        BGLUtil.logGLErrAndThrow("Camera2Source", id, "Fail to set unpack row length to 0");
                        bGLTexture7.unbind();
                    } catch (Throwable th) {
                        bGLTexture7.unbind();
                        throw th;
                    }
                }
                Image.Plane plane2 = image.getPlanes()[1];
                BGLTexture bGLTexture8 = this.mUVTex;
                if (bGLTexture8 != null) {
                    try {
                        bGLTexture8.bind();
                        GLES31.glPixelStorei(3314, plane2.getRowStride() / 4);
                        BGLException.ID id2 = BGLException.ID.TEXTURE_ERROR;
                        BGLUtil.logGLErrAndThrow("Camera2Source", id2, "Fail to set unpack row length to " + (plane2.getRowStride() / 4));
                        plane2.getBuffer().position(0);
                        GLES31.glTexSubImage2D(3553, 0, 0, 0, getMWidth() / 2, getMHeight() / 2, 33320, 5123, plane2.getBuffer());
                        BGLUtil.logGLErrAndThrow("Camera2Source", id2, "Fail to upload UV Planar");
                        GLES31.glPixelStorei(3314, 0);
                        BGLUtil.logGLErrAndThrow("Camera2Source", id2, "Fail to set unpack row length to 0");
                        bGLTexture8.unbind();
                    } catch (Throwable th2) {
                        bGLTexture8.unbind();
                        throw th2;
                    }
                }
                image.close();
                this.mCameraImage = null;
            }
        }
    }
}
