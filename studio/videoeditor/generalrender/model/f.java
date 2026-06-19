package com.bilibili.studio.videoeditor.generalrender.model;

import Ih0.InterfaceC2297a;
import M3.C2592k;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.compose.foundation.text.selection.C3751q;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.z;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.studio.videoeditor.annual.api.CodecInfo;
import com.bilibili.studio.videoeditor.generalrender.bean.GRResourceInfo;
import com.bilibili.studio.videoeditor.generalrender.bean.GRUrlBean;
import d3.C6781b;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import ng0.InterfaceC8091a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sw0.C8629b;
import sw0.C8631d;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/model/f.class */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f109601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Lazy<f> f109602d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<String, CodecInfo> f109603a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f109604b = 1;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/model/f$a.class */
    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static boolean a(@org.jetbrains.annotations.Nullable androidx.fragment.app.FragmentActivity r2) {
            /*
                r0 = r2
                boolean r0 = r0 instanceof com.bilibili.lib.ui.BaseAppCompatActivity
                if (r0 == 0) goto L22
                r0 = r2
                com.bilibili.lib.ui.BaseAppCompatActivity r0 = (com.bilibili.lib.ui.BaseAppCompatActivity) r0
                r2 = r0
                r0 = r2
                boolean r0 = r0.isDestroyed()
                if (r0 != 0) goto L22
                r0 = r2
                boolean r0 = r0.isFinishing()
                if (r0 == 0) goto L1d
                goto L22
            L1d:
                r0 = 0
                r3 = r0
                goto L24
            L22:
                r0 = 1
                r3 = r0
            L24:
                r0 = r3
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.generalrender.model.f.a.a(androidx.fragment.app.FragmentActivity):boolean");
        }

        @JvmStatic
        @Nullable
        public static File b(@Nullable Context context) {
            Object obj;
            File filesDir;
            try {
                Result.Companion companion = Result.Companion;
                String parent = (context == null || (filesDir = context.getFilesDir()) == null) ? null : filesDir.getParent();
                String str = File.separator;
                File file = new File(parent + str + "general_rendering" + str + "resource");
                if (!file.exists()) {
                    file.mkdir();
                }
                obj = Result.constructor-impl(file);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (Result.isFailure-impl(obj)) {
                obj = null;
            }
            return (File) obj;
        }

        @JvmStatic
        @Nullable
        public static File c(@Nullable Context context, @NotNull GRResourceInfo gRResourceInfo) {
            File fileB = b(context);
            if (fileB == null) {
                return null;
            }
            String strK = k(gRResourceInfo);
            if (strK.length() != 0) {
                fileB = new File(B0.a.a(fileB.getAbsolutePath(), File.separator, strK));
                if (!fileB.exists()) {
                    fileB.mkdirs();
                }
            }
            return fileB;
        }

        @JvmStatic
        @Nullable
        public static String d(@Nullable String str) {
            return str != null ? str.substring(StringsKt.D(str, File.separator, 0, 6) + 1) : null;
        }

        @JvmStatic
        @Nullable
        public static String e(@Nullable String str) {
            String strSubstringAfter = null;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (str != null) {
                strSubstringAfter = StringsKt.substringAfter(str, f.f109601c, "");
            }
            return strSubstringAfter;
        }

        @NotNull
        public static f f() {
            return (f) f.f109602d.getValue();
        }

        @JvmStatic
        @NotNull
        public static String g(@Nullable Context context, @Nullable GRResourceInfo gRResourceInfo) {
            String hash;
            if (gRResourceInfo == null || context == null || (hash = gRResourceInfo.getHash()) == null || hash.length() == 0) {
                return "";
            }
            File fileC = c(context, gRResourceInfo);
            return B0.a.a(fileC != null ? fileC.getAbsolutePath() : null, File.separator, gRResourceInfo.getHash());
        }

        @JvmStatic
        @NotNull
        public static String h(@Nullable Context context, @Nullable String str) {
            if (context == null || str == null || str.length() == 0) {
                return "";
            }
            File fileB = b(context);
            return B0.a.a(fileB != null ? fileB.getAbsolutePath() : null, File.separator, str);
        }

        @JvmStatic
        @NotNull
        public static String i(@Nullable GRResourceInfo gRResourceInfo) {
            String hash = gRResourceInfo != null ? gRResourceInfo.getHash() : null;
            if (hash == null || hash.length() == 0) {
                return "";
            }
            String strK = k(gRResourceInfo);
            return (strK == null || strK.length() == 0) ? G.p.a(f.f109601c, gRResourceInfo.getHash()) : C6781b.a(f.f109601c, strK, File.separator, gRResourceInfo.getHash());
        }

        @JvmStatic
        @NotNull
        public static String j(@Nullable String str) {
            return (str == null || str.length() == 0) ? "" : G.p.a(f.f109601c, str);
        }

        @JvmStatic
        @NotNull
        public static String k(@NotNull GRResourceInfo gRResourceInfo) {
            long templateId = gRResourceInfo.getTemplateId();
            String strA = templateId == 0 ? "" : C3751q.a(templateId, "h5-");
            if (strA.length() == 0 || gRResourceInfo.getPath().length() == 0) {
                return "";
            }
            String strSubstringAfterLast = StringsKt.substringAfterLast(gRResourceInfo.getPath(), "ugc_template:/", "");
            if (strSubstringAfterLast.length() != 0) {
                strA = B0.a.a(strA, File.separator, strSubstringAfterLast);
            }
            return strA;
        }

        @JvmStatic
        @Nullable
        public static String l(@NotNull Activity activity, @NotNull GRResourceInfo gRResourceInfo, @NotNull String str) {
            File fileB = b(activity);
            if (fileB == null) {
                return null;
            }
            return B0.a.a(fileB.getAbsolutePath(), File.separator, B0.a.a(str, "-", gRResourceInfo.getHash()));
        }

        /* JADX WARN: Removed duplicated region for block: B:88:0x028b  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void m(@org.jetbrains.annotations.NotNull android.content.Context r9) {
            /*
                Method dump skipped, instruction units count: 1212
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.generalrender.model.f.a.m(android.content.Context):void");
        }
    }

    static {
        String str = File.separator;
        StringBuilder sbA = G0.b.a("https://localfile.bilibili", str, "general_rendering", str, "resource");
        sbA.append(str);
        f109601c = sbA.toString();
        f109602d = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new C2592k(6));
    }

    public static void a(@NotNull Function1 function1) {
        String str = C8629b.f127386a;
        if (pw0.b.a()) {
            Map<String, ? extends Object> mapMapOf = MapsKt.mapOf(TuplesKt.to("start_time", String.valueOf(System.currentTimeMillis())));
            C8631d.f127390b.start(C8629b.f127386a, C8629b.f127388c, "导出参数请求", "uper_activity_transcoding_parameters_request", "【导出参数请求】请求导出参数", mapMapOf);
        }
        ((InterfaceC8091a) ServiceGenerator.createService(InterfaceC8091a.class)).getProfile("transAndConv_android", null).enqueue(new g(function1));
    }

    public static void c(@NotNull InterfaceC2297a interfaceC2297a, @NotNull FragmentActivity fragmentActivity, @NotNull GRUrlBean gRUrlBean) {
        String fileName;
        BLog.i("GRResourceManager", "saveVideoToAlbum:" + gRUrlBean.getUrl());
        String filePath = gRUrlBean.getFilePath();
        if (filePath == null || filePath.length() == 0 || (fileName = gRUrlBean.getFileName()) == null || fileName.length() == 0) {
            interfaceC2297a.a(k.h(-700, gRUrlBean.getFileName(), z.a("path error, path:", gRUrlBean.getFilePath(), ", name:", gRUrlBean.getFileName())));
        } else {
            kD0.e.b(fragmentActivity, gRUrlBean.getFilePath(), gRUrlBean.getFileName(), new j(interfaceC2297a, fragmentActivity, gRUrlBean));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:80:0x024a  */
    /* JADX WARN: Type inference failed for: r0v234, types: [com.bilibili.studio.videoeditor.generalrender.ugcbridge.a$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v427, types: [SA0.b, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(@org.jetbrains.annotations.Nullable final androidx.fragment.app.FragmentActivity r18, @org.jetbrains.annotations.Nullable com.bilibili.studio.videoeditor.generalrender.bean.GRResourceInfo r19, @org.jetbrains.annotations.NotNull Ih0.InterfaceC2297a r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 3178
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.generalrender.model.f.b(androidx.fragment.app.FragmentActivity, com.bilibili.studio.videoeditor.generalrender.bean.GRResourceInfo, Ih0.a):void");
    }
}
