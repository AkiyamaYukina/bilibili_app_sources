package com.bilibili.studio.videocompile.util;

import android.text.TextUtils;
import androidx.compose.ui.input.pointer.k;
import androidx.core.content.c;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.media3.common.PlaybackException;
import cn.com.chinatelecom.account.api.d.m;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.mobile.BLMobileHumanActionNative;
import java.io.File;
import java.text.DecimalFormat;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.M;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/util/BVideoCompileUtil.class */
public final class BVideoCompileUtil {

    @NotNull
    public static final BVideoCompileUtil INSTANCE = new BVideoCompileUtil();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/util/BVideoCompileUtil$Type.class */
    public static final class Type {
        private static final EnumEntries $ENTRIES;
        private static final Type[] $VALUES;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public static final Type f108795B = new Type("B", 0);
        public static final Type KB = new Type("KB", 1);
        public static final Type MB = new Type("MB", 2);
        public static final Type GB = new Type("GB", 3);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{f108795B, KB, MB, GB};
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(typeArr$values);
        }

        private Type(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/util/BVideoCompileUtil$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f108796a;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.f108795B.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[Type.KB.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[Type.MB.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[Type.GB.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            f108796a = iArr;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static double a(long j7, Type type) throws NoWhenBranchMatchedException {
        double d7;
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        int i7 = a.f108796a[type.ordinal()];
        if (i7 == 1) {
            d7 = Double.parseDouble(decimalFormat.format(j7));
        } else if (i7 == 2) {
            d7 = Double.parseDouble(decimalFormat.format(j7 / ((double) 1024)));
        } else if (i7 == 3) {
            d7 = Double.parseDouble(decimalFormat.format(j7 / ((double) AccessibilityNodeInfoCompat.ACTION_DISMISS)));
        } else {
            if (i7 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            d7 = Double.parseDouble(decimalFormat.format(j7 / ((double) BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE)));
        }
        return d7;
    }

    @JvmStatic
    public static final void deleteFile(@NotNull String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            BLog.e("BVideoCompileUtil", c.b(file.length(), "deleteCompileFile ", file.getAbsolutePath(), ", size="));
            try {
                file.delete();
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        }
    }

    @JvmStatic
    public static final long estimatedCompiledFileSize(float f7, long j7) {
        return ((long) ((j7 * 1.0E-6d) * ((double) ((f7 * PlaybackException.CUSTOM_ERROR_CODE_BASE) + 320000)))) >> 3;
    }

    @JvmStatic
    public static final long estimatedReservedStorageSize(float f7, long j7) {
        BLog.e("BVideoCompileUtil", "estimatedReservedStorageSize bitrate = " + f7 + ", duration = " + j7);
        ConfigManager.Companion companion = ConfigManager.Companion;
        String str = (String) companion.config().get("video_compile_module.reserved_size_delta", "0.1");
        float f8 = str != null ? Float.parseFloat(str) : 0.1f;
        String str2 = (String) companion.config().get("video_compile_module.export_reserved_disk_space", "100");
        return ((long) ((1 + f8) * estimatedCompiledFileSize(f7, j7) * 2)) + ((long) ((str2 != null ? Integer.parseInt(str2) : 100) * AccessibilityNodeInfoCompat.ACTION_DISMISS));
    }

    @JvmStatic
    @NotNull
    public static final String getCompileOutputFileName() {
        return k.a(System.currentTimeMillis(), "studio_video_", ".mp4");
    }

    @JvmStatic
    public static final long getDirSize(@NotNull File file) {
        File[] fileArrListFiles = file.listFiles();
        long dirSize = 0;
        long j7 = 0;
        if (fileArrListFiles != null) {
            int length = fileArrListFiles.length;
            int i7 = 0;
            while (true) {
                j7 = dirSize;
                if (i7 >= length) {
                    break;
                }
                File file2 = fileArrListFiles[i7];
                dirSize += file2.isDirectory() ? getDirSize(file2) : getFileSize(file2);
                i7++;
            }
        }
        return j7;
    }

    @JvmStatic
    public static final double getFileOrDirSize(@Nullable String str, @NotNull Type type) {
        if (!isFileExists(str)) {
            return 0.0d;
        }
        File file = new File(str);
        try {
            long dirSize = file.isDirectory() ? getDirSize(file) : getFileSize(file);
            INSTANCE.getClass();
            return a(dirSize, type);
        } catch (Exception e7) {
            M.b("Fetch size error: ", e7.getMessage(), "BVideoCompileUtil");
            return 0.0d;
        }
    }

    @JvmStatic
    public static final long getFileSize(@NotNull File file) {
        return file.length();
    }

    @JvmStatic
    public static final int getSpaceBuffer() {
        String str = (String) ConfigManager.Companion.config().get("video_compile_module.export_reserved_disk_space", "100");
        return str != null ? Integer.parseInt(str) : 100;
    }

    @JvmStatic
    public static final boolean isFileExists(@NotNull String... strArr) {
        for (String str : strArr) {
            if (TextUtils.isEmpty(str) || !m.b(str)) {
                return false;
            }
        }
        return true;
    }
}
