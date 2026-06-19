package com.bilibili.search2.result;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.playerbizcommon.IPlayerPreloadRouteService;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f87327b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f87326a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static final IPlayerPreloadRouteService f87328c = (IPlayerPreloadRouteService) BLRouter.INSTANCE.get(IPlayerPreloadRouteService.class, "player_preload");

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.search2.result.b, java.lang.Object] */
    static {
        String str = (String) ConfigManager.Companion.config().get("search.query_input_max_length", "150");
        int i7 = 150;
        if (str != null) {
            try {
                i7 = Integer.parseInt(str);
            } catch (Exception e7) {
                i7 = 150;
            }
        }
        f87327b = i7;
    }

    public static String f(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append(((Number) it.next()).intValue());
            if (it.hasNext()) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.Nullable java.lang.String r10, @org.jetbrains.annotations.Nullable java.lang.String r11, @org.jetbrains.annotations.Nullable java.lang.String r12, @org.jetbrains.annotations.Nullable java.lang.String r13, int r14, boolean r15, @org.jetbrains.annotations.Nullable java.lang.String r16, @org.jetbrains.annotations.NotNull Xs0.a r17, @org.jetbrains.annotations.Nullable java.lang.Integer r18, @org.jetbrains.annotations.Nullable java.lang.String r19, @org.jetbrains.annotations.Nullable java.lang.Long r20, @org.jetbrains.annotations.Nullable java.lang.Long r21, @org.jetbrains.annotations.Nullable java.util.Map r22, boolean r23, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r24) {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.b.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, java.lang.String, Xs0.a, java.lang.Integer, java.lang.String, java.lang.Long, java.lang.Long, java.util.Map, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02d7  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.Nullable java.lang.String r10, @org.jetbrains.annotations.Nullable java.lang.String r11, @org.jetbrains.annotations.Nullable java.lang.String r12, @org.jetbrains.annotations.Nullable java.lang.String r13, @org.jetbrains.annotations.Nullable java.lang.String r14, @org.jetbrains.annotations.Nullable java.util.List r15, @org.jetbrains.annotations.Nullable java.util.List r16, @org.jetbrains.annotations.Nullable java.lang.String r17, int r18, boolean r19, boolean r20, int r21, @org.jetbrains.annotations.NotNull java.lang.String r22, long r23, long r25, long r27, @org.jetbrains.annotations.NotNull Xs0.a r29, @org.jetbrains.annotations.Nullable java.lang.Integer r30, @org.jetbrains.annotations.Nullable java.lang.String r31, @org.jetbrains.annotations.Nullable java.lang.Long r32, @org.jetbrains.annotations.Nullable java.lang.Long r33, int r34, @org.jetbrains.annotations.Nullable com.bapis.bilibili.polymer.app.search.v1.Sort r35, @org.jetbrains.annotations.Nullable java.lang.String r36, @org.jetbrains.annotations.Nullable java.util.Map r37, boolean r38, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r39) {
        /*
            Method dump skipped, instruction units count: 910
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.b.b(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, int, boolean, boolean, int, java.lang.String, long, long, long, Xs0.a, java.lang.Integer, java.lang.String, java.lang.Long, java.lang.Long, int, com.bapis.bilibili.polymer.app.search.v1.Sort, java.lang.String, java.util.Map, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(@org.jetbrains.annotations.NotNull java.lang.String r9, int r10, @org.jetbrains.annotations.Nullable java.lang.String r11, @org.jetbrains.annotations.Nullable java.lang.String r12, @org.jetbrains.annotations.Nullable java.lang.String r13, @org.jetbrains.annotations.Nullable java.lang.String r14, @org.jetbrains.annotations.Nullable com.bapis.bilibili.polymer.app.search.v1.UserSort r15, @org.jetbrains.annotations.Nullable com.bapis.bilibili.polymer.app.search.v1.UserType r16, @org.jetbrains.annotations.Nullable java.util.Map r17, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            Method dump skipped, instruction units count: 811
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.b.c(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.bapis.bilibili.polymer.app.search.v1.UserSort, com.bapis.bilibili.polymer.app.search.v1.UserType, java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(int r10, @org.jetbrains.annotations.Nullable java.lang.String r11, @org.jetbrains.annotations.Nullable java.lang.String r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.b.d(int, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(int r9, @org.jetbrains.annotations.Nullable java.lang.String r10, @org.jetbrains.annotations.Nullable java.lang.String r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.b.e(int, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
