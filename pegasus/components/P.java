package com.bilibili.pegasus.components;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.PegasusHeaderManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/P.class */
@StabilityInferred(parameters = 0)
public final class P extends BasePegasusComponent {
    @NotNull
    public final String getComponentName() {
        return "live_report_component";
    }

    public final void onViewCreated(@NotNull View view, @NotNull RecyclerView recyclerView, @NotNull PegasusHeaderManager pegasusHeaderManager) {
        super.onViewCreated(view, recyclerView, pegasusHeaderManager);
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener());
    }
}
