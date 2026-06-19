package com.bilibili.pegasus.vm;

import G3.H;
import com.bilibili.gripper.api.ad.biz.pegasus.banner.AdBannerData;
import com.bilibili.pegasus.PegasusHolderData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/y.class */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f79096a = LazyKt.lazy(new H(8));

    public static final void a(List list) {
        int i7 = 0;
        for (int lastIndex = CollectionsKt.getLastIndex(list); -1 < lastIndex && ((PegasusHolderData) list.get(lastIndex)).getHolderStyle().isSmallCard(); lastIndex--) {
            i7++;
        }
        if (i7 % 2 != 0) {
            CollectionsKt.removeLastOrNull(list);
        }
    }

    public static final boolean b(List list) {
        int lastIndex = CollectionsKt.getLastIndex(list);
        boolean z6 = false;
        if (lastIndex >= 0) {
            ArrayList arrayList = (ArrayList) list;
            Object obj = arrayList.get(lastIndex);
            String cardType = null;
            fp0.o oVar = obj instanceof fp0.o ? (fp0.o) obj : null;
            if (oVar != null) {
                cardType = oVar.getCardType();
            }
            if (Intrinsics.areEqual(cardType, "footer_loading")) {
                arrayList.remove(CollectionsKt.getLastIndex(list));
                z6 = true;
            }
        }
        return z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean c(@org.jetbrains.annotations.NotNull com.bilibili.pegasus.PegasusHolderData r3) {
        /*
            r0 = r3
            boolean r0 = r0 instanceof fp0.o
            if (r0 == 0) goto L35
            r0 = r3
            fp0.o r0 = (fp0.o) r0
            r3 = r0
            r0 = r3
            java.lang.String r0 = r0.getCardType()
            java.lang.String r1 = "pull_down_tip_v1"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L30
            r0 = r3
            java.lang.String r0 = r0.getCardType()
            java.lang.String r1 = "pull_down_tip_v2"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L30
            r0 = r3
            java.lang.String r0 = r0.getCardType()
            java.lang.String r1 = "pull_down_tip_v3"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L35
        L30:
            r0 = 1
            r4 = r0
            goto L37
        L35:
            r0 = 0
            r4 = r0
        L37:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.vm.y.c(com.bilibili.pegasus.PegasusHolderData):boolean");
    }

    public static final boolean d(List<? extends PegasusHolderData> list) {
        Object orNull = CollectionsKt.getOrNull(list, 0);
        gp0.c cVar = orNull instanceof gp0.c ? (gp0.c) orNull : null;
        boolean z6 = false;
        if (cVar != null) {
            List<gp0.b> listK = cVar.k();
            z6 = false;
            if (listK != null) {
                gp0.b bVar = (gp0.b) CollectionsKt.getOrNull(listK, 0);
                z6 = false;
                if (bVar != null) {
                    AdBannerData adBannerDataA = bVar.a();
                    z6 = false;
                    if (adBannerDataA != null) {
                        z6 = false;
                        if (adBannerDataA.isTopView()) {
                            z6 = true;
                        }
                    }
                }
            }
        }
        return z6;
    }
}
