package com.bilibili.tgwt.player.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewSeasonService;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import com.bilibili.playerbizcommon.features.delegate.DelegateStoreService;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import com.bilibili.tgwt.service.ChatService;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.injection.InjectPlayerService;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.service.PlayerStateObserver;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/TogetherWatchPlayerPlayPauseWidget.class */
@StabilityInferred(parameters = 0)
public final class TogetherWatchPlayerPlayPauseWidget extends AppCompatImageView implements IControlWidget, View.OnClickListener, PlayerStateObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ChatService f111771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ChatRoomManagerService f111772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @InjectPlayerService
    private IPlayerCoreService f111773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public NewSeasonService f111774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @InjectPlayerService
    private IToastService f111775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @InjectPlayerService
    private DelegateStoreService f111776f;

    /* JADX INFO: renamed from: com.bilibili.tgwt.player.widget.TogetherWatchPlayerPlayPauseWidget$bindToView$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/TogetherWatchPlayerPlayPauseWidget$bindToView$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        Object result;
        final TogetherWatchPlayerPlayPauseWidget this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TogetherWatchPlayerPlayPauseWidget togetherWatchPlayerPlayPauseWidget, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = togetherWatchPlayerPlayPauseWidget;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.bindToView(this);
        }
    }

    @JvmOverloads
    public TogetherWatchPlayerPlayPauseWidget(@NotNull Context context) {
        this(context, null);
    }

    @JvmOverloads
    public TogetherWatchPlayerPlayPauseWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setContentDescription("bbplayer_play_pause_btn");
        setImageResource(2131232475);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object bindToView(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.player.widget.TogetherWatchPlayerPlayPauseWidget.bindToView(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        ChatRoomInfo chatRoomInfo;
        ChatService chatService = this.f111771a;
        ChatService chatService2 = chatService;
        if (chatService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatService");
            chatService2 = null;
        }
        chatService2.u(ChatService.GuestWatchMode.Free);
        IPlayerCoreService iPlayerCoreService = this.f111773c;
        IPlayerCoreService iPlayerCoreService2 = iPlayerCoreService;
        if (iPlayerCoreService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerCoreService");
            iPlayerCoreService2 = null;
        }
        if (iPlayerCoreService2.getState() == 4) {
            iPlayerCoreService2.pause();
            return;
        }
        ChatRoomManagerService chatRoomManagerService = this.f111772b;
        ChatRoomManagerService chatRoomManagerService2 = chatRoomManagerService;
        if (chatRoomManagerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatRoomManagerService");
            chatRoomManagerService2 = null;
        }
        if (chatRoomManagerService2.f110907U) {
            NewSeasonService newSeasonService = this.f111774d;
            NewSeasonService newSeasonService2 = newSeasonService;
            if (newSeasonService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("seasonService");
                newSeasonService2 = null;
            }
            BangumiUniformSeason season = newSeasonService2.getSeason();
            if (season == null || (chatRoomInfo = season.E) == null || chatRoomInfo.u() != 0) {
                IToastService iToastService = this.f111775e;
                if (iToastService == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("toastService");
                    iToastService = null;
                }
                pm.c.c(iToastService, getContext().getString(2131836304));
                return;
            }
        }
        iPlayerCoreService2.resume();
    }

    public final void onPlayerStateChanged(int i7) {
        if (i7 == 4) {
            setImageLevel(1);
        } else {
            setImageLevel(0);
        }
    }
}
