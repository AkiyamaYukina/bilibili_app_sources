package com.bilibili.pegasus.holders;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.material3.C4109j6;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.pegasus.BasePegasusHolder;
import com.bilibili.pegasus.PegasusHolderInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/K0.class */
@StabilityInferred(parameters = 1)
public final class K0 implements PegasusHolderInfo<fp0.p, J0> {
    @NotNull
    public final Class<fp0.p> getDataClass() {
        return fp0.p.class;
    }

    @NotNull
    public final String getViewType() {
        return "recover_strip";
    }

    public final RecyclerView.ViewHolder onCreateHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 0, 6, null);
        BasePegasusHolder basePegasusHolder = new BasePegasusHolder(composeView);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(807215316, true, new C4109j6(basePegasusHolder, 1)));
        return basePegasusHolder;
    }
}
