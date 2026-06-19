package com.bilibili.playset.note;

import PN.l;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseToolbarActivity;
import com.bilibili.lib.ui.theme.ThemeWatcher;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.pvtracker.IPvTracker;
import com.google.android.material.tabs.TabLayout;
import kotlin.Unit;
import ns0.C8138f;
import ns0.C8139g;
import ns0.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/note/NoteListActivity.class */
@StabilityInferred(parameters = 0)
public final class NoteListActivity extends BaseToolbarActivity implements ThemeWatcher.Observer, IPvTracker {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f85119E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @Nullable
    public View f85120F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @Nullable
    public TextView f85121G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @Nullable
    public ViewPager f85122H;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final Integer[] f85118D = {2131842640, 2131842499};

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @NotNull
    public final SparseArray<NoteListFragment> f85123I = new SparseArray<>(2);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @NotNull
    public final SparseArray<e> f85124J = new SparseArray<>(2);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/note/NoteListActivity$a.class */
    public static final class a implements TabLayout.OnTabSelectedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NoteListActivity f85125a;

        public a(NoteListActivity noteListActivity) {
            this.f85125a = noteListActivity;
        }

        public final void onTabReselected(TabLayout.Tab tab) {
        }

        public final void onTabSelected(TabLayout.Tab tab) {
            TextView textView;
            NoteListActivity noteListActivity = this.f85125a;
            ViewPager viewPager = noteListActivity.f85122H;
            if (viewPager != null) {
                viewPager.setCurrentItem(tab != null ? tab.getPosition() : 0);
            }
            NoteListFragment noteListFragmentQ6 = noteListActivity.Q6();
            if (noteListFragmentQ6 == null || (textView = noteListActivity.f85121G) == null) {
                return;
            }
            textView.setVisibility(noteListFragmentQ6.f85137m.N() > 0 ? 0 : 8);
        }

        public final void onTabUnselected(TabLayout.Tab tab) {
            NoteListActivity noteListActivity = this.f85125a;
            NoteListFragment noteListFragment = noteListActivity.f85123I.get(tab != null ? tab.getPosition() : -1);
            if (noteListFragment == null || !noteListFragment.f85137m.f85153g) {
                return;
            }
            noteListActivity.f85119E = false;
            TextView textView = noteListActivity.f85121G;
            if (textView != null) {
                textView.setText(noteListActivity.getResources().getString(2131841489));
            }
            noteListFragment.lf();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/note/NoteListActivity$b.class */
    public static final class b extends FragmentStatePagerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NoteListActivity f85126a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(NoteListActivity noteListActivity, FragmentManager fragmentManager) {
            super(fragmentManager, 1);
            this.f85126a = noteListActivity;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return this.f85126a.f85118D.length;
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter
        public final Fragment getItem(int i7) {
            NoteListFragment noteListFragment;
            if (i7 == 1) {
                String string = this.f85126a.getResources().getString(2131842583);
                Bundle bundleB = B1.a.b(1, "attr");
                if (string != null) {
                    bundleB.putString("empty_hint", string);
                }
                noteListFragment = new NoteListFragment();
                noteListFragment.setArguments(bundleB);
            } else {
                Bundle bundleB2 = B1.a.b(0, "attr");
                noteListFragment = new NoteListFragment();
                noteListFragment.setArguments(bundleB2);
            }
            return noteListFragment;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getItemPosition(Object obj) {
            return -2;
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
        public final Object instantiateItem(ViewGroup viewGroup, int i7) {
            Object objInstantiateItem = super.instantiateItem(viewGroup, i7);
            if (objInstantiateItem instanceof NoteListFragment) {
                this.f85126a.f85123I.put(i7, (NoteListFragment) objInstantiateItem);
            }
            return objInstantiateItem;
        }
    }

    public final NoteListFragment Q6() {
        SparseArray<NoteListFragment> sparseArray = this.f85123I;
        ViewPager viewPager = this.f85122H;
        return sparseArray.get(viewPager != null ? viewPager.getCurrentItem() : -1);
    }

    public final void R6(int i7, e eVar) {
        ((MutableLiveData) eVar.h.getValue()).observe(this, new com.bilibili.playset.note.a());
        ((MutableLiveData) eVar.f85168g.getValue()).observe(this, new Object());
        ((MutableLiveData) eVar.f85167f.getValue()).observe(this, new Object());
        ((MutableLiveData) eVar.f85169i.getValue()).observe(this, new C8138f(this, i7));
        ((MutableLiveData) eVar.f85170j.getValue()).observe(this, new C8139g(this, i7));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "main.mynote.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @Nullable
    public final Bundle getPvExtra() {
        return null;
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131499678);
        ensureToolbar();
        showBackButton();
        this.f85119E = false;
        int i7 = bundle != null ? bundle.getInt("position", 0) : 0;
        SparseArray<e> sparseArray = this.f85124J;
        e eVar = (e) new ViewModelProvider(this, new p(0)).get(String.valueOf(0), e.class);
        R6(0, eVar);
        Unit unit = Unit.INSTANCE;
        sparseArray.put(0, eVar);
        SparseArray<e> sparseArray2 = this.f85124J;
        e eVar2 = (e) new ViewModelProvider(this, new p(1)).get(String.valueOf(1), e.class);
        R6(1, eVar2);
        sparseArray2.put(1, eVar2);
        this.f85120F = findViewById(2131306951);
        this.f85121G = (TextView) findViewById(2131314791);
        this.f85122H = (ViewPager) findViewById(2131314745);
        TabLayout tabLayoutFindViewById = findViewById(2131311422);
        TextView textView = this.f85121G;
        if (textView != null) {
            textView.setOnClickListener(new l(this, 3));
        }
        if (tabLayoutFindViewById != null) {
            tabLayoutFindViewById.addTab(tabLayoutFindViewById.newTab().setText(2131842457), i7 == 0);
            TabLayout.Tab text = tabLayoutFindViewById.newTab().setText(2131842499);
            boolean z6 = false;
            if (i7 == 1) {
                z6 = true;
            }
            tabLayoutFindViewById.addTab(text, z6);
            tabLayoutFindViewById.addOnTabSelectedListener(new a(this));
        }
        b bVar = new b(this, getSupportFragmentManager());
        ViewPager viewPager = this.f85122H;
        if (viewPager != null) {
            viewPager.setAdapter(bVar);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onSaveInstanceState(@NotNull Bundle bundle) {
        ViewPager viewPager = this.f85122H;
        bundle.putInt("position", viewPager != null ? viewPager.getCurrentItem() : 0);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bilibili.lib.ui.theme.ThemeWatcher.Observer
    public final void onThemeChanged() {
        View view = this.f85120F;
        if (view != null) {
            view.setBackgroundColor(ThemeUtils.getColorById(this, 2131101223));
        }
    }
}
