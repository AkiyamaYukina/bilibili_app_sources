package com.bilibili.ship.theseus.ogv.videopiece;

import com.bapis.bilibili.playershared.FragmentVideoInfo;
import com.bilibili.adcommon.data.model.SourceContent;
import com.bilibili.ship.theseus.ogv.videopiece.AdPieceStockReporter;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/AdPieceStockReporter$2$1.class */
public final class AdPieceStockReporter$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final List<FragmentVideoInfo> $postList;
    final SourceContent $sc;
    int label;
    final AdPieceStockReporter this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/AdPieceStockReporter$2$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AdPieceStockReporter f94789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<FragmentVideoInfo> f94790b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SourceContent f94791c;

        public a(AdPieceStockReporter adPieceStockReporter, List<FragmentVideoInfo> list, SourceContent sourceContent) {
            this.f94789a = adPieceStockReporter;
            this.f94790b = list;
            this.f94791c = sourceContent;
        }

        public final Object emit(Object obj, Continuation continuation) {
            ((Duration) obj).unbox-impl();
            AdPieceStockReporter adPieceStockReporter = this.f94789a;
            AdPieceStockReporter.a aVar = adPieceStockReporter.f94776b;
            if (!aVar.f94795b) {
                aVar.f94795b = true;
                AdPieceStockReporter.a(adPieceStockReporter, (FragmentVideoInfo) CollectionsKt.firstOrNull(this.f94790b), this.f94791c);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdPieceStockReporter$2$1(AdPieceStockReporter adPieceStockReporter, List<FragmentVideoInfo> list, SourceContent sourceContent, Continuation<? super AdPieceStockReporter$2$1> continuation) {
        super(2, continuation);
        this.this$0 = adPieceStockReporter;
        this.$postList = list;
        this.$sc = sourceContent;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdPieceStockReporter$2$1(this.this$0, this.$postList, this.$sc, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.f94777c.p().J());
            AdPieceStockReporter adPieceStockReporter = this.this$0;
            a aVar = new a(adPieceStockReporter, this.$postList, this.$sc);
            this.label = 1;
            Object objCollect = flowFilterNotNull.collect(new AdPieceStockReporter$2$1$invokeSuspend$$inlined$filter$1$2(aVar, adPieceStockReporter), this);
            if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objCollect = Unit.INSTANCE;
            }
            if (objCollect == coroutine_suspended) {
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
