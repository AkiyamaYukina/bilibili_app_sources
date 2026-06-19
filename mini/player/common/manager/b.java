package com.bilibili.mini.player.common.manager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mini/player/common/manager/b.class */
public final class b {
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.bilibili.playerbizcommon.miniplayer.IMiniPlayerContainer a(@org.jetbrains.annotations.NotNull android.app.Activity r3) {
        /*
            java.lang.Class<com.bilibili.playerbizcommon.miniplayer.IMiniPlayerContainer> r0 = com.bilibili.playerbizcommon.miniplayer.IMiniPlayerContainer.class
            r1 = r3
            boolean r0 = r0.isInstance(r1)
            if (r0 == 0) goto L13
            java.lang.Class<com.bilibili.playerbizcommon.miniplayer.IMiniPlayerContainer> r0 = com.bilibili.playerbizcommon.miniplayer.IMiniPlayerContainer.class
            r1 = r3
            java.lang.Object r0 = r0.cast(r1)
            r3 = r0
            goto Lc1
        L13:
            r0 = r3
            boolean r0 = r0 instanceof com.bilibili.lib.ui.GeneralActivity
            if (r0 == 0) goto L2b
            r0 = r3
            com.bilibili.lib.ui.GeneralActivity r0 = (com.bilibili.lib.ui.GeneralActivity) r0
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r1 = "fragment"
            java.lang.String r0 = r0.getStringExtra(r1)
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L30
        L2b:
            r0 = 0
            r3 = r0
            goto Lc1
        L30:
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> La8
            r5 = r0
            r0 = r3
            com.bilibili.lib.ui.GeneralActivity r0 = (com.bilibili.lib.ui.GeneralActivity) r0     // Catch: java.lang.Throwable -> La8
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Throwable -> La8
            r1 = r4
            java.lang.Class r0 = androidx.fragment.app.FragmentFactory.loadFragmentClass(r0, r1)     // Catch: java.lang.Throwable -> La8
            r4 = r0
            r0 = r3
            com.bilibili.lib.ui.GeneralActivity r0 = (com.bilibili.lib.ui.GeneralActivity) r0     // Catch: java.lang.Throwable -> La8
            androidx.fragment.app.FragmentManager r0 = r0.getSupportFragmentManager()     // Catch: java.lang.Throwable -> La8
            r3 = r0
            kotlin.collections.ArrayDeque r0 = new kotlin.collections.ArrayDeque     // Catch: java.lang.Throwable -> La8
            r5 = r0
            r0 = r5
            r0.<init>()     // Catch: java.lang.Throwable -> La8
            r0 = r5
            r1 = r3
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> La8
        L56:
            r0 = r5
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> La8
            if (r0 != 0) goto L99
            r0 = r5
            java.lang.Object r0 = r0.removeFirst()     // Catch: java.lang.Throwable -> La8
            androidx.fragment.app.FragmentManager r0 = (androidx.fragment.app.FragmentManager) r0     // Catch: java.lang.Throwable -> La8
            java.util.List r0 = r0.getFragments()     // Catch: java.lang.Throwable -> La8
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> La8
            r6 = r0
        L6f:
            r0 = r6
            boolean r0 = r0.hasNext()     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto L56
            r0 = r6
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> La8
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0     // Catch: java.lang.Throwable -> La8
            r3 = r0
            r0 = r4
            r1 = r3
            boolean r0 = r0.isInstance(r1)     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto L8d
            goto L9b
        L8d:
            r0 = r5
            r1 = r3
            androidx.fragment.app.FragmentManager r1 = r1.getChildFragmentManager()     // Catch: java.lang.Throwable -> La8
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> La8
            goto L6f
        L99:
            r0 = 0
            r3 = r0
        L9b:
            java.lang.Class<com.bilibili.playerbizcommon.miniplayer.IMiniPlayerContainer> r0 = com.bilibili.playerbizcommon.miniplayer.IMiniPlayerContainer.class
            r1 = r3
            java.lang.Object r0 = r0.cast(r1)     // Catch: java.lang.Throwable -> La8
            java.lang.Object r0 = kotlin.Result.constructor-impl(r0)     // Catch: java.lang.Throwable -> La8
            r4 = r0
            goto Lb5
        La8:
            r3 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            r4 = r0
            r0 = r3
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.constructor-impl(r0)
            r4 = r0
        Lb5:
            r0 = r4
            r3 = r0
            r0 = r4
            boolean r0 = kotlin.Result.isFailure-impl(r0)
            if (r0 == 0) goto Lc1
            goto L2b
        Lc1:
            r0 = r3
            com.bilibili.playerbizcommon.miniplayer.IMiniPlayerContainer r0 = (com.bilibili.playerbizcommon.miniplayer.IMiniPlayerContainer) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mini.player.common.manager.b.a(android.app.Activity):com.bilibili.playerbizcommon.miniplayer.IMiniPlayerContainer");
    }
}
