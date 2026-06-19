package com.bilibili.search2.result.ogv.aggregate;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.polymer.app.search.v1.Item;
import com.bilibili.search2.api.SearchOgvClusterRelationItem;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/aggregate/u.class */
@StabilityInferred(parameters = 1)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final u f88427a = new Object();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/aggregate/u$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f88428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f88429b;

        static {
            int[] iArr = new int[Item.CardItemCase.values().length];
            try {
                iArr[Item.CardItemCase.COMIC.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[Item.CardItemCase.BANGUMI.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[Item.CardItemCase.OGV_INLINE.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f88428a = iArr;
            int[] iArr2 = new int[SearchOgvClusterRelationItem.Sort.values().length];
            try {
                iArr2[SearchOgvClusterRelationItem.Sort.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr2[SearchOgvClusterRelationItem.Sort.PUBLISH_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError e11) {
            }
            f88429b = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull com.bilibili.search2.result.base.x.c r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.ogv.aggregate.u.a(com.bilibili.search2.result.base.x$c, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull com.bilibili.search2.result.ogv.aggregate.a r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.ogv.aggregate.u.b(com.bilibili.search2.result.ogv.aggregate.a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
