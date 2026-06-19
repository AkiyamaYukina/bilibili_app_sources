package com.bilibili.ship.theseus.united.page.floatlayer;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bilibili.app.gemini.ui.UIComponent;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/e.class */
@StabilityInferred(parameters = 0)
public final class e<T extends Fragment> implements UIComponent<UIComponent.b<View>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FragmentManager f99750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Class<T> f99751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Bundle f99752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Function2<T, Continuation<? super Unit>, Object> f99753d;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull FragmentManager fragmentManager, @NotNull Class<T> cls, @Nullable Bundle bundle, @Nullable Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.f99750a = fragmentManager;
        this.f99751b = cls;
        this.f99752c = bundle;
        this.f99753d = function2;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        Fragment fragmentInstantiate = this.f99750a.getFragmentFactory().instantiate(this.f99751b.getClassLoader(), this.f99751b.getName());
        fragmentInstantiate.setArguments(this.f99752c);
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new FragmentUIComponent$bindToView$2(this, fragmentInstantiate, (UIComponent.b) viewEntry, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(ViewCompat.generateViewId());
        return new UIComponent.b(frameLayout);
    }

    @NotNull
    public final Object viewReusingKey() {
        return new Pair(super.viewReusingKey(), this.f99751b);
    }
}
