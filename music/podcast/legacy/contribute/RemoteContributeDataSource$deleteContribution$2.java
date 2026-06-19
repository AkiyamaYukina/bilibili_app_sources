package com.bilibili.music.podcast.legacy.contribute;

import androidx.compose.foundation.gestures.o0;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.coroutineextension.BiliCallExtKt;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/legacy/contribute/RemoteContributeDataSource$deleteContribution$2.class */
final class RemoteContributeDataSource$deleteContribution$2 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
    final long $songId;
    int label;
    final a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteContributeDataSource$deleteContribution$2(a aVar, long j7, Continuation<? super RemoteContributeDataSource$deleteContribution$2> continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$songId = j7;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new RemoteContributeDataSource$deleteContribution$2(this.this$0, this.$songId, continuation);
    }

    public final Object invoke(Continuation<? super String> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            Ref.LongRef longRefB = o0.b(obj);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            BiliAccounts biliAccounts = BiliAccounts.get(FoundationAlias.getFapp());
            longRefB.element = biliAccounts.mid();
            String accessKey = biliAccounts.getAccessKey();
            objectRef.element = accessKey;
            BiliCall<GeneralResponse<String>> biliCallDeleteContribution = this.this$0.f66822a.deleteContribution(this.$songId, longRefB.element, accessKey);
            this.label = 1;
            Object data = BiliCallExtKt.getData(biliCallDeleteContribution, this);
            obj = data;
            if (data == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
