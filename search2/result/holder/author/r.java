package com.bilibili.search2.result.holder.author;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.search2.inline.Option;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/author/r.class */
@StabilityInferred(parameters = 0)
public final class r extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BJ.g f87891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Option f87892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TextView f87893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ImageView f87894d;

    public r(@NotNull View view, @NotNull BJ.g gVar) {
        super(view);
        this.f87891a = gVar;
        this.f87893c = (TextView) view.findViewById(2131313120);
        this.f87894d = (ImageView) view.findViewById(2131311093);
        view.setOnClickListener(new JU.c(this, 1));
    }
}
