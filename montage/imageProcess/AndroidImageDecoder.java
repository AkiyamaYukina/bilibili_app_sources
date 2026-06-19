package com.bilibili.montage.imageProcess;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ImageDecoder;
import android.graphics.Matrix;
import android.os.Build;
import android.support.v4.media.a;
import com.bilibili.montage.avinfo.MontageSize;
import com.bilibili.montage.avutil.LogSinker;
import com.bilibili.montage.avutil.MontageScaleHelper;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/imageProcess/AndroidImageDecoder.class */
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
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            options.inPreferredConfig = config;
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(this.imagePath, options);
            LogSinker.i(TAG, "AndroidImageDecoder(BitmapFactory) image size: " + options.outWidth + "X" + options.outHeight);
            if (this.limitWidth <= 0 || this.limitHeight <= 0) {
                LogSinker.i(TAG, "AndroidImageDecoder limit to 1080p");
                options.inSampleSize = MontageScaleHelper.calculateInSampleSize(options.outWidth, options.outHeight, 1920, 1080, true);
            } else {
                LogSinker.i(TAG, "AndroidImageDecoder limit to " + this.limitWidth + " x " + this.limitHeight);
                options.inSampleSize = MontageScaleHelper.calculateInSampleSize(options.outWidth, options.outHeight, this.limitWidth, this.limitHeight, false);
            }
            options.inJustDecodeBounds = false;
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(this.imagePath, options);
            AndroidImageExifHelper androidImageExifHelper = new AndroidImageExifHelper(this.imagePath);
            Bitmap bitmapCreateBitmap = bitmapDecodeFile;
            if (androidImageExifHelper.getMatrix() != null) {
                bitmapCreateBitmap = bitmapDecodeFile;
                if (bitmapDecodeFile != null) {
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), androidImageExifHelper.getMatrix(), true);
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
        } catch (Exception e7) {
            LogSinker.e(TAG, "Fail to Decode Image， Exception" + e7);
            e7.printStackTrace();
            return null;
        }
    }

    private ByteBuffer decodeImageWithImageDecoder() {
        try {
            Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(new File(this.imagePath)), new ImageDecoder.OnHeaderDecodedListener(this) { // from class: com.bilibili.montage.imageProcess.AndroidImageDecoder.1
                final AndroidImageDecoder this$0;

                {
                    this.this$0 = this;
                }

                @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                    MontageSize montageSizeCalScaleImageSize;
                    int i7;
                    String mimeType = imageInfo.getMimeType();
                    if ((mimeType.equals("image/heic") || mimeType.equals("image/heif")) && new AndroidImageExifHelper(this.this$0.imagePath).isNeedFlip()) {
                        throw new IllegalArgumentException(a.a("image mimetype = ", mimeType, ", and need flip, give up ImageDecoder"));
                    }
                    int width = imageInfo.getSize().getWidth();
                    int height = imageInfo.getSize().getHeight();
                    imageDecoder.setAllocator(1);
                    LogSinker.i(AndroidImageDecoder.TAG, "AndroidImageDecoder(ImageDecoder) image size: " + width + "X" + height);
                    if (this.this$0.limitWidth <= 0 || this.this$0.limitHeight <= 0) {
                        LogSinker.i(AndroidImageDecoder.TAG, "AndroidImageDecoder limit to 1080p");
                        montageSizeCalScaleImageSize = MontageScaleHelper.calScaleImageSize(width, height, 1920, 1080, true);
                    } else {
                        LogSinker.i(AndroidImageDecoder.TAG, "AndroidImageDecoder limit to " + this.this$0.limitWidth + " x " + this.this$0.limitHeight);
                        montageSizeCalScaleImageSize = MontageScaleHelper.calScaleImageSize(width, height, this.this$0.limitWidth, this.this$0.limitHeight, false);
                    }
                    int i8 = montageSizeCalScaleImageSize.width;
                    if (i8 <= 0 || (i7 = montageSizeCalScaleImageSize.height) <= 0) {
                        return;
                    }
                    imageDecoder.setTargetSize(i8, i7);
                }
            });
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
        if (new AndroidImageExifHelper(this.imagePath).isNeedSwap()) {
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
