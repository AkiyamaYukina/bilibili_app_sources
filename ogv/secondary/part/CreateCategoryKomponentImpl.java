package com.bilibili.ogv.secondary.part;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import com.bilibili.ogv.secondary.C5524e;
import com.bilibili.ogv.secondary.part.CreateCategoryKomponentImpl;
import com.bilibili.ogv.secondary.part.InterfaceC5531a;
import javax.inject.Inject;
import kntr.common.komponent.Komponent;
import kntr.common.komponent.KomponentHostScope;
import kntr.common.komponent.KomponentKt;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.SetContentResult;
import kntr.common.komponent.UiComposableLike;
import kntr.common.trio.toast.Toaster;
import kntr.common.trio.toast.ToasterKt;
import kntr.common.trio.vertex.VertexContext;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/CreateCategoryKomponentImpl.class */
@StabilityInferred(parameters = 0)
public final class CreateCategoryKomponentImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ogv.secondary.api.e f72732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC5544n f72733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C5524e f72734c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/CreateCategoryKomponentImpl$a.class */
    public static final class a implements Function1<KomponentScope<? super Unit>, SetContentResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC5531a f72735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final KomponentScope<Unit> f72736b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final MutableState<InterfaceC5531a> f72737c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final CreateCategoryKomponentImpl f72738d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f72739e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f72740f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Toaster f72741g;

        public a(MutableState mutableState, InterfaceC5531a interfaceC5531a, CreateCategoryKomponentImpl createCategoryKomponentImpl, String str, String str2, KomponentScope komponentScope, Toaster toaster) {
            this.f72735a = interfaceC5531a;
            this.f72736b = komponentScope;
            this.f72737c = mutableState;
            this.f72738d = createCategoryKomponentImpl;
            this.f72739e = str;
            this.f72740f = str2;
            this.f72741g = toaster;
        }

        public final Object invoke(Object obj) {
            KomponentScope komponentScope = (KomponentScope) obj;
            return komponentScope.__setContent(new C5538h(Unit.INSTANCE, komponentScope.getContext(), komponentScope, this.f72735a, this.f72736b, this.f72737c, this.f72738d, this.f72739e, this.f72740f, this.f72741g));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/CreateCategoryKomponentImpl$b.class */
    public static final class b implements Function1<KomponentScope<? super Unit>, SetContentResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f72742a = new Object();

        public final Object invoke(Object obj) {
            KomponentScope komponentScope = (KomponentScope) obj;
            return komponentScope.__setContent(new C5539i(Unit.INSTANCE, komponentScope.getContext(), komponentScope));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/CreateCategoryKomponentImpl$c.class */
    public static final class c implements Function1<KomponentScope<? super Unit>, SetContentResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreateCategoryKomponentImpl f72743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC5531a f72744b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f72745c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f72746d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final KomponentScope<Unit> f72747e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final MutableState<InterfaceC5531a> f72748f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Toaster f72749g;

        public c(MutableState mutableState, InterfaceC5531a interfaceC5531a, CreateCategoryKomponentImpl createCategoryKomponentImpl, String str, String str2, KomponentScope komponentScope, Toaster toaster) {
            this.f72743a = createCategoryKomponentImpl;
            this.f72744b = interfaceC5531a;
            this.f72745c = str;
            this.f72746d = str2;
            this.f72747e = komponentScope;
            this.f72748f = mutableState;
            this.f72749g = toaster;
        }

        public final Object invoke(Object obj) {
            KomponentScope komponentScope = (KomponentScope) obj;
            CreateCategoryKomponentImpl createCategoryKomponentImpl = this.f72743a;
            UiComposableLike uiComposableLikeEmbed = komponentScope.embed(createCategoryKomponentImpl.f72733b.b(((InterfaceC5531a.c) this.f72744b).f72806a, this.f72745c, this.f72746d, createCategoryKomponentImpl.f72734c));
            float f7 = androidx.compose.material3.pulltorefresh.p.f41936a;
            androidx.compose.material3.pulltorefresh.t tVar = new androidx.compose.material3.pulltorefresh.t();
            return komponentScope.__setContent(new C5543m(Unit.INSTANCE, komponentScope.getContext(), komponentScope, this.f72744b, this.f72747e, this.f72748f, this.f72743a, this.f72745c, this.f72746d, this.f72749g, tVar, uiComposableLikeEmbed));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/CreateCategoryKomponentImpl$d.class */
    public static final class d implements UiComposableLike {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Unit f72750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final VertexContext f72751b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final KomponentScope f72752c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final CompletableDeferred f72753d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final State f72754e;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/CreateCategoryKomponentImpl$d$a.class */
        public static final class a implements Function2<Composer, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Modifier f72755a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CompletableDeferred f72756b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final State f72757c;

            public a(Modifier modifier, CompletableDeferred completableDeferred, State state) {
                this.f72755a = modifier;
                this.f72756b = completableDeferred;
                this.f72757c = state;
            }

            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1461546774, iIntValue, -1, "kntr.common.komponent.setContent.<no name provided>.invoke.<anonymous> (Komponent.kt:79)");
                    }
                    composer.startReplaceGroup(2107500753);
                    this.f72756b.complete(Unit.INSTANCE);
                    ((UiComposableLike) this.f72757c.getValue()).invoke(this.f72755a, composer, 0);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            }
        }

        public d(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, CompletableDeferred completableDeferred, State state) {
            this.f72751b = vertexContext;
            this.f72752c = komponentScope;
            this.f72753d = completableDeferred;
            this.f72754e = state;
            this.f72750a = unit;
        }

        public final Object getContentType() {
            return Reflection.getOrCreateKotlinClass(d.class);
        }

        public final Object getKey() {
            return this.f72752c.getKey();
        }

        public final Object getState() {
            return this.f72750a;
        }

        @Composable
        public final void invoke(Modifier modifier, Composer composer, int i7) {
            composer.startReplaceGroup(1906618612);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
            }
            this.f72751b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f72753d, this.f72754e), composer, 54), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
        }
    }

    @Inject
    public CreateCategoryKomponentImpl(@NotNull com.bilibili.ogv.secondary.api.e eVar, @NotNull InterfaceC5544n interfaceC5544n, @NotNull C5524e c5524e) {
        this.f72732a = eVar;
        this.f72733b = interfaceC5544n;
        this.f72734c = c5524e;
    }

    public static final void a(KomponentScope komponentScope, CreateCategoryKomponentImpl createCategoryKomponentImpl, String str, String str2, MutableState mutableState, Toaster toaster) {
        KomponentHostScope.launch$default(komponentScope, (CoroutineContext) null, (CoroutineStart) null, new CreateCategoryKomponentImpl$invoke$1$refreshData$1(createCategoryKomponentImpl, str, str2, mutableState, toaster, null), 3, (Object) null);
    }

    @NotNull
    public final Komponent<Unit> b(@NotNull final String str, @NotNull final String str2) {
        return KomponentKt.Komponent(new Function1(this, str, str2) { // from class: com.bilibili.ogv.secondary.part.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreateCategoryKomponentImpl f72818a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f72819b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f72820c;

            {
                this.f72818a = this;
                this.f72819b = str;
                this.f72820c = str2;
            }

            public final Object invoke(Object obj) {
                KomponentScope komponentScope = (KomponentScope) obj;
                final MutableState mutableStateMutableStateOf$default = SnapshotStateKt.mutableStateOf$default(InterfaceC5531a.b.f72805a, null, 2, null);
                CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default((Job) null, 1, (Object) null);
                Toaster toaster = (Toaster) komponentScope.getContext().getCompositionLocal(ToasterKt.getLocalToaster());
                CreateCategoryKomponentImpl createCategoryKomponentImpl = this.f72818a;
                String str3 = this.f72819b;
                String str4 = this.f72820c;
                KomponentHostScope.launch$default(komponentScope, (CoroutineContext) null, (CoroutineStart) null, new CreateCategoryKomponentImpl$invoke$1$1(completableDeferredCompletableDeferred$default, komponentScope, createCategoryKomponentImpl, str3, str4, mutableStateMutableStateOf$default, toaster, null), 3, (Object) null);
                final int i7 = 0;
                return komponentScope.__setContent(new CreateCategoryKomponentImpl.d(Unit.INSTANCE, komponentScope.getContext(), komponentScope, completableDeferredCompletableDeferred$default, KomponentKt.embedFlow(komponentScope, new Flow<Komponent<? extends Unit>>(SnapshotStateKt.snapshotFlow(new Function0(mutableStateMutableStateOf$default, i7) { // from class: com.bilibili.ogv.secondary.part.g

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f72821a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final MutableState f72822b;

                    {
                        this.f72821a = i7;
                        this.f72822b = mutableStateMutableStateOf$default;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final Object invoke() {
                        switch (this.f72821a) {
                            case 0:
                                return (InterfaceC5531a) this.f72822b.getValue();
                            default:
                                this.f72822b.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                                return Unit.INSTANCE;
                        }
                    }
                }), komponentScope, mutableStateMutableStateOf$default, createCategoryKomponentImpl, str3, str4, toaster) { // from class: com.bilibili.ogv.secondary.part.CreateCategoryKomponentImpl$invoke$lambda$0$$inlined$map$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Flow f72758a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final KomponentScope f72759b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final MutableState f72760c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final CreateCategoryKomponentImpl f72761d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final String f72762e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final String f72763f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public final Toaster f72764g;

                    /* JADX INFO: renamed from: com.bilibili.ogv.secondary.part.CreateCategoryKomponentImpl$invoke$lambda$0$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/CreateCategoryKomponentImpl$invoke$lambda$0$$inlined$map$1$2.class */
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final FlowCollector f72765a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final KomponentScope f72766b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final MutableState f72767c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final CreateCategoryKomponentImpl f72768d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final String f72769e;

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        public final String f72770f;

                        /* JADX INFO: renamed from: g, reason: collision with root package name */
                        public final Toaster f72771g;

                        /* JADX INFO: renamed from: com.bilibili.ogv.secondary.part.CreateCategoryKomponentImpl$invoke$lambda$0$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/CreateCategoryKomponentImpl$invoke$lambda$0$$inlined$map$1$2$1.class */
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

                        public AnonymousClass2(FlowCollector flowCollector, KomponentScope komponentScope, MutableState mutableState, CreateCategoryKomponentImpl createCategoryKomponentImpl, String str, String str2, Toaster toaster) {
                            this.f72765a = flowCollector;
                            this.f72766b = komponentScope;
                            this.f72767c = mutableState;
                            this.f72768d = createCategoryKomponentImpl;
                            this.f72769e = str;
                            this.f72770f = str2;
                            this.f72771g = toaster;
                        }

                        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                        /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r11, kotlin.coroutines.Continuation r12) throws kotlin.NoWhenBranchMatchedException {
                            /*
                                Method dump skipped, instruction units count: 339
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.secondary.part.CreateCategoryKomponentImpl$invoke$lambda$0$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    {
                        this.f72758a = flow;
                        this.f72759b = komponentScope;
                        this.f72760c = mutableStateMutableStateOf$default;
                        this.f72761d = createCategoryKomponentImpl;
                        this.f72762e = str3;
                        this.f72763f = str4;
                        this.f72764g = toaster;
                    }

                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = this.f72758a.collect(new AnonymousClass2(flowCollector, this.f72759b, this.f72760c, this.f72761d, this.f72762e, this.f72763f, this.f72764g), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                })));
            }
        });
    }
}
