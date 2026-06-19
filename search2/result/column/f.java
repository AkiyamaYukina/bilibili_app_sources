package com.bilibili.search2.result.column;

import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.result.ArticleHolderV3;
import com.bilibili.search2.result.all.C6053g;
import com.bilibili.search2.result.base.w;
import com.bilibili.search2.result.holder.comment.CommentHolder;
import com.bilibili.search2.result.holder.dynamic.DynamicFeedHolderV3;
import dt0.AbstractC6839b;
import dt0.AbstractC6843f;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/column/f.class */
@StabilityInferred(parameters = 0)
public final class f extends w<AbstractC6843f<BaseSearchItem>> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final SearchResultColumnFragment f87744e;

    public f(@NotNull SearchResultColumnFragment searchResultColumnFragment, @NotNull Function1 function1) {
        super(function1);
        this.f87744e = searchResultColumnFragment;
    }

    @Override // com.bilibili.search2.result.all.AbstractC6048b
    public final AbstractC6839b P(int i7, ViewGroup viewGroup) {
        AbstractC6839b abstractC6839bA;
        if (i7 == -1828843052) {
            abstractC6839bA = DynamicFeedHolderV3.f88127q.create(viewGroup);
        } else if (i7 == 818559703) {
            abstractC6839bA = ArticleHolderV3.f87050p.create(viewGroup);
        } else if (i7 == 950398559) {
            abstractC6839bA = CommentHolder.f88123d.create(viewGroup);
        } else {
            int i8 = C6053g.f87282b;
            abstractC6839bA = C6053g.a.a(viewGroup);
        }
        abstractC6839bA.bindFragment(this.f87744e);
        return abstractC6839bA;
    }
}
