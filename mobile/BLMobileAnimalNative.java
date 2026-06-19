package com.bilibili.mobile;

import android.content.res.AssetManager;
import com.bilibili.mobile.model.BLAnimalFace;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mobile/BLMobileAnimalNative.class */
public class BLMobileAnimalNative {
    public static final int BL_MOBILE_CAT_DETECT = 1;
    public static final int BL_MOBILE_DOG_DETECT = 16;
    private static final String TAG = "BLMobileAnimalNative";
    private long nativeAnimalHandle;

    static {
        BLLibraryLoader.loadBLLibrary();
    }

    public static native BLAnimalFace[] animalMirror(int i7, BLAnimalFace[] bLAnimalFaceArr, int i8);

    public static native BLAnimalFace[] animalResize(float f7, BLAnimalFace[] bLAnimalFaceArr, int i7);

    public static native BLAnimalFace[] animalRotate(int i7, int i8, int i9, BLAnimalFace[] bLAnimalFaceArr, int i10);

    public native BLAnimalFace[] animalDetect(byte[] bArr, int i7, int i8, int i9, int i10, int i11);

    public native int createInstance(String str, int i7);

    public native int createInstanceFromAssetFile(String str, int i7, AssetManager assetManager);

    public native void destroyInstance();

    public native int reset();

    public native int setParam(int i7, float f7);
}
