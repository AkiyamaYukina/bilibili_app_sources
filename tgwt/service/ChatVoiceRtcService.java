package com.bilibili.tgwt.service;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewSeasonService;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import com.bilibili.chatroomsdk.RoomBindChannelInfo;
import com.bilibili.chatroomsdk.RoomCreateOrLeaveChannelEvent;
import com.bilibili.lib.ui.PermissionsChecker;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.tgwt.api.ChatRoomOperationService;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatVoiceRtcService.class */
@StabilityInferred(parameters = 0)
public final class ChatVoiceRtcService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NewSeasonService f111932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ChatRoomManagerService f111933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Context f111934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f111935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Kl.a f111936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public u f111937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public String f111938g = "";

    @NotNull
    public final ChatRoomOperationService h = (ChatRoomOperationService) ServiceGenerator.createService(ChatRoomOperationService.class);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f111939i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f111940j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<hu.a> f111941k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<hu.a[]> f111942l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final o f111943m;

    /* JADX INFO: renamed from: com.bilibili.tgwt.service.ChatVoiceRtcService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatVoiceRtcService$1.class */
    final class AnonymousClass1 extends SuspendLambda implements Function2<RoomBindChannelInfo, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final ChatVoiceRtcService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ChatVoiceRtcService chatVoiceRtcService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = chatVoiceRtcService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
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
            this.this$0.f111938g = roomBindChannelInfo.getChannelId();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.service.ChatVoiceRtcService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatVoiceRtcService$2.class */
    final class AnonymousClass2 extends SuspendLambda implements Function2<RoomCreateOrLeaveChannelEvent, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final ChatVoiceRtcService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ChatVoiceRtcService chatVoiceRtcService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = chatVoiceRtcService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invoke(RoomCreateOrLeaveChannelEvent roomCreateOrLeaveChannelEvent, Continuation<? super Unit> continuation) {
            return create(roomCreateOrLeaveChannelEvent, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (!((RoomCreateOrLeaveChannelEvent) this.L$0).isCreateChannel()) {
                this.this$0.f111938g = "";
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.service.ChatVoiceRtcService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatVoiceRtcService$3.class */
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final ChatVoiceRtcService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ChatVoiceRtcService chatVoiceRtcService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = chatVoiceRtcService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r9 = r0
                r0 = r5
                int r0 = r0.label
                r7 = r0
                r0 = r7
                if (r0 == 0) goto L37
                r0 = r7
                r1 = 1
                if (r0 == r1) goto L1d
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L1d:
                r0 = r5
                java.lang.Object r0 = r0.L$0
                com.bilibili.tgwt.service.ChatVoiceRtcService r0 = (com.bilibili.tgwt.service.ChatVoiceRtcService) r0
                r9 = r0
                r0 = r9
                r8 = r0
                r0 = r6
                kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L33
                r0 = r9
                r6 = r0
                goto L5a
            L33:
                r6 = move-exception
                goto L6e
            L37:
                r0 = r6
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r5
                com.bilibili.tgwt.service.ChatVoiceRtcService r0 = r0.this$0
                r8 = r0
                r0 = r5
                r1 = r8
                r0.L$0 = r1     // Catch: java.lang.Throwable -> L6d
                r0 = r5
                r1 = 1
                r0.label = r1     // Catch: java.lang.Throwable -> L6d
                r0 = r5
                java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)     // Catch: java.lang.Throwable -> L6d
                r6 = r0
                r0 = r6
                r1 = r9
                if (r0 != r1) goto L58
                r0 = r9
                return r0
            L58:
                r0 = r8
                r6 = r0
            L5a:
                r0 = r6
                r8 = r0
                kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L33
                r9 = r0
                r0 = r6
                r8 = r0
                r0 = r9
                r0.<init>()     // Catch: java.lang.Throwable -> L33
                r0 = r6
                r8 = r0
                r0 = r9
                throw r0     // Catch: java.lang.Throwable -> L33
            L6d:
                r6 = move-exception
            L6e:
                r0 = r8
                com.bilibili.tgwt.service.u r0 = r0.f111937f
                r8 = r0
                r0 = r8
                if (r0 == 0) goto L8f
                r0 = r8
                com.bilibili.bililive.bilirtc.BiliRtcClientProxy r0 = r0.f112010d
                r9 = r0
                r0 = r9
                if (r0 == 0) goto L8a
                r0 = r9
                r1 = 0
                r2 = 1
                r3 = 0
                com.bilibili.bililive.bilirtc.BiliRtcClientProxy.destroy$default(r0, r1, r2, r3)
            L8a:
                r0 = r8
                r1 = 0
                r0.f112010d = r1
            L8f:
                r0 = r6
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.service.ChatVoiceRtcService.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public ChatVoiceRtcService(@NotNull NewSeasonService newSeasonService, @NotNull ChatRoomManagerService chatRoomManagerService, @NotNull Context context, @NotNull CoroutineScope coroutineScope, @NotNull Kl.a aVar) {
        this.f111932a = newSeasonService;
        this.f111933b = chatRoomManagerService;
        this.f111934c = context;
        this.f111935d = coroutineScope;
        this.f111936e = aVar;
        Boolean bool = Boolean.FALSE;
        this.f111939i = StateFlowKt.MutableStateFlow(bool);
        this.f111940j = StateFlowKt.MutableStateFlow(bool);
        this.f111941k = SharedFlowKt.MutableSharedFlow$default(0, 1, (BufferOverflow) null, 5, (Object) null);
        this.f111942l = SharedFlowKt.MutableSharedFlow$default(0, 1, (BufferOverflow) null, 5, (Object) null);
        this.f111943m = new o(this);
        FlowKt.launchIn(FlowKt.onEach(chatRoomManagerService.f110896J, new AnonymousClass1(this, null)), coroutineScope);
        FlowKt.launchIn(FlowKt.onEach(chatRoomManagerService.f110895I, new AnonymousClass2(this, null)), coroutineScope);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
    }

    public static void c(@NotNull com.bilibili.tgwt.detail.chat.m mVar, @NotNull hu.a aVar) {
        float f7 = aVar.b / 150.0f;
        mVar.o(RangesKt.coerceAtMost(f7, 1.0f));
        if (f7 > 0.75d) {
            int i7 = mVar.f111073f;
            int i8 = mVar.f111072e;
            if (i8 == i7) {
                return;
            }
            mVar.f111073f = i8;
            mVar.notifyPropertyChanged(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAIR_SEGMENT_USE_TEMPERATURE);
            return;
        }
        int i9 = mVar.f111073f;
        int i10 = mVar.f111070c;
        if (i10 == i9) {
            return;
        }
        mVar.f111073f = i10;
        mVar.notifyPropertyChanged(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAIR_SEGMENT_USE_TEMPERATURE);
    }

    public static void d(@NotNull com.bilibili.tgwt.detail.chat.m mVar, @NotNull hu.a aVar) {
        mVar.o(RangesKt.coerceAtMost(aVar.b / 150.0f, 1.0f));
    }

    public final boolean a() {
        return ((Boolean) this.f111939i.getValue()).booleanValue();
    }

    public final void b() {
        BLog.i("ChatVoiceRtcService-leaveChannel", "[together-watch-ChatVoiceRtcService-leaveChannel] leaveChannel");
        if (a()) {
            BuildersKt.launch$default(this.f111935d, (CoroutineContext) null, (CoroutineStart) null, new ChatVoiceRtcService$leaveChannel$1(this, null), 3, (Object) null);
        }
    }

    public final void e(@NotNull String str) {
        ChatRoomInfo chatRoomInfo;
        BLog.i("ChatVoiceRtcService-tryJoinChannel", "[together-watch-ChatVoiceRtcService-tryJoinChannel] tryJoinChannel");
        String str2 = str;
        if (StringsKt.isBlank(str)) {
            str2 = this.f111938g;
        }
        if (StringsKt.isBlank(str2) || !PermissionsChecker.checkSelfPermissions(this.f111934c, new String[]{"android.permission.RECORD_AUDIO"}) || ((Boolean) this.f111939i.getValue()).booleanValue() || !((Boolean) this.f111940j.getValue()).booleanValue() || a()) {
            return;
        }
        BLog.i("ChatVoiceRtcService-joinChannel", "[together-watch-ChatVoiceRtcService-joinChannel] joinChannel");
        BangumiUniformSeason season = this.f111932a.getSeason();
        if (season == null || (chatRoomInfo = season.E) == null) {
            return;
        }
        BuildersKt.launch$default(this.f111935d, (CoroutineContext) null, (CoroutineStart) null, new ChatVoiceRtcService$joinChannel$1(this, chatRoomInfo.e(), str2, null), 3, (Object) null);
    }
}
