package com.bilibili.pegasus.common.inlineplay;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.inline.card.IInlineCard;
import com.bilibili.inline.card.InlineParent;
import com.bilibili.inline.control.IInlineAutoPlayControl;
import com.bilibili.inline.control.RecyclerViewInlineAutoPlayControl;
import com.bilibili.inline.reporter.AutoPlayTriggerType;
import com.bilibili.inline.reporter.InlinePlayReporterKt;
import com.google.android.material.appbar.AppBarLayout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/inlineplay/c.class */
@StabilityInferred(parameters = 0)
public final class c extends RecyclerViewInlineAutoPlayControl implements AppBarLayout.OnOffsetChangedListener, InlineParent.ScrollStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f75644b = true;

    public final void onOffsetChanged(@Nullable AppBarLayout appBarLayout, int i7) {
    }

    public final void onScrollStateChanged(int i7) {
        if (i7 == 0 && this.f75644b) {
            InlinePlayReporterKt.reportTryAutoPlayEvent$default(AutoPlayTriggerType.ON_SCROLL, (String) null, true, 2, (Object) null);
            IInlineAutoPlayControl.AutoPlayControlCallback callback = getCallback();
            if (callback != null) {
                IInlineAutoPlayControl.AutoPlayControlCallback.sendAutoPlayControlState$default(callback, IInlineAutoPlayControl.AutoPlayControlState.START_PLAY, (IInlineCard) null, 2, (Object) null);
            }
        }
    }

    public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i7) {
        if (i7 == 0 && this.f75644b) {
            InlinePlayReporterKt.reportTryAutoPlayEvent$default(AutoPlayTriggerType.ON_SCROLL, (String) null, true, 2, (Object) null);
            IInlineAutoPlayControl.AutoPlayControlCallback callback = getCallback();
            if (callback != null) {
                IInlineAutoPlayControl.AutoPlayControlCallback.sendAutoPlayControlState$default(callback, IInlineAutoPlayControl.AutoPlayControlState.START_PLAY, (IInlineCard) null, 2, (Object) null);
            }
        }
    }
}
