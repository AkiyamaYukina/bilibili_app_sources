package com.bilibili.mobile;

import android.content.res.AssetManager;
import com.bilibili.mobile.model.BLFaceAttribute;
import com.bilibili.mobile.model.BLMobile106;
import com.bilibili.mobile.model.BLMobileFaceInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mobile/BLMobileFaceAttributeNative.class */
public class BLMobileFaceAttributeNative {
    private long nativeHandle;

    static {
        BLLibraryLoader.loadBLLibrary();
    }

    public native int createInstance(String str);

    public native int createInstanceFromAssetFile(String str, AssetManager assetManager);

    public native void destroyInstance();

    public native int detect(byte[] bArr, int i7, int i8, int i9, BLMobile106[] bLMobile106Arr, BLFaceAttribute[] bLFaceAttributeArr);

    public native int detect2(byte[] bArr, int i7, int i8, int i9, BLMobileFaceInfo[] bLMobileFaceInfoArr, BLFaceAttribute[] bLFaceAttributeArr);

    public native int detect_ext(byte[] bArr, int i7, int i8, int i9, BLMobile106[] bLMobile106Arr, float[][] fArr);

    public native int detect_ext2(byte[] bArr, int i7, int i8, int i9, BLMobileFaceInfo[] bLMobileFaceInfoArr, float[][] fArr);
}
