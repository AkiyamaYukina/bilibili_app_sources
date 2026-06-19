package com.bilibili.tgwt.chatroom;

import J1.M;
import Pb.F;
import Pb.G;
import android.app.Activity;
import androidx.appcompat.widget.C3259x;
import androidx.compose.foundation.text.selection.C3751q;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.z;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.logic.page.detail.service.PlayControlService;
import com.bilibili.bangumi.logic.page.detail.service.ScreenStateService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.ActivityContextParamsService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewSeasonService;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import com.bilibili.bililive.room.ui.roomv3.gift.X;
import com.bilibili.chatroom.vo.ChatMessageVo;
import com.bilibili.chatroom.widget.userDialog.ChatUserFollowStatus;
import com.bilibili.chatroomsdk.ChatMsg;
import com.bilibili.chatroomsdk.ChatRoomMember;
import com.bilibili.chatroomsdk.ClearEvent;
import com.bilibili.chatroomsdk.EnterSpecialEvent;
import com.bilibili.chatroomsdk.FreyaEventBodyVo;
import com.bilibili.chatroomsdk.MessagePro;
import com.bilibili.chatroomsdk.MessageTypeEnum;
import com.bilibili.chatroomsdk.ProgressSyncEvent;
import com.bilibili.chatroomsdk.RemoveChatEvent;
import com.bilibili.chatroomsdk.RoomAnnouncementEvent;
import com.bilibili.chatroomsdk.RoomBindChannelInfo;
import com.bilibili.chatroomsdk.RoomCreateOrLeaveChannelEvent;
import com.bilibili.chatroomsdk.RoomDestroyEvent;
import com.bilibili.chatroomsdk.RoomMemberChangeEvent;
import com.bilibili.chatroomsdk.RoomProtoVo;
import com.bilibili.chatroomsdk.RoomTriggerEvent;
import com.bilibili.chatroomsdk.RoomUpdateEvent;
import com.bilibili.chatroomsdk.SurpriseEvent;
import com.bilibili.chatroomsdk.TriggerTypeEnum;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.ghost.api.Invocation;
import com.bilibili.lib.ghost.api.InvocationCategory;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.ogvvega.protobuf.OneofWrapper;
import com.bilibili.ogvvega.protobuf.ProtoAny;
import com.bilibili.ogvvega.tunnel.TargetPath;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.tgwt.api.ChatRoomOperationService;
import com.bilibili.tgwt.service.ChatService;
import com.google.gson.JsonSyntaxException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/chatroom/ChatRoomManagerService.class */
@StabilityInferred(parameters = 0)
public final class ChatRoomManagerService {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f110887A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Pair<Long, String>> f110888B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<SurpriseEvent> f110889C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f110890D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Pair<String, Boolean>> f110891E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<EnterSpecialEvent> f110892F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<ClearEvent> f110893G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<SurpriseEvent> f110894H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<RoomCreateOrLeaveChannelEvent> f110895I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<RoomBindChannelInfo> f110896J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @NotNull
    public final Map<HalfScreenChatPopLayerType, Boolean> f110897K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @NotNull
    public final Map<FullScreenChatPopLayerType, Boolean> f110898L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Pair<Long, Long>> f110899M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    @NotNull
    public ChatService.GuestWatchMode f110900N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    @Nullable
    public Job f110901O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f110902P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    @NotNull
    public final List<ChatMsg> f110903Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f110904R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public long f110905S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    @Nullable
    public k f110906T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f110907U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    @NotNull
    public final ChatRoomManagerService$chatRoomListener$1 f110908V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ActivityContextParamsService f110909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ScreenStateService f110910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PlayControlService f110911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final NewSeasonService f110912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Hl.a f110913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f110914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f110915g;

    @NotNull
    public final Kl.a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Job f110916i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f110917j = com.bilibili.ogv.infra.util.i.d(Hj0.a.c("ogv.ogv_freya_heart_query_interval"), 30);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f110918k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public Job f110919l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final ChatRoomOperationService f110920m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final HashSet<Long> f110921n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f110922o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<ChatRoomState> f110923p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<c> f110924q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<List<ChatRoomMember>> f110925r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<ChatMsg> f110926s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<RemoveChatEvent> f110927t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f110928u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f110929v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f110930w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f110931x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f110932y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f110933z;

