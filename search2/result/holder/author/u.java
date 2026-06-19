package com.bilibili.search2.result.holder.author;

import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.SearchAuthorNew;
import com.bilibili.search2.result.all.AbstractC6048b;
import dt0.AbstractC6839b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/author/u.class */
@StabilityInferred(parameters = 0)
public final class u extends AbstractC6048b<AbstractC6839b<SearchAuthorNew.AvItem>, SearchAuthorNew.AvItem> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final BaseSearchItem f87895b;

    public u(@NotNull BaseSearchItem baseSearchItem) {
        this.f87895b = baseSearchItem;
    }

    @Override // com.bilibili.search2.result.all.AbstractC6048b
    public final AbstractC6839b P(int i7, ViewGroup viewGroup) {
        return new w(viewGroup, this.f87895b);
    }
}
