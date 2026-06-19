package com.bilibili.pegasus.fakepegasus;

import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/fakepegasus/b.class */
@StabilityInferred(parameters = 0)
public final class b extends RecyclerView.Adapter<c> {
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return 15;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        ImageView imageView = new ImageView(viewGroup.getContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(ListExtentionsKt.toPx(12), 0, ListExtentionsKt.toPx(12), ListExtentionsKt.toPx(12));
        imageView.setLayoutParams(marginLayoutParams);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageResource(2131232455);
        return new RecyclerView.ViewHolder(imageView);
    }
}
