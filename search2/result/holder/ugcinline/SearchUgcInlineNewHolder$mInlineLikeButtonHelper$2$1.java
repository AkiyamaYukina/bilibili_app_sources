package com.bilibili.search2.result.holder.ugcinline;

import com.bilibili.search2.api.SearchUgcInline;
import com.bilibili.search2.result.repo.SearchInlineRepository;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tv.danmaku.video.bilicardplayer.DataRelationShipChain;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/ugcinline/SearchUgcInlineNewHolder$mInlineLikeButtonHelper$2$1.class */
public final /* synthetic */ class SearchUgcInlineNewHolder$mInlineLikeButtonHelper$2$1 extends FunctionReferenceImpl implements Function1<Long, Unit> {
    public SearchUgcInlineNewHolder$mInlineLikeButtonHelper$2$1(Object obj) {
        super(1, obj, SearchUgcInlineNewHolder.class, "notifyChronosDataUpdate", "notifyChronosDataUpdate(J)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return Unit.INSTANCE;
    }

    public final void invoke(long j7) {
        SearchInlineRepository searchInlineRepository;
        SearchUgcInlineNewHolder searchUgcInlineNewHolder = (SearchUgcInlineNewHolder) ((CallableReference) this).receiver;
        int i7 = SearchUgcInlineNewHolder.f88223F;
        if (j7 != ((SearchUgcInline) searchUgcInlineNewHolder.getData()).getAid() || (searchInlineRepository = searchUgcInlineNewHolder.f116703b) == null) {
            return;
        }
        searchInlineRepository.updateRepositoryData((DataRelationShipChain) searchUgcInlineNewHolder.getData());
    }
}
