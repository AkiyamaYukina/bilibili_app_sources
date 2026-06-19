package com.bilibili.studio.framework.utils.file;

import Bs.o;
import android.text.TextUtils;
import cn.com.chinatelecom.account.api.d.m;
import java.io.File;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/framework/utils/file/FileSizeUtil.class */
public final class FileSizeUtil {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/framework/utils/file/FileSizeUtil$Type.class */
    public enum Type {
        B,
        KB,
        MB,
        GB
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/framework/utils/file/FileSizeUtil$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f108359a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x003e
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                com.bilibili.studio.framework.utils.file.FileSizeUtil$Type[] r0 = com.bilibili.studio.framework.utils.file.FileSizeUtil.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.bilibili.studio.framework.utils.file.FileSizeUtil.a.f108359a = r0
                r0 = r4
                com.bilibili.studio.framework.utils.file.FileSizeUtil$Type r1 = com.bilibili.studio.framework.utils.file.FileSizeUtil.Type.B     // Catch: java.lang.NoSuchFieldError -> L36
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L36
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L36
            L14:
                int[] r0 = com.bilibili.studio.framework.utils.file.FileSizeUtil.a.f108359a     // Catch: java.lang.NoSuchFieldError -> L36 java.lang.NoSuchFieldError -> L3a
                com.bilibili.studio.framework.utils.file.FileSizeUtil$Type r1 = com.bilibili.studio.framework.utils.file.FileSizeUtil.Type.KB     // Catch: java.lang.NoSuchFieldError -> L3a
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3a
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3a
            L1f:
                int[] r0 = com.bilibili.studio.framework.utils.file.FileSizeUtil.a.f108359a     // Catch: java.lang.NoSuchFieldError -> L3a java.lang.NoSuchFieldError -> L3e
                com.bilibili.studio.framework.utils.file.FileSizeUtil$Type r1 = com.bilibili.studio.framework.utils.file.FileSizeUtil.Type.MB     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L2a:
                int[] r0 = com.bilibili.studio.framework.utils.file.FileSizeUtil.a.f108359a     // Catch: java.lang.NoSuchFieldError -> L3e java.lang.NoSuchFieldError -> L42
                com.bilibili.studio.framework.utils.file.FileSizeUtil$Type r1 = com.bilibili.studio.framework.utils.file.FileSizeUtil.Type.GB     // Catch: java.lang.NoSuchFieldError -> L42
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L42
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L42
            L35:
                return
            L36:
                r4 = move-exception
                goto L14
            L3a:
                r4 = move-exception
                goto L1f
            L3e:
                r4 = move-exception
                goto L2a
            L42:
                r4 = move-exception
                goto L35
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.framework.utils.file.FileSizeUtil.a.m10183clinit():void");
        }
    }

    public static double a(long j7, Type type) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00", new DecimalFormatSymbols(Locale.US));
        decimalFormat.setGroupingUsed(false);
        int i7 = a.f108359a[type.ordinal()];
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? 0.0d : Double.parseDouble(decimalFormat.format(j7 / 1.073741824E9d)) : Double.parseDouble(decimalFormat.format(j7 / 1048576.0d)) : Double.parseDouble(decimalFormat.format(j7 / 1024.0d)) : Double.parseDouble(decimalFormat.format(j7));
    }

    public static long b(File file) {
        File[] fileArrListFiles = file.listFiles();
        long jB = 0;
        long j7 = 0;
        if (fileArrListFiles != null) {
            int length = fileArrListFiles.length;
            int i7 = 0;
            while (true) {
                j7 = jB;
                if (i7 >= length) {
                    break;
                }
                File file2 = fileArrListFiles[i7];
                jB += file2.isDirectory() ? b(file2) : file2.length();
                i7++;
            }
        }
        return j7;
    }

    public static double c(String str, Type type) {
        if (TextUtils.isEmpty(str) || !m.b(str)) {
            return 0.0d;
        }
        File file = new File(str);
        try {
            return a(file.isDirectory() ? b(file) : file.length(), type);
        } catch (Exception e7) {
            o.a(e7, new StringBuilder("Fetch size error: "), "FileSizeUtil");
            return 0.0d;
        }
    }
}
