package com.bilibili.topix.center;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.image2.view.BiliImageView;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.bili.widget.statefulbutton.StatefulButton;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/m.class */
@StabilityInferred(parameters = 0)
public final class m extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BiliImageView f112426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TextView f112427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TextView f112428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final StatefulButton f112429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final TextView f112430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final FrameLayout f112431f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.view.View$OnClickListener, java.lang.Object] */
    public m(@NotNull ViewGroup viewGroup, @NotNull j jVar) {
        super(p.a(viewGroup, 2131500567, viewGroup, false));
        this.f112426a = this.itemView.findViewById(2131304298);
        this.f112427b = (TextView) this.itemView.findViewById(2131314729);
        this.f112428c = (TextView) this.itemView.findViewById(2131314727);
        StatefulButton statefulButtonFindViewById = this.itemView.findViewById(2131298070);
        this.f112429d = statefulButtonFindViewById;
        this.f112430e = (TextView) this.itemView.findViewById(2131315093);
        this.f112431f = (FrameLayout) this.itemView.findViewById(2131301698);
        statefulButtonFindViewById.setOnClickListener(new Hx.r(1, this, jVar));
        this.itemView.setOnClickListener(new Object());
    }
}
