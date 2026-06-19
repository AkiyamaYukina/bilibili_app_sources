package com.bilibili.tgwt.service;

import HD0.B;
import HD0.x;
import Pb.F;
import Pb.G;
import X50.P;
import android.app.Activity;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.media.MediaPlayer;
import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableArrayList;
import androidx.lifecycle.Lifecycle;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformEpisode;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.logic.page.detail.datawrapper.ContinuingType;
import com.bilibili.bangumi.logic.page.detail.service.BangumiPlayerContainerService;
import com.bilibili.bangumi.logic.page.detail.service.PlayControlService;
import com.bilibili.bangumi.logic.page.detail.service.PlayHistoryService;
import com.bilibili.bangumi.logic.page.detail.service.ScreenStateService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.ActivityContextParamsService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.BangumiDanmakuService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.BangumiPopFragmentService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.BangumiPopPageType;
import com.bilibili.bangumi.logic.page.detail.service.refactor.LegacyPagePopService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewSeasonService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewSectionService;
import com.bilibili.bangumi.module.chatroom.ChatRoomExtraInfo;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import com.bilibili.bangumi.module.detail.vo.BangumiRouterParams;
import com.bilibili.bangumi.ui.page.detail.playerV2.screenstate.a;
import com.bilibili.base.connectivity.Connectivity;
import com.bilibili.bililive.bilirtc.BiliRtcClientProxy;
import com.bilibili.chatroom.vo.ChatEmote;
import com.bilibili.chatroom.vo.ChatMessageVo;
import com.bilibili.chatroomsdk.ChatMsg;
import com.bilibili.chatroomsdk.ChatMsgResp;
import com.bilibili.chatroomsdk.ChatRoomMember;
import com.bilibili.chatroomsdk.MessagePro;
import com.bilibili.chatroomsdk.RemoveChatEvent;
import com.bilibili.chatroomsdk.RoomBindChannelInfo;
import com.bilibili.chatroomsdk.RoomCreateOrLeaveChannelEvent;
import com.bilibili.chatroomsdk.SurpriseEvent;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.ghost.api.Invocation;
import com.bilibili.lib.ghost.api.InvocationCategory;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.tgwt.api.ChatRoomOperationService;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import com.bilibili.tgwt.chatroom.ChatRoomState;
import com.bilibili.tgwt.chatroom.PlayStatus;
import com.bilibili.tgwt.im.widget.C6659e;
import com.bilibili.tgwt.im.widget.InterfaceC6660f;
import com.bilibili.tgwt.service.ChatService$registerDisplayListener$1;
import com.bilibili.tgwt.square.MovieSquareFragment;
import hm.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.inject.Inject;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.utils.TimeFormater;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService.class */
@StabilityInferred(parameters = 0)
public final class ChatService {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Float> f111852A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f111853B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Boolean> f111854C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f111855D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<SurpriseEvent> f111856E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @Nullable
    public Pair<Long, SurpriseEvent> f111857F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f111858G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f111859H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @Nullable
    public C6659e f111860I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @NotNull
    public final x f111861J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public long f111862K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @NotNull
    public final ChatService$special$$inlined$map$1 f111863L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f111864M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f111865N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public long f111866O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public long f111867P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f111868Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    @NotNull
    public final ChatRoomOperationService f111869R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    @NotNull
    public final HashMap<String, String> f111870S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    @NotNull
    public final l f111871T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f111872U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    @NotNull
    public String f111873V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f111874W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public long f111875X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    @NotNull
    public final j f111876Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public long f111877Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f111878a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @Nullable
    public MediaPlayer f111879a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LegacyPagePopService f111880b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f111881b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final NewSeasonService f111882c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f111883c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final BangumiPopFragmentService f111884d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f111885d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ActivityContextParamsService f111886e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f111887e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final PlayControlService f111888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ChatVoiceRtcService f111889g;

    @NotNull
    public final ChatRoomManagerService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Hl.a f111890i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final ScreenStateService f111891j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final NewSectionService f111892k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final PlayHistoryService f111893l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final BangumiDanmakuService f111894m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final BangumiPlayerContainerService f111895n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f111896o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final com.bilibili.tgwt.im.ui.i f111897p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f111898q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Kl.a f111899r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f111900s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public ChatService$registerDisplayListener$1.a f111901t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f111902u = -2000;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<ChatRoomExtraInfo> f111903v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f111904w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<ChatMsgResp> f111905x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow f111906y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final HashMap<String, ChatEmote> f111907z;

    /* JADX INFO: renamed from: com.bilibili.tgwt.service.ChatService$10, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$10.class */
    final class AnonymousClass10 extends SuspendLambda implements Function2<RemoveChatEvent, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final ChatService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(ChatService chatService, Continuation<? super AnonymousClass10> continuation) {
            super(2, continuation);
            this.this$0 = chatService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass10 anonymousClass10 = new AnonymousClass10(this.this$0, continuation);
            anonymousClass10.L$0 = obj;
            return anonymousClass10;
        }

