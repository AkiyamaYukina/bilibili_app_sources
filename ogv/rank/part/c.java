package com.bilibili.ogv.rank.part;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import com.bilibili.ogv.rank.part.r;
import kntr.common.komponent.Komponent;
import kntr.common.komponent.KomponentHostScope;
import kntr.common.komponent.KomponentKt;
import kntr.common.komponent.KomponentScope;
import kntr.common.trio.toast.Toaster;
import kntr.common.trio.toast.ToasterKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/part/c.class */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f72042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f72043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f72044c;

    public /* synthetic */ c(l lVar, String str, String str2) {
        this.f72042a = lVar;
        this.f72043b = str;
        this.f72044c = str2;
    }

    public final Object invoke(Object obj) {
        final KomponentScope komponentScope = (KomponentScope) obj;
        final MutableState mutableStateMutableStateOf$default = SnapshotStateKt.mutableStateOf$default(r.b.f72118a, null, 2, null);
        CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default((Job) null, 1, (Object) null);
        final MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow((Object) null);
        final Toaster toaster = (Toaster) komponentScope.getContext().getCompositionLocal(ToasterKt.getLocalToaster());
        final l lVar = this.f72042a;
        final String str = this.f72043b;
        final String str2 = this.f72044c;
        KomponentHostScope.launch$default(komponentScope, (CoroutineContext) null, (CoroutineStart) null, new CreatePartKomponentImpl$invoke$1$1(completableDeferredCompletableDeferred$default, komponentScope, lVar, str, str2, mutableStateMutableStateOf$default, MutableStateFlow, toaster, null), 3, (Object) null);
        KomponentHostScope.launch$default(komponentScope, (CoroutineContext) null, (CoroutineStart) null, new CreatePartKomponentImpl$invoke$1$2(komponentScope, lVar, str, str2, mutableStateMutableStateOf$default, MutableStateFlow, toaster, null), 3, (Object) null);
        final Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new HH.b(mutableStateMutableStateOf$default, 3));
        return komponentScope.__setContent(new k(new d(MutableStateFlow), komponentScope.getContext(), komponentScope, completableDeferredCompletableDeferred$default, KomponentKt.embedFlow(komponentScope, new Flow<Komponent<? extends Unit>>(flowSnapshotFlow, komponentScope, mutableStateMutableStateOf$default, lVar, str, str2, MutableStateFlow, toaster) { // from class: com.bilibili.ogv.rank.part.CreatePartKomponentImpl$invoke$lambda$0$$inlined$map$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f72021a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final KomponentScope f72022b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final MutableState f72023c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final l f72024d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final String f72025e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final String f72026f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final MutableStateFlow f72027g;
            public final Toaster h;

            /* JADX INFO: renamed from: com.bilibili.ogv.rank.part.CreatePartKomponentImpl$invoke$lambda$0$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/part/CreatePartKomponentImpl$invoke$lambda$0$$inlined$map$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f72028a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final KomponentScope f72029b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final MutableState f72030c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final l f72031d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final String f72032e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final String f72033f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final MutableStateFlow f72034g;
                public final Toaster h;

                /* JADX INFO: renamed from: com.bilibili.ogv.rank.part.CreatePartKomponentImpl$invoke$lambda$0$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/part/CreatePartKomponentImpl$invoke$lambda$0$$inlined$map$1$2$1.class */
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

                public AnonymousClass2(FlowCollector flowCollector, KomponentScope komponentScope, MutableState mutableState, l lVar, String str, String str2, MutableStateFlow mutableStateFlow, Toaster toaster) {
                    this.f72028a = flowCollector;
                    this.f72029b = komponentScope;
                    this.f72030c = mutableState;
                    this.f72031d = lVar;
                    this.f72032e = str;
                    this.f72033f = str2;
                    this.f72034g = mutableStateFlow;
                    this.h = toaster;
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r12, kotlin.coroutines.Continuation r13) throws kotlin.NoWhenBranchMatchedException {
                    /*
                        Method dump skipped, instruction units count: 307
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.rank.part.CreatePartKomponentImpl$invoke$lambda$0$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f72021a = flowSnapshotFlow;
                this.f72022b = komponentScope;
                this.f72023c = mutableStateMutableStateOf$default;
                this.f72024d = lVar;
                this.f72025e = str;
                this.f72026f = str2;
                this.f72027g = MutableStateFlow;
                this.h = toaster;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f72021a.collect(new AnonymousClass2(flowCollector, this.f72022b, this.f72023c, this.f72024d, this.f72025e, this.f72026f, this.f72027g, this.h), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        })));
    }
}
