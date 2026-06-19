package com.bilibili.pegasus.channelv2.detail.tab.baike.adapter;

import WS0.x;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintTextView;
import do0.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/adapter/d.class */
@StabilityInferred(parameters = 0)
public final class d extends RecyclerView.Adapter<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final x f75117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public LoadListStatus f75118b = LoadListStatus.SUCCESS;

    public d(@NotNull x xVar) {
        this.f75117a = xVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        k kVar = (k) viewHolder;
        LoadListStatus loadListStatus = this.f75118b;
        kVar.getClass();
        int i8 = k.a.f116556a[loadListStatus.ordinal()];
        View view = null;
        if (i8 == 1) {
            View view2 = kVar.itemView;
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
            View view4 = kVar.itemView;
            View view5 = null;
            if (view4 instanceof com.bilibili.pegasus.channelv2.detail.tab.baike.widget.d) {
                view5 = view4;
            }
            com.bilibili.pegasus.channelv2.detail.tab.baike.widget.d dVar2 = (com.bilibili.pegasus.channelv2.detail.tab.baike.widget.d) view5;
            if (dVar2 != null) {
                dVar2.a();
                return;
            }
            return;
        }
        if (i8 != 3) {
            View view6 = kVar.itemView;
            View view7 = null;
            if (view6 instanceof com.bilibili.pegasus.channelv2.detail.tab.baike.widget.d) {
                view7 = view6;
            }
            com.bilibili.pegasus.channelv2.detail.tab.baike.widget.d dVar3 = (com.bilibili.pegasus.channelv2.detail.tab.baike.widget.d) view7;
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
                return;
            }
            return;
        }
        View view8 = kVar.itemView;
        if (view8 instanceof com.bilibili.pegasus.channelv2.detail.tab.baike.widget.d) {
            view = view8;
        }
        com.bilibili.pegasus.channelv2.detail.tab.baike.widget.d dVar4 = (com.bilibili.pegasus.channelv2.detail.tab.baike.widget.d) view;
        if (dVar4 != null) {
            TintTextView tintTextView2 = dVar4.f75218b;
            if (tintTextView2 != null) {
                tintTextView2.setVisibility(8);
            }
            TextView textView2 = dVar4.f75217a;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            TextView textView3 = dVar4.f75217a;
            if (textView3 != null) {
                textView3.setText(dVar4.getResources().getString(2131841428));
            }
            dVar4.setBackgroundColor(ContextCompat.getColor(dVar4.getContext(), R$color.Ga1));
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
            dVar.setRetryListener(new Fq.c(this.f75117a, 7));
        }
        return viewHolder;
    }
}
