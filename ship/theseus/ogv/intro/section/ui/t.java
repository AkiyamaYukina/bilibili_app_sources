package com.bilibili.ship.theseus.ogv.intro.section.ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.lib.theme.R$color;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/ui/t.class */
@StabilityInferred(parameters = 0)
public final class t implements UIComponent<UIComponent.b<RecyclerView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<UIComponent<?>> f93882a;

    public t(@NotNull List<? extends UIComponent<?>> list) {
        this.f93882a = list;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        ((RecyclerView) ((UIComponent.b) viewEntry).a).getAdapter().N(this.f93882a);
        return Unit.INSTANCE;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setBackgroundColor(ContextCompat.getColor(context, R$color.f64616Wh0));
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView.setPadding(0, 0, 0, Uj0.c.b(6, context));
        recyclerView.setAdapter(com.bilibili.ship.theseus.united.page.intro.i.a());
        return new UIComponent.b(recyclerView);
    }
}
