package com.bilibili.mobile;

import android.content.res.AssetManager;
import com.bilibili.mobile.model.BLMobileFaceMeshArgs;
import com.bilibili.mobile.model.BLMobileFaceMeshResult;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mobile/BLMobileFaceMeshNative.class */
public class BLMobileFaceMeshNative {
    private static final String TAG = "BLMobileAvatarNative";
    private long nativeFaceMeshHandle;

    static {
        BLLibraryLoader.loadBLLibrary();
    }

    public native int createInstance(String str);

    public native int createInstanceFromAssetFile(String str, AssetManager assetManager);

    public native void destroyInstance();

    public native BLMobileFaceMeshResult faceMeshDetect(BLMobileFaceMeshArgs bLMobileFaceMeshArgs, int i7);

    public native long getFaceMeshDetectConfig();
}
