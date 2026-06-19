package com.bilibili.playerbizcommon.utils;

import android.graphics.Bitmap;
import com.bilibili.commons.io.IOUtils;
import com.bilibili.droid.thread.HandlerThreads;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/c.class */
public final class c {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/c$a.class */
    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public T f80281a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.bilibili.playerbizcommon.utils.c$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.bilibili.playerbizcommon.utils.c$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [T, java.lang.Exception] */
    public static File a(String str) throws Exception {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ?? obj = new Object();
        ?? obj2 = new Object();
        HandlerThreads.post(3, new b(str, false, obj, obj2, countDownLatch));
        try {
            countDownLatch.await(2000L, TimeUnit.MILLISECONDS);
        } catch (Exception e7) {
            obj2.f80281a = e7;
        }
        Throwable th = (Throwable) obj2.f80281a;
        if (th == null) {
            return (File) obj.f80281a;
        }
        throw th;
    }

    public static boolean b(@NotNull Bitmap bitmap, @Nullable String str) throws Throwable {
        FileOutputStream fileOutputStream;
        boolean z6 = false;
        if (str == null) {
            return false;
        }
        File file = new File(str);
        try {
            File parentFile = file.getParentFile();
            if (parentFile == null || !parentFile.exists()) {
                file.getParentFile().mkdirs();
            }
            fileOutputStream = new FileOutputStream(file);
        } catch (IOException e7) {
            fileOutputStream = null;
        } catch (Throwable th) {
            th = th;
            fileOutputStream = null;
        }
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            IOUtils.closeQuietly(fileOutputStream);
            z6 = true;
        } catch (IOException e8) {
            IOUtils.closeQuietly(fileOutputStream);
        } catch (Throwable th2) {
            th = th2;
            IOUtils.closeQuietly(fileOutputStream);
            throw th;
        }
        return z6;
    }
}
