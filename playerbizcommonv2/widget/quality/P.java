package com.bilibili.playerbizcommonv2.widget.quality;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.search2.api.SearchBangumiItem;
import java.util.Set;
import kotlin.collections.SetsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/P.class */
public final class P extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Set<Integer> f82700g = SetsKt.setOf(new Integer[]{100, Integer.valueOf(SearchBangumiItem.TYPE_FULLNET_DOCUMENTARY), 129, Integer.valueOf(SearchBangumiItem.TYPE_FULLNET_MOVIE)});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f82701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TextView f82702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TextView f82703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final TextView f82704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ImageView f82705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final TextView f82706f;

    public P(View view) {
        super(view);
        this.f82701a = view.getContext();
        this.f82702b = (TextView) view.findViewById(2131309760);
        this.f82703c = (TextView) view.findViewById(2131309764);
        this.f82704d = (TextView) view.findViewById(2131309763);
        this.f82705e = (ImageView) view.findViewById(2131309762);
        this.f82706f = (TextView) view.findViewById(2131309761);
    }
}
