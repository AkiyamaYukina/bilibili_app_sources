package com.bilibili.playerbizcommon.utils;

import android.app.Application;
import android.content.Context;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.category.Z;
import com.bilibili.base.BiliContext;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/j.class */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f80290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f80291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f80292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final d f80293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f80294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final c f80295f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/j$a.class */
    public static final class a extends ThreadLocal<SimpleDateFormat> {
        /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
        @Override // java.lang.ThreadLocal
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.text.SimpleDateFormat initialValue() {
            /*
                r5 = this;
                android.app.Application r0 = com.bilibili.base.BiliContext.application()
                r6 = r0
                r0 = r6
                if (r0 == 0) goto L15
                r0 = r6
                r1 = 2131822571(0x7f1107eb, float:1.9277917E38)
                java.lang.String r0 = r0.getString(r1)
                r7 = r0
                r0 = r7
                r6 = r0
                r0 = r7
                if (r0 != 0) goto L18
            L15:
                java.lang.String r0 = ""
                r6 = r0
            L18:
                java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
                r1 = r0
                r2 = r6
                java.util.Locale r3 = java.util.Locale.getDefault()
                r1.<init>(r2, r3)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.utils.j.a.initialValue():java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/j$b.class */
    public static final class b extends ThreadLocal<SimpleDateFormat> {
        /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
        @Override // java.lang.ThreadLocal
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.text.SimpleDateFormat initialValue() {
            /*
                r5 = this;
                android.app.Application r0 = com.bilibili.base.BiliContext.application()
                r6 = r0
                r0 = r6
                if (r0 == 0) goto L15
                r0 = r6
                r1 = 2131822572(0x7f1107ec, float:1.927792E38)
                java.lang.String r0 = r0.getString(r1)
                r7 = r0
                r0 = r7
                r6 = r0
                r0 = r7
                if (r0 != 0) goto L18
            L15:
                java.lang.String r0 = ""
                r6 = r0
            L18:
                java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
                r1 = r0
                r2 = r6
                java.util.Locale r3 = java.util.Locale.getDefault()
                r1.<init>(r2, r3)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.utils.j.b.initialValue():java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/j$c.class */
    public static final class c extends ThreadLocal<SimpleDateFormat> {
        /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
        @Override // java.lang.ThreadLocal
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.text.SimpleDateFormat initialValue() {
            /*
                r5 = this;
                android.app.Application r0 = com.bilibili.base.BiliContext.application()
                r6 = r0
                r0 = r6
                if (r0 == 0) goto L15
                r0 = r6
                r1 = 2131822573(0x7f1107ed, float:1.9277921E38)
                java.lang.String r0 = r0.getString(r1)
                r7 = r0
                r0 = r7
                r6 = r0
                r0 = r7
                if (r0 != 0) goto L18
            L15:
                java.lang.String r0 = ""
                r6 = r0
            L18:
                java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
                r1 = r0
                r2 = r6
                java.util.Locale r3 = java.util.Locale.getDefault()
                r1.<init>(r2, r3)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.utils.j.c.initialValue():java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/j$d.class */
    public static final class d extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        public final SimpleDateFormat initialValue() {
            return new SimpleDateFormat("H:mm", Locale.getDefault());
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/j$e.class */
    public static final class e extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        public final SimpleDateFormat initialValue() {
            return new SimpleDateFormat("M-d", Locale.getDefault());
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/j$f.class */
    public static final class f extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        public final SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy年M月d日 HH:mm", Locale.getDefault());
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/j$g.class */
    public static final class g extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        public final SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-M-d", Locale.getDefault());
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/j$h.class */
    public static final class h extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        public final SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-M-d H:mm", Locale.getDefault());
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bilibili.playerbizcommon.utils.j$d, java.lang.ThreadLocal] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.bilibili.playerbizcommon.utils.j$a, java.lang.ThreadLocal] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.bilibili.playerbizcommon.utils.j$c, java.lang.ThreadLocal] */
    static {
        String string;
        Application application = BiliContext.application();
        if (application != null && (string = application.getString(2131846672)) != null) {
            string.toCharArray();
        }
        new ThreadLocal();
        new ThreadLocal();
        new ThreadLocal();
        f80293d = new ThreadLocal();
        new ThreadLocal();
        f80294e = new ThreadLocal();
        new ThreadLocal();
        f80295f = new ThreadLocal();
    }

    public static String a(long j7, Context context) {
        String strA;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j8 = jCurrentTimeMillis - j7;
        if (j8 < 60000) {
            strA = context.getString(2131841388);
        } else if (j8 < 3600000) {
            strA = context.getString(2131847494, Long.valueOf(j8 / 60000));
        } else if (j8 < 86400000) {
            strA = context.getString(2131847007, Long.valueOf(j8 / 3600000));
        } else {
            if (f80290a <= 0) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(jCurrentTimeMillis);
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                f80290a = calendar.getTimeInMillis() - 86400000;
            }
            if (j7 >= f80290a) {
                strA = context.getString(2131838332, Z.a(j7, f80293d.get()));
            } else {
                if (f80291b <= 0) {
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTimeInMillis(jCurrentTimeMillis);
                    calendar2.set(11, 0);
                    calendar2.set(12, 0);
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                    f80291b = calendar2.getTimeInMillis() - 259200000;
                }
                if (j7 >= f80291b) {
                    strA = context.getString(2131825420, Integer.valueOf((int) RangesKt.coerceAtMost(RangesKt.coerceAtLeast(((f80290a - j7) / 86400000) + ((long) 2), 2L), 3L)));
                } else {
                    if (f80292c <= 0) {
                        Calendar calendar3 = Calendar.getInstance();
                        calendar3.setTimeInMillis(jCurrentTimeMillis);
                        int i7 = calendar3.get(1);
                        calendar3.clear();
                        calendar3.set(1, i7);
                        f80292c = calendar3.getTimeInMillis();
                    }
                    strA = Z.a(j7, j7 >= f80292c ? f80294e.get() : f80295f.get());
                }
            }
        }
        return strA;
    }
}
