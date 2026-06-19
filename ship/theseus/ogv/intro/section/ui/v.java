package com.bilibili.ship.theseus.ogv.intro.section.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import com.bilibili.framework.exposure.core.ExposureEntry;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zu0.B0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/ui/v.class */
@StabilityInferred(parameters = 0)
public final class v extends DataBindingComponent<B0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f93892a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/ui/v$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends androidx.databinding.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Function0<Unit> f93893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Function0<Unit> f93894b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Function0<Unit> f93895c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final ExposureEntry f93896d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final ExposureEntry f93897e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public String f93898f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public String f93899g;
        public boolean h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f93900i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f93901j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f93902k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f93903l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        public String f93904m = "";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f93905n;

        public a(@NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03, @Nullable ExposureEntry exposureEntry, @Nullable ExposureEntry exposureEntry2) {
            this.f93893a = function0;
            this.f93894b = function02;
            this.f93895c = function03;
            this.f93896d = exposureEntry;
            this.f93897e = exposureEntry2;
        }
    }

    public v(@NotNull a aVar) {
        this.f93892a = aVar;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        B0 b02 = (B0) viewDataBinding;
        b02.q(this.f93892a);
        b02.executePendingBindings();
        return Unit.INSTANCE;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return B0.inflate(layoutInflater, viewGroup, false);
    }
}
