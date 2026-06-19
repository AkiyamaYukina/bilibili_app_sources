package com.bilibili.search2.result.holder.author;

import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.search2.inline.Option;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/author/o.class */
@StabilityInferred(parameters = 0)
public final class o extends RecyclerView.Adapter<r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BJ.g f87886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public List<Option> f87887b;

    public o(@NotNull BJ.g gVar) {
        this.f87886a = gVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List<Option> list = this.f87887b;
        return list != null ? list.size() : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        Option option;
        r rVar = (r) viewHolder;
        List<Option> list = this.f87887b;
        if (list == null || (option = list.get(i7)) == null) {
            return;
        }
        rVar.f87892b = option;
        rVar.f87893c.setText(option.getText());
        rVar.f87894d.setVisibility(option.isSelected() ? 0 : 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        return new r(p.a(viewGroup, 2131494382, viewGroup, false), this.f87886a);
    }
}
