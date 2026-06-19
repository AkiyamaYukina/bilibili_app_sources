package com.bilibili.studio.editor.moudle.intelligence.frame.core;

import android.app.Application;
import android.graphics.Bitmap;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.bilibili.base.BiliContext;
import com.bilibili.commons.tuple.Pair;
import com.bilibili.lib.blkv.BLKV;
import com.bilibili.studio.editor.moudle.intelligence.frame.cache.FrameCacheManager;
import com.bilibili.studio.editor.moudle.intelligence.frame.data.AiFrameConfig;
import i5.d;
import java.io.File;
import lz0.b;
import lz0.c;
import pz0.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/core/FrameCore.class */
@Keep
public class FrameCore {
    private static final String CACHE_DIR = "edit_frame_cache";
    private static final long CACHE_SIZE;
    public static final int DEFAULT_TIME = -1;
    private static final String KEY_UPPER_CLEAR_CACHE = "key_upper_clear_cache";
    private static FrameCore sFrameCore;
    private volatile FrameCacheManager cacheManager;
    private final b frameBitmapAcquirer = new Object();
    private final c frameFileAcquirer = new Object();

    static {
        AiFrameConfig.CacheConfig cacheConfig;
        AiFrameConfig aiFrameConfigA = a.a();
        CACHE_SIZE = ((aiFrameConfigA == null || (cacheConfig = aiFrameConfigA.cacheConfig) == null) ? 100L : cacheConfig.cacheSize) * 1048576;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, lz0.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, lz0.c] */
    private FrameCore() {
    }

