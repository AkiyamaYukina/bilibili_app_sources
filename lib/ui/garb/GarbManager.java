package com.bilibili.lib.ui.garb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.ui.garb.Garb;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import java.io.File;
import kotlin.Lazy;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf1.k;
import tv.danmaku.bili.ui.garb.B;
import tv.danmaku.bili.ui.garb.E;
import tv.danmaku.bili.ui.garb.K;
import tv.danmaku.bili.ui.garb.model.GarbApiService;
import tv.danmaku.bili.ui.garb.model.GarbData;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/garb/GarbManager.class */
public final class GarbManager {

    @NotNull
    public static final GarbManager INSTANCE = new GarbManager();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static a f64842a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/garb/GarbManager$a.class */
    public interface a {
    }

    @JvmStatic
    public static final void fetchGarb(@NotNull Activity activity) {
        B b7 = f64842a;
        if (b7 != null) {
            B b8 = b7;
            String accessKey = BiliAccounts.get(activity).getAccessKey();
            String str = accessKey;
            if (accessKey == null) {
                str = "";
            }
            Lazy lazy = vf1.a.a;
            Garb garbE = b8.e(activity);
            int i7 = 1;
            if (!garbE.isOp() && (!garbE.isPure() || MultipleThemeUtils.isExtraTheme(activity))) {
                i7 = 0;
            }
            ((GarbApiService) vf1.a.a.getValue()).fetchGarb(str, i7).enqueue(new E(activity));
        }
    }

    @JvmStatic
    public static final int getCurBottomTabHeight(@NotNull Context context) {
        return f64842a != null ? getCurGarb().isPure() ? context.getResources().getDimensionPixelOffset(2131165577) : context.getResources().getDimensionPixelOffset(2131165578) : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.bilibili.lib.ui.garb.Garb getCurGarb() {
        /*
            com.bilibili.lib.ui.garb.GarbManager$a r0 = com.bilibili.lib.ui.garb.GarbManager.f64842a
            if (r0 == 0) goto L23
            com.bilibili.lib.ui.garb.Garb r0 = tv.danmaku.bili.ui.garb.B.b
            if (r0 != 0) goto L19
            com.bilibili.lib.ui.garb.Garb$a r0 = com.bilibili.lib.ui.garb.Garb.Companion
            java.lang.Class r0 = r0.getClass()
            com.bilibili.lib.ui.garb.Garb r0 = com.bilibili.lib.ui.garb.Garb.a.a()
            tv.danmaku.bili.ui.garb.B.b = r0
        L19:
            com.bilibili.lib.ui.garb.Garb r0 = tv.danmaku.bili.ui.garb.B.b
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L6c
        L23:
            com.bilibili.lib.ui.garb.GarbManager r0 = com.bilibili.lib.ui.garb.GarbManager.INSTANCE
            java.lang.Class r0 = r0.getClass()
            com.bilibili.lib.ui.garb.GarbManager$a r0 = com.bilibili.lib.ui.garb.GarbManager.f64842a
            if (r0 == 0) goto L64
            android.app.Application r0 = com.bilibili.base.BiliContext.application()
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L46
            com.bilibili.lib.ui.garb.Garb$a r0 = com.bilibili.lib.ui.garb.Garb.Companion
            java.lang.Class r0 = r0.getClass()
            com.bilibili.lib.ui.garb.Garb r0 = com.bilibili.lib.ui.garb.Garb.a.a()
            r5 = r0
            goto L6c
        L46:
            com.bilibili.lib.ui.garb.Garb r0 = new com.bilibili.lib.ui.garb.Garb
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r6
            int r0 = Eg1.a.a(r0)
            r4 = r0
            r0 = r5
            r1 = r4
            long r1 = (long) r1
            r0.setId(r1)
            r0 = r5
            r1 = r4
            java.lang.String r1 = tv.danmaku.bili.ui.garb.B.d(r1)
            r0.setColorName(r1)
            goto L6c
        L64:
            com.bilibili.lib.ui.garb.Garb r0 = new com.bilibili.lib.ui.garb.Garb
            r1 = r0
            r1.<init>()
            r5 = r0
        L6c:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.ui.garb.GarbManager.getCurGarb():com.bilibili.lib.ui.garb.Garb");
    }

    @JvmStatic
    @NotNull
    public static final Garb getGarbWithNightMode(@NotNull Context context) {
        Garb garb;
        B b7 = f64842a;
        if (b7 != null) {
            garb = b7.e(context);
        } else {
            INSTANCE.getClass();
            if (f64842a != null) {
                Application application = BiliContext.application();
                if (application == null) {
                    Garb.Companion.getClass();
                    garb = Garb.a.a();
                } else {
                    garb = new Garb();
                    int iA = Eg1.a.a(application);
                    garb.setId(iA);
                    garb.setColorName(B.d(iA));
                }
            } else {
                garb = new Garb();
            }
        }
        return garb;
    }

    @JvmStatic
    @Nullable
    public static final File getLoadEquipFile() {
        File file = null;
        if (f64842a != null) {
            GarbData.LoadEquip loadEquipE = k.e();
            if (loadEquipE == null) {
                file = null;
            } else {
                File file2 = new File(k.c(), loadEquipE.getFileName());
                file = null;
                if (file2.exists()) {
                    file = file2;
                }
            }
        }
        return file;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void init(@org.jetbrains.annotations.NotNull android.content.Context r7, @org.jetbrains.annotations.NotNull com.bilibili.lib.ui.garb.GarbManager.a r8) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.ui.garb.GarbManager.init(android.content.Context, com.bilibili.lib.ui.garb.GarbManager$a):void");
    }

    public final boolean isPure$widget_release(@NotNull String str) {
        return f64842a != null ? K.a.containsKey(str) : true;
    }
}
