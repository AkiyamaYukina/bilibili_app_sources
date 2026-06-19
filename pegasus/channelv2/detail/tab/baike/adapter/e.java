package com.bilibili.pegasus.channelv2.detail.tab.baike.adapter;

import WS0.w;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.magicasakura.widgets.TintTextView;
import do0.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/adapter/e.class */
@StabilityInferred(parameters = 0)
public final class e extends RecyclerView.Adapter<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final w f75119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public LoadListStatus f75120b = LoadListStatus.SUCCESS;

    public e(@NotNull w wVar) {
        this.f75119a = wVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        l lVar = (l) viewHolder;
        LoadListStatus loadListStatus = this.f75120b;
        lVar.getClass();
        int i8 = l.a.f116557a[loadListStatus.ordinal()];
        View view = null;
        if (i8 == 1) {
            View view2 = lVar.itemView;
            View view3 = null;
            if (view2 instanceof com.bilibili.pegasus.channelv2.detail.tab.baike.widget.d) {
                view3 = view2;
            }
            com.bilibili.pegasus.channelv2.detail.tab.baike.widget.d dVar = (com.bilibili.pegasus.channelv2.detail.tab.baike.widget.d) view3;
            if (dVar != null) {
                dVar.b();
                return;
            }
            return;
        }
        if (i8 == 2) {
            View view4 = lVar.itemView;
            if (view4 instanceof com.bilibili.pegasus.channelv2.detail.tab.baike.widget.d) {
                view = view4;
            }
            com.bilibili.pegasus.channelv2.detail.tab.baike.widget.d dVar2 = (com.bilibili.pegasus.channelv2.detail.tab.baike.widget.d) view;
            if (dVar2 != null) {
                dVar2.a();
                return;
            }
            return;
        }
        View view5 = lVar.itemView;
        View view6 = null;
        if (view5 instanceof com.bilibili.pegasus.channelv2.detail.tab.baike.widget.d) {
            view6 = view5;
        }
        com.bilibili.pegasus.channelv2.detail.tab.baike.widget.d dVar3 = (com.bilibili.pegasus.channelv2.detail.tab.baike.widget.d) view6;
        if (dVar3 != null) {
            TextView textView = dVar3.f75217a;
            if (textView != null) {
                textView.setVisibility(4);
            }
            TintTextView tintTextView = dVar3.f75218b;
            if (tintTextView != null) {
                tintTextView.setVisibility(4);
            }
            dVar3.setBackgroundColor(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        RecyclerView.ViewHolder viewHolder = new RecyclerView.ViewHolder(new com.bilibili.pegasus.channelv2.detail.tab.baike.widget.d(viewGroup.getContext(), 0));
        View view = viewHolder.itemView;
        if (!(view instanceof com.bilibili.pegasus.channelv2.detail.tab.baike.widget.d)) {
            view = null;
        }
        com.bilibili.pegasus.channelv2.detail.tab.baike.widget.d dVar = (com.bilibili.pegasus.channelv2.detail.tab.baike.widget.d) view;
        if (dVar != null) {
            dVar.setRetryListener(new Pr0.l(this.f75119a, 3));
        }
        return viewHolder;
    }
}
