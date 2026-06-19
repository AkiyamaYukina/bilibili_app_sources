package com.bilibili.search2.result.column.api;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.polymer.app.search.v1.Item;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.playerbizcommon.IPlayerPreloadRouteService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/column/api/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f87726a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static final IPlayerPreloadRouteService f87727b = (IPlayerPreloadRouteService) BLRouter.INSTANCE.get(IPlayerPreloadRouteService.class, "player_preload");

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/column/api/b$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f87728a;

        static {
            int[] iArr = new int[Item.CardItemCase.values().length];
            try {
                iArr[Item.CardItemCase.ARTICLE_NEW.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[Item.CardItemCase.DYNAMIC_NEW.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[Item.CardItemCase.COMMENT_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f87728a = iArr;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.Nullable java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10, long r11, @org.jetbrains.annotations.Nullable java.lang.String r13, @org.jetbrains.annotations.NotNull java.lang.String r14, @org.jetbrains.annotations.NotNull java.lang.String r15, @org.jetbrains.annotations.Nullable com.bapis.bilibili.polymer.app.search.v1.CategorySort r16, @org.jetbrains.annotations.Nullable java.util.Map r17, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            Method dump skipped, instruction units count: 699
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.column.api.b.a(java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, com.bapis.bilibili.polymer.app.search.v1.CategorySort, java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
