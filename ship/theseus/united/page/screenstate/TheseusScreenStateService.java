package com.bilibili.ship.theseus.united.page.screenstate;

import MT.M;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.i;
import androidx.compose.foundation.gestures.C3392f;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import androidx.media3.exoplayer.C4690e;
import androidx.window.core.layout.WindowSizeClass;
import c6.P;
import com.bilibili.playerbizcommonv2.utils.p;
import com.bilibili.ship.theseus.united.page.AutoFullscreenService;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaDescription;
import com.bilibili.ship.theseus.united.page.screenstate.TheseusScreenStateService;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import dr0.ViewOnClickListenerC6833a;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetToken;
import tv.danmaku.biliplayerv2.service.I;
import tv.danmaku.biliplayerv2.service.IRenderContainerService;
import tv.danmaku.biliplayerv2.service.render.wholescene.WholeSceneModeChangeObserver;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screenstate/TheseusScreenStateService.class */
@StabilityInferred(parameters = 0)
public final class TheseusScreenStateService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final c f102953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Flow<Boolean> f102954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Flow<Boolean> f102955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f102956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f102957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final BackActionRepository f102958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f102959g;

    @NotNull
    public final C7893a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final AbsFunctionWidgetService f102960i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final PlayerContainer f102961j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final IRenderContainerService f102962k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f102963l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.a f102964m;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.screenstate.TheseusScreenStateService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screenstate/TheseusScreenStateService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusScreenStateService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.screenstate.TheseusScreenStateService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screenstate/TheseusScreenStateService$1$1.class */
        public static final class C11101 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            Object L$0;
            Object L$1;
            boolean Z$0;
            int label;
            final TheseusScreenStateService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11101(TheseusScreenStateService theseusScreenStateService, Continuation<? super C11101> continuation) {
                super(2, continuation);
                this.this$0 = theseusScreenStateService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C11101 c11101 = new C11101(this.this$0, continuation);
                c11101.Z$0 = ((Boolean) obj).booleanValue();
                return c11101;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                c cVar;
                String str;
                String str2;
                c cVar2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!this.Z$0) {
                        return Unit.INSTANCE;
                    }
                    this.this$0.f102953a.g();
                    cVar = this.this$0.f102953a;
                    cVar.b("MultiWindow", true);
                    try {
                        this.L$0 = cVar;
                        this.L$1 = "MultiWindow";
                        this.label = 1;
                        if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str2 = "MultiWindow";
                    } catch (Throwable th) {
                        th = th;
                        str = "MultiWindow";
                        cVar.b(str, false);
                        throw th;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) this.L$1;
                    c cVar3 = (c) this.L$0;
                    str = str2;
                    cVar2 = cVar3;
                    try {
                        ResultKt.throwOnFailure(obj);
                        cVar = cVar3;
                    } catch (Throwable th2) {
                        cVar = cVar2;
                        th = th2;
                        cVar.b(str, false);
                        throw th;
                    }
                }
                str = str2;
                cVar2 = cVar;
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TheseusScreenStateService theseusScreenStateService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = theseusScreenStateService;
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
                TheseusScreenStateService theseusScreenStateService = this.this$0;
                Flow<Boolean> flow = theseusScreenStateService.f102954b;
                C11101 c11101 = new C11101(theseusScreenStateService, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, c11101, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.screenstate.TheseusScreenStateService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screenstate/TheseusScreenStateService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusScreenStateService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.screenstate.TheseusScreenStateService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screenstate/TheseusScreenStateService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            int I$0;
            int label;
            final TheseusScreenStateService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TheseusScreenStateService theseusScreenStateService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = theseusScreenStateService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.I$0 = ((Number) obj).intValue();
                return anonymousClass1;
            }

            public final Object invoke(int i7, Continuation<? super Unit> continuation) {
                return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i7 = this.I$0;
                if (this.this$0.f102963l.d() || !(this.this$0.f102963l.e() || this.this$0.f102963l.h())) {
                    this.this$0.f102953a.n(i7);
                    return Unit.INSTANCE;
                }
                defpackage.a.b("[theseus-united-TheseusScreenStateService$2$1-invokeSuspend] ", C3392f.a(i7, "->-> large screen, ignore sensor orientation change: ", " <-<-"), "TheseusScreenStateService$2$1-invokeSuspend");
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TheseusScreenStateService theseusScreenStateService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = theseusScreenStateService;
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
                final Flow flowDebounce = FlowKt.debounce(FlowKt.withIndex(this.this$0.f102964m.f102972b), new M(4));
                Flow<Integer> flow = new Flow<Integer>(flowDebounce) { // from class: com.bilibili.ship.theseus.united.page.screenstate.TheseusAutoRotateScreenHelper$observeTargetOrientation$$inlined$map$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Flow f102951a;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.screenstate.TheseusAutoRotateScreenHelper$observeTargetOrientation$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screenstate/TheseusAutoRotateScreenHelper$observeTargetOrientation$$inlined$map$1$2.class */
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final FlowCollector f102952a;

                        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.screenstate.TheseusAutoRotateScreenHelper$observeTargetOrientation$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screenstate/TheseusAutoRotateScreenHelper$observeTargetOrientation$$inlined$map$1$2$1.class */
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
                            this.f102952a = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                            /*
                                r5 = this;
                                r0 = r7
                                boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.screenstate.TheseusAutoRotateScreenHelper$observeTargetOrientation$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L29
                                r0 = r7
                                com.bilibili.ship.theseus.united.page.screenstate.TheseusAutoRotateScreenHelper$observeTargetOrientation$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.united.page.screenstate.TheseusAutoRotateScreenHelper$observeTargetOrientation$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                r9 = r0
                                r0 = r9
                                int r0 = r0.label
                                r8 = r0
                                r0 = r8
                                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                r0 = r0 & r1
                                if (r0 == 0) goto L29
                                r0 = r9
                                r1 = r8
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                int r1 = r1 + r2
                                r0.label = r1
                                r0 = r9
                                r7 = r0
                                goto L33
                            L29:
                                com.bilibili.ship.theseus.united.page.screenstate.TheseusAutoRotateScreenHelper$observeTargetOrientation$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.united.page.screenstate.TheseusAutoRotateScreenHelper$observeTargetOrientation$$inlined$map$1$2$1
                                r1 = r0
                                r2 = r5
                                r3 = r7
                                r1.<init>(r2, r3)
                                r7 = r0
                            L33:
                                r0 = r7
                                java.lang.Object r0 = r0.result
                                r10 = r0
                                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                r9 = r0
                                r0 = r7
                                int r0 = r0.label
                                r8 = r0
                                r0 = r8
                                if (r0 == 0) goto L5e
                                r0 = r8
                                r1 = 1
                                if (r0 != r1) goto L54
                                r0 = r10
                                kotlin.ResultKt.throwOnFailure(r0)
                                goto L83
                            L54:
                                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                r1 = r0
                                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                                r1.<init>(r2)
                                throw r0
                            L5e:
                                r0 = r10
                                kotlin.ResultKt.throwOnFailure(r0)
                                r0 = r6
                                kotlin.collections.IndexedValue r0 = (kotlin.collections.IndexedValue) r0
                                java.lang.Object r0 = r0.getValue()
                                r6 = r0
                                r0 = r7
                                r1 = 1
                                r0.label = r1
                                r0 = r5
                                kotlinx.coroutines.flow.FlowCollector r0 = r0.f102952a
                                r1 = r6
                                r2 = r7
                                java.lang.Object r0 = r0.emit(r1, r2)
                                r1 = r9
                                if (r0 != r1) goto L83
                                r0 = r9
                                return r0
                            L83:
                                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.screenstate.TheseusAutoRotateScreenHelper$observeTargetOrientation$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    {
                        this.f102951a = flowDebounce;
                    }

                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = this.f102951a.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.screenstate.TheseusScreenStateService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screenstate/TheseusScreenStateService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusScreenStateService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.screenstate.TheseusScreenStateService$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screenstate/TheseusScreenStateService$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final TheseusScreenStateService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TheseusScreenStateService theseusScreenStateService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = theseusScreenStateService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.f102953a.i(this.Z$0);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(TheseusScreenStateService theseusScreenStateService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = theseusScreenStateService;
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
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                TheseusScreenStateService theseusScreenStateService = this.this$0;
                MutableStateFlow<Boolean> mutableStateFlow = theseusScreenStateService.f102964m.f102973c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(theseusScreenStateService, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.screenstate.TheseusScreenStateService$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screenstate/TheseusScreenStateService$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<Lifecycle.Event, Continuation<? super Unit>, Object> {
        int label;
        final TheseusScreenStateService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(TheseusScreenStateService theseusScreenStateService, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = theseusScreenStateService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, continuation);
        }

        public final Object invoke(Lifecycle.Event event, Continuation<? super Unit> continuation) {
            return create(event, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TheseusScreenStateService theseusScreenStateService = this.this$0;
            theseusScreenStateService.f102953a.a(Boxing.boxBoolean(theseusScreenStateService.f102957e.getCloudConfig().c()));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.screenstate.TheseusScreenStateService$6, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screenstate/TheseusScreenStateService$6.class */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusScreenStateService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.screenstate.TheseusScreenStateService$6$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screenstate/TheseusScreenStateService$6$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final TheseusScreenStateService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(TheseusScreenStateService theseusScreenStateService, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = theseusScreenStateService;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean invokeSuspend$lambda$0(TheseusScreenStateService theseusScreenStateService, boolean z6) {
                theseusScreenStateService.f102953a.g();
                return true;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass2;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!this.Z$0) {
                        return Unit.INSTANCE;
                    }
                    final TheseusScreenStateService theseusScreenStateService = this.this$0;
                    BackActionRepository backActionRepository = theseusScreenStateService.f102958f;
                    Function1<? super Boolean, Boolean> function1 = new Function1(theseusScreenStateService) { // from class: com.bilibili.ship.theseus.united.page.screenstate.e

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final TheseusScreenStateService f103003a;

                        {
                            this.f103003a = theseusScreenStateService;
                        }

                        public final Object invoke(Object obj2) {
                            return Boolean.valueOf(TheseusScreenStateService.AnonymousClass6.AnonymousClass2.invokeSuspend$lambda$0(this.f103003a, ((Boolean) obj2).booleanValue()));
                        }
                    };
                    this.label = 1;
                    if (backActionRepository.b(function1, this) == coroutine_suspended) {
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
        public AnonymousClass6(TheseusScreenStateService theseusScreenStateService, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.this$0 = theseusScreenStateService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass6(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow stateFlowC = this.this$0.f102953a.c();
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Boolean>(stateFlowC) { // from class: com.bilibili.ship.theseus.united.page.screenstate.TheseusScreenStateService$6$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Flow f102965a;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.screenstate.TheseusScreenStateService$6$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screenstate/TheseusScreenStateService$6$invokeSuspend$$inlined$map$1$2.class */
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final FlowCollector f102966a;

                        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.screenstate.TheseusScreenStateService$6$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screenstate/TheseusScreenStateService$6$invokeSuspend$$inlined$map$1$2$1.class */
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
                            this.f102966a = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                            /*
                                r5 = this;
                                r0 = r7
                                boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.screenstate.TheseusScreenStateService$6$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L29
                                r0 = r7
                                com.bilibili.ship.theseus.united.page.screenstate.TheseusScreenStateService$6$invokeSuspend$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.united.page.screenstate.TheseusScreenStateService$6$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                r9 = r0
                                r0 = r9
                                int r0 = r0.label
                                r8 = r0
                                r0 = r8
                                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                r0 = r0 & r1
                                if (r0 == 0) goto L29
                                r0 = r9
                                r1 = r8
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                int r1 = r1 + r2
                                r0.label = r1
                                r0 = r9
                                r7 = r0
                                goto L33
                            L29:
                                com.bilibili.ship.theseus.united.page.screenstate.TheseusScreenStateService$6$invokeSuspend$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.united.page.screenstate.TheseusScreenStateService$6$invokeSuspend$$inlined$map$1$2$1
                                r1 = r0
                                r2 = r5
                                r3 = r7
                                r1.<init>(r2, r3)
                                r7 = r0
                            L33:
                                r0 = r7
                                java.lang.Object r0 = r0.result
                                r10 = r0
                                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                r9 = r0
                                r0 = r7
                                int r0 = r0.label
                                r8 = r0
                                r0 = r8
                                if (r0 == 0) goto L5e
                                r0 = r8
                                r1 = 1
                                if (r0 != r1) goto L54
                                r0 = r10
                                kotlin.ResultKt.throwOnFailure(r0)
                                goto L86
                            L54:
                                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                r1 = r0
                                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                                r1.<init>(r2)
                                throw r0
                            L5e:
                                r0 = r10
                                kotlin.ResultKt.throwOnFailure(r0)
                                r0 = r6
                                com.bilibili.ship.theseus.united.page.screenstate.c$a r0 = (com.bilibili.ship.theseus.united.page.screenstate.c.a) r0
                                boolean r0 = r0.f102988b
                                java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
                                r6 = r0
                                r0 = r7
                                r1 = 1
                                r0.label = r1
                                r0 = r5
                                kotlinx.coroutines.flow.FlowCollector r0 = r0.f102966a
                                r1 = r6
                                r2 = r7
                                java.lang.Object r0 = r0.emit(r1, r2)
                                r1 = r9
                                if (r0 != r1) goto L86
                                r0 = r9
                                return r0
                            L86:
                                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.screenstate.TheseusScreenStateService$6$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    {
                        this.f102965a = stateFlowC;
                    }

                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = this.f102965a.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.screenstate.TheseusScreenStateService$7, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screenstate/TheseusScreenStateService$7.class */
    public static final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusScreenStateService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.screenstate.TheseusScreenStateService$7$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screenstate/TheseusScreenStateService$7$3.class */
        public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function3<c.a, WindowSizeClass, Continuation<? super Pair<? extends c.a, ? extends WindowSizeClass>>, Object>, SuspendFunction {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            public AnonymousClass3() {
                super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public final Object invoke(c.a aVar, WindowSizeClass windowSizeClass, Continuation<? super Pair<c.a, WindowSizeClass>> continuation) {
                return AnonymousClass7.invokeSuspend$lambda$0(aVar, windowSizeClass, continuation);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.screenstate.TheseusScreenStateService$7$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screenstate/TheseusScreenStateService$7$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<Pair<? extends c.a, ? extends WindowSizeClass>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final TheseusScreenStateService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(TheseusScreenStateService theseusScreenStateService, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = theseusScreenStateService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            public final Object invoke(Pair<c.a, WindowSizeClass> pair, Continuation<? super Unit> continuation) {
                return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Pair pair = (Pair) this.L$0;
                c.a aVar = (c.a) pair.component1();
                WindowSizeClass windowSizeClass = (WindowSizeClass) pair.component2();
                boolean z6 = aVar.f102987a;
                boolean zM = true;
                boolean z7 = aVar.f102989c;
                int i7 = z6 ? z7 ? 9 : 1 : z7 ? 8 : 0;
                int requestedOrientation = this.this$0.f102959g.getRequestedOrientation();
                boolean zE = this.this$0.f102963l.e();
                boolean zH = this.this$0.f102963l.h();
                boolean zD = this.this$0.f102963l.d();
                StringBuilder sb = new StringBuilder("->-> screenState: ");
                sb.append(aVar);
                sb.append(",  windowSize: ");
                sb.append(windowSizeClass);
                sb.append(", isLarge: ");
                P.a(", isMedium: ", ", requestedOrientation: ", sb, zE, zH);
                C4690e.a(i7, requestedOrientation, ", activityOrientation: ", ", isInMagicWindow: ", sb);
                BLog.i("TheseusScreenStateService$7$4-invokeSuspend", "[theseus-united-TheseusScreenStateService$7$4-invokeSuspend] " + i.a(sb, zD, " <-<-"));
                if (!p.d() && !zD && (zE || zH)) {
                    this.this$0.f102959g.setRequestedOrientation(-1);
                    BLog.i("TheseusScreenStateService$7$4-invokeSuspend", "[theseus-united-TheseusScreenStateService$7$4-invokeSuspend] ->-> large screen, reset requested orientation to unspecified");
                    return Unit.INSTANCE;
                }
                if (p.d()) {
                    zM = this.this$0.f102953a.m();
                }
                if (zM) {
                    defpackage.a.b("[theseus-united-TheseusScreenStateService$7$4-invokeSuspend] ", androidx.compose.runtime.collection.d.a(requestedOrientation, i7, "->-> requestedOrientation enable:  ", " ", " <-<-"), "TheseusScreenStateService$7$4-invokeSuspend");
                    if (requestedOrientation == i7) {
                        return Unit.INSTANCE;
                    }
                    this.this$0.f102959g.setRequestedOrientation(i7);
                } else {
                    defpackage.a.b("[theseus-united-TheseusScreenStateService$7$4-invokeSuspend] ", C3392f.a(i7, "->-> requestedOrientation disable: ", " <-<-"), "TheseusScreenStateService$7$4-invokeSuspend");
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(TheseusScreenStateService theseusScreenStateService, Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
            this.this$0 = theseusScreenStateService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$0(c.a aVar, WindowSizeClass windowSizeClass, Continuation continuation) {
            return new Pair(aVar, windowSizeClass);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass7(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(this.this$0.f102953a.c(), this.this$0.f102963l.f102939c, AnonymousClass3.INSTANCE));
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.screenstate.TheseusScreenStateService$8, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screenstate/TheseusScreenStateService$8.class */
    public static final class AnonymousClass8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusScreenStateService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.screenstate.TheseusScreenStateService$8$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screenstate/TheseusScreenStateService$8$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<PlayingAreaDescription, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final TheseusScreenStateService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TheseusScreenStateService theseusScreenStateService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = theseusScreenStateService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(PlayingAreaDescription playingAreaDescription, Continuation<? super Unit> continuation) {
                return create(playingAreaDescription, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                PlayingAreaDescription playingAreaDescription = (PlayingAreaDescription) this.L$0;
                this.this$0.f102953a.l(playingAreaDescription != null ? Boxing.boxBoolean(playingAreaDescription.a()) : null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(TheseusScreenStateService theseusScreenStateService, Continuation<? super AnonymousClass8> continuation) {
            super(2, continuation);
            this.this$0 = theseusScreenStateService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass8(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                TheseusScreenStateService theseusScreenStateService = this.this$0;
                StateFlow<PlayingAreaDescription> stateFlow = theseusScreenStateService.h.f123389b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(theseusScreenStateService, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.screenstate.TheseusScreenStateService$9, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screenstate/TheseusScreenStateService$9.class */
    public static final class AnonymousClass9 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusScreenStateService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.screenstate.TheseusScreenStateService$9$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screenstate/TheseusScreenStateService$9$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            Object L$0;
            Object L$1;
            boolean Z$0;
            int label;
            final TheseusScreenStateService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TheseusScreenStateService theseusScreenStateService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = theseusScreenStateService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                c cVar;
                Object obj2;
                c cVar2;
                Object obj3;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.Z$0) {
                        return Unit.INSTANCE;
                    }
                    cVar = this.this$0.f102953a;
                    obj2 = new Object();
                    cVar.b(obj2, true);
                    try {
                        this.L$0 = cVar;
                        this.L$1 = obj2;
                        this.label = 1;
                        if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th) {
                        th = th;
                        cVar2 = cVar;
                        cVar2.b(obj2, false);
                        throw th;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj4 = this.L$1;
                    cVar = (c) this.L$0;
                    obj3 = obj4;
                    cVar2 = cVar;
                    try {
                        ResultKt.throwOnFailure(obj);
                        obj2 = obj4;
                    } catch (Throwable th2) {
                        obj2 = obj3;
                        th = th2;
                        cVar2.b(obj2, false);
                        throw th;
                    }
                }
                obj3 = obj2;
                cVar2 = cVar;
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(TheseusScreenStateService theseusScreenStateService, Continuation<? super AnonymousClass9> continuation) {
            super(2, continuation);
            this.this$0 = theseusScreenStateService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass9(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                TheseusScreenStateService theseusScreenStateService = this.this$0;
                Flow<Boolean> flow = theseusScreenStateService.f102955c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(theseusScreenStateService, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screenstate/TheseusScreenStateService$a.class */
    public static final class a implements WholeSceneModeChangeObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TheseusScreenStateService f102967a;

        public a(TheseusScreenStateService theseusScreenStateService) {
            this.f102967a = theseusScreenStateService;
        }

        public final void onEnterWholeScene() {
            this.f102967a.f102953a.j("WholeSceneModeChangeObserver", true);
        }

        public final void onExitWholeScene() {
            this.f102967a.f102953a.j("WholeSceneModeChangeObserver", false);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screenstate/TheseusScreenStateService$b.class */
    public static final class b implements I {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TheseusScreenStateService f102968a;

        public b(TheseusScreenStateService theseusScreenStateService) {
            this.f102968a = theseusScreenStateService;
        }

        public final void onWidgetDismiss(FunctionWidgetToken functionWidgetToken) {
            TheseusScreenStateService theseusScreenStateService = this.f102968a;
            BuildersKt.launch$default(theseusScreenStateService.f102956d, (CoroutineContext) null, (CoroutineStart) null, new TheseusScreenStateService$widgetStateChangeListener$1$updateOrientationLock$1(true, theseusScreenStateService, null), 3, (Object) null);
            if (Intrinsics.areEqual(functionWidgetToken.getClazz(), ViewOnClickListenerC6833a.class)) {
                theseusScreenStateService.f102953a.b(functionWidgetToken, false);
            }
        }

        public final void onWidgetShow(FunctionWidgetToken functionWidgetToken) {
            TheseusScreenStateService theseusScreenStateService = this.f102968a;
            BuildersKt.launch$default(theseusScreenStateService.f102956d, (CoroutineContext) null, (CoroutineStart) null, new TheseusScreenStateService$widgetStateChangeListener$1$updateOrientationLock$1(false, theseusScreenStateService, null), 3, (Object) null);
            if (Intrinsics.areEqual(functionWidgetToken.getClazz(), ViewOnClickListenerC6833a.class)) {
                theseusScreenStateService.f102953a.b(functionWidgetToken, true);
            }
        }
    }

    @Inject
    public TheseusScreenStateService(@NotNull c cVar, @NotNull Flow<Boolean> flow, @NotNull Flow<Boolean> flow2, @NotNull Lifecycle lifecycle, @NotNull CoroutineScope coroutineScope, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull BackActionRepository backActionRepository, @NotNull ComponentActivity componentActivity, @NotNull C7893a c7893a, @NotNull AbsFunctionWidgetService absFunctionWidgetService, @NotNull PlayerContainer playerContainer, @NotNull IRenderContainerService iRenderContainerService, @NotNull AutoFullscreenService autoFullscreenService, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar) {
        this.f102953a = cVar;
        this.f102954b = flow;
        this.f102955c = flow2;
        this.f102956d = coroutineScope;
        this.f102957e = iPlayerSettingService;
        this.f102958f = backActionRepository;
        this.f102959g = componentActivity;
        this.h = c7893a;
        this.f102960i = absFunctionWidgetService;
        this.f102961j = playerContainer;
        this.f102962k = iRenderContainerService;
        this.f102963l = aVar;
        this.f102964m = new com.bilibili.ship.theseus.united.page.screenstate.a(lifecycle);
        b bVar = new b(this);
        a aVar2 = new a(this);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        final Flow<Lifecycle.Event> eventFlow = LifecycleKt.getEventFlow(lifecycle);
        FlowKt.launchIn(FlowKt.onEach(new Flow<Lifecycle.Event>(eventFlow) { // from class: com.bilibili.ship.theseus.united.page.screenstate.TheseusScreenStateService$special$$inlined$filter$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f102969a;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.screenstate.TheseusScreenStateService$special$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screenstate/TheseusScreenStateService$special$$inlined$filter$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f102970a;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.screenstate.TheseusScreenStateService$special$$inlined$filter$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screenstate/TheseusScreenStateService$special$$inlined$filter$1$2$1.class */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
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
                    this.f102970a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        r0 = r7
                        boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.screenstate.TheseusScreenStateService$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.ship.theseus.united.page.screenstate.TheseusScreenStateService$special$$inlined$filter$1$2$1 r0 = (com.bilibili.ship.theseus.united.page.screenstate.TheseusScreenStateService$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        r9 = r0
                        r0 = r9
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r0 & r1
                        if (r0 == 0) goto L29
                        r0 = r9
                        r1 = r8
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        int r1 = r1 + r2
                        r0.label = r1
                        r0 = r9
                        r7 = r0
                        goto L33
                    L29:
                        com.bilibili.ship.theseus.united.page.screenstate.TheseusScreenStateService$special$$inlined$filter$1$2$1 r0 = new com.bilibili.ship.theseus.united.page.screenstate.TheseusScreenStateService$special$$inlined$filter$1$2$1
                        r1 = r0
                        r2 = r5
                        r3 = r7
                        r1.<init>(r2, r3)
                        r7 = r0
                    L33:
                        r0 = r7
                        java.lang.Object r0 = r0.result
                        r9 = r0
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        r10 = r0
                        r0 = r7
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        if (r0 == 0) goto L5e
                        r0 = r8
                        r1 = 1
                        if (r0 != r1) goto L54
                        r0 = r9
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto L85
                    L54:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r1 = r0
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r0
                    L5e:
                        r0 = r9
                        kotlin.ResultKt.throwOnFailure(r0)
                        r0 = r6
                        androidx.lifecycle.Lifecycle$Event r0 = (androidx.lifecycle.Lifecycle.Event) r0
                        androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
                        if (r0 != r1) goto L85
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f102970a
                        r1 = r6
                        r2 = r7
                        java.lang.Object r0 = r0.emit(r1, r2)
                        r1 = r10
                        if (r0 != r1) goto L85
                        r0 = r10
                        return r0
                    L85:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.screenstate.TheseusScreenStateService$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f102969a = eventFlow;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f102969a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new AnonymousClass5(this, null)), coroutineScope);
        if (!autoFullscreenService.f98785a) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass6(this, null), 3, (Object) null);
        }
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass7(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass8(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass9(this, null), 3, (Object) null);
        iRenderContainerService.addWholeSceneModeChangeObserver(aVar2);
        absFunctionWidgetService.addOnWidgetStateChangeListener(bVar);
    }
}
