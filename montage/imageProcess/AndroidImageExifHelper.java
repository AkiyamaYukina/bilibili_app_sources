package com.bilibili.montage.imageProcess;

import android.graphics.Matrix;
import android.media.ExifInterface;
import com.bilibili.montage.avutil.LogSinker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/imageProcess/AndroidImageExifHelper.class */
public class AndroidImageExifHelper {
    private static final String TAG = "AndroidImageExifHelper";
    private Matrix mMatrix;
    private boolean mNeedFlip;
    private boolean mNeedSwap;

    public AndroidImageExifHelper(String str) {
        this.mNeedSwap = false;
        this.mNeedFlip = false;
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
            LogSinker.i(TAG, "AndroidImageExifHelper image orientation" + attributeInt);
            Matrix matrix = new Matrix();
            this.mMatrix = matrix;
            switch (attributeInt) {
                case 2:
                    matrix.postScale(-1.0f, 1.0f);
                    this.mNeedFlip = true;
                    break;
                case 3:
                    matrix.postRotate(180.0f);
                    break;
                case 4:
                    matrix.postScale(1.0f, -1.0f);
                    this.mNeedFlip = true;
                    break;
                case 5:
                    matrix.postScale(-1.0f, 1.0f);
                    this.mMatrix.postRotate(270.0f);
                    this.mNeedSwap = true;
                    this.mNeedFlip = true;
                    break;
                case 6:
                    matrix.postRotate(90.0f);
                    this.mNeedSwap = true;
                    break;
                case 7:
                    matrix.postScale(-1.0f, 1.0f);
                    this.mMatrix.postRotate(90.0f);
                    this.mNeedSwap = true;
                    this.mNeedFlip = true;
                    break;
                case 8:
                    matrix.postRotate(270.0f);
                    this.mNeedSwap = true;
                    break;
                default:
                    this.mMatrix = null;
                    break;
            }
        } catch (Exception e7) {
            this.mMatrix = null;
            LogSinker.e(TAG, "AndroidImageExifHelper: " + e7.getMessage());
        }
    }

    public Matrix getMatrix() {
        return this.mMatrix;
    }

    public boolean isNeedFlip() {
        return this.mNeedFlip;
    }

    public boolean isNeedSwap() {
        return this.mNeedSwap;
    }
}
