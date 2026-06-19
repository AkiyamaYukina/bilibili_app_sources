package com.bilibili.tgwt.service;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformEpisode;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.logic.page.detail.service.refactor.BangumiPopFragmentService;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import com.bilibili.ogv.pub.chat.ChangeRoomInitial;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import sl0.InterfaceC8598b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$showChangeRoomPageFragment$2.class */
final class ChatService$showChangeRoomPageFragment$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final BangumiPopFragmentService.PopLayerRecord $token;
    private Object L$0;
    int label;
    final ChatService this$0;

    /* JADX INFO: renamed from: com.bilibili.tgwt.service.ChatService$showChangeRoomPageFragment$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$showChangeRoomPageFragment$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final BangumiPopFragmentService.PopLayerRecord $token;
        int label;
        final ChatService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BangumiPopFragmentService.PopLayerRecord popLayerRecord, ChatService chatService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$token = popLayerRecord;
            this.this$0 = chatService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$token, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Fragment fragment;
            Object objCoroutineScope;
            BangumiUniformSeason season;
            BangumiUniformEpisode currentPlayedEpisode;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                BangumiPopFragmentService.PopLayerRecord popLayerRecord = this.$token;
                if (popLayerRecord != null && (fragment = popLayerRecord.getFragment()) != null) {
                    ChatService chatService = this.this$0;
                    this.label = 1;
                    chatService.getClass();
                    if (!(fragment instanceof InterfaceC8598b) || (season = chatService.f111882c.getSeason()) == null || (currentPlayedEpisode = chatService.f111888f.getCurrentPlayedEpisode()) == null) {
                        objCoroutineScope = Unit.INSTANCE;
                    } else {
                        ChatRoomInfo chatRoomInfo = season.E;
                        long jT = chatRoomInfo != null ? chatRoomInfo.t() : 0L;
                        int i8 = season.h;
                        String str = currentPlayedEpisode.i;
                        String str2 = str;
                        if (str == null) {
                            str2 = "";
                        }
                        ChangeRoomInitial changeRoomInitial = new ChangeRoomInitial(jT, season.a, i8, false, str2);
                        Bundle bundle = new Bundle();
                        bundle.putString("show_type", "0");
                        bundle.putParcelable("changeRoomInitial", changeRoomInitial);
                        fragment.setArguments(bundle);
                        objCoroutineScope = CoroutineScopeKt.coroutineScope(new ChatService$initChangeRoomPageFragment$2(chatService, season, fragment, null), this);
                        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objCoroutineScope = Unit.INSTANCE;
                        }
                    }
                    if (objCoroutineScope == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatService$showChangeRoomPageFragment$2(BangumiPopFragmentService.PopLayerRecord popLayerRecord, ChatService chatService, Continuation<? super ChatService$showChangeRoomPageFragment$2> continuation) {
        super(2, continuation);
        this.$token = popLayerRecord;
        this.this$0 = chatService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatService$showChangeRoomPageFragment$2 chatService$showChangeRoomPageFragment$2 = new ChatService$showChangeRoomPageFragment$2(this.$token, this.this$0, continuation);
        chatService$showChangeRoomPageFragment$2.L$0 = obj;
        return chatService$showChangeRoomPageFragment$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$token, this.this$0, null), 3, (Object) null);
    }
}
