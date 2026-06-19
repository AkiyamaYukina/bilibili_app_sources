package com.bilibili.montage.utils;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.LruCache;
import com.bilibili.montage.avutil.LogSinker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/utils/MontageFileUtils.class */
public final class MontageFileUtils {
    private static final int FILE_READ_ONLY = 0;
    private static final int FILE_READ_WRITE = 2;
    private static final int FILE_WRITE_ONLY = 1;
    private static final String TAG = "MontageFileUtils";
    private static volatile Context sAppContext;
    private static final LruCache<String, Uri> sUriCache = new LruCache<>(2000);

    private MontageFileUtils() {
    }

    private static Uri getCachedUri(Context context, String str) {
        LruCache<String, Uri> lruCache = sUriCache;
        synchronized (lruCache) {
            Uri uri = lruCache.get(str);
            if (uri != null) {
                return uri;
            }
            Uri fileUri = getFileUri(context, str);
            if (fileUri != null) {
                lruCache.put(str, fileUri);
            }
            return fileUri;
        }
    }

    public static int getFileFd(String str, int i7) {
        if (str == null || str.isEmpty()) {
            LogSinker.e(TAG, "Mon.Java.getFileFd, avFilePath is null");
            return -1;
        }
        if (sAppContext == null) {
            LogSinker.e(TAG, "Mon.Java.getFileFd, sAppContext is null");
            return -1;
        }
        String str2 = "r";
        if (i7 != 0) {
            if (i7 == 1) {
                str2 = "w";
            } else if (i7 != 2) {
                LogSinker.w(TAG, "Invalid file mode: " + i7);
                str2 = "r";
            } else {
                str2 = "rw";
            }
        }
        ParcelFileDescriptor parcelFileDescriptorSafeOpenFD = safeOpenFD(str, str2);
        if (parcelFileDescriptorSafeOpenFD == null) {
            return -1;
        }
        return parcelFileDescriptorSafeOpenFD.detachFd();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ef  */
    /* JADX WARN: Type inference failed for: r0v19, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.net.Uri getFileUri(android.content.Context r9, java.lang.String r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.montage.utils.MontageFileUtils.getFileUri(android.content.Context, java.lang.String):android.net.Uri");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.os.ParcelFileDescriptor safeOpenFD(java.lang.String r7, java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.montage.utils.MontageFileUtils.safeOpenFD(java.lang.String, java.lang.String):android.os.ParcelFileDescriptor");
    }

    public static void setContext(Context context) {
        sAppContext = context;
    }
}
