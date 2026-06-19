package com.bilibili.tgwt.ui;

import DD0.AbstractC1542o;
import HD0.N;
import Hl.b;
import Kj0.a;
import Kj0.b;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.ArraySet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.bilibili.bangumi.logic.page.detail.report.PageReportService;
import com.bilibili.bangumi.logic.page.detail.service.BangumiFullscreenWebContainerService;
import com.bilibili.bangumi.logic.page.detail.service.BangumiFullscreenWebContainerService_Factory;
import com.bilibili.bangumi.logic.page.detail.service.BangumiPlayerBizService;
import com.bilibili.bangumi.logic.page.detail.service.BangumiPlayerBizService_Factory;
import com.bilibili.bangumi.logic.page.detail.service.BangumiPlayerContainerService;
import com.bilibili.bangumi.logic.page.detail.service.BangumiPlayerContainerService_Factory;
import com.bilibili.bangumi.logic.page.detail.service.BangumiPreloadPlayHandlerService;
import com.bilibili.bangumi.logic.page.detail.service.BangumiPreloadPlayHandlerService_Factory;
import com.bilibili.bangumi.logic.page.detail.service.ChronosBizService;
import com.bilibili.bangumi.logic.page.detail.service.ChronosBizService_Factory;
import com.bilibili.bangumi.logic.page.detail.service.CommunityService;
import com.bilibili.bangumi.logic.page.detail.service.CommunityService_Factory;
import com.bilibili.bangumi.logic.page.detail.service.DetailRightPanelService;
import com.bilibili.bangumi.logic.page.detail.service.DetailRightPanelService_Factory;
import com.bilibili.bangumi.logic.page.detail.service.OGVDolbyService;
import com.bilibili.bangumi.logic.page.detail.service.OGVDolbyService_Factory;
import com.bilibili.bangumi.logic.page.detail.service.OGVToastProcessService;
import com.bilibili.bangumi.logic.page.detail.service.OGVToastProcessService_Factory;
import com.bilibili.bangumi.logic.page.detail.service.PageViewService;
import com.bilibili.bangumi.logic.page.detail.service.PageViewService_Factory;
import com.bilibili.bangumi.logic.page.detail.service.ParentViewService;
import com.bilibili.bangumi.logic.page.detail.service.ParentViewService_Factory;
import com.bilibili.bangumi.logic.page.detail.service.PlayControlService;
import com.bilibili.bangumi.logic.page.detail.service.PlayControlService_Factory;
import com.bilibili.bangumi.logic.page.detail.service.PlayHistoryService;
import com.bilibili.bangumi.logic.page.detail.service.PlayHistoryService_Factory;
import com.bilibili.bangumi.logic.page.detail.service.PlaySeekBarTimeService;
import com.bilibili.bangumi.logic.page.detail.service.PlaySeekBarTimeService_Factory;
import com.bilibili.bangumi.logic.page.detail.service.PlayStrategyControlService;
import com.bilibili.bangumi.logic.page.detail.service.PlayStrategyControlService_Factory;
import com.bilibili.bangumi.logic.page.detail.service.PlayStrategyCreator;
import com.bilibili.bangumi.logic.page.detail.service.PlayerHelper;
import com.bilibili.bangumi.logic.page.detail.service.PlayerHelper_Factory;
import com.bilibili.bangumi.logic.page.detail.service.ScreenModeService;
import com.bilibili.bangumi.logic.page.detail.service.ScreenModeService_Factory;
import com.bilibili.bangumi.logic.page.detail.service.ScreenStateService;
import com.bilibili.bangumi.logic.page.detail.service.ScreenStateService_Factory;
import com.bilibili.bangumi.logic.page.detail.service.SeekBizService;
import com.bilibili.bangumi.logic.page.detail.service.SeekBizService_Factory;
import com.bilibili.bangumi.logic.page.detail.service.SwitchDubbingService;
import com.bilibili.bangumi.logic.page.detail.service.SwitchDubbingService_Factory;
import com.bilibili.bangumi.logic.page.detail.service.ToolbarService;
import com.bilibili.bangumi.logic.page.detail.service.ToolbarService_Factory;
import com.bilibili.bangumi.logic.page.detail.service.refactor.ActivityContextParamsService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.ActivityContextParamsService_Factory;
import com.bilibili.bangumi.logic.page.detail.service.refactor.BangumiDanmakuService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.BangumiDanmakuService_Factory;
import com.bilibili.bangumi.logic.page.detail.service.refactor.BangumiPopFragmentService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.BangumiPopFragmentService_Factory;
import com.bilibili.bangumi.logic.page.detail.service.refactor.InitialPlayViewCallService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.InitialPlayViewCallService_Factory;
import com.bilibili.bangumi.logic.page.detail.service.refactor.LegacyPagePopService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.LegacyPagePopService_Factory;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewSeasonService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewSeasonService_Factory;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewSectionService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewSectionService_Factory;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewShareService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewShareService_Factory;
import com.bilibili.bangumi.logic.page.detail.service.refactor.OGVNonAutoPlayService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.OGVNonAutoPlayService_Factory;
import com.bilibili.bangumi.logic.page.detail.service.refactor.OGVPlayerLoadingCoverService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.OGVPlayerLoadingCoverService_Factory;
import com.bilibili.bangumi.logic.page.detail.service.refactor.OGVVipService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.OGVVipService_Factory;
import com.bilibili.bangumi.logic.page.detail.service.refactor.PlayLimitedLayerService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.PlayLimitedLayerService_Factory;
import com.bilibili.bangumi.logic.page.detail.service.refactor.pay.NewPayService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.pay.NewPayService_Factory;
import com.bilibili.bangumi.ui.page.detail.playerV2.screenstate.BangumiScreenStateLayoutHelper;
import com.bilibili.bangumi.ui.page.detail.playerV2.screenstate.a;
import com.bilibili.bangumi.ui.page.detail.playerV2.screenstate.i;
import com.bilibili.bangumi.ui.page.detail.playerV2.screenstate.j;
import com.bilibili.bangumi.ui.page.detail.playerV2.widget.quality.o;
import com.bilibili.bangumi.ui.page.detail.processor.dragmode.DetailVideoContainerDragModeProcessor;
import com.bilibili.bangumi.ui.page.detail.processor.dragmode.DetailVideoDragModeStateProcessor;
import com.bilibili.bangumi.ui.widget.BangumiVideoDetailLayout;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseToolbarActivity;
import com.bilibili.lib.ui.helper.NotchCompat;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.module.main.innerpush.IPushContainer;
import com.bilibili.module.main.innerpush.PushBizParams;
import com.bilibili.playerbizcommon.miniplayer.IMiniPlayerContainer;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import com.bilibili.tgwt.detail.chat.ChatFragment;
import com.bilibili.tgwt.detail.chat.ChatVoiceFragment;
import com.bilibili.tgwt.im.ui.PlayerChatFragment;
import com.bilibili.tgwt.player.g;
import com.bilibili.tgwt.player.i;
import com.bilibili.tgwt.player.k;
import com.bilibili.tgwt.player.processor.TogetherWatchChatImageProcessor;
import com.bilibili.tgwt.player.processor.TogetherWatchEndPageProcessor;
import com.bilibili.tgwt.player.processor.TogetherWatchPlayProcessor;
import com.bilibili.tgwt.player.processor.l;
import com.bilibili.tgwt.player.processor.m;
import com.bilibili.tgwt.player.processor.r;
import com.bilibili.tgwt.service.ChatService;
import com.bilibili.tgwt.service.ChatVoiceRtcService;
import com.bilibili.tgwt.service.TogetherWatchToolbarService;
import com.bilibili.tgwt.service.n;
import com.bilibili.tgwt.service.p;
import com.bilibili.tgwt.service.v;
import dagger.internal.Preconditions;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kntr.base.utils.foundation.InputMethodManagerHelper;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import zh0.C9196c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/ui/TogetherWatchDetailPageActivity.class */
@StabilityInferred(parameters = 0)
public final class TogetherWatchDetailPageActivity extends BaseToolbarActivity implements IPvTracker, IPushContainer, dm.b, IMiniPlayerContainer {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final int f112213H = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public TogetherWatchDetailPageViewModel f112214D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final LD0.a f112215E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public BangumiScreenStateLayoutHelper f112216F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public r f112217G;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/ui/TogetherWatchDetailPageActivity$a.class */
    public static final class a implements PlayStrategyCreator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TogetherWatchDetailPageActivity f112218a;

        public a(TogetherWatchDetailPageActivity togetherWatchDetailPageActivity) {
            this.f112218a = togetherWatchDetailPageActivity;
        }

