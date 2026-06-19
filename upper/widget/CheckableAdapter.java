package com.bilibili.upper.widget;

import android.util.SparseBooleanArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bilibili.upper.widget.CheckableAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/CheckableAdapter.class */
public abstract class CheckableAdapter<T extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f114376a = new SparseBooleanArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CheckMode f114377b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/CheckableAdapter$CheckMode.class */
    public enum CheckMode {
        SINGLE,
        SINGLE_AT_LEAST_ONE,
        MULTIPLE
    }

    public final List<Integer> N() {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < this.f114376a.size(); i7++) {
            if (this.f114376a.valueAt(i7)) {
                arrayList.add(Integer.valueOf(this.f114376a.keyAt(i7)));
            }
        }
        return arrayList;
    }

    public abstract void O(RecyclerView.ViewHolder viewHolder, boolean z6, int i7);

    public final void P() {
        for (int i7 = 0; i7 < getItemCount(); i7++) {
            this.f114376a.put(i7, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull final T t7, final int i7) {
        O(t7, this.f114376a.get(i7, false), i7);
        t7.itemView.setOnClickListener(new View.OnClickListener(this, i7, t7) { // from class: com.bilibili.upper.widget.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CheckableAdapter f114506a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f114507b;

            {
                this.f114506a = this;
                this.f114507b = i7;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [androidx.recyclerview.widget.DiffUtil$Callback, com.bilibili.upper.widget.g] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckableAdapter checkableAdapter = this.f114506a;
                int i8 = this.f114507b;
                boolean z6 = checkableAdapter.f114376a.get(i8, false);
                SparseBooleanArray sparseBooleanArrayClone = checkableAdapter.f114376a.clone();
                CheckableAdapter.CheckMode checkMode = checkableAdapter.f114377b;
                CheckableAdapter.CheckMode checkMode2 = CheckableAdapter.CheckMode.SINGLE_AT_LEAST_ONE;
                if (checkMode == checkMode2 && z6) {
                    return;
                }
                if (checkMode == CheckableAdapter.CheckMode.SINGLE || checkMode == checkMode2) {
                    checkableAdapter.P();
                }
                checkableAdapter.f114376a.put(i8, !z6);
                SparseBooleanArray sparseBooleanArray = checkableAdapter.f114376a;
                ?? callback = new DiffUtil.Callback();
                callback.f114504a = sparseBooleanArrayClone;
                callback.f114505b = sparseBooleanArray;
                DiffUtil.calculateDiff(callback).dispatchUpdatesTo(checkableAdapter);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull T t7, int i7, @NonNull List<Object> list) {
        onBindViewHolder(t7, i7);
    }
}
