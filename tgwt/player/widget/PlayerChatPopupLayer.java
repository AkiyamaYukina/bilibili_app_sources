package com.bilibili.tgwt.player.widget;

import Ky0.RunnableC2469k;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ViewSwitcher;
import androidx.compose.runtime.internal.StabilityInferred;
import cj0.C5263a;
import com.bilibili.ad.core.click.K;
import com.bilibili.bangumi.logic.page.detail.service.BangumiPlayerContainerService;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import com.bilibili.tgwt.service.ChatService;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.panel.IPlayerLayer;
import tv.danmaku.biliplayerv2.service.B;
import tv.danmaku.biliplayerv2.service.ControlContainerVisibleObserver;
import tv.danmaku.biliplayerv2.service.WindowInset;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/PlayerChatPopupLayer.class */
@StabilityInferred(parameters = 0)
public final class PlayerChatPopupLayer extends FrameLayout implements IPlayerLayer<View>, B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BangumiPlayerContainerService f111743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ChatService f111744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ChatRoomManagerService f111745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ViewSwitcher f111746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f111747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public ValueAnimator f111748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f111749g;

    @NotNull
    public final a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final XD.g f111750i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final RunnableC2469k f111751j;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/PlayerChatPopupLayer$a.class */
    public static final class a implements ControlContainerVisibleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerChatPopupLayer f111752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f111753b;

        public a(PlayerChatPopupLayer playerChatPopupLayer, Context context) {
            this.f111752a = playerChatPopupLayer;
            this.f111753b = context;
        }

        public final void onControlContainerVisibleChanged(boolean z6) {
            ValueAnimator valueAnimatorOfInt;
            ValueAnimator duration;
            ValueAnimator valueAnimator;
            PlayerChatPopupLayer playerChatPopupLayer = this.f111752a;
            ValueAnimator valueAnimator2 = playerChatPopupLayer.f111748f;
            if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = playerChatPopupLayer.f111748f) != null) {
                valueAnimator.cancel();
            }
            ViewSwitcher viewSwitcher = null;
            playerChatPopupLayer.f111748f = null;
            if (z6) {
                ViewSwitcher viewSwitcher2 = playerChatPopupLayer.f111746d;
                if (viewSwitcher2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mMsgContainer");
                } else {
                    viewSwitcher = viewSwitcher2;
                }
                valueAnimatorOfInt = ValueAnimator.ofInt(((ViewGroup.MarginLayoutParams) viewSwitcher.getLayoutParams()).bottomMargin, playerChatPopupLayer.f111749g);
            } else {
                ViewSwitcher viewSwitcher3 = playerChatPopupLayer.f111746d;
                if (viewSwitcher3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mMsgContainer");
                    viewSwitcher3 = null;
                }
                valueAnimatorOfInt = ValueAnimator.ofInt(((ViewGroup.MarginLayoutParams) viewSwitcher3.getLayoutParams()).bottomMargin, Uj0.c.b(8, this.f111753b));
            }
            playerChatPopupLayer.f111748f = valueAnimatorOfInt;
            if (valueAnimatorOfInt != null) {
                valueAnimatorOfInt.addUpdateListener(new C5263a(playerChatPopupLayer));
            }
            ValueAnimator valueAnimator3 = playerChatPopupLayer.f111748f;
            if (valueAnimator3 == null || (duration = valueAnimator3.setDuration(150L)) == null) {
                return;
            }
            duration.start();
        }
    }

    @Inject
    public PlayerChatPopupLayer(@NotNull Context context, @NotNull BangumiPlayerContainerService bangumiPlayerContainerService, @NotNull ChatService chatService, @NotNull ChatRoomManagerService chatRoomManagerService) {
        ViewSwitcher viewSwitcher;
        ViewSwitcher viewSwitcher2;
        super(context);
        this.f111743a = bangumiPlayerContainerService;
        this.f111744b = chatService;
        this.f111745c = chatRoomManagerService;
        this.f111747e = K.a((Job) null, 1, (Object) null, Dispatchers.getMain().getImmediate());
        ViewSwitcher.ViewFactory viewFactory = new ViewSwitcher.ViewFactory(this) { // from class: com.bilibili.tgwt.player.widget.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlayerChatPopupLayer f111823a;

            {
                this.f111823a = this;
            }

            @Override // android.widget.ViewSwitcher.ViewFactory
            public final View makeView() {
                PlayerChatPopupLayer playerChatPopupLayer = this.f111823a;
                ViewSwitcher viewSwitcher3 = playerChatPopupLayer.f111746d;
                ViewSwitcher viewSwitcher4 = viewSwitcher3;
                if (viewSwitcher3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mMsgContainer");
                    viewSwitcher4 = null;
                }
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewSwitcher4.getContext());
                ViewSwitcher viewSwitcher5 = playerChatPopupLayer.f111746d;
                if (viewSwitcher5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mMsgContainer");
                    viewSwitcher5 = null;
                }
                return layoutInflaterFrom.inflate(2131500518, (ViewGroup) viewSwitcher5, false);
            }
        };
        this.h = new a(this, context);
        this.f111750i = new XD.g(this, 2);
        this.f111751j = new RunnableC2469k(this, 2);
        View viewInflate = LayoutInflater.from(context).inflate(2131500517, (ViewGroup) this, false);
        ViewSwitcher viewSwitcher3 = (ViewSwitcher) viewInflate.findViewById(2131298711);
        this.f111746d = viewSwitcher3;
        if (viewSwitcher3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMsgContainer");
            viewSwitcher = null;
        } else {
            viewSwitcher = viewSwitcher3;
        }
        viewSwitcher.setFactory(viewFactory);
        if (viewSwitcher3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMsgContainer");
            viewSwitcher2 = null;
        } else {
            viewSwitcher2 = viewSwitcher3;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(300L);
        viewSwitcher2.setInAnimation(translateAnimation);
        if (viewSwitcher3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMsgContainer");
            viewSwitcher3 = null;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        viewSwitcher3.setOutAnimation(alphaAnimation);
        addView(viewInflate);
    }

    public final void a() {
        ViewSwitcher viewSwitcher = this.f111746d;
        ViewSwitcher viewSwitcher2 = viewSwitcher;
        if (viewSwitcher == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMsgContainer");
            viewSwitcher2 = null;
        }
        viewSwitcher2.reset();
        FlowKt.launchIn(FlowKt.onEach(this.f111745c.f110926s, new PlayerChatPopupLayer$onAddView$1(this, null)), this.f111747e);
        FlowKt.launchIn(FlowKt.onEach(FlowKt.filterNotNull(this.f111745c.f110924q), new PlayerChatPopupLayer$onAddView$2(this, null)), this.f111747e);
        this.f111743a.getPlayerServiceController().c().registerControlContainerVisible(this.h);
        if (this.f111743a.getPlayerServiceController().p()) {
            ViewSwitcher viewSwitcher3 = this.f111746d;
            ViewSwitcher viewSwitcher4 = viewSwitcher3;
            if (viewSwitcher3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMsgContainer");
                viewSwitcher4 = null;
            }
            ((ViewGroup.MarginLayoutParams) viewSwitcher4.getLayoutParams()).bottomMargin = this.f111749g;
        } else {
            ViewSwitcher viewSwitcher5 = this.f111746d;
            ViewSwitcher viewSwitcher6 = viewSwitcher5;
            if (viewSwitcher5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMsgContainer");
                viewSwitcher6 = null;
            }
            ((ViewGroup.MarginLayoutParams) viewSwitcher6.getLayoutParams()).bottomMargin = Uj0.c.b(8, getContext());
        }
        ViewSwitcher viewSwitcher7 = this.f111746d;
        if (viewSwitcher7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMsgContainer");
            viewSwitcher7 = null;
        }
        viewSwitcher7.requestLayout();
    }

    public final void b() {
        this.f111743a.getPlayerServiceController().c().unregisterControlContainerVisible(this.h);
        ViewSwitcher viewSwitcher = null;
        JobKt.cancelChildren$default(this.f111747e.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
        ViewSwitcher viewSwitcher2 = this.f111746d;
        if (viewSwitcher2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMsgContainer");
        } else {
            viewSwitcher = viewSwitcher2;
        }
        viewSwitcher.removeCallbacks(this.f111751j);
    }

    @NotNull
    public View getView() {
        return this;
    }

    public final void onWindowInsetChanged(@NotNull WindowInset windowInset) {
        setPadding(windowInset.getLeftPadding(), windowInset.getTopPadding(), windowInset.getRightPadding(), windowInset.getBottomPadding());
    }
}
