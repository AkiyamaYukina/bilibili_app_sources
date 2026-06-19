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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/ui/q.class */
@StabilityInferred(parameters = 0)
public final class q implements UIComponent<UIComponent.b<RecyclerView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<UIComponent<?>> f93868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f93869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f93870c;

    public q(@NotNull List list, long j7, @NotNull ExposureEntry exposureEntry) {
        this.f93868a = list;
        this.f93869b = j7;
        this.f93870c = exposureEntry;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        UIComponent.b bVar = (UIComponent.b) viewEntry;
        ((RecyclerView) bVar.a).getAdapter().N(this.f93868a);
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new OgvPreviewEpisodeSectionUIComponent$bindToView$2(bVar, this, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    @NotNull
    public final Object contentEqualityKey() {
        return Long.valueOf(this.f93869b);
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView.setPadding(0, 0, 0, (int) Uj0.c.a(6, context));
        recyclerView.setAdapter(com.bilibili.ship.theseus.united.page.intro.i.a());
        return new UIComponent.b(recyclerView);
    }

    @NotNull
    public final Object identityEqualityKey() {
        return Long.valueOf(this.f93869b);
    }
}
