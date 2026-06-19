package com.bilibili.search2.result.holder.comic;

import Ps0.InterfaceC2789j;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/comic/o.class */
@StabilityInferred(parameters = 0)
public final class o<T extends InterfaceC2789j> extends RecyclerView.Adapter<r<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f88112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final p f88113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final List<T> f88114c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Function2<? super T, ? super Integer, Unit> f88115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f88116e;

    public o(int i7, @NotNull p pVar) {
        this.f88112a = i7;
        this.f88113b = pVar;
    }

    public final void N(@Nullable List<? extends T> list) {
        List<? extends T> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        List<T> list3 = this.f88114c;
        if (list3 != null) {
            ((ArrayList) list3).clear();
        }
        List<T> list4 = this.f88114c;
        if (list4 != null) {
            ((ArrayList) list4).addAll(list2);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List<T> list = this.f88114c;
        return list != null ? ((ArrayList) list).size() : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015a  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r7, int r8) {
        /*
            Method dump skipped, instruction units count: 595
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.holder.comic.o.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f88112a, viewGroup, false);
        this.f88113b.getClass();
        r rVar = new r(viewInflate);
        rVar.f88122e = this.f88115d;
        return rVar;
    }
}
