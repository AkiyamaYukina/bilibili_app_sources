package com.bilibili.pegasus.components.graduation;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/t0.class */
public final class t0 {
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.List<com.bilibili.pegasus.components.graduation.a0> a(@org.jetbrains.annotations.Nullable com.bilibili.pegasus.data.config.GraduationSeasonConfig r6) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.graduation.t0.a(com.bilibili.pegasus.data.config.GraduationSeasonConfig):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean b(int r4, @org.jetbrains.annotations.Nullable java.lang.String r5) {
        /*
            r0 = 1
            r7 = r0
            r0 = 1
            r1 = r4
            if (r0 > r1) goto L10
            r0 = r4
            r1 = 2009(0x7d9, float:2.815E-42)
            if (r0 >= r1) goto L10
            r0 = 1
            return r0
        L10:
            r0 = r5
            r8 = r0
            r0 = r5
            if (r0 != 0) goto L1b
            java.lang.String r0 = ""
            r8 = r0
        L1b:
            r0 = r8
            java.lang.String r1 = " "
            java.lang.String r2 = ""
            java.lang.String r0 = kotlin.text.StringsKt.L(r0, r1, r2)
            java.lang.String r1 = "年"
            java.lang.String r2 = ""
            java.lang.String r0 = kotlin.text.StringsKt.L(r0, r1, r2)
            r5 = r0
            r0 = r5
            java.lang.String r1 = "2009"
            boolean r0 = kotlin.text.StringsKt.Z(r0, r1)
            if (r0 == 0) goto L4e
            r0 = r7
            r6 = r0
            r0 = r5
            java.lang.String r1 = "以前"
            boolean r0 = kotlin.text.StringsKt.n(r0, r1)
            if (r0 != 0) goto L50
            r0 = r5
            java.lang.String r1 = "之前"
            boolean r0 = kotlin.text.StringsKt.n(r0, r1)
            if (r0 == 0) goto L4e
            r0 = r7
            r6 = r0
            goto L50
        L4e:
            r0 = 0
            r6 = r0
        L50:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.graduation.t0.b(int, java.lang.String):boolean");
    }

    public static final boolean c(int i7) {
        return i7 == -1;
    }

    public static final boolean d(int i7) {
        boolean z6 = true;
        if (!c(i7)) {
            z6 = (1 > i7 || i7 >= 2009) ? 2009 <= i7 && i7 < 2027 : true;
        }
        return z6;
    }
}
