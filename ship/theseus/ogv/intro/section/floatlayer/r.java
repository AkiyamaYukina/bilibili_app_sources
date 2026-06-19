package com.bilibili.ship.theseus.ogv.intro.section.floatlayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import zu0.e1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/r.class */
@StabilityInferred(parameters = 0)
public final class r extends DataBindingComponent<e1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f93709a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/r$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends androidx.databinding.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Context f93710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f93711b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final IR0.c f93712c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f93713d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public String f93714e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f93715f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f93716g;

        public a() {
            throw null;
        }

        public a(Context context, int i7, IR0.c cVar) {
            this.f93710a = context;
            this.f93711b = i7;
            this.f93712c = cVar;
            this.f93713d = false;
            this.f93714e = "";
        }

        public final void m(boolean z6) {
            boolean z7 = z6 && this.f93713d;
            if (z7 != this.f93716g) {
                this.f93716g = z7;
                notifyPropertyChanged(644);
            }
            int colorById = z6 ? ThemeUtils.getColorById(this.f93710a, R$color.Ga10) : ThemeUtils.getColorById(this.f93710a, R$color.Ga7_u);
            if (colorById == this.f93715f) {
                return;
            }
            this.f93715f = colorById;
            notifyPropertyChanged(646);
        }
    }

    public r(@NotNull a aVar) {
        this.f93709a = aVar;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        ((e1) viewDataBinding).q(this.f93709a);
        return Unit.INSTANCE;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return e1.inflate(layoutInflater, viewGroup, false);
    }

    @NotNull
    public final Object identityEqualityKey() {
        return Integer.valueOf(this.f93709a.f93711b);
    }
}
