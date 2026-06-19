package com.bilibili.mall.kmm.order.combine;

import F3.C1781m0;
import F3.C1789n0;
import F3.C1797o0;
import com.bilibili.mall.kmm.order.MallOrderInfoState;
import com.bilibili.mall.kmm.order.model.MallOrderInfoBusinessType;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import dh0.C6813a;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/order/combine/MallCombineOrderPageVM.class */
@ObjCExportAll(kind = ObjCExportAll.Kind.CALLABLE)
public final class MallCombineOrderPageVM {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f65645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<String, Object> f65646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f65647c = LazyKt.lazy(new C1781m0(11));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f65648d = LazyKt.lazy(new C1789n0(11));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<MallOrderInfoState<C6813a>> f65649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public WR0.c f65650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Lazy f65651g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public String f65652i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public Map<String, String> f65653j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final SharedFlow f65654k;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/order/combine/MallCombineOrderPageVM$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f65655a;

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
                iArr[MallOrderInfoBusinessType.BusinessOrderExpenseDiscount.ordinal()] = 10;
            } catch (NoSuchFieldError e16) {
            }
            try {
                iArr[MallOrderInfoBusinessType.BusinessSubsidy.ordinal()] = 11;
            } catch (NoSuchFieldError e17) {
            }
            try {
                iArr[MallOrderInfoBusinessType.BusinessCoupon.ordinal()] = 12;
            } catch (NoSuchFieldError e18) {
            }
            try {
                iArr[MallOrderInfoBusinessType.BusinessShopCoupon.ordinal()] = 13;
            } catch (NoSuchFieldError e19) {
            }
            try {
                iArr[MallOrderInfoBusinessType.BusinessShopCouponDisCount.ordinal()] = 14;
            } catch (NoSuchFieldError e20) {
            }
            try {
                iArr[MallOrderInfoBusinessType.BusinessNationalSubsidy.ordinal()] = 15;
            } catch (NoSuchFieldError e21) {
            }
            f65655a = iArr;
        }
    }

    @ObjCExport
    public MallCombineOrderPageVM(@NotNull Map map, @NotNull CoroutineScope coroutineScope) {
        this.f65645a = coroutineScope;
        this.f65646b = map;
        MutableStateFlow<MallOrderInfoState<C6813a>> MutableStateFlow = StateFlowKt.MutableStateFlow(new MallOrderInfoState((MallOrderInfoState.MallOrderInfoStatus) null, 3));
        this.f65649e = MutableStateFlow;
        this.f65651g = LazyKt.lazy(new C1797o0(12));
        this.f65653j = new LinkedHashMap();
        this.f65654k = FlowKt.asSharedFlow(MutableStateFlow);
    }

    public static final Object a(MallCombineOrderPageVM mallCombineOrderPageVM, MutableStateFlow mutableStateFlow, C6813a c6813a, SuspendLambda suspendLambda) {
        mallCombineOrderPageVM.getClass();
        Object objEmit = mutableStateFlow.emit(new MallOrderInfoState(MallOrderInfoState.MallOrderInfoStatus.SUCCESS, c6813a), suspendLambda);
        if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objEmit = Unit.INSTANCE;
        }
        return objEmit;
    }

    public static final void b(MallCombineOrderPageVM mallCombineOrderPageVM, boolean z6) {
        Map mapMapOf = MapsKt.mapOf(new Pair[]{TuplesKt.to("merchantId", mallCombineOrderPageVM.d().f65666g), TuplesKt.to("item_id", mallCombineOrderPageVM.d().f65664e), TuplesKt.to("sku_id", mallCombineOrderPageVM.d().f65665f), TuplesKt.to("type", z6 ? "1" : "0")});
        WR0.c cVar = mallCombineOrderPageVM.f65650f;
        if (cVar != null) {
            cVar.e("mall.mall-order.pay.0.click", MapsKt.plus(mapMapOf, mallCombineOrderPageVM.f65653j), true);
        }
    }

    public static Object i(MutableStateFlow mutableStateFlow, Object obj, SuspendLambda suspendLambda) {
        Object objEmit = mutableStateFlow.emit(new MallOrderInfoState(MallOrderInfoState.MallOrderInfoStatus.ERROR, obj), suspendLambda);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }

    public static Object j(MallCombineOrderPageVM mallCombineOrderPageVM, MutableStateFlow mutableStateFlow, SuspendLambda suspendLambda) {
        mallCombineOrderPageVM.getClass();
        Object objEmit = mutableStateFlow.emit(new MallOrderInfoState(MallOrderInfoState.MallOrderInfoStatus.NONE, (Object) null), suspendLambda);
        if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objEmit = Unit.INSTANCE;
        }
        return objEmit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            Method dump skipped, instruction units count: 1104
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mall.kmm.order.combine.MallCombineOrderPageVM.c():void");
    }

    public final com.bilibili.mall.kmm.order.combine.api.b d() {
        return (com.bilibili.mall.kmm.order.combine.api.b) this.f65651g.getValue();
    }

    public final void e(@NotNull Map<String, ? extends Object> map) {
        Map mutableMap = MapsKt.toMutableMap(map);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj = mutableMap.get("from");
        String str = obj instanceof String ? (String) obj : null;
        if (str != null && str.length() > 0) {
            this.f65653j.put("from", str);
        }
        Object obj2 = mutableMap.get(MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_MSOURCE);
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        if (str2 != null && str2.length() > 0) {
            this.f65653j.put(MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_MSOURCE, str2);
            linkedHashMap.put("mSource", str2);
        }
        Object obj3 = mutableMap.get("track_id");
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        if (str3 != null && str3.length() > 0) {
            this.f65653j.put("track_id", str3);
            linkedHashMap.put("trackId", str3);
        }
        if (!linkedHashMap.isEmpty()) {
            mutableMap.put("trackParam", linkedHashMap);
        }
        this.f65649e.setValue(new MallOrderInfoState(MallOrderInfoState.MallOrderInfoStatus.LOADING, 2));
        d().f65662c = this.f65652i;
        BuildersKt.launch$default(this.f65645a, (CoroutineContext) null, (CoroutineStart) null, new MallCombineOrderPageVM$loadData$4(this, mutableMap, null), 3, (Object) null);
    }

    public final void f(@NotNull String str, @NotNull Map<String, String> map, boolean z6) {
        Map mapMapOf = MapsKt.mapOf(new Pair[]{TuplesKt.to("merchantId", d().f65666g), TuplesKt.to("item_id", d().f65664e), TuplesKt.to("sku_id", d().f65665f)});
        WR0.c cVar = this.f65650f;
        if (cVar != null) {
            cVar.e(str, MapsKt.plus(MapsKt.plus(map, mapMapOf), this.f65653j), z6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0899  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0969  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0326  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            Method dump skipped, instruction units count: 2752
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mall.kmm.order.combine.MallCombineOrderPageVM.g():void");
    }

    public final void h() {
        BuildersKt.launch$default(this.f65645a, (CoroutineContext) null, (CoroutineStart) null, new MallCombineOrderPageVM$reloadData$1(this, null), 3, (Object) null);
    }
}
