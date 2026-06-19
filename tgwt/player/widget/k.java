package com.bilibili.tgwt.player.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.logic.page.detail.service.BangumiPlayerContainerService;
import com.bilibili.bangumi.logic.page.detail.service.ScreenStateService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewSeasonService;
import com.bilibili.bangumi.module.chatroom.ChatConfigType;
import com.bilibili.bangumi.module.chatroom.ChatRoomConfig;
import com.bilibili.bangumi.module.chatroom.ChatRoomConfigValue;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.playerbizcommon.features.delegate.DelegateStoreService;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.injection.InjectPlayerService;
import tv.danmaku.biliplayerv2.panel.IPlayerLayer;
import tv.danmaku.biliplayerv2.service.B;
import tv.danmaku.biliplayerv2.service.WindowInset;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/k.class */
@StabilityInferred(parameters = 0)
public final class k implements IPlayerLayer<View>, B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ViewGroup f111834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @InjectPlayerService
    private DelegateStoreService f111835b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/k$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f111836a;

        static {
            int[] iArr = new int[ChatConfigType.values().length];
            try {
                iArr[ChatConfigType.UNAVAILABLE_AND_VISIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            f111836a = iArr;
        }
    }

    public k(@NotNull final Context context, @NotNull final NewSeasonService newSeasonService, @NotNull final ScreenStateService screenStateService, @NotNull final BangumiPlayerContainerService bangumiPlayerContainerService) {
        ChatRoomInfo chatRoomInfo;
        ChatRoomConfig chatRoomConfigS;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f111834a = frameLayout;
        LayoutInflater.from(context).inflate(2131500530, (ViewGroup) frameLayout, true);
        BangumiUniformSeason season = newSeasonService.getSeason();
        ChatConfigType chatConfigType = null;
        ChatRoomConfigValue chatRoomConfigValueA = (season == null || (chatRoomInfo = season.E) == null || (chatRoomConfigS = chatRoomInfo.s()) == null) ? null : chatRoomConfigS.a();
        View viewFindViewById = frameLayout.findViewById(2131298588);
        viewFindViewById.setVisibility((chatRoomConfigValueA != null ? chatRoomConfigValueA.a() : chatConfigType) == ChatConfigType.UNAVAILABLE_AND_INVISIBLE ? 8 : 0);
        final ChatRoomConfigValue chatRoomConfigValue = chatRoomConfigValueA;
        viewFindViewById.setOnClickListener(new View.OnClickListener(chatRoomConfigValue, context, newSeasonService, this, bangumiPlayerContainerService, screenStateService) { // from class: com.bilibili.tgwt.player.widget.j

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChatRoomConfigValue f111828a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Context f111829b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final NewSeasonService f111830c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final k f111831d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final BangumiPlayerContainerService f111832e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final ScreenStateService f111833f;

            {
                this.f111828a = chatRoomConfigValue;
                this.f111829b = context;
                this.f111830c = newSeasonService;
                this.f111831d = this;
                this.f111832e = bangumiPlayerContainerService;
                this.f111833f = screenStateService;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k.a(this.f111828a, this.f111829b, this.f111830c, this.f111831d, this.f111832e, this.f111833f);
            }
        });
    }

    public static void a(ChatRoomConfigValue chatRoomConfigValue, Context context, NewSeasonService newSeasonService, k kVar, BangumiPlayerContainerService bangumiPlayerContainerService, ScreenStateService screenStateService) {
        ChatRoomInfo chatRoomInfo;
        ChatConfigType chatConfigTypeA = chatRoomConfigValue != null ? chatRoomConfigValue.a() : null;
        if ((chatConfigTypeA == null ? -1 : a.f111836a[chatConfigTypeA.ordinal()]) == 1) {
            String strB = chatRoomConfigValue.b();
            String str = strB;
            if (strB == null) {
                str = "";
            }
            ToastHelper.showToastShort(context, str);
            return;
        }
        BangumiUniformSeason season = newSeasonService.getSeason();
        Neurons.reportClick(false, "pgc.watch-together-player.player-top-bar.switch.click", MapsKt.mapOf(TuplesKt.to("room_type", String.valueOf((season == null || (chatRoomInfo = season.E) == null) ? 0 : chatRoomInfo.u()))));
        DelegateStoreService delegateStoreService = kVar.f111835b;
        if (delegateStoreService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegateStoreService");
            delegateStoreService = null;
        }
        ((BangumiPlayerContainerService) dm.d.b(delegateStoreService, BangumiPlayerContainerService.class)).setBackgroundState();
        if (bangumiPlayerContainerService.getPlayerServiceController().m() != ScreenModeType.LANDSCAPE_FULLSCREEN) {
            RouteRequest.Builder builderRequestCode = new RouteRequest.Builder("bilibili://pgc/theater/choose").requestCode(18);
            Qj0.g.b(builderRequestCode, "type", "3");
            Qj0.g.c(context, builderRequestCode.build());
        } else {
            screenStateService.getScreenStateHelper().h();
            RouteRequest.Builder builderRequestCode2 = new RouteRequest.Builder("bilibili://pgc/theater/choose").requestCode(18);
            Qj0.g.b(builderRequestCode2, "type", "3");
            Qj0.g.c(context, builderRequestCode2.build());
        }
    }

    @NotNull
    public final View getView() {
        return this.f111834a;
    }

    public final void onWindowInsetChanged(@NotNull WindowInset windowInset) {
        this.f111834a.setPadding(windowInset.getLeftPadding(), windowInset.getTopPadding(), windowInset.getRightPadding(), windowInset.getBottomPadding());
    }
}
