package com.bilibili.pegasus.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.common.feed.PegasusStyle;
import com.bilibili.app.comm.list.common.feed.PegasusStyleKt;
import com.bilibili.app.comm.list.common.utils.ListDeviceInfoKt;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widget/PegasusTintRecyclerView.class */
@StabilityInferred(parameters = 0)
public final class PegasusTintRecyclerView extends RecyclerView {
    @JvmOverloads
    public PegasusTintRecyclerView(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public PegasusTintRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public PegasusTintRecyclerView(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void invalidateItemDecorations() {
        for (RecyclerView.ItemDecoration itemDecoration : ListExtentionsKt.getItemDecorations(this)) {
            if (ListDeviceInfoKt.isHdApp()) {
                b bVar = itemDecoration instanceof b ? (b) itemDecoration : null;
                if (bVar != null) {
                    bVar.a();
                }
            } else {
                j jVar = itemDecoration instanceof j ? (j) itemDecoration : null;
                if (jVar != null) {
                    jVar.a();
                }
            }
        }
        if (!PegasusStyleKt.currentIsSingleColumn(PegasusStyle.INSTANCE) || ListDeviceInfoKt.isHdApp()) {
            setBackgroundColor(ThemeUtils.getColorById(getContext(), R$color.Ga1));
        } else {
            setBackgroundColor(ThemeUtils.getColorById(getContext(), R$color.f64616Wh0));
        }
        invalidate();
        super.invalidateItemDecorations();
    }
}
