package com.bilibili.ogv.operation3.module.vcards3x2;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.bilibili.ogv.operation3.module.switchit.i;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/vcards3x2/g.class */
public final class g implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableState<List<i>> f71464a;

    public g(MutableState<List<i>> mutableState) {
        this.f71464a = mutableState;
    }

    public final Object invoke(Object obj) {
        List<i> value = this.f71464a.getValue();
        ((LazyListScope) obj).items(value.size(), null, new e(value), ComposableLambdaKt.composableLambdaInstance(802480018, true, new f(value)));
        return Unit.INSTANCE;
    }
}
