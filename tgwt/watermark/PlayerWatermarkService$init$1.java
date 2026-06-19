package com.bilibili.tgwt.watermark;

import android.view.View;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.ogvcommon.play.resolver.EpisodeInfoVo;
import com.bilibili.ogvcommon.play.resolver.SeasonInfoVo;
import com.bilibili.ogvcommon.play.resolver.ViewInfoExtraVo;
import java.util.HashMap;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/watermark/PlayerWatermarkService$init$1.class */
final class PlayerWatermarkService$init$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final View $watermarkView;
    int label;
    final b this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/watermark/PlayerWatermarkService$init$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f112304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f112305b;

        public a(View view, b bVar) {
            this.f112304a = view;
            this.f112305b = bVar;
        }

        public final Object emit(Object obj, Continuation continuation) {
            SeasonInfoVo seasonInfoVoD;
            ViewInfoExtraVo viewInfoExtraVo = (ViewInfoExtraVo) obj;
            if (viewInfoExtraVo == null || viewInfoExtraVo.f73242f || !viewInfoExtraVo.f73247l || viewInfoExtraVo.c() != null) {
                this.f112304a.setVisibility(8);
            } else {
                this.f112304a.setVisibility(0);
                this.f112305b.getClass();
                EpisodeInfoVo episodeInfoVo = viewInfoExtraVo.f73248m;
                if (episodeInfoVo != null && (seasonInfoVoD = episodeInfoVo.d()) != null) {
                    HashMap map = new HashMap();
                    map.put("ep_id", String.valueOf(episodeInfoVo.a()));
                    map.put("season_id", String.valueOf(seasonInfoVoD.a()));
                    map.put("season_type", String.valueOf(seasonInfoVoD.b()));
                    Neurons.reportExposure$default(false, "pgc.player.watermark.0.show", map, (List) null, 8, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerWatermarkService$init$1(b bVar, View view, Continuation<? super PlayerWatermarkService$init$1> continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$watermarkView = view;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlayerWatermarkService$init$1(this.this$0, this.$watermarkView, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            StateFlow stateFlowViewInfoExtraFlow = this.this$0.f112310b.viewInfoExtraFlow();
            a aVar = new a(this.$watermarkView, this.this$0);
            this.label = 1;
            if (stateFlowViewInfoExtraFlow.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
