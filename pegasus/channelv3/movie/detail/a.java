package com.bilibili.pegasus.channelv3.movie.detail;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.magicasakura.widgets.TintTextView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/detail/a.class */
@StabilityInferred(parameters = 0)
public final class a extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BiliImageView f75358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TintTextView f75359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TintTextView f75360c;

    public a(@NotNull View view) {
        super(view);
        this.f75358a = view.findViewById(2131296477);
        this.f75359b = (TintTextView) view.findViewById(2131296478);
        this.f75360c = (TintTextView) view.findViewById(2131296480);
    }
}
