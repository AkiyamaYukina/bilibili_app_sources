package com.bilibili.ship.theseus.cheese.player.media;

import com.bapis.bilibili.app.playerunite.pugvanymodel.ClipInfo;
import com.bapis.bilibili.app.playerunite.pugvanymodel.ClipType;
import com.bapis.bilibili.app.playerunite.pugvanymodel.PUGVAnyModel;
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bilibili.lib.moss.util.any.AnyKt;
import com.bilibili.ship.theseus.keel.player.j;
import com.google.protobuf.InvalidProtocolBufferException;
import hu0.C7503a;
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
import tb0.h;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/media/CheesePlayableParamsAdjustmentService$1.class */
public final class CheesePlayableParamsAdjustmentService$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final c this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/media/CheesePlayableParamsAdjustmentService$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f90637a;

        public a(c cVar) {
            this.f90637a = cVar;
        }

        public final Object emit(Object obj, Continuation continuation) {
            PUGVAnyModel defaultInstance;
            try {
                defaultInstance = (PUGVAnyModel) AnyKt.unpack(((PlayViewUniteReply) obj).getSupplement(), PUGVAnyModel.class);
            } catch (InvalidProtocolBufferException e7) {
                defaultInstance = PUGVAnyModel.getDefaultInstance();
            }
            h hVar = C7503a.f121482a;
            ClipInfo clipInfo = defaultInstance.getClipInfo();
            if (clipInfo.getClipType() != ClipType.CLIP_TYPE_HE) {
                clipInfo = null;
            }
            c cVar = this.f90637a;
            if (clipInfo != null) {
                Map extraJsonParams = cVar.f90640b.f().getExtraJsonParams();
                j jVar = cVar.f90640b;
                if (extraJsonParams == null) {
                    jVar.f().setExtraJsonParams(new LinkedHashMap());
                }
                jVar.f().getExtraJsonParams().put("current_material_no", String.valueOf(clipInfo.getMaterialNo()));
            } else {
                Map extraJsonParams2 = cVar.f90640b.f().getExtraJsonParams();
                if (extraJsonParams2 != null) {
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheesePlayableParamsAdjustmentService$1(c cVar, Continuation<? super CheesePlayableParamsAdjustmentService$1> continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheesePlayableParamsAdjustmentService$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<PlayViewUniteReply> flowG = this.this$0.f90640b.g();
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
