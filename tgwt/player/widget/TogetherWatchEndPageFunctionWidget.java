package com.bilibili.tgwt.player.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bangumi.logic.page.detail.datawrapper.ContinuingType;
import com.bilibili.bangumi.logic.page.detail.service.BangumiPreloadPlayHandlerService;
import com.bilibili.bangumi.logic.page.detail.service.PlayControlService;
import com.bilibili.bangumi.player.commonplayer.functionwidget.PGCFunctionWidget;
import com.bilibili.playerbizcommon.features.delegate.DelegateStoreService;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.ControlContainerType;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.injection.InjectPlayerService;
import tv.danmaku.biliplayerv2.service.ControlContainerObserver;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/TogetherWatchEndPageFunctionWidget.class */
@StabilityInferred(parameters = 0)
public final class TogetherWatchEndPageFunctionWidget extends PGCFunctionWidget implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinearLayout f111759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f111760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @InjectPlayerService
    private IPlayerCoreService f111761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @InjectPlayerService
    private IControlContainerService f111762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @InjectPlayerService
    private DelegateStoreService f111763g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final a f111764i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/TogetherWatchEndPageFunctionWidget$a.class */
    public static final class a implements ControlContainerObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TogetherWatchEndPageFunctionWidget f111765a;

        public a(TogetherWatchEndPageFunctionWidget togetherWatchEndPageFunctionWidget) {
            this.f111765a = togetherWatchEndPageFunctionWidget;
        }

        public final void onControlContainerChanged(ControlContainerType controlContainerType, ScreenModeType screenModeType) {
            this.f111765a.h();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/TogetherWatchEndPageFunctionWidget$b.class */
    public static final class b<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TogetherWatchEndPageFunctionWidget f111766a;

        public b(TogetherWatchEndPageFunctionWidget togetherWatchEndPageFunctionWidget) {
            this.f111766a = togetherWatchEndPageFunctionWidget;
        }

        public final Object emit(Object obj, Continuation continuation) {
            boolean z6 = ((com.bilibili.tgwt.chatroom.c) obj).f110974c == com.bilibili.ogv.infra.account.a.f67852b.mid();
            TogetherWatchEndPageFunctionWidget togetherWatchEndPageFunctionWidget = this.f111766a;
            if (z6 != togetherWatchEndPageFunctionWidget.h) {
                togetherWatchEndPageFunctionWidget.h = z6;
                togetherWatchEndPageFunctionWidget.i();
            }
            return Unit.INSTANCE;
        }
    }

    public TogetherWatchEndPageFunctionWidget(@NotNull Context context) {
        super(context);
        this.f111764i = new a(this);
    }

    public final void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
        ((PGCFunctionWidget) this).a = playerContainer;
        IControlContainerService iControlContainerService = this.f111762f;
        IControlContainerService iControlContainerService2 = iControlContainerService;
        if (iControlContainerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
            iControlContainerService2 = null;
        }
        iControlContainerService2.registerState(this.f111764i);
    }

    @NotNull
    public final View createContentView(@NotNull Context context) {
        View viewInflate = LayoutInflater.from(getMContext()).inflate(2131500532, (ViewGroup) null);
        this.f111759c = (LinearLayout) viewInflate.findViewById(2131296853);
        this.f111760d = (TextView) viewInflate.findViewById(2131310130);
        LinearLayout linearLayout = this.f111759c;
        LinearLayout linearLayout2 = linearLayout;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBackLL");
            linearLayout2 = null;
        }
        linearLayout2.setOnClickListener(this);
        TextView textView = this.f111760d;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mReplayTV");
            textView = null;
        }
        textView.setOnClickListener(this);
        return viewInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.tgwt.player.widget.TogetherWatchEndPageFunctionWidget$repeatOnWidgetShow$1
            if (r0 == 0) goto L25
            r0 = r6
            com.bilibili.tgwt.player.widget.TogetherWatchEndPageFunctionWidget$repeatOnWidgetShow$1 r0 = (com.bilibili.tgwt.player.widget.TogetherWatchEndPageFunctionWidget$repeatOnWidgetShow$1) r0
            r8 = r0
            r0 = r8
            int r0 = r0.label
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L25
            r0 = r8
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r8
            r6 = r0
            goto L2f
        L25:
            com.bilibili.tgwt.player.widget.TogetherWatchEndPageFunctionWidget$repeatOnWidgetShow$1 r0 = new com.bilibili.tgwt.player.widget.TogetherWatchEndPageFunctionWidget$repeatOnWidgetShow$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r6 = r0
        L2f:
            r0 = r6
            java.lang.Object r0 = r0.result
            r8 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r6
            int r0 = r0.label
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L58
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L4e
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            goto La1
        L4e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L58:
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            com.bilibili.playerbizcommon.features.delegate.DelegateStoreService r0 = r0.f111763g
            r9 = r0
            r0 = r9
            r8 = r0
            r0 = r9
            if (r0 != 0) goto L71
            java.lang.String r0 = "delegateStoreService"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
            r8 = r0
        L71:
            r0 = r8
            java.lang.Class<com.bilibili.tgwt.chatroom.ChatRoomManagerService> r1 = com.bilibili.tgwt.chatroom.ChatRoomManagerService.class
            java.lang.Object r0 = dm.d.b(r0, r1)
            com.bilibili.tgwt.chatroom.ChatRoomManagerService r0 = (com.bilibili.tgwt.chatroom.ChatRoomManagerService) r0
            kotlinx.coroutines.flow.MutableStateFlow<com.bilibili.tgwt.chatroom.c> r0 = r0.f110924q
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.filterNotNull(r0)
            r9 = r0
            com.bilibili.tgwt.player.widget.TogetherWatchEndPageFunctionWidget$b r0 = new com.bilibili.tgwt.player.widget.TogetherWatchEndPageFunctionWidget$b
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r8 = r0
            r0 = r6
            r1 = 1
            r0.label = r1
            r0 = r9
            r1 = r8
            r2 = r6
            java.lang.Object r0 = r0.collect(r1, r2)
            r1 = r10
            if (r0 != r1) goto La1
            r0 = r10
            return r0
        La1:
            r0 = r5
            r0.i()
            r0 = r5
            r0.h()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.player.widget.TogetherWatchEndPageFunctionWidget.g(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public final tv.danmaku.biliplayerv2.service.f getFunctionInsetConfig() {
        return new tv.danmaku.biliplayerv2.service.f(0, 30);
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        FunctionWidgetConfig.Builder builderA = ue.b.a(false, false, true, false, false);
        builderA.changeOrientationDisableWhenShow(false);
        return builderA.build();
    }

    @NotNull
    public final String getTag() {
        return "OGVTogetherWatchEndPageFunctionWidget";
    }

    public final void h() {
        IControlContainerService iControlContainerService = this.f111762f;
        IControlContainerService iControlContainerService2 = iControlContainerService;
        if (iControlContainerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
            iControlContainerService2 = null;
        }
        if (iControlContainerService2.getScreenModeType() == ScreenModeType.THUMB) {
            LinearLayout linearLayout = this.f111759c;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBackLL");
                linearLayout = null;
            }
            linearLayout.setVisibility(8);
            return;
        }
        LinearLayout linearLayout2 = this.f111759c;
        if (linearLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBackLL");
            linearLayout2 = null;
        }
        linearLayout2.setVisibility(0);
    }

    public final void i() {
        TextView textView = null;
        if (this.h) {
            TextView textView2 = this.f111760d;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mReplayTV");
                textView2 = null;
            }
            textView2.setVisibility(0);
            return;
        }
        TextView textView3 = this.f111760d;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mReplayTV");
        } else {
            textView = textView3;
        }
        textView.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        if (view.getId() == 2131296853) {
            ((ComponentActivity) ContextUtilKt.requireTypedActivity(view.getContext(), ComponentActivity.class)).getOnBackPressedDispatcher().onBackPressed();
            return;
        }
        if (view.getId() == 2131310130) {
            DelegateStoreService delegateStoreService = this.f111763g;
            DelegateStoreService delegateStoreService2 = delegateStoreService;
            if (delegateStoreService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("delegateStoreService");
                delegateStoreService2 = null;
            }
            ((BangumiPreloadPlayHandlerService) dm.d.b(delegateStoreService2, BangumiPreloadPlayHandlerService.class)).setAutoPlay(true);
            IPlayerCoreService iPlayerCoreService = this.f111761e;
            IPlayerCoreService iPlayerCoreService2 = iPlayerCoreService;
            if (iPlayerCoreService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("playerCoreService");
                iPlayerCoreService2 = null;
            }
            iPlayerCoreService2.seekTo(0);
            DelegateStoreService delegateStoreService3 = this.f111763g;
            DelegateStoreService delegateStoreService4 = delegateStoreService3;
            if (delegateStoreService3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("delegateStoreService");
                delegateStoreService4 = null;
            }
            PlayControlService.replayCurrentEpisodeBySeek$default((PlayControlService) dm.d.b(delegateStoreService4, PlayControlService.class), (ContinuingType) null, 1, (Object) null);
        }
    }

    public final void onRelease() {
        IControlContainerService iControlContainerService = this.f111762f;
        IControlContainerService iControlContainerService2 = iControlContainerService;
        if (iControlContainerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
            iControlContainerService2 = null;
        }
        iControlContainerService2.unregisterState(this.f111764i);
    }
}
