package com.bilibili.ship.theseus.ugc.play.media;

import com.bapis.bilibili.app.playerunite.ugcanymodel.ClipInfo;
import com.bapis.bilibili.app.playerunite.ugcanymodel.UGCAnyModel;
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bilibili.lib.moss.util.any.AnyKt;
import com.bilibili.ship.theseus.keel.player.j;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/media/UGCPlayableParamsAdjustmentService$1.class */
public final class UGCPlayableParamsAdjustmentService$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final b this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/media/UGCPlayableParamsAdjustmentService$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f98108a;

        public a(b bVar) {
            this.f98108a = bVar;
        }

        public final Object emit(Object obj, Continuation continuation) {
            UGCAnyModel defaultInstance;
            try {
                defaultInstance = (UGCAnyModel) AnyKt.unpack(((PlayViewUniteReply) obj).getSupplement(), UGCAnyModel.class);
            } catch (InvalidProtocolBufferException e7) {
                defaultInstance = UGCAnyModel.getDefaultInstance();
            }
            ClipInfo clipInfoA = com.bilibili.ship.theseus.ugc.play.b.a(defaultInstance);
            b bVar = this.f98108a;
            if (clipInfoA != null) {
                Map extraJsonParams = bVar.f98111b.f().getExtraJsonParams();
                j jVar = bVar.f98111b;
                if (extraJsonParams == null) {
                    jVar.f().setExtraJsonParams(new LinkedHashMap());
                }
                jVar.f().getExtraJsonParams().put("current_material_no", String.valueOf(clipInfoA.getMaterialNo()));
            } else {
                Map extraJsonParams2 = bVar.f98111b.f().getExtraJsonParams();
                if (extraJsonParams2 != null) {
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCPlayableParamsAdjustmentService$1(b bVar, Continuation<? super UGCPlayableParamsAdjustmentService$1> continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UGCPlayableParamsAdjustmentService$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<PlayViewUniteReply> flowG = this.this$0.f98111b.g();
            a aVar = new a(this.this$0);
            this.label = 1;
            if (flowG.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
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
