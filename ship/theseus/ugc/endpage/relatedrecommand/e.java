package com.bilibili.ship.theseus.ugc.endpage.relatedrecommand;

import com.bapis.bilibili.app.viewunite.v1.ViewEndPageCard;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/e.class */
public final class e<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t7, T t8) {
        return ComparisonsKt.compareValues(Long.valueOf(((ViewEndPageCard) t7).getCardIndex()), Long.valueOf(((ViewEndPageCard) t8).getCardIndex()));
    }
}
