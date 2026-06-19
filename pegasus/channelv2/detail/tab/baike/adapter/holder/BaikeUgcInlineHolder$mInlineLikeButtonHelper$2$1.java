package com.bilibili.pegasus.channelv2.detail.tab.baike.adapter.holder;

import com.bilibili.pegasus.channelv2.detail.tab.baike.adapter.model.ChannelLargeCoverSingleV9Item;
import com.bilibili.pegasus.channelv2.detail.tab.baike.inline.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/adapter/holder/BaikeUgcInlineHolder$mInlineLikeButtonHelper$2$1.class */
public final /* synthetic */ class BaikeUgcInlineHolder$mInlineLikeButtonHelper$2$1 extends FunctionReferenceImpl implements Function1<Long, Unit> {
    public BaikeUgcInlineHolder$mInlineLikeButtonHelper$2$1(Object obj) {
        super(1, obj, BaikeUgcInlineHolder.class, "notifyChronosDataUpdate", "notifyChronosDataUpdate(J)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return Unit.INSTANCE;
    }

    public final void invoke(long j7) {
        g gVar;
        BaikeUgcInlineHolder baikeUgcInlineHolder = (BaikeUgcInlineHolder) ((CallableReference) this).receiver;
        int i7 = BaikeUgcInlineHolder.f75121s;
        ChannelLargeCoverSingleV9Item channelLargeCoverSingleV9Item = (ChannelLargeCoverSingleV9Item) baikeUgcInlineHolder.getData();
        if (channelLargeCoverSingleV9Item == null || j7 != channelLargeCoverSingleV9Item.getAid() || (gVar = baikeUgcInlineHolder.f75128o) == null) {
            return;
        }
        gVar.updateRepositoryData(channelLargeCoverSingleV9Item);
    }
}