    public static FrameCore getInstance() {
        if (sFrameCore == null) {
            synchronized (FrameCore.class) {
                try {
                    sFrameCore = new FrameCore();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sFrameCore;
    }

    private void interceptAfterInit() {
        boolean zIsClearedCache = isClearedCache();
        if (this.cacheManager == null || zIsClearedCache) {
            return;
        }
        this.cacheManager.deleteDiskCache();
        updateClearedCacheFlag();
    }

    private boolean isClearedCache() {
        Application application = BiliContext.application();
        if (application == null) {
            return true;
        }
        return BLKV.getBLSharedPreferences(application, "biliupper", false, 0).getBoolean(KEY_UPPER_CLEAR_CACHE, false);
    }

    private void updateClearedCacheFlag() {
        Application application = BiliContext.application();
        if (application == null) {
            return;
        }
        BLKV.getBLSharedPreferences(application, "biliupper", false, 0).edit().putBoolean(KEY_UPPER_CLEAR_CACHE, true).apply();
    }

    @NonNull
    public Pair<File, Boolean> getGifFrame(String str, int i7, int i8, String str2) throws Throwable {
        boolean z6;
        init();
        c cVar = this.frameFileAcquirer;
        FrameCacheManager frameCacheManager = this.cacheManager;
        cVar.getClass();
        File fileC = c.c(frameCacheManager, str, str2);
        if (fileC == null) {
            Bitmap bitmapA = CA0.b.a(i7, i8, 0L, str);
            File file = fileC;
            if (bitmapA != null) {
                file = fileC;
                if (!bitmapA.isRecycled()) {
                    if (c.d(bitmapA, str2)) {
                        fileC = new File(str2);
                        frameCacheManager.putDiskCache(str, fileC);
                    }
                    bitmapA.recycle();
                    file = fileC;
                }
            }
            z6 = false;
            fileC = file;
        } else {
            z6 = true;
        }
        return Pair.of(fileC, Boolean.valueOf(z6));
    }

    @NonNull
    public Pair<Bitmap, Boolean> getImageFrame(String str, int i7, int i8) {
        boolean z6;
        Bitmap bitmap;
        init();
        b bVar = this.frameBitmapAcquirer;
        FrameCacheManager frameCacheManager = this.cacheManager;
        bVar.getClass();
        Bitmap diskCache = frameCacheManager.getDiskCache(str);
        if (diskCache == null) {
            Bitmap bitmapA = lz0.a.a(i7, i8, str);
            synchronized (bVar) {
                if (bitmapA != null) {
                    if (!bitmapA.isRecycled()) {
                        frameCacheManager.putDiskCache(str, bitmapA);
                    }
                }
            }
            z6 = false;
            bitmap = bitmapA;
        } else {
            z6 = true;
            bitmap = diskCache;
        }
        return Pair.of(bitmap, Boolean.valueOf(z6));
    }

    @NonNull
    public Pair<File, Boolean> getImageFrame(String str, int i7, int i8, String str2) throws Throwable {
        boolean z6;
        File file;
        init();
        c cVar = this.frameFileAcquirer;
        FrameCacheManager frameCacheManager = this.cacheManager;
        cVar.getClass();
        File fileC = c.c(frameCacheManager, str, str2);
        if (fileC == null) {
            Bitmap bitmapA = lz0.a.a(i7, i8, str);
            file = fileC;
            if (bitmapA != null) {
                file = fileC;
                if (!bitmapA.isRecycled()) {
                    file = fileC;
                    if (c.d(bitmapA, str2)) {
                        file = new File(str2);
                        frameCacheManager.putDiskCache(str, file);
                    }
                    bitmapA.recycle();
                }
            }
            z6 = false;
        } else {
            z6 = true;
            file = fileC;
        }
        return Pair.of(file, Boolean.valueOf(z6));
    }

    @NonNull
    public Pair<Bitmap, Boolean> getVideoFrame(String str, long j7, int i7, int i8) {
        boolean z6;
        Bitmap bitmapB;
        init();
        b bVar = this.frameBitmapAcquirer;
        FrameCacheManager frameCacheManager = this.cacheManager;
        bVar.getClass();
        long jRound = -1;
        if (j7 != -1) {
            jRound = Math.round(((j7 * 1.0f) / 1000.0f) / 1000.0f);
        }
        String strA = d.a(jRound, str, "_");
        Bitmap diskCache = frameCacheManager.getDiskCache(strA);
        if (diskCache == null) {
            bitmapB = lz0.a.b(i7, i8, j7, str);
            synchronized (bVar) {
                if (bitmapB != null) {
                    if (!bitmapB.isRecycled()) {
                        frameCacheManager.putDiskCache(strA, bitmapB);
                    }
                }
            }
            z6 = false;
        } else {
            z6 = true;
            bitmapB = diskCache;
        }
        return Pair.of(bitmapB, Boolean.valueOf(z6));
    }

    @NonNull
    public Pair<File, Boolean> getVideoFrame(String str, long j7, int i7, int i8, String str2) throws Throwable {
        boolean z6;
        File file;
        init();
        c cVar = this.frameFileAcquirer;
        FrameCacheManager frameCacheManager = this.cacheManager;
        cVar.getClass();
        long jRound = -1;
        if (j7 != -1) {
            jRound = Math.round(((j7 * 1.0f) / 1000.0f) / 1000.0f);
        }
        String strA = d.a(jRound, str, "_");
        File fileC = c.c(frameCacheManager, strA, str2);
        if (fileC == null) {
            Bitmap bitmapB = lz0.a.b(i7, i8, j7, str);
            file = fileC;
            if (bitmapB != null) {
                file = fileC;
                if (!bitmapB.isRecycled()) {
                    file = fileC;
                    if (c.d(bitmapB, str2)) {
                        file = new File(str2);
                        frameCacheManager.putDiskCache(strA, file);
                    }
                    bitmapB.recycle();
                }
            }
            z6 = false;
        } else {
            z6 = true;
            file = fileC;
        }
        return Pair.of(file, Boolean.valueOf(z6));
    }

    public void init() {
        if (this.cacheManager == null) {
            synchronized (FrameCore.class) {
                try {
                    if (this.cacheManager == null) {
                        this.cacheManager = new FrameCacheManager(BiliContext.application(), CACHE_DIR, CACHE_SIZE);
                    }
                    interceptAfterInit();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
