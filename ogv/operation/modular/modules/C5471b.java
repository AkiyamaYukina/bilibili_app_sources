package com.bilibili.ogv.operation.modular.modules;

import android.content.Context;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.ogv.opbase.CommonCard;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import v.C8770a;

/* JADX INFO: renamed from: com.bilibili.ogv.operation.modular.modules.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/b.class */
public final /* synthetic */ class C5471b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f70431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5473d f70432b;

    public /* synthetic */ C5471b(List list, C5473d c5473d) {
        this.f70431a = list;
        this.f70432b = c5473d;
    }

    public final Object invoke(Object obj) {
        String str;
        Integer intOrNull;
        CommonCard commonCard = (CommonCard) CollectionsKt.getOrNull(this.f70431a, ((Integer) obj).intValue());
        StringBuilder sb = new StringBuilder("pgc.");
        C5473d c5473d = this.f70432b;
        String strA = C8770a.a(sb, c5473d.f70601c, ".operation.works.click");
        Map<String, String> map = commonCard != null ? commonCard.f69701D0 : null;
        Map<String, String> mapEmptyMap = map;
        if (map == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        Neurons.reportClick(false, strA, mapEmptyMap);
        if (((commonCard == null || (str = commonCard.f69763i) == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) ? 0 : intOrNull.intValue()) > 0) {
            if (commonCard != null) {
                commonCard.f69763i = "";
            }
            c5473d.f70605g.notifyDataSetChanged();
        }
        String str2 = null;
        if (commonCard != null) {
            str2 = commonCard.f69732T;
        }
        boolean zAreEqual = Intrinsics.areEqual("login", str2);
        Pk0.w wVar = c5473d.f70599a;
        if (!zAreEqual) {
            wVar.K7(commonCard, new Pair[0]);
        } else if (com.bilibili.ogv.infra.account.a.f67852b.isLogin()) {
            wVar.K7(commonCard, new Pair[0]);
        } else {
            Context context = c5473d.itemView.getContext();
            String str3 = commonCard.f69795y;
            RouteRequest.Builder builder = new RouteRequest.Builder("activity://main/login/");
            if (str3.length() != 0) {
                builder.forward(new RouteRequest.Builder(str3).build());
            }
            Qj0.g.c(context, builder.build());
        }
        return Unit.INSTANCE;
    }
}
