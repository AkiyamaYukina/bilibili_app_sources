package com.bilibili.tgwt.service;

import android.content.Context;
import androidx.activity.OnBackPressedCallback;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.logic.page.detail.service.refactor.ActivityContextParamsService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewSeasonService;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import com.bilibili.chatroomsdk.ChatRoomMember;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import hm.c;
import java.util.List;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/h.class */
public final class h extends OnBackPressedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChatService f111968a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ChatService chatService) {
        super(true);
        this.f111968a = chatService;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackPressed() {
        String string;
        String str;
        String string2;
        ChatRoomInfo chatRoomInfo;
        ChatRoomInfo chatRoomInfo2;
        final ChatService chatService = this.f111968a;
        String string3 = chatService.f111878a.getString(2131836265);
        String string4 = chatService.f111878a.getString(2131836253);
        String string5 = chatService.f111878a.getString(2131836299);
        ChatRoomManagerService chatRoomManagerService = chatService.h;
        List<ChatRoomMember> listJ = chatRoomManagerService.j();
        boolean z6 = (listJ != null ? listJ.size() : 0) <= 1 ? (chatService.f111867P / ((long) 60)) / ((long) 1000) >= 10 : ((System.currentTimeMillis() - chatService.f111866O) / ((long) 60)) / ((long) 1000) >= 10;
        if (chatService.f111872U) {
            string = chatService.f111878a.getString(2131836279);
            String string6 = z6 ? chatService.f111878a.getString(2131836275) : chatService.f111878a.getString(2131836276);
            string2 = chatService.f111878a.getString(2131836278);
            str = string6;
        } else {
            if (chatService.f111868Q) {
                List<ChatRoomMember> listJ2 = chatRoomManagerService.j();
                string3 = (listJ2 != null ? listJ2.size() : 0) >= 2 ? chatService.f111878a.getString(2131836357) : chatService.f111878a.getString(2131836264);
            }
            NewSeasonService newSeasonService = chatService.f111882c;
            BangumiUniformSeason season = newSeasonService.getSeason();
            String string7 = string3;
            if ((season == null || (chatRoomInfo2 = season.E) == null || chatRoomInfo2.u() != 1) ? false : true) {
                string7 = chatService.f111878a.getString(2131836264);
            }
            BangumiUniformSeason season2 = newSeasonService.getSeason();
            string = string7;
            str = string4;
            string2 = string5;
            if ((season2 == null || (chatRoomInfo = season2.E) == null || !chatRoomInfo.G()) ? false : true) {
                string = string7;
                str = string4;
                string2 = string5;
                if (chatService.f111868Q) {
                    string = chatService.f111878a.getString(2131836264);
                    string2 = string5;
                    str = string4;
                }
            }
        }
        c.a aVar = new c.a(chatService.f111878a);
        aVar.b = string;
        final boolean z7 = z6;
        aVar.b(str, new Function1(chatService, z7) { // from class: com.bilibili.tgwt.service.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChatService f111953a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f111954b;

            {
                this.f111953a = chatService;
                this.f111954b = z7;
            }

            public final Object invoke(Object obj) {
                Long roomId;
                ChatService chatService2 = this.f111953a;
                if (chatService2.f111872U) {
                    boolean z8 = this.f111954b;
                    ActivityContextParamsService activityContextParamsService = chatService2.f111886e;
                    if (z8 && (roomId = activityContextParamsService.getImmutable().getRoomId()) != null) {
                        long jLongValue = roomId.longValue();
                        RouteRequest.Builder builder = new RouteRequest.Builder("bilibili://pgc/theater/square");
                        Qj0.g.b(builder, "room_id", String.valueOf(jLongValue));
                        Qj0.g.b(builder, "other_mid", String.valueOf(chatService2.f111862K));
                        Qj0.g.b(builder, "from_spmid", "pgc.watch-together-cinema.cinema-player.0");
                        Qj0.g.b(builder, "page_name", "search-square");
                        Qj0.g.c(chatService2.f111878a, builder.build());
                    }
                    ChatVoiceRtcService chatVoiceRtcService = chatService2.f111889g;
                    if (chatVoiceRtcService.a()) {
                        Context context = chatService2.f111878a;
                        BLog.i("ChatVoiceRtcService-leaveChannelAndFinishPage", "[together-watch-ChatVoiceRtcService-leaveChannelAndFinishPage] leaveChannelAndFinishPage!!!");
                        if (chatVoiceRtcService.a()) {
                            BuildersKt.launch$default(chatVoiceRtcService.f111935d, (CoroutineContext) null, (CoroutineStart) null, new ChatVoiceRtcService$leaveChannelAndFinishPage$1(chatVoiceRtcService, context, null), 3, (Object) null);
                        }
                    } else {
                        ChatService.a(ContextUtilKt.requireActivity(chatService2.f111878a));
                    }
                    chatService2.h.f(activityContextParamsService.getImmutable().getRoomId());
                }
                return Unit.INSTANCE;
            }
        });
        aVar.c(string2, new XD0.l(chatService, 3));
        aVar.a().show();
    }
}
