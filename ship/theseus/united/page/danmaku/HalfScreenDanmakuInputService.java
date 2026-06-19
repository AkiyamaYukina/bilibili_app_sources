package com.bilibili.ship.theseus.united.page.danmaku;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.text.font.C4496a;
import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bapis.bilibili.community.service.dm.v1.BubbleV2;
import com.bapis.bilibili.community.service.dm.v1.ExposureType;
import com.bapis.bilibili.community.service.dm.v1.PostPanelV2;
import com.bapis.bilibili.community.service.dm.v1.ToastV2;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import com.bilibili.playerbizcommonv2.service.DanmakuInputWindowService;
import com.bilibili.ship.theseus.united.page.castscreen.TheseusCastScreenRepository;
import com.bilibili.ship.theseus.united.page.danmaku.C;
import com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.story.StoryTransitionAnimService;
import com.bilibili.ship.theseus.united.page.weblayer.TheseusV3WebRepository;
import java.util.Arrays;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Function;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import lv0.C7893a;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pr0.InterfaceC8347a;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.core.command.CommandsDanmaku;
import tv.danmaku.biliplayerv2.service.interact.core.command.CommandsPanel;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService.class */
@StabilityInferred(parameters = 0)
public final class HalfScreenDanmakuInputService {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<c> f99439A = StateFlowKt.MutableStateFlow((Object) null);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f99440B = StateFlowKt.MutableStateFlow(Boolean.FALSE);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f99441C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<C.b> f99442D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final C f99443E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public final Channel<a> f99444F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @Nullable
    public com.bilibili.app.gemini.player.widget.danmaku.h f99445G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @NotNull
    public String f99446H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @NotNull
    public final String f99447I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @NotNull
    public final g f99448J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @NotNull
    public final HalfScreenDanmakuInputService$action$1 f99449K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @NotNull
    public final Lazy f99450L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f99451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f99452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f99453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Flow<d> f99454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IReporterService f99455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f99456f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f99457g;

