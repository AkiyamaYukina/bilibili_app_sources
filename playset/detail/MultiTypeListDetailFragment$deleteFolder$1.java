package com.bilibili.playset.detail;

import android.content.Context;
import com.bilibili.lib.theme.R$color;
import com.bilibili.playset.detail.data.f;
import com.bilibili.playset.playlist.helper.b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.bili.widget.dialog.BiliCommonDialog;
import tv.danmaku.bili.widget.dialog.CustomButtonInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/MultiTypeListDetailFragment$deleteFolder$1.class */
final class MultiTypeListDetailFragment$deleteFolder$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $playlistId;
    int label;
    final MultiTypeListDetailFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTypeListDetailFragment$deleteFolder$1(MultiTypeListDetailFragment multiTypeListDetailFragment, long j7, Continuation<? super MultiTypeListDetailFragment$deleteFolder$1> continuation) {
        super(2, continuation);
        this.this$0 = multiTypeListDetailFragment;
        this.$playlistId = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MultiTypeListDetailFragment$deleteFolder$1(this.this$0, this.$playlistId, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Context context = this.this$0.getContext();
            if (context == null) {
                return Unit.INSTANCE;
            }
            com.bilibili.playset.detail.components.l lVar = (com.bilibili.playset.detail.components.l) this.this$0.f84261m.getValue();
            this.label = 1;
            lVar.getClass();
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            BiliCommonDialog.Builder.setPositiveButton$default(BiliCommonDialog.Builder.setNegativeButton$default(new BiliCommonDialog.Builder(context).setTitle(2131842587).setContentText(context.getString(2131842591)), 2131841494, new com.bilibili.playset.detail.components.j(cancellableContinuationImpl), true, (CustomButtonInfo) null, 8, (Object) null), 2131841356, new com.bilibili.playset.detail.components.k(cancellableContinuationImpl), true, (CustomButtonInfo) null, 8, (Object) null).setTitleColorRes(R$color.Text1).setButtonStyle(1).setCanceledOnTouchOutside(false).build().show(lVar.f84323a, "favorites_v2");
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            obj = result;
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            b.a aVar = b.a.f85324a;
            aVar.a("playlist.playlist-detail.PLmanage-more.*.click");
            aVar.c("manage", "2");
            b.a.b();
            this.this$0.mf().M0(new f.j(this.$playlistId));
        }
        return Unit.INSTANCE;
    }
}
