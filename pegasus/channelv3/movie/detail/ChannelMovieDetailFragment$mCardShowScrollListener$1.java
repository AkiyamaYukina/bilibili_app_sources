package com.bilibili.pegasus.channelv3.movie.detail;

import N1.s;
import com.bilibili.lib.neuron.api.Neurons;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/detail/ChannelMovieDetailFragment$mCardShowScrollListener$1.class */
public final /* synthetic */ class ChannelMovieDetailFragment$mCardShowScrollListener$1 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
    public ChannelMovieDetailFragment$mCardShowScrollListener$1(Object obj) {
        super(1, obj, ChannelMovieDetailFragment.class, "reportCardShow", "reportCardShow(I)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i7) {
        ChannelMovieDetailFragment channelMovieDetailFragment = (ChannelMovieDetailFragment) ((CallableReference) this).receiver;
        c cVar = channelMovieDetailFragment.f75346e;
        c cVar2 = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            cVar2 = null;
        }
        List<e> list = cVar2.f75365c;
        e eVar = null;
        if (list != null) {
            eVar = (e) CollectionsKt.getOrNull(list, i7);
        }
        if (eVar == null || eVar.f75374e) {
            return;
        }
        eVar.f75374e = true;
        ChannelMovieDetailVM channelMovieDetailVMKf = channelMovieDetailFragment.kf();
        HashMap mapHashMapOf = MapsKt.hashMapOf(new Pair[]{TuplesKt.to("channel_id", String.valueOf(channelMovieDetailVMKf.f75351b)), TuplesKt.to("from", channelMovieDetailVMKf.f75352c), TuplesKt.to("page_entity_id", String.valueOf(channelMovieDetailVMKf.f75353d)), TuplesKt.to("page_entity_name", channelMovieDetailVMKf.f75354e)});
        s.b(i7, 1, mapHashMapOf, "pos");
        mapHashMapOf.putAll(MapsKt.hashMapOf(new Pair[]{TuplesKt.to("entity_name", eVar.f75370a), TuplesKt.to("entity_id", String.valueOf(eVar.f75373d))}));
        Neurons.reportExposure$default(false, "traffic.movie-channel-detail-detail.head-entry.0.show", mapHashMapOf, (List) null, 8, (Object) null);
    }
}
