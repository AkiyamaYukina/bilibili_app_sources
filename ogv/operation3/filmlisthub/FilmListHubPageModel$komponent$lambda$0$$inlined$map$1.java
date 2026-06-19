package com.bilibili.ogv.operation3.filmlisthub;

import androidx.compose.runtime.MutableState;
import kntr.common.komponent.Komponent;
import kntr.common.komponent.KomponentScope;
import kntr.common.trio.toast.Toaster;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/filmlisthub/FilmListHubPageModel$komponent$lambda$0$$inlined$map$1.class */
public final class FilmListHubPageModel$komponent$lambda$0$$inlined$map$1 implements Flow<Komponent<? extends Unit>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Flow f71030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FilmListHubPageModel f71031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f71032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MutableState f71033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Toaster f71034e;

    /* JADX INFO: renamed from: com.bilibili.ogv.operation3.filmlisthub.FilmListHubPageModel$komponent$lambda$0$$inlined$map$1$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/filmlisthub/FilmListHubPageModel$komponent$lambda$0$$inlined$map$1$2.class */
    public static final class AnonymousClass2<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FlowCollector f71035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FilmListHubPageModel f71036b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final KomponentScope f71037c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final MutableState f71038d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Toaster f71039e;

        /* JADX INFO: renamed from: com.bilibili.ogv.operation3.filmlisthub.FilmListHubPageModel$komponent$lambda$0$$inlined$map$1$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/filmlisthub/FilmListHubPageModel$komponent$lambda$0$$inlined$map$1$2$1.class */
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

        public AnonymousClass2(FlowCollector flowCollector, FilmListHubPageModel filmListHubPageModel, KomponentScope komponentScope, MutableState mutableState, Toaster toaster) {
            this.f71035a = flowCollector;
            this.f71036b = filmListHubPageModel;
            this.f71037c = komponentScope;
            this.f71038d = mutableState;
            this.f71039e = toaster;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r9, kotlin.coroutines.Continuation r10) throws kotlin.NoWhenBranchMatchedException {
            /*
                Method dump skipped, instruction units count: 310
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation3.filmlisthub.FilmListHubPageModel$komponent$lambda$0$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public FilmListHubPageModel$komponent$lambda$0$$inlined$map$1(Flow flow, FilmListHubPageModel filmListHubPageModel, KomponentScope komponentScope, MutableState mutableState, Toaster toaster) {
        this.f71030a = flow;
        this.f71031b = filmListHubPageModel;
        this.f71032c = komponentScope;
        this.f71033d = mutableState;
        this.f71034e = toaster;
    }

    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.f71030a.collect(new AnonymousClass2(flowCollector, this.f71031b, this.f71032c, this.f71033d, this.f71034e), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }
}
