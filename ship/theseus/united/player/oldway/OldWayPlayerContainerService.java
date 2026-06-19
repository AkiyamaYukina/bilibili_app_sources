package com.bilibili.ship.theseus.united.player.oldway;

import Vn.A;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.view.KeyEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.playerbizcommon.features.background.BackgroundPlayService;
import com.bilibili.playerbizcommon.gesture.IGestureService;
import com.bilibili.playerbizcommonv2.service.DanmakuInputWindowService;
import com.bilibili.ship.theseus.united.page.backpress.c;
import com.bilibili.ship.theseus.united.page.playingarea.a;
import com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository;
import com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository;
import com.bilibili.ship.theseus.united.player.oldway.OldWayPlayerContainerService;
import java.util.HashSet;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.ControlContainerType;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.ControlContainerObserver;
import tv.danmaku.biliplayerv2.service.ControlContainerVisibleObserver;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.SeekService;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.send.DanmakuConfigChange;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/OldWayPlayerContainerService.class */
@StabilityInferred(parameters = 0)
public final class OldWayPlayerContainerService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f104662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f104663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ToolbarRepository f104664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IGestureService f104665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IInteractLayerService f104666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final TheseusPageUIStyleRepository f104667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Flow<Configuration> f104668g;

    @NotNull
    public final PlayerContainer h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.backpress.c f104669i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f104670j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.a f104671k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Context f104672l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f104673m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f104674n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<ScreenModeType> f104675o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f104676p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f104677q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f104678r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f104679s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final String f104680t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final String f104681u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final b f104682v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final a f104683w;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.oldway.OldWayPlayerContainerService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/OldWayPlayerContainerService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OldWayPlayerContainerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OldWayPlayerContainerService oldWayPlayerContainerService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = oldWayPlayerContainerService;
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
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    OldWayPlayerContainerService oldWayPlayerContainerService = this.this$0;
                    oldWayPlayerContainerService.f104663b.registerControlContainerVisible(oldWayPlayerContainerService.f104682v);
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
                OldWayPlayerContainerService oldWayPlayerContainerService2 = this.this$0;
                oldWayPlayerContainerService2.f104663b.unregisterControlContainerVisible(oldWayPlayerContainerService2.f104682v);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.oldway.OldWayPlayerContainerService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/OldWayPlayerContainerService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OldWayPlayerContainerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(OldWayPlayerContainerService oldWayPlayerContainerService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = oldWayPlayerContainerService;
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
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    OldWayPlayerContainerService oldWayPlayerContainerService = this.this$0;
                    oldWayPlayerContainerService.f104663b.registerState(oldWayPlayerContainerService.f104683w);
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
                OldWayPlayerContainerService oldWayPlayerContainerService2 = this.this$0;
                oldWayPlayerContainerService2.f104663b.unregisterState(oldWayPlayerContainerService2.f104683w);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.oldway.OldWayPlayerContainerService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/OldWayPlayerContainerService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OldWayPlayerContainerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.oldway.OldWayPlayerContainerService$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/OldWayPlayerContainerService$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function3<Boolean, ScreenModeType, Continuation<? super Boolean>, Object> {
            Object L$0;
            boolean Z$0;
            int label;

            public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke(((Boolean) obj).booleanValue(), (ScreenModeType) obj2, (Continuation<? super Boolean>) obj3);
            }

            public final Object invoke(boolean z6, ScreenModeType screenModeType, Continuation<? super Boolean> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.Z$0 = z6;
                anonymousClass1.L$0 = screenModeType;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(this.Z$0 && ((ScreenModeType) this.L$0) == ScreenModeType.THUMB);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.oldway.OldWayPlayerContainerService$3$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/OldWayPlayerContainerService$3$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final OldWayPlayerContainerService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(OldWayPlayerContainerService oldWayPlayerContainerService, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = oldWayPlayerContainerService;
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
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.Z$0) {
                    OldWayPlayerContainerService oldWayPlayerContainerService = this.this$0;
                    oldWayPlayerContainerService.f104664c.b(oldWayPlayerContainerService.f104680t);
                } else {
                    OldWayPlayerContainerService oldWayPlayerContainerService2 = this.this$0;
                    oldWayPlayerContainerService2.f104664c.a(oldWayPlayerContainerService2.f104680t);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(OldWayPlayerContainerService oldWayPlayerContainerService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = oldWayPlayerContainerService;
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
                OldWayPlayerContainerService oldWayPlayerContainerService = this.this$0;
                Flow flowCombine = FlowKt.combine(oldWayPlayerContainerService.f104674n, oldWayPlayerContainerService.f104675o, new AnonymousClass1(null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCombine, anonymousClass2, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.oldway.OldWayPlayerContainerService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/OldWayPlayerContainerService$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OldWayPlayerContainerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(OldWayPlayerContainerService oldWayPlayerContainerService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = oldWayPlayerContainerService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$0(OldWayPlayerContainerService oldWayPlayerContainerService, KeyEvent keyEvent) {
            return oldWayPlayerContainerService.h.dispatchKeyEvent(keyEvent);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                final OldWayPlayerContainerService oldWayPlayerContainerService = this.this$0;
                com.bilibili.ship.theseus.united.page.backpress.c cVar = oldWayPlayerContainerService.f104669i;
                c.a aVar = new c.a(new Function1(oldWayPlayerContainerService) { // from class: com.bilibili.ship.theseus.united.player.oldway.b

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final OldWayPlayerContainerService f104726a;

                    {
                        this.f104726a = oldWayPlayerContainerService;
                    }

                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(OldWayPlayerContainerService.AnonymousClass4.invokeSuspend$lambda$0(this.f104726a, (KeyEvent) obj2));
                    }
                });
                this.label = 1;
                if (cVar.b(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.oldway.OldWayPlayerContainerService$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/OldWayPlayerContainerService$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OldWayPlayerContainerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.oldway.OldWayPlayerContainerService$5$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/OldWayPlayerContainerService$5$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OldWayPlayerContainerService f104684a;

            public a(OldWayPlayerContainerService oldWayPlayerContainerService) {
                this.f104684a = oldWayPlayerContainerService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                this.f104684a.h.onConfigurationChanged((Configuration) obj);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(OldWayPlayerContainerService oldWayPlayerContainerService, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = oldWayPlayerContainerService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDrop = FlowKt.drop(this.this$0.f104668g, 1);
                a aVar = new a(this.this$0);
                this.label = 1;
                if (flowDrop.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.oldway.OldWayPlayerContainerService$6, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/OldWayPlayerContainerService$6.class */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OldWayPlayerContainerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.oldway.OldWayPlayerContainerService$6$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/OldWayPlayerContainerService$6$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<a.C1102a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final OldWayPlayerContainerService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(OldWayPlayerContainerService oldWayPlayerContainerService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = oldWayPlayerContainerService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(a.C1102a c1102a, Continuation<? super Unit> continuation) {
                return create(c1102a, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                a.C1102a c1102a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    c1102a = (a.C1102a) this.L$0;
                    this.L$0 = c1102a;
                    this.label = 1;
                    if (YieldKt.yield(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.C1102a c1102a2 = (a.C1102a) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    c1102a = c1102a2;
                }
                int i8 = c1102a.f102351a;
                int i9 = c1102a.f102352b - (!this.this$0.f104670j.h().f102988b ? this.this$0.f104667f.f103507q : 0);
                float f7 = this.this$0.f104672l.getResources().getDisplayMetrics().density;
                StringBuilder sbB = A.b(i8, i9, "bounds width: ", ", height: ", ", density: ");
                sbB.append(f7);
                defpackage.a.b("[theseus-united-OldWayPlayerContainerService$6$1-invokeSuspend] ", sbB.toString(), "OldWayPlayerContainerService$6$1-invokeSuspend");
                if (f7 == 0.0f) {
                    return Unit.INSTANCE;
                }
                int i10 = (int) (i8 / f7);
                int i11 = (int) (i9 / f7);
                DanmakuConfigChange.VisibleRect visibleRect = new DanmakuConfigChange.VisibleRect();
                visibleRect.setOrigin(new float[]{0.0f, 0.0f});
                visibleRect.setSize(new int[]{i10, i11});
                this.this$0.f104666e.setVisibleRect(visibleRect);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(OldWayPlayerContainerService oldWayPlayerContainerService, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.this$0 = oldWayPlayerContainerService;
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
                StateFlow<a.C1102a> stateFlowG = this.this$0.f104671k.g();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowG, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/OldWayPlayerContainerService$a.class */
    public static final class a implements ControlContainerObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OldWayPlayerContainerService f104685a;

        public a(OldWayPlayerContainerService oldWayPlayerContainerService) {
            this.f104685a = oldWayPlayerContainerService;
        }

        public final void onControlContainerChanged(ControlContainerType controlContainerType, ScreenModeType screenModeType) {
            this.f104685a.f104675o.setValue(screenModeType);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/OldWayPlayerContainerService$b.class */
    public static final class b implements ControlContainerVisibleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OldWayPlayerContainerService f104686a;

        public b(OldWayPlayerContainerService oldWayPlayerContainerService) {
            this.f104686a = oldWayPlayerContainerService;
        }

        public final void onControlContainerImmersiveChanged(int i7, boolean z6) {
            OldWayPlayerContainerService oldWayPlayerContainerService = this.f104686a;
            if (oldWayPlayerContainerService.f104663b.getScreenModeType() != ScreenModeType.THUMB) {
                return;
            }
            if (z6) {
                oldWayPlayerContainerService.f104664c.a(oldWayPlayerContainerService.f104681u);
            } else {
                oldWayPlayerContainerService.f104664c.b(oldWayPlayerContainerService.f104681u);
            }
        }

        public final void onControlContainerVisibleChanged(boolean z6) {
            this.f104686a.f104673m.setValue(Boolean.valueOf(z6));
        }
    }

    @Inject
    public OldWayPlayerContainerService(@NotNull CoroutineScope coroutineScope, @NotNull IControlContainerService iControlContainerService, @NotNull ToolbarRepository toolbarRepository, @NotNull BackgroundPlayService backgroundPlayService, @NotNull IGestureService iGestureService, @NotNull SeekService seekService, @NotNull IInteractLayerService iInteractLayerService, @NotNull TheseusPageUIStyleRepository theseusPageUIStyleRepository, @NotNull Flow<Configuration> flow, @NotNull PlayerContainer playerContainer, @NotNull com.bilibili.ship.theseus.united.page.backpress.c cVar, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar2, @NotNull com.bilibili.ship.theseus.united.page.playingarea.a aVar, @NotNull Context context, @NotNull DanmakuInputWindowService danmakuInputWindowService) {
        this.f104662a = coroutineScope;
        this.f104663b = iControlContainerService;
        this.f104664c = toolbarRepository;
        this.f104665d = iGestureService;
        this.f104666e = iInteractLayerService;
        this.f104667f = theseusPageUIStyleRepository;
        this.f104668g = flow;
        this.h = playerContainer;
        this.f104669i = cVar;
        this.f104670j = cVar2;
        this.f104671k = aVar;
        this.f104672l = context;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f104673m = MutableStateFlow;
        this.f104674n = FlowKt.asStateFlow(MutableStateFlow);
        this.f104675o = StateFlowKt.MutableStateFlow(ScreenModeType.THUMB);
        new HashSet();
        Boolean bool = Boolean.TRUE;
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this.f104676p = MutableStateFlow2;
        this.f104677q = FlowKt.asStateFlow(MutableStateFlow2);
        new HashSet();
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(bool);
        this.f104678r = MutableStateFlow3;
        this.f104679s = FlowKt.asStateFlow(MutableStateFlow3);
        this.f104680t = "ControlContainer";
        this.f104681u = "ControlContainerImmersive";
        this.f104682v = new b(this);
        this.f104683w = new a(this);
        backgroundPlayService.setSettingAvailable(true);
        backgroundPlayService.switchPlayModeEnable(true);
        backgroundPlayService.useNewNotificationType();
        backgroundPlayService.setAlwaysDisplayBackgroundControls(true);
        iGestureService.setResizeGestureEnable(true);
        seekService.setShowSimpleProgressControlTypes(new ControlContainerType[]{ControlContainerType.HALF_SCREEN});
        SharedPreferences bLKVSharedPreference = BiliGlobalPreferenceHelper.getBLKVSharedPreference();
        iInteractLayerService.setEyesProtectionMode(bLKVSharedPreference != null ? bLKVSharedPreference.getBoolean("pref_player_eyes_protection_mode_key", false) : false);
        iInteractLayerService.setSubtitleStateShareEnable(true);
        iInteractLayerService.setThumbnailEnable(false);
        iInteractLayerService.setThumbnail2Enable(true);
        danmakuInputWindowService.f81799j = true;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass6(this, null), 3, (Object) null);
    }
}