        public final qm.a createPlayStrategy(ActivityContextParamsService activityContextParamsService, NewSeasonService newSeasonService, NewSectionService newSectionService, PlayControlService playControlService, BangumiPlayerContainerService bangumiPlayerContainerService) {
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.f112218a.f112214D;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            return new KD0.a(bangumiPlayerContainerService, togetherWatchDetailPageViewModel2.getChatRoomManagerService(), playControlService);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/ui/TogetherWatchDetailPageActivity$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TogetherWatchDetailPageActivity f112219a;

        public b(TogetherWatchDetailPageActivity togetherWatchDetailPageActivity) {
            this.f112219a = togetherWatchDetailPageActivity;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/ui/TogetherWatchDetailPageActivity$c.class */
    public static final class c implements ViewTreeObserver.OnWindowAttachListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TogetherWatchDetailPageActivity f112220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractC1542o f112221b;

        public c(TogetherWatchDetailPageActivity togetherWatchDetailPageActivity, AbstractC1542o abstractC1542o) {
            this.f112220a = togetherWatchDetailPageActivity;
            this.f112221b = abstractC1542o;
        }

        @Override // android.view.ViewTreeObserver.OnWindowAttachListener
        public final void onWindowAttached() {
            Window window;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.f112220a.f112214D;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            j cutoutHelper = togetherWatchDetailPageViewModel2.getScreenModeService().getCutoutHelper();
            cutoutHelper.getClass();
            KProperty[] kPropertyArr = j.i;
            KProperty kProperty = kPropertyArr[1];
            cutoutHelper.b.a(Boolean.TRUE);
            TogetherWatchDetailPageActivity togetherWatchDetailPageActivity = cutoutHelper.g;
            if (togetherWatchDetailPageActivity != null && (window = togetherWatchDetailPageActivity.getWindow()) != null) {
                boolean zHasDisplayCutoutHardware = NotchCompat.hasDisplayCutoutHardware(window);
                KProperty kProperty2 = kPropertyArr[2];
                cutoutHelper.c.a(Boolean.valueOf(zHasDisplayCutoutHardware));
            }
            BangumiScreenStateLayoutHelper bangumiScreenStateLayoutHelper = this.f112220a.f112216F;
            if (bangumiScreenStateLayoutHelper == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutHelper");
                bangumiScreenStateLayoutHelper = null;
            }
            bangumiScreenStateLayoutHelper.getClass();
            BLog.i("BangumiScreenStateLayoutHelper-reinforce", "[bangumi-BangumiScreenStateLayoutHelper-reinforce] reinforce");
            a.b bVar = bangumiScreenStateLayoutHelper.d;
            if (bVar != null) {
                bangumiScreenStateLayoutHelper.d(bVar);
            }
            this.f112221b.f2579A.getViewTreeObserver().removeOnWindowAttachListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnWindowAttachListener
        public final void onWindowDetached() {
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.f112220a.f112214D;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            j cutoutHelper = togetherWatchDetailPageViewModel2.getScreenModeService().getCutoutHelper();
            cutoutHelper.getClass();
            KProperty kProperty = j.i[1];
            cutoutHelper.b.a(Boolean.FALSE);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/ui/TogetherWatchDetailPageActivity$d.class */
    public static final class d implements Rl.d {
        public final k a(pm.d dVar, dm.a aVar, Context context) {
            return new k(dVar, aVar);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.ui.TogetherWatchDetailPageActivity$onCreate$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/ui/TogetherWatchDetailPageActivity$onCreate$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final h $component;
        int label;
        final TogetherWatchDetailPageActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(h hVar, TogetherWatchDetailPageActivity togetherWatchDetailPageActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$component = hVar;
            this.this$0 = togetherWatchDetailPageActivity;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$component, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                com.bilibili.tgwt.player.h hVar = (com.bilibili.tgwt.player.h) ((com.bilibili.tgwt.ui.b) this.$component).f112278o0.get();
                ViewGroup viewGroup = (ViewGroup) this.this$0.findViewById(2131313536);
                this.label = 1;
                if (hVar.a(viewGroup, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.tgwt.ui.TogetherWatchDetailPageActivity$onCreate$10, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/ui/TogetherWatchDetailPageActivity$onCreate$10.class */
    public static final class AnonymousClass10 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        int I$0;
        int label;
        final TogetherWatchDetailPageActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(TogetherWatchDetailPageActivity togetherWatchDetailPageActivity, Continuation<? super AnonymousClass10> continuation) {
            super(2, continuation);
            this.this$0 = togetherWatchDetailPageActivity;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass10 anonymousClass10 = new AnonymousClass10(this.this$0, continuation);
            anonymousClass10.I$0 = ((Number) obj).intValue();
            return anonymousClass10;
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
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.this$0.f112214D;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            com.bilibili.bangumi.ui.page.detail.playerV2.screenstate.a screenStateHelper = togetherWatchDetailPageViewModel2.getScreenStateService().getScreenStateHelper();
            screenStateHelper.getClass();
            screenStateHelper.b.a(screenStateHelper, com.bilibili.bangumi.ui.page.detail.playerV2.screenstate.a.n[0], Integer.valueOf(i7));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.ui.TogetherWatchDetailPageActivity$onCreate$11, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/ui/TogetherWatchDetailPageActivity$onCreate$11.class */
    public static final class AnonymousClass11 extends SuspendLambda implements Function2<a.b, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final TogetherWatchDetailPageActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass11(TogetherWatchDetailPageActivity togetherWatchDetailPageActivity, Continuation<? super AnonymousClass11> continuation) {
            super(2, continuation);
            this.this$0 = togetherWatchDetailPageActivity;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass11 anonymousClass11 = new AnonymousClass11(this.this$0, continuation);
            anonymousClass11.L$0 = obj;
            return anonymousClass11;
        }

        public final Object invoke(a.b bVar, Continuation<? super Unit> continuation) {
            return create(bVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            a.b bVar = (a.b) this.L$0;
            BangumiScreenStateLayoutHelper bangumiScreenStateLayoutHelper = this.this$0.f112216F;
            BangumiScreenStateLayoutHelper bangumiScreenStateLayoutHelper2 = bangumiScreenStateLayoutHelper;
            if (bangumiScreenStateLayoutHelper == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutHelper");
                bangumiScreenStateLayoutHelper2 = null;
            }
            bangumiScreenStateLayoutHelper2.d(bVar);
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.this$0.f112214D;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            j cutoutHelper = togetherWatchDetailPageViewModel2.getScreenModeService().getCutoutHelper();
            cutoutHelper.getClass();
            KProperty[] kPropertyArr = j.i;
            KProperty kProperty = kPropertyArr[3];
            boolean z6 = bVar.b;
            cutoutHelper.d.a(Boolean.valueOf(z6));
            KProperty kProperty2 = kPropertyArr[4];
            cutoutHelper.e.a(Boolean.valueOf(bVar.a));
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = this.this$0.f112214D;
            if (togetherWatchDetailPageViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                togetherWatchDetailPageViewModel3 = null;
            }
            N n7 = togetherWatchDetailPageViewModel3.getChatService().f111861J.f8336l;
            if (z6 != n7.f8251a) {
                n7.f8251a = z6;
                n7.notifyPropertyChanged(443);
            }
            LD0.a aVar = this.this$0.f112215E;
            if (z6 != aVar.f14508c) {
                aVar.f14508c = z6;
                aVar.notifyPropertyChanged(321);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.ui.TogetherWatchDetailPageActivity$onCreate$12, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/ui/TogetherWatchDetailPageActivity$onCreate$12.class */
    public static final class AnonymousClass12 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TogetherWatchDetailPageActivity this$0;

        /* JADX INFO: renamed from: com.bilibili.tgwt.ui.TogetherWatchDetailPageActivity$onCreate$12$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/ui/TogetherWatchDetailPageActivity$onCreate$12$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TogetherWatchDetailPageActivity f112222a;

            public a(TogetherWatchDetailPageActivity togetherWatchDetailPageActivity) {
                this.f112222a = togetherWatchDetailPageActivity;
            }

            public final Object emit(Object obj, Continuation continuation) {
                this.f112222a.finish();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass12(TogetherWatchDetailPageActivity togetherWatchDetailPageActivity, Continuation<? super AnonymousClass12> continuation) {
            super(2, continuation);
            this.this$0 = togetherWatchDetailPageActivity;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass12(this.this$0, continuation);
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
                MutableSharedFlow<Unit> mutableSharedFlow = com.bilibili.tgwt.ui.a.f112223a;
                a aVar = new a(this.this$0);
                this.label = 1;
                if (mutableSharedFlow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.tgwt.ui.TogetherWatchDetailPageActivity$onCreate$8, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/ui/TogetherWatchDetailPageActivity$onCreate$8.class */
    public static final class AnonymousClass8 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        boolean Z$0;
        int label;
        final TogetherWatchDetailPageActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(TogetherWatchDetailPageActivity togetherWatchDetailPageActivity, Continuation<? super AnonymousClass8> continuation) {
            super(2, continuation);
            this.this$0 = togetherWatchDetailPageActivity;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass8 anonymousClass8 = new AnonymousClass8(this.this$0, continuation);
            anonymousClass8.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass8;
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
            boolean z6 = this.Z$0;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.this$0.f112214D;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            com.bilibili.bangumi.ui.page.detail.playerV2.screenstate.a screenStateHelper = togetherWatchDetailPageViewModel2.getScreenStateService().getScreenStateHelper();
            screenStateHelper.getClass();
            screenStateHelper.c.a(screenStateHelper, com.bilibili.bangumi.ui.page.detail.playerV2.screenstate.a.n[1], Boolean.valueOf(z6));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.ui.TogetherWatchDetailPageActivity$onCreate$9, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/ui/TogetherWatchDetailPageActivity$onCreate$9.class */
    public static final class AnonymousClass9 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        final Object $playerAllowsRotationLock;
        int label;
        final TogetherWatchDetailPageActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(TogetherWatchDetailPageActivity togetherWatchDetailPageActivity, Object obj, Continuation<? super AnonymousClass9> continuation) {
            super(2, continuation);
            this.this$0 = togetherWatchDetailPageActivity;
            this.$playerAllowsRotationLock = obj;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass9(this.this$0, this.$playerAllowsRotationLock, continuation);
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
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.this$0.f112214D;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            com.bilibili.bangumi.ui.page.detail.playerV2.screenstate.a screenStateHelper = togetherWatchDetailPageViewModel2.getScreenStateService().getScreenStateHelper();
            Object obj2 = this.$playerAllowsRotationLock;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = this.this$0.f112214D;
            if (togetherWatchDetailPageViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                togetherWatchDetailPageViewModel3 = null;
            }
            boolean zIsSwitchOrientationEnabled = togetherWatchDetailPageViewModel3.getPlayControlService().isSwitchOrientationEnabled();
            ArraySet arraySet = screenStateHelper.l;
            boolean zIsEmpty = arraySet.isEmpty();
            if (zIsSwitchOrientationEnabled) {
                arraySet.remove(obj2);
            } else {
                arraySet.add(obj2);
            }
            if (zIsEmpty != arraySet.isEmpty()) {
                screenStateHelper.e();
            }
            return Unit.INSTANCE;
        }
    }

    public TogetherWatchDetailPageActivity() {
        setDisableNightModeManipulation(true);
        this.f112215E = new LD0.a();
    }

    public final void Q6(boolean z6) {
        int i7 = z6 ? 0 : 4;
        findViewById(2131308595).setVisibility(i7);
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
        if (togetherWatchDetailPageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel2 = null;
        }
        if (togetherWatchDetailPageViewModel2.getPlayerContainerService().getPlayerState() < 1) {
            findViewById(2131308994).setVisibility(i7);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Context contextHookAttachContext = Hooks.hookAttachContext(this, context);
        ArrayDeque<Boolean> arrayDeque = com.bilibili.tgwt.ui.d.f112293a;
        if (arrayDeque.isEmpty() ? false : ((Boolean) arrayDeque.removeFirst()).booleanValue()) {
            getDelegate().setLocalNightMode(2);
            contextHookAttachContext = new ContextThemeWrapper(contextHookAttachContext, 2131887827);
        } else {
            getDelegate().setLocalNightMode(MultipleThemeUtils.getCurrentNightMode(this));
        }
        super.attachBaseContext(contextHookAttachContext);
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.playerbizcommon.miniplayer.IMiniPlayerContainer
    @NotNull
    public final Rect getContainerUnavailableRect() {
        return new Rect();
    }

    @Override // com.bilibili.playerbizcommon.miniplayer.IMiniPlayerContainer
    @NotNull
    public final String getMiniPlayerContainerKey() {
        return "ogv_detail_page";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "pgc.pgc-video-detail.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
        if (togetherWatchDetailPageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel2 = null;
        }
        return togetherWatchDetailPageViewModel2.getPageViewService().getPvExtra();
    }

    @NotNull
    public final TogetherWatchDetailPageViewModel n0() {
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
        if (togetherWatchDetailPageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel2 = null;
        }
        return togetherWatchDetailPageViewModel2;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        Bundle extras;
        String string;
        super.onActivityResult(i7, i8, intent);
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
        if (togetherWatchDetailPageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel2 = null;
        }
        togetherWatchDetailPageViewModel2.getPayService().resolveSponsorActivityResultCallback(i7, i8, intent);
        if (i7 == 18) {
            if (intent == null || (extras = intent.getExtras()) == null || (string = extras.getString("season_id")) == null) {
                return;
            }
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = this.f112214D;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel4 = togetherWatchDetailPageViewModel3;
            if (togetherWatchDetailPageViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                togetherWatchDetailPageViewModel4 = null;
            }
            togetherWatchDetailPageViewModel4.getPlayHistoryService().clearPrevTwPageEpId();
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel5 = this.f112214D;
            if (togetherWatchDetailPageViewModel5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                togetherWatchDetailPageViewModel5 = null;
            }
            PlayControlService.switchSeason$default(togetherWatchDetailPageViewModel5.getPlayControlService(), Long.parseLong(string), "pgc.pgc-video-detail.0.0", 6, (Long) null, 8, (Object) null);
            return;
        }
        if (i7 == 109 && i8 == -1) {
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel6 = this.f112214D;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel7 = togetherWatchDetailPageViewModel6;
            if (togetherWatchDetailPageViewModel6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                togetherWatchDetailPageViewModel7 = null;
            }
            togetherWatchDetailPageViewModel7.getPlayControlService().resetSwitchState();
            if (com.bilibili.ogv.infra.account.a.f67852b.isLogin()) {
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel8 = this.f112214D;
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel9 = togetherWatchDetailPageViewModel8;
                if (togetherWatchDetailPageViewModel8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    togetherWatchDetailPageViewModel9 = null;
                }
                NewSeasonService.loadSeason$default(togetherWatchDetailPageViewModel9.getSeasonService(), (Consumer) null, 1, (Object) null);
            }
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NotNull Configuration configuration) {
        TogetherWatchDetailPageActivity togetherWatchDetailPageActivity;
        Window window;
        View decorView;
        ViewTreeObserver viewTreeObserver;
        super.onConfigurationChanged(configuration);
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
        if (togetherWatchDetailPageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel2 = null;
        }
        togetherWatchDetailPageViewModel2.getPlayerContainerService().onConfigurationChanged(configuration);
        om.a aVar = this.f112215E.f14506a;
        if (aVar != null && aVar.e != null && configuration.orientation == 1 && !aVar.f) {
            aVar.o();
            aVar.f = true;
        }
        BangumiScreenStateLayoutHelper bangumiScreenStateLayoutHelper = this.f112216F;
        BangumiScreenStateLayoutHelper bangumiScreenStateLayoutHelper2 = bangumiScreenStateLayoutHelper;
        if (bangumiScreenStateLayoutHelper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutHelper");
            bangumiScreenStateLayoutHelper2 = null;
        }
        bangumiScreenStateLayoutHelper2.c(configuration);
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel4 = togetherWatchDetailPageViewModel3;
        if (togetherWatchDetailPageViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel4 = null;
        }
        j cutoutHelper = togetherWatchDetailPageViewModel4.getScreenModeService().getCutoutHelper();
        cutoutHelper.getClass();
        if (configuration.screenHeightDp > 0 && configuration.orientation == 1 && (togetherWatchDetailPageActivity = cutoutHelper.g) != null && (window = togetherWatchDetailPageActivity.getWindow()) != null && (decorView = window.getDecorView()) != null && (viewTreeObserver = decorView.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnPreDrawListener(new i(cutoutHelper, decorView));
        }
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel5 = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel6 = togetherWatchDetailPageViewModel5;
        if (togetherWatchDetailPageViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel6 = null;
        }
        DetailVideoContainerDragModeProcessor detailVideoContainerDragModeService = togetherWatchDetailPageViewModel6.getDetailVideoContainerDragModeService();
        detailVideoContainerDragModeService.getClass();
        if (configuration.orientation == 1) {
            DetailVideoDragModeStateProcessor detailVideoDragModeStateProcessor = detailVideoContainerDragModeService.l;
            DetailVideoDragModeStateProcessor detailVideoDragModeStateProcessor2 = detailVideoDragModeStateProcessor;
            if (detailVideoDragModeStateProcessor == null) {
                Intrinsics.throwUninitializedPropertyAccessException("stateProcessor");
                detailVideoDragModeStateProcessor2 = null;
            }
            detailVideoDragModeStateProcessor2.a();
            DetailVideoDragModeStateProcessor detailVideoDragModeStateProcessor3 = detailVideoContainerDragModeService.l;
            DetailVideoDragModeStateProcessor detailVideoDragModeStateProcessor4 = detailVideoDragModeStateProcessor3;
            if (detailVideoDragModeStateProcessor3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("stateProcessor");
                detailVideoDragModeStateProcessor4 = null;
            }
            detailVideoDragModeStateProcessor4.d();
        }
        int i7 = configuration.orientation;
        if (i7 == 1) {
            r rVar = this.f112217G;
            r rVar2 = rVar;
            if (rVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVideoWrapperProcessor");
                rVar2 = null;
            }
            if (rVar2.f111706i) {
                rVar2.f111707j = false;
                ValueAnimator valueAnimator = rVar2.f111708k;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    ValueAnimator valueAnimator2 = rVar2.f111708k;
                    if (valueAnimator2 != null) {
                        valueAnimator2.removeAllUpdateListeners();
                    }
                    ValueAnimator valueAnimator3 = rVar2.f111708k;
                    if (valueAnimator3 != null) {
                        valueAnimator3.cancel();
                    }
                    rVar2.f111708k = null;
                }
                rVar2.a().getLayoutParams().width = 0;
                ((ViewGroup.MarginLayoutParams) rVar2.c().getLayoutParams()).leftMargin = 0;
                ((ViewGroup.MarginLayoutParams) rVar2.c().getLayoutParams()).rightMargin = 0;
                rVar2.b().getLayoutParams().width = rVar2.f111712o ? Kl.d.a(rVar2.f111699a.getWindow()) + rVar2.f111711n : rVar2.f111711n;
                rVar2.b().setPadding(0, 0, 0, 0);
                rVar2.b().requestLayout();
                rVar2.f111702d.f110932y.setValue(0);
            }
            r rVar3 = this.f112217G;
            if (rVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVideoWrapperProcessor");
                rVar3 = null;
            }
            if (rVar3.f111706i) {
                findViewById(2131299465).setTouchEventEnabled(true);
            }
        } else if (i7 == 2) {
            findViewById(2131296811).setExpanded(true, false);
            r rVar4 = this.f112217G;
            if (rVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVideoWrapperProcessor");
                rVar4 = null;
            }
            if (rVar4.f111706i) {
                findViewById(2131299465).setTouchEventEnabled(false);
            }
        }
        InputMethodManagerHelper.hideSoftInput(this, getCurrentFocus(), 0);
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [com.bilibili.tgwt.chatroom.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [com.bilibili.tgwt.ui.b, com.bilibili.tgwt.ui.h, java.lang.Object] */
    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = (TogetherWatchDetailPageViewModel) new ViewModelProvider(this).get(TogetherWatchDetailPageViewModel.class);
        this.f112214D = togetherWatchDetailPageViewModel;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
        if (togetherWatchDetailPageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel2 = null;
        }
        togetherWatchDetailPageViewModel2.clearServiceCache();
        Lifecycle lifecycle = getLifecycle();
        Intent intent = getIntent();
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        Object obj = new Object();
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        Preconditions.checkNotNull(lifecycle);
        Preconditions.checkNotNull(intent);
        Preconditions.checkNotNull(this);
        Preconditions.checkNotNull(onBackPressedDispatcher);
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(lifecycleScope);
        ?? obj2 = new Object();
        ?? obj3 = new Object();
        obj3.f112250a = yW0.c.a(this);
        yW0.c cVarA = yW0.c.a(intent);
        obj3.f112252b = cVarA;
        obj3.f112254c = yW0.b.b(ScreenModeService_Factory.create(cVarA));
        obj3.f112256d = yW0.c.a(lifecycle);
        obj3.f112258e = yW0.c.a(lifecycleScope);
        yW0.c cVarA2 = yW0.c.a(onBackPressedDispatcher);
        obj3.f112260f = cVarA2;
        yW0.b bVarB = yW0.b.b(ScreenStateService_Factory.create(obj3.f112254c, obj3.f112256d, obj3.f112258e, cVarA2));
        obj3.f112262g = bVarB;
        obj3.h = yW0.b.b(BangumiPopFragmentService_Factory.create(bVarB, obj3.f112260f));
        obj3.f112265i = yW0.b.b(ActivityContextParamsService_Factory.create(obj3.f112252b));
        obj3.f112267j = yW0.c.a(obj);
        yW0.b bVarB2 = yW0.b.b(g.a.f111550a);
        obj3.f112269k = bVarB2;
        yW0.b bVarB3 = yW0.b.b(new com.bilibili.tgwt.player.f(obj3.f112250a, bVarB2, obj3.f112260f, obj3.f112258e));
        obj3.f112271l = bVarB3;
        yW0.b bVarB4 = yW0.b.b(BangumiPlayerContainerService_Factory.create(yW0.b.b(new Rl.b(obj3.f112250a, obj3.f112265i, obj3.f112256d, obj3.f112267j, bVarB3))));
        obj3.f112273m = bVarB4;
        obj3.f112275n = yW0.b.b(DetailRightPanelService_Factory.create(obj3.f112262g, bVarB4, obj3.f112256d, obj3.f112260f));
        yW0.b bVarB5 = yW0.b.b(InitialPlayViewCallService_Factory.create(obj3.f112265i));
        obj3.f112277o = bVarB5;
        Kl.b bVar = new Kl.b(obj3.f112250a);
        obj3.f112279p = bVar;
        yW0.b bVar2 = obj3.f112265i;
        yW0.c cVar = obj3.f112256d;
        Kj0.b bVar3 = b.a.f12954a;
        obj3.f112281q = yW0.b.b(NewSeasonService_Factory.create(bVar2, bVarB5, cVar, bVar3, bVar));
        obj3.f112282r = yW0.b.b(BangumiFullscreenWebContainerService_Factory.create(obj3.f112273m));
        obj3.f112283s = yW0.b.b(NewSectionService_Factory.create(obj3.f112281q, obj3.f112265i, obj3.f112277o, obj3.f112258e, obj3.f112269k, obj3.f112250a));
        yW0.a aVar = new yW0.a();
        obj3.f112284t = aVar;
        yW0.b bVarB6 = yW0.b.b(PlayHistoryService_Factory.create(obj3.f112281q, obj3.f112283s, aVar, obj3.f112265i, obj3.f112262g, obj3.h, obj3.f112250a, obj3.f112256d, obj3.f112273m, obj3.f112258e, bVar3));
        obj3.f112285u = bVarB6;
        yW0.b bVarB7 = yW0.b.b(BangumiPreloadPlayHandlerService_Factory.create(obj3.f112273m, obj3.f112265i, obj3.f112256d, yW0.b.b(new com.bilibili.bangumi.logic.page.detail.playerhandler.b(obj3.f112250a, bVarB6))));
        obj3.f112286v = bVarB7;
        yW0.a.a(obj3.f112284t, yW0.b.b(PlayControlService_Factory.create(obj3.f112265i, obj3.f112281q, obj3.f112277o, obj3.f112283s, obj3.f112254c, obj3.f112256d, obj3.f112273m, bVarB7, obj3.f112258e, obj3.f112250a)));
        yW0.b bVar4 = obj3.f112281q;
        yW0.b bVar5 = obj3.f112265i;
        yW0.a aVar2 = obj3.f112284t;
        yW0.c cVar2 = obj3.f112256d;
        yW0.c cVar3 = obj3.f112258e;
        Kj0.a aVar3 = a.C0067a.f12953a;
        obj3.f112287w = yW0.b.b(new com.bilibili.bangumi.logic.page.detail.report.c(aVar2, bVar4, bVar5, cVar2, cVar3));
        yW0.b bVarB8 = yW0.b.b(b.a.a);
        obj3.f112288x = bVarB8;
        yW0.b bVarB9 = yW0.b.b(new com.bilibili.tgwt.chatroom.b(obj3.f112265i, obj3.f112262g, obj3.f112284t, obj3.f112281q, bVarB8, obj3.f112258e, obj3.f112279p));
        obj3.f112289y = bVarB9;
        obj3.f112290z = new com.bilibili.tgwt.chatroom.f(obj2, bVarB9);
        yW0.c cVar4 = yW0.f.c;
        ArrayList arrayList = new ArrayList(1);
        List listEmptyList = Collections.emptyList();
        arrayList.add(obj3.f112290z);
        obj3.f112224A = yW0.b.b(LegacyPagePopService_Factory.create(obj3.f112262g, obj3.h, obj3.f112275n, obj3.f112281q, obj3.f112282r, obj3.f112287w, obj3.f112273m, obj3.f112283s, new yW0.f(arrayList, listEmptyList)));
        obj3.f112225B = yW0.b.b(new p(obj3.f112281q, obj3.f112289y, obj3.f112250a, obj3.f112258e, obj3.f112279p));
        obj3.f112226C = new yW0.a();
        yW0.b bVarB10 = yW0.b.b(OGVVipService_Factory.create(obj3.f112281q, obj3.f112284t));
        obj3.f112227D = bVarB10;
        yW0.b bVar6 = obj3.f112287w;
        yW0.a aVar4 = obj3.f112226C;
        yW0.b bVar7 = obj3.f112224A;
        yW0.b bVar8 = obj3.f112262g;
        yW0.c cVar5 = obj3.f112250a;
        yW0.a.a(aVar4, yW0.b.b(NewPayService_Factory.create(obj3.f112281q, obj3.f112283s, obj3.f112284t, bVar8, cVar5, obj3.f112258e, new Zl.f(aVar4, bVar6, bVar7, bVar8, bVarB10, cVar5), bVar3)));
        obj3.f112228E = yW0.b.b(OGVNonAutoPlayService_Factory.create(obj3.f112250a, obj3.f112256d, obj3.f112281q, obj3.f112284t, obj3.f112273m, obj3.f112262g));
        obj3.f112229F = yW0.b.b(SeekBizService_Factory.create(obj3.f112256d, obj3.f112287w, obj3.f112273m, obj3.f112250a));
        yW0.b bVarB11 = yW0.b.b(new com.bilibili.bangumi.ui.page.detail.playerV2.processor.b(obj3.f112256d, obj3.f112273m));
        obj3.f112230G = bVarB11;
        yW0.b bVarB12 = yW0.b.b(PlayLimitedLayerService_Factory.create(obj3.f112250a, obj3.f112256d, obj3.f112281q, obj3.f112273m, obj3.f112284t, obj3.f112262g, obj3.f112226C, obj3.f112287w, obj3.f112227D, obj3.f112224A, obj3.f112228E, obj3.f112229F, bVarB11, obj3.f112260f, bVar3));
        obj3.f112231H = bVarB12;
        obj3.f112232I = yW0.b.b(BangumiDanmakuService_Factory.create(obj3.f112250a, obj3.f112281q, obj3.f112284t, obj3.f112283s, obj3.f112265i, obj3.f112262g, obj3.f112287w, obj3.f112273m, bVarB12, obj3.f112256d, obj3.f112258e));
        yW0.a aVar5 = new yW0.a();
        obj3.f112233J = aVar5;
        yW0.c cVar6 = obj3.f112250a;
        yW0.a.a(aVar5, yW0.b.b(new n(cVar6, obj3.f112224A, obj3.f112281q, obj3.h, obj3.f112265i, obj3.f112284t, obj3.f112225B, obj3.f112289y, obj3.f112288x, obj3.f112262g, obj3.f112283s, obj3.f112285u, obj3.f112232I, obj3.f112256d, obj3.f112273m, obj3.f112258e, new com.bilibili.tgwt.im.ui.i(cVar6, aVar5), obj3.f112279p, obj3.f112260f)));
        obj3.f112234K = yW0.b.b(PageViewService_Factory.create(obj3.f112281q, obj3.f112265i, obj3.f112283s, obj3.f112284t, obj3.f112256d, obj3.f112252b, obj3.f112258e));
        obj3.f112235L = yW0.b.b(CommunityService_Factory.create(obj3.f112281q, obj3.f112284t, obj3.f112287w, obj3.f112265i, obj3.f112256d, obj3.f112258e, obj3.f112250a, bVar3));
        yW0.b bVarB13 = yW0.b.b(SwitchDubbingService_Factory.create(obj3.f112262g, obj3.f112281q, obj3.f112284t, obj3.f112273m, obj3.f112250a, obj3.f112256d));
        obj3.f112236M = bVarB13;
        obj3.f112237N = yW0.b.b(NewShareService_Factory.create(obj3.f112250a, obj3.f112265i, obj3.f112281q, obj3.f112283s, obj3.f112235L, obj3.f112284t, bVarB13, obj3.f112258e, obj3.f112273m, bVar3, aVar3, obj3.f112279p));
        obj3.f112238O = OGVPlayerLoadingCoverService_Factory.create(obj3.f112256d, obj3.f112284t, obj3.f112281q, obj3.f112273m, obj3.f112277o);
        yW0.b bVarB14 = yW0.b.b(new com.bilibili.bangumi.ui.page.detail.processor.dragmode.c(obj3.f112250a, obj3.f112284t, obj3.f112273m, obj3.f112262g, obj3.f112281q, obj3.f112254c, obj3.f112256d, obj3.f112228E, obj3.f112231H, obj3.f112258e));
        obj3.f112239P = bVarB14;
        obj3.f112240Q = yW0.b.b(ToolbarService_Factory.create(obj3.f112281q, obj3.f112284t, obj3.f112237N, obj3.f112262g, obj3.f112254c, obj3.f112236M, obj3.f112250a, obj3.f112256d, obj3.f112273m, obj3.f112231H, obj3.f112228E, obj3.f112238O, bVarB14, obj3.f112258e, obj3.f112279p));
        obj3.f112241R = yW0.b.b(new com.bilibili.tgwt.watermark.c(obj3.f112273m, obj3.f112284t, obj3.f112256d, new com.bilibili.tgwt.watermark.a(obj3.f112262g, obj3.f112275n, obj3.f112250a)));
        obj3.f112242S = yW0.b.b(ChronosBizService_Factory.create(obj3.f112224A, obj3.f112281q, obj3.f112265i, obj3.f112284t, obj3.f112262g, obj3.f112235L, obj3.f112236M, obj3.f112256d, obj3.f112258e, obj3.f112250a, obj3.f112273m, obj3.f112283s, obj3.f112232I, bVar3, obj3.f112279p));
        obj3.f112243T = yW0.b.b(PlayStrategyControlService_Factory.create(obj3.f112265i, obj3.f112281q, obj3.f112283s, obj3.f112284t, obj3.f112273m, obj3.f112256d));
        yW0.b bVarB15 = yW0.b.b(PlaySeekBarTimeService_Factory.create(obj3.f112273m, obj3.f112256d));
        obj3.f112244U = bVarB15;
        obj3.f112245V = yW0.b.b(BangumiPlayerBizService_Factory.create(obj3.f112273m, obj3.f112285u, obj3.f112284t, obj3.f112231H, obj3.f112243T, obj3.f112228E, obj3.f112281q, obj3.f112286v, bVarB15, obj3.f112250a, obj3.f112256d));
        obj3.f112246W = yW0.b.b(new pm.b(obj3.f112284t, obj3.f112273m, obj3.f112283s, obj3.f112256d));
        obj3.f112247X = yW0.b.b(PlayerHelper_Factory.create(obj3.f112256d, obj3.f112273m));
        obj3.f112248Y = yW0.b.b(ParentViewService_Factory.create(obj3.f112256d, obj3.f112273m, obj3.f112239P));
        yW0.b bVarB16 = yW0.b.b(new com.bilibili.bangumi.ui.page.detail.playerV2.processor.d(obj3.f112281q, obj3.f112231H, obj3.f112273m, obj3.f112250a, obj3.f112256d));
        obj3.f112249Z = bVarB16;
        obj3.f112251a0 = yW0.b.b(OGVToastProcessService_Factory.create(obj3.f112250a, obj3.f112284t, obj3.f112287w, obj3.f112227D, obj3.f112262g, obj3.f112226C, obj3.f112224A, obj3.f112281q, obj3.f112256d, obj3.h, obj3.f112273m, obj3.f112231H, obj3.f112230G, bVarB16, obj3.f112258e));
        obj3.f112253b0 = yW0.b.b(new v(obj3.f112240Q, obj3.f112281q, obj3.f112262g, obj3.f112289y, obj3.f112265i, obj3.f112273m, obj3.f112258e, obj3.f112279p));
        yW0.c cVar7 = obj3.f112250a;
        yW0.b bVar9 = obj3.f112273m;
        yW0.a aVar6 = obj3.f112233J;
        yW0.b bVar10 = obj3.f112289y;
        obj3.f112255c0 = yW0.b.b(new com.bilibili.tgwt.player.processor.g(bVar9, aVar6, bVar10, obj3.f112258e, new com.bilibili.tgwt.player.widget.i(aVar6, bVar9, bVar10, cVar7)));
        obj3.f112257d0 = yW0.b.b(new com.bilibili.bangumi.ui.page.detail.playerV2.playerservice.h(obj3.f112284t, obj3.f112281q, obj3.f112273m, obj3.f112256d, obj3.f112250a));
        com.bilibili.tgwt.player.e eVar = new com.bilibili.tgwt.player.e(obj3.f112271l);
        obj3.f112259e0 = eVar;
        obj3.f112261f0 = yW0.c.a(new Or0.a(eVar));
        yW0.c cVar8 = obj3.f112250a;
        yW0.a aVar7 = obj3.f112233J;
        obj3.f112263g0 = yW0.c.a(new com.bilibili.tgwt.player.widget.c(aVar7, new com.bilibili.tgwt.player.widget.b(cVar8, aVar7)));
        yW0.c cVar9 = obj3.f112250a;
        yW0.b bVar11 = obj3.f112281q;
        yW0.a aVar8 = obj3.f112284t;
        yW0.b bVar12 = obj3.f112287w;
        yW0.c cVarA3 = yW0.c.a(new com.bilibili.bangumi.ui.page.detail.playerV2.widget.quality.h(bVar12, obj3.f112262g, new o(aVar8, bVar11, bVar12, obj3.f112224A, obj3.f112257d0, cVar9)));
        yW0.c cVar10 = obj3.f112250a;
        obj3.f112264h0 = new com.bilibili.tgwt.player.c(cVar10, obj3.f112261f0, obj3.f112263g0, cVarA3);
        obj3.f112266i0 = yW0.b.b(new com.bilibili.tgwt.player.processor.c(obj3.f112289y, obj3.f112233J, obj3.f112258e, obj3.f112264h0, yW0.b.b(new com.bilibili.bangumi.ui.page.detail.playerV2.screenstate.c(obj3.f112254c, obj3.f112262g, obj3.f112273m, cVar10, obj3.f112256d)), obj3.f112259e0));
        obj3.f112268j0 = yW0.b.b(new m(obj3.f112250a, obj3.f112289y, obj3.f112281q, obj3.f112233J, obj3.f112262g, obj3.f112273m, obj3.f112231H, obj3.f112258e));
        obj3.f112270k0 = yW0.b.b(new com.bilibili.tgwt.player.processor.o(obj3.f112250a, obj3.f112273m, obj3.f112289y, obj3.f112281q, obj3.f112284t, obj3.f112233J, obj3.f112285u, obj3.f112283s, obj3.f112229F, obj3.f112241R, obj3.f112286v, obj3.f112256d, obj3.f112258e, obj3.f112279p));
        obj3.f112272l0 = yW0.b.b(new com.bilibili.tgwt.player.processor.b(obj3.f112262g, obj3.f112265i, obj3.f112250a));
        obj3.f112274m0 = yW0.b.b(OGVDolbyService_Factory.create(obj3.f112273m, obj3.f112231H, obj3.f112287w, obj3.f112256d, obj3.f112250a, bVar3, aVar3));
        obj3.f112276n0 = new com.bilibili.tgwt.player.widget.g(obj3.f112233J, obj3.f112289y, obj3.f112225B, obj3.f112237N, obj3.f112273m, obj3.f112250a);
        yW0.b bVarB17 = yW0.b.b(i.a.f111551a);
        obj3.f112278o0 = bVarB17;
        obj3.f112280p0 = yW0.b.b(new l(obj3.f112233J, obj3.f112262g, obj3.f112273m, obj3.f112256d, obj3.f112276n0, bVarB17, obj3.f112258e));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel4 = togetherWatchDetailPageViewModel3;
        if (togetherWatchDetailPageViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel4 = null;
        }
        togetherWatchDetailPageViewModel4.chatService = (ChatService) obj3.f112233J.get();
        togetherWatchDetailPageViewModel4.chatVoiceRtcService = (ChatVoiceRtcService) obj3.f112225B.get();
        togetherWatchDetailPageViewModel4.chatRoomManagerService = (ChatRoomManagerService) obj3.f112289y.get();
        togetherWatchDetailPageViewModel4.activityContextParamsService = (ActivityContextParamsService) obj3.f112265i.get();
        togetherWatchDetailPageViewModel4.seasonService = (NewSeasonService) obj3.f112281q.get();
        togetherWatchDetailPageViewModel4.sectionService = (NewSectionService) obj3.f112283s.get();
        togetherWatchDetailPageViewModel4.payService = (NewPayService) obj3.f112226C.get();
        togetherWatchDetailPageViewModel4.playControlService = (PlayControlService) obj3.f112284t.get();
        togetherWatchDetailPageViewModel4.pageViewService = (PageViewService) obj3.f112234K.get();
        togetherWatchDetailPageViewModel4.playHistoryService = (PlayHistoryService) obj3.f112285u.get();
        togetherWatchDetailPageViewModel4.communityService = (CommunityService) obj3.f112235L.get();
        togetherWatchDetailPageViewModel4.screenModeService = (ScreenModeService) obj3.f112254c.get();
        togetherWatchDetailPageViewModel4.shareService = (NewShareService) obj3.f112237N.get();
        togetherWatchDetailPageViewModel4.screenStateService = (ScreenStateService) obj3.f112262g.get();
        togetherWatchDetailPageViewModel4.toolbarService = (ToolbarService) obj3.f112240Q.get();
        togetherWatchDetailPageViewModel4.popFragmentService = (BangumiPopFragmentService) obj3.h.get();
        togetherWatchDetailPageViewModel4.webAndExternalBusinessPagePopService = (LegacyPagePopService) obj3.f112224A.get();
        togetherWatchDetailPageViewModel4.switchDubbingService = (SwitchDubbingService) obj3.f112236M.get();
        togetherWatchDetailPageViewModel4.playerWatermarkService = (com.bilibili.tgwt.watermark.b) obj3.f112241R.get();
        togetherWatchDetailPageViewModel4.pageReportService = (PageReportService) obj3.f112287w.get();
        togetherWatchDetailPageViewModel4.rightPanelService = (DetailRightPanelService) obj3.f112275n.get();
        togetherWatchDetailPageViewModel4.danmakuService = (BangumiDanmakuService) obj3.f112232I.get();
        togetherWatchDetailPageViewModel4.fullscreenWebContainerService = (BangumiFullscreenWebContainerService) obj3.f112282r.get();
        togetherWatchDetailPageViewModel4.vipService = (OGVVipService) obj3.f112227D.get();
        togetherWatchDetailPageViewModel4.detailChatService = (Hl.a) obj3.f112288x.get();
        togetherWatchDetailPageViewModel4.chronosBizService = (ChronosBizService) obj3.f112242S.get();
        togetherWatchDetailPageViewModel4.bangumiPlayerBizService = (BangumiPlayerBizService) obj3.f112245V.get();
        togetherWatchDetailPageViewModel4.playerContainerService = (BangumiPlayerContainerService) obj3.f112273m.get();
        togetherWatchDetailPageViewModel4.playLimitedLayerService = (PlayLimitedLayerService) obj3.f112231H.get();
        togetherWatchDetailPageViewModel4.playSeekBarTimeService = (PlaySeekBarTimeService) obj3.f112244U.get();
        togetherWatchDetailPageViewModel4.pgcBackgroundPlayControlBridge = (pm.a) obj3.f112246W.get();
        togetherWatchDetailPageViewModel4.nonAutoPlayService = (OGVNonAutoPlayService) obj3.f112228E.get();
        togetherWatchDetailPageViewModel4.seekBizService = (SeekBizService) obj3.f112229F.get();
        togetherWatchDetailPageViewModel4.playerHelper = (PlayerHelper) obj3.f112247X.get();
        togetherWatchDetailPageViewModel4.parentViewService = (ParentViewService) obj3.f112248Y.get();
        togetherWatchDetailPageViewModel4.playerLoadingCoverService = new OGVPlayerLoadingCoverService(lifecycle, (PlayControlService) obj3.f112284t.get(), (NewSeasonService) obj3.f112281q.get(), (BangumiPlayerContainerService) obj3.f112273m.get(), (InitialPlayViewCallService) obj3.f112277o.get());
        togetherWatchDetailPageViewModel4.detailVideoContainerDragModeService = (DetailVideoContainerDragModeProcessor) obj3.f112239P.get();
        togetherWatchDetailPageViewModel4.toastService = (OGVToastProcessService) obj3.f112251a0.get();
        togetherWatchDetailPageViewModel4.chatToolBarService = (TogetherWatchToolbarService) obj3.f112253b0.get();
        togetherWatchDetailPageViewModel4.togetherWatchChatPopupProcessService = (com.bilibili.tgwt.player.processor.f) obj3.f112255c0.get();
        togetherWatchDetailPageViewModel4.drmService = (com.bilibili.bangumi.ui.page.detail.playerV2.playerservice.b) obj3.f112257d0.get();
        togetherWatchDetailPageViewModel4.togetherWatchChatImageProcessor = (TogetherWatchChatImageProcessor) obj3.f112266i0.get();
        togetherWatchDetailPageViewModel4.togetherWatchEndPageProcessor = (TogetherWatchEndPageProcessor) obj3.f112268j0.get();
        togetherWatchDetailPageViewModel4.togetherPlayProcessor = (TogetherWatchPlayProcessor) obj3.f112270k0.get();
        togetherWatchDetailPageViewModel4.togetherWatchAutoFullScreenProcessor = (com.bilibili.tgwt.player.processor.a) obj3.f112272l0.get();
        togetherWatchDetailPageViewModel4.playStrategyControlService = (PlayStrategyControlService) obj3.f112243T.get();
        togetherWatchDetailPageViewModel4.preloadPlayHandlerService = (BangumiPreloadPlayHandlerService) obj3.f112286v.get();
        togetherWatchDetailPageViewModel4.dolbyService = (OGVDolbyService) obj3.f112274m0.get();
        togetherWatchDetailPageViewModel4.qualityProcessorService = (com.bilibili.bangumi.ui.page.detail.playerV2.processor.c) obj3.f112249Z.get();
        togetherWatchDetailPageViewModel4.togetherWatchChatVoicePopupProcessor = (com.bilibili.tgwt.player.processor.k) obj3.f112280p0.get();
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel5 = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel6 = togetherWatchDetailPageViewModel5;
        if (togetherWatchDetailPageViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel6 = null;
        }
        togetherWatchDetailPageViewModel6.getPageViewService().setPageViewTracker(this, String.valueOf(hashCode()));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel7 = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel8 = togetherWatchDetailPageViewModel7;
        if (togetherWatchDetailPageViewModel7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel8 = null;
        }
        togetherWatchDetailPageViewModel8.getPopFragmentService().bindFragmentManager(getSupportFragmentManager());
        super.onCreate(bundle);
        AbstractC1542o abstractC1542o = (AbstractC1542o) DataBindingUtil.setContentView(this, 2131500173);
        LD0.a aVar9 = this.f112215E;
        abstractC1542o.q(aVar9);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(obj3, this, null), 3, (Object) null);
        ViewGroup viewGroup = (ViewGroup) findViewById(2131316235);
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel9 = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel10 = togetherWatchDetailPageViewModel9;
        if (togetherWatchDetailPageViewModel9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel10 = null;
        }
        Fragment chatVoiceFragment = togetherWatchDetailPageViewModel10.getChatService().f111872U ? new ChatVoiceFragment() : new ChatFragment();
        this.f112216F = new BangumiScreenStateLayoutHelper(this, this, viewGroup);
        getSupportFragmentManager().beginTransaction().add(2131301638, chatVoiceFragment).commitAllowingStateLoss();
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel11 = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel12 = togetherWatchDetailPageViewModel11;
        if (togetherWatchDetailPageViewModel11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel12 = null;
        }
        togetherWatchDetailPageViewModel12.getDetailVideoContainerDragModeService().a(abstractC1542o.getRoot());
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel13 = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel14 = togetherWatchDetailPageViewModel13;
        if (togetherWatchDetailPageViewModel13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel14 = null;
        }
        togetherWatchDetailPageViewModel14.getRightPanelService().init(getSupportFragmentManager(), (ViewGroup) findViewById(2131310339), findViewById(2131310341));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel15 = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel16 = togetherWatchDetailPageViewModel15;
        if (togetherWatchDetailPageViewModel15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel16 = null;
        }
        togetherWatchDetailPageViewModel16.getPlayStrategyControlService().installPlayStrategy(new a(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel17 = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel18 = togetherWatchDetailPageViewModel17;
        if (togetherWatchDetailPageViewModel17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel18 = null;
        }
        BangumiPlayerContainerService playerContainerService = togetherWatchDetailPageViewModel18.getPlayerContainerService();
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel19 = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel20 = togetherWatchDetailPageViewModel19;
        if (togetherWatchDetailPageViewModel19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel20 = null;
        }
        playerContainerService.onViewCreated(togetherWatchDetailPageViewModel20, abstractC1542o.getRoot(), bundle);
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel21 = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel22 = togetherWatchDetailPageViewModel21;
        if (togetherWatchDetailPageViewModel21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel22 = null;
        }
        togetherWatchDetailPageViewModel22.getFullscreenWebContainerService().init(getSupportFragmentManager());
        b bVar13 = new b(this);
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel23 = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel24 = togetherWatchDetailPageViewModel23;
        if (togetherWatchDetailPageViewModel23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel24 = null;
        }
        PageReportService pageReportService = togetherWatchDetailPageViewModel24.getPageReportService();
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel25 = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel26 = togetherWatchDetailPageViewModel25;
        if (togetherWatchDetailPageViewModel25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel26 = null;
        }
        OGVVipService vipService = togetherWatchDetailPageViewModel26.getVipService();
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel27 = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel28 = togetherWatchDetailPageViewModel27;
        if (togetherWatchDetailPageViewModel27 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel28 = null;
        }
        om.a aVar10 = new om.a(bVar13, pageReportService, vipService, togetherWatchDetailPageViewModel28.getPlayerContainerService());
        if (!Intrinsics.areEqual(aVar10, aVar9.f14506a)) {
            aVar9.f14506a = aVar10;
            aVar9.notifyPropertyChanged(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_FOOT_DETECT_INTERVAL);
        }
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel29 = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel30 = togetherWatchDetailPageViewModel29;
        if (togetherWatchDetailPageViewModel29 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel30 = null;
        }
        tm.e toolbarVm = togetherWatchDetailPageViewModel30.getToolbarService().getToolbarVm();
        if (!Intrinsics.areEqual(toolbarVm, aVar9.f14507b)) {
            aVar9.f14507b = toolbarVm;
            aVar9.notifyPropertyChanged(660);
        }
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel31 = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel32 = togetherWatchDetailPageViewModel31;
        if (togetherWatchDetailPageViewModel31 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel32 = null;
        }
        BangumiDanmakuService danmakuService = togetherWatchDetailPageViewModel32.getDanmakuService();
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel33 = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel34 = togetherWatchDetailPageViewModel33;
        if (togetherWatchDetailPageViewModel33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel34 = null;
        }
        togetherWatchDetailPageViewModel34.getPageReportService();
        tm.d dVar = new tm.d(this, danmakuService);
        if (!Intrinsics.areEqual(dVar, aVar9.f14509d)) {
            aVar9.f14509d = dVar;
            aVar9.notifyPropertyChanged(146);
        }
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel35 = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel36 = togetherWatchDetailPageViewModel35;
        if (togetherWatchDetailPageViewModel35 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel36 = null;
        }
        j cutoutHelper = togetherWatchDetailPageViewModel36.getScreenModeService().getCutoutHelper();
        Toolbar toolbar = getToolbar();
        cutoutHelper.g = this;
        cutoutHelper.h = toolbar;
        showBackButton();
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setTitle("");
        }
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel37 = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel38 = togetherWatchDetailPageViewModel37;
        if (togetherWatchDetailPageViewModel37 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel38 = null;
        }
        togetherWatchDetailPageViewModel38.getToolbarService().setParams(new GH0.g(this, 2), new com.bilibili.bililive.room.biz.ad.answer.f(abstractC1542o, 2), new Bg1.c(this, 4));
        BangumiVideoDetailLayout bangumiVideoDetailLayout = abstractC1542o.f2579A;
        bangumiVideoDetailLayout.setStatusBarBackgroundColor(0);
        abstractC1542o.f2584w.setBackground(null);
        bangumiVideoDetailLayout.getViewTreeObserver().addOnWindowAttachListener(new c(this, abstractC1542o));
        com.bilibili.bangumi.ui.page.detail.playerV2.screenstate.h hVar = new com.bilibili.bangumi.ui.page.detail.playerV2.screenstate.h(getLifecycle(), this);
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel39 = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel40 = togetherWatchDetailPageViewModel39;
        if (togetherWatchDetailPageViewModel39 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel40 = null;
        }
        ScreenStateService screenStateService = togetherWatchDetailPageViewModel40.getScreenStateService();
        BangumiScreenStateLayoutHelper bangumiScreenStateLayoutHelper = this.f112216F;
        BangumiScreenStateLayoutHelper bangumiScreenStateLayoutHelper2 = bangumiScreenStateLayoutHelper;
        if (bangumiScreenStateLayoutHelper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutHelper");
            bangumiScreenStateLayoutHelper2 = null;
        }
        screenStateService.setUp(bangumiScreenStateLayoutHelper2);
        BangumiScreenStateLayoutHelper bangumiScreenStateLayoutHelper3 = this.f112216F;
        BangumiScreenStateLayoutHelper bangumiScreenStateLayoutHelper4 = bangumiScreenStateLayoutHelper3;
        if (bangumiScreenStateLayoutHelper3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutHelper");
            bangumiScreenStateLayoutHelper4 = null;
        }
        bangumiScreenStateLayoutHelper4.c(getResources().getConfiguration());
        FlowKt.launchIn(FlowKt.onEach(hVar.b, new AnonymousClass8(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel41 = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel42 = togetherWatchDetailPageViewModel41;
        if (togetherWatchDetailPageViewModel41 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel42 = null;
        }
        togetherWatchDetailPageViewModel42.getToolbarService().onAppBarCollapseChanged(false);
        FlowKt.launchIn(FlowKt.onEach(FlowKt.debounce(FlowKt.distinctUntilChanged(FlowKt.onEach(hVar.a, new AnonymousClass9(this, new Object(), null))), 100L), new AnonymousClass10(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel43 = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel44 = togetherWatchDetailPageViewModel43;
        if (togetherWatchDetailPageViewModel43 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel44 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel44.getScreenStateService().getScreenStateHelper().a, new AnonymousClass11(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel45 = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel46 = togetherWatchDetailPageViewModel45;
        if (togetherWatchDetailPageViewModel45 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel46 = null;
        }
        togetherWatchDetailPageViewModel46.getPlayLimitedLayerService().bindContainer((FrameLayout) findViewById(2131305037));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel47 = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel48 = togetherWatchDetailPageViewModel47;
        if (togetherWatchDetailPageViewModel47 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel48 = null;
        }
        togetherWatchDetailPageViewModel48.getPlayerLoadingCoverService().bindContainer(findViewById(2131308969));
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel49 = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel50 = togetherWatchDetailPageViewModel49;
        if (togetherWatchDetailPageViewModel49 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel50 = null;
        }
        ChatRoomManagerService chatRoomManagerService = togetherWatchDetailPageViewModel50.getChatRoomManagerService();
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel51 = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel52 = togetherWatchDetailPageViewModel51;
        if (togetherWatchDetailPageViewModel51 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel52 = null;
        }
        this.f112217G = new r(this, supportFragmentManager, viewGroup, chatRoomManagerService, togetherWatchDetailPageViewModel52.getScreenModeService().getScreenModeWrapperObservable());
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel53 = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel54 = togetherWatchDetailPageViewModel53;
        if (togetherWatchDetailPageViewModel53 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel54 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel54.getChatService().f111854C, new TogetherWatchDetailPageActivity$subscribe$1(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel55 = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel56 = togetherWatchDetailPageViewModel55;
        if (togetherWatchDetailPageViewModel55 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel56 = null;
        }
        com.bilibili.okretro.call.rxjava.c.a(togetherWatchDetailPageViewModel56.getSeasonService().getSeasonSwitchObservable().subscribe(new e(this, 0)), getLifecycle());
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel57 = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel58 = togetherWatchDetailPageViewModel57;
        if (togetherWatchDetailPageViewModel57 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel58 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel58.getPlayControlService().viewInfoExtraFlow(), new TogetherWatchDetailPageActivity$subscribe$3(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel59 = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel60 = togetherWatchDetailPageViewModel59;
        if (togetherWatchDetailPageViewModel59 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel60 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel60.getPlayControlService().getCurrentEpisodeFlow(), new TogetherWatchDetailPageActivity$subscribe$4(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel61 = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel62 = togetherWatchDetailPageViewModel61;
        if (togetherWatchDetailPageViewModel61 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel62 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel62.getSeasonService().getSeasonObservable(), new TogetherWatchDetailPageActivity$subscribe$5(this, null)), LifecycleKt.getCoroutineScope(getLifecycle()));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel63 = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel64 = togetherWatchDetailPageViewModel63;
        if (togetherWatchDetailPageViewModel63 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel64 = null;
        }
        DetailVideoContainerDragModeProcessor detailVideoContainerDragModeService = togetherWatchDetailPageViewModel64.getDetailVideoContainerDragModeService();
        detailVideoContainerDragModeService.q = true;
        detailVideoContainerDragModeService.b();
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel65 = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel66 = togetherWatchDetailPageViewModel65;
        if (togetherWatchDetailPageViewModel65 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel66 = null;
        }
        if (!togetherWatchDetailPageViewModel66.getChatService().f111872U) {
            r rVar = this.f112217G;
            r rVar2 = rVar;
            if (rVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVideoWrapperProcessor");
                rVar2 = null;
            }
            rVar2.f111706i = true;
            r rVar3 = this.f112217G;
            r rVar4 = rVar3;
            if (rVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVideoWrapperProcessor");
                rVar4 = null;
            }
            PlayerChatFragment playerChatFragment = new PlayerChatFragment();
            int iB = Uj0.c.b(280, this);
            rVar4.h = playerChatFragment;
            rVar4.f111711n = iB;
            boolean zIsAdded = playerChatFragment.isAdded();
            FragmentManager fragmentManager = rVar4.f111700b;
            if (zIsAdded) {
                fragmentManager.beginTransaction().show(rVar4.h).commitAllowingStateLoss();
            } else {
                fragmentManager.beginTransaction().add(rVar4.b().getId(), rVar4.h).commitAllowingStateLoss();
            }
            rVar4.a().setVisibility(0);
            rVar4.b().getLayoutParams().width = rVar4.f111712o ? Kl.d.a(rVar4.f111699a.getWindow()) + rVar4.f111711n : rVar4.f111711n;
        }
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel67 = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel68 = togetherWatchDetailPageViewModel67;
        if (togetherWatchDetailPageViewModel67 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel68 = null;
        }
        togetherWatchDetailPageViewModel68.getDanmakuService().init(this, aVar9.f14509d);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass12(this, null), 3, (Object) null);
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        Intent intent = getIntent();
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
        if (togetherWatchDetailPageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel2 = null;
        }
        intent.putExtra(NotificationCompat.CATEGORY_PROGRESS, String.valueOf(Duration.getInWholeMilliseconds-impl(togetherWatchDetailPageViewModel2.getPlayControlService().getCurrentProgress-UwyO8pc())));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel4 = togetherWatchDetailPageViewModel3;
        if (togetherWatchDetailPageViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel4 = null;
        }
        togetherWatchDetailPageViewModel4.getShareService().cancelShare();
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel5 = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel6 = togetherWatchDetailPageViewModel5;
        if (togetherWatchDetailPageViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel6 = null;
        }
        j cutoutHelper = togetherWatchDetailPageViewModel6.getScreenModeService().getCutoutHelper();
        cutoutHelper.g = null;
        cutoutHelper.h = null;
        super.onDestroy();
    }

    @Override // com.bilibili.module.main.innerpush.IPushContainer
    public final boolean onInterceptPushShow(@NotNull List<String> list, @Nullable PushBizParams pushBizParams) {
        return list.contains("pgc-video-detail-theater");
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(@Nullable Bundle bundle) {
        super.onPostCreate(bundle);
        removeShade();
        if (Build.VERSION.SDK_INT >= 26) {
            getWindow().setNavigationBarColor(ContextCompat.getColor(this, R$color.f64616Wh0));
        }
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
        if (togetherWatchDetailPageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel2 = null;
        }
        togetherWatchDetailPageViewModel2.getPlayControlService().resetSwitchState();
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel4 = togetherWatchDetailPageViewModel3;
        if (togetherWatchDetailPageViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel4 = null;
        }
        NewSeasonService.loadSeason$default(togetherWatchDetailPageViewModel4.getSeasonService(), (Consumer) null, 1, (Object) null);
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onResume() {
        super.onResume();
        ((HashMap) C9196c.f130327a).put("ogv", Boolean.TRUE);
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
        if (togetherWatchDetailPageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel2 = null;
        }
        j cutoutHelper = togetherWatchDetailPageViewModel2.getScreenModeService().getCutoutHelper();
        cutoutHelper.e();
        cutoutHelper.f();
        cutoutHelper.h();
        cutoutHelper.g();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
        if (togetherWatchDetailPageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel2 = null;
        }
        togetherWatchDetailPageViewModel2.getScreenStateService().setWindowHasFocus(z6);
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity
    public final boolean shouldTintBackground() {
        return false;
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity
    public final boolean shouldTintIcon() {
        return false;
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity
    public final boolean shouldTintTitle() {
        return false;
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity
    public final void showBackButton() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        getToolbar().setNavigationOnClickListener(new com.bilibili.biligame.cloudgame.v2.ui.dialog.m(this, 2));
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity
    public final void tintSystemBar() {
    }
}
