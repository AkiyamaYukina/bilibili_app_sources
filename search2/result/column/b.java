package com.bilibili.search2.result.column;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.section.holder.BaseViewHolder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/column/b.class */
@StabilityInferred(parameters = 0)
public final class b extends Hh1.a<Hh1.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ArrayList<Hh1.c> f87729a = new ArrayList<>();

    public final void N(@Nullable ArrayList<Hh1.c> arrayList) {
        this.f87729a.clear();
        if (arrayList != null) {
            this.f87729a.addAll(arrayList);
        }
    }

    public final void bindHolder(@NotNull BaseViewHolder baseViewHolder, int i7, @Nullable View view) {
        if (baseViewHolder instanceof c) {
            Hh1.c cVar = this.f87729a.get(i7);
            TextView textView = (TextView) ((c) baseViewHolder).itemView.findViewById(2131303879);
            textView.setText(cVar.a);
            textView.setSelected(cVar.b);
        }
    }

    @NotNull
    public final BaseViewHolder createHolder(@NotNull ViewGroup viewGroup, int i7) {
        int i8 = c.f87730b;
        return new BaseViewHolder(p.a(viewGroup, 2131495537, viewGroup, false), this);
    }

    public final int getItemCount() {
        return this.f87729a.size();
    }
}
