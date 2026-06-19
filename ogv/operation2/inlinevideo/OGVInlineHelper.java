package com.bilibili.ogv.operation2.inlinevideo;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.app.comm.list.common.inline.config.pegasus.PegasusInlineConfigKt;
import com.bilibili.inline.delegate.DefaultInlinePlayDelegate;
import com.bilibili.inline.fetcher.DescendingInlineFetcher;
import com.bilibili.inline.fetcher.IInlineFetcher;
import com.bilibili.inline.page.InlinePage;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.moduleservice.list.IPegasusInlineConfig;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/OGVInlineHelper.class */
@StabilityInferred(parameters = 0)
public final class OGVInlineHelper {
    public static final int h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Lifecycle f70882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private IInlineFetcher.IViewChecker f70883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private IInlineFetcher f70884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private DefaultInlinePlayDelegate f70885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final IPegasusInlineConfig f70886e = (IPegasusInlineConfig) BLRouter.get$default(BLRouter.INSTANCE, IPegasusInlineConfig.class, (String) null, 2, (Object) null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private Job f70887f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final d f70888g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/OGVInlineHelper$a.class */
    public static final class a implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final OGVInlineHelper f70889a;

        public a(OGVInlineHelper oGVInlineHelper) {
            this.f70889a = oGVInlineHelper;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onPause(LifecycleOwner lifecycleOwner) {
            this.f70889a.m();
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(LifecycleOwner lifecycleOwner) {
            this.f70889a.l();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/OGVInlineHelper$b.class */
    public interface b {
        boolean a();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/OGVInlineHelper$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c implements ViewPager.OnPageChangeListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f70890c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f70891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private Function0<Unit> f70892b;

        public final int a() {
            return this.f70891a;
        }

        public final void b(@NotNull Function0<Unit> function0) {
            this.f70892b = function0;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i7) {
            Function0<Unit> function0;
            this.f70891a = i7;
            if (i7 != 0 || (function0 = this.f70892b) == null) {
                return;
            }
            function0.invoke();
            this.f70892b = null;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i7, float f7, int i8) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i7) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/OGVInlineHelper$d.class */
    public static final class d implements InlinePage {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final OGVInlineHelper f70893a;

        public d(OGVInlineHelper oGVInlineHelper) {
            this.f70893a = oGVInlineHelper;
        }

        public boolean getPageSwitchState() {
            return this.f70893a.f();
        }
    }

    public OGVInlineHelper(@NotNull Lifecycle lifecycle) {
        this.f70882a = lifecycle;
        lifecycle.addObserver(new a(this));
        this.f70888g = new d(this);
    }

    public static /* synthetic */ void d(OGVInlineHelper oGVInlineHelper, Context context, String str, IInlineFetcher.IViewChecker iViewChecker, IInlineFetcher iInlineFetcher, int i7, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            iViewChecker = null;
        }
        if ((i8 & 8) != 0) {
            iInlineFetcher = null;
        }
        if ((i8 & 16) != 0) {
            i7 = 0;
        }
        oGVInlineHelper.c(context, str, iViewChecker, iInlineFetcher, i7);
    }

    public static /* synthetic */ void k(OGVInlineHelper oGVInlineHelper, RecyclerView recyclerView, boolean z6, b bVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = true;
        }
        if ((i7 & 4) != 0) {
            bVar = null;
        }
        if ((i7 & 8) != 0) {
            cVar = null;
        }
        oGVInlineHelper.j(recyclerView, z6, bVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
    }

    public final void c(@NotNull Context context, @NotNull String str, @Nullable IInlineFetcher.IViewChecker iViewChecker, @Nullable IInlineFetcher iInlineFetcher, int i7) {
        IInlineFetcher.IViewChecker aVar = iViewChecker;
        if (iViewChecker == null) {
            aVar = new com.bilibili.inline.fetcher.a(i7, 0.98f, 25);
        }
        this.f70883b = aVar;
        IInlineFetcher descendingInlineFetcher = iInlineFetcher;
        if (iInlineFetcher == null) {
            descendingInlineFetcher = new DescendingInlineFetcher(this.f70888g, aVar);
        }
        this.f70884c = descendingInlineFetcher;
        this.f70885d = new DefaultInlinePlayDelegate((Fragment) null, (FragmentActivity) null, context, 3, (DefaultConstructorMarker) null);
    }

    @Nullable
    public final IInlineFetcher e() {
        return this.f70884c;
    }

    public final boolean f() {
        IPegasusInlineConfig iPegasusInlineConfig = this.f70886e;
        boolean z6 = false;
        if (iPegasusInlineConfig != null) {
            z6 = false;
            if (PegasusInlineConfigKt.isAutoPlayEnable(iPegasusInlineConfig)) {
                z6 = true;
            }
        }
        return z6;
    }

    public final void g() {
    }

    public final void h() {
        Job job = this.f70887f;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f70887f = null;
    }

    public final void i(@Nullable IInlineFetcher iInlineFetcher) {
        this.f70884c = iInlineFetcher;
    }

    public final void j(@Nullable RecyclerView recyclerView, boolean z6, @Nullable b bVar, @Nullable c cVar) {
        Job job = this.f70887f;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f70887f = BuildersKt.launch$default(LifecycleKt.getCoroutineScope(this.f70882a), (CoroutineContext) null, (CoroutineStart) null, new OGVInlineHelper$startDelayAutoPlay$1(recyclerView, bVar, cVar, this, z6, null), 3, (Object) null);
    }

    public final void m() {
    }
}
