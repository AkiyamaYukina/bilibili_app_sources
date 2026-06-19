package com.bilibili.pegasus.vm;

import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.pegasus.data.base.PegasusResponse;
import com.bilibili.pegasus.data.request.PegasusResponseWrapper;
import kotlin.Function;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/G.class */
public final class G {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/G$a.class */
    public static final /* synthetic */ class a implements FlowCollector, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function2 f79006a;

        public a(Function2 function2) {
            this.f79006a = function2;
        }

        public final /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return this.f79006a.invoke(obj, continuation);
        }

        public final boolean equals(@Nullable Object obj) {
            boolean zAreEqual = false;
            if (obj instanceof FlowCollector) {
                zAreEqual = false;
                if (obj instanceof FunctionAdapter) {
                    zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            return zAreEqual;
        }

        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f79006a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @NotNull
    public static final PegasusResponseWrapper a(@NotNull Resource<PegasusResponse> resource, @NotNull lp0.c cVar) {
        return new PegasusResponseWrapper((PegasusResponse) resource.getData(), resource.getError(), cVar, false, 8, null);
    }
}