    /* JADX INFO: renamed from: com.bilibili.tgwt.chatroom.ChatRoomManagerService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/chatroom/ChatRoomManagerService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<BangumiUniformSeason, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final ChatRoomManagerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ChatRoomManagerService chatRoomManagerService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = chatRoomManagerService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(BangumiUniformSeason bangumiUniformSeason, Continuation<? super Unit> continuation) {
            return create(bangumiUniformSeason, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            ChatRoomInfo chatRoomInfo;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BangumiUniformSeason bangumiUniformSeason = (BangumiUniformSeason) this.L$0;
            if (bangumiUniformSeason != null) {
                ChatRoomManagerService chatRoomManagerService = this.this$0;
                if (!chatRoomManagerService.f110922o && (chatRoomInfo = bangumiUniformSeason.E) != null) {
                    chatRoomManagerService.f110922o = true;
                    try {
                        chatRoomManagerService.f110902P = false;
                        int iP = chatRoomInfo.p();
                        long jN = chatRoomInfo.n();
                        List listM = chatRoomInfo.m();
                        chatRoomManagerService.e(chatRoomInfo);
                        chatRoomManagerService.f110923p.setValue(new ChatRoomState(null, 0, chatRoomInfo.t(), 0, 0, 0L, chatRoomInfo.o(), chatRoomInfo.A(), 0L, null, 4064, 0L, 0L));
                        chatRoomManagerService.f110924q.setValue(new c(chatRoomInfo.t(), iP, jN, chatRoomInfo.k(), null, 0, null, null, null, 4056));
                        chatRoomManagerService.f110925r.setValue(listM == null ? CollectionsKt.emptyList() : listM);
                        ChatUserFollowStatus chatUserFollowStatusI = chatRoomInfo.i();
                        if (chatUserFollowStatusI != null) {
                            chatRoomManagerService.f110913e.c.setValue(chatUserFollowStatusI);
                        }
                        chatRoomManagerService.n();
                        if (listM == null) {
                            BuildersKt.launch$default(chatRoomManagerService.f110914f, (CoroutineContext) null, (CoroutineStart) null, new ChatRoomManagerService$joinRoom$2(chatRoomManagerService, chatRoomInfo, null), 3, (Object) null);
                        }
                    } catch (Exception e7) {
                        com.bilibili.ogv.infra.util.e.b(e7);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/chatroom/ChatRoomManagerService$FullScreenChatPopLayerType.class */
    public static final class FullScreenChatPopLayerType {
        private static final EnumEntries $ENTRIES;
        private static final FullScreenChatPopLayerType[] $VALUES;
        public static final FullScreenChatPopLayerType WAIT_PEOPLE_POP_LAYER = new FullScreenChatPopLayerType("WAIT_PEOPLE_POP_LAYER", 0);

        private static final /* synthetic */ FullScreenChatPopLayerType[] $values() {
            return new FullScreenChatPopLayerType[]{WAIT_PEOPLE_POP_LAYER};
        }

        static {
            FullScreenChatPopLayerType[] fullScreenChatPopLayerTypeArr$values = $values();
            $VALUES = fullScreenChatPopLayerTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(fullScreenChatPopLayerTypeArr$values);
        }

