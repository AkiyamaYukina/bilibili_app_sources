package com.bilibili.search2.result.holder.recommend;

import Bl.J;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.search2.result.holder.recommend.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/recommend/f.class */
@StabilityInferred(parameters = 0)
public final class f extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final J f88176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final o.a f88177b;

    public f(@NotNull J j7, @NotNull o.a aVar) {
        super(j7.a);
        this.f88176a = j7;
        this.f88177b = aVar;
        if (ConfigManager.Companion.isHitFF("ff_list_search_font_experiment_result")) {
            j7.c.setTextSize(14.0f);
            j7.b.setTextSize(14.0f);
        }
    }
}
