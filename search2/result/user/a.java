package com.bilibili.search2.result.user;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.section.holder.BaseViewHolder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/user/a.class */
@StabilityInferred(parameters = 0)
public final class a extends Hh1.a<Hh1.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public ArrayList<Hh1.c> f88538a;

    public final void N(@Nullable ArrayList<Hh1.c> arrayList) {
        this.f88538a = arrayList;
    }

    public final void bindHolder(@NotNull BaseViewHolder baseViewHolder, int i7, @NotNull View view) {
        if (baseViewHolder instanceof b) {
            ArrayList<Hh1.c> arrayList = this.f88538a;
            Hh1.c cVar = arrayList != null ? arrayList.get(baseViewHolder.getAdapterPosition()) : null;
            b bVar = (b) baseViewHolder;
            if (cVar == null) {
                bVar.getClass();
            } else {
                bVar.f88540b.setText(cVar.a);
                bVar.f88540b.setSelected(cVar.b);
            }
        }
    }

    @NotNull
    public final BaseViewHolder createHolder(@NotNull ViewGroup viewGroup, int i7) {
        int i8 = b.f88539c;
        return new b(p.a(viewGroup, 2131494769, viewGroup, false), this);
    }

    public final int getItemCount() {
        ArrayList<Hh1.c> arrayList = this.f88538a;
        return arrayList == null ? 0 : arrayList.size();
    }
}
