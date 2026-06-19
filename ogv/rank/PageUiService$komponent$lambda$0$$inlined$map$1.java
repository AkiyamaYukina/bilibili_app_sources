package com.bilibili.ogv.rank;

import androidx.compose.runtime.MutableState;
import kntr.common.komponent.Komponent;
import kntr.common.komponent.KomponentScope;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/PageUiService$komponent$lambda$0$$inlined$map$1.class */
public final class PageUiService$komponent$lambda$0$$inlined$map$1 implements Flow<Komponent<? extends Unit>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Flow f71877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PageUiService f71878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f71879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MutableState f71880d;

    /* JADX INFO: renamed from: com.bilibili.ogv.rank.PageUiService$komponent$lambda$0$$inlined$map$1$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/PageUiService$komponent$lambda$0$$inlined$map$1$2.class */
    public static final class AnonymousClass2<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FlowCollector f71881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PageUiService f71882b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final KomponentScope f71883c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final MutableState f71884d;

        /* JADX INFO: renamed from: com.bilibili.ogv.rank.PageUiService$komponent$lambda$0$$inlined$map$1$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/PageUiService$komponent$lambda$0$$inlined$map$1$2$1.class */
        public static final class AnonymousClass1 extends ContinuationImpl {
            int I$0;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;
            Object result;
            final AnonymousClass2 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AnonymousClass2 anonymousClass2, Continuation continuation) {
                super(continuation);
                this.this$0 = anonymousClass2;
            }

            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.emit(null, this);
            }
        }

        public AnonymousClass2(FlowCollector flowCollector, PageUiService pageUiService, KomponentScope komponentScope, MutableState mutableState) {
            this.f71881a = flowCollector;
            this.f71882b = pageUiService;
            this.f71883c = komponentScope;
            this.f71884d = mutableState;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) throws kotlin.NoWhenBranchMatchedException {
            /*
                Method dump skipped, instruction units count: 299
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.rank.PageUiService$komponent$lambda$0$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public PageUiService$komponent$lambda$0$$inlined$map$1(Flow flow, PageUiService pageUiService, KomponentScope komponentScope, MutableState mutableState) {
        this.f71877a = flow;
        this.f71878b = pageUiService;
        this.f71879c = komponentScope;
        this.f71880d = mutableState;
    }

    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.f71877a.collect(new AnonymousClass2(flowCollector, this.f71878b, this.f71879c, this.f71880d), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }
}
