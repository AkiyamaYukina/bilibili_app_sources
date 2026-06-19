package com.bilibili.mobile;

import G.p;
import android.text.TextUtils;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mobile/BLLibraryLoader.class */
public class BLLibraryLoader {
    private static String libraryPath;
    private static final Set<String> loadedLibrary = new HashSet();

    public static boolean hasLoaded(String str) {
        return loadedLibrary.contains(str);
    }

    public static void loadBLLibrary() {
        for (int i7 = 0; i7 < 2; i7++) {
            String str = new String[]{"bl_mobile", "blmobile_jni"}[i7];
            if (!hasLoaded(str)) {
                loadLibrary(str);
            }
        }
    }

    public static void loadLibrary(String str) {
        synchronized (BLLibraryLoader.class) {
            try {
                Set<String> set = loadedLibrary;
                if (set.contains(str)) {
                    throw new IllegalStateException("library " + str + " already loaded.");
                }
                if (TextUtils.isEmpty(libraryPath)) {
                    System.loadLibrary(str);
                } else {
                    System.load(libraryPath + "lib" + str + ".so");
                }
                set.add(str);
            } catch (Throwable th) {
                throw th;
            }
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
        loadBLLibrary();
    }
}
