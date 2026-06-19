package com.bilibili.montage;

import android.util.Log;
import com.bilibili.aurorasdk.AuroraEngine;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/SystemLoader.class */
public class SystemLoader {
    private static final String TAG = "MontageSystemLoader";
    private static MontageLoaderStatus sLoaderStatus = new MontageLoaderStatus(0, "");

    static {
        loadMontageSDKLibraries();
    }

    private SystemLoader() {
    }

    public static MontageLoaderStatus getLoaderStatus() {
        MontageLoaderStatus montageLoaderStatus = sLoaderStatus;
        return new MontageLoaderStatus(montageLoaderStatus.errorType, montageLoaderStatus.errorDetails);
    }

    public static MontageLoaderStatus loadMontageSDKLibraries() {
        StringBuilder sb = new StringBuilder();
        try {
            AuroraEngine.loadAuroraSDKLibrariesProactively();
        } catch (Throwable th) {
            String str = "AuroraEngine loadAuroraSDKLibrariesProactively fail! Error: " + th.getMessage();
            Log.e(TAG, str);
            sb.append(str);
        }
        sb.append(MontageLibLoader.loadProtobufLibrary("protobuf-lite"));
        sb.append(MontageLibLoader.loadCVLibrary("bl_mobile"));
        sb.append(MontageLibLoader.loadJpegLibrary("bmm_jpeg"));
        sb.append(MontageLibLoader.loadPngLibrary("png"));
        sb.append(MontageLibLoader.loadFfmpegLibrary("ijkffmpeg"));
        sb.append(MontageLibLoader.loadAudioEffectLibrary("audio-effect-android"));
        sLoaderStatus = MontageLibLoader.loadMontageLibrary("montage");
        StringBuilder sb2 = new StringBuilder();
        MontageLoaderStatus montageLoaderStatus = sLoaderStatus;
        sb2.append(montageLoaderStatus.errorDetails);
        sb2.append(sb.toString());
        montageLoaderStatus.errorDetails = sb2.toString();
        return sLoaderStatus;
    }

    public static void setup() {
    }
}
