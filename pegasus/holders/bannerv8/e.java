package com.bilibili.pegasus.holders.bannerv8;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/e.class */
public final class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V8Banner f77733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f77734b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/e$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f77735a;

        static {
            int[] iArr = new int[BannerPermission.values().length];
            try {
                iArr[BannerPermission.LOOP.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[BannerPermission.INDICATOR.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f77735a = iArr;
        }
    }

    public e(V8Banner v8Banner, f fVar) {
        this.f77733a = v8Banner;
        this.f77734b = fVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    @Override // com.bilibili.pegasus.holders.bannerv8.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(com.bilibili.pegasus.holders.bannerv8.y r7, int r8, com.bilibili.pegasus.holders.bannerv8.BannerPermission r9) throws kotlin.NoWhenBranchMatchedException {
        /*
            r6 = this;
            r0 = r6
            com.bilibili.pegasus.holders.bannerv8.V8Banner r0 = r0.f77733a
            r13 = r0
            r0 = r13
            int r0 = r0.getSelectPosition()
            r1 = r8
            if (r0 == r1) goto L2d
            r0 = r13
            int r0 = r0.getSelectPosition()
            r10 = r0
            r0 = r7
            java.lang.String r0 = r0.f77839f
            r7 = r0
            r0 = r10
            r1 = r8
            java.lang.String r2 = "only the selected item can operate banner. selected:"
            java.lang.String r3 = " operator:"
            java.lang.String r4 = " identity:"
            java.lang.StringBuilder r0 = Vn.A.b(r0, r1, r2, r3, r4)
            r1 = r7
            java.lang.String r2 = "BannerController"
            S9.b.a(r0, r1, r2)
        L2d:
            r0 = r6
            com.bilibili.pegasus.holders.bannerv8.f r0 = r0.f77734b
            r7 = r0
            r0 = r7
            boolean r0 = r0.f77741o
            if (r0 == 0) goto L47
            r0 = r9
            com.bilibili.pegasus.holders.bannerv8.BannerPermission r1 = com.bilibili.pegasus.holders.bannerv8.BannerPermission.LOOP
            if (r0 != r1) goto L47
            java.lang.String r0 = "BannerController"
            java.lang.String r1 = "current page is invisible, can't set the banner loop state"
            tv.danmaku.android.log.BLog.w(r0, r1)
        L47:
            int[] r0 = com.bilibili.pegasus.holders.bannerv8.e.a.f77735a
            r1 = r9
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r10 = r0
            r0 = 0
            r12 = r0
            r0 = r10
            r1 = 1
            if (r0 == r1) goto L7b
            r0 = r10
            r1 = 2
            if (r0 != r1) goto L73
            r0 = r12
            r11 = r0
            r0 = r13
            int r0 = r0.getSelectPosition()
            r1 = r8
            if (r0 != r1) goto L96
        L6d:
            r0 = 1
            r11 = r0
            goto L96
        L73:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r1 = r0
            r1.<init>()
            throw r0
        L7b:
            r0 = r12
            r11 = r0
            r0 = r13
            int r0 = r0.getSelectPosition()
            r1 = r8
            if (r0 != r1) goto L96
            r0 = r12
            r11 = r0
            r0 = r7
            boolean r0 = r0.f77741o
            if (r0 == 0) goto L96
            goto L6d
        L96:
            r0 = r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.bannerv8.e.a(com.bilibili.pegasus.holders.bannerv8.y, int, com.bilibili.pegasus.holders.bannerv8.BannerPermission):boolean");
    }
}
