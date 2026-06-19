package com.bilibili.ship.theseus.united.page.error;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.bilibili.ad.adview.widget.o;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import dv0.AbstractC6876m;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/error/h.class */
@StabilityInferred(parameters = 0)
public final class h extends DataBindingComponent<AbstractC6876m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f99616a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/error/h$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends androidx.databinding.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final g f99617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final o f99618b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public String f99619c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f99620d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f99621e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f99622f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f99623g;
        public boolean h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public Drawable f99624i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f99625j = 1.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public String f99626k = "";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f99627l;

        public a(@NotNull g gVar, @NotNull o oVar, @NotNull String str) {
            this.f99617a = gVar;
            this.f99618b = oVar;
            this.f99619c = str;
        }

        public final void m(boolean z6) {
            if (z6 == this.h) {
                return;
            }
            this.h = z6;
            notifyPropertyChanged(30);
        }

        public final void n(@Nullable Drawable drawable) {
            if (Intrinsics.areEqual(drawable, this.f99624i)) {
                return;
            }
            this.f99624i = drawable;
            notifyPropertyChanged(291);
        }

        public final void o(@NotNull String str) {
            if (Intrinsics.areEqual(str, this.f99626k)) {
                return;
            }
            this.f99626k = str;
            notifyPropertyChanged(397);
        }

        public final void q(boolean z6) {
            if (z6 == this.f99627l) {
                return;
            }
            this.f99627l = z6;
            notifyPropertyChanged(487);
        }
    }

    public h(@NotNull a aVar) {
        this.f99616a = aVar;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        AbstractC6876m abstractC6876m = (AbstractC6876m) viewDataBinding;
        abstractC6876m.q(this.f99616a);
        abstractC6876m.executePendingBindings();
        return Unit.INSTANCE;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AbstractC6876m.inflate(layoutInflater, viewGroup, false);
    }
}
