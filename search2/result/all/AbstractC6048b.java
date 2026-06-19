package com.bilibili.search2.result.all;

import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.SearchOgvRelationItem;
import dt0.AbstractC6839b;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.search2.result.all.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/b.class */
@StabilityInferred(parameters = 0)
public abstract class AbstractC6048b<VH extends AbstractC6839b<? super V>, V extends BaseSearchItem> extends RecyclerView.Adapter<VH> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public List<V> f87275a = new ArrayList();

    public static void N(AbstractC6048b abstractC6048b, SearchOgvRelationItem.DetailsRelationItem detailsRelationItem) {
        abstractC6048b.f87275a.add(detailsRelationItem);
        abstractC6048b.notifyItemInserted(abstractC6048b.f87275a.size() - 1);
    }

    public static void S(AbstractC6048b abstractC6048b, List list) {
        abstractC6048b.getClass();
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        abstractC6048b.f87275a.clear();
        abstractC6048b.f87275a.addAll(list2);
        abstractC6048b.notifyDataSetChanged();
    }

    public void O(@NotNull VH vh, int i7) {
        AbstractC6839b.bindData$default(vh, (K90.c) CollectionsKt.getOrNull(this.f87275a, i7), false, 2, null);
    }

    @Nullable
    public abstract AbstractC6839b P(int i7, @NotNull ViewGroup viewGroup);

    @Nullable
    public final V Q(int i7) {
        return (V) CollectionsKt.getOrNull(this.f87275a, i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public AbstractC6839b onCreateViewHolder(int i7, @NotNull ViewGroup viewGroup) {
        return P(i7, viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f87275a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i7) {
        BaseSearchItem baseSearchItem = (BaseSearchItem) CollectionsKt.getOrNull(this.f87275a, i7);
        return baseSearchItem != null ? ((K90.c) baseSearchItem).viewType : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        O((AbstractC6839b) viewHolder, i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7, List list) {
        AbstractC6839b abstractC6839b = (AbstractC6839b) viewHolder;
        if (list.isEmpty()) {
            O(abstractC6839b, i7);
        } else {
            AbstractC6839b.bindData$default(abstractC6839b, (K90.c) CollectionsKt.getOrNull(this.f87275a, i7), list, false, 4, null);
        }
    }
}