    @NotNull
    public final Er0.a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final DanmakuCompoundRepository f99458i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final DanmakuInputRepository f99459j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final C8043a f99460k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final C7893a f99461l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final r f99462m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f99463n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d f99464o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f99465p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final TheseusCastScreenRepository f99466q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final DanmakuInputWindowService f99467r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f99468s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final IInteractLayerService f99469t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final StoryTransitionAnimService f99470u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f99471v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f99472w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.weblayer.h f99473x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final PageReportService f99474y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public ComposeView f99475z;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final HalfScreenDanmakuInputService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$1$1.class */
        public static final class C09761 extends SuspendLambda implements Function2<d, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final HalfScreenDanmakuInputService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09761(HalfScreenDanmakuInputService halfScreenDanmakuInputService, Continuation<? super C09761> continuation) {
                super(2, continuation);
                this.this$0 = halfScreenDanmakuInputService;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
            @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.Composable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static final kotlin.Unit invokeSuspend$lambda$1(final com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService r16, androidx.compose.runtime.Composer r17, int r18) {
                /*
                    Method dump skipped, instruction units count: 260
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService.AnonymousClass1.C09761.invokeSuspend$lambda$1(com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService, androidx.compose.runtime.Composer, int):kotlin.Unit");
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0086  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x00c7  */
            @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.Composable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static final kotlin.Unit invokeSuspend$lambda$1$1(com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService.c r13, final com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService r14, com.bilibili.ship.theseus.united.page.danmaku.DanmakuInputMode r15, androidx.compose.runtime.State r16, androidx.compose.runtime.Composer r17, int r18) {
                /*
                    Method dump skipped, instruction units count: 273
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService.AnonymousClass1.C09761.invokeSuspend$lambda$1$1(com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService$c, com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService, com.bilibili.ship.theseus.united.page.danmaku.DanmakuInputMode, androidx.compose.runtime.State, androidx.compose.runtime.Composer, int):kotlin.Unit");
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public static final Unit invokeSuspend$lambda$1$1$0$0(HalfScreenDanmakuInputService halfScreenDanmakuInputService) throws NoWhenBranchMatchedException {
                HalfScreenDanmakuInputService.a(halfScreenDanmakuInputService, b.a.f99490a);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public static final Unit invokeSuspend$lambda$1$1$1$0(HalfScreenDanmakuInputService halfScreenDanmakuInputService, boolean z6) throws NoWhenBranchMatchedException {
                HalfScreenDanmakuInputService.a(halfScreenDanmakuInputService, new b.C0978b(z6));
                return Unit.INSTANCE;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C09761 c09761 = new C09761(this.this$0, continuation);
                c09761.L$0 = obj;
                return c09761;
            }

            public final Object invoke(d dVar, Continuation<? super Unit> continuation) {
                return create(dVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                d dVar = (d) this.L$0;
                if (dVar == null) {
                    return Unit.INSTANCE;
                }
                HalfScreenDanmakuInputService halfScreenDanmakuInputService = this.this$0;
                ComposeView composeView = dVar.f99499a;
                halfScreenDanmakuInputService.f99475z = composeView;
                ViewGroup.LayoutParams layoutParams = composeView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginEnd(NewPlayerUtilsKt.toPx(((Number) halfScreenDanmakuInputService.f99471v.f100020a.getValue()).intValue()));
                composeView.setLayoutParams(marginLayoutParams);
                final HalfScreenDanmakuInputService halfScreenDanmakuInputService2 = this.this$0;
                composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1106500339, true, new Function2(halfScreenDanmakuInputService2) { // from class: com.bilibili.ship.theseus.united.page.danmaku.z

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final HalfScreenDanmakuInputService f99561a;

                    {
                        this.f99561a = halfScreenDanmakuInputService2;
                    }

                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return HalfScreenDanmakuInputService.AnonymousClass1.C09761.invokeSuspend$lambda$1(this.f99561a, (Composer) obj2, iIntValue);
                    }
                }));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HalfScreenDanmakuInputService halfScreenDanmakuInputService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = halfScreenDanmakuInputService;
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
                HalfScreenDanmakuInputService halfScreenDanmakuInputService = this.this$0;
                Flow<d> flow = halfScreenDanmakuInputService.f99454d;
                C09761 c09761 = new C09761(halfScreenDanmakuInputService, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, c09761, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService$10, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$10.class */
    public static final class AnonymousClass10 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final HalfScreenDanmakuInputService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService$10$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$10$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            int label;
            final HalfScreenDanmakuInputService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HalfScreenDanmakuInputService halfScreenDanmakuInputService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = halfScreenDanmakuInputService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
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
                HalfScreenDanmakuInputService.b(this.this$0);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(HalfScreenDanmakuInputService halfScreenDanmakuInputService, Continuation<? super AnonymousClass10> continuation) {
            super(2, continuation);
            this.this$0 = halfScreenDanmakuInputService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass10(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                HalfScreenDanmakuInputService halfScreenDanmakuInputService = this.this$0;
                StateFlow<Boolean> stateFlow = halfScreenDanmakuInputService.f99458i.f99381r;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(halfScreenDanmakuInputService, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService$11, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$11.class */
    public static final class AnonymousClass11 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final HalfScreenDanmakuInputService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService$11$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$11$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final HalfScreenDanmakuInputService f99480a;

            public a(HalfScreenDanmakuInputService halfScreenDanmakuInputService) {
                this.f99480a = halfScreenDanmakuInputService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                com.bilibili.app.gemini.player.widget.danmaku.d dVar;
                com.bilibili.app.gemini.player.widget.danmaku.h hVar = this.f99480a.f99445G;
                if (hVar != null && (dVar = hVar.g) != null) {
                    dVar.dismiss();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass11(HalfScreenDanmakuInputService halfScreenDanmakuInputService, Continuation<? super AnonymousClass11> continuation) {
            super(2, continuation);
            this.this$0 = halfScreenDanmakuInputService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass11(this.this$0, continuation);
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
                HalfScreenDanmakuInputService halfScreenDanmakuInputService = this.this$0;
                SharedFlow<Unit> sharedFlow = halfScreenDanmakuInputService.f99470u.f103065z;
                a aVar = new a(halfScreenDanmakuInputService);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final HalfScreenDanmakuInputService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final HalfScreenDanmakuInputService f99481a;

            public a(HalfScreenDanmakuInputService halfScreenDanmakuInputService) {
                this.f99481a = halfScreenDanmakuInputService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                int iIntValue = ((Number) obj).intValue();
                ComposeView composeView = this.f99481a.f99475z;
                if (composeView != null) {
                    ViewGroup.LayoutParams layoutParams = composeView.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMarginEnd(NewPlayerUtilsKt.toPx(iIntValue));
                    composeView.setLayoutParams(marginLayoutParams);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HalfScreenDanmakuInputService halfScreenDanmakuInputService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = halfScreenDanmakuInputService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
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
                HalfScreenDanmakuInputService halfScreenDanmakuInputService = this.this$0;
                StateFlow<Integer> stateFlow = halfScreenDanmakuInputService.f99471v.f100020a;
                a aVar = new a(halfScreenDanmakuInputService);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final HalfScreenDanmakuInputService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService$3$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$3$a.class */
        public static final /* synthetic */ class a implements FlowCollector, FunctionAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final HalfScreenDanmakuInputService f99482a;

            public a(HalfScreenDanmakuInputService halfScreenDanmakuInputService) {
                this.f99482a = halfScreenDanmakuInputService;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
                Object objInvokeSuspend$launchRecommendEffect = AnonymousClass3.invokeSuspend$launchRecommendEffect(this.f99482a, (C.a) obj, continuation);
                if (objInvokeSuspend$launchRecommendEffect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objInvokeSuspend$launchRecommendEffect = Unit.INSTANCE;
                }
                return objInvokeSuspend$launchRecommendEffect;
            }

            public final boolean equals(Object obj) {
                boolean zAreEqual = false;
                if (obj instanceof FlowCollector) {
                    zAreEqual = false;
                    if (obj instanceof FunctionAdapter) {
                        zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                }
                return zAreEqual;
            }

            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.f99482a, HalfScreenDanmakuInputService.class, "launchRecommendEffect", "launchRecommendEffect(Lcom/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuRecommendSwitcherComponent$SideEffect;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HalfScreenDanmakuInputService halfScreenDanmakuInputService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = halfScreenDanmakuInputService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public static final Object invokeSuspend$launchRecommendEffect(HalfScreenDanmakuInputService halfScreenDanmakuInputService, C.a aVar, Continuation continuation) throws NoWhenBranchMatchedException {
            halfScreenDanmakuInputService.getClass();
            if (!(aVar instanceof C.a.C0970a)) {
                throw new NoWhenBranchMatchedException();
            }
            halfScreenDanmakuInputService.f99446H = ((C.a.C0970a) aVar).f99316a;
            return Unit.INSTANCE;
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
                HalfScreenDanmakuInputService halfScreenDanmakuInputService = this.this$0;
                SharedFlow sharedFlow = halfScreenDanmakuInputService.f99443E.f99315c;
                a aVar = new a(halfScreenDanmakuInputService);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final HalfScreenDanmakuInputService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<ToastV2, Continuation<? super Unit>, Object> {
            int label;
            final HalfScreenDanmakuInputService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HalfScreenDanmakuInputService halfScreenDanmakuInputService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = halfScreenDanmakuInputService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(ToastV2 toastV2, Continuation<? super Unit> continuation) {
                return create(toastV2, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                HalfScreenDanmakuInputService.a(this.this$0, new b.C0978b(false));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(HalfScreenDanmakuInputService halfScreenDanmakuInputService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = halfScreenDanmakuInputService;
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
                SharedFlow sharedFlowAsSharedFlow = FlowKt.asSharedFlow(this.this$0.f99458i.f99377n);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlowAsSharedFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final HalfScreenDanmakuInputService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService$5$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$5$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7893a.C1318a, Continuation<? super Unit>, Object> {
            int label;
            final HalfScreenDanmakuInputService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HalfScreenDanmakuInputService halfScreenDanmakuInputService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = halfScreenDanmakuInputService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(C7893a.C1318a c1318a, Continuation<? super Unit> continuation) {
                return create(c1318a, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.f99442D.setValue(C.b.c.f99319a);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(HalfScreenDanmakuInputService halfScreenDanmakuInputService, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = halfScreenDanmakuInputService;
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
                HalfScreenDanmakuInputService halfScreenDanmakuInputService = this.this$0;
                StateFlow<C7893a.C1318a> stateFlow = halfScreenDanmakuInputService.f99461l.f123393f;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(halfScreenDanmakuInputService, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService$6, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$6.class */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final HalfScreenDanmakuInputService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(HalfScreenDanmakuInputService halfScreenDanmakuInputService, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.this$0 = halfScreenDanmakuInputService;
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
                HalfScreenDanmakuInputService halfScreenDanmakuInputService = this.this$0;
                this.label = 1;
                Object objCollectLatest = FlowKt.collectLatest(FlowKt.receiveAsFlow(halfScreenDanmakuInputService.f99444F), new HalfScreenDanmakuInputService$collectPopFlow$2(halfScreenDanmakuInputService, null), this);
                if (objCollectLatest != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollectLatest = Unit.INSTANCE;
                }
                if (objCollectLatest == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService$7, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$7.class */
    public static final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final HalfScreenDanmakuInputService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(HalfScreenDanmakuInputService halfScreenDanmakuInputService, Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
            this.this$0 = halfScreenDanmakuInputService;
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
                HalfScreenDanmakuInputService halfScreenDanmakuInputService = this.this$0;
                this.label = 1;
                Object objCollectLatest = FlowKt.collectLatest(FlowKt.combine(halfScreenDanmakuInputService.f99458i.f99376m, halfScreenDanmakuInputService.f99454d, HalfScreenDanmakuInputService$collectPanelRefresh$4.INSTANCE), new HalfScreenDanmakuInputService$collectPanelRefresh$5(halfScreenDanmakuInputService, null), this);
                if (objCollectLatest != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollectLatest = Unit.INSTANCE;
                }
                if (objCollectLatest == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService$8, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$8.class */
    public static final class AnonymousClass8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final HalfScreenDanmakuInputService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService$8$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$8$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final HalfScreenDanmakuInputService f99483a;

            public a(HalfScreenDanmakuInputService halfScreenDanmakuInputService) {
                this.f99483a = halfScreenDanmakuInputService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                com.bilibili.app.gemini.player.widget.danmaku.d dVar;
                HalfScreenDanmakuInputService halfScreenDanmakuInputService = this.f99483a;
                com.bilibili.app.gemini.player.widget.danmaku.h hVar = halfScreenDanmakuInputService.f99445G;
                if (hVar != null && (dVar = hVar.g) != null) {
                    dVar.dismiss();
                }
                PostPanelV2 postPanelV2A = halfScreenDanmakuInputService.f99458i.a();
                halfScreenDanmakuInputService.f(postPanelV2A != null ? postPanelV2A.getClickButton() : null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(HalfScreenDanmakuInputService halfScreenDanmakuInputService, Continuation<? super AnonymousClass8> continuation) {
            super(2, continuation);
            this.this$0 = halfScreenDanmakuInputService;
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
                StateFlow stateFlowC = this.this$0.f99463n.c();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (stateFlowC.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService$9, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$9.class */
    public static final class AnonymousClass9 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final HalfScreenDanmakuInputService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(HalfScreenDanmakuInputService halfScreenDanmakuInputService, Continuation<? super AnonymousClass9> continuation) {
            super(2, continuation);
            this.this$0 = halfScreenDanmakuInputService;
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
                HalfScreenDanmakuInputService halfScreenDanmakuInputService = this.this$0;
                this.label = 1;
                Object objCollectLatest = FlowKt.collectLatest(halfScreenDanmakuInputService.f99468s.f99659i, new HalfScreenDanmakuInputService$floatLayerFlow$2(halfScreenDanmakuInputService, null), this);
                if (objCollectLatest != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollectLatest = Unit.INSTANCE;
                }
                if (objCollectLatest == coroutine_suspended) {
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$DanmakuInputControl.class */
    public static final class DanmakuInputControl {
        private static final EnumEntries $ENTRIES;
        private static final DanmakuInputControl[] $VALUES;
        private final int number;
        public static final DanmakuInputControl DEFAULT = new DanmakuInputControl("DEFAULT", 0, 0);
        public static final DanmakuInputControl WITH_KEYBOARD = new DanmakuInputControl("WITH_KEYBOARD", 1, 1);
        public static final DanmakuInputControl WITH_INTERACTION = new DanmakuInputControl("WITH_INTERACTION", 2, 2);

        private static final /* synthetic */ DanmakuInputControl[] $values() {
            return new DanmakuInputControl[]{DEFAULT, WITH_KEYBOARD, WITH_INTERACTION};
        }

        static {
            DanmakuInputControl[] danmakuInputControlArr$values = $values();
            $VALUES = danmakuInputControlArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(danmakuInputControlArr$values);
        }

        private DanmakuInputControl(String str, int i7, int i8) {
            this.number = i8;
        }

        @NotNull
        public static EnumEntries<DanmakuInputControl> getEntries() {
            return $ENTRIES;
        }

        public static DanmakuInputControl valueOf(String str) {
            return (DanmakuInputControl) Enum.valueOf(DanmakuInputControl.class, str);
        }

        public static DanmakuInputControl[] values() {
            return (DanmakuInputControl[]) $VALUES.clone();
        }

        public final int getNumber() {
            return this.number;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$a.class */
    public interface a {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$a$a.class */
        @StabilityInferred(parameters = 0)
        public static final class C0977a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final BubbleV2 f99484a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final ComposeView f99485b;

            public C0977a(@NotNull BubbleV2 bubbleV2, @NotNull ComposeView composeView) {
                this.f99484a = bubbleV2;
                this.f99485b = composeView;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0977a)) {
                    return false;
                }
                C0977a c0977a = (C0977a) obj;
                return Intrinsics.areEqual(this.f99484a, c0977a.f99484a) && Intrinsics.areEqual(this.f99485b, c0977a.f99485b);
            }

            public final int hashCode() {
                return this.f99485b.hashCode() + (this.f99484a.hashCode() * 31);
            }

            @NotNull
            public final String toString() {
                return "BubbleShow(bubble=" + this.f99484a + ", container=" + this.f99485b + ")";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$a$b.class */
        @StabilityInferred(parameters = 1)
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final String f99486a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final String f99487b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            public final DanmakuInputControl f99488c;

            public b(@NotNull String str, @NotNull String str2, @NotNull DanmakuInputControl danmakuInputControl) {
                this.f99486a = str;
                this.f99487b = str2;
                this.f99488c = danmakuInputControl;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.areEqual(this.f99486a, bVar.f99486a) && Intrinsics.areEqual(this.f99487b, bVar.f99487b) && this.f99488c == bVar.f99488c;
            }

            public final int hashCode() {
                return this.f99488c.hashCode() + I.E.a(this.f99486a.hashCode() * 31, 31, this.f99487b);
            }

            @NotNull
            public final String toString() {
                return "InputShow(recommend=" + this.f99486a + ", hint=" + this.f99487b + ", control=" + this.f99488c + ")";
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$b.class */
    public interface b {

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$b$a.class */
        @StabilityInferred(parameters = 1)
        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f99490a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1814007873;
            }

            @NotNull
            public final String toString() {
                return "SwitchDanmaku";
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService$b$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$b$b.class */
        @StabilityInferred(parameters = 1)
        public static final class C0978b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f99491a;

            public C0978b(boolean z6) {
                this.f99491a = z6;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0978b) && this.f99491a == ((C0978b) obj).f99491a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f99491a);
            }

            @NotNull
            public final String toString() {
                return androidx.appcompat.app.i.a(new StringBuilder("WakeUpDanmakuInput(isFromSwitcher="), this.f99491a, ")");
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$c.class */
    @StabilityInferred(parameters = 1)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f99493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f99494c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f99495d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f99496e;

        public c(@NotNull String str, boolean z6, boolean z7, boolean z8, boolean z9) {
            this.f99492a = z6;
            this.f99493b = z7;
            this.f99494c = str;
            this.f99495d = z8;
            this.f99496e = z9;
        }

        public static c a(c cVar, String str, boolean z6, boolean z7, int i7) {
            if ((i7 & 4) != 0) {
                str = cVar.f99494c;
            }
            if ((i7 & 8) != 0) {
                z6 = cVar.f99495d;
            }
            return new c(str, cVar.f99492a, cVar.f99493b, z6, z7);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f99492a == cVar.f99492a && this.f99493b == cVar.f99493b && Intrinsics.areEqual(this.f99494c, cVar.f99494c) && this.f99495d == cVar.f99495d && this.f99496e == cVar.f99496e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f99496e) + androidx.compose.animation.z.a(I.E.a(androidx.compose.animation.z.a(Boolean.hashCode(this.f99492a) * 31, 31, this.f99493b), 31, this.f99494c), 31, this.f99495d);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("State(enableSwitch=");
            sb.append(this.f99492a);
            sb.append(", enableInput=");
            sb.append(this.f99493b);
            sb.append(", inputHint=");
            sb.append(this.f99494c);
            sb.append(", isExpand=");
            sb.append(this.f99495d);
            sb.append(", withAnim=");
            return androidx.appcompat.app.i.a(sb, this.f99496e, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$d.class */
    @StabilityInferred(parameters = 0)
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ComposeView f99499a;

        static {
            int i7 = ComposeView.$stable;
        }

        public d(@NotNull ComposeView composeView) {
            this.f99499a = composeView;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$e.class */
    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f99500a;

        static {
            int[] iArr = new int[ExposureType.values().length];
            try {
                iArr[ExposureType.ExposureTypeDMSend.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            f99500a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$f.class */
    public static final class f implements com.bilibili.playerbizcommonv2.danmaku.input.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HalfScreenDanmakuInputService f99501a;

        public f(HalfScreenDanmakuInputService halfScreenDanmakuInputService) {
            this.f99501a = halfScreenDanmakuInputService;
        }

        @Override // com.bilibili.playerbizcommonv2.danmaku.input.c
        public final void a(com.bilibili.playerbizcommonv2.danmaku.input.panel.a aVar) {
            HalfScreenDanmakuInputService halfScreenDanmakuInputService = this.f99501a;
            c cVarD = halfScreenDanmakuInputService.d();
            if (cVarD != null) {
                halfScreenDanmakuInputService.g(c.a(cVarD, aVar instanceof com.bilibili.playerbizcommonv2.danmaku.input.panel.g ? B.f99312b : B.f99311a, false, false, 11));
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$g.class */
    public static final class g implements qr0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HalfScreenDanmakuInputService f99502a;

        public g(HalfScreenDanmakuInputService halfScreenDanmakuInputService) {
            this.f99502a = halfScreenDanmakuInputService;
        }

        @Override // qr0.b
        public final CommandsPanel E() {
            return this.f99502a.f99469t.getDanmakuCommandPanel();
        }

        @Override // qr0.b
        public final void P(com.bilibili.playerbizcommonv2.service.a aVar) {
            this.f99502a.f99467r.f81797g = aVar;
        }

        @Override // qr0.b
        public final qr0.e a() {
            return this.f99502a.f99467r.a();
        }

        @Override // qr0.b
        public final boolean c() {
            return this.f99502a.f99458i.f99385v;
        }

        @Override // qr0.b
        public final PostPanelV2 d() {
            return this.f99502a.f99458i.a();
        }

        @Override // qr0.b
        public final long f() {
            return this.f99502a.f99467r.f();
        }

        @Override // qr0.b
        public final boolean getColorfulEnable() {
            return this.f99502a.f99467r.f81798i;
        }

        @Override // qr0.b
        public final com.bilibili.playerbizcommonv2.service.a getDanmakuColorful() {
            return this.f99502a.f99467r.getDanmakuColorful();
        }

        @Override // qr0.b
        public final boolean j() {
            return false;
        }

        @Override // qr0.b
        public final long p() {
            return this.f99502a.f99467r.p();
        }
    }

    /* JADX WARN: Type inference failed for: r1v37, types: [com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService$action$1] */
    @Inject
    public HalfScreenDanmakuInputService(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull Flow<d> flow, @NotNull IReporterService iReporterService, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull IControlContainerService iControlContainerService, @NotNull Er0.a aVar, @NotNull DanmakuCompoundRepository danmakuCompoundRepository, @NotNull DanmakuInputRepository danmakuInputRepository, @NotNull C8043a c8043a, @NotNull C7893a c7893a, @NotNull r rVar, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar, @NotNull BiliAccounts biliAccounts, @NotNull TheseusCastScreenRepository theseusCastScreenRepository, @NotNull DanmakuInputWindowService danmakuInputWindowService, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull IInteractLayerService iInteractLayerService, @NotNull StoryTransitionAnimService storyTransitionAnimService, @NotNull IntroContentSizeRepository introContentSizeRepository, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar2, @NotNull com.bilibili.ship.theseus.united.page.weblayer.h hVar2, @NotNull PageReportService pageReportService) {
        this.f99451a = coroutineScope;
        this.f99452b = context;
        this.f99453c = hVar;
        this.f99454d = flow;
        this.f99455e = iReporterService;
        this.f99456f = iPlayerSettingService;
        this.f99457g = iControlContainerService;
        this.h = aVar;
        this.f99458i = danmakuCompoundRepository;
        this.f99459j = danmakuInputRepository;
        this.f99460k = c8043a;
        this.f99461l = c7893a;
        this.f99462m = rVar;
        this.f99463n = cVar;
        this.f99464o = dVar;
        this.f99465p = biliAccounts;
        this.f99466q = theseusCastScreenRepository;
        this.f99467r = danmakuInputWindowService;
        this.f99468s = theseusFloatLayerService;
        this.f99469t = iInteractLayerService;
        this.f99470u = storyTransitionAnimService;
        this.f99471v = introContentSizeRepository;
        this.f99472w = aVar2;
        this.f99473x = hVar2;
        this.f99474y = pageReportService;
        MutableStateFlow<C.b> MutableStateFlow = StateFlowKt.MutableStateFlow((Object) null);
        this.f99442D = MutableStateFlow;
        this.f99443E = new C(FlowKt.asStateFlow(MutableStateFlow));
        this.f99444F = ChannelKt.Channel$default(0, (BufferOverflow) null, (Function1) null, 7, (Object) null);
        this.f99446H = "";
        this.f99447I = context.getString(2131845669);
        this.f99448J = new g(this);
        this.f99449K = new InterfaceC8347a(this) { // from class: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService$action$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final HalfScreenDanmakuInputService f99489a;

            {
                this.f99489a = this;
            }

            @Override // pr0.InterfaceC8347a
            public final void C(com.bilibili.playerbizcommonv2.service.b bVar) {
                this.f99489a.f99467r.C(bVar);
            }

            @Override // pr0.InterfaceC8347a
            public final void D(String str, String... strArr) {
                this.f99489a.f99455e.report(new NeuronsEvents.NormalEvent(str, (String[]) Arrays.copyOf(strArr, strArr.length)));
            }

            @Override // pr0.InterfaceC8347a
            public final void G(String str, Map<String, String> map) {
                PageReportService.g(this.f99489a.f99474y, "player.player.interact-dm.coin-guess.click", map, 4);
            }

            @Override // pr0.InterfaceC8347a
            public final void O(CommandsDanmaku commandsDanmaku, com.bilibili.playerbizcommonv2.danmaku.input.panel.d dVar2) {
                this.f99489a.f99467r.O(commandsDanmaku, dVar2);
            }

            @Override // pr0.InterfaceC8347a
            public final void b(CommandsDanmaku commandsDanmaku) {
                HalfScreenDanmakuInputService halfScreenDanmakuInputService = this.f99489a;
                BuildersKt.launch$default(halfScreenDanmakuInputService.f99451a, (CoroutineContext) null, (CoroutineStart) null, new HalfScreenDanmakuInputService$action$1$onCommandDmClick$1(halfScreenDanmakuInputService, commandsDanmaku, null), 3, (Object) null);
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0049  */
            @Override // pr0.InterfaceC8347a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final boolean e(tv.danmaku.biliplayerv2.service.interact.core.sender.DanmakuSendParams r7) {
                /*
                    Method dump skipped, instruction units count: 268
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService$action$1.e(tv.danmaku.biliplayerv2.service.interact.core.sender.DanmakuSendParams):boolean");
            }

            @Override // pr0.InterfaceC8347a
            public final void g(String str, String str2) {
                this.f99489a.f99467r.f81801l = str2;
            }

            @Override // pr0.InterfaceC8347a
            public final boolean getBoolean(String str, boolean z6) {
                return this.f99489a.f99456f.getBoolean(str, z6);
            }

            @Override // pr0.InterfaceC8347a
            public final void l(String str, String str2) {
                this.f99489a.f99467r.l(str, str2);
            }

            @Override // pr0.InterfaceC8347a
            public final void n(String str, String str2) {
                this.f99489a.f99467r.f81802m = str2;
            }

            @Override // pr0.InterfaceC8347a
            public final void onInputWindowDismiss(String str) {
                HalfScreenDanmakuInputService halfScreenDanmakuInputService = this.f99489a;
                if (halfScreenDanmakuInputService.d() != null) {
                    HalfScreenDanmakuInputService.b(halfScreenDanmakuInputService);
                }
                halfScreenDanmakuInputService.f99453c.i(this);
                halfScreenDanmakuInputService.f99440B.tryEmit(Boolean.FALSE);
            }

            @Override // pr0.InterfaceC8347a
            public final void onInputWindowShow() {
                HalfScreenDanmakuInputService.c cVarD;
                HalfScreenDanmakuInputService halfScreenDanmakuInputService = this.f99489a;
                com.bilibili.playerbizcommonv2.danmaku.input.panel.a aVarM = halfScreenDanmakuInputService.c().m();
                if (aVarM != null && (cVarD = halfScreenDanmakuInputService.d()) != null) {
                    halfScreenDanmakuInputService.g(HalfScreenDanmakuInputService.c.a(cVarD, aVarM instanceof com.bilibili.playerbizcommonv2.danmaku.input.panel.g ? B.f99312b : B.f99311a, false, false, 11));
                }
                halfScreenDanmakuInputService.f99453c.h(this);
                halfScreenDanmakuInputService.f99440B.tryEmit(Boolean.TRUE);
            }

            @Override // pr0.InterfaceC8347a
            public final void putBoolean(String str, boolean z6) {
                this.f99489a.f99456f.putBoolean(str, z6);
            }

            @Override // pr0.InterfaceC8347a
            public final boolean r(int i7, Map<String, ? extends Object> map) {
                HalfScreenDanmakuInputService halfScreenDanmakuInputService = this.f99489a;
                if (i7 != 23) {
                    DanmakuCompoundRepository danmakuCompoundRepository2 = halfScreenDanmakuInputService.f99458i;
                    return danmakuCompoundRepository2.f99367c.sendCommandDanmaku(danmakuCompoundRepository2.f99365a, i7, map);
                }
                Object obj = map.get("url");
                String str = obj instanceof String ? (String) obj : null;
                if (str == null || StringsKt.isBlank(str)) {
                    com.bilibili.bangumi.logic.page.detail.service.e.a("[theseus-united-HalfScreenDanmakuInputService$action$1-onSendCommandDanmaku] ", "onCoinGuessEntryClick skipped reason=blank_url contentKeys=" + map.keySet(), "HalfScreenDanmakuInputService$action$1-onSendCommandDanmaku", (Throwable) null);
                    return false;
                }
                String str2 = B.f99311a;
                defpackage.a.b("[theseus-united-HalfScreenDanmakuInputService$action$1-onSendCommandDanmaku] ", androidx.core.app.o.a(i7, "onCoinGuessEntryClick dispatch type=", " ", G.f.a(str.hashCode(), str.length(), "urlHash=", " urlLength=")), "HalfScreenDanmakuInputService$action$1-onSendCommandDanmaku");
                com.bilibili.ship.theseus.united.page.weblayer.h hVar3 = halfScreenDanmakuInputService.f99473x;
                String strA = hVar3.a(str);
                TheseusV3WebRepository theseusV3WebRepository = hVar3.f104257a;
                theseusV3WebRepository.getClass();
                theseusV3WebRepository.a(strA, TheseusV3WebRepository.DisplayMode.AUTO_HEIGHT, null, true);
                return true;
            }

            @Override // pr0.InterfaceC8347a
            public final void s(boolean z6) {
                HalfScreenDanmakuInputService halfScreenDanmakuInputService = this.f99489a;
                halfScreenDanmakuInputService.f99455e.report(new NeuronsEvents.NormalEvent("player.danmaku-set.dm-order-list.click.player", new String[]{Constant.IN_KEY_LOCATION, "2"}));
                if (z6) {
                    return;
                }
                halfScreenDanmakuInputService.c().i();
            }

            @Override // pr0.InterfaceC8347a
            public final void u(com.bilibili.playerbizcommonv2.service.c cVar2) {
                this.f99489a.f99467r.u(cVar2);
            }

            @Override // pr0.InterfaceC8347a
            public final void v(long j7) {
                this.f99489a.f99467r.v(j7);
            }

            @Override // pr0.InterfaceC8347a
            public final void z(com.bilibili.playerbizcommonv2.service.b bVar) {
                this.f99489a.f99467r.z(bVar);
            }
        };
        this.f99450L = LazyKt.lazy(new Ax.s(this, 2));
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new HalfScreenDanmakuInputService$collectUpdateInputViewState$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new HalfScreenDanmakuInputService$collectDanmakuVisible$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass6(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass7(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass8(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass9(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass10(this, null), 3, (Object) null);
        MutableStateFlow.setValue(C.b.C0971b.f99318a);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new HalfScreenDanmakuInputService$initCommandDelegate$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass11(this, null), 3, (Object) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService r11, com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService.b r12) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 982
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService.a(com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService, com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService$b):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService r9) {
        /*
            Method dump skipped, instruction units count: 774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService.b(com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService):void");
    }

    public static /* synthetic */ void i(HalfScreenDanmakuInputService halfScreenDanmakuInputService, String str, int i7) {
        if ((i7 & 1) != 0) {
            str = "";
        }
        halfScreenDanmakuInputService.h(str, "", DanmakuInputControl.DEFAULT);
    }

    public final com.bilibili.playerbizcommonv2.danmaku.input.g c() {
        return (com.bilibili.playerbizcommonv2.danmaku.input.g) this.f99450L.getValue();
    }

    public final c d() {
        return (c) this.f99439A.getValue();
    }

    public final void e(String str, String str2) {
        this.f99455e.report(new NeuronsEvents.NormalEvent("player.player.dm-send.textarea-danmaku.player", new String[]{ThirdPartyExtraBuilder.KEY_RESULT, str2, "new_ui", "1", "recommender", str, "is_cheer_time", this.f99458i.a() != null ? "1" : "0"}));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(com.bapis.bilibili.community.service.dm.v1.ClickButtonV2 r12) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService.f(com.bapis.bilibili.community.service.dm.v1.ClickButtonV2):void");
    }

    public final void g(c cVar) {
        this.f99439A.setValue(cVar);
    }

    public final void h(@NotNull String str, @NotNull String str2, @NotNull DanmakuInputControl danmakuInputControl) {
        BLog.i("HalfScreenDanmakuInputService-trySendDanmakuInputShow", "[theseus-united-HalfScreenDanmakuInputService-trySendDanmakuInputShow] " + C4496a.a("trySendDanmakuInputShow, ", str));
        this.f99444F.trySend-JP2dKIU(new a.b(str, str2, danmakuInputControl));
    }
}
