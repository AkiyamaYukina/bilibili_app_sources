package com.bilibili.ship.theseus.ogv.intro;

import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository$special$$inlined$map$1;
import com.bilibili.ship.theseus.ogv.intro.P;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/CreateOgvSeasonInfoBarComponent$invoke$1.class */
final class CreateOgvSeasonInfoBarComponent$invoke$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final P.a $vm;
    int label;
    final C6159b this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.CreateOgvSeasonInfoBarComponent$invoke$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/CreateOgvSeasonInfoBarComponent$invoke$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final P.a $vm;
        private Object L$0;
        int label;
        final C6159b this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.CreateOgvSeasonInfoBarComponent$invoke$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/CreateOgvSeasonInfoBarComponent$invoke$1$1$1.class */
        public static final class C06861 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final P.a $vm;
            int label;
            final C6159b this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.CreateOgvSeasonInfoBarComponent$invoke$1$1$1$3, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/CreateOgvSeasonInfoBarComponent$invoke$1$1$1$3.class */
            public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function4<OgvEpisode, com.bilibili.ship.theseus.united.page.online.b, Boolean, Continuation<? super Triple<? extends OgvEpisode, ? extends com.bilibili.ship.theseus.united.page.online.b, ? extends Boolean>>, Object>, SuspendFunction {
                public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

                public AnonymousClass3() {
                    super(4, Triple.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", 4);
                }

                public final Object invoke(OgvEpisode ogvEpisode, com.bilibili.ship.theseus.united.page.online.b bVar, boolean z6, Continuation<? super Triple<OgvEpisode, com.bilibili.ship.theseus.united.page.online.b, Boolean>> continuation) {
                    return C06861.invokeSuspend$lambda$0(ogvEpisode, bVar, z6, continuation);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return invoke((OgvEpisode) obj, (com.bilibili.ship.theseus.united.page.online.b) obj2, ((Boolean) obj3).booleanValue(), (Continuation<? super Triple<OgvEpisode, com.bilibili.ship.theseus.united.page.online.b, Boolean>>) obj4);
                }
            }

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.CreateOgvSeasonInfoBarComponent$invoke$1$1$1$4, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/CreateOgvSeasonInfoBarComponent$invoke$1$1$1$4.class */
            public static final class AnonymousClass4 extends SuspendLambda implements Function2<Triple<? extends OgvEpisode, ? extends com.bilibili.ship.theseus.united.page.online.b, ? extends Boolean>, Continuation<? super Unit>, Object> {
                final P.a $vm;
                Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass4(P.a aVar, Continuation<? super AnonymousClass4> continuation) {
                    super(2, continuation);
                    this.$vm = aVar;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$vm, continuation);
                    anonymousClass4.L$0 = obj;
                    return anonymousClass4;
                }

                public final Object invoke(Triple<OgvEpisode, com.bilibili.ship.theseus.united.page.online.b, Boolean> triple, Continuation<? super Unit> continuation) {
                    return create(triple, continuation).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
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
                        if (r0 != 0) goto L83
                        r0 = r5
                        kotlin.ResultKt.throwOnFailure(r0)
                        r0 = r4
                        java.lang.Object r0 = r0.L$0
                        kotlin.Triple r0 = (kotlin.Triple) r0
                        r5 = r0
                        r0 = r5
                        java.lang.Object r0 = r0.getFirst()
                        com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode r0 = (com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode) r0
                        r9 = r0
                        r0 = r4
                        com.bilibili.ship.theseus.ogv.intro.P$a r0 = r0.$vm
                        r8 = r0
                        r0 = r5
                        java.lang.Object r0 = r0.getThird()
                        java.lang.Boolean r0 = (java.lang.Boolean) r0
                        boolean r0 = r0.booleanValue()
                        if (r0 == 0) goto L53
                        r0 = r9
                        if (r0 == 0) goto L53
                        r0 = r9
                        com.bilibili.ship.theseus.ogv.intro.section.bean.EpisodeRights r0 = r0.e()
                        r9 = r0
                        r0 = 1
                        r7 = r0
                        r0 = r7
                        r6 = r0
                        r0 = r9
                        if (r0 == 0) goto L55
                        r0 = r7
                        r6 = r0
                        r0 = r9
                        boolean r0 = r0.d()
                        r1 = 1
                        if (r0 != r1) goto L55
                    L53:
                        r0 = 0
                        r6 = r0
                    L55:
                        r0 = r8
                        androidx.compose.runtime.MutableState r0 = r0.f92263b
                        r1 = r6
                        java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                        r0.setValue(r1)
                        r0 = r4
                        com.bilibili.ship.theseus.ogv.intro.P$a r0 = r0.$vm
                        r8 = r0
                        r0 = r5
                        java.lang.Object r0 = r0.getSecond()
                        com.bilibili.ship.theseus.united.page.online.b r0 = (com.bilibili.ship.theseus.united.page.online.b) r0
                        java.lang.String r0 = r0.f102114b
                        r5 = r0
                        r0 = r8
                        androidx.compose.runtime.MutableState r0 = r0.f92262a
                        r1 = r5
                        r0.setValue(r1)
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    L83:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r1 = r0
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.CreateOgvSeasonInfoBarComponent$invoke$1.AnonymousClass1.C06861.AnonymousClass4.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06861(C6159b c6159b, P.a aVar, Continuation<? super C06861> continuation) {
                super(2, continuation);
                this.this$0 = c6159b;
                this.$vm = aVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$lambda$0(OgvEpisode ogvEpisode, com.bilibili.ship.theseus.united.page.online.b bVar, boolean z6, Continuation continuation) {
                return new Triple(ogvEpisode, bVar, Boxing.boxBoolean(z6));
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06861(this.this$0, this.$vm, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    C6159b c6159b = this.this$0;
                    OgvCurrentEpisodeRepository$special$$inlined$map$1 ogvCurrentEpisodeRepository$special$$inlined$map$1 = c6159b.f92325g.f92119v;
                    com.bilibili.ship.theseus.united.page.online.a aVar = c6159b.f92321c;
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(ogvCurrentEpisodeRepository$special$$inlined$map$1, aVar.f102112e, aVar.f102110c, AnonymousClass3.INSTANCE));
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$vm, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass4, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.CreateOgvSeasonInfoBarComponent$invoke$1$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/CreateOgvSeasonInfoBarComponent$invoke$1$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final P.a $vm;
            int label;
            final C6159b this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.CreateOgvSeasonInfoBarComponent$invoke$1$1$2$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/CreateOgvSeasonInfoBarComponent$invoke$1$1$2$1.class */
            public static final class C06871 extends SuspendLambda implements Function2<OgvEpisode, Continuation<? super Unit>, Object> {
                final P.a $vm;
                Object L$0;
                int label;
                final C6159b this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C06871(C6159b c6159b, P.a aVar, Continuation<? super C06871> continuation) {
                    super(2, continuation);
                    this.this$0 = c6159b;
                    this.$vm = aVar;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C06871 c06871 = new C06871(this.this$0, this.$vm, continuation);
                    c06871.L$0 = obj;
                    return c06871;
                }

                public final Object invoke(OgvEpisode ogvEpisode, Continuation<? super Unit> continuation) {
                    return create(ogvEpisode, continuation).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Removed duplicated region for block: B:21:0x0104  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                    /*
                        Method dump skipped, instruction units count: 315
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.CreateOgvSeasonInfoBarComponent$invoke$1.AnonymousClass1.AnonymousClass2.C06871.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(C6159b c6159b, P.a aVar, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = c6159b;
                this.$vm = aVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$vm, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    C6159b c6159b = this.this$0;
                    OgvCurrentEpisodeRepository$special$$inlined$map$1 ogvCurrentEpisodeRepository$special$$inlined$map$1 = c6159b.f92325g.f92119v;
                    C06871 c06871 = new C06871(c6159b, this.$vm, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(ogvCurrentEpisodeRepository$special$$inlined$map$1, c06871, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C6159b c6159b, P.a aVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c6159b;
            this.$vm = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$vm, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C06861(this.this$0, this.$vm, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$vm, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateOgvSeasonInfoBarComponent$invoke$1(C6159b c6159b, P.a aVar, Continuation<? super CreateOgvSeasonInfoBarComponent$invoke$1> continuation) {
        super(1, continuation);
        this.this$0 = c6159b;
        this.$vm = aVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CreateOgvSeasonInfoBarComponent$invoke$1(this.this$0, this.$vm, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$vm, null);
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
