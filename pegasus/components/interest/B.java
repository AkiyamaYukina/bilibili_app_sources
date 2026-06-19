package com.bilibili.pegasus.components.interest;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.magicasakura.widgets.Tintable;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/B.class */
public final class B {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(@NotNull View view) {
        if (view instanceof Tintable) {
            ((Tintable) view).tint();
        }
        if (view instanceof ViewGroup) {
            Iterator it = ViewGroupKt.getChildren((ViewGroup) view).iterator();
            while (it.hasNext()) {
                a((View) it.next());
            }
            if (view instanceof RecyclerView) {
                RecyclerView recyclerView = (RecyclerView) view;
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
                recyclerView.getRecycledViewPool().clear();
            }
        }
    }
}
