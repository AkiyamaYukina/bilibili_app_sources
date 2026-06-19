package com.bilibili.topix.center;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/x.class */
@StabilityInferred(parameters = 0)
public final class x extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TextView f112444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TextView f112445b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.view.View$OnClickListener, java.lang.Object] */
    public x(@NotNull ViewGroup viewGroup) {
        super(p.a(viewGroup, 2131500571, viewGroup, false));
        this.f112444a = (TextView) this.itemView.findViewById(2131310619);
        TextView textView = (TextView) this.itemView.findViewById(2131314850);
        this.f112445b = textView;
        textView.setOnClickListener(new Object());
    }
}
