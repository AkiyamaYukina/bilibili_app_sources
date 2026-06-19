package com.bilibili.ship.theseus.united.page.uistyle;

import Oi1.d;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.window.core.layout.WindowSizeClass;
import bi0.AbstractC5109a;
import com.bilibili.bus.ChannelOperation;
import com.bilibili.bus.Violet;
import com.bilibili.lib.config.BLRemoteConfig;
import com.bilibili.lib.theme.R$color;
import com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaDescription;
import com.bilibili.ship.theseus.united.page.tab.TheseusTabPagerService;
import com.bilibili.ship.theseus.united.page.tab.i;
import com.bilibili.ship.theseus.united.page.uistyle.TheseusDetailUIStyleService;
import com.bilibili.ship.theseus.united.page.view.r;
import com.bilibili.ship.theseus.united.page.view.t;
import java.util.List;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.ControlContainerType;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.ControlContainerObserver;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.biliplayerv2.service.setting.PlayerSettingServiceKtxKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusDetailUIStyleService.class */
@StabilityInferred(parameters = 0)
public final class TheseusDetailUIStyleService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f103473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f103474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final t f103475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final TheseusPageUIStyleRepository f103476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f103477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C7893a f103478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f103479g;

    @NotNull
    public final IInteractLayerService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f103480i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Flow<a> f103481j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final TheseusTabPagerService.b f103482k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final i f103483l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Context f103484m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f103485n = StateFlowKt.MutableStateFlow(Boolean.FALSE);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<ScreenModeType> f103486o = StateFlowKt.MutableStateFlow(ScreenModeType.THUMB);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final b f103487p = new b(this);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final c f103488q = new c(this);

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusDetailUIStyleService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusDetailUIStyleService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final MutableStateFlow<Long> $verticalModeSettingEventFlow;
        int label;
        final TheseusDetailUIStyleService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusDetailUIStyleService$1$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusDetailUIStyleService$1$3.class */
        public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function4<Long, d, PlayingAreaDescription, Continuation<? super Triple<? extends Long, ? extends d, ? extends PlayingAreaDescription>>, Object>, SuspendFunction {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            public AnonymousClass3() {
                super(4, Triple.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public final Object invoke(long j7, d dVar, PlayingAreaDescription playingAreaDescription, Continuation<? super Triple<Long, d, PlayingAreaDescription>> continuation) {
                return AnonymousClass1.invokeSuspend$lambda$0(j7, dVar, playingAreaDescription, continuation);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return invoke(((Number) obj).longValue(), (d) obj2, (PlayingAreaDescription) obj3, (Continuation<? super Triple<Long, d, PlayingAreaDescription>>) obj4);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusDetailUIStyleService$1$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusDetailUIStyleService$1$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<Triple<? extends Long, ? extends d, ? extends PlayingAreaDescription>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final TheseusDetailUIStyleService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(TheseusDetailUIStyleService theseusDetailUIStyleService, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = theseusDetailUIStyleService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            public final Object invoke(Triple<Long, d, PlayingAreaDescription> triple, Continuation<? super Unit> continuation) {
                return create(triple, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Triple triple = (Triple) this.L$0;
                    d dVar = (d) triple.component2();
                    PlayingAreaDescription playingAreaDescription = (PlayingAreaDescription) triple.component3();
                    if (playingAreaDescription == null) {
                        return Unit.INSTANCE;
                    }
                    if (playingAreaDescription.a()) {
                        if (dVar.k()) {
                            TheseusDetailUIStyleService theseusDetailUIStyleService = this.this$0;
                            r rVar = theseusDetailUIStyleService.f103475c.f104126b.f104089d;
                            if (rVar != null && rVar.f104118a) {
                                this.label = 1;
                                if (theseusDetailUIStyleService.f103476d.c(true, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                    } else if (!dVar.U()) {
                        TheseusDetailUIStyleService theseusDetailUIStyleService2 = this.this$0;
                        r rVar2 = theseusDetailUIStyleService2.f103475c.f104126b.f104089d;
                        if (rVar2 != null && rVar2.f104120c) {
                            this.label = 2;
                            if (theseusDetailUIStyleService2.f103476d.c(true, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                } else {
                    if (i7 != 1 && i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableStateFlow<Long> mutableStateFlow, TheseusDetailUIStyleService theseusDetailUIStyleService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$verticalModeSettingEventFlow = mutableStateFlow;
            this.this$0 = theseusDetailUIStyleService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$0(long j7, d dVar, PlayingAreaDescription playingAreaDescription, Continuation continuation) {
            return new Triple(Boxing.boxLong(j7), dVar, playingAreaDescription);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$verticalModeSettingEventFlow, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowCombine = FlowKt.combine(this.$verticalModeSettingEventFlow, PlayerSettingServiceKtxKt.a(this.this$0.f103477e), this.this$0.f103478f.f123389b, AnonymousClass3.INSTANCE);
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCombine, anonymousClass4, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusDetailUIStyleService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusDetailUIStyleService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final MutableStateFlow<Long> $verticalModeSettingEventFlow;
        Object L$0;
        int label;
        final TheseusDetailUIStyleService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TheseusDetailUIStyleService theseusDetailUIStyleService, MutableStateFlow<Long> mutableStateFlow, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = theseusDetailUIStyleService;
            this.$verticalModeSettingEventFlow = mutableStateFlow;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(MutableStateFlow mutableStateFlow, List list) {
            if (list.isEmpty()) {
                return;
            }
            mutableStateFlow.setValue(Long.valueOf(System.currentTimeMillis()));
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$verticalModeSettingEventFlow, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Observer observerObserveCachedInactiveUnSticky;
            Observer observer;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ChannelOperation channelOperationOfChannel = Violet.INSTANCE.ofChannel(AbstractC5109a.g.class);
                FragmentActivity fragmentActivity = this.this$0.f103474b;
                final MutableStateFlow<Long> mutableStateFlow = this.$verticalModeSettingEventFlow;
                observerObserveCachedInactiveUnSticky = channelOperationOfChannel.observeCachedInactiveUnSticky(fragmentActivity, new Observer(mutableStateFlow) { // from class: com.bilibili.ship.theseus.united.page.uistyle.a

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final MutableStateFlow f103542a;

                    {
                        this.f103542a = mutableStateFlow;
                    }

                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj2) {
                        TheseusDetailUIStyleService.AnonymousClass2.invokeSuspend$lambda$0(this.f103542a, (List) obj2);
                    }
                });
                try {
                    this.L$0 = observerObserveCachedInactiveUnSticky;
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th) {
                    th = th;
                    Violet.INSTANCE.ofChannel(AbstractC5109a.g.class).removeObserver(observerObserveCachedInactiveUnSticky);
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Observer observer2 = (Observer) this.L$0;
                observer = observer2;
                try {
                    ResultKt.throwOnFailure(obj);
                    observerObserveCachedInactiveUnSticky = observer2;
                } catch (Throwable th2) {
                    observerObserveCachedInactiveUnSticky = observer;
                    th = th2;
                    Violet.INSTANCE.ofChannel(AbstractC5109a.g.class).removeObserver(observerObserveCachedInactiveUnSticky);
                    throw th;
                }
            }
            Observer observer3 = observerObserveCachedInactiveUnSticky;
            observer = observerObserveCachedInactiveUnSticky;
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusDetailUIStyleService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusDetailUIStyleService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusDetailUIStyleService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusDetailUIStyleService$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusDetailUIStyleService$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function4<ScreenModeType, Boolean, WindowSizeClass, Continuation<? super Boolean>, Object> {
            Object L$0;
            boolean Z$0;
            int label;
            final TheseusDetailUIStyleService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TheseusDetailUIStyleService theseusDetailUIStyleService, Continuation<? super AnonymousClass1> continuation) {
                super(4, continuation);
                this.this$0 = theseusDetailUIStyleService;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return invoke((ScreenModeType) obj, ((Boolean) obj2).booleanValue(), (WindowSizeClass) obj3, (Continuation<? super Boolean>) obj4);
            }

            public final Object invoke(ScreenModeType screenModeType, boolean z6, WindowSizeClass windowSizeClass, Continuation<? super Boolean> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = screenModeType;
                anonymousClass1.Z$0 = z6;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(((ScreenModeType) this.L$0) == ScreenModeType.THUMB && this.Z$0 && !this.this$0.f103479g.f());
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusDetailUIStyleService$3$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusDetailUIStyleService$3$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final TheseusDetailUIStyleService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(TheseusDetailUIStyleService theseusDetailUIStyleService, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = theseusDetailUIStyleService;
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
                    this.this$0.h.setForcedChapterGuide(true);
                } else {
                    this.this$0.h.setForcedChapterGuide(false);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(TheseusDetailUIStyleService theseusDetailUIStyleService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = theseusDetailUIStyleService;
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
                TheseusDetailUIStyleService theseusDetailUIStyleService = this.this$0;
                theseusDetailUIStyleService.f103480i.registerState(theseusDetailUIStyleService.f103487p);
                TheseusDetailUIStyleService theseusDetailUIStyleService2 = this.this$0;
                theseusDetailUIStyleService2.h.addSegmentSwitchObserver(theseusDetailUIStyleService2.f103488q);
                TheseusDetailUIStyleService theseusDetailUIStyleService3 = this.this$0;
                Flow flowCombine = FlowKt.combine(theseusDetailUIStyleService3.f103486o, theseusDetailUIStyleService3.f103485n, theseusDetailUIStyleService3.f103479g.f102939c, new AnonymousClass1(theseusDetailUIStyleService3, null));
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusDetailUIStyleService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusDetailUIStyleService$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusDetailUIStyleService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(TheseusDetailUIStyleService theseusDetailUIStyleService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = theseusDetailUIStyleService;
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
                TheseusDetailUIStyleService theseusDetailUIStyleService = this.this$0;
                theseusDetailUIStyleService.f103480i.unregisterState(theseusDetailUIStyleService.f103487p);
                TheseusDetailUIStyleService theseusDetailUIStyleService2 = this.this$0;
                theseusDetailUIStyleService2.h.removeSegmentSwitchObserver(theseusDetailUIStyleService2.f103488q);
                this.this$0.h.setForcedChapterGuide(false);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusDetailUIStyleService$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusDetailUIStyleService$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusDetailUIStyleService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusDetailUIStyleService$5$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusDetailUIStyleService$5$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final TheseusDetailUIStyleService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TheseusDetailUIStyleService theseusDetailUIStyleService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = theseusDetailUIStyleService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                View view;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                a aVar = (a) this.L$0;
                if (aVar == null || (view = aVar.f103489a) == null) {
                    return Unit.INSTANCE;
                }
                TheseusDetailUIStyleService theseusDetailUIStyleService = this.this$0;
                Integer num = theseusDetailUIStyleService.f103482k.f103157c;
                String str = theseusDetailUIStyleService.f103483l.f103192b;
                theseusDetailUIStyleService.getClass();
                if (str == null || StringsKt.isBlank(str)) {
                    if (num != null) {
                        view.setBackgroundColor(num.intValue());
                    } else {
                        int color = ContextCompat.getColor(theseusDetailUIStyleService.f103484m, R$color.f64616Wh0);
                        if (Cj0.a.a(theseusDetailUIStyleService.f103484m)) {
                            view.setBackgroundColor(color);
                        } else {
                            try {
                                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{color, Color.parseColor(BLRemoteConfig.getInstance().getString("Interactive_bar_backcolor", "#F0F0F0"))}));
                            } catch (IllegalArgumentException e7) {
                                view.setBackgroundColor(color);
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(TheseusDetailUIStyleService theseusDetailUIStyleService, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = theseusDetailUIStyleService;
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
                TheseusDetailUIStyleService theseusDetailUIStyleService = this.this$0;
                Flow<a> flow = theseusDetailUIStyleService.f103481j;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(theseusDetailUIStyleService, null);
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusDetailUIStyleService$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final View f103489a;

        public a() {
            this(null);
        }

        public a(@Nullable View view) {
            this.f103489a = view;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusDetailUIStyleService$b.class */
    public static final class b implements ControlContainerObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TheseusDetailUIStyleService f103490a;

        public b(TheseusDetailUIStyleService theseusDetailUIStyleService) {
            this.f103490a = theseusDetailUIStyleService;
        }

        public final void onControlContainerChanged(ControlContainerType controlContainerType, ScreenModeType screenModeType) {
            this.f103490a.f103486o.setValue(screenModeType);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusDetailUIStyleService$c.class */
    public static final class c implements Observer<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TheseusDetailUIStyleService f103491a;

        public c(TheseusDetailUIStyleService theseusDetailUIStyleService) {
            this.f103491a = theseusDetailUIStyleService;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Boolean bool) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            this.f103491a.f103485n.setValue(bool2);
        }
    }

    @Inject
    public TheseusDetailUIStyleService(@NotNull CoroutineScope coroutineScope, @NotNull FragmentActivity fragmentActivity, @NotNull t tVar, @NotNull TheseusPageUIStyleRepository theseusPageUIStyleRepository, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull C7893a c7893a, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar, @NotNull IInteractLayerService iInteractLayerService, @NotNull IControlContainerService iControlContainerService, @NotNull Flow<a> flow, @NotNull TheseusTabPagerService.b bVar, @NotNull i iVar, @NotNull Context context) {
        this.f103473a = coroutineScope;
        this.f103474b = fragmentActivity;
        this.f103475c = tVar;
        this.f103476d = theseusPageUIStyleRepository;
        this.f103477e = iPlayerSettingService;
        this.f103478f = c7893a;
        this.f103479g = aVar;
        this.h = iInteractLayerService;
        this.f103480i = iControlContainerService;
        this.f103481j = flow;
        this.f103482k = bVar;
        this.f103483l = iVar;
        this.f103484m = context;
        if (theseusPageUIStyleRepository.f103503m) {
            MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(0L);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(MutableStateFlow, this, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, MutableStateFlow, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this, null), 3, (Object) null);
        }
    }
}
