package com.bilibili.ship.theseus.united.page.floatlayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.gemini.ui.UIComponent.ViewEntry;
import dv0.AbstractC6865g;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference2Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/d.class */
@StabilityInferred(parameters = 0)
public final class d<V extends UIComponent.ViewEntry> extends DataBindingComponent<AbstractC6865g> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final KProperty<Object>[] f99739d = {new MutablePropertyReference2Impl(d.class, "childViewEntry", "getChildViewEntry(Landroid/view/View;)Lcom/bilibili/app/gemini/ui/UIComponent$ViewEntry;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f99740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final e f99741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f99742c = 2131313230;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/d$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends androidx.databinding.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Function1<View, Unit> f99743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public String f99744b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f99745c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f99746d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f99747e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f99748f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f99749g;

        public a() {
            this(null);
        }

        public a(Object obj) {
            this.f99743a = null;
            this.f99744b = "";
            this.f99745c = 12;
            this.f99746d = true;
            this.f99749g = -1;
        }

        public final void m(boolean z6) {
            if (z6 == this.f99746d) {
                return;
            }
            this.f99746d = z6;
            notifyPropertyChanged(275);
        }

        public final void n(@NotNull String str) {
            if (Intrinsics.areEqual(str, this.f99744b)) {
                return;
            }
            this.f99744b = str;
            notifyPropertyChanged(640);
        }
    }

    public d(@NotNull a aVar, @NotNull e eVar) {
        this.f99740a = aVar;
        this.f99741b = eVar;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        AbstractC6865g abstractC6865g = (AbstractC6865g) viewDataBinding;
        abstractC6865g.q(this.f99740a);
        abstractC6865g.executePendingBindings();
        View root = abstractC6865g.getRoot();
        KProperty<Object> kProperty = f99739d[0];
        Object objBindToView = this.f99741b.bindToView((UIComponent.ViewEntry) root.getTag(this.f99742c), continuation);
        if (objBindToView != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objBindToView = Unit.INSTANCE;
        }
        return objBindToView;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC6865g abstractC6865gInflate = AbstractC6865g.inflate(layoutInflater, viewGroup, false);
        UIComponent.b bVarCreateViewEntry = this.f99741b.createViewEntry(abstractC6865gInflate.getRoot().getContext(), abstractC6865gInflate.f116987x);
        View root = abstractC6865gInflate.getRoot();
        KProperty<Object> kProperty = f99739d[0];
        root.setTag(this.f99742c, bVarCreateViewEntry);
        abstractC6865gInflate.f116987x.addView(bVarCreateViewEntry.a);
        return abstractC6865gInflate;
    }

    @NotNull
    public final Object viewReusingKey() {
        return new Pair(super/*com.bilibili.app.gemini.ui.UIComponent*/.viewReusingKey(), this.f99741b.viewReusingKey());
    }
}
