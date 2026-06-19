package com.bilibili.tgwt.service;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.logic.page.detail.service.BangumiPlayerContainerService;
import com.bilibili.bangumi.logic.page.detail.service.ScreenStateService;
import com.bilibili.bangumi.logic.page.detail.service.ToolbarService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.ActivityContextParamsService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewSeasonService;
import com.bilibili.bangumi.module.chatroom.ChatConfigType;
import com.bilibili.bangumi.module.chatroom.ChatRoomConfig;
import com.bilibili.bangumi.module.chatroom.ChatRoomConfigValue;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/TogetherWatchToolbarService.class */
@StabilityInferred(parameters = 0)
public final class TogetherWatchToolbarService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ToolbarService f111944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final NewSeasonService f111945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ScreenStateService f111946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ChatRoomManagerService f111947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ActivityContextParamsService f111948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final BangumiPlayerContainerService f111949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f111950g;

    @NotNull
    public final BiliAccounts h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Kl.a f111951i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f111952j;

    /* JADX INFO: renamed from: com.bilibili.tgwt.service.TogetherWatchToolbarService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/TogetherWatchToolbarService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<com.bilibili.tgwt.chatroom.c, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final TogetherWatchToolbarService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TogetherWatchToolbarService togetherWatchToolbarService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = togetherWatchToolbarService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invoke(com.bilibili.tgwt.chatroom.c cVar, Continuation<? super Unit> continuation) {
            return create(cVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 307
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.service.TogetherWatchToolbarService.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public TogetherWatchToolbarService(@NotNull ToolbarService toolbarService, @NotNull NewSeasonService newSeasonService, @NotNull ScreenStateService screenStateService, @NotNull ChatRoomManagerService chatRoomManagerService, @NotNull ActivityContextParamsService activityContextParamsService, @NotNull BangumiPlayerContainerService bangumiPlayerContainerService, @NotNull CoroutineScope coroutineScope, @NotNull BiliAccounts biliAccounts, @NotNull Kl.a aVar) {
        this.f111944a = toolbarService;
        this.f111945b = newSeasonService;
        this.f111946c = screenStateService;
        this.f111947d = chatRoomManagerService;
        this.f111948e = activityContextParamsService;
        this.f111949f = bangumiPlayerContainerService;
        this.f111950g = coroutineScope;
        this.h = biliAccounts;
        this.f111951i = aVar;
        toolbarService.getToolbarVm().c = new Hs.g(this, 3);
        FlowKt.launchIn(FlowKt.onEach(FlowKt.filterNotNull(chatRoomManagerService.f110924q), new AnonymousClass2(this, null)), coroutineScope);
    }

    public final void onFilmChangeEvent(@NotNull Context context, @NotNull String str) {
        ChatRoomInfo chatRoomInfo;
        ChatRoomConfig chatRoomConfigS;
        NewSeasonService newSeasonService = this.f111945b;
        BangumiUniformSeason season = newSeasonService.getSeason();
        ChatRoomConfigValue chatRoomConfigValueA = (season == null || (chatRoomInfo = season.E) == null || (chatRoomConfigS = chatRoomInfo.s()) == null) ? null : chatRoomConfigS.a();
        if ((chatRoomConfigValueA != null ? chatRoomConfigValueA.a() : null) == ChatConfigType.UNAVAILABLE_AND_VISIBLE) {
            String strB = chatRoomConfigValueA.b();
            String str2 = strB;
            if (strB == null) {
                str2 = "";
            }
            Kl.a.b(this.f111951i, str2);
            return;
        }
        this.f111947d.f110929v.setValue(Boolean.TRUE);
        this.f111949f.setBackgroundState();
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        BangumiUniformSeason season2 = newSeasonService.getSeason();
        Integer numValueOf = null;
        if (season2 != null) {
            ChatRoomInfo chatRoomInfo2 = season2.E;
            numValueOf = null;
            if (chatRoomInfo2 != null) {
                numValueOf = Integer.valueOf(chatRoomInfo2.u());
            }
        }
        mapCreateMapBuilder.put("room_type", String.valueOf(numValueOf));
        Unit unit = Unit.INSTANCE;
        Neurons.reportClick(false, str, MapsKt.build(mapCreateMapBuilder));
        this.f111946c.getScreenStateHelper().i();
        RouteRequest.Builder builderRequestCode = new RouteRequest.Builder("bilibili://pgc/theater/choose").requestCode(18);
        Qj0.g.b(builderRequestCode, "type", "3");
        Qj0.g.c(context, builderRequestCode.build());
    }
}
