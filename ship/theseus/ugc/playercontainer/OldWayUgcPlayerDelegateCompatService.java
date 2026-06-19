package com.bilibili.ship.theseus.ugc.playercontainer;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.common.utils.UriSafeKt;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.playerbizcommonv2.delegate.DelegateStoreKey;
import com.bilibili.ship.theseus.ugc.intro.ugcheadline.C6266b;
import com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService;
import com.bilibili.ship.theseus.united.page.intro.module.relate.C6320j;
import com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateRepository;
import com.bilibili.ship.theseus.united.page.intro.module.relate.o0;
import com.bilibili.ship.theseus.united.page.intro.module.relate.q0;
import com.bilibili.ship.theseus.united.page.intro.module.season.Y;
import com.bilibili.ship.theseus.united.page.intro.module.staffs.C6369f;
import com.bilibili.ship.theseus.united.page.intro.module.staffs.D;
import com.bilibili.ship.theseus.united.page.unitedepisode.PageCategory;
import com.bilibili.ship.theseus.united.page.view.RelationRepository;
import com.bilibili.ship.theseus.united.page.weblayer.C6452a;
import ev0.InterfaceC7008a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playercontainer/OldWayUgcPlayerDelegateCompatService.class */
@StabilityInferred(parameters = 0)
public final class OldWayUgcPlayerDelegateCompatService extends com.bilibili.app.gemini.ugc.feature.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f98205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PageCategory f98206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final rW0.a<InterfaceC7008a> f98207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final RelationRepository f98208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Y f98209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ugc.w f98210g;

    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d f98211i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final DetailRelateRepository f98212j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final D f98213k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ugc.intro.ugcheadline.p f98214l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final C6452a f98215m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Er0.a f98216n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final KingPositionService f98217o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final C8043a f98218p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public StateFlow<? extends List<com.bilibili.app.gemini.ugc.feature.s>> f98219q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<com.bilibili.app.gemini.ugc.feature.i> f98220r = StateFlowKt.MutableStateFlow((Object) null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<List<com.bilibili.app.gemini.ugc.feature.o>> f98221s = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.playercontainer.OldWayUgcPlayerDelegateCompatService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playercontainer/OldWayUgcPlayerDelegateCompatService$1.class */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OldWayUgcPlayerDelegateCompatService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.playercontainer.OldWayUgcPlayerDelegateCompatService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playercontainer/OldWayUgcPlayerDelegateCompatService$1$1.class */
        public static final class C09121 extends SuspendLambda implements Function2<com.bilibili.ship.theseus.ugc.a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final OldWayUgcPlayerDelegateCompatService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09121(OldWayUgcPlayerDelegateCompatService oldWayUgcPlayerDelegateCompatService, Continuation<? super C09121> continuation) {
                super(2, continuation);
                this.this$0 = oldWayUgcPlayerDelegateCompatService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C09121 c09121 = new C09121(this.this$0, continuation);
                c09121.L$0 = obj;
                return c09121;
            }

            public final Object invoke(com.bilibili.ship.theseus.ugc.a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                com.bilibili.app.gemini.ugc.feature.i iVar;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                com.bilibili.ship.theseus.ugc.a aVar = (com.bilibili.ship.theseus.ugc.a) this.L$0;
                MutableStateFlow<com.bilibili.app.gemini.ugc.feature.i> mutableStateFlow = this.this$0.f98220r;
                if (aVar != null) {
                    int i7 = (int) aVar.f96242a;
                    List<com.bilibili.ship.theseus.ugc.b> list = aVar.f96243b;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (com.bilibili.ship.theseus.ugc.b bVar : list) {
                        arrayList.add(new com.bilibili.app.gemini.ugc.feature.h(bVar.f96298a, bVar.f96299b, bVar.f96300c, bVar.f96301d));
                    }
                    iVar = new com.bilibili.app.gemini.ugc.feature.i(i7, aVar.f96244c, arrayList, aVar.f96245d);
                } else {
                    iVar = null;
                }
                mutableStateFlow.setValue(iVar);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OldWayUgcPlayerDelegateCompatService oldWayUgcPlayerDelegateCompatService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = oldWayUgcPlayerDelegateCompatService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                OldWayUgcPlayerDelegateCompatService oldWayUgcPlayerDelegateCompatService = this.this$0;
                StateFlow<com.bilibili.ship.theseus.ugc.a> stateFlow = oldWayUgcPlayerDelegateCompatService.f98210g.f98563e;
                C09121 c09121 = new C09121(oldWayUgcPlayerDelegateCompatService, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c09121, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.playercontainer.OldWayUgcPlayerDelegateCompatService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playercontainer/OldWayUgcPlayerDelegateCompatService$2.class */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OldWayUgcPlayerDelegateCompatService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(OldWayUgcPlayerDelegateCompatService oldWayUgcPlayerDelegateCompatService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = oldWayUgcPlayerDelegateCompatService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<q0> stateFlow = this.this$0.f98212j.f100853c;
                this.label = 1;
                Object objA = com.bilibili.ogv.infra.coroutine.b.a(stateFlow, this);
                obj = objA;
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            MutableStateFlow<List<com.bilibili.app.gemini.ugc.feature.o>> mutableStateFlow = this.this$0.f98221s;
            List<o0> list = ((q0) obj).f101364a;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                com.bilibili.app.gemini.ugc.feature.o oVarA = C6320j.a((o0) it.next());
                if (oVarA != null) {
                    arrayList.add(oVarA);
                }
            }
            mutableStateFlow.setValue(arrayList);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.playercontainer.OldWayUgcPlayerDelegateCompatService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playercontainer/OldWayUgcPlayerDelegateCompatService$3.class */
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OldWayUgcPlayerDelegateCompatService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(OldWayUgcPlayerDelegateCompatService oldWayUgcPlayerDelegateCompatService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = oldWayUgcPlayerDelegateCompatService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            DelegateStoreKey<?> delegateStoreKey = com.bilibili.app.gemini.ugc.feature.n.a;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    OldWayUgcPlayerDelegateCompatService oldWayUgcPlayerDelegateCompatService = this.this$0;
                    oldWayUgcPlayerDelegateCompatService.f98216n.put(delegateStoreKey, oldWayUgcPlayerDelegateCompatService);
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                this.this$0.f98216n.remove(delegateStoreKey);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.playercontainer.OldWayUgcPlayerDelegateCompatService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playercontainer/OldWayUgcPlayerDelegateCompatService$4.class */
    final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final OldWayUgcPlayerDelegateCompatService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(OldWayUgcPlayerDelegateCompatService oldWayUgcPlayerDelegateCompatService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = oldWayUgcPlayerDelegateCompatService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objStateIn;
            OldWayUgcPlayerDelegateCompatService oldWayUgcPlayerDelegateCompatService;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                OldWayUgcPlayerDelegateCompatService oldWayUgcPlayerDelegateCompatService2 = this.this$0;
                final StateFlow<C6369f> stateFlow = oldWayUgcPlayerDelegateCompatService2.f98213k.f101764b;
                Flow<List<? extends com.bilibili.app.gemini.ugc.feature.s>> flow = new Flow<List<? extends com.bilibili.app.gemini.ugc.feature.s>>(stateFlow) { // from class: com.bilibili.ship.theseus.ugc.playercontainer.OldWayUgcPlayerDelegateCompatService$4$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Flow f98222a;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.playercontainer.OldWayUgcPlayerDelegateCompatService$4$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playercontainer/OldWayUgcPlayerDelegateCompatService$4$invokeSuspend$$inlined$map$1$2.class */
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final FlowCollector f98223a;

                        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.playercontainer.OldWayUgcPlayerDelegateCompatService$4$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playercontainer/OldWayUgcPlayerDelegateCompatService$4$invokeSuspend$$inlined$map$1$2$1.class */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
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

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.f98223a = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r14, kotlin.coroutines.Continuation r15) {
                            /*
                                Method dump skipped, instruction units count: 294
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.playercontainer.OldWayUgcPlayerDelegateCompatService$4$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    {
                        this.f98222a = stateFlow;
                    }

                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = this.f98222a.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                this.L$0 = oldWayUgcPlayerDelegateCompatService2;
                this.label = 1;
                objStateIn = FlowKt.stateIn(flow, oldWayUgcPlayerDelegateCompatService2.f98205b, this);
                if (objStateIn == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oldWayUgcPlayerDelegateCompatService = oldWayUgcPlayerDelegateCompatService2;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oldWayUgcPlayerDelegateCompatService = (OldWayUgcPlayerDelegateCompatService) this.L$0;
                ResultKt.throwOnFailure(obj);
                objStateIn = obj;
            }
            oldWayUgcPlayerDelegateCompatService.f98219q = (StateFlow) objStateIn;
            return Unit.INSTANCE;
        }
    }

    @Inject
    public OldWayUgcPlayerDelegateCompatService(@NotNull CoroutineScope coroutineScope, @NotNull PageCategory pageCategory, @NotNull rW0.a aVar, @NotNull RelationRepository relationRepository, @NotNull Y y6, @NotNull com.bilibili.ship.theseus.ugc.w wVar, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar2, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar, @NotNull DetailRelateRepository detailRelateRepository, @NotNull D d7, @NotNull com.bilibili.ship.theseus.ugc.intro.ugcheadline.p pVar, @NotNull C6452a c6452a, @NotNull Er0.a aVar3, @NotNull KingPositionService kingPositionService, @NotNull C8043a c8043a) {
        this.f98205b = coroutineScope;
        this.f98206c = pageCategory;
        this.f98207d = aVar;
        this.f98208e = relationRepository;
        this.f98209f = y6;
        this.f98210g = wVar;
        this.h = aVar2;
        this.f98211i = dVar;
        this.f98212j = detailRelateRepository;
        this.f98213k = d7;
        this.f98214l = pVar;
        this.f98215m = c6452a;
        this.f98216n = aVar3;
        this.f98217o = kingPositionService;
        this.f98218p = c8043a;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
    }

    public final void a() {
        this.f98217o.c(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b() {
        /*
            r2 = this;
            r0 = r2
            com.bilibili.ship.theseus.united.page.view.RelationRepository r0 = r0.f98208e
            kotlinx.coroutines.flow.MutableStateFlow<com.bilibili.ship.theseus.united.page.view.g> r0 = r0.f104009r
            java.lang.Object r0 = r0.getValue()
            com.bilibili.ship.theseus.united.page.view.g r0 = (com.bilibili.ship.theseus.united.page.view.g) r0
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L1f
            r0 = r3
            java.lang.String r0 = r0.f104081c
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L22
        L1f:
            java.lang.String r0 = ""
            r3 = r0
        L22:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.playercontainer.OldWayUgcPlayerDelegateCompatService.b():java.lang.String");
    }

    @NotNull
    public final StateFlow<com.bilibili.app.gemini.ugc.feature.i> c() {
        return this.f98220r;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String d() {
        /*
            r2 = this;
            r0 = r2
            com.bilibili.ship.theseus.united.page.view.RelationRepository r0 = r0.f98208e
            kotlinx.coroutines.flow.MutableStateFlow<com.bilibili.ship.theseus.united.page.view.g> r0 = r0.f104009r
            java.lang.Object r0 = r0.getValue()
            com.bilibili.ship.theseus.united.page.view.g r0 = (com.bilibili.ship.theseus.united.page.view.g) r0
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L1f
            r0 = r3
            java.lang.String r0 = r0.f104079a
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L22
        L1f:
            java.lang.String r0 = ""
            r3 = r0
        L22:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.playercontainer.OldWayUgcPlayerDelegateCompatService.d():java.lang.String");
    }

    @NotNull
    public final StateFlow<Boolean> e() {
        return this.f98208e.f104014w;
    }

    @NotNull
    public final CoroutineScope f() {
        return this.f98205b;
    }

    @NotNull
    public final StateFlow<Boolean> g() {
        return this.f98208e.f104000i;
    }

    @NotNull
    public final Float h() {
        return Float.valueOf(this.f98212j.f100861l);
    }

    @NotNull
    public final Float i() {
        return Float.valueOf(this.f98212j.f100862m);
    }

    @NotNull
    public final StateFlow<List<com.bilibili.app.gemini.ugc.feature.o>> j() {
        return this.f98221s;
    }

    public final int k() {
        com.bilibili.ship.theseus.ugc.intro.ugcheadline.d dVar;
        C6266b c6266b = (C6266b) this.f98214l.f97379j.getValue();
        return (c6266b == null || (dVar = c6266b.f97304b) == null) ? 0 : dVar.f97313a;
    }

    @NotNull
    public final Integer l() {
        return Integer.valueOf(this.f98206c == PageCategory.ACTIVITY_PAGE ? 2 : 1);
    }

    public final boolean m() {
        com.bilibili.ship.theseus.united.page.view.q qVar = this.h.f104045k;
        boolean z6 = false;
        if (qVar != null) {
            z6 = false;
            if (qVar.f104117d) {
                z6 = true;
            }
        }
        return z6;
    }

    public final boolean n() {
        return this.f98209f.a();
    }

    public final boolean o() {
        return ((Boolean) this.f98209f.f101643d.getValue()).booleanValue();
    }

    public final void p(boolean z6) {
        this.f98208e.n(z6);
    }

    public final void q() {
        this.f98209f.b(true);
    }

    public final void r(boolean z6) {
        Y y6 = this.f98209f;
        y6.f101643d.setValue(Boolean.valueOf(z6));
        y6.f101642c.l("sp_user_last_operate_favorite", z6);
    }

    public final void s(@NotNull String str) {
        BuildersKt.launch$default(this.f98205b, (CoroutineContext) null, (CoroutineStart) null, new OldWayUgcPlayerDelegateCompatService$showBgmWebPanel$1(this, str, null), 3, (Object) null);
    }

    public final void t() {
        String str;
        com.bilibili.ship.theseus.united.page.view.g gVar = (com.bilibili.ship.theseus.united.page.view.g) this.f98208e.f104010s.getValue();
        if (gVar == null || (str = gVar.f104080b) == null) {
            return;
        }
        Uri uri = Uri.parse(str);
        Uri.Builder builderBuildUpon = uri.buildUpon();
        int length = UriSafeKt.safetyQueryParameterOrEmpty(uri, "spmid").length();
        C8043a c8043a = this.f98218p;
        if (length == 0) {
            UriSafeKt.safetyAppendQueryParameter(builderBuildUpon, "spmid", c8043a.a().f123880b);
        }
        if (UriSafeKt.safetyQueryParameterOrEmpty(uri, "from_spmid").length() == 0) {
            UriSafeKt.safetyAppendQueryParameter(builderBuildUpon, "from_spmid", c8043a.a().f123881c);
        }
        if (UriSafeKt.safetyQueryParameterOrEmpty(uri, "track_id").length() == 0) {
            UriSafeKt.safetyAppendQueryParameter(builderBuildUpon, "track_id", c8043a.a().f123882d);
        }
        if (UriSafeKt.safetyQueryParameterOrEmpty(uri, GameCardButton.extraAvid).length() == 0) {
            UriSafeKt.safetyAppendQueryParameter(builderBuildUpon, GameCardButton.extraAvid, this.h.b());
        }
        if (UriSafeKt.safetyQueryParameterOrEmpty(uri, "up_mid").length() == 0) {
            UriSafeKt.safetyAppendQueryParameter(builderBuildUpon, "up_mid", String.valueOf(this.f98211i.f()));
        }
        BLRouter.routeTo$default(RouteRequestKt.toRouteRequest(builderBuildUpon.build()), (Context) null, 2, (Object) null);
    }

    public final void u(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        Long longOrNull = StringsKt.toLongOrNull(str);
        if (longOrNull != null) {
            long jLongValue = longOrNull.longValue();
            InterfaceC7008a interfaceC7008a = (InterfaceC7008a) this.f98207d.get();
            String str5 = str3;
            if (str3 == null) {
                str5 = this.f98218p.a().f123881c;
            }
            com.bilibili.ship.theseus.ugc.c.a(interfaceC7008a, jLongValue, -1L, str4, str2, str5, 0, false, 64);
        }
    }

    public final void v() {
        this.f98217o.c(false);
    }

    public final void w() {
        RelationRepository relationRepository = this.f98208e;
        relationRepository.z(relationRepository.q() + 1);
    }
}
