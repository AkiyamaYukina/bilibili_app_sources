package com.bilibili.search2.result.bangumi;

import Ps0.InterfaceC2789j;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/r.class */
@StabilityInferred(parameters = 0)
public final class r<T extends InterfaceC2789j> extends RecyclerView.Adapter<u<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f87455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<View, u<T>> f87456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final List<T> f87457c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Function2<? super T, ? super Integer, Unit> f87458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f87459e;

    /* JADX WARN: Multi-variable type inference failed */
    public r(int i7, @NotNull Function1<? super View, ? extends u<T>> function1) {
        this.f87455a = i7;
        this.f87456b = function1;
    }

    public final void N(@Nullable List<? extends T> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        List<T> list2 = this.f87457c;
        if (list2 != null) {
            ((ArrayList) list2).clear();
        }
        List<T> list3 = this.f87457c;
        if (list3 != null) {
            ((ArrayList) list3).addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List<T> list = this.f87457c;
        return list != null ? ((ArrayList) list).size() : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        InterfaceC2789j interfaceC2789j;
        u uVar = (u) viewHolder;
        List<T> list = this.f87457c;
        if (list == null || (interfaceC2789j = (InterfaceC2789j) CollectionsKt.getOrNull(list, i7)) == null) {
            return;
        }
        uVar.p0(interfaceC2789j, this.f87459e, ((ArrayList) this.f87457c).size());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        u uVar = (u) this.f87456b.invoke(LayoutInflater.from(viewGroup.getContext()).inflate(this.f87455a, viewGroup, false));
        uVar.f87466e = this.f87458d;
        return uVar;
    }
}
