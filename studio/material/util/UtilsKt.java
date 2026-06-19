package com.bilibili.studio.material.util;

import Ba.a;
import android.util.Patterns;
import com.bilibili.studio.material.FailReason;
import com.bilibili.studio.material.internal.download.DownloadThrowable;
import java.io.File;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/util/UtilsKt.class */
public final class UtilsKt {

    @NotNull
    public static final String CaptionPath = "caption";

    @NotNull
    public static final String DOT = ".";
    public static final int DefaultTaskMaxNum = Integer.MAX_VALUE;

    @NotNull
    public static final String Material_TAG = "ResourceCenter";

    @NotNull
    public static final String NetworkError = "network_error";

    @NotNull
    public static final String RootPath = "video_editor";

    @NotNull
    public static final String ZIP_SUFFIX = ".zip";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static final String f108566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static final String f108567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f108568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f108569d;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    static {
        /*
            android.app.Application r0 = com.bilibili.base.BiliContext.application()
            r4 = r0
            r0 = 0
            r6 = r0
            r0 = r4
            if (r0 == 0) goto L17
            r0 = r4
            java.lang.String r1 = "video_editor"
            java.io.File r0 = r0.getExternalFilesDir(r1)
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r5
            if (r0 != 0) goto L29
        L17:
            android.app.Application r0 = com.bilibili.base.BiliContext.application()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L27
            r0 = r4
            java.io.File r0 = r0.getFilesDir()
            r4 = r0
            goto L29
        L27:
            r0 = 0
            r4 = r0
        L29:
            r0 = r4
            if (r0 == 0) goto L35
            r0 = r4
            java.lang.String r0 = r0.getAbsolutePath()
            r5 = r0
            goto L37
        L35:
            r0 = 0
            r5 = r0
        L37:
            r0 = r5
            com.bilibili.studio.material.util.UtilsKt.f108566a = r0
            android.app.Application r0 = com.bilibili.base.BiliContext.application()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L51
            r0 = r4
            java.lang.String r1 = android.os.Environment.DIRECTORY_MUSIC
            java.io.File r0 = r0.getExternalFilesDir(r1)
            r7 = r0
            r0 = r7
            r4 = r0
            r0 = r7
            if (r0 != 0) goto L63
        L51:
            android.app.Application r0 = com.bilibili.base.BiliContext.application()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L61
            r0 = r4
            java.io.File r0 = r0.getFilesDir()
            r4 = r0
            goto L63
        L61:
            r0 = 0
            r4 = r0
        L63:
            r0 = r4
            if (r0 == 0) goto L6c
            r0 = r4
            java.lang.String r0 = r0.getAbsolutePath()
            r6 = r0
        L6c:
            r0 = r6
            com.bilibili.studio.material.util.UtilsKt.f108567b = r0
            java.lang.String r0 = java.io.File.separator
            r4 = r0
            r0 = r5
            r1 = r4
            java.lang.String r2 = "caption"
            java.lang.String r0 = B0.a.a(r0, r1, r2)
            com.bilibili.studio.material.util.UtilsKt.f108568c = r0
            r0 = r5
            r1 = r4
            java.lang.String r2 = "default"
            java.lang.String r0 = B0.a.a(r0, r1, r2)
            com.bilibili.studio.material.util.UtilsKt.f108569d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.material.util.UtilsKt.m10212clinit():void");
    }

    @NotNull
    public static final FailReason convertFailReason(@NotNull Throwable th) {
        FailReason dVar;
        if (th instanceof DownloadThrowable) {
            Integer code = ((DownloadThrowable) th).getCode();
            dVar = ((code != null && code.intValue() == 606) || (code != null && code.intValue() == 607)) ? new FailReason("111118", th.toString(), null) : ((code != null && code.intValue() == 500) || (code != null && code.intValue() == 603) || (code != null && code.intValue() == 604)) ? new FailReason.c(th.toString()) : new FailReason.d(th.toString());
        } else {
            dVar = new FailReason.d(th.toString());
        }
        return dVar;
    }

    @NotNull
    public static final String getCaptionDirPath() {
        return f108568c;
    }

    @Nullable
    public static final String getDefaultDirPath() {
        return f108566a;
    }

    @NotNull
    public static final String getDefaultPath() {
        return f108569d;
    }

    @NotNull
    public static final String getExtension(@NotNull String str) {
        if (StringsKt.isBlank(str)) {
            return str;
        }
        int iC = StringsKt.C(str, '.');
        String strSubstring = (iC <= -1 || iC >= str.length() - 1) ? str : str.substring(iC + 1);
        int length = strSubstring.length();
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                i7 = -1;
                break;
            }
            if (strSubstring.charAt(i7) == '?') {
                break;
            }
            i7++;
        }
        String strSubstring2 = strSubstring;
        if (i7 > -1) {
            strSubstring2 = strSubstring;
            if (i7 < str.length() - 1) {
                strSubstring2 = strSubstring.substring(0, i7);
            }
        }
        return strSubstring2;
    }

    @NotNull
    public static final String getFileByExtension(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z6) {
        File[] fileArrListFiles = new File(str).listFiles();
        if (fileArrListFiles == null) {
            return "";
        }
        for (File file : fileArrListFiles) {
            if (file.isFile()) {
                if (StringsKt.isBlank(str3) || !StringsKt.n(file.getPath(), str3)) {
                    if (Intrinsics.areEqual(file.getPath().substring(file.getPath().length() - str2.length()), str2)) {
                        return file.getPath();
                    }
                } else if (z6) {
                    file.delete();
                }
            }
        }
        return "";
    }

    public static /* synthetic */ String getFileByExtension$default(String str, String str2, String str3, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str3 = "";
        }
        if ((i7 & 4) != 0) {
            z6 = false;
        }
        return getFileByExtension(str, str2, str3, z6);
    }

