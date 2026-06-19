package com.bilibili.pegasus.channelv3.movie.head;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.pegasus.channelv3.ChannelDetailActivityV3;
import com.bilibili.pegasus.channelv3.utils.ChannelStatus;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import so0.C8611h;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/head/m.class */
@StabilityInferred(parameters = 0)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ChannelDetailActivityV3 f75427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public gl.o f75428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f75429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f75430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f75431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.pegasus.channelv3.movie.head.a f75432f = new com.bilibili.pegasus.channelv3.movie.head.a(2131239599, 2131103591, true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.pegasus.channelv3.movie.head.a f75433g = new com.bilibili.pegasus.channelv3.movie.head.a(2131239593, R$color.Ga5_u, false);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/head/m$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f75434a;

        static {
            int[] iArr = new int[ChannelStatus.values().length];
            try {
                iArr[ChannelStatus.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            f75434a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/head/m$b.class */
    public static final /* synthetic */ class b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f75435a;

        public b(Function1 function1) {
            this.f75435a = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            boolean zAreEqual = false;
            if (obj instanceof Observer) {
                zAreEqual = false;
                if (obj instanceof FunctionAdapter) {
                    zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            return zAreEqual;
        }

        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f75435a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f75435a.invoke(obj);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/head/m$c.class */
    public static final class c implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChannelDetailActivityV3 f75436a;

        public c(ChannelDetailActivityV3 channelDetailActivityV3) {
            this.f75436a = channelDetailActivityV3;
        }

        public final Object invoke() {
            return this.f75436a.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/head/m$d.class */
    public static final class d implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChannelDetailActivityV3 f75437a;

        public d(ChannelDetailActivityV3 channelDetailActivityV3) {
            this.f75437a = channelDetailActivityV3;
        }

        public final Object invoke() {
            return this.f75437a.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/head/m$e.class */
    public static final class e implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChannelDetailActivityV3 f75438a;

        public e(ChannelDetailActivityV3 channelDetailActivityV3) {
            this.f75438a = channelDetailActivityV3;
        }

        public final Object invoke() {
            return this.f75438a.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/head/m$f.class */
    public static final class f implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChannelDetailActivityV3 f75439a;

        public f(ChannelDetailActivityV3 channelDetailActivityV3) {
            this.f75439a = channelDetailActivityV3;
        }

        public final Object invoke() {
            return this.f75439a.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/head/m$g.class */
    public static final class g implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChannelDetailActivityV3 f75440a;

        public g(ChannelDetailActivityV3 channelDetailActivityV3) {
            this.f75440a = channelDetailActivityV3;
        }

        public final Object invoke() {
            return this.f75440a.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/head/m$h.class */
    public static final class h implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChannelDetailActivityV3 f75441a;

        public h(ChannelDetailActivityV3 channelDetailActivityV3) {
            this.f75441a = channelDetailActivityV3;
        }

        public final Object invoke() {
            return this.f75441a.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/head/m$i.class */
    public static final class i implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChannelDetailActivityV3 f75442a;

        public i(ChannelDetailActivityV3 channelDetailActivityV3) {
            this.f75442a = channelDetailActivityV3;
        }

        public final Object invoke() {
            return this.f75442a.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/head/m$j.class */
    public static final class j implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChannelDetailActivityV3 f75443a;

        public j(ChannelDetailActivityV3 channelDetailActivityV3) {
            this.f75443a = channelDetailActivityV3;
        }

        public final Object invoke() {
            return this.f75443a.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/head/m$k.class */
    public static final class k implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChannelDetailActivityV3 f75444a;

        public k(ChannelDetailActivityV3 channelDetailActivityV3) {
            this.f75444a = channelDetailActivityV3;
        }

        public final Object invoke() {
            return this.f75444a.getDefaultViewModelCreationExtras();
        }
    }

    public m(@NotNull ChannelDetailActivityV3 channelDetailActivityV3) {
        this.f75427a = channelDetailActivityV3;
        this.f75429c = new ViewModelLazy(Reflection.getOrCreateKotlinClass(C8611h.class), new d(channelDetailActivityV3), new c(channelDetailActivityV3), new e(channelDetailActivityV3));
        this.f75430d = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ChannelMovieHeadVM.class), new g(channelDetailActivityV3), new f(channelDetailActivityV3), new h(channelDetailActivityV3));
        this.f75431e = new ViewModelLazy(Reflection.getOrCreateKotlinClass(xo0.d.class), new j(channelDetailActivityV3), new i(channelDetailActivityV3), new k(channelDetailActivityV3));
    }

    @NotNull
    public final gl.o a() {
        gl.o oVar = this.f75428b;
        if (oVar != null) {
            return oVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final ChannelMovieHeadVM b() {
        return (ChannelMovieHeadVM) this.f75430d.getValue();
    }

    public final void c(com.bilibili.pegasus.channelv3.movie.head.a aVar) {
        a().h.setText(aVar.f75392d);
        TintTextView tintTextView = a().h;
        int i7 = aVar.f75391c;
        ChannelDetailActivityV3 channelDetailActivityV3 = this.f75427a;
        tintTextView.setTextColor(ContextCompat.getColor(channelDetailActivityV3, i7));
        a().g.setVisibility(ListExtentionsKt.toVisibility(aVar.f75390b));
        a().g.setBackground(ContextCompat.getDrawable(channelDetailActivityV3, aVar.f75393e));
        a().f.setBackground(ContextCompat.getDrawable(channelDetailActivityV3, aVar.f75389a));
    }
}
