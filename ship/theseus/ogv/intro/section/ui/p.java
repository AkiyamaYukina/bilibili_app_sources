package com.bilibili.ship.theseus.ogv.intro.section.ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.framework.exposure.core.ExposureEntry;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/ui/p.class */
@StabilityInferred(parameters = 0)
public final class p implements UIComponent<UIComponent.b<RecyclerView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<UIComponent<?>> f93866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f93867b;

    public p(@NotNull List list, @NotNull ExposureEntry exposureEntry) {
        this.f93866a = list;
        this.f93867b = exposureEntry;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        UIComponent.b bVar = (UIComponent.b) viewEntry;
        ((RecyclerView) bVar.a).getAdapter().N(this.f93866a);
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new OgvFeatureEpisodeSectionUIComponent$bindToView$2(bVar, this, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView.setAdapter(com.bilibili.ship.theseus.united.page.intro.i.a());
        float f7 = 6;
        recyclerView.setPadding(0, Uj0.c.b(f7, context), 0, Uj0.c.b(f7, context));
        return new UIComponent.b(recyclerView);
    }
}