    @NotNull
    public static final String getFileNameFromUrl(@NotNull String str) {
        String strSubstring = str;
        if (str.length() > 0) {
            int iD = StringsKt.D(str, File.separator, 0, 6);
            strSubstring = str;
            if (iD > -1) {
                strSubstring = str;
                if (iD < str.length() - 1) {
                    strSubstring = str.substring(iD + 1);
                }
            }
        }
        return strSubstring;
    }

    @NotNull
    public static final String getFilePathNoEx(@NotNull String str) {
        String strSubstring = str;
        if (!StringsKt.isBlank(str)) {
            int iC = StringsKt.C(str, '.');
            strSubstring = str;
            if (iC > -1) {
                strSubstring = str;
                if (iC < str.length()) {
                    strSubstring = str.substring(0, iC);
                }
            }
        }
        return strSubstring;
    }

    @NotNull
    public static final String getLastDirectoryPath(@NotNull String str, @NotNull List<String> list) {
        File file;
        File file2 = new File(str);
        if (!file2.isDirectory()) {
            file2 = null;
        }
        if (file2 != null && (file = (File) SequencesKt.lastOrNull(SequencesKt.generateSequence(file2, new a(list, 8)))) != null) {
            return file.getAbsolutePath();
        }
        return str;
    }

    @Nullable
    public static final String getMusicDirPath() {
        return f108567b;
    }

    public static final boolean isFileExist(@NotNull File file) {
        File[] fileArrListFiles;
        if (!file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
            return false;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isFile()) {
                return true;
            }
            if (file2.isDirectory() && isFileExist(file2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isValidUrl(@NotNull String str) {
        return Patterns.WEB_URL.matcher(str).matches();
    }

    public static final void printDirectoryContents(@NotNull File file, @NotNull String str, @Nullable Function1<? super String, Unit> function1) {
        StringBuilder sb;
        StringBuilder sb2;
        if (file.isDirectory()) {
            String name = file.getName();
            if (function1 != null) {
                sb = new StringBuilder();
                sb.append(str);
                sb.append(name);
                sb.append("/");
                function1.invoke(sb.toString());
            } else {
                sb = new StringBuilder();
                sb.append(str);
                sb.append(name);
                sb.append("/");
                BLog.i(Material_TAG, sb.toString());
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    if (file2.isDirectory()) {
                        printDirectoryContents(file2, str + "  ", function1);
                    } else {
                        String name2 = file2.getName();
                        if (function1 != null) {
                            sb2 = new StringBuilder();
                            sb2.append(str);
                            sb2.append(" ");
                            sb2.append(name2);
                            function1.invoke(sb2.toString());
                        } else {
                            sb2 = new StringBuilder();
                            sb2.append(str);
                            sb2.append(" ");
                            sb2.append(name2);
                            BLog.i(Material_TAG, sb2.toString());
                        }
                    }
                }
            }
        }
    }

    public static /* synthetic */ void printDirectoryContents$default(File file, String str, Function1 function1, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str = "";
        }
        if ((i7 & 4) != 0) {
            function1 = null;
        }
        printDirectoryContents(file, str, function1);
    }

    public static final double ratio(long j7, long j8) {
        if (j8 <= 0) {
            return 0.0d;
        }
        return new BigDecimal(String.valueOf(j7 * 100.0d)).divide(new BigDecimal(String.valueOf(j8 * 1.0d)), 2, 3).doubleValue();
    }
}
