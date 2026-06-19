package com.bilibili.ship.theseus.ogv.media;

import com.bapis.bilibili.app.playerunite.pgcanymodel.PGCAnyModel;
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bapis.bilibili.pgc.gateway.player.v2.ClipInfo;
import com.bapis.bilibili.pgc.gateway.player.v2.ClipType;
import com.bilibili.lib.moss.util.any.AnyKt;
import com.google.protobuf.Any;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/OgvPlayableParamsAdjustmentService$1.class */
public final class OgvPlayableParamsAdjustmentService$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final n this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/OgvPlayableParamsAdjustmentService$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f93990a;

        public a(n nVar) {
            this.f93990a = nVar;
        }

        public final Object emit(Object obj, Continuation continuation) {
            T next;
            Any supplement = ((PlayViewUniteReply) obj).getSupplement();
            Iterator<T> it = (!Intrinsics.areEqual(supplement.getTypeUrl(), "type.googleapis.com/bilibili.app.playerunite.pgcanymodel.PGCAnyModel") ? PGCAnyModel.getDefaultInstance() : AnyKt.unpackSansTypeUrl(supplement, PGCAnyModel.class)).getBusiness().getClipInfoList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((ClipInfo) next).getClipType() == ClipType.CLIP_TYPE_HE) {
                    break;
                }
            }
            ClipInfo clipInfo = (ClipInfo) next;
            n nVar = this.f93990a;
            if (clipInfo != null) {
                Map extraJsonParams = nVar.f94021b.f().getExtraJsonParams();
                com.bilibili.ship.theseus.keel.player.j jVar = nVar.f94021b;
                if (extraJsonParams == null) {
                    jVar.f().setExtraJsonParams(new LinkedHashMap());
                }
                jVar.f().getExtraJsonParams().put("current_material_no", String.valueOf(clipInfo.getMaterialNo()));
            } else {
                Map extraJsonParams2 = nVar.f94021b.f().getExtraJsonParams();
                if (extraJsonParams2 != null) {
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvPlayableParamsAdjustmentService$1(n nVar, Continuation<? super OgvPlayableParamsAdjustmentService$1> continuation) {
        super(2, continuation);
        this.this$0 = nVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvPlayableParamsAdjustmentService$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<PlayViewUniteReply> flowG = this.this$0.f94021b.g();
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
