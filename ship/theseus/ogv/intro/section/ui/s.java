package com.bilibili.ship.theseus.ogv.intro.section.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zu0.Y0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/ui/s.class */
@StabilityInferred(parameters = 0)
public final class s extends DataBindingComponent<Y0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f93875a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/ui/s$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends androidx.databinding.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Function0<Unit> f93876a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public RecyclerView.ItemDecoration f93878c;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f93881f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final ObservableArrayList<r> f93877b = new ObservableArrayList<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public Pair<Integer, Integer> f93879d = new Pair<>(0, 0);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f93880e = true;

        public a(@NotNull Function0<Unit> function0) {
            this.f93876a = function0;
        }

        public final void m(long j7, @NotNull Context context) {
            int i7 = 0;
            for (r rVar : this.f93877b) {
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                r rVar2 = rVar;
                boolean z6 = j7 == rVar2.f93871b;
                if (z6 != rVar2.f93874e) {
                    rVar2.f93874e = z6;
                    rVar2.notifyPropertyChanged(550);
                }
                if (z6) {
                    Pair<Integer, Integer> pair = new Pair<>(Integer.valueOf(i7), Integer.valueOf((int) Uj0.c.a(48, context)));
                    if (!Intrinsics.areEqual(pair, this.f93879d)) {
                        this.f93879d = pair;
                        notifyPropertyChanged(528);
                    }
                }
                i7++;
            }
        }
    }

    public s(@NotNull a aVar) {
        this.f93875a = aVar;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        Y0 y02 = (Y0) viewDataBinding;
        y02.q(this.f93875a);
        y02.executePendingBindings();
        return Unit.INSTANCE;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return Y0.inflate(layoutInflater, viewGroup, false);
    }
}
