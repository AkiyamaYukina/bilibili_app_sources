package com.bilibili.topix.center;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/s.class */
@StabilityInferred(parameters = 0)
public class s extends RecyclerView.Adapter<v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Jq.g f112437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<com.bilibili.topix.model.TopicItem> f112438b = new ArrayList();

    public s(@NotNull Jq.g gVar) {
        this.f112437a = gVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return ((ArrayList) this.f112438b).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        v vVar = (v) viewHolder;
        com.bilibili.topix.model.TopicItem topicItem = (com.bilibili.topix.model.TopicItem) CollectionsKt.getOrNull(this.f112438b, i7);
        vVar.itemView.setTag(topicItem);
        vVar.f112442b.setText(topicItem != null ? topicItem.f : null);
        vVar.f112443c.setText(topicItem != null ? topicItem.g : null);
        TextView textView = vVar.f112443c;
        String str = null;
        if (topicItem != null) {
            str = topicItem.g;
        }
        textView.setVisibility((str == null || StringsKt.isBlank(str)) ? 8 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        return new v(viewGroup, this.f112437a);
    }
}
