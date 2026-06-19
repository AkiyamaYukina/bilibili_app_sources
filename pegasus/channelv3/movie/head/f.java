package com.bilibili.pegasus.channelv3.movie.head;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/head/f.class */
@StabilityInferred(parameters = 0)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ChannelDetailActivityV3 f75407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public gl.n f75408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f75409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f75410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public String f75411e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f75412f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/head/f$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f75413a;

        static {
            int[] iArr = new int[ChannelStatus.values().length];
            try {
                iArr[ChannelStatus.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[ChannelStatus.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[ChannelStatus.EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[ChannelStatus.SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            f75413a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/head/f$b.class */
    public static final /* synthetic */ class b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f75414a;

        public b(Function1 function1) {
            this.f75414a = function1;
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
            return this.f75414a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f75414a.invoke(obj);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/head/f$c.class */
    public static final class c implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChannelDetailActivityV3 f75415a;

        public c(ChannelDetailActivityV3 channelDetailActivityV3) {
            this.f75415a = channelDetailActivityV3;
        }

        public final Object invoke() {
            return this.f75415a.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/head/f$d.class */
    public static final class d implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChannelDetailActivityV3 f75416a;

        public d(ChannelDetailActivityV3 channelDetailActivityV3) {
            this.f75416a = channelDetailActivityV3;
        }

        public final Object invoke() {
            return this.f75416a.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/head/f$e.class */
    public static final class e implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChannelDetailActivityV3 f75417a;

        public e(ChannelDetailActivityV3 channelDetailActivityV3) {
            this.f75417a = channelDetailActivityV3;
        }

        public final Object invoke() {
            return this.f75417a.getDefaultViewModelCreationExtras();
        }
    }

    public f(@NotNull ChannelDetailActivityV3 channelDetailActivityV3) {
        this.f75407a = channelDetailActivityV3;
        this.f75409c = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ChannelMovieHeadVM.class), new d(channelDetailActivityV3), new c(channelDetailActivityV3), new e(channelDetailActivityV3));
    }

    @NotNull
    public final gl.n a() {
        gl.n nVar = this.f75408b;
        if (nVar != null) {
            return nVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }
}
