package com.bilibili.pegasus.components;

import F3.C1805p0;
import F3.C1813q0;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.PegasusHeaderManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/I.class */
@StabilityInferred(parameters = 0)
public final class I extends BasePegasusComponent {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Lazy f75788k = LazyKt.lazy(new C1805p0(11));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Lazy f75789l = LazyKt.lazy(new C1813q0(13));

    @NotNull
    public final String getComponentName() {
        return "hd_ui_adjust_plugin";
    }

    public final void onViewCreated(@NotNull View view, @NotNull RecyclerView recyclerView, @NotNull PegasusHeaderManager pegasusHeaderManager) {
        super.onViewCreated(view, recyclerView, pegasusHeaderManager);
        Lazy lazy = this.f75789l;
        recyclerView.setPadding(((Number) lazy.getValue()).intValue(), ((Number) this.f75788k.getValue()).intValue(), ((Number) lazy.getValue()).intValue(), recyclerView.getResources().getDimensionPixelOffset(2131165959));
        recyclerView.setBackgroundColor(ThemeUtils.getColorById(recyclerView.getContext(), R$color.Ga1));
    }
}
