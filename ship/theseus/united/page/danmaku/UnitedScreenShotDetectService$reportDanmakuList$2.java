package com.bilibili.ship.theseus.united.page.danmaku;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.biliplayerv2.service.interact.biz.model.comment.CommentItem;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/UnitedScreenShotDetectService$reportDanmakuList$2.class */
final class UnitedScreenShotDetectService$reportDanmakuList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Ref.ObjectRef<String> $danmakuList;
    final List<CommentItem> $list;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitedScreenShotDetectService$reportDanmakuList$2(List<? extends CommentItem> list, Ref.ObjectRef<String> objectRef, Continuation<? super UnitedScreenShotDetectService$reportDanmakuList$2> continuation) {
        super(2, continuation);
        this.$list = list;
        this.$danmakuList = objectRef;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnitedScreenShotDetectService$reportDanmakuList$2(this.$list, this.$danmakuList, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List<CommentItem> list = this.$list;
        List<CommentItem> list2 = list;
        Ref.ObjectRef<String> objectRef = this.$danmakuList;
        int i7 = 0;
        for (Object obj2 : list2) {
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            CommentItem commentItem = (CommentItem) obj2;
            if (i7 != list.size() - 1) {
                objectRef.element = objectRef.element + commentItem.mRemoteDmId + ",";
            } else {
                objectRef.element = objectRef.element + commentItem.mRemoteDmId;
            }
            i7++;
        }
        return Unit.INSTANCE;
    }
}
