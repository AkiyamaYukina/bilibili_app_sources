package com.bilibili.tgwt.detail.chat;

import com.bilibili.chatroomsdk.ChatRoomMember;
import com.bilibili.tgwt.ui.TogetherWatchDetailPageViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/ChatVoiceFragment$subscribe$8.class */
final class ChatVoiceFragment$subscribe$8 extends SuspendLambda implements Function2<Long, Continuation<? super Unit>, Object> {
    long J$0;
    int label;
    final ChatVoiceFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatVoiceFragment$subscribe$8(ChatVoiceFragment chatVoiceFragment, Continuation<? super ChatVoiceFragment$subscribe$8> continuation) {
        super(2, continuation);
        this.this$0 = chatVoiceFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatVoiceFragment$subscribe$8 chatVoiceFragment$subscribe$8 = new ChatVoiceFragment$subscribe$8(this.this$0, continuation);
        chatVoiceFragment$subscribe$8.J$0 = ((Number) obj).longValue();
        return chatVoiceFragment$subscribe$8;
    }

    public final Object invoke(long j7, Continuation<? super Unit> continuation) {
        return create(Long.valueOf(j7), continuation).invokeSuspend(Unit.INSTANCE);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).longValue(), (Continuation<? super Unit>) obj2);
    }

    public final Object invokeSuspend(Object obj) {
        ChatRoomMember chatRoomMember;
        Object next;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        long j7 = this.J$0;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.this$0.f111045c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
        if (togetherWatchDetailPageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel2 = null;
        }
        List<ChatRoomMember> listJ = togetherWatchDetailPageViewModel2.getChatRoomManagerService().j();
        if (listJ != null) {
            Iterator<T> it = listJ.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((ChatRoomMember) next).getMid() != com.bilibili.ogv.infra.account.a.f67852b.mid()) {
                    break;
                }
            }
            chatRoomMember = (ChatRoomMember) next;
        } else {
            chatRoomMember = null;
        }
        u uVar = this.this$0.f111044b;
        u uVar2 = uVar;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            uVar2 = null;
        }
        boolean z6 = chatRoomMember != null && j7 > 0;
        if (z6 != uVar2.f111155n) {
            uVar2.f111155n = z6;
            uVar2.notifyPropertyChanged(741);
        }
        u uVar3 = this.this$0.f111044b;
        if (uVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            uVar3 = null;
        }
        String string = this.this$0.getString(2131836342, Boxing.boxLong(j7));
        if (!Intrinsics.areEqual(string, uVar3.f111153l)) {
            uVar3.f111153l = string;
            uVar3.notifyPropertyChanged(740);
        }
        return Unit.INSTANCE;
    }
}
