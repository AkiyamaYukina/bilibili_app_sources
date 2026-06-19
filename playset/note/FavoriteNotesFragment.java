package com.bilibili.playset.note;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.ad.adview.story.card.card53.select.component.n;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.playset.note.FavoriteNotesFragment;
import com.bilibili.playset.note.RspNoteList;
import com.bilibili.pvtracker.IPvTracker;
import com.google.android.material.tabs.TabLayout;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import ns0.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/note/FavoriteNotesFragment.class */
@StabilityInferred(parameters = 0)
public final class FavoriteNotesFragment extends BaseFragment implements IPvTracker {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f85109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public TextView f85110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public ViewPager f85111e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Integer[] f85108b = {2131842640, 2131842499};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final SparseArray<NoteListFragment> f85112f = new SparseArray<>(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final SparseArray<com.bilibili.playset.note.e> f85113g = new SparseArray<>(2);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/note/FavoriteNotesFragment$a.class */
    public static final class a implements TabLayout.OnTabSelectedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FavoriteNotesFragment f85114a;

        public a(FavoriteNotesFragment favoriteNotesFragment) {
            this.f85114a = favoriteNotesFragment;
        }

        public final void onTabReselected(TabLayout.Tab tab) {
        }

        public final void onTabSelected(TabLayout.Tab tab) {
            FavoriteNotesFragment favoriteNotesFragment = this.f85114a;
            ViewPager viewPager = favoriteNotesFragment.f85111e;
            boolean z6 = false;
            if (viewPager != null) {
                viewPager.setCurrentItem(tab != null ? tab.getPosition() : 0);
            }
            NoteListFragment noteListFragmentJf = favoriteNotesFragment.jf();
            if (noteListFragmentJf != null) {
                if (noteListFragmentJf.f85137m.N() > 0) {
                    z6 = true;
                }
                favoriteNotesFragment.lf(z6);
            }
        }

        public final void onTabUnselected(TabLayout.Tab tab) {
            FavoriteNotesFragment favoriteNotesFragment = this.f85114a;
            NoteListFragment noteListFragment = favoriteNotesFragment.f85112f.get(tab != null ? tab.getPosition() : -1);
            if (noteListFragment == null || !noteListFragment.f85137m.f85153g) {
                return;
            }
            favoriteNotesFragment.f85109c = false;
            TextView textView = favoriteNotesFragment.f85110d;
            if (textView != null) {
                textView.setText(favoriteNotesFragment.getResources().getString(2131841489));
            }
            noteListFragment.lf();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/note/FavoriteNotesFragment$b.class */
    public static final class b extends FragmentStatePagerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FavoriteNotesFragment f85115a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FavoriteNotesFragment favoriteNotesFragment, FragmentManager fragmentManager) {
            super(fragmentManager, 1);
            this.f85115a = favoriteNotesFragment;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return this.f85115a.f85108b.length;
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter
        public final Fragment getItem(int i7) {
            NoteListFragment noteListFragment;
            if (i7 == 1) {
                String string = this.f85115a.getResources().getString(2131842583);
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
                this.f85115a.f85112f.put(i7, (NoteListFragment) objInstantiateItem);
            }
            return objInstantiateItem;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/note/FavoriteNotesFragment$c.class */
    public static final /* synthetic */ class c implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f85116a;

        public c(Function1 function1) {
            this.f85116a = function1;
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
            return this.f85116a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f85116a.invoke(obj);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/note/FavoriteNotesFragment$d.class */
    public static final class d implements Observer<Bundle> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<Long> f85117a = new LinkedHashSet();

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Bundle bundle) {
            Bundle bundle2 = bundle;
            boolean z6 = bundle2.getBoolean("is_editing");
            Parcelable parcelable = bundle2.getParcelable("note");
            RspNoteList.NoteBean noteBean = parcelable instanceof RspNoteList.NoteBean ? (RspNoteList.NoteBean) parcelable : null;
            if (z6 || noteBean == null || this.f85117a.contains(Long.valueOf(noteBean.noteId))) {
                return;
            }
            this.f85117a.add(Long.valueOf(noteBean.noteId));
            RspNoteList.NoteBean.ARC arc = noteBean.arc;
            long j7 = arc != null ? arc.oid : -1L;
            long j8 = noteBean.noteId;
            HashMap map = new HashMap(2);
            map.put(GameCardButton.extraAvid, Long.toString(j7));
            map.put("note_id", Long.toString(j8));
            Neurons.reportExposure(false, "main.my-favorite-note.note-card.0.show", map);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/note/FavoriteNotesFragment$e.class */
    public static final class e implements Observer<Bundle> {
        @Override // androidx.lifecycle.Observer
        public final void onChanged(Bundle bundle) {
            Bundle bundle2 = bundle;
            boolean z6 = bundle2.getBoolean("is_editing");
            Parcelable parcelable = bundle2.getParcelable("note");
            RspNoteList.NoteBean noteBean = parcelable instanceof RspNoteList.NoteBean ? (RspNoteList.NoteBean) parcelable : null;
            if (z6 || noteBean == null) {
                return;
            }
            RspNoteList.NoteBean.ARC arc = noteBean.arc;
            long j7 = arc != null ? arc.oid : -1L;
            long j8 = noteBean.noteId;
            HashMap map = new HashMap(2);
            map.put(GameCardButton.extraAvid, Long.toString(j7));
            map.put("note_id", Long.toString(j8));
            Neurons.reportClick(false, "main.my-favorite-note.note-card.0.click", map);
        }
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "main.my-favorite-note.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @Nullable
    public final Bundle getPvExtra() {
        return null;
    }

    public final NoteListFragment jf() {
        SparseArray<NoteListFragment> sparseArray = this.f85112f;
        ViewPager viewPager = this.f85111e;
        return sparseArray.get(viewPager != null ? viewPager.getCurrentItem() : -1);
    }

    public final void kf(final int i7, com.bilibili.playset.note.e eVar) {
        ((MutableLiveData) eVar.h.getValue()).observe(getViewLifecycleOwner(), new d());
        ((MutableLiveData) eVar.f85168g.getValue()).observe(getViewLifecycleOwner(), new Object());
        ((MutableLiveData) eVar.f85167f.getValue()).observe(getViewLifecycleOwner(), new c(new n(2)));
        ((MutableLiveData) eVar.f85169i.getValue()).observe(getViewLifecycleOwner(), new c(new Function1(this, i7) { // from class: ns0.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final FavoriteNotesFragment f124362a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f124363b;

            {
                this.f124362a = this;
                this.f124363b = i7;
            }

            public final Object invoke(Object obj) {
                Bundle bundle = (Bundle) obj;
                FavoriteNotesFragment favoriteNotesFragment = this.f124362a;
                if (Intrinsics.areEqual(favoriteNotesFragment.f85112f.get(this.f124363b), favoriteNotesFragment.jf())) {
                    boolean z6 = bundle.getBoolean("is_editing");
                    favoriteNotesFragment.f85109c = z6;
                    if (z6) {
                        TextView textView = favoriteNotesFragment.f85110d;
                        if (textView != null) {
                            textView.setText(favoriteNotesFragment.getResources().getString(2131841494));
                        }
                    } else {
                        TextView textView2 = favoriteNotesFragment.f85110d;
                        if (textView2 != null) {
                            textView2.setText(favoriteNotesFragment.getResources().getString(2131841489));
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }));
        ((MutableLiveData) eVar.f85170j.getValue()).observe(getViewLifecycleOwner(), new c(new Function1(this, i7) { // from class: ns0.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final FavoriteNotesFragment f124364a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f124365b;

            {
                this.f124364a = this;
                this.f124365b = i7;
            }

            public final Object invoke(Object obj) {
                Integer num = (Integer) obj;
                FavoriteNotesFragment favoriteNotesFragment = this.f124364a;
                if (Intrinsics.areEqual(favoriteNotesFragment.f85112f.get(this.f124365b), favoriteNotesFragment.jf())) {
                    favoriteNotesFragment.lf(num.intValue() > 0);
                }
                return Unit.INSTANCE;
            }
        }));
    }

    public final void lf(boolean z6) {
        TextView textView = this.f85110d;
        if (textView != null) {
            textView.setEnabled(z6);
            textView.setTextColor(z6 ? textView.getResources().getColor(R$color.Ga8) : textView.getResources().getColor(R$color.Ga5));
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131499700, viewGroup, false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NotNull Bundle bundle) {
        ViewPager viewPager = this.f85111e;
        bundle.putInt("position", viewPager != null ? viewPager.getCurrentItem() : 0);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f85109c = false;
        int i7 = bundle != null ? bundle.getInt("position") : 0;
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            SparseArray<com.bilibili.playset.note.e> sparseArray = this.f85113g;
            com.bilibili.playset.note.e eVar = (com.bilibili.playset.note.e) new ViewModelProvider(fragmentActivityP3, new p(0)).get(String.valueOf(0), com.bilibili.playset.note.e.class);
            kf(0, eVar);
            Unit unit = Unit.INSTANCE;
            sparseArray.put(0, eVar);
            SparseArray<com.bilibili.playset.note.e> sparseArray2 = this.f85113g;
            com.bilibili.playset.note.e eVar2 = (com.bilibili.playset.note.e) new ViewModelProvider(fragmentActivityP3, new p(1)).get(String.valueOf(1), com.bilibili.playset.note.e.class);
            kf(1, eVar2);
            sparseArray2.put(1, eVar2);
        }
        this.f85110d = (TextView) view.findViewById(2131314791);
        this.f85111e = (ViewPager) view.findViewById(2131314745);
        TabLayout tabLayoutFindViewById = view.findViewById(2131311422);
        TextView textView = this.f85110d;
        if (textView != null) {
            textView.setOnClickListener(new com.bilibili.biligame.ui.gamelist.n(this, 1));
        }
        if (tabLayoutFindViewById != null) {
            tabLayoutFindViewById.addTab(tabLayoutFindViewById.newTab().setText(this.f85108b[0].intValue()), i7 == 0);
            tabLayoutFindViewById.addTab(tabLayoutFindViewById.newTab().setText(this.f85108b[1].intValue()), i7 == 1);
            tabLayoutFindViewById.addOnTabSelectedListener(new a(this));
        }
        b bVar = new b(this, getChildFragmentManager());
        ViewPager viewPager = this.f85111e;
        if (viewPager != null) {
            viewPager.setAdapter(bVar);
        }
    }
}
