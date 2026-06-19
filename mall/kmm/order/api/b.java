package com.bilibili.mall.kmm.order.api;

import com.bilibili.mall.kmm.order.model.MallOrderInfoBusinessType;
import fh0.C7086g0;
import fh0.C7092j0;
import fh0.X;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/order/api/b.class */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public X f65634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public WR0.b f65635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f65636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f65637d = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public String f65638e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public String f65639f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public Map<String, String> f65640g = new LinkedHashMap();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/order/api/b$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f65641a;

        static {
            int[] iArr = new int[MallOrderInfoBusinessType.values().length];
            try {
                iArr[MallOrderInfoBusinessType.BusinessNone.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[MallOrderInfoBusinessType.BusinessEquity.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[MallOrderInfoBusinessType.BusinessFreight.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[MallOrderInfoBusinessType.BusinessGood.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[MallOrderInfoBusinessType.BusinessShopDisCount.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr[MallOrderInfoBusinessType.BusinessShopNotice.ordinal()] = 6;
            } catch (NoSuchFieldError e12) {
            }
            try {
                iArr[MallOrderInfoBusinessType.BusinessDiscountDetails.ordinal()] = 7;
            } catch (NoSuchFieldError e13) {
            }
            try {
                iArr[MallOrderInfoBusinessType.BusinessGift.ordinal()] = 8;
            } catch (NoSuchFieldError e14) {
            }
            try {
                iArr[MallOrderInfoBusinessType.BusinessBuyerInfo.ordinal()] = 9;
            } catch (NoSuchFieldError e15) {
            }
            try {
                iArr[MallOrderInfoBusinessType.BusinessSubsidy.ordinal()] = 10;
            } catch (NoSuchFieldError e16) {
            }
            try {
                iArr[MallOrderInfoBusinessType.BusinessCoupon.ordinal()] = 11;
            } catch (NoSuchFieldError e17) {
            }
            try {
                iArr[MallOrderInfoBusinessType.BusinessShopCoupon.ordinal()] = 12;
            } catch (NoSuchFieldError e18) {
            }
            try {
                iArr[MallOrderInfoBusinessType.BusinessShopCouponDisCount.ordinal()] = 13;
            } catch (NoSuchFieldError e19) {
            }
            try {
                iArr[MallOrderInfoBusinessType.BusinessNationalSubsidy.ordinal()] = 14;
            } catch (NoSuchFieldError e20) {
            }
            f65641a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(@org.jetbrains.annotations.NotNull fh0.C7086g0 r3) {
        /*
            r0 = r3
            boolean r0 = r0.f118085M
            r5 = r0
            r0 = 0
            r7 = r0
            r0 = r5
            if (r0 == 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r3
            fh0.d0 r0 = r0.f118091f
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L2c
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r9 = r0
            r0 = r8
            java.lang.Boolean r0 = r0.f118025a
            r1 = r9
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            r5 = r0
            goto L2e
        L2c:
            r0 = 0
            r5 = r0
        L2e:
            r0 = r7
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L76
            r0 = r3
            fh0.C r0 = r0.f118090e
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L57
            r0 = r3
            java.lang.Integer r0 = r0.f117784e
            r3 = r0
            r0 = r3
            if (r0 != 0) goto L4a
            goto L57
        L4a:
            r0 = r3
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L57
            r0 = 1
            r4 = r0
            goto L59
        L57:
            r0 = 0
            r4 = r0
        L59:
            r0 = r4
            if (r0 != 0) goto L74
            r0 = r8
            if (r0 == 0) goto L6b
            r0 = r8
            fh0.c0 r0 = r0.f118027c
            r3 = r0
            goto L6d
        L6b:
            r0 = 0
            r3 = r0
        L6d:
            r0 = r7
            r6 = r0
            r0 = r3
            if (r0 == 0) goto L76
        L74:
            r0 = 1
            r6 = r0
        L76:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mall.kmm.order.api.b.c(fh0.g0):boolean");
    }

    public final C7086g0 a(C7092j0 c7092j0) {
        Object obj;
        X x6 = this.f65634a;
        C7086g0 c7086g0 = null;
        if (x6 != null) {
            List<C7086g0> list = x6.f117897C;
            c7086g0 = null;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (Intrinsics.areEqual(((C7086g0) next).f118087b, c7092j0 != null ? c7092j0.f118142a : null)) {
                        obj = next;
                        break;
                    }
                }
                c7086g0 = (C7086g0) obj;
            }
        }
        return c7086g0;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x08d3  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0957  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x09eb  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0a0e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0316  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.lang.Object> b() {
        /*
            Method dump skipped, instruction units count: 2721
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mall.kmm.order.api.b.b():java.util.Map");
    }
}
