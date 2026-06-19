package com.bilibili.tgwt.service;

import android.net.Uri;
import com.bilibili.api.BiliApiException;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformEpisode;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.logic.page.detail.service.refactor.LegacyPagePopService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewSeasonService;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import com.bilibili.chatroom.widget.userDialog.ChatUserFollowStatus;
import com.bilibili.chatroom.widget.userDialog.ChatUserInfo;
import com.bilibili.chatroom.widget.userDialog.ChatUserInfoDialog;
import com.bilibili.chatroom.widget.userDialog.g;
import com.bilibili.chatroomsdk.ChatRoomMember;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.tgwt.api.ChatRoomOperationService;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$openChatUserInfoDialog$1$1.class */
public final class ChatService$openChatUserInfoDialog$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $roomId;
    final com.bilibili.tgwt.chatroom.c $roomInfo;
    final int $roomMode;
    final ChatRoomMember $user;
    int label;
    final ChatService this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$openChatUserInfoDialog$1$1$a.class */
    public static final class a implements com.bilibili.chatroom.widget.userDialog.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatService f111922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ChatRoomMember f111923b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f111924c;

        public a(ChatService chatService, ChatRoomMember chatRoomMember, long j7) {
            this.f111922a = chatService;
            this.f111923b = chatRoomMember;
            this.f111924c = j7;
        }

        public final Flow<ChatUserFollowStatus> a() {
            return this.f111922a.f111890i.c;
        }

        public final void b() {
            ChatRoomInfo chatRoomInfo;
            ChatService chatService = this.f111922a;
            boolean z6 = chatService.f111872U;
            ChatRoomMember chatRoomMember = this.f111923b;
            if (!z6) {
                chatService.h(this.f111924c, chatRoomMember.getMid(), false);
                return;
            }
            long mid = chatRoomMember.getMid();
            Neurons.reportClick(false, "pgc.watch-together-cinema-voice.information.report.click", chatService.f111870S);
            NewSeasonService newSeasonService = chatService.f111882c;
            BangumiUniformSeason season = newSeasonService.getSeason();
            long jA = 0;
            long jT = (season == null || (chatRoomInfo = season.E) == null) ? 0L : chatRoomInfo.t();
            long seasonId = newSeasonService.getSeasonId();
            BangumiUniformEpisode currentPlayedEpisode = chatService.f111888f.getCurrentPlayedEpisode();
            if (currentPlayedEpisode != null) {
                jA = currentPlayedEpisode.a();
            }
            LegacyPagePopService.showLayer$default(chatService.f111880b, chatService.f111878a, LegacyPagePopService.adjustUrl$default(chatService.f111880b, Uri.parse("https://m.bilibili.com/bangumi/report/people?from=biunique").buildUpon().appendQueryParameter("room_id", String.valueOf(jT)).appendQueryParameter("report_mid", String.valueOf(mid)).appendQueryParameter("season_id", String.valueOf(seasonId)).appendQueryParameter("ep_id", String.valueOf(jA)).build().toString(), false, false, (String) null, 12, (Object) null), (String) null, 0, 12, (Object) null);
        }

        public final void c() {
            ChatService chatService = this.f111922a;
            boolean z6 = chatService.f111872U;
            ChatRoomMember chatRoomMember = this.f111923b;
            if (z6) {
                chatService.h(this.f111924c, chatRoomMember.getMid(), true);
                return;
            }
            long mid = chatRoomMember.getMid();
            String nickname = chatRoomMember.getNickname();
            String str = nickname;
            if (nickname == null) {
                str = "";
            }
            chatService.h.f110888B.setValue(new Pair(Long.valueOf(mid), str));
        }

        public final void d(Map<String, String> map) {
            Neurons.reportExposure$default(false, this.f111922a.f111872U ? "pgc.watch-together-cinema-voice.information.0.show" : "pgc.watch-together-cinema.information.0.show", map, (List) null, 8, (Object) null);
        }

        public final void e(ChatUserFollowStatus chatUserFollowStatus) {
            this.f111922a.f111890i.c.setValue(chatUserFollowStatus);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$openChatUserInfoDialog$1$1$b.class */
    public static final class b implements com.bilibili.chatroom.widget.userDialog.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatService f111925a;

        public b(ChatService chatService) {
            this.f111925a = chatService;
        }

        public final void a(long j7) {
            ChatRoomManagerService chatRoomManagerService = this.f111925a.h;
            Kl.a.b(chatRoomManagerService.h, "取消屏蔽成功");
            chatRoomManagerService.f110921n.remove(Long.valueOf(j7));
        }

        public final void b(long j7) {
            ChatRoomManagerService chatRoomManagerService = this.f111925a.h;
            Kl.a.b(chatRoomManagerService.h, "屏蔽成功");
            chatRoomManagerService.f110921n.add(Long.valueOf(j7));
        }

        public final boolean c(long j7) {
            return this.f111925a.h.f110921n.contains(Long.valueOf(j7));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatService$openChatUserInfoDialog$1$1(ChatService chatService, long j7, ChatRoomMember chatRoomMember, com.bilibili.tgwt.chatroom.c cVar, int i7, Continuation<? super ChatService$openChatUserInfoDialog$1$1> continuation) {
        super(2, continuation);
        this.this$0 = chatService;
        this.$roomId = j7;
        this.$user = chatRoomMember;
        this.$roomInfo = cVar;
        this.$roomMode = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatService$openChatUserInfoDialog$1$1(this.this$0, this.$roomId, this.$user, this.$roomInfo, this.$roomMode, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ChatRoomOperationService chatRoomOperationService = this.this$0.f111869R;
            long j7 = this.$roomId;
            long mid = this.$user.getMid();
            this.label = 1;
            Object objRequestUserInfoWithLabel = chatRoomOperationService.requestUserInfoWithLabel(j7, mid, this);
            obj = objRequestUserInfoWithLabel;
            if (objRequestUserInfoWithLabel == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        final ChatService chatService = this.this$0;
        final ChatRoomMember chatRoomMember = this.$user;
        com.bilibili.tgwt.chatroom.c cVar = this.$roomInfo;
        int i8 = this.$roomMode;
        final long j8 = this.$roomId;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            BiliApiException biliApiException = new BiliApiException(businessFailure.getCode(), businessFailure.getMessage());
            BLog.e("ChatService$openChatUserInfoDialog$1$1-invokeSuspend", "[together-watch-ChatService$openChatUserInfoDialog$1$1-invokeSuspend] " + biliApiException.getMessage(), biliApiException);
        } else if (biliApiResponse instanceof BiliApiResponse.ServiceUnavailable) {
            Exception exception = ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException();
            com.bilibili.biligame.dialogdispatcher.e.a("[together-watch-ChatService$openChatUserInfoDialog$1$1-invokeSuspend] ", exception.getMessage(), "ChatService$openChatUserInfoDialog$1$1-invokeSuspend", exception);
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            new ChatUserInfoDialog(chatService.f111878a, chatRoomMember, (ChatUserInfo) ((BiliApiResponse.Success) biliApiResponse).getData(), cVar.f110974c, i8, new a(chatService, chatRoomMember, j8), new b(chatService), new g.a(chatService, chatRoomMember, j8) { // from class: com.bilibili.tgwt.service.ChatService$openChatUserInfoDialog$1$1$1$3

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ChatService f111919a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final ChatRoomMember f111920b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final long f111921c;

                {
                    this.f111919a = chatService;
                    this.f111920b = chatRoomMember;
                    this.f111921c = j8;
                }

                public final void a() {
                    ChatService chatService2 = this.f111919a;
                    BuildersKt.launch$default(chatService2.f111896o, (CoroutineContext) null, (CoroutineStart) null, new ChatService$openChatUserInfoDialog$1$1$1$3$onUnfollowSuccess$1(chatService2, this.f111920b, this.f111921c, null), 3, (Object) null);
                }

                public final void onFollowSuccess() {
                    ChatService chatService2 = this.f111919a;
                    BuildersKt.launch$default(chatService2.f111896o, (CoroutineContext) null, (CoroutineStart) null, new ChatService$openChatUserInfoDialog$1$1$1$3$onFollowSuccess$1(chatService2, this.f111920b, this.f111921c, null), 3, (Object) null);
                }
            }).show();
        }
        return Unit.INSTANCE;
    }
}