        public final Object invoke(RemoveChatEvent removeChatEvent, Continuation<? super Unit> continuation) {
            return create(removeChatEvent, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.f111861J.r(((RemoveChatEvent) this.L$0).getMsgId());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.service.ChatService$11, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$11.class */
    final class AnonymousClass11 extends SuspendLambda implements Function2<Pair<? extends Long, ? extends Long>, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final ChatService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass11(ChatService chatService, Continuation<? super AnonymousClass11> continuation) {
            super(2, continuation);
            this.this$0 = chatService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass11 anonymousClass11 = new AnonymousClass11(this.this$0, continuation);
            anonymousClass11.L$0 = obj;
            return anonymousClass11;
        }

        public final Object invoke(Pair<Long, Long> pair, Continuation<? super Unit> continuation) {
            return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Pair pair = (Pair) this.L$0;
            if (((Number) pair.getFirst()).longValue() != 0) {
                this.this$0.f111893l.clearPrevTwPageEpId();
                PlayControlService.switchSeason$default(this.this$0.f111888f, ((Number) pair.getFirst()).longValue(), "pgc.pgc-video-detail.0.0", 6, (Long) null, 8, (Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.service.ChatService$13, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$13.class */
    final class AnonymousClass13 extends SuspendLambda implements Function3<FlowCollector<? super RoomCreateOrLeaveChannelEvent>, Boolean, Continuation<? super Unit>, Object> {
        private Object L$0;
        boolean Z$0;
        int label;
        final ChatService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass13(ChatService chatService, Continuation<? super AnonymousClass13> continuation) {
            super(3, continuation);
            this.this$0 = chatService;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((FlowCollector<? super RoomCreateOrLeaveChannelEvent>) obj, ((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) obj3);
        }

        public final Object invoke(FlowCollector<? super RoomCreateOrLeaveChannelEvent> flowCollector, boolean z6, Continuation<? super Unit> continuation) {
            AnonymousClass13 anonymousClass13 = new AnonymousClass13(this.this$0, continuation);
            anonymousClass13.L$0 = flowCollector;
            anonymousClass13.Z$0 = z6;
            return anonymousClass13.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                if (this.Z$0) {
                    MutableSharedFlow<RoomCreateOrLeaveChannelEvent> mutableSharedFlow = this.this$0.h.f110895I;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector, mutableSharedFlow, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* JADX INFO: renamed from: com.bilibili.tgwt.service.ChatService$14, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$14.class */
    final class AnonymousClass14 extends SuspendLambda implements Function2<RoomCreateOrLeaveChannelEvent, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final ChatService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass14(ChatService chatService, Continuation<? super AnonymousClass14> continuation) {
            super(2, continuation);
            this.this$0 = chatService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass14 anonymousClass14 = new AnonymousClass14(this.this$0, continuation);
            anonymousClass14.L$0 = obj;
            return anonymousClass14;
        }

        public final Object invoke(RoomCreateOrLeaveChannelEvent roomCreateOrLeaveChannelEvent, Continuation<? super Unit> continuation) {
            return create(roomCreateOrLeaveChannelEvent, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            ChatRoomInfo chatRoomInfo;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            RoomCreateOrLeaveChannelEvent roomCreateOrLeaveChannelEvent = (RoomCreateOrLeaveChannelEvent) this.L$0;
            if (this.this$0.f111872U) {
                if (roomCreateOrLeaveChannelEvent.isCreateChannel()) {
                    ChatService chatService = this.this$0;
                    if (chatService.f111868Q && !chatService.f111889g.a()) {
                        ChatVoiceRtcService chatVoiceRtcService = this.this$0.f111889g;
                        chatVoiceRtcService.getClass();
                        BLog.i("ChatVoiceRtcService-createChannel", "[together-watch-ChatVoiceRtcService-createChannel] create Channel");
                        BangumiUniformSeason season = chatVoiceRtcService.f111932a.getSeason();
                        if (season != null && (chatRoomInfo = season.E) != null) {
                            BuildersKt.launch$default(chatVoiceRtcService.f111935d, (CoroutineContext) null, (CoroutineStart) null, new ChatVoiceRtcService$createChannel$1(chatVoiceRtcService, chatRoomInfo.e(), null), 3, (Object) null);
                        }
                    }
                } else if (this.this$0.f111889g.a()) {
                    this.this$0.f111889g.b();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.service.ChatService$15, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$15.class */
    final class AnonymousClass15 extends SuspendLambda implements Function3<FlowCollector<? super RoomBindChannelInfo>, Boolean, Continuation<? super Unit>, Object> {
        private Object L$0;
        boolean Z$0;
        int label;
        final ChatService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass15(ChatService chatService, Continuation<? super AnonymousClass15> continuation) {
            super(3, continuation);
            this.this$0 = chatService;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((FlowCollector<? super RoomBindChannelInfo>) obj, ((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) obj3);
        }

        public final Object invoke(FlowCollector<? super RoomBindChannelInfo> flowCollector, boolean z6, Continuation<? super Unit> continuation) {
            AnonymousClass15 anonymousClass15 = new AnonymousClass15(this.this$0, continuation);
            anonymousClass15.L$0 = flowCollector;
            anonymousClass15.Z$0 = z6;
            return anonymousClass15.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                if (this.Z$0) {
                    MutableSharedFlow<RoomBindChannelInfo> mutableSharedFlow = this.this$0.h.f110896J;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector, mutableSharedFlow, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* JADX INFO: renamed from: com.bilibili.tgwt.service.ChatService$16, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$16.class */
    final class AnonymousClass16 extends SuspendLambda implements Function2<RoomBindChannelInfo, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final ChatService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass16(ChatService chatService, Continuation<? super AnonymousClass16> continuation) {
            super(2, continuation);
            this.this$0 = chatService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass16 anonymousClass16 = new AnonymousClass16(this.this$0, continuation);
            anonymousClass16.L$0 = obj;
            return anonymousClass16;
        }

        public final Object invoke(RoomBindChannelInfo roomBindChannelInfo, Continuation<? super Unit> continuation) {
            return create(roomBindChannelInfo, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            RoomBindChannelInfo roomBindChannelInfo = (RoomBindChannelInfo) this.L$0;
            ChatService chatService = this.this$0;
            if (chatService.f111872U && !chatService.f111868Q && !chatService.f111889g.a()) {
                this.this$0.f111889g.e(roomBindChannelInfo.getChannelId());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.service.ChatService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$2.class */
    final class AnonymousClass2 extends SuspendLambda implements Function2<a.b, Continuation<? super Unit>, Object> {
        int label;
        final ChatService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ChatService chatService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = chatService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
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
            this.this$0.f111858G = false;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.service.ChatService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$3.class */
    final class AnonymousClass3 extends SuspendLambda implements Function2<BangumiUniformSeason, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final ChatService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ChatService chatService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = chatService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        public final Object invoke(BangumiUniformSeason bangumiUniformSeason, Continuation<? super Unit> continuation) {
            return create(bangumiUniformSeason, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BangumiUniformSeason bangumiUniformSeason = (BangumiUniformSeason) this.L$0;
            if (bangumiUniformSeason != null) {
                this.this$0.u(GuestWatchMode.Follow);
                ChatService chatService = this.this$0;
                ChatRoomInfo chatRoomInfo = bangumiUniformSeason.E;
                chatService.f111868Q = chatRoomInfo != null && chatRoomInfo.n() == this.this$0.f111898q.mid();
                this.this$0.f111870S.put("season_id", String.valueOf(bangumiUniformSeason.a));
                HashMap<String, String> map = this.this$0.f111870S;
                String str = bangumiUniformSeason.c;
                String str2 = str;
                if (str == null) {
                    str2 = "";
                }
                map.put("season_title", str2);
                this.this$0.f111870S.put("season_type", String.valueOf(bangumiUniformSeason.h));
                HashMap<String, String> map2 = this.this$0.f111870S;
                BangumiUniformSeason.OperationTab operationTab = bangumiUniformSeason.y;
                String strValueOf = "";
                if (operationTab != null) {
                    BangumiUniformSeason.TabActivityExtensionField tabActivityExtensionField = operationTab.a;
                    strValueOf = "";
                    if (tabActivityExtensionField != null) {
                        strValueOf = String.valueOf(tabActivityExtensionField.a());
                        if (strValueOf == null) {
                            strValueOf = "";
                        }
                    }
                }
                map2.put("chatroom_id", strValueOf);
                this.this$0.f111872U = chatRoomInfo != null && chatRoomInfo.u() == 8;
                if (chatRoomInfo != null) {
                    ChatService chatService2 = this.this$0;
                    long jT = chatRoomInfo.t();
                    chatService2.getClass();
                    BuildersKt.launch$default(chatService2.f111896o, (CoroutineContext) null, (CoroutineStart) null, new ChatService$requestChatRoomExtraInfo$1(chatService2, jT, null), 3, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.service.ChatService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$4.class */
    final class AnonymousClass4 extends SuspendLambda implements Function2<BangumiUniformEpisode, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final ChatService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(ChatService chatService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = chatService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        public final Object invoke(BangumiUniformEpisode bangumiUniformEpisode, Continuation<? super Unit> continuation) {
            return create(bangumiUniformEpisode, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BangumiUniformEpisode bangumiUniformEpisode = (BangumiUniformEpisode) this.L$0;
            if (bangumiUniformEpisode == null) {
                return Unit.INSTANCE;
            }
            this.this$0.f111870S.put("ep_id", String.valueOf(bangumiUniformEpisode.a()));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.service.ChatService$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$5.class */
    final class AnonymousClass5 extends SuspendLambda implements Function2<ChatRoomState, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final ChatService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(ChatService chatService, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = chatService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, continuation);
            anonymousClass5.L$0 = obj;
            return anonymousClass5;
        }

        public final Object invoke(ChatRoomState chatRoomState, Continuation<? super Unit> continuation) {
            return create(chatRoomState, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            BangumiUniformEpisode currentPlayedEpisode;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ChatRoomState chatRoomState = (ChatRoomState) this.L$0;
            com.bilibili.tgwt.chatroom.c cVarH = this.this$0.h.h();
            long j7 = 0;
            if (chatRoomState.j() != 0 && chatRoomState.c() != 0 && cVarH != null) {
                if (cVarH.f110974c != this.this$0.f111898q.mid()) {
                    long seasonId = this.this$0.f111882c.getSeasonId();
                    if (this.this$0.f111888f.getCurrentPlayedEpisode() != null) {
                        BangumiUniformEpisode currentPlayedEpisode2 = this.this$0.f111888f.getCurrentPlayedEpisode();
                        Long lBoxLong = currentPlayedEpisode2 != null ? Boxing.boxLong(currentPlayedEpisode2.a()) : null;
                        if (seasonId != chatRoomState.j()) {
                            long jC = chatRoomState.c();
                            if (lBoxLong == null || lBoxLong.longValue() != jC) {
                                this.this$0.f111893l.clearPrevTwPageEpId();
                                PlayControlService.switchSeason$default(this.this$0.f111888f, chatRoomState.j(), "pgc.pgc-video-detail.0.0", 6, (Long) null, 8, (Object) null);
                            }
                        }
                    } else if (this.this$0.f111892k.getEpById(chatRoomState.c()) != null) {
                        PlayControlService.switchEpisode$default(this.this$0.f111888f, chatRoomState.c(), (ContinuingType) null, 2, (Object) null);
                    }
                }
            }
            if (chatRoomState.k() == PlayStatus.PLAYING.getValue() && this.this$0.f111882c.getSeasonId() == chatRoomState.j() && (currentPlayedEpisode = this.this$0.f111888f.getCurrentPlayedEpisode()) != null && currentPlayedEpisode.a() == chatRoomState.c()) {
                ChatRoomManagerService chatRoomManagerService = this.this$0.h;
                if (chatRoomManagerService.f110900N == GuestWatchMode.Free) {
                    com.bilibili.tgwt.chatroom.c cVarH2 = chatRoomManagerService.h();
                    if (cVarH2 != null) {
                        j7 = cVarH2.f110974c;
                    }
                    if (j7 != this.this$0.f111898q.mid()) {
                        ChatService chatService = this.this$0;
                        if (!chatService.f111900s) {
                            chatService.b(chatRoomState.d(), chatRoomState.g());
                            this.this$0.f111900s = true;
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.service.ChatService$6, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$6.class */
    final class AnonymousClass6 extends SuspendLambda implements Function2<com.bilibili.tgwt.chatroom.c, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final ChatService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(ChatService chatService, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.this$0 = chatService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass6 anonymousClass6 = new AnonymousClass6(this.this$0, continuation);
            anonymousClass6.L$0 = obj;
            return anonymousClass6;
        }

        public final Object invoke(com.bilibili.tgwt.chatroom.c cVar, Continuation<? super Unit> continuation) {
            return create(cVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            ChatRoomInfo chatRoomInfo;
            BangumiUniformSeason season;
            ChatRoomInfo chatRoomInfo2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            com.bilibili.tgwt.chatroom.c cVar = (com.bilibili.tgwt.chatroom.c) this.L$0;
            ChatService chatService = this.this$0;
            chatService.f111868Q = cVar.f110974c == chatService.f111898q.mid();
            HashMap<String, String> map = this.this$0.f111870S;
            long j7 = cVar.f110972a;
            map.put("room_id", String.valueOf(j7));
            ChatService chatService2 = this.this$0;
            chatService2.f111870S.put("user_status", chatService2.f111868Q ? "0" : "1");
            if (cVar.f110976e) {
                final ChatService chatService3 = this.this$0;
                if (chatService3.f111872U) {
                    chatService3.f111889g.b();
                }
                chatService3.f111891j.getScreenStateHelper().h();
                chatService3.h.f(Long.valueOf(j7));
                chatService3.f111895n.getPlayerServiceController().q();
                NewSeasonService newSeasonService = chatService3.f111882c;
                BangumiUniformSeason season2 = newSeasonService.getSeason();
                final String str = cVar.f110975d;
                if (season2 == null || (chatRoomInfo = season2.E) == null || chatRoomInfo.u() != 6 || (season = newSeasonService.getSeason()) == null || (chatRoomInfo2 = season.E) == null || chatRoomInfo2.j() != 1 || cVar.f110982l != 0) {
                    BuildersKt.launch$default(chatService3.f111896o, (CoroutineContext) null, (CoroutineStart) null, new ChatService$handleRoomFinishEvent$2(chatService3, str, null), 3, (Object) null);
                } else {
                    chatService3.s(new Function0(chatService3, str) { // from class: com.bilibili.tgwt.service.c

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final ChatService f111959a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final String f111960b;

                        {
                            this.f111959a = chatService3;
                            this.f111960b = str;
                        }

                        public final Object invoke() {
                            this.f111959a.q(this.f111960b);
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.service.ChatService$7, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$7.class */
    final class AnonymousClass7 extends SuspendLambda implements Function2<List<? extends ChatRoomMember>, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final ChatService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(ChatService chatService, Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
            this.this$0 = chatService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass7 anonymousClass7 = new AnonymousClass7(this.this$0, continuation);
            anonymousClass7.L$0 = obj;
            return anonymousClass7;
        }

        public final Object invoke(List<ChatRoomMember> list, Continuation<? super Unit> continuation) {
            return create(list, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            BangumiUniformSeason season;
            ChatRoomInfo chatRoomInfo;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<ChatRoomMember> list = (List) this.L$0;
            ChatService chatService = this.this$0;
            ChatRoomManagerService chatRoomManagerService = chatService.h;
            Context context = chatService.f111878a;
            if (!chatRoomManagerService.f110904R && (season = chatRoomManagerService.f110912d.getSeason()) != null && (chatRoomInfo = season.E) != null && chatRoomInfo.u() == 1) {
                List<ChatRoomMember> listJ = chatRoomManagerService.j();
                if ((listJ != null ? listJ.size() : 0) < 2) {
                    chatRoomManagerService.f110904R = true;
                    chatRoomManagerService.f110910b.getScreenStateHelper().h();
                    chatRoomManagerService.f110911c.pause();
                    String string = context.getString(2131836266);
                    c.a aVar = new c.a(context);
                    aVar.b = string;
                    aVar.b(context.getString(2131836273), new com.bilibili.biligame.ui.pointmall.b(context, 2));
                    aVar.c(context.getString(2131836320), new P(1, chatRoomManagerService, context));
                    aVar.m = false;
                    aVar.n = false;
                    aVar.a().show();
                    Neurons.reportExposure$default(false, "pgc.watch-together-cinema.leave-pop-up.0.show", (Map) null, (List) null, 12, (Object) null);
                }
            }
            ChatService chatService2 = this.this$0;
            if (chatService2.f111872U) {
                if (chatService2.f111864M < list.size() && list.size() == 2) {
                    this.this$0.f111866O = System.currentTimeMillis();
                    ChatService chatService3 = this.this$0;
                    chatService3.f111867P = 0L;
                    for (ChatRoomMember chatRoomMember : list) {
                        if (chatRoomMember.getMid() != chatService3.f111898q.mid()) {
                            chatService3.f111862K = chatRoomMember.getMid();
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                if (this.this$0.f111864M > list.size()) {
                    ChatService chatService4 = this.this$0;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    ChatService chatService5 = this.this$0;
                    chatService4.f111867P = jCurrentTimeMillis - chatService5.f111866O;
                    boolean z6 = chatService5.f111865N;
                    Kl.a aVar2 = chatService5.f111899r;
                    if (z6 && chatService5.f111868Q) {
                        Kl.a.a(aVar2, 2131836274);
                    } else {
                        Kl.a.a(aVar2, 2131836277);
                    }
                }
                ChatService chatService6 = this.this$0;
                com.bilibili.tgwt.chatroom.c cVarH = chatService6.h.h();
                chatService6.f111865N = cVarH != null && this.this$0.f111898q.mid() == cVarH.f110974c;
                this.this$0.f111864M = list.size();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.service.ChatService$8, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$8.class */
    final class AnonymousClass8 extends SuspendLambda implements Function2<SurpriseEvent, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final ChatService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(ChatService chatService, Continuation<? super AnonymousClass8> continuation) {
            super(2, continuation);
            this.this$0 = chatService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass8 anonymousClass8 = new AnonymousClass8(this.this$0, continuation);
            anonymousClass8.L$0 = obj;
            return anonymousClass8;
        }

        public final Object invoke(SurpriseEvent surpriseEvent, Continuation<? super Unit> continuation) {
            return create(surpriseEvent, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SurpriseEvent surpriseEvent = (SurpriseEvent) this.L$0;
            ChatService chatService = this.this$0;
            if (chatService.f111858G || chatService.f111857F != null) {
                chatService.f111857F = new Pair<>(Long.valueOf(System.currentTimeMillis()), surpriseEvent);
            } else {
                chatService.f111858G = true;
                chatService.f111856E.tryEmit(surpriseEvent);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.service.ChatService$9, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$9.class */
    final class AnonymousClass9 extends SuspendLambda implements Function2<ChatMsg, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final ChatService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(ChatService chatService, Continuation<? super AnonymousClass9> continuation) {
            super(2, continuation);
            this.this$0 = chatService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass9 anonymousClass9 = new AnonymousClass9(this.this$0, continuation);
            anonymousClass9.L$0 = obj;
            return anonymousClass9;
        }

        public final Object invoke(ChatMsg chatMsg, Continuation<? super Unit> continuation) {
            return create(chatMsg, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ChatMsg chatMsg = (ChatMsg) this.L$0;
            ChatService chatService = this.this$0;
            chatService.f111861J.n(chatService.f111878a, chatMsg, false);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$GuestWatchMode.class */
    public static final class GuestWatchMode {
        private static final EnumEntries $ENTRIES;
        private static final GuestWatchMode[] $VALUES;
        public static final GuestWatchMode Free = new GuestWatchMode("Free", 0);
        public static final GuestWatchMode Follow = new GuestWatchMode("Follow", 1);

        private static final /* synthetic */ GuestWatchMode[] $values() {
            return new GuestWatchMode[]{Free, Follow};
        }

        static {
            GuestWatchMode[] guestWatchModeArr$values = $values();
            $VALUES = guestWatchModeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(guestWatchModeArr$values);
        }

        private GuestWatchMode(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<GuestWatchMode> getEntries() {
            return $ENTRIES;
        }

        public static GuestWatchMode valueOf(String str) {
            return (GuestWatchMode) Enum.valueOf(GuestWatchMode.class, str);
        }

        public static GuestWatchMode[] values() {
            return (GuestWatchMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Type inference failed for: r1v38, types: [com.bilibili.tgwt.service.ChatService$special$$inlined$map$1] */
    @Inject
    public ChatService(@NotNull Context context, @NotNull LegacyPagePopService legacyPagePopService, @NotNull NewSeasonService newSeasonService, @NotNull BangumiPopFragmentService bangumiPopFragmentService, @NotNull ActivityContextParamsService activityContextParamsService, @NotNull PlayControlService playControlService, @NotNull ChatVoiceRtcService chatVoiceRtcService, @NotNull ChatRoomManagerService chatRoomManagerService, @NotNull Hl.a aVar, @NotNull ScreenStateService screenStateService, @NotNull NewSectionService newSectionService, @NotNull PlayHistoryService playHistoryService, @NotNull BangumiDanmakuService bangumiDanmakuService, @NotNull Lifecycle lifecycle, @NotNull BangumiPlayerContainerService bangumiPlayerContainerService, @NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.tgwt.im.ui.i iVar, @NotNull BiliAccounts biliAccounts, @NotNull Kl.a aVar2, @NotNull OnBackPressedDispatcher onBackPressedDispatcher) {
        this.f111878a = context;
        this.f111880b = legacyPagePopService;
        this.f111882c = newSeasonService;
        this.f111884d = bangumiPopFragmentService;
        this.f111886e = activityContextParamsService;
        this.f111888f = playControlService;
        this.f111889g = chatVoiceRtcService;
        this.h = chatRoomManagerService;
        this.f111890i = aVar;
        this.f111891j = screenStateService;
        this.f111892k = newSectionService;
        this.f111893l = playHistoryService;
        this.f111894m = bangumiDanmakuService;
        this.f111895n = bangumiPlayerContainerService;
        this.f111896o = coroutineScope;
        this.f111897p = iVar;
        this.f111898q = biliAccounts;
        this.f111899r = aVar2;
        MutableStateFlow<ChatRoomExtraInfo> MutableStateFlow = StateFlowKt.MutableStateFlow((Object) null);
        this.f111903v = MutableStateFlow;
        this.f111904w = MutableStateFlow;
        MutableSharedFlow<ChatMsgResp> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 7, (Object) null);
        this.f111905x = mutableSharedFlowMutableSharedFlow$default;
        this.f111906y = mutableSharedFlowMutableSharedFlow$default;
        this.f111907z = new HashMap<>();
        this.f111852A = StateFlowKt.MutableStateFlow(Float.valueOf(1.0f));
        this.f111853B = StateFlowKt.MutableStateFlow(50);
        this.f111854C = SharedFlowKt.MutableSharedFlow$default(0, 1, (BufferOverflow) null, 5, (Object) null);
        Boolean bool = Boolean.FALSE;
        this.f111855D = StateFlowKt.MutableStateFlow(bool);
        this.f111856E = SharedFlowKt.MutableSharedFlow$default(0, 1, (BufferOverflow) null, 5, (Object) null);
        this.f111861J = new x(chatRoomManagerService, newSeasonService);
        final Flow flow = FlowKt.flow(new ChatService$voiceModeWatchTimeObservable$1(null));
        this.f111863L = new Flow<Long>(flow, this) { // from class: com.bilibili.tgwt.service.ChatService$special$$inlined$map$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f111928a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ChatService f111929b;

            /* JADX INFO: renamed from: com.bilibili.tgwt.service.ChatService$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$special$$inlined$map$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f111930a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final ChatService f111931b;

                /* JADX INFO: renamed from: com.bilibili.tgwt.service.ChatService$special$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$special$$inlined$map$1$2$1.class */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    Object result;
                    final AnonymousClass2 this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(AnonymousClass2 anonymousClass2, Continuation continuation) {
                        super(continuation);
                        this.this$0 = anonymousClass2;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return this.this$0.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, ChatService chatService) {
                    this.f111930a = flowCollector;
                    this.f111931b = chatService;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        r0 = r7
                        boolean r0 = r0 instanceof com.bilibili.tgwt.service.ChatService$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.tgwt.service.ChatService$special$$inlined$map$1$2$1 r0 = (com.bilibili.tgwt.service.ChatService$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        r9 = r0
                        r0 = r9
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r0 & r1
                        if (r0 == 0) goto L29
                        r0 = r9
                        r1 = r8
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        int r1 = r1 + r2
                        r0.label = r1
                        r0 = r9
                        r7 = r0
                        goto L33
                    L29:
                        com.bilibili.tgwt.service.ChatService$special$$inlined$map$1$2$1 r0 = new com.bilibili.tgwt.service.ChatService$special$$inlined$map$1$2$1
                        r1 = r0
                        r2 = r5
                        r3 = r7
                        r1.<init>(r2, r3)
                        r7 = r0
                    L33:
                        r0 = r7
                        java.lang.Object r0 = r0.result
                        r10 = r0
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        r9 = r0
                        r0 = r7
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        if (r0 == 0) goto L5e
                        r0 = r8
                        r1 = 1
                        if (r0 != r1) goto L54
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto L98
                    L54:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r1 = r0
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r0
                    L5e:
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        r0 = r6
                        kotlin.Unit r0 = (kotlin.Unit) r0
                        r6 = r0
                        long r0 = java.lang.System.currentTimeMillis()
                        r1 = r5
                        com.bilibili.tgwt.service.ChatService r1 = r1.f111931b
                        long r1 = r1.f111866O
                        long r0 = r0 - r1
                        r1 = 1000(0x3e8, float:1.401E-42)
                        long r1 = (long) r1
                        long r0 = r0 / r1
                        r1 = 60
                        long r1 = (long) r1
                        long r0 = r0 / r1
                        java.lang.Long r0 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r0)
                        r6 = r0
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f111930a
                        r1 = r6
                        r2 = r7
                        java.lang.Object r0 = r0.emit(r1, r2)
                        r1 = r9
                        if (r0 != r1) goto L98
                        r0 = r9
                        return r0
                    L98:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.service.ChatService$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f111928a = flow;
                this.f111929b = this;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f111928a.collect(new AnonymousClass2(flowCollector, this.f111929b), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        this.f111866O = Long.MAX_VALUE;
        this.f111869R = (ChatRoomOperationService) ServiceGenerator.createService(ChatRoomOperationService.class);
        this.f111870S = new HashMap<>();
        this.f111871T = new l(this);
        FlowKt.launchIn(FlowKt.onEach(newSeasonService.getSeasonObservable(), new ChatService$registerDisplayListener$1(this, null)), coroutineScope);
        com.bilibili.okretro.call.rxjava.c.a(activityContextParamsService.getFromWrapperSubject().subscribe(new i(this)), lifecycle);
        FlowKt.launchIn(FlowKt.onEach(screenStateService.getScreenStateHelper().a, new AnonymousClass2(this, null)), coroutineScope);
        FlowKt.launchIn(FlowKt.onEach(newSeasonService.getSeasonObservable(), new AnonymousClass3(this, null)), coroutineScope);
        FlowKt.launchIn(FlowKt.onEach(playControlService.getCurrentEpisodeFlow(), new AnonymousClass4(this, null)), coroutineScope);
        FlowKt.launchIn(FlowKt.onEach(FlowKt.filterNotNull(chatRoomManagerService.f110923p), new AnonymousClass5(this, null)), coroutineScope);
        FlowKt.launchIn(FlowKt.onEach(FlowKt.filterNotNull(chatRoomManagerService.f110924q), new AnonymousClass6(this, null)), coroutineScope);
        FlowKt.launchIn(FlowKt.onEach(FlowKt.filterNotNull(chatRoomManagerService.f110925r), new AnonymousClass7(this, null)), coroutineScope);
        FlowKt.launchIn(FlowKt.onEach(chatRoomManagerService.f110894H, new AnonymousClass8(this, null)), coroutineScope);
        FlowKt.launchIn(FlowKt.onEach(chatRoomManagerService.f110926s, new AnonymousClass9(this, null)), coroutineScope);
        FlowKt.launchIn(FlowKt.onEach(chatRoomManagerService.f110927t, new AnonymousClass10(this, null)), coroutineScope);
        FlowKt.launchIn(FlowKt.onEach(chatRoomManagerService.f110899M, new AnonymousClass11(this, null)), coroutineScope);
        lifecycle.addObserver(new g(this));
        FlowKt.launchIn(FlowKt.onEach(FlowKt.transformLatest(chatVoiceRtcService.f111940j, new AnonymousClass13(this, null)), new AnonymousClass14(this, null)), coroutineScope);
        FlowKt.launchIn(FlowKt.onEach(FlowKt.transformLatest(chatVoiceRtcService.f111940j, new AnonymousClass15(this, null)), new AnonymousClass16(this, null)), coroutineScope);
        onBackPressedDispatcher.addCallback(new h(this));
        this.f111873V = "";
        this.f111876Y = new j(this);
        this.f111883c0 = StateFlowKt.MutableStateFlow(bool);
        this.f111885d0 = SharedFlowKt.MutableSharedFlow$default(0, 1, (BufferOverflow) null, 5, (Object) null);
    }

    @Invocation(category = InvocationCategory.INVOKE_NONE_STATIC, name = "finish", owner = {"android.app.Activity"}, scope = {})
    public static void a(@NotNull Object obj) {
        Contract contractAb = ConfigManager.Companion.ab();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(contractAb.get("bgthread_ui_access_detect_enable", bool), bool)) {
            Thread threadCurrentThread = Thread.currentThread();
            if (!androidx.appcompat.app.n.a(threadCurrentThread)) {
                IllegalStateException illegalStateException = new IllegalStateException(F.b("Activity.finish() called from non-UI thread: ", threadCurrentThread, ", 请联系 Jackin"));
                Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new Pair[]{TuplesKt.to("stacktrace", G.b("Activity.finish() called from non-UI thread: ", threadCurrentThread, "BgThreadUIAccess", illegalStateException, illegalStateException)), TuplesKt.to("threadName", threadCurrentThread.getName())}), 1, new AT0.c(8));
            }
        }
        ((Activity) obj).finish();
    }

    public final void b(long j7, long j8) {
        long j9 = 1000;
        MessagePro messagePro = new MessagePro(JsonUtilKt.toJson(new ChatMessageVo(this.f111878a.getString(2131836305, TimeFormater.formatTime$default(TimeFormater.INSTANCE, j8 * j9, false, false, 2, (Object) null), "bilibili://pgc/theater/syncProcess"), (Map) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0L, 1022)), 0, (String) null);
        long j10 = this.f111902u;
        this.f111902u = j10 - 1;
        this.h.c(new ChatMsg(j7, j10, System.currentTimeMillis() / j9, 0L, 1, 2, messagePro, (ChatRoomMember) null, 0L, 392, (DefaultConstructorMarker) null));
    }

    @NotNull
    public final Map<String, String> c(@NotNull Map<String, String> map) {
        HashMap map2 = new HashMap();
        map2.putAll(this.f111870S);
        if (!map.isEmpty()) {
            map2.putAll(map);
        }
        return map2;
    }

    public final void d(@NotNull B b7) {
        if (System.currentTimeMillis() / ((long) 1000) > b7.f8177o) {
            BuildersKt.launch$default(this.f111896o, (CoroutineContext) null, (CoroutineStart) null, new ChatService$clickVoiceMsg$1(this, b7, null), 3, (Object) null);
        } else {
            BuildersKt.launch$default(this.f111896o, (CoroutineContext) null, (CoroutineStart) null, new ChatService$downloadVoiceFile$1(this, b7.f8176n, b7, null), 3, (Object) null);
        }
    }

    public final void e() {
        C6659e c6659e = this.f111860I;
        if (c6659e != null) {
            c6659e.superDismiss();
        }
    }

    public final void f() {
        if (this.f111901t != null) {
            Object systemService = ContextCompat.getSystemService(this.f111878a, DisplayManager.class);
            if (systemService == null) {
                throw new IllegalArgumentException("Can not find system service for type ".concat(DisplayManager.class.getName()).toString());
            }
            ((DisplayManager) systemService).unregisterDisplayListener(this.f111901t);
        }
        this.h.f(this.f111886e.getImmutable().getRoomId());
        a(ContextUtilKt.requireActivity(this.f111878a));
    }

    @NotNull
    public final ObservableArrayList<B> g() {
        boolean zBooleanValue = ((Boolean) this.f111883c0.getValue()).booleanValue();
        x xVar = this.f111861J;
        return zBooleanValue ? xVar.f8332g : xVar.f8331f;
    }

    public final void h(final long j7, final long j8, final boolean z6) {
        c.a aVar = new c.a(this.f111878a);
        aVar.b = this.f111878a.getString(2131836258);
        aVar.b(this.f111878a.getString(2131836253), (Function1) null);
        aVar.c(this.f111878a.getString(2131836263), new Function1(this, j7, j8, z6) { // from class: com.bilibili.tgwt.service.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChatService f111955a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f111956b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f111957c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final boolean f111958d;

            {
                this.f111955a = this;
                this.f111956b = j7;
                this.f111957c = j8;
                this.f111958d = z6;
            }

            public final Object invoke(Object obj) {
                ChatService chatService = this.f111955a;
                BuildersKt.launch$default(chatService.f111896o, (CoroutineContext) null, (CoroutineStart) null, new ChatService$kickOutMember$1$1(chatService, this.f111956b, this.f111957c, this.f111958d, null), 3, (Object) null);
                return Unit.INSTANCE;
            }
        });
        aVar.a().show();
    }

    public final void i(@NotNull ChatRoomMember chatRoomMember) {
        ChatRoomInfo chatRoomInfo;
        BangumiUniformSeason season = this.f111882c.getSeason();
        int iU = (season == null || (chatRoomInfo = season.E) == null) ? 0 : chatRoomInfo.u();
        Long roomId = this.f111886e.getImmutable().getRoomId();
        long jLongValue = roomId != null ? roomId.longValue() : 0L;
        com.bilibili.tgwt.chatroom.c cVarH = this.h.h();
        if (cVarH != null) {
            BuildersKt.launch$default(this.f111896o, (CoroutineContext) null, (CoroutineStart) null, new ChatService$openChatUserInfoDialog$1$1(this, jLongValue, chatRoomMember, cVarH, iU, null), 3, (Object) null);
        }
    }

    public final void j() {
        this.f111858G = false;
        if (this.f111857F != null) {
            if (System.currentTimeMillis() - ((Number) this.f111857F.getFirst()).longValue() < 60000) {
                this.f111858G = true;
                this.f111856E.tryEmit(this.f111857F.getSecond());
            }
            this.f111857F = null;
        }
    }

    public final void k(int i7) {
        BuildersKt.launch$default(this.f111896o, (CoroutineContext) null, (CoroutineStart) null, new ChatService$sendInteractEmote$1(this, i7, null), 3, (Object) null);
    }

    public final void l(@NotNull String str, @Nullable Map map, boolean z6) {
        ChatRoomInfo chatRoomInfo;
        ChatRoomInfo chatRoomInfo2;
        NewSeasonService newSeasonService = this.f111882c;
        BangumiUniformSeason season = newSeasonService.getSeason();
        long jT = (season == null || (chatRoomInfo2 = season.E) == null) ? 0L : chatRoomInfo2.t();
        if (z6) {
            Neurons.reportClick$default(false, "pgc.watch-together-fullscreen-cinema.chat-zone.send.click", (Map) null, 4, (Object) null);
        } else {
            Neurons.reportClick$default(false, "pgc.watch-together-cinema.cinema-im.send.click", (Map) null, 4, (Object) null);
        }
        if (this.f111887e0) {
            return;
        }
        boolean zIsConnected = Connectivity.isConnected(Connectivity.getActiveNetworkInfo(this.f111878a));
        Kl.a aVar = this.f111899r;
        if (!zIsConnected) {
            Kl.a.a(aVar, 2131836331);
            return;
        }
        ChatMessageVo chatMessageVo = new ChatMessageVo(str, (Map) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0L, 1022);
        if (str.length() == 0) {
            Kl.a.a(aVar, 2131836329);
            return;
        }
        BangumiUniformSeason season2 = newSeasonService.getSeason();
        if (season2 != null && (chatRoomInfo = season2.E) != null && chatRoomInfo.u() == 6) {
            this.f111894m.sendDanmaku(this.f111878a, str);
        }
        this.f111887e0 = true;
        BuildersKt.launch$default(this.f111896o, (CoroutineContext) null, (CoroutineStart) null, new ChatService$sendMsg$1(this, jT, chatMessageVo, str, map, null), 3, (Object) null);
    }

    public final void m(float f7) {
        this.f111895n.getPlayerServiceController().j().setVolume(f7, f7);
    }

    public final void n(int i7) {
        BiliRtcClientProxy biliRtcClientProxy;
        int i8;
        u uVar = this.f111889g.f111937f;
        if (uVar != null && (biliRtcClientProxy = uVar.f112010d) != null) {
            if (i7 < 0) {
                i8 = 0;
            } else {
                i8 = 100;
                if (i7 <= 100) {
                    i8 = i7;
                }
            }
            biliRtcClientProxy.setPlaybackVolume(i8 / 100.0f);
        }
        this.f111853B.setValue(Integer.valueOf(i7));
    }

    public final void o(@Nullable Function1<? super Context, Unit> function1) {
        c.a aVar = new c.a(this.f111878a);
        aVar.b = this.f111878a.getString(2131836349);
        aVar.d = this.f111878a.getString(2131836348);
        aVar.b(this.f111878a.getString(2131836253), (Function1) null);
        aVar.c(this.f111878a.getString(2131836347), new G80.e(this, 4));
        aVar.m = false;
        aVar.n = false;
        if (function1 != null) {
            aVar.l = function1;
        }
        aVar.a().show();
    }

    @Nullable
    public final Object p(boolean z6, @NotNull SuspendLambda suspendLambda) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new ChatService$showChangeRoomPageFragment$2(z6 ? BangumiPopFragmentService.showPopFragment$default(this.f111884d, BangumiPopPageType.TOGETHER_CHANGE_ROOM_FULL_TYPE, (Map) null, 2131315577, 2, (Object) null) : BangumiPopFragmentService.showPopFragment$default(this.f111884d, BangumiPopPageType.TOGETHER_CHANGE_ROOM_TYPE, (Map) null, 0, 6, (Object) null), this, null), suspendLambda);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    public final void q(String str) {
        Context context;
        int i7;
        c.a aVar = new c.a(this.f111878a);
        aVar.n = false;
        aVar.m = false;
        aVar.b = str;
        if (MovieSquareFragment.f112045w) {
            context = this.f111878a;
            i7 = 2131836250;
        } else {
            context = this.f111878a;
            i7 = 2131836296;
        }
        aVar.c(context.getString(i7), new Hr.b(this, 5));
        aVar.a().show();
    }

    public final void r(@NotNull CharSequence charSequence, @NotNull InterfaceC6660f interfaceC6660f) {
        BuildersKt.launch$default(this.f111896o, (CoroutineContext) null, (CoroutineStart) null, new ChatService$showSendVoiceMsgDialog$1(this, charSequence, interfaceC6660f, null), 3, (Object) null);
    }

    public final void s(Function0<Unit> function0) {
        Long roomId = this.f111886e.getImmutable().getRoomId();
        if (roomId != null) {
            BuildersKt.launch$default(this.f111896o, (CoroutineContext) null, (CoroutineStart) null, new ChatService$showShareCard$1(this, roomId.longValue(), function0, null), 3, (Object) null);
        }
    }

    public final void t(boolean z6) {
        this.f111883c0.setValue(Boolean.valueOf(z6));
        x xVar = this.f111861J;
        if (!z6) {
            if (xVar.f8330e) {
                xVar.f8330e = false;
                xVar.notifyPropertyChanged(249);
                return;
            }
            return;
        }
        if (true != xVar.f8330e) {
            xVar.f8330e = true;
            xVar.notifyPropertyChanged(249);
        }
        if (this.f111881b0) {
            return;
        }
        BuildersKt.launch$default(this.f111896o, (CoroutineContext) null, (CoroutineStart) null, new ChatService$switchGuestPureEnjoyMode$1(this, null), 3, (Object) null);
    }

    public final void u(@NotNull GuestWatchMode guestWatchMode) {
        BangumiUniformSeason season;
        ChatRoomInfo chatRoomInfo;
        ChatRoomManagerService chatRoomManagerService = this.h;
        com.bilibili.tgwt.chatroom.c cVarH = chatRoomManagerService.h();
        if (cVarH == null) {
            return;
        }
        if ((cVarH.f110974c == this.f111898q.mid() && guestWatchMode == GuestWatchMode.Free) || (season = this.f111882c.getSeason()) == null || (chatRoomInfo = season.E) == null || chatRoomInfo.u() != 0) {
            return;
        }
        chatRoomManagerService.f110900N = guestWatchMode;
        if (guestWatchMode == GuestWatchMode.Follow) {
            this.f111900s = false;
        }
    }

    public final void v(boolean z6) {
        BiliRtcClientProxy biliRtcClientProxy;
        this.f111870S.put("micro_status", z6 ? "1" : "0");
        u uVar = this.f111889g.f111937f;
        if (uVar != null && (biliRtcClientProxy = uVar.f112010d) != null) {
            biliRtcClientProxy.setRecordMute(!z6);
        }
        this.f111855D.setValue(Boolean.valueOf(z6));
    }

    public final void w() {
        BangumiUniformSeason season;
        ChatRoomInfo chatRoomInfo;
        u(GuestWatchMode.Follow);
        if (this.h.f110907U) {
            return;
        }
        Rl.e playerServiceController = this.f111895n.getPlayerServiceController();
        if (playerServiceController.k() == 5) {
            playerServiceController.r();
        } else {
            if (this.f111886e.getImmutable().getSeasonMode() != BangumiRouterParams.SeasonMode.CHATROOM || (season = this.f111882c.getSeason()) == null || (chatRoomInfo = season.E) == null) {
                return;
            }
            BuildersKt.launch$default(this.f111896o, (CoroutineContext) null, (CoroutineStart) null, new ChatService$syncMasterPlayState$1$1(this, chatRoomInfo.t(), null), 3, (Object) null);
        }
    }
}
