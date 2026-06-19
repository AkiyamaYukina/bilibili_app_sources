package com.bilibili.relation.blacklist;

import Fs0.c;
import android.graphics.Canvas;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.n;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.theme.R$color;
import com.bilibili.relation.api.Attention;
import com.bilibili.relation.api.RelationApiManager;
import com.bilibili.relation.blacklist.BlackListFragment;
import com.google.android.material.snackbar.Snackbar;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/blacklist/a.class */
public final class a extends ItemTouchHelper.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BlackListFragment f86042e;

    /* JADX INFO: renamed from: com.bilibili.relation.blacklist.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/blacklist/a$a.class */
    public final class ViewOnClickListenerC0574a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f86043a;

        public ViewOnClickListenerC0574a(a aVar) {
            this.f86043a = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            BlackListFragment.c cVar = this.f86043a.f86042e.f86025c;
            List<Attention> list = cVar.f86034a;
            ((ArrayList) list).add(cVar.f86035b, cVar.f86036c);
            cVar.notifyItemInserted(cVar.f86035b);
            cVar.f86035b = -1;
            cVar.f86036c = null;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/blacklist/a$b.class */
    public final class b extends Snackbar.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Attention f86044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f86045b;

        public b(a aVar, Attention attention) {
            this.f86045b = aVar;
            this.f86044a = attention;
        }

        public final void onDismissed(Snackbar snackbar, int i7) {
            if (i7 == 1) {
                return;
            }
            BlackListFragment blackListFragment = this.f86045b.f86042e;
            long j7 = this.f86044a.mid;
            if (blackListFragment.isAdded()) {
                RelationApiManager.removeFromBlackList(BiliAccounts.get(blackListFragment.requireContext()).getAccessKey(), j7, 81, new c(blackListFragment));
            }
        }
    }

    public a(BlackListFragment blackListFragment) {
        this.f86042e = blackListFragment;
        this.f52352d = 4;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        if (!(viewHolder instanceof BlackListFragment.d)) {
            super.clearView(recyclerView, viewHolder);
            return;
        }
        BlackListFragment.d dVar = (BlackListFragment.d) viewHolder;
        m defaultUIUtil = ItemTouchHelper.Callback.getDefaultUIUtil();
        View view = dVar.f86037a.itemView;
        ((n) defaultUIUtil).getClass();
        Object tag = view.getTag(2131303938);
        if (tag instanceof Float) {
            ViewCompat.setElevation(view, ((Float) tag).floatValue());
        }
        view.setTag(2131303938, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        dVar.f86038b.setVisibility(8);
        dVar.f86037a.itemView.setBackgroundColor(ContextCompat.getColor(recyclerView.getContext(), R$color.f64616Wh0));
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final boolean isLongPressDragEnabled() {
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f7, float f8, int i7, boolean z6) {
        float f9;
        float f10;
        if (!(viewHolder instanceof BlackListFragment.d)) {
            super.onChildDraw(canvas, recyclerView, viewHolder, f7, f8, i7, z6);
            return;
        }
        BlackListFragment.d dVar = (BlackListFragment.d) viewHolder;
        m defaultUIUtil = ItemTouchHelper.Callback.getDefaultUIUtil();
        View view = dVar.f86037a.itemView;
        ((n) defaultUIUtil).getClass();
        if (z6 && view.getTag(2131303938) == null) {
            float elevation = ViewCompat.getElevation(view);
            int childCount = recyclerView.getChildCount();
            int i8 = 0;
            float f11 = 0.0f;
            while (true) {
                f9 = f11;
                if (i8 >= childCount) {
                    break;
                }
                View childAt = recyclerView.getChildAt(i8);
                if (childAt == view) {
                    f10 = f9;
                } else {
                    float elevation2 = ViewCompat.getElevation(childAt);
                    f10 = f9;
                    if (elevation2 > f9) {
                        f10 = elevation2;
                    }
                }
                i8++;
                f11 = f10;
            }
            ViewCompat.setElevation(view, f9 + 1.0f);
            view.setTag(2131303938, Float.valueOf(elevation));
        }
        view.setTranslationX(f7);
        view.setTranslationY(f8);
        if (f7 == 0.0f) {
            dVar.f86038b.setVisibility(8);
        } else if (dVar.f86038b.getVisibility() != 0) {
            dVar.f86038b.setVisibility(0);
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final void onSwiped(RecyclerView.ViewHolder viewHolder, int i7) {
        BlackListFragment blackListFragment = this.f86042e;
        BlackListFragment.c cVar = blackListFragment.f86025c;
        cVar.getClass();
        int adapterPosition = viewHolder.getAdapterPosition();
        Attention attention = (Attention) ((ArrayList) cVar.f86034a).get(adapterPosition);
        ((ArrayList) cVar.f86034a).remove(adapterPosition);
        cVar.notifyItemRemoved(adapterPosition);
        cVar.f86035b = adapterPosition;
        cVar.f86036c = attention;
        Snackbar snackbarMake = Snackbar.make(blackListFragment.f86024b, String.format(blackListFragment.requireContext().getApplicationContext().getResources().getString(2131847612), attention.uname), 0);
        snackbarMake.setAction(2131841629, new ViewOnClickListenerC0574a(this));
        snackbarMake.addCallback(new b(this, attention));
        snackbarMake.show();
    }
}
