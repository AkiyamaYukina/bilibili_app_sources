package com.bilibili.search2.discover;

import androidx.recyclerview.widget.GridLayoutManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/discover/e.class */
public final class e extends GridLayoutManager.SpanSizeLookup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliMainSearchDiscoverFragment f86432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f86433b;

    public e(BiliMainSearchDiscoverFragment biliMainSearchDiscoverFragment, int i7) {
        this.f86432a = biliMainSearchDiscoverFragment;
        this.f86433b = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int getSpanSize(int r6) {
        /*
            r5 = this;
            boolean r0 = com.bilibili.search2.component.a.b()
            r10 = r0
            r0 = 1
            r8 = r0
            r0 = r5
            com.bilibili.search2.discover.BiliMainSearchDiscoverFragment r0 = r0.f86432a
            r13 = r0
            r0 = r10
            if (r0 != 0) goto L17
        L12:
            r0 = 1
            r7 = r0
            goto L2e
        L17:
            r0 = r13
            androidx.fragment.app.FragmentActivity r0 = r0.p3()
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L12
            r0 = r11
            androidx.window.core.layout.WindowSizeClass r0 = com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt.windowSize(r0)
            boolean r0 = kntr.common.screen.adjust.KScreenAdjustUtilsKt.widthBreakPointLarge(r0)
            r1 = 1
            r0 = r0 ^ r1
            r7 = r0
        L2e:
            r0 = r5
            int r0 = r0.f86433b
            r9 = r0
            r0 = r7
            if (r0 == 0) goto L3b
            r0 = r9
            return r0
        L3b:
            r0 = r13
            com.bilibili.bplus.baseplus.NestedCompatRecycleView r0 = r0.h
            r12 = r0
            r0 = r12
            r11 = r0
            r0 = r12
            if (r0 != 0) goto L53
            java.lang.String r0 = "mDiscoverList"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
            r11 = r0
        L53:
            r0 = r11
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
            r11 = r0
            r0 = r11
            if (r0 == 0) goto Lba
            r0 = r11
            r1 = r6
            int r0 = r0.getItemViewType(r1)
            r6 = r0
            r0 = r13
            com.bilibili.search2.discover.p r0 = r0.of()
            kotlinx.coroutines.flow.StateFlow<com.bilibili.search2.discover.n> r0 = r0.f86464k
            java.lang.Object r0 = r0.getValue()
            com.bilibili.search2.discover.n r0 = (com.bilibili.search2.discover.n) r0
            r12 = r0
            r0 = r12
            r11 = r0
            r0 = r12
            if (r0 != 0) goto L8c
            com.bilibili.search2.discover.n r0 = new com.bilibili.search2.discover.n
            r1 = r0
            r2 = 0
            r3 = 0
            r1.<init>(r2, r3)
            r11 = r0
        L8c:
            r0 = r6
            r1 = 6
            if (r0 == r1) goto La8
            r0 = r6
            r1 = 8
            if (r0 == r1) goto L9b
            goto Lb5
        L9b:
            r0 = r11
            boolean r0 = r0.f86451b
            if (r0 == 0) goto Lb5
            r0 = r8
            r6 = r0
            goto Lb8
        La8:
            r0 = r11
            boolean r0 = r0.f86450a
            if (r0 == 0) goto Lb5
            r0 = r8
            r6 = r0
            goto Lb8
        Lb5:
            r0 = r9
            r6 = r0
        Lb8:
            r0 = r6
            return r0
        Lba:
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.discover.e.getSpanSize(int):int");
    }
}
