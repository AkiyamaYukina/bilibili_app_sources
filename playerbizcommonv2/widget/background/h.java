package com.bilibili.playerbizcommonv2.widget.background;

import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.playerbizcommonv2.utils.p;
import com.bilibili.playerbizcommonv2.widget.background.c;
import java.util.Map;
import kotlin.Function;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/background/h.class */
public final /* synthetic */ class h implements FlowCollector, FunctionAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f82332a;

    public h(g gVar) {
        this.f82332a = gVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
        c.a aVar = (c.a) obj;
        g gVar = this.f82332a;
        gVar.getClass();
        boolean zAreEqual = Intrinsics.areEqual(aVar, c.a.C0536a.f82305a);
        Function1<Boolean, Unit> function1 = gVar.f82323b;
        MutableStateFlow<Boolean> mutableStateFlow = gVar.f82325d;
        if (zAreEqual) {
            mutableStateFlow.setValue(Boolean.FALSE);
            function1.invoke(Boolean.TRUE);
        } else {
            boolean zAreEqual2 = Intrinsics.areEqual(aVar, c.a.C0537c.f82307a);
            Function2<String, Map<String, String>, Unit> function2 = gVar.f82324c;
            if (zAreEqual2) {
                p.k(FoundationAlias.getFapp().getApplicationContext().getString(2131847379));
                function2.invoke("click", MapsKt.hashMapOf(new Pair[]{TuplesKt.to("action_type", String.valueOf(2))}));
                Boolean bool = Boolean.FALSE;
                mutableStateFlow.setValue(bool);
                function1.invoke(bool);
            } else {
                if (!Intrinsics.areEqual(aVar, c.a.b.f82306a)) {
                    throw new NoWhenBranchMatchedException();
                }
                function2.invoke("click", MapsKt.hashMapOf(new Pair[]{TuplesKt.to("action_type", String.valueOf(1))}));
                mutableStateFlow.setValue(Boolean.FALSE);
                function1.invoke(Boolean.TRUE);
            }
        }
        Unit unit = Unit.INSTANCE;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return unit;
    }

    public final boolean equals(Object obj) {
        boolean zAreEqual = false;
        if (obj instanceof FlowCollector) {
            zAreEqual = false;
            if (obj instanceof FunctionAdapter) {
                zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
        }
        return zAreEqual;
    }

    public final Function<?> getFunctionDelegate() {
        return new AdaptedFunctionReference(2, this.f82332a, g.class, "handleEvent", "handleEvent(Lcom/bilibili/playerbizcommonv2/widget/background/BackgroundPlayDialogComponent$BackgroundPlayDialogEvent;)V", 4);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
