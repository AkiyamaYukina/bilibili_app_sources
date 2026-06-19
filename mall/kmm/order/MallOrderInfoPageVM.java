package com.bilibili.mall.kmm.order;

import F3.C1693b0;
import F3.C1701c0;
import F3.C1709d0;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.mall.kmm.order.MallOrderInfoState;
import com.bilibili.mall.kmm.order.model.MallOrderInfoBusinessType;
import gh0.u;
import java.util.LinkedHashMap;
import java.util.Map;
import kntr.kotlin.native.ObjCExport;
import kntr.kotlin.native.ObjCExportAll;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/order/MallOrderInfoPageVM.class */
@ObjCExportAll(kind = ObjCExportAll.Kind.CALLABLE)
public final class MallOrderInfoPageVM {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f65618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<String, Object> f65619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f65620c = LazyKt.lazy(new C1693b0(12));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f65621d = LazyKt.lazy(new C1701c0(10));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<MallOrderInfoState<u>> f65622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public WR0.b f65623f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Lazy f65624g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public String f65625i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public Map<String, String> f65626j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final SharedFlow f65627k;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/order/MallOrderInfoPageVM$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f65628a;

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
                iArr[MallOrderInfoBusinessType.BusinessShopNotice.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr[MallOrderInfoBusinessType.BusinessShopDisCount.ordinal()] = 6;
            } catch (NoSuchFieldError e12) {
            }
            try {
                iArr[MallOrderInfoBusinessType.BusinessGift.ordinal()] = 7;
            } catch (NoSuchFieldError e13) {
            }
            try {
                iArr[MallOrderInfoBusinessType.BusinessBuyerInfo.ordinal()] = 8;
            } catch (NoSuchFieldError e14) {
            }
            try {
                iArr[MallOrderInfoBusinessType.BusinessDiscountDetails.ordinal()] = 9;
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
            f65628a = iArr;
        }
    }

    @ObjCExport
    public MallOrderInfoPageVM(@NotNull Map map, @NotNull CoroutineScope coroutineScope) {
        this.f65618a = coroutineScope;
        this.f65619b = map;
        MutableStateFlow<MallOrderInfoState<u>> MutableStateFlow = StateFlowKt.MutableStateFlow(new MallOrderInfoState((MallOrderInfoState.MallOrderInfoStatus) null, 3));
        this.f65622e = MutableStateFlow;
        this.f65624g = LazyKt.lazy(new C1709d0(13));
        this.f65626j = new LinkedHashMap();
        this.f65627k = FlowKt.asSharedFlow(MutableStateFlow);
    }

    public static final Object a(MallOrderInfoPageVM mallOrderInfoPageVM, MutableStateFlow mutableStateFlow, u uVar, SuspendLambda suspendLambda) {
        mallOrderInfoPageVM.getClass();
        Object objEmit = mutableStateFlow.emit(new MallOrderInfoState(MallOrderInfoState.MallOrderInfoStatus.SUCCESS, uVar), suspendLambda);
        if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objEmit = Unit.INSTANCE;
        }
        return objEmit;
    }

    public static final void b(MallOrderInfoPageVM mallOrderInfoPageVM, boolean z6) {
        Map mapMapOf = MapsKt.mapOf(new Pair[]{TuplesKt.to("merchantId", mallOrderInfoPageVM.d().f65639f), TuplesKt.to("itemsId", mallOrderInfoPageVM.d().f65638e), TuplesKt.to("type", z6 ? "1" : "0")});
        WR0.b bVar = mallOrderInfoPageVM.f65623f;
        if (bVar != null) {
            bVar.e("mall.mall-order.pay.0.click", MapsKt.plus(mapMapOf, mallOrderInfoPageVM.f65626j), true);
        }
    }

    public static Object h(MutableStateFlow mutableStateFlow, Object obj, SuspendLambda suspendLambda) {
        Object objEmit = mutableStateFlow.emit(new MallOrderInfoState(MallOrderInfoState.MallOrderInfoStatus.ERROR, obj), suspendLambda);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }

    public static Object i(MallOrderInfoPageVM mallOrderInfoPageVM, MutableStateFlow mutableStateFlow, SuspendLambda suspendLambda) {
        mallOrderInfoPageVM.getClass();
        Object objEmit = mutableStateFlow.emit(new MallOrderInfoState(MallOrderInfoState.MallOrderInfoStatus.NONE, (Object) null), suspendLambda);
        if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objEmit = Unit.INSTANCE;
        }
        return objEmit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0290  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            Method dump skipped, instruction units count: 1161
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mall.kmm.order.MallOrderInfoPageVM.c():void");
    }

    public final com.bilibili.mall.kmm.order.api.b d() {
        return (com.bilibili.mall.kmm.order.api.b) this.f65624g.getValue();
    }

    public final void e(@NotNull Map<String, ? extends Object> map) {
        Object obj = map.get("from");
        String str = obj instanceof String ? (String) obj : null;
        if (str != null && str.length() > 0) {
            this.f65626j.put("from", str);
        }
        Object obj2 = map.get(GameCardButton.extraParamSource);
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        if (str2 != null && str2.length() > 0) {
            this.f65626j.put(GameCardButton.extraParamSource, str2);
        }
        Object obj3 = map.get("track_id");
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        if (str3 != null && str3.length() > 0) {
            this.f65626j.put("track_id", str3);
        }
        this.f65622e.setValue(new MallOrderInfoState(MallOrderInfoState.MallOrderInfoStatus.LOADING, 2));
        d().f65636c = this.f65625i;
        BuildersKt.launch$default(this.f65618a, (CoroutineContext) null, (CoroutineStart) null, new MallOrderInfoPageVM$loadData$4(this, map, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x031f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instruction units count: 1956
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mall.kmm.order.MallOrderInfoPageVM.f():void");
    }

    public final void g() {
        BuildersKt.launch$default(this.f65618a, (CoroutineContext) null, (CoroutineStart) null, new MallOrderInfoPageVM$reloadData$1(this, null), 3, (Object) null);
    }
}
