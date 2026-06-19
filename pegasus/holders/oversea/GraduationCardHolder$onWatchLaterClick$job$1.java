package com.bilibili.pegasus.holders.oversea;

import androidx.activity.result.ActivityResultCaller;
import com.bilibili.lib.coroutineextension.BiliCallExtKt;
import com.bilibili.pegasus.common.inline.PlayerParamsBuilderKt;
import com.bilibili.pegasus.components.graduation.T;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/oversea/GraduationCardHolder$onWatchLaterClick$job$1.class */
final class GraduationCardHolder$onWatchLaterClick$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final boolean $add;
    final long $avid;
    final ip0.d $data;
    int label;
    final C5679d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraduationCardHolder$onWatchLaterClick$job$1(boolean z6, long j7, ip0.d dVar, C5679d c5679d, Continuation<? super GraduationCardHolder$onWatchLaterClick$job$1> continuation) {
        super(2, continuation);
        this.$add = z6;
        this.$avid = j7;
        this.$data = dVar;
        this.this$0 = c5679d;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GraduationCardHolder$onWatchLaterClick$job$1(this.$add, this.$avid, this.$data, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$add) {
                    long j7 = this.$avid;
                    this.label = 1;
                    Object data = BiliCallExtKt.getData(((InterfaceC5686k) C5685j.f78039a.getValue()).add(String.valueOf(j7), PlayerParamsBuilderKt.SPMID_RECOMMEND, "v2"), this);
                    if (data != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        data = Unit.INSTANCE;
                    }
                    if (data == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    long j8 = this.$avid;
                    this.label = 2;
                    Object data2 = BiliCallExtKt.getData(((InterfaceC5686k) C5685j.f78039a.getValue()).delete(String.valueOf(j8), false), this);
                    if (data2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        data2 = Unit.INSTANCE;
                    }
                    if (data2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i7 != 1 && i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$data.setAddedToWatchLaterLocal(this.$add);
            ip0.d dVar = (ip0.d) this.this$0.getBindData();
            if (dVar != null && dVar.getAid() == this.$avid) {
                C5679d c5679d = this.this$0;
                boolean z6 = this.$add;
                int i8 = C5679d.f77991G;
                c5679d.C0(z6);
            }
            C5679d c5679d2 = this.this$0;
            String str = this.$add ? "已添加到稍后再看" : "已取消稍后再看";
            int i9 = C5679d.f77991G;
            ActivityResultCaller fragment = c5679d2.getFragment();
            T t7 = fragment instanceof T ? (T) fragment : null;
            if (t7 != null) {
                t7.zb(str);
            }
            return Unit.INSTANCE;
        } catch (CancellationException e7) {
            throw e7;
        } catch (Throwable th) {
            BLog.w("GraduationCardHolder", com.bilibili.ad.adview.pegasus.holders.inline.pegasus.g.a(this.$avid, "toggle watch later failed, avid=", ", add=", this.$add), th);
            return Unit.INSTANCE;
        }
    }
}
