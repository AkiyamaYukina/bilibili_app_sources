package com.bilibili.search2.result.holder.comic;

import Ps0.InterfaceC2789j;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.widget.tag.TagView;
import com.bilibili.magicasakura.widgets.TintTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/comic/r.class */
@StabilityInferred(parameters = 0)
public final class r<T extends InterfaceC2789j> extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public T f88118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TagView f88119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TintTextView f88120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f88121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Function2<? super T, ? super Integer, Unit> f88122e;

    public r(@NotNull View view) {
        super(view);
        this.f88119b = view.findViewById(2131308551);
        this.f88120c = (TintTextView) view.findViewById(2131308958);
        this.f88121d = (ImageView) view.findViewById(2131304345);
        view.setOnClickListener(new Ks.e(this, 1));
    }
}
