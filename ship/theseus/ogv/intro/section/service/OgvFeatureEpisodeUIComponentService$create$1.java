package com.bilibili.ship.theseus.ogv.intro.section.service;

import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.ship.theseus.ogv.intro.section.ui.u;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvFeatureEpisodeUIComponentService$create$1.class */
public final class OgvFeatureEpisodeUIComponentService$create$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final Hu0.b $data;
    final RunningUIComponent $episodeListRunningUIComponent;
    final u $seasonListUIComponent;
    final Ref.ObjectRef<u.c> $seasonListVm;
    final RunningUIComponent $titleRunningUIComponent;
    int label;
    final OgvFeatureEpisodeUIComponentService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvFeatureEpisodeUIComponentService$create$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvFeatureEpisodeUIComponentService$create$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Hu0.b $data;
        final RunningUIComponent $episodeListRunningUIComponent;
        final u $seasonListUIComponent;
        final Ref.ObjectRef<u.c> $seasonListVm;
        final RunningUIComponent $titleRunningUIComponent;
        private Object L$0;
        int label;
        final OgvFeatureEpisodeUIComponentService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvFeatureEpisodeUIComponentService$create$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvFeatureEpisodeUIComponentService$create$1$1$1.class */
        public static final class C07111 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final RunningUIComponent $titleRunningUIComponent;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07111(RunningUIComponent runningUIComponent, Continuation<? super C07111> continuation) {
                super(2, continuation);
                this.$titleRunningUIComponent = runningUIComponent;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07111(this.$titleRunningUIComponent, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    RunningUIComponent runningUIComponent = this.$titleRunningUIComponent;
                    this.label = 1;
                    if (runningUIComponent.a(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvFeatureEpisodeUIComponentService$create$1$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvFeatureEpisodeUIComponentService$create$1$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final RunningUIComponent $episodeListRunningUIComponent;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(RunningUIComponent runningUIComponent, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$episodeListRunningUIComponent = runningUIComponent;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$episodeListRunningUIComponent, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    RunningUIComponent runningUIComponent = this.$episodeListRunningUIComponent;
                    this.label = 1;
                    if (runningUIComponent.a(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvFeatureEpisodeUIComponentService$create$1$1$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvFeatureEpisodeUIComponentService$create$1$1$3.class */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Hu0.b $data;
            int label;
            final OgvFeatureEpisodeUIComponentService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(Hu0.b bVar, OgvFeatureEpisodeUIComponentService ogvFeatureEpisodeUIComponentService, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$data = bVar;
                this.this$0 = ogvFeatureEpisodeUIComponentService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$data, this.this$0, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    r0 = r4
                    int r0 = r0.label
                    if (r0 != 0) goto L7b
                    r0 = r5
                    kotlin.ResultKt.throwOnFailure(r0)
                    r0 = r4
                    Hu0.b r0 = r0.$data
                    Hu0.d r0 = r0.f8793c
                    r5 = r0
                    r0 = r4
                    com.bilibili.ship.theseus.ogv.intro.section.service.OgvFeatureEpisodeUIComponentService r0 = r0.this$0
                    com.bilibili.ship.theseus.ogv.x r0 = r0.f93733d
                    r5 = r0
                    r0 = r5
                    if (r0 == 0) goto L2e
                    r0 = r5
                    java.lang.String r0 = r0.f94923a
                    r6 = r0
                    r0 = r6
                    r5 = r0
                    r0 = r6
                    if (r0 != 0) goto L31
                L2e:
                    java.lang.String r0 = ""
                    r5 = r0
                L31:
                    r0 = r5
                    android.net.Uri r0 = android.net.Uri.parse(r0)
                    r5 = r0
                    r0 = r5
                    java.lang.String r0 = r0.getScheme()
                    java.lang.String r1 = "bilibili"
                    boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                    if (r0 == 0) goto L77
                    r0 = r5
                    java.lang.String r0 = r0.getHost()
                    java.lang.String r1 = "pgc"
                    boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                    if (r0 == 0) goto L77
                    r0 = r5
                    java.lang.String r0 = r0.getPath()
                    java.lang.String r1 = "/detail/pop"
                    boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                    if (r0 == 0) goto L77
                    r0 = r5
                    java.lang.String r1 = "page_type"
                    java.lang.String r0 = r0.getQueryParameter(r1)
                    java.lang.String r1 = "feature_ep"
                    boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                    if (r0 == 0) goto L77
                    r0 = r4
                    com.bilibili.ship.theseus.ogv.intro.section.service.OgvFeatureEpisodeUIComponentService r0 = r0.this$0
                    com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvSectionFloatLayerService r0 = r0.f93734e
                    r1 = r4
                    Hu0.b r1 = r1.$data
                    r2 = 0
                    r0.e(r1, r2)
                L77:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                L7b:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    r1 = r0
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.section.service.OgvFeatureEpisodeUIComponentService$create$1.AnonymousClass1.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvFeatureEpisodeUIComponentService$create$1$1$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvFeatureEpisodeUIComponentService$create$1$1$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<u.c> $seasonListVm;
            int label;
            final OgvFeatureEpisodeUIComponentService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvFeatureEpisodeUIComponentService$create$1$1$4$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvFeatureEpisodeUIComponentService$create$1$1$4$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Ref.ObjectRef<u.c> f93740a;

                public a(Ref.ObjectRef<u.c> objectRef) {
                    this.f93740a = objectRef;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    int iIntValue = ((Number) obj).intValue();
                    u.c cVar = (u.c) this.f93740a.element;
                    if (cVar != null && iIntValue != cVar.f93891b) {
                        cVar.f93891b = iIntValue;
                        cVar.notifyPropertyChanged(285);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(OgvFeatureEpisodeUIComponentService ogvFeatureEpisodeUIComponentService, Ref.ObjectRef<u.c> objectRef, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = ogvFeatureEpisodeUIComponentService;
                this.$seasonListVm = objectRef;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, this.$seasonListVm, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<Integer> stateFlow = this.this$0.f93738j.f100020a;
                    a aVar = new a(this.$seasonListVm);
                    this.label = 1;
                    if (stateFlow.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(u uVar, RunningUIComponent runningUIComponent, RunningUIComponent runningUIComponent2, Hu0.b bVar, OgvFeatureEpisodeUIComponentService ogvFeatureEpisodeUIComponentService, Ref.ObjectRef<u.c> objectRef, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$seasonListUIComponent = uVar;
            this.$titleRunningUIComponent = runningUIComponent;
            this.$episodeListRunningUIComponent = runningUIComponent2;
            this.$data = bVar;
            this.this$0 = ogvFeatureEpisodeUIComponentService;
            this.$seasonListVm = objectRef;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$seasonListUIComponent, this.$titleRunningUIComponent, this.$episodeListRunningUIComponent, this.$data, this.this$0, this.$seasonListVm, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            List<u.a> list;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C07111(this.$titleRunningUIComponent, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$episodeListRunningUIComponent, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.$data, this.this$0, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, this.$seasonListVm, null), 3, (Object) null);
            u uVar = this.$seasonListUIComponent;
            if (uVar != null && (list = uVar.f93884b) != null) {
                List<u.a> list2 = list;
                OgvFeatureEpisodeUIComponentService ogvFeatureEpisodeUIComponentService = this.this$0;
                int i7 = 0;
                for (Object obj2 : list2) {
                    if (i7 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new OgvFeatureEpisodeUIComponentService$create$1$1$5$1((u.a) obj2, ogvFeatureEpisodeUIComponentService, uVar, i7, null), 3, (Object) null);
                    i7++;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvFeatureEpisodeUIComponentService$create$1(u uVar, RunningUIComponent runningUIComponent, RunningUIComponent runningUIComponent2, Hu0.b bVar, OgvFeatureEpisodeUIComponentService ogvFeatureEpisodeUIComponentService, Ref.ObjectRef<u.c> objectRef, Continuation<? super OgvFeatureEpisodeUIComponentService$create$1> continuation) {
        super(1, continuation);
        this.$seasonListUIComponent = uVar;
        this.$titleRunningUIComponent = runningUIComponent;
        this.$episodeListRunningUIComponent = runningUIComponent2;
        this.$data = bVar;
        this.this$0 = ogvFeatureEpisodeUIComponentService;
        this.$seasonListVm = objectRef;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new OgvFeatureEpisodeUIComponentService$create$1(this.$seasonListUIComponent, this.$titleRunningUIComponent, this.$episodeListRunningUIComponent, this.$data, this.this$0, this.$seasonListVm, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$seasonListUIComponent, this.$titleRunningUIComponent, this.$episodeListRunningUIComponent, this.$data, this.this$0, this.$seasonListVm, null);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
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
