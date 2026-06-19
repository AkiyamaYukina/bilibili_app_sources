package com.bilibili.ship.theseus.ogv.vip.playerlayer;

import android.content.res.Configuration;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import tv.danmaku.biliplayerv2.panel.IPanelContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/playerlayer/OgvVipBarPlayerLayerService$runViewInfoExtra$2.class */
final class OgvVipBarPlayerLayerService$runViewInfoExtra$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final a $layer;
    final boolean $portraitPlayerToastOpen;
    final e $viewModel;
    private Object L$0;
    int label;
    final OgvVipBarPlayerLayerService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.vip.playerlayer.OgvVipBarPlayerLayerService$runViewInfoExtra$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/playerlayer/OgvVipBarPlayerLayerService$runViewInfoExtra$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final com.bilibili.ship.theseus.ogv.vip.playerlayer.a $layer;
        final boolean $portraitPlayerToastOpen;
        final e $viewModel;
        int label;
        final OgvVipBarPlayerLayerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.vip.playerlayer.OgvVipBarPlayerLayerService$runViewInfoExtra$2$1$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/playerlayer/OgvVipBarPlayerLayerService$runViewInfoExtra$2$1$3.class */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<Configuration, Continuation<? super Boolean>, Object> {
            Object L$0;
            int label;
            final OgvVipBarPlayerLayerService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(OgvVipBarPlayerLayerService ogvVipBarPlayerLayerService, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = ogvVipBarPlayerLayerService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            public final Object invoke(Configuration configuration, Continuation<? super Boolean> continuation) {
                return create(configuration, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(OgvVipBarPlayerLayerService.c(this.this$0, (Configuration) this.L$0));
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.vip.playerlayer.OgvVipBarPlayerLayerService$runViewInfoExtra$2$1$7, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/playerlayer/OgvVipBarPlayerLayerService$runViewInfoExtra$2$1$7.class */
        public static final /* synthetic */ class AnonymousClass7 extends AdaptedFunctionReference implements Function3<PlayerAvailability, Configuration, Continuation<? super Pair<? extends PlayerAvailability, ? extends Configuration>>, Object>, SuspendFunction {
            public static final AnonymousClass7 INSTANCE = new AnonymousClass7();

            public AnonymousClass7() {
                super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public final Object invoke(PlayerAvailability playerAvailability, Configuration configuration, Continuation<? super Pair<? extends PlayerAvailability, Configuration>> continuation) {
                return AnonymousClass1.invokeSuspend$lambda$3(playerAvailability, configuration, continuation);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.vip.playerlayer.OgvVipBarPlayerLayerService$runViewInfoExtra$2$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/playerlayer/OgvVipBarPlayerLayerService$runViewInfoExtra$2$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final e f94853a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final OgvVipBarPlayerLayerService f94854b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f94855c;

            public a(e eVar, OgvVipBarPlayerLayerService ogvVipBarPlayerLayerService, boolean z6) {
                this.f94853a = eVar;
                this.f94854b = ogvVipBarPlayerLayerService;
                this.f94855c = z6;
            }

            public final Object emit(Object obj, Continuation continuation) {
                Pair pair = (Pair) obj;
                PlayerAvailability playerAvailability = (PlayerAvailability) pair.component1();
                Configuration configuration = (Configuration) pair.component2();
                OgvVipBarPlayerLayerService ogvVipBarPlayerLayerService = this.f94854b;
                boolean zC = OgvVipBarPlayerLayerService.c(ogvVipBarPlayerLayerService, configuration);
                e eVar = this.f94853a;
                if (zC != eVar.f94876n) {
                    eVar.f94876n = zC;
                    eVar.notifyPropertyChanged(332);
                }
                int iB = Uj0.c.b(OgvVipBarPlayerLayerService.c(ogvVipBarPlayerLayerService, configuration) ? 44 : 30, ogvVipBarPlayerLayerService.f94845b);
                if (iB != eVar.f94872j) {
                    eVar.f94872j = iB;
                    eVar.notifyPropertyChanged(59);
                }
                int iB2 = Uj0.c.b(OgvVipBarPlayerLayerService.c(ogvVipBarPlayerLayerService, configuration) ? 116 : 98, ogvVipBarPlayerLayerService.f94845b);
                if (iB2 != eVar.f94871i) {
                    eVar.f94871i = iB2;
                    eVar.notifyPropertyChanged(65);
                }
                boolean z6 = (OgvVipBarPlayerLayerService.c(ogvVipBarPlayerLayerService, configuration) || this.f94855c) && playerAvailability != PlayerAvailability.FORBIDDEN;
                if (z6 != eVar.f94867d) {
                    eVar.f94867d = z6;
                    eVar.notifyPropertyChanged(727);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvVipBarPlayerLayerService ogvVipBarPlayerLayerService, e eVar, boolean z6, com.bilibili.ship.theseus.ogv.vip.playerlayer.a aVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvVipBarPlayerLayerService;
            this.$viewModel = eVar;
            this.$portraitPlayerToastOpen = z6;
            this.$layer = aVar;
        }

        private static final Unit invokeSuspend$lambda$0(OgvVipBarPlayerLayerService ogvVipBarPlayerLayerService, e eVar, com.bilibili.ship.theseus.ogv.vip.playerlayer.a aVar, com.bilibili.ogv.infra.coroutine.c cVar) {
            cVar.b(new OgvVipBarPlayerLayerService$runViewInfoExtra$2$1$1$1(ogvVipBarPlayerLayerService, eVar, aVar, null));
            cVar.b(new OgvVipBarPlayerLayerService$runViewInfoExtra$2$1$1$2(ogvVipBarPlayerLayerService, null));
            return Unit.INSTANCE;
        }

        private static final Unit invokeSuspend$lambda$1(OgvVipBarPlayerLayerService ogvVipBarPlayerLayerService, e eVar, com.bilibili.ship.theseus.ogv.vip.playerlayer.a aVar, com.bilibili.ogv.infra.coroutine.c cVar) {
            cVar.b(new OgvVipBarPlayerLayerService$runViewInfoExtra$2$1$2$1(ogvVipBarPlayerLayerService, eVar, aVar, null));
            cVar.b(new OgvVipBarPlayerLayerService$runViewInfoExtra$2$1$2$2(ogvVipBarPlayerLayerService, null));
            return Unit.INSTANCE;
        }

        private static final Unit invokeSuspend$lambda$2(OgvVipBarPlayerLayerService ogvVipBarPlayerLayerService, e eVar, com.bilibili.ship.theseus.ogv.vip.playerlayer.a aVar, com.bilibili.ogv.infra.coroutine.c cVar) {
            cVar.b(new OgvVipBarPlayerLayerService$runViewInfoExtra$2$1$4$1(ogvVipBarPlayerLayerService, eVar, aVar, null));
            cVar.b(new OgvVipBarPlayerLayerService$runViewInfoExtra$2$1$4$2(ogvVipBarPlayerLayerService, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$3(PlayerAvailability playerAvailability, Configuration configuration, Continuation continuation) {
            return new Pair(playerAvailability, configuration);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$viewModel, this.$portraitPlayerToastOpen, this.$layer, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x01bc  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0207  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 525
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.vip.playerlayer.OgvVipBarPlayerLayerService$runViewInfoExtra$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.vip.playerlayer.OgvVipBarPlayerLayerService$runViewInfoExtra$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/playerlayer/OgvVipBarPlayerLayerService$runViewInfoExtra$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final a $layer;
        int label;
        final OgvVipBarPlayerLayerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(OgvVipBarPlayerLayerService ogvVipBarPlayerLayerService, a aVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = ogvVipBarPlayerLayerService;
            this.$layer = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$layer, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
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
                IPanelContainer panelContainer = this.this$0.f94847d.getPanelContainer();
                if (panelContainer != null) {
                    panelContainer.removeLayer(this.$layer);
                }
                this.this$0.f94848e.unregisterWindowInset(this.$layer);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvVipBarPlayerLayerService$runViewInfoExtra$2(OgvVipBarPlayerLayerService ogvVipBarPlayerLayerService, e eVar, boolean z6, a aVar, Continuation<? super OgvVipBarPlayerLayerService$runViewInfoExtra$2> continuation) {
        super(2, continuation);
        this.this$0 = ogvVipBarPlayerLayerService;
        this.$viewModel = eVar;
        this.$portraitPlayerToastOpen = z6;
        this.$layer = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvVipBarPlayerLayerService$runViewInfoExtra$2 ogvVipBarPlayerLayerService$runViewInfoExtra$2 = new OgvVipBarPlayerLayerService$runViewInfoExtra$2(this.this$0, this.$viewModel, this.$portraitPlayerToastOpen, this.$layer, continuation);
        ogvVipBarPlayerLayerService$runViewInfoExtra$2.L$0 = obj;
        return ogvVipBarPlayerLayerService$runViewInfoExtra$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$viewModel, this.$portraitPlayerToastOpen, this.$layer, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$layer, null), 3, (Object) null);
    }
}
