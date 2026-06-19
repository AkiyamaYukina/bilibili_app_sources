package com.bilibili.topix.center;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.image2.view.BiliImageView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/A.class */
@StabilityInferred(parameters = 0)
public final class A extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TextView f112348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final BiliImageView f112349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TextView f112350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final TextView f112351d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v18, types: [android.view.View$OnClickListener, java.lang.Object] */
    public A(@NotNull ViewGroup viewGroup) {
        super(p.a(viewGroup, 2131500578, viewGroup, false));
        this.f112348a = (TextView) this.itemView.findViewById(2131310619);
        this.f112349b = this.itemView.findViewById(2131297795);
        this.f112350c = (TextView) this.itemView.findViewById(2131312048);
        this.f112351d = (TextView) this.itemView.findViewById(2131314423);
        this.itemView.setOnClickListener(new Object());
    }
}