        private FullScreenChatPopLayerType(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<FullScreenChatPopLayerType> getEntries() {
            return $ENTRIES;
        }

        public static FullScreenChatPopLayerType valueOf(String str) {
            return (FullScreenChatPopLayerType) Enum.valueOf(FullScreenChatPopLayerType.class, str);
        }

        public static FullScreenChatPopLayerType[] values() {
            return (FullScreenChatPopLayerType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/chatroom/ChatRoomManagerService$HalfScreenChatPopLayerType.class */
    public static final class HalfScreenChatPopLayerType {
        private static final EnumEntries $ENTRIES;
        private static final HalfScreenChatPopLayerType[] $VALUES;
        public static final HalfScreenChatPopLayerType WAIT_PEOPLE_POP_LAYER = new HalfScreenChatPopLayerType("WAIT_PEOPLE_POP_LAYER", 0);
        public static final HalfScreenChatPopLayerType CINEMA_SETTING_POP_LAYER = new HalfScreenChatPopLayerType("CINEMA_SETTING_POP_LAYER", 1);

        private static final /* synthetic */ HalfScreenChatPopLayerType[] $values() {
            return new HalfScreenChatPopLayerType[]{WAIT_PEOPLE_POP_LAYER, CINEMA_SETTING_POP_LAYER};
        }

        static {
            HalfScreenChatPopLayerType[] halfScreenChatPopLayerTypeArr$values = $values();
            $VALUES = halfScreenChatPopLayerTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(halfScreenChatPopLayerTypeArr$values);
        }

        private HalfScreenChatPopLayerType(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<HalfScreenChatPopLayerType> getEntries() {
            return $ENTRIES;
        }

        public static HalfScreenChatPopLayerType valueOf(String str) {
            return (HalfScreenChatPopLayerType) Enum.valueOf(HalfScreenChatPopLayerType.class, str);
        }

        public static HalfScreenChatPopLayerType[] values() {
            return (HalfScreenChatPopLayerType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Type inference failed for: r1v64, types: [com.bilibili.tgwt.chatroom.ChatRoomManagerService$chatRoomListener$1] */
    @Inject
    public ChatRoomManagerService(@NotNull ActivityContextParamsService activityContextParamsService, @NotNull ScreenStateService screenStateService, @NotNull PlayControlService playControlService, @NotNull NewSeasonService newSeasonService, @NotNull Hl.a aVar, @NotNull CoroutineScope coroutineScope, @NotNull BiliAccounts biliAccounts, @NotNull Kl.a aVar2) {
        boolean z6;
        this.f110909a = activityContextParamsService;
        this.f110910b = screenStateService;
        this.f110911c = playControlService;
        this.f110912d = newSeasonService;
        this.f110913e = aVar;
        this.f110914f = coroutineScope;
        this.f110915g = biliAccounts;
        this.h = aVar2;
        String strC = Hj0.a.c("ogv.ogv_freya_report_switch");
        if (Intrinsics.areEqual(strC, "1") || StringsKt.equals(strC, "true", true)) {
            z6 = true;
        } else {
            if (!Intrinsics.areEqual(strC, "0")) {
                StringsKt.equals(strC, "false", true);
            }
            z6 = false;
        }
        this.f110918k = z6;
        this.f110920m = (ChatRoomOperationService) ServiceGenerator.createService(ChatRoomOperationService.class);
        this.f110921n = new HashSet<>();
        this.f110923p = StateFlowKt.MutableStateFlow((Object) null);
        this.f110924q = StateFlowKt.MutableStateFlow((Object) null);
        this.f110925r = StateFlowKt.MutableStateFlow((Object) null);
        this.f110926s = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 7, (Object) null);
        this.f110927t = SharedFlowKt.MutableSharedFlow$default(0, 1, (BufferOverflow) null, 5, (Object) null);
        Boolean bool = Boolean.FALSE;
        this.f110929v = StateFlowKt.MutableStateFlow(bool);
        this.f110930w = StateFlowKt.MutableStateFlow(0);
        this.f110931x = StateFlowKt.MutableStateFlow(0);
        this.f110932y = StateFlowKt.MutableStateFlow(0);
        this.f110888B = StateFlowKt.MutableStateFlow(new Pair(0L, ""));
        this.f110889C = SharedFlowKt.MutableSharedFlow$default(0, 1, (BufferOverflow) null, 5, (Object) null);
        this.f110890D = StateFlowKt.MutableStateFlow(bool);
        this.f110891E = StateFlowKt.MutableStateFlow(new Pair("", bool));
        this.f110892F = SharedFlowKt.MutableSharedFlow$default(0, 1, (BufferOverflow) null, 5, (Object) null);
        this.f110893G = SharedFlowKt.MutableSharedFlow$default(0, 1, (BufferOverflow) null, 5, (Object) null);
        this.f110894H = SharedFlowKt.MutableSharedFlow$default(0, 1, (BufferOverflow) null, 5, (Object) null);
        this.f110895I = SharedFlowKt.MutableSharedFlow$default(0, 1, (BufferOverflow) null, 5, (Object) null);
        this.f110896J = SharedFlowKt.MutableSharedFlow$default(0, 1, (BufferOverflow) null, 5, (Object) null);
        this.f110897K = new EnumMap(HalfScreenChatPopLayerType.class);
        this.f110898L = new EnumMap(FullScreenChatPopLayerType.class);
        this.f110899M = SharedFlowKt.MutableSharedFlow$default(0, 1, (BufferOverflow) null, 5, (Object) null);
        this.f110900N = ChatService.GuestWatchMode.Follow;
        this.f110903Q = new ArrayList();
        FlowKt.launchIn(FlowKt.onEach(newSeasonService.getSeasonObservable(), new AnonymousClass1(this, null)), coroutineScope);
        this.f110908V = new m(this) { // from class: com.bilibili.tgwt.chatroom.ChatRoomManagerService$chatRoomListener$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChatRoomManagerService f110934a;

            {
                this.f110934a = this;
            }

            @Override // com.bilibili.tgwt.chatroom.m
            public final void a(boolean z7) {
                ChatRoomInfo chatRoomInfo;
                MessagePro messagePro;
                BLog.i("ChatRoomManagerService$chatRoomListener$1-onJoin", "[together-watch-ChatRoomManagerService$chatRoomListener$1-onJoin] 进入房间");
                ChatRoomManagerService chatRoomManagerService = this.f110934a;
                BangumiUniformSeason season = chatRoomManagerService.f110912d.getSeason();
                if (season == null || (chatRoomInfo = season.E) == null) {
                    return;
                }
                BuildersKt.launch$default(chatRoomManagerService.f110914f, (CoroutineContext) null, (CoroutineStart) null, new ChatRoomManagerService$chatRoomListener$1$onJoin$1(chatRoomManagerService, chatRoomInfo, null), 3, (Object) null);
                ArrayList arrayList = new ArrayList();
                boolean z8 = false;
                boolean z9 = chatRoomInfo.n() == chatRoomManagerService.f110915g.mid();
                if (chatRoomInfo.u() == 1) {
                    z8 = true;
                }
                try {
                    String strY = chatRoomInfo.y();
                    messagePro = strY != null ? (MessagePro) JsonUtilKt.parseJson(strY, new a().getType()) : null;
                } catch (JsonSyntaxException e7) {
                    BLog.e("ChatRoomManagerService-splicingFixedMsg", "[together-watch-ChatRoomManagerService-splicingFixedMsg] " + e7.getMessage(), e7);
                    messagePro = null;
                }
                long jT = chatRoomInfo.t();
                long j7 = 1000;
                ChatMsg chatMsg = new ChatMsg(jT, -1001L, System.currentTimeMillis() / j7, 0L, 1, 2, messagePro, (ChatRoomMember) null, 0L, 392, (DefaultConstructorMarker) null);
                String strF = chatRoomInfo.f();
                String str = strF;
                if (strF == null) {
                    str = "";
                }
                ChatMsg chatMsg2 = new ChatMsg(chatRoomInfo.t(), -1000L, System.currentTimeMillis() / j7, 0L, 1, 2, new MessagePro(JsonUtilKt.toJson(new ChatMessageVo(str, (Map) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0L, 1022)), 3, (String) null), (ChatRoomMember) null, 0L, 392, (DefaultConstructorMarker) null);
                if (z9) {
                    if (z8) {
                        arrayList.add(chatMsg);
                        List listD = chatRoomInfo.D();
                        if (listD != null) {
                            arrayList.addAll(listD);
                        }
                    } else {
                        arrayList.add(chatMsg2);
                    }
                } else if (z8) {
                    arrayList.add(chatMsg);
                    List listD2 = chatRoomInfo.D();
                    if (listD2 != null) {
                        arrayList.addAll(listD2);
                    }
                    ChatMsg chatMsgC = chatRoomInfo.C();
                    if (chatMsgC != null) {
                        arrayList.add(chatMsgC);
                    }
                }
                if (z7) {
                    return;
                }
                BLog.i("ChatRoomManagerService$chatRoomListener$1-onJoin", "[together-watch-ChatRoomManagerService$chatRoomListener$1-onJoin] start pull history msg");
                chatRoomManagerService.f110902P = true;
                BuildersKt.launch$default(chatRoomManagerService.f110914f, (CoroutineContext) null, (CoroutineStart) null, new ChatRoomManagerService$chatRoomListener$1$onJoin$2(chatRoomManagerService, chatRoomInfo, arrayList, null), 3, (Object) null);
            }

            @Override // com.bilibili.tgwt.chatroom.m
            public final void b(FreyaEventBodyVo freyaEventBodyVo) {
                ChatRoomInfo chatRoomInfo;
                OneofWrapper event;
                ChatRoomMember chatRoomMember;
                BangumiUniformSeason season;
                ChatRoomInfo chatRoomInfo2;
                Object next;
                ChatRoomInfo chatRoomInfo3;
                ChatRoomManagerService chatRoomManagerService = this.f110934a;
                chatRoomManagerService.getClass();
                defpackage.a.b("[together-watch-ChatRoomManagerService-handleFreyaEvent] ", "cmdBody: " + freyaEventBodyVo, "ChatRoomManagerService-handleFreyaEvent");
                BangumiUniformSeason season2 = chatRoomManagerService.f110912d.getSeason();
                if (season2 == null || (chatRoomInfo = season2.E) == null || freyaEventBodyVo.getRoomId() != chatRoomInfo.t()) {
                    return;
                }
                if ((!freyaEventBodyVo.getWhiteMids().isEmpty() && !freyaEventBodyVo.getWhiteMids().contains(Long.valueOf(chatRoomManagerService.f110915g.mid()))) || freyaEventBodyVo.getIgnoreMids().contains(Long.valueOf(chatRoomManagerService.f110915g.mid())) || (event = freyaEventBodyVo.getEvent()) == null) {
                    return;
                }
                BLog.i("ChatRoomManagerService-handleFreyaEvent", "[together-watch-ChatRoomManagerService-handleFreyaEvent] " + C3259x.a(event.getEventCase(), "vegaOpt freyaEvent.eventCase:"));
                Object obj = null;
                if (event.getEventCase() == 4) {
                    Object value = event.getValue();
                    Object obj2 = value;
                    if (!(value instanceof RoomMemberChangeEvent)) {
                        obj2 = null;
                    }
                    RoomMemberChangeEvent roomMemberChangeEvent = (RoomMemberChangeEvent) obj2;
                    RoomMemberChangeEvent roomMemberChangeEvent2 = roomMemberChangeEvent;
                    if (roomMemberChangeEvent == null) {
                        roomMemberChangeEvent2 = new RoomMemberChangeEvent();
                    }
                    BuildersKt.launch$default(chatRoomManagerService.f110914f, (CoroutineContext) null, (CoroutineStart) null, new ChatRoomManagerService$handleFreyaEvent$1(chatRoomManagerService, roomMemberChangeEvent2, null), 3, (Object) null);
                    return;
                }
                boolean z7 = true;
                if (event.getEventCase() == 7) {
                    Object value2 = event.getValue();
                    Object obj3 = value2;
                    if (!(value2 instanceof ChatMsg)) {
                        obj3 = null;
                    }
                    ChatMsg chatMsg = (ChatMsg) obj3;
                    ChatMsg chatMsg2 = chatMsg;
                    if (chatMsg == null) {
                        chatMsg2 = new ChatMsg(0L, 0L, 0L, 0L, 0, 0, (MessagePro) null, (ChatRoomMember) null, 0L, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKY_RESULT_ROTATE, (DefaultConstructorMarker) null);
                    }
                    int type = chatMsg2.getType();
                    MessageTypeEnum messageTypeEnum = MessageTypeEnum.ChatMessage;
                    if (type == messageTypeEnum.getNumber()) {
                        long msgId = chatMsg2.getMsgId();
                        synchronized (chatRoomManagerService) {
                            if (chatRoomManagerService.f110918k) {
                                BangumiUniformSeason season3 = chatRoomManagerService.f110912d.getSeason();
                                if (season3 != null && (chatRoomInfo3 = season3.E) != null) {
                                    Neurons.trackT$default(false, "ogv.pgc-video-detail.received-message-self", MapsKt.mapOf(new Pair[]{TuplesKt.to("message_id", String.valueOf(msgId)), TuplesKt.to("room_id", String.valueOf(chatRoomInfo3.t())), TuplesKt.to("enter-id", chatRoomManagerService.f110909a.getImmutable().getEnterId())}), 0, (Function0) null, 24, (Object) null);
                                }
                            }
                        }
                    }
                    if (chatMsg2.getType() == messageTypeEnum.getNumber() && chatRoomManagerService.f110925r.getValue() != null) {
                        List list = (List) chatRoomManagerService.f110925r.getValue();
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                } else {
                                    next = it.next();
                                    if (((ChatRoomMember) next).getMid() == chatMsg2.getOid()) {
                                        break;
                                    }
                                }
                            }
                            chatRoomMember = (ChatRoomMember) next;
                        } else {
                            chatRoomMember = null;
                        }
                        if (chatRoomMember == null && ((season = chatRoomManagerService.f110912d.getSeason()) == null || (chatRoomInfo2 = season.E) == null || chatRoomInfo2.u() != 6)) {
                            Job job = chatRoomManagerService.f110919l;
                            if (job != null) {
                                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                            }
                            chatRoomManagerService.f110919l = BuildersKt.launch$default(chatRoomManagerService.f110914f, (CoroutineContext) null, (CoroutineStart) null, new ChatRoomManagerService$handleFreyaEvent$3(chatRoomManagerService, chatMsg2, null), 3, (Object) null);
                        }
                    }
                    if (chatRoomManagerService.f110921n.contains(Long.valueOf(chatMsg2.getOid()))) {
                        return;
                    }
                    defpackage.a.b("[together-watch-ChatRoomManagerService-handleFreyaEvent] ", M.a("vegaOpt isNeedCacheNewMsg:", " chat message", chatRoomManagerService.f110902P), "ChatRoomManagerService-handleFreyaEvent");
                    if (chatRoomManagerService.f110902P) {
                        ((ArrayList) chatRoomManagerService.f110903Q).add(chatMsg2);
                        return;
                    } else {
                        chatRoomManagerService.c(chatMsg2);
                        return;
                    }
                }
                if (event.getEventCase() == 5) {
                    if (!chatRoomManagerService.f110928u || chatRoomManagerService.f110900N == ChatService.GuestWatchMode.Free) {
                        Object value3 = event.getValue();
                        if (!(value3 instanceof ProgressSyncEvent)) {
                            value3 = null;
                        }
                        ProgressSyncEvent progressSyncEvent = (ProgressSyncEvent) value3;
                        ProgressSyncEvent progressSyncEvent2 = progressSyncEvent;
                        if (progressSyncEvent == null) {
                            progressSyncEvent2 = new ProgressSyncEvent();
                        }
                        chatRoomManagerService.f110923p.setValue(new ChatRoomState(null, progressSyncEvent2.getStatus().getNumber(), progressSyncEvent2.getRoomId(), 0, 0, progressSyncEvent2.getProgress(), progressSyncEvent2.getSeasonId(), progressSyncEvent2.getEpId(), 0L, null, 4064, 0L, 0L));
                        return;
                    }
                    return;
                }
                if (event.getEventCase() == 8) {
                    Object value4 = event.getValue();
                    if (!(value4 instanceof RemoveChatEvent)) {
                        value4 = null;
                    }
                    RemoveChatEvent removeChatEvent = (RemoveChatEvent) value4;
                    RemoveChatEvent removeChatEvent2 = removeChatEvent;
                    if (removeChatEvent == null) {
                        removeChatEvent2 = new RemoveChatEvent();
                    }
                    if (chatRoomManagerService.f110902P) {
                        CollectionsKt.removeAll(chatRoomManagerService.f110903Q, new X(removeChatEvent2, 2));
                        return;
                    } else {
                        chatRoomManagerService.f110927t.tryEmit(removeChatEvent2);
                        return;
                    }
                }
                if (event.getEventCase() == 9) {
                    Object value5 = event.getValue();
                    if (!(value5 instanceof RoomDestroyEvent)) {
                        value5 = null;
                    }
                    RoomDestroyEvent roomDestroyEvent = (RoomDestroyEvent) value5;
                    RoomDestroyEvent roomDestroyEvent2 = roomDestroyEvent;
                    if (roomDestroyEvent == null) {
                        roomDestroyEvent2 = new RoomDestroyEvent();
                    }
                    c cVar = (c) chatRoomManagerService.f110924q.getValue();
                    if (cVar != null) {
                        String contentStr = roomDestroyEvent2.getMessage().getContentStr();
                        String str = contentStr;
                        if (contentStr == null) {
                            str = "";
                        }
                        chatRoomManagerService.f110924q.setValue(c.a(cVar, 0L, 0, 0L, str, true, null, 0, null, null, null, roomDestroyEvent2.getReason(), 2023));
                        return;
                    }
                    return;
                }
                if (event.getEventCase() == 6) {
                    if (chatRoomManagerService.f110924q.getValue() != null) {
                        Object value6 = event.getValue();
                        if (!(value6 instanceof RoomUpdateEvent)) {
                            value6 = null;
                        }
                        RoomUpdateEvent roomUpdateEvent = (RoomUpdateEvent) value6;
                        RoomUpdateEvent roomUpdateEvent2 = roomUpdateEvent;
                        if (roomUpdateEvent == null) {
                            roomUpdateEvent2 = new RoomUpdateEvent();
                        }
                        MutableStateFlow<c> mutableStateFlow = chatRoomManagerService.f110924q;
                        mutableStateFlow.setValue(c.a((c) mutableStateFlow.getValue(), 0L, roomUpdateEvent2.getType().getNumber(), 0L, null, false, null, 0, null, null, null, 0, 4093));
                        return;
                    }
                    return;
                }
                if (event.getEventCase() == 10) {
                    Object value7 = event.getValue();
                    Object obj4 = value7;
                    if (!(value7 instanceof RoomTriggerEvent)) {
                        obj4 = null;
                    }
                    RoomTriggerEvent roomTriggerEvent = (RoomTriggerEvent) obj4;
                    RoomTriggerEvent roomTriggerEvent2 = roomTriggerEvent;
                    if (roomTriggerEvent == null) {
                        roomTriggerEvent2 = new RoomTriggerEvent();
                    }
                    c cVar2 = (c) chatRoomManagerService.f110924q.getValue();
                    Long lValueOf = cVar2 != null ? Long.valueOf(cVar2.f110972a) : null;
                    if (roomTriggerEvent2.getTrigger() != TriggerTypeEnum.Relation || lValueOf == null) {
                        return;
                    }
                    BuildersKt.launch$default(chatRoomManagerService.f110914f, (CoroutineContext) null, (CoroutineStart) null, new ChatRoomManagerService$handleFreyaEvent$6(chatRoomManagerService, lValueOf, roomTriggerEvent2, null), 3, (Object) null);
                    return;
                }
                if (event.getEventCase() == 11) {
                    Object value8 = event.getValue();
                    if (!(value8 instanceof SurpriseEvent)) {
                        value8 = null;
                    }
                    SurpriseEvent surpriseEvent = (SurpriseEvent) value8;
                    SurpriseEvent surpriseEvent2 = surpriseEvent;
                    if (surpriseEvent == null) {
                        surpriseEvent2 = new SurpriseEvent();
                    }
                    chatRoomManagerService.f110889C.tryEmit(surpriseEvent2);
                    return;
                }
                if (event.getEventCase() == 12) {
                    Object value9 = event.getValue();
                    if (!(value9 instanceof RoomAnnouncementEvent)) {
                        value9 = null;
                    }
                    RoomAnnouncementEvent roomAnnouncementEvent = (RoomAnnouncementEvent) value9;
                    RoomAnnouncementEvent roomAnnouncementEvent2 = roomAnnouncementEvent;
                    if (roomAnnouncementEvent == null) {
                        roomAnnouncementEvent2 = new RoomAnnouncementEvent();
                    }
                    MutableStateFlow<Pair<String, Boolean>> mutableStateFlow2 = chatRoomManagerService.f110891E;
                    String content = roomAnnouncementEvent2.getContent();
                    if (roomAnnouncementEvent2.getContent().length() <= 0) {
                        z7 = false;
                    }
                    mutableStateFlow2.setValue(new Pair(content, Boolean.valueOf(z7)));
                    return;
                }
                if (event.getEventCase() == 13) {
                    Object value10 = event.getValue();
                    if (!(value10 instanceof EnterSpecialEvent)) {
                        value10 = null;
                    }
                    EnterSpecialEvent enterSpecialEvent = (EnterSpecialEvent) value10;
                    EnterSpecialEvent enterSpecialEvent2 = enterSpecialEvent;
                    if (enterSpecialEvent == null) {
                        enterSpecialEvent2 = new EnterSpecialEvent();
                    }
                    chatRoomManagerService.f110892F.tryEmit(enterSpecialEvent2);
                    return;
                }
                if (event.getEventCase() == 14) {
                    Object value11 = event.getValue();
                    if (!(value11 instanceof ClearEvent)) {
                        value11 = null;
                    }
                    ClearEvent clearEvent = (ClearEvent) value11;
                    ClearEvent clearEvent2 = clearEvent;
                    if (clearEvent == null) {
                        clearEvent2 = new ClearEvent();
                    }
                    chatRoomManagerService.f110893G.tryEmit(clearEvent2);
                    return;
                }
                if (event.getEventCase() == 18) {
                    Object value12 = event.getValue();
                    if (!(value12 instanceof SurpriseEvent)) {
                        value12 = null;
                    }
                    SurpriseEvent surpriseEvent3 = (SurpriseEvent) value12;
                    if (surpriseEvent3 == null) {
                        return;
                    }
                    chatRoomManagerService.f110894H.tryEmit(surpriseEvent3);
                    return;
                }
                if (event.getEventCase() == 19) {
                    Object value13 = event.getValue();
                    if (value13 instanceof RoomBindChannelInfo) {
                        obj = value13;
                    }
                    RoomBindChannelInfo roomBindChannelInfo = (RoomBindChannelInfo) obj;
                    if (roomBindChannelInfo == null) {
                        return;
                    }
                    chatRoomManagerService.f110896J.tryEmit(roomBindChannelInfo);
                    return;
                }
                if (event.getEventCase() == 20) {
                    Object value14 = event.getValue();
                    if (!(value14 instanceof RoomCreateOrLeaveChannelEvent)) {
                        value14 = null;
                    }
                    RoomCreateOrLeaveChannelEvent roomCreateOrLeaveChannelEvent = (RoomCreateOrLeaveChannelEvent) value14;
                    if (roomCreateOrLeaveChannelEvent == null) {
                        return;
                    }
                    chatRoomManagerService.f110895I.tryEmit(roomCreateOrLeaveChannelEvent);
                }
            }
        };
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

    public final void b(@Nullable ChatMsg chatMsg, long j7) {
        if (chatMsg == null) {
            return;
        }
        if (j7 <= 0) {
            c(chatMsg);
        } else {
            this.f110901O = FlowKt.launchIn(FlowKt.onEach(FlowKt.asFlow(new IntRange(1, Integer.MAX_VALUE)), new ChatRoomManagerService$addChatRoomMsg$1(j7, this, chatMsg, null)), this.f110914f);
        }
    }

    public final void c(@NotNull ChatMsg chatMsg) {
        BuildersKt.launch$default(this.f110914f, (CoroutineContext) null, (CoroutineStart) null, new ChatRoomManagerService$addChatRoomMsgs$1(this, chatMsg, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(long r12, boolean r14, int r15, @org.jetbrains.annotations.NotNull java.lang.String r16, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r17) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.chatroom.ChatRoomManagerService.d(long, boolean, int, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void e(ChatRoomInfo chatRoomInfo) {
        k kVar = new k();
        this.f110906T = kVar;
        kVar.f111009i = this.f110908V;
        k kVar2 = this.f110906T;
        if (kVar2 != null) {
            long jT = chatRoomInfo.t();
            String strValueOf = String.valueOf(chatRoomInfo.d());
            ActivityContextParamsService activityContextParamsService = this.f110909a;
            long msgSeqId = activityContextParamsService.getImmutable().getMsgSeqId();
            String enterId = activityContextParamsService.getImmutable().getEnterId();
            StringBuilder sbA = z.a(jT, "joinRoom, roomId = ", ", initMsgSeqId = ");
            sbA.append(msgSeqId);
            defpackage.a.b("[together-watch-RoomApi4TogetherWatchImpl-joinRoom] ", sbA.toString(), "RoomApi4TogetherWatchImpl-joinRoom");
            kVar2.f111008g.getClass();
            i.a("ogv.pgc-room.join", MapsKt.mapOf(new Pair[]{TuplesKt.to("room-id", String.valueOf(jT)), TuplesKt.to("init-seq-id", String.valueOf(msgSeqId)), TuplesKt.to("enter-id", enterId)}));
            ReentrantLock reentrantLock = kVar2.f111004c;
            reentrantLock.lock();
            try {
                kVar2.f111007f.put(Long.valueOf(jT), enterId);
                TargetPath targetPath = new TargetPath("bilibili.broadcast.message.ogv.FreyaEventBody", ProtoAny.Companion.pack(new RoomProtoVo(CollectionsKt.mutableListOf(new String[]{strValueOf})), "type.googleapis.com/pgc.biz.RoomProto"));
                kVar2.f111002a.put(Long.valueOf(jT), targetPath);
                kVar2.f111003b.put(Long.valueOf(jT), new h(jT, msgSeqId, kVar2));
                kVar2.f111006e.put(Long.valueOf(jT), new LinkedHashSet());
                kVar2.h.subscribe(targetPath, new j(kVar2, jT, enterId));
            } finally {
                reentrantLock.unlock();
            }
        }
        n();
    }

    public final void f(@Nullable Long l7) {
        if (l7 == null) {
            return;
        }
        Job job = this.f110916i;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f110902P = false;
        Job job2 = this.f110901O;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        k kVar = this.f110906T;
        if (kVar != null) {
            long jLongValue = l7.longValue();
            String enterId = this.f110909a.getImmutable().getEnterId();
            defpackage.a.b("[together-watch-RoomApi4TogetherWatchImpl-exitRoom] ", C3751q.a(jLongValue, "exitRoom, roomId = "), "RoomApi4TogetherWatchImpl-exitRoom");
            kVar.f111008g.getClass();
            i.a("ogv.pgc-room.exit", MapsKt.mapOf(new Pair[]{TuplesKt.to("room-id", String.valueOf(jLongValue)), TuplesKt.to("enter-id", enterId)}));
            ReentrantLock reentrantLock = kVar.f111004c;
            reentrantLock.lock();
            try {
                kVar.f111007f.remove(l7);
                TargetPath targetPathRemove = kVar.f111002a.remove(l7);
                h hVarRemove = kVar.f111003b.remove(l7);
                kVar.f111006e.remove(l7);
                if (targetPathRemove != null) {
                    kVar.h.unsubscribe(targetPathRemove);
                    if (hVarRemove != null) {
                        hVarRemove.c();
                    }
                }
                Unit unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }
        k kVar2 = this.f110906T;
        if (kVar2 != null) {
            kVar2.f111009i = null;
        }
        this.f110906T = null;
        MutableStateFlow<c> mutableStateFlow = this.f110924q;
        if (mutableStateFlow.getValue() == null || ((c) mutableStateFlow.getValue()).f110976e) {
            return;
        }
        BuildersKt.launch$default(GlobalScope.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new ChatRoomManagerService$destroyCurrentRoom$1(this, l7, null), 3, (Object) null);
    }

    public final int g() {
        return ((Number) this.f110932y.getValue()).intValue();
    }

    @Nullable
    public final c h() {
        return (c) this.f110924q.getValue();
    }

    @Nullable
    public final ChatRoomState i() {
        return (ChatRoomState) this.f110923p.getValue();
    }

    @Nullable
    public final List<ChatRoomMember> j() {
        return (List) this.f110925r.getValue();
    }

    public final void k(@NotNull FullScreenChatPopLayerType fullScreenChatPopLayerType, boolean z6) {
        ((EnumMap) this.f110898L).put(fullScreenChatPopLayerType, Boolean.valueOf(z6));
        this.f110890D.setValue(Boolean.valueOf(z6));
    }

    public final void l(@NotNull HalfScreenChatPopLayerType halfScreenChatPopLayerType, boolean z6) {
        ((EnumMap) this.f110897K).put(halfScreenChatPopLayerType, Boolean.valueOf(z6));
        this.f110890D.setValue(Boolean.valueOf(z6));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(long r25, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 698
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.chatroom.ChatRoomManagerService.m(long, kotlin.coroutines.jvm.internal.ContinuationImpl, boolean):java.lang.Object");
    }

    public final void n() {
        Job job = this.f110916i;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        if (this.f110917j <= 0) {
            return;
        }
        this.f110916i = BuildersKt.launch$default(this.f110914f, (CoroutineContext) null, (CoroutineStart) null, new ChatRoomManagerService$runHeart$1(this, null), 3, (Object) null);
    }
}
