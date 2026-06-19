package com.bilibili.opd.app.core.accountservice;

import com.bilibili.lib.accounts.subscribe.Topic;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/core/accountservice/AccountTopic.class */
public enum AccountTopic {
    SIGN_IN,
    SIGN_OUT,
    TOKEN_INVALID,
    TOKEN_REFRESHED,
    ACCOUNT_INFO_CHANGED;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/core/accountservice/AccountTopic$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f74670a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:11:0x002f
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                com.bilibili.opd.app.core.accountservice.AccountTopic[] r0 = com.bilibili.opd.app.core.accountservice.AccountTopic.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.bilibili.opd.app.core.accountservice.AccountTopic.a.f74670a = r0
                r0 = r4
                com.bilibili.opd.app.core.accountservice.AccountTopic r1 = com.bilibili.opd.app.core.accountservice.AccountTopic.SIGN_IN     // Catch: java.lang.NoSuchFieldError -> L2b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            L14:
                int[] r0 = com.bilibili.opd.app.core.accountservice.AccountTopic.a.f74670a     // Catch: java.lang.NoSuchFieldError -> L2b java.lang.NoSuchFieldError -> L2f
                com.bilibili.opd.app.core.accountservice.AccountTopic r1 = com.bilibili.opd.app.core.accountservice.AccountTopic.SIGN_OUT     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
            L1f:
                int[] r0 = com.bilibili.opd.app.core.accountservice.AccountTopic.a.f74670a     // Catch: java.lang.NoSuchFieldError -> L2f java.lang.NoSuchFieldError -> L33
                com.bilibili.opd.app.core.accountservice.AccountTopic r1 = com.bilibili.opd.app.core.accountservice.AccountTopic.TOKEN_REFRESHED     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L2a:
                return
            L2b:
                r4 = move-exception
                goto L14
            L2f:
                r4 = move-exception
                goto L1f
            L33:
                r4 = move-exception
                goto L2a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.core.accountservice.AccountTopic.a.m7890clinit():void");
        }
    }

    public Topic convert() {
        int i7 = a.f74670a[ordinal()];
        if (i7 == 1) {
            return Topic.SIGN_IN;
        }
        if (i7 == 2) {
            return Topic.SIGN_OUT;
        }
        if (i7 != 3) {
            return null;
        }
        return Topic.TOKEN_REFRESHED;
    }
}
