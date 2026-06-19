package com.bilibili.studio.videoeditor.util;

import M3.C2619t0;
import android.content.Context;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: renamed from: com.bilibili.studio.videoeditor.util.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/i.class */
public final class C6636i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C6636i f110234a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f110235b;

    public static Throwable b(String str, Function0 function0) {
        Throwable th;
        String message;
        try {
            function0.invoke();
            BLog.i("CppSharedLibraryLoader", "libc++_shared loaded via " + str);
            th = null;
        } catch (Throwable th2) {
            if ((th2 instanceof UnsatisfiedLinkError) && (message = th2.getMessage()) != null && StringsKt.l(message, "already loaded")) {
                defpackage.a.b("libc++_shared already loaded via another classloader, source=", str, "CppSharedLibraryLoader");
                th = null;
            } else {
                th = th2;
            }
        }
        return th;
    }

    public final boolean a(@NotNull Context context) {
        if (f110235b) {
            return true;
        }
        synchronized (this) {
            if (f110235b) {
                return true;
            }
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            Throwable thB = b("name:c++_shared", new C2619t0(7));
            if (thB == null) {
                f110235b = true;
                return true;
            }
            BLog.w("CppSharedLibraryLoader", "load libc++_shared by name failed", thB);
            File file = new File(context.getApplicationInfo().nativeLibraryDir, System.mapLibraryName("c++_shared"));
            if (file.isFile()) {
                Throwable thB2 = b("path:" + file.getAbsolutePath(), new com.bilibili.ogv.review.detailpage.q(file, 1));
                if (thB2 == null) {
                    f110235b = true;
                    BLog.i("CppSharedLibraryLoader", "libc++_shared loaded via app native path for non-GP package");
                    return true;
                }
                BLog.w("CppSharedLibraryLoader", "load libc++_shared from nativeLibraryDir failed", thB2);
            } else {
                BLog.w("CppSharedLibraryLoader", "libc++_shared missing under nativeLibraryDir: " + file.getAbsolutePath());
            }
            BLog.e("CppSharedLibraryLoader", "load libc++_shared failed", thB);
            return false;
        }
    }
}
