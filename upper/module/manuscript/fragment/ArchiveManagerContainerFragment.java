package com.bilibili.upper.module.manuscript.fragment;

import NE0.c;
import Xz0.g;
import aa0.a;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.BaseToolbarFragment;
import com.bilibili.lib.ui.RouteConstKt;
import com.bilibili.lib.ui.Target;
import com.bilibili.lib.ui.garb.Garb;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintToolbar;
import com.bilibili.upper.module.manuscript.fragment.ArchiveManagerContainerFragment;
import com.bilibili.upper.module.manuscript.fragment.ManuscriptsListFragment;
import fA0.j;
import j4.o;
import jI0.InterfaceC7648a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import lB0.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qw0.C8488a;
import tv.danmaku.bili.widget.PagerSlidingTabStrip;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/fragment/ArchiveManagerContainerFragment.class */
@StabilityInferred(parameters = 0)
public final class ArchiveManagerContainerFragment extends BaseToolbarFragment implements a, InterfaceC7648a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public PagerSlidingTabStrip f113579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public ViewPager f113580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public View f113581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public TextView f113582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public c f113583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f113584g;

    @Nullable
    public a.a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f113585i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final ActivityResultLauncher<RouteRequest> f113586j = registerForActivityResult(new ActivityResultContract(), new ActivityResultCallback(this) { // from class: iI0.c

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArchiveManagerContainerFragment f121587a;

        {
            this.f121587a = this;
        }

        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            ActivityResult activityResult = (ActivityResult) obj;
            if (activityResult != null) {
                ArchiveManagerContainerFragment archiveManagerContainerFragment = this.f121587a;
                NE0.c cVar = archiveManagerContainerFragment.f113583f;
                ManuscriptsListFragment manuscriptsListFragment = null;
                Fragment item = cVar != null ? cVar.getItem(0) : null;
                if (item instanceof ManuscriptsListFragment) {
                    manuscriptsListFragment = (ManuscriptsListFragment) item;
                }
                int i7 = archiveManagerContainerFragment.f113585i;
                int resultCode = activityResult.getResultCode();
                if (manuscriptsListFragment != null) {
                    if (resultCode == -1 && i7 == 1000) {
                        manuscriptsListFragment.lf(true);
                    } else if (resultCode == 134 && i7 == 1002) {
                        manuscriptsListFragment.lf(true);
                    } else if (resultCode == 11 && i7 == 1001) {
                        manuscriptsListFragment.mf();
                    } else if (resultCode == -1 && i7 == 123) {
                        manuscriptsListFragment.mf();
                    } else if (resultCode == 11 && i7 == 1002) {
                        manuscriptsListFragment.lf(true);
                    } else if (resultCode == -1 && i7 == 1002) {
                        manuscriptsListFragment.lf(true);
                    } else if (resultCode == 123 && i7 == 1000) {
                        manuscriptsListFragment.lf(true);
                    } else if ((resultCode == -1 || resultCode == 123 || resultCode == 134) && i7 == 1003) {
                        manuscriptsListFragment.lf(true);
                    } else if ((resultCode == -1 || resultCode == 123 || resultCode == 134) && i7 == 1004) {
                        manuscriptsListFragment.lf(true);
                    } else if (resultCode == -1 && i7 == 1005) {
                        manuscriptsListFragment.lf(true);
                    } else if (resultCode == -1 && (i7 == 1001 || i7 == 1002)) {
                        manuscriptsListFragment.lf(true);
                    }
                }
                archiveManagerContainerFragment.f113585i = -1;
            }
        }
    });

    public static void mf(Intent intent, String str) {
        if (intent.getBooleanExtra("key_page_from_notify", false)) {
            String stringExtra = intent.getStringExtra("key_notify_type");
            o.a("notifyType:", stringExtra, ",pageScene=", str, "ArchiveManagerContainerFragment");
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            Neurons.trackT(false, "creation.archive.notify.track", O4.c.c("archive_type", stringExtra, "page_scene", str), 1, new AT0.c(8));
        }
    }

    @Override // jI0.InterfaceC7648a
    public final void Pb(@NotNull RouteRequest routeRequest, int i7) {
        this.f113585i = i7;
        this.f113586j.launch(routeRequest);
    }

    public final boolean lc() {
        Bundle arguments = getArguments();
        return arguments != null ? arguments.getBoolean("isEmbedded") : false;
    }

    public final Fragment nf(String str) {
        Target targetFindRoute = RouteConstKt.findRoute(BLRouter.INSTANCE, RouteRequestKt.toRouteRequest(str));
        if (targetFindRoute == null || !Fragment.class.isAssignableFrom(targetFindRoute.getClazz())) {
            return null;
        }
        return Fragment.instantiate(requireContext(), targetFindRoute.getClazz().getName(), targetFindRoute.getArgs());
    }

    public final void of() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(new ManuscriptsListFragment());
        arrayList2.add(getString(2131851190));
        Fragment fragmentNf = nf("bilibili://article/column-manager-fragment/");
        if (fragmentNf != null) {
            arrayList.add(fragmentNf);
            if (ConfigManager.Companion.isHitFF("ff_column_upgrade_opus_enable")) {
                arrayList2.add(getString(2131851405));
            } else {
                arrayList2.add(getString(2131850883));
            }
        }
        Fragment fragmentNf2 = nf("bilibili://music/contributions");
        if (fragmentNf2 != null) {
            arrayList.add(fragmentNf2);
            arrayList2.add(getString(2131851189));
        }
        String[] strArr = (String[]) arrayList2.toArray(new String[0]);
        ViewPager viewPager = this.f113580c;
        if (viewPager != null) {
            viewPager.setOffscreenPageLimit(2);
        }
        c cVar = new c(getChildFragmentManager(), arrayList, strArr);
        this.f113583f = cVar;
        ViewPager viewPager2 = this.f113580c;
        if (viewPager2 != null) {
            viewPager2.setAdapter(cVar);
        }
        PagerSlidingTabStrip pagerSlidingTabStrip = this.f113579b;
        if (pagerSlidingTabStrip != null) {
            pagerSlidingTabStrip.setViewPager(this.f113580c);
        }
        PagerSlidingTabStrip pagerSlidingTabStrip2 = this.f113579b;
        if (pagerSlidingTabStrip2 != null) {
            pagerSlidingTabStrip2.setAllCaps(false);
        }
        j.a(this.f113579b);
    }

    @Override // com.bilibili.lib.ui.BaseToolbarFragment
    public final void onCreateToolbarMenu(@NotNull Menu menu, @NotNull MenuInflater menuInflater) {
        menuInflater.inflate(2131558441, menu);
        MenuItem menuItemFindItem = menu.findItem(2131300323);
        if (menuItemFindItem != null) {
            menuItemFindItem.setShowAsAction(2);
        }
        TintToolbar mToolbar = getMToolbar();
        if (mToolbar != null) {
            mToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener(this) { // from class: iI0.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ArchiveManagerContainerFragment f121585a;

                {
                    this.f121585a = this;
                }

                @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    boolean z6;
                    if (menuItem.getItemId() != 2131300323 || QE0.a.a()) {
                        z6 = false;
                    } else {
                        ArchiveManagerContainerFragment archiveManagerContainerFragment = this.f121585a;
                        if (archiveManagerContainerFragment.getContext() != null) {
                            BLRouter.routeTo(new RouteRequest.Builder(Uri.parse("activity://uper/user_center/draft/")).extras(new A00.g(2)).build(), archiveManagerContainerFragment.requireContext());
                        }
                        z6 = true;
                    }
                    return z6;
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131493783, viewGroup, false);
    }

    @Override // com.bilibili.lib.ui.BaseToolbarFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        if (this.f113584g && getContext() != null) {
            Intent intent = new Intent("finish_uper_transparent_web_act_action");
            intent.setPackage(requireContext().getPackageName());
            requireContext().sendBroadcast(intent);
        }
        super.onDestroyView();
        Lazy<C8488a> lazy = C8488a.f126360e;
        C8488a.C1345a.a().b();
        a.a aVar = this.h;
        if (aVar != null) {
            aVar.a();
        }
        this.h = null;
    }

    public final void onNewIntent(@NotNull Intent intent) {
        mf(intent, "onNewIntent");
        c cVar = this.f113583f;
        pf();
        Bundle bundleExtra = intent.getBundleExtra("param_control");
        int i7 = bundleExtra != null ? bundleExtra.getInt("SELECT_TAB", 0) : intent.getIntExtra("SELECT_TAB", 0);
        ViewPager viewPager = this.f113580c;
        if (viewPager != null && cVar != null) {
            viewPager.setCurrentItem(i7);
            if (i7 == 0) {
                Fragment item = cVar.getItem(0);
                ManuscriptsListFragment manuscriptsListFragment = item instanceof ManuscriptsListFragment ? (ManuscriptsListFragment) item : null;
                if (manuscriptsListFragment != null) {
                    manuscriptsListFragment.mf();
                }
            }
        }
        rf(intent);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        sf(false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        pf();
        g.f28463b = "";
    }

    @Override // com.bilibili.lib.ui.BaseToolbarFragment, com.bilibili.lib.ui.garb.GarbWatcher.Observer
    public final void onSkinChange(@NotNull Garb garb) {
        TextView textView = this.f113582e;
        if (textView != null) {
            textView.setTextColor((garb.isPure() || garb.isPrimaryOnly()) ? ThemeUtils.getColorById(getContext(), 2131103914) : garb.getFontColor());
        }
        if (lc()) {
            ViewPager viewPager = this.f113580c;
            int currentItem = viewPager != null ? viewPager.getCurrentItem() : 0;
            qf();
            of();
            ViewPager viewPager2 = this.f113580c;
            if (viewPager2 != null) {
                viewPager2.setCurrentItem(currentItem, false);
            }
        }
        super.onSkinChange(garb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b9  */
    /* JADX WARN: Type inference failed for: r1v34, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // com.bilibili.lib.ui.BaseToolbarFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(@org.jetbrains.annotations.NotNull android.view.View r8, @org.jetbrains.annotations.Nullable android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 853
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.manuscript.fragment.ArchiveManagerContainerFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void pf() {
        c cVar = this.f113583f;
        if (cVar != null) {
            Fragment item = cVar.getItem(0);
            ManuscriptsListFragment manuscriptsListFragment = item instanceof ManuscriptsListFragment ? (ManuscriptsListFragment) item : null;
            if (manuscriptsListFragment == null || !manuscriptsListFragment.isAdded()) {
                return;
            }
            manuscriptsListFragment.rf();
            manuscriptsListFragment.refresh();
        }
    }

    public final void qf() {
        if (getContext() == null) {
            return;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        List<Fragment> fragments = childFragmentManager.getFragments();
        if (fragments.isEmpty()) {
            return;
        }
        Iterator<Fragment> it = fragments.iterator();
        while (it.hasNext()) {
            childFragmentManager.beginTransaction().remove(it.next()).commitNowAllowingStateLoss();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void rf(android.content.Intent r5) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.manuscript.fragment.ArchiveManagerContainerFragment.rf(android.content.Intent):void");
    }

    public final void sf(boolean z6) {
        View view = this.f113581d;
        if (view != null) {
            view.setVisibility(z6 ? 0 : 8);
        }
    }
}
