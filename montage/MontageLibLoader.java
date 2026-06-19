package com.bilibili.montage;

import G.p;
import G0.b;
import android.text.TextUtils;
import android.util.Log;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticOutline0;
import androidx.transition.x;
import cn.com.chinatelecom.account.api.d.m;
import com.bilibili.app.producers.ability.l0;
import com.bilibili.aurorasdk.AuroraAssetsChecker;
import com.bilibili.aurorasdk.LibraryLoadCheckResult;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/MontageLibLoader.class */
public class MontageLibLoader {
    private static final String TAG = "MontageLibLoader";
    private static String audioEffectLibraryPath;
    private static String cvLibraryPath;
    private static String ffmpegLibraryPath;
    private static String jpegLibraryPath;
    private static String libraryPath;
    private static String montageLibraryPath;
    private static String pngLibraryPath;
    private static String protobufLibraryPath;

    public static List<String> checkLibrary() {
        ArrayList arrayList = new ArrayList();
        for (String str : new ArrayList(Arrays.asList(C8770a.a(new StringBuilder(), protobufLibraryPath, "/libprotobuf-lite.so"), C8770a.a(new StringBuilder(), cvLibraryPath, "/libbl_mobile.so"), C8770a.a(new StringBuilder(), jpegLibraryPath, "/libbmm_jpeg.so"), C8770a.a(new StringBuilder(), pngLibraryPath, "/libpng.so"), C8770a.a(new StringBuilder(), audioEffectLibraryPath, "/libaudio-effect-android.so"), C8770a.a(new StringBuilder(), montageLibraryPath, "/libmontage.so")))) {
            if (!m.b(str)) {
                arrayList.add(str);
            }
        }
        LibraryLoadCheckResult libraryLoadCheckResultCheckAllLibsExistenceForPink = AuroraAssetsChecker.checkAllLibsExistenceForPink();
        if (!libraryLoadCheckResultCheckAllLibsExistenceForPink.getStatus()) {
            arrayList.add(libraryLoadCheckResultCheckAllLibsExistenceForPink.getMessage());
        }
        return arrayList;
    }

    public static String getAudioEffectLibraryPath() {
        return audioEffectLibraryPath;
    }

    public static String getCvLibraryPath() {
        return cvLibraryPath;
    }

    public static String getFfmpegLibraryPath() {
        return ffmpegLibraryPath;
    }

    public static String getJpegLibraryPath() {
        return jpegLibraryPath;
    }

    public static String getLibraryPath() {
        return libraryPath;
    }

    public static String getMontageLibraryPath() {
        return montageLibraryPath;
    }

    public static String getPngLibraryPath() {
        return pngLibraryPath;
    }

    public static String getProtobufLibraryPath() {
        return protobufLibraryPath;
    }

    public static MontageLoaderStatus loadAudioEffectLibrary(String str) {
        return loadLibraryWithPath(audioEffectLibraryPath, str);
    }

    public static MontageLoaderStatus loadCVLibrary(String str) {
        return loadLibraryWithPath(cvLibraryPath, str);
    }

    public static MontageLoaderStatus loadFfmpegLibrary(String str) {
        return loadLibraryWithPath(ffmpegLibraryPath, str);
    }

    public static MontageLoaderStatus loadJpegLibrary(String str) {
        return loadLibraryWithPath(jpegLibraryPath, str);
    }

    public static MontageLoaderStatus loadLibrary(String str) {
        return loadLibraryWithPath(libraryPath, str);
    }

    public static MontageLoaderStatus loadLibraryWithPath(String str, String str2) {
        MontageLoaderStatus montageLoaderStatus = new MontageLoaderStatus(0, "");
        if (TextUtils.isEmpty(str)) {
            try {
                System.loadLibrary(str2);
            } catch (Throwable th) {
                montageLoaderStatus.errorType = 1;
                montageLoaderStatus.errorDetails = CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticOutline0.m(th, l0.a("loadLibrary ", str2, " fail! Error: "));
                Log.e(TAG, montageLoaderStatus.errorDetails);
            }
        } else {
            try {
                System.load(str + "lib" + str2 + ".so");
            } catch (Throwable th2) {
                StringBuilder sbA = b.a("loadLibrary ", str, "lib", str2, ".so fail! Error: ");
                sbA.append(th2.getMessage());
                String string = sbA.toString();
                Log.e(TAG, string);
                try {
                    System.loadLibrary(str2);
                } catch (Throwable th3) {
                    montageLoaderStatus.errorType = 1;
                    montageLoaderStatus.errorDetails = CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticOutline0.m(th3, x.a(string, ". loadLibrary lib", str2, ".so fail! Error: "));
                    Log.e(TAG, montageLoaderStatus.errorDetails);
                }
            }
        }
        return montageLoaderStatus;
    }

    public static MontageLoaderStatus loadMontageLibrary(String str) {
        return loadLibraryWithPath(montageLibraryPath, str);
    }

    public static MontageLoaderStatus loadPngLibrary(String str) {
        return loadLibraryWithPath(pngLibraryPath, str);
    }

    public static MontageLoaderStatus loadProtobufLibrary(String str) {
        return loadLibraryWithPath(protobufLibraryPath, str);
    }

    public static void setAudioEffectLibraryPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = File.separator;
        if (str.endsWith(str2)) {
            audioEffectLibraryPath = str;
        } else {
            audioEffectLibraryPath = p.a(str, str2);
        }
    }

    public static void setCVLibraryPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = File.separator;
        if (str.endsWith(str2)) {
            cvLibraryPath = str;
        } else {
            cvLibraryPath = p.a(str, str2);
        }
    }

    public static void setFfmpegLibraryPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = File.separator;
        if (str.endsWith(str2)) {
            ffmpegLibraryPath = str;
        } else {
            ffmpegLibraryPath = p.a(str, str2);
        }
    }

    public static void setJpegLibraryPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = File.separator;
        if (str.endsWith(str2)) {
            jpegLibraryPath = str;
        } else {
            jpegLibraryPath = p.a(str, str2);
        }
    }

    public static void setLibraryPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = File.separator;
        if (str.endsWith(str2)) {
            libraryPath = str;
        } else {
            libraryPath = p.a(str, str2);
        }
    }

    public static void setMontageLibraryPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = File.separator;
        if (str.endsWith(str2)) {
            montageLibraryPath = str;
        } else {
            montageLibraryPath = p.a(str, str2);
        }
    }

    public static void setPngLibraryPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = File.separator;
        if (str.endsWith(str2)) {
            pngLibraryPath = str;
        } else {
            pngLibraryPath = p.a(str, str2);
        }
    }

    public static void setProtobufLibraryPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = File.separator;
        if (str.endsWith(str2)) {
            protobufLibraryPath = str;
        } else {
            protobufLibraryPath = p.a(str, str2);
        }
    }
}
