package com.bilibili.mobile;

import android.content.res.AssetManager;
import com.bilibili.mobile.model.BLMobileLightResult;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mobile/BLMobileLightNative.class */
public class BLMobileLightNative {
    private static final String TAG = "BLMobileLightNative";
    private long nativeLightHandle;

    static {
        BLLibraryLoader.loadBLLibrary();
    }

    public native int createInstance(String str);

    public native int createInstanceFromAssetFile(String str, AssetManager assetManager);

    public native void destroyInstance();

    public native BLMobileLightResult lightestimation(byte[] bArr, int i7, int i8, int i9);
}
