package com.bilibili.mall.kmm.order.combine;

import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/order/combine/a.class */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MallCombineOrderPageVM f65656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f65657b;

    public /* synthetic */ a(MallCombineOrderPageVM mallCombineOrderPageVM, boolean z6) {
        this.f65656a = mallCombineOrderPageVM;
        this.f65657b = z6;
    }

    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        MallCombineOrderPageVM mallCombineOrderPageVM = this.f65656a;
        if (zBooleanValue) {
            Map mapMapOf = MapsKt.mapOf(new Pair[]{TuplesKt.to("merchantId", mallCombineOrderPageVM.d().f65666g), TuplesKt.to("item_id", mallCombineOrderPageVM.d().f65664e), TuplesKt.to("sku_id", mallCombineOrderPageVM.d().f65665f), TuplesKt.to("options", this.f65657b ? "2" : "1")});
            WR0.c cVar = mallCombineOrderPageVM.f65650f;
            if (cVar != null) {
                cVar.e("mall.mall-order.change-quantity.0.click", MapsKt.plus(mapMapOf, mallCombineOrderPageVM.f65653j), true);
            }
            mallCombineOrderPageVM.g();
        } else {
            mallCombineOrderPageVM.h();
        }
        return Unit.INSTANCE;
    }
}
