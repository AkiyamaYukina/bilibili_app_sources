package com.bilibili.mall.kmm.order.combine.api;

import ch0.C5258b;
import ch0.d;
import com.bilibili.mall.kmm.order.model.MallOrderInfoBusinessType;
import fh0.C7055A;
import fh0.C7057C;
import fh0.C7078c0;
import fh0.C7080d0;
import fh0.C7088h0;
import fh0.C7092j0;
import fh0.C7099o;
import fh0.C7100p;
import fh0.C7101q;
import fh0.X;
import fh0.n0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/order/combine/api/b.class */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public X f65660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public WR0.c f65661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f65662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f65663d = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public String f65664e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public String f65665f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public String f65666g = "";

    @NotNull
    public Map<String, String> h = new LinkedHashMap();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/order/combine/api/b$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f65667a;

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
                iArr[MallOrderInfoBusinessType.BusinessOrderExpenseDiscount.ordinal()] = 14;
            } catch (NoSuchFieldError e20) {
            }
            try {
                iArr[MallOrderInfoBusinessType.BusinessNationalSubsidy.ordinal()] = 15;
            } catch (NoSuchFieldError e21) {
            }
            f65667a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Map a(C7101q c7101q) {
        int i7;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C7080d0 c7080d0 = c7101q.f118275b;
        if (c7080d0 == null) {
            return linkedHashMap;
        }
        C7078c0 c7078c0 = c7080d0.f118027c;
        if (c7078c0 != null) {
            List<C7055A> list = c7078c0.f118018l;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (C7055A c7055a : list) {
                    if (c7055a != null) {
                        Long l7 = c7055a.f117757a;
                        Pair pair = TuplesKt.to("activityId", Long.valueOf(l7 != null ? l7.longValue() : 0L));
                        Integer num = c7055a.f117758b;
                        Pair pair2 = TuplesKt.to("type", Integer.valueOf(num != null ? num.intValue() : 0));
                        String str = c7055a.f117759c;
                        String str2 = str;
                        if (str == null) {
                            str2 = "";
                        }
                        arrayList.add(MapsKt.mapOf(new Pair[]{pair, pair2, TuplesKt.to("marketingId", str2)}));
                    }
                }
                linkedHashMap.put("activityInfos", arrayList);
            }
            Integer num2 = c7078c0.f118013f;
            if (num2 != null) {
                linkedHashMap.put("discountMoney", Integer.valueOf(num2.intValue()));
            }
            Integer num3 = c7078c0.f118011d;
            if (num3 == null) {
                i7 = 0;
            } else {
                i7 = 0;
                if (num3.intValue() == 1) {
                    i7 = 1;
                }
            }
            linkedHashMap.put("activitySelected", Integer.valueOf(i7));
            linkedHashMap.put("couponChecked", Boolean.valueOf(i7 ^ 1));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean i(@org.jetbrains.annotations.NotNull ch0.C5258b r3) {
        /*
            r0 = r3
            boolean r0 = r0.f58889J
            r5 = r0
            r0 = 0
            r7 = r0
            r0 = r5
            if (r0 == 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r3
            fh0.d0 r0 = r0.f58901m
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L2c
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r9 = r0
            r0 = r8
            java.lang.Boolean r0 = r0.f118025a
            r1 = r9
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            r6 = r0
            goto L2e
        L2c:
            r0 = 0
            r6 = r0
        L2e:
            r0 = r7
            r5 = r0
            r0 = r6
            if (r0 == 0) goto L76
            r0 = r3
            fh0.C r0 = r0.f58900l
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
            r5 = r0
            r0 = r3
            if (r0 == 0) goto L76
        L74:
            r0 = 1
            r5 = r0
        L76:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mall.kmm.order.combine.api.b.i(ch0.b):boolean");
    }

    public final List<n0> b() {
        List<C5258b> list;
        List<n0> list2;
        ArrayList arrayList = new ArrayList();
        X x6 = this.f65660a;
        if (x6 != null && (list2 = x6.f117906G0) != null) {
            arrayList.addAll(list2);
        }
        X x7 = this.f65660a;
        if (x7 != null && (list = x7.f117910I0) != null) {
            for (C5258b c5258b : list) {
                List<n0> list3 = c5258b.f58911w;
                if (list3 != null) {
                    arrayList.addAll(list3);
                }
                List<d> list4 = c5258b.f58899k;
                if (list4 != null) {
                    for (d dVar : list4) {
                        List<n0> list5 = dVar.f58932e;
                        if (list5 != null) {
                            arrayList.addAll(list5);
                        }
                        List<ch0.c> list6 = dVar.f58931d;
                        if (list6 != null) {
                            Iterator<T> it = list6.iterator();
                            while (it.hasNext()) {
                                List<n0> list7 = ((ch0.c) it.next()).f58923f;
                                if (list7 != null) {
                                    arrayList.addAll(list7);
                                }
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final C5258b c(C7092j0 c7092j0) {
        Object obj;
        Integer num;
        List<C5258b> list;
        Object next;
        if (c7092j0 != null && (num = c7092j0.f118148g) != null) {
            int iIntValue = num.intValue();
            X x6 = this.f65660a;
            if (x6 != null && (list = x6.f117910I0) != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    Integer num2 = ((C5258b) next).f58890a;
                    if (num2 != null && num2.intValue() == iIntValue) {
                        break;
                    }
                }
                C5258b c5258b = (C5258b) next;
                if (c5258b != null) {
                    return c5258b;
                }
            }
        }
        X x7 = this.f65660a;
        C5258b c5258b2 = null;
        if (x7 != null) {
            List<C5258b> list2 = x7.f117910I0;
            c5258b2 = null;
            if (list2 != null) {
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    obj = null;
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    if (Intrinsics.areEqual(((C5258b) next2).f58895f, c7092j0 != null ? c7092j0.f118142a : null)) {
                        obj = next2;
                        break;
                    }
                }
                c5258b2 = (C5258b) obj;
            }
        }
        return c5258b2;
    }

    public final String d() {
        List<C7100p> list;
        Object next;
        C7080d0 c7080d0;
        C7057C c7057c;
        String str;
        C7057C c7057c2;
        Integer num;
        Integer num2;
        List<n0> listB = b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB) {
            n0 n0Var = (n0) obj;
            Integer num3 = n0Var.f118218a;
            if (num3 != null && num3.intValue() == 5 && (num2 = n0Var.f118235s) != null && num2.intValue() == 2) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C7099o c7099o = ((n0) it.next()).f118231o;
            if (c7099o != null && (list = c7099o.f118240b) != null) {
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    List<C7101q> list2 = ((C7100p) it2.next()).f118259d;
                    if (list2 != null) {
                        Iterator<T> it3 = list2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                            C7080d0 c7080d02 = ((C7101q) next).f118275b;
                            if (c7080d02 != null && (c7057c2 = c7080d02.f118028d) != null && (num = c7057c2.f117784e) != null && num.intValue() == 1) {
                                break;
                            }
                        }
                        C7101q c7101q = (C7101q) next;
                        if (c7101q != null && (c7080d0 = c7101q.f118275b) != null && (c7057c = c7080d0.f118028d) != null && (str = c7057c.f117785f) != null) {
                            return str;
                        }
                    }
                }
            }
        }
        return null;
    }

    public final String e() {
        List<C7100p> list;
        Object next;
        C7080d0 c7080d0;
        C7057C c7057c;
        String str;
        C7057C c7057c2;
        Integer num;
        Integer num2;
        List<n0> listB = b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB) {
            n0 n0Var = (n0) obj;
            Integer num3 = n0Var.f118218a;
            if (num3 != null && num3.intValue() == 5 && (num2 = n0Var.f118235s) != null && num2.intValue() == 5) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C7099o c7099o = ((n0) it.next()).f118231o;
            if (c7099o != null && (list = c7099o.f118240b) != null) {
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    List<C7101q> list2 = ((C7100p) it2.next()).f118259d;
                    if (list2 != null) {
                        Iterator<T> it3 = list2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                            C7080d0 c7080d02 = ((C7101q) next).f118275b;
                            if (c7080d02 != null && (c7057c2 = c7080d02.f118028d) != null && (num = c7057c2.f117784e) != null && num.intValue() == 1) {
                                break;
                            }
                        }
                        C7101q c7101q = (C7101q) next;
                        if (c7101q != null && (c7080d0 = c7101q.f118275b) != null && (c7057c = c7080d0.f118028d) != null && (str = c7057c.f117785f) != null) {
                            return str;
                        }
                    }
                }
            }
        }
        return null;
    }

    public final String f(String str) {
        List<C7100p> list;
        Object obj;
        List<C7101q> list2;
        Object next;
        C7080d0 c7080d0;
        C7057C c7057c;
        String str2;
        C7057C c7057c2;
        Integer num;
        Integer num2;
        if (str == null || str.length() == 0) {
            return null;
        }
        List<n0> listB = b();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listB) {
            n0 n0Var = (n0) obj2;
            Integer num3 = n0Var.f118218a;
            if (num3 != null && num3.intValue() == 5 && (((num2 = n0Var.f118235s) != null && num2.intValue() == 4) || (num2 != null && num2.intValue() == 3))) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C7099o c7099o = ((n0) it.next()).f118231o;
            if (c7099o != null && (list = c7099o.f118240b) != null) {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    Object next2 = it2.next();
                    Long l7 = ((C7100p) next2).f118258c;
                    if (Intrinsics.areEqual(l7 != null ? String.valueOf(l7.longValue()) : null, str)) {
                        obj = next2;
                        break;
                    }
                }
                C7100p c7100p = (C7100p) obj;
                if (c7100p != null && (list2 = c7100p.f118259d) != null) {
                    Iterator<T> it3 = list2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                        C7080d0 c7080d02 = ((C7101q) next).f118275b;
                        if (c7080d02 != null && (c7057c2 = c7080d02.f118028d) != null && (num = c7057c2.f117784e) != null && num.intValue() == 1) {
                            break;
                        }
                    }
                    C7101q c7101q = (C7101q) next;
                    if (c7101q != null && (c7080d0 = c7101q.f118275b) != null && (c7057c = c7080d0.f118028d) != null && (str2 = c7057c.f117785f) != null) {
                        return str2;
                    }
                }
            }
        }
        return null;
    }

    public final C7101q g(String str) {
        List<C7100p> list;
        Object obj;
        List<C7101q> list2;
        C7101q c7101q;
        if (str == null || str.length() == 0) {
            return null;
        }
        List<n0> listB = b();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listB) {
            Integer num = ((n0) obj2).f118218a;
            if (num != null && num.intValue() == 5) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C7099o c7099o = ((n0) it.next()).f118231o;
            if (c7099o != null && (list = c7099o.f118240b) != null) {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    Object next = it2.next();
                    Long l7 = ((C7100p) next).f118258c;
                    if (Intrinsics.areEqual(l7 != null ? String.valueOf(l7.longValue()) : null, str)) {
                        obj = next;
                        break;
                    }
                }
                C7100p c7100p = (C7100p) obj;
                if (c7100p != null && (list2 = c7100p.f118259d) != null && (c7101q = (C7101q) CollectionsKt.firstOrNull(list2)) != null) {
                    return c7101q;
                }
            }
        }
        return null;
    }

    public final C7088h0 h() {
        for (n0 n0Var : b()) {
            Integer num = n0Var.f118218a;
            if (num != null && num.intValue() == 6) {
                return n0Var.f118230n;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x07a6  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0b05  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0b8a  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0c79  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0c9c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02b0  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.lang.Object> j() {
        /*
            Method dump skipped, instruction units count: 3394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mall.kmm.order.combine.api.b.j():java.util.Map");
    }

    public final boolean k(String str) {
        List<C7100p> list;
        Integer num;
        boolean z6 = false;
        if (str != null) {
            if (str.length() == 0) {
                z6 = false;
            } else {
                List<n0> listB = b();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listB) {
                    n0 n0Var = (n0) obj;
                    Integer num2 = n0Var.f118218a;
                    if (num2 != null && num2.intValue() == 5 && (((num = n0Var.f118235s) != null && num.intValue() == 4) || (num != null && num.intValue() == 3))) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    z6 = false;
                } else {
                    Iterator it = arrayList.iterator();
                    loop1: while (true) {
                        z6 = false;
                        if (!it.hasNext()) {
                            break;
                        }
                        C7099o c7099o = ((n0) it.next()).f118231o;
                        if (c7099o != null && (list = c7099o.f118240b) != null) {
                            List<C7100p> list2 = list;
                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                Iterator<T> it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    Long l7 = ((C7100p) it2.next()).f118258c;
                                    if (Intrinsics.areEqual(l7 != null ? String.valueOf(l7.longValue()) : null, str)) {
                                        z6 = true;
                                        break loop1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return z6;
    }
}
