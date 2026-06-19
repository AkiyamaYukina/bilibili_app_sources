package com.bilibili.mediacore.imageProcess;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ImageDecoder;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.os.Build;
import androidx.annotation.Keep;
import com.bilibili.mediacore.avinfo.MontageSize;
import com.bilibili.mediacore.avutil.LogSinker;
import com.bilibili.mediacore.avutil.MontageScaleHelper;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediacore/imageProcess/AndroidImageDecoder.class */
@Keep
public class AndroidImageDecoder {
    private static final String TAG = "AndroidImageDecoder";
    private int height;
    private String imagePath;
    private int limitHeight;
    private int limitWidth;
    private int width;
    private int apiLevel = Build.VERSION.SDK_INT;
    private final int MAX_LONG_EDGE = 1920;
    private final int MAX_SHORT_EDGE = 1080;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediacore/imageProcess/AndroidImageDecoder$a.class */
    public final class a implements ImageDecoder.OnHeaderDecodedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AndroidImageDecoder f65690a;

        public a(AndroidImageDecoder androidImageDecoder) {
            this.f65690a = androidImageDecoder;
        }

        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
        public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            MontageSize montageSizeCalScaleImageSize;
            int i7;
            int width = imageInfo.getSize().getWidth();
            int height = imageInfo.getSize().getHeight();
            imageDecoder.setAllocator(1);
            if (this.f65690a.limitWidth <= 0 || this.f65690a.limitHeight <= 0) {
                LogSinker.d(AndroidImageDecoder.TAG, "AndroidImageDecoder limit to 1080p");
                montageSizeCalScaleImageSize = MontageScaleHelper.calScaleImageSize(width, height, 1920, 1080, true);
            } else {
                LogSinker.d(AndroidImageDecoder.TAG, "AndroidImageDecoder limit to " + this.f65690a.limitWidth + " x " + this.f65690a.limitHeight);
                montageSizeCalScaleImageSize = MontageScaleHelper.calScaleImageSize(width, height, this.f65690a.limitWidth, this.f65690a.limitHeight, false);
            }
            int i8 = montageSizeCalScaleImageSize.width;
            if (i8 <= 0 || (i7 = montageSizeCalScaleImageSize.height) <= 0) {
                return;
            }
            imageDecoder.setTargetSize(i8, i7);
        }
    }

    public AndroidImageDecoder() {
    }

    public AndroidImageDecoder(String str) {
        this.imagePath = str;
    }

    public AndroidImageDecoder(String str, int i7, int i8) {
        this.imagePath = str;
        this.limitWidth = i7;
        this.limitHeight = i8;
    }

    private ByteBuffer decodeImageWithBitmapFactory() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        options.inPreferredConfig = config;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(this.imagePath, options);
        if (this.limitWidth <= 0 || this.limitHeight <= 0) {
            LogSinker.d(TAG, "AndroidImageDecoder limit to 1080p");
            options.inSampleSize = MontageScaleHelper.calculateInSampleSize(options.outWidth, options.outHeight, 1920, 1080, true);
        } else {
            LogSinker.d(TAG, "AndroidImageDecoder limit to " + this.limitWidth + " x " + this.limitHeight);
            options.inSampleSize = MontageScaleHelper.calculateInSampleSize(options.outWidth, options.outHeight, this.limitWidth, this.limitHeight, false);
        }
        options.inJustDecodeBounds = false;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(this.imagePath, options);
        int rotationFromExif = getRotationFromExif(this.imagePath);
        Bitmap bitmapCreateBitmap = bitmapDecodeFile;
        if (rotationFromExif != 0) {
            Matrix matrix = new Matrix();
            matrix.postRotate(rotationFromExif);
            bitmapCreateBitmap = bitmapDecodeFile;
            if (bitmapDecodeFile != null) {
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, true);
            }
        }
        if (bitmapCreateBitmap == null) {
            LogSinker.e(TAG, "Failed to decode resource - " + this.imagePath + "inSampleSize is" + options.inSampleSize);
            return null;
        }
        Bitmap bitmapCreateBitmap2 = bitmapCreateBitmap;
        if (config != bitmapCreateBitmap.getConfig()) {
            bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), config);
            new Canvas(bitmapCreateBitmap2).drawBitmap(bitmapCreateBitmap, new Matrix(), null);
            bitmapCreateBitmap.recycle();
            if (bitmapCreateBitmap2 == null) {
                LogSinker.e(TAG, "Failed to drawBitmap - ");
                return null;
            }
        }
        this.width = bitmapCreateBitmap2.getWidth();
        this.height = bitmapCreateBitmap2.getHeight();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bitmapCreateBitmap2.getByteCount());
        byteBufferAllocateDirect.rewind();
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        bitmapCreateBitmap2.copyPixelsToBuffer(byteBufferAllocateDirect);
        bitmapCreateBitmap2.recycle();
        byteBufferAllocateDirect.rewind();
        return byteBufferAllocateDirect;
    }

    private ByteBuffer decodeImageWithImageDecoder() {
        try {
            Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(new File(this.imagePath)), new a(this));
            if (bitmapDecodeBitmap == null) {
                LogSinker.e(TAG, "Failed to decode resource - " + this.imagePath);
                return null;
            }
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            Bitmap bitmapCreateBitmap = bitmapDecodeBitmap;
            if (config != bitmapDecodeBitmap.getConfig()) {
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeBitmap.getWidth(), bitmapDecodeBitmap.getHeight(), config);
                new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeBitmap, new Matrix(), null);
                bitmapDecodeBitmap.recycle();
                if (bitmapCreateBitmap == null) {
                    LogSinker.e(TAG, "Failed to drawBitmap - ");
                    return null;
                }
            }
            this.width = bitmapCreateBitmap.getWidth();
            this.height = bitmapCreateBitmap.getHeight();
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bitmapCreateBitmap.getByteCount());
            byteBufferAllocateDirect.rewind();
            byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
            bitmapCreateBitmap.copyPixelsToBuffer(byteBufferAllocateDirect);
            bitmapCreateBitmap.recycle();
            byteBufferAllocateDirect.rewind();
            return byteBufferAllocateDirect;
        } catch (Exception e7) {
            LogSinker.e(TAG, "Fail to Decode Image， Exception" + e7);
            e7.printStackTrace();
            return null;
        }
    }

    private static int getRotationFromExif(String str) {
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt != 6) {
                return attributeInt != 8 ? 0 : 270;
            }
            return 90;
        } catch (IOException e7) {
            e7.printStackTrace();
            return 0;
        }
    }

    public ByteBuffer decodeImage() {
        ByteBuffer byteBufferDecodeImageWithBitmapFactory;
        if (this.apiLevel >= 28) {
            ByteBuffer byteBufferDecodeImageWithImageDecoder = decodeImageWithImageDecoder();
            byteBufferDecodeImageWithBitmapFactory = byteBufferDecodeImageWithImageDecoder;
            if (byteBufferDecodeImageWithImageDecoder == null) {
                LogSinker.w(TAG, "decodeImageWithImageDecoder error fallback to decodeImageWithBitmapFactory, image path is " + this.imagePath);
                byteBufferDecodeImageWithBitmapFactory = decodeImageWithBitmapFactory();
            }
        } else {
            byteBufferDecodeImageWithBitmapFactory = decodeImageWithBitmapFactory();
        }
        return byteBufferDecodeImageWithBitmapFactory;
    }

    public int getHeight() {
        return this.height;
    }

    public void getImageInfo() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(this.imagePath, options);
        int rotationFromExif = getRotationFromExif(this.imagePath);
        if (90 == rotationFromExif || 270 == rotationFromExif) {
            this.width = options.outHeight;
            this.height = options.outWidth;
        } else {
            this.width = options.outWidth;
            this.height = options.outHeight;
        }
    }

    public int getWidth() {
        return this.width;
    }
}
