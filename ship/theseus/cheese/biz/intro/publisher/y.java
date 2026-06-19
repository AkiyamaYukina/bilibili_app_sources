package com.bilibili.ship.theseus.cheese.biz.intro.publisher;

import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/y.class */
@StabilityInferred(parameters = 0)
public final class y extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TextView f89917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<Integer, Unit> f89918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Function1<Integer, Unit> f89919c;

    /* JADX WARN: Multi-variable type inference failed */
    public y(@NotNull TextView textView, @NotNull Function1<? super Integer, Unit> function1, @NotNull Function1<? super Integer, Unit> function12) {
        super(textView);
        this.f89917a = textView;
        this.f89918b = function1;
        this.f89919c = function12;
    }
}
