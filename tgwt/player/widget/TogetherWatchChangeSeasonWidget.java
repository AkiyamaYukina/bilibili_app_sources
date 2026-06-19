package com.bilibili.tgwt.player.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewSeasonService;
import com.bilibili.bangumi.module.chatroom.ChatConfigType;
import com.bilibili.bangumi.module.chatroom.ChatRoomConfig;
import com.bilibili.bangumi.module.chatroom.ChatRoomConfigValue;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.playerbizcommon.features.delegate.DelegateStoreService;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import com.bilibili.tgwt.service.TogetherWatchToolbarService;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.injection.InjectPlayerService;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/TogetherWatchChangeSeasonWidget.class */
@StabilityInferred(parameters = 0)
public final class TogetherWatchChangeSeasonWidget extends AppCompatTextView implements IControlWidget, View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NewSeasonService f111755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ChatRoomManagerService f111756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TogetherWatchToolbarService f111757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @InjectPlayerService
    private DelegateStoreService f111758d;

    public TogetherWatchChangeSeasonWidget(@NotNull Context context) {
        super(context);
        J();
    }

    public TogetherWatchChangeSeasonWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        J();
    }

    public final void J() {
        setOnClickListener(this);
        setBackground(AppCompatResources.getDrawable(getContext(), 2131240723));
        setText(getContext().getResources().getText(2131836256));
    }

    @Nullable
    public final Object bindToView(@NotNull Continuation<? super Unit> continuation) {
        ChatRoomInfo chatRoomInfo;
        ChatRoomInfo chatRoomInfo2;
        ChatRoomConfig chatRoomConfigS;
        ChatRoomConfigValue chatRoomConfigValueA;
        DelegateStoreService delegateStoreService = this.f111758d;
        DelegateStoreService delegateStoreService2 = delegateStoreService;
        if (delegateStoreService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegateStoreService");
            delegateStoreService2 = null;
        }
        this.f111757c = (TogetherWatchToolbarService) dm.d.b(delegateStoreService2, TogetherWatchToolbarService.class);
        DelegateStoreService delegateStoreService3 = this.f111758d;
        DelegateStoreService delegateStoreService4 = delegateStoreService3;
        if (delegateStoreService3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegateStoreService");
            delegateStoreService4 = null;
        }
        this.f111755a = (NewSeasonService) dm.d.b(delegateStoreService4, NewSeasonService.class);
        DelegateStoreService delegateStoreService5 = this.f111758d;
        DelegateStoreService delegateStoreService6 = delegateStoreService5;
        if (delegateStoreService5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegateStoreService");
            delegateStoreService6 = null;
        }
        this.f111756b = (ChatRoomManagerService) dm.d.b(delegateStoreService6, ChatRoomManagerService.class);
        NewSeasonService newSeasonService = this.f111755a;
        NewSeasonService newSeasonService2 = newSeasonService;
        if (newSeasonService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("seasonService");
            newSeasonService2 = null;
        }
        BangumiUniformSeason season = newSeasonService2.getSeason();
        setVisibility(((season == null || (chatRoomInfo2 = season.E) == null || (chatRoomConfigS = chatRoomInfo2.s()) == null || (chatRoomConfigValueA = chatRoomConfigS.a()) == null) ? null : chatRoomConfigValueA.a()) == ChatConfigType.UNAVAILABLE_AND_INVISIBLE ? 8 : 0);
        ChatRoomManagerService chatRoomManagerService = this.f111756b;
        ChatRoomManagerService chatRoomManagerService2 = chatRoomManagerService;
        if (chatRoomManagerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatRoomManagerService");
            chatRoomManagerService2 = null;
        }
        if (!chatRoomManagerService2.f110887A) {
            NewSeasonService newSeasonService3 = this.f111755a;
            NewSeasonService newSeasonService4 = newSeasonService3;
            if (newSeasonService3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("seasonService");
                newSeasonService4 = null;
            }
            BangumiUniformSeason season2 = newSeasonService4.getSeason();
            Neurons.reportExposure$default(false, "pgc.watch-together-player.player-top-bar.switch.show", MapsKt.mapOf(TuplesKt.to("room_type", (season2 == null || (chatRoomInfo = season2.E) == null) ? null : String.valueOf(chatRoomInfo.u()))), (List) null, 8, (Object) null);
            ChatRoomManagerService chatRoomManagerService3 = this.f111756b;
            if (chatRoomManagerService3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chatRoomManagerService");
                chatRoomManagerService3 = null;
            }
            chatRoomManagerService3.f110887A = true;
        }
        return Unit.INSTANCE;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        TogetherWatchToolbarService togetherWatchToolbarService = this.f111757c;
        TogetherWatchToolbarService togetherWatchToolbarService2 = togetherWatchToolbarService;
        if (togetherWatchToolbarService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbarService");
            togetherWatchToolbarService2 = null;
        }
        togetherWatchToolbarService2.onFilmChangeEvent(getContext(), "pgc.watch-together-player.player-top-bar.switch.click");
    }
}
