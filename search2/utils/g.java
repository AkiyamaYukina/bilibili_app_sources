package com.bilibili.search2.utils;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.api.BiliApiException;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.search2.result.all.SearchResultAllFragment;
import java.util.Collection;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/g.class */
@StabilityInferred(parameters = 1)
public abstract class g implements hg.a {
    public final void a(@NotNull Map<Long, gg.b> map) {
        SearchResultAllFragment searchResultAllFragment = ((SearchResultAllFragment.d) this).f87221a;
        Context context = searchResultAllFragment.getContext();
        if (context == null || map.isEmpty()) {
            return;
        }
        Collection<gg.b> collectionValues = map.values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            for (gg.b bVar : collectionValues) {
                if (!bVar.b) {
                    BiliApiException biliApiException = bVar.f;
                    BiliApiException biliApiException2 = biliApiException instanceof BiliApiException ? biliApiException : null;
                    if (biliApiException2 != null && biliApiException2.mCode == 16004) {
                        PromoToast.showBottomToast(searchResultAllFragment.getContext(), 2131847881);
                        return;
                    }
                }
            }
        }
        gg.b bVar2 = (gg.b) CollectionsKt.firstOrNull(map.values());
        if (bVar2 == null) {
            return;
        }
        if (bVar2.b) {
            PromoToast.showBottomToast(searchResultAllFragment.getContext(), 2131847699);
        } else {
            PromoToast.showBottomToast(context, 2131847888);
        }
    }
}
