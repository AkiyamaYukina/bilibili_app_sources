package com.bilibili.ship.theseus.ogv.intro.section.ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.ogv.intro.section.service.OgvEpisodeRelatedToFeatureUIComponentService$create$$inlined$map$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/ui/h.class */
@StabilityInferred(parameters = 0)
public final class h implements UIComponent<UIComponent.b<RecyclerView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final OgvEpisodeRelatedToFeatureUIComponentService$create$$inlined$map$1 f93833a;

    public h(@NotNull OgvEpisodeRelatedToFeatureUIComponentService$create$$inlined$map$1 ogvEpisodeRelatedToFeatureUIComponentService$create$$inlined$map$1) {
        this.f93833a = ogvEpisodeRelatedToFeatureUIComponentService$create$$inlined$map$1;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        Object objCollectLatest = FlowKt.collectLatest(this.f93833a, new OgvEpisodeRelatedToFeatureUIComponent$bindToView$2(((RecyclerView) ((UIComponent.b) viewEntry).a).getAdapter(), null), continuation);
        if (objCollectLatest != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCollectLatest = Unit.INSTANCE;
        }
        return objCollectLatest;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView.setAdapter(com.bilibili.ship.theseus.united.page.intro.i.a());
        return new UIComponent.b(recyclerView);
    }
}
