package com.bilibili.playerbizcommonv2.widget.setting.channel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.UIComponent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/v.class */
@StabilityInferred(parameters = 0)
public final class v implements UIComponent<UIComponent.b<View>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final View f83314a;

    public v(@NotNull View view) {
        this.f83314a = view;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        return Unit.INSTANCE;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        return new UIComponent.b(this.f83314a);
    }
}
