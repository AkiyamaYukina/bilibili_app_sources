package com.bilibili.ship.theseus.ugc.intro.upcenter;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/b.class */
public final class b {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/b$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f97550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f97551b;

        static {
            int[] iArr = new int[com.bapis.bilibili.app.viewunite.common.ExtType.values().length];
            try {
                iArr[com.bapis.bilibili.app.viewunite.common.ExtType.ExtNone.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[com.bapis.bilibili.app.viewunite.common.ExtType.ExtDataCenter.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[com.bapis.bilibili.app.viewunite.common.ExtType.ExtDataEarnings.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f97550a = iArr;
            int[] iArr2 = new int[ExtType.values().length];
            try {
                iArr2[ExtType.ExtNone.ordinal()] = 1;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr2[ExtType.ExtDataCenter.ordinal()] = 2;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr2[ExtType.ExtDataEarnings.ordinal()] = 3;
            } catch (NoSuchFieldError e12) {
            }
            f97551b = iArr2;
        }
    }

    @NotNull
    public static final com.bapis.bilibili.app.view.v1.ExtType a(@NotNull ExtType extType) {
        int i7 = a.f97551b[extType.ordinal()];
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? com.bapis.bilibili.app.view.v1.ExtType.UNRECOGNIZED : com.bapis.bilibili.app.view.v1.ExtType.ExtDataEarnings : com.bapis.bilibili.app.view.v1.ExtType.ExtDataCenter : com.bapis.bilibili.app.view.v1.ExtType.ExtNone;
    }
}
