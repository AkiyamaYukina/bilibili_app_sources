package com.bilibili.tgwt.square;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.UIComponent;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/l.class */
@StabilityInferred(parameters = 0)
public final class l implements UIComponent<m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final RecommendModule f112141a;

    public l(@NotNull RecommendModule recommendModule) {
        this.f112141a = recommendModule;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        String str;
        m mVar = (m) viewEntry;
        TextView textView = mVar.f112143b;
        RecommendModule recommendModule = this.f112141a;
        textView.setText(recommendModule.f112082a);
        ModuleHeader moduleHeader = (ModuleHeader) CollectionsKt.getOrNull(recommendModule.f112086e, 0);
        if (moduleHeader == null || (str = moduleHeader.f112041a) == null || str.length() == 0) {
            mVar.f112145d.setVisibility(8);
        } else {
            mVar.f112145d.setVisibility(0);
            mVar.f112144c.setText(str);
            mVar.f112145d.setOnClickListener(new Yq.a(moduleHeader, 2));
        }
        return Unit.INSTANCE;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        return new m(LayoutInflater.from(context).inflate(2131500198, viewGroup, false));
    }
}
