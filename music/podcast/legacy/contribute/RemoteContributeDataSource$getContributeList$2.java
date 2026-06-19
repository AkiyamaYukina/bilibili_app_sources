package com.bilibili.music.podcast.legacy.contribute;

import androidx.compose.foundation.gestures.o0;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.coroutineextension.BiliCallExtKt;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.music.podcast.legacy.data.ContributionPage;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/legacy/contribute/RemoteContributeDataSource$getContributeList$2.class */
final class RemoteContributeDataSource$getContributeList$2 extends SuspendLambda implements Function1<Continuation<? super ContributionPage>, Object> {
    final int $collectNum;
    final int $ctime;
    final int $pageIndex;
    final int $pageSize;
    final int $playNum;
    final int $status;
    int label;
    final a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteContributeDataSource$getContributeList$2(int i7, a aVar, int i8, int i9, int i10, int i11, int i12, Continuation<? super RemoteContributeDataSource$getContributeList$2> continuation) {
        super(1, continuation);
        this.$status = i7;
        this.this$0 = aVar;
        this.$pageIndex = i8;
        this.$pageSize = i9;
        this.$ctime = i10;
        this.$collectNum = i11;
        this.$playNum = i12;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new RemoteContributeDataSource$getContributeList$2(this.$status, this.this$0, this.$pageIndex, this.$pageSize, this.$ctime, this.$collectNum, this.$playNum, continuation);
    }

    public final Object invoke(Continuation<? super ContributionPage> continuation) {
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
            String str = accessKey;
            if (accessKey == null) {
                str = "";
            }
            objectRef.element = str;
            int i8 = this.$status;
            BiliCall<GeneralResponse<ContributionPage>> biliCallQueryContributionList = i8 == -1 ? this.this$0.f66822a.queryContributionList(longRefB.element, str, this.$pageIndex, this.$pageSize, this.$ctime, this.$collectNum, this.$playNum) : this.this$0.f66822a.queryContributionList(longRefB.element, str, this.$pageIndex, this.$pageSize, i8, this.$ctime, this.$collectNum, this.$playNum);
            this.label = 1;
            Object data = BiliCallExtKt.getData(biliCallQueryContributionList, this);
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
