package com.bilibili.ship.theseus.united.page.tab;

import androidx.appcompat.widget.C3259x;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/p.class */
public final class p extends FragmentPagerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FragmentManager f103201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<TabPage> f103202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Set<Pair<Qj0.d, Fragment>> f103203c;

    /* JADX WARN: Multi-variable type inference failed */
    public p(@NotNull FragmentManager fragmentManager, @NotNull List<? extends TabPage> list) {
        super(fragmentManager, 0);
        this.f103201a = fragmentManager;
        this.f103202b = list;
        this.f103203c = new LinkedHashSet();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f103202b.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    @NotNull
    public final Fragment getItem(int i7) {
        Object next;
        Qj0.d dVarA = ((TabPage) ((ArrayList) this.f103202b).get(i7)).a();
        Iterator<T> it = this.f103203c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((Pair) next).getFirst(), dVarA)) {
                break;
            }
        }
        Pair pair = (Pair) next;
        Fragment fragment = null;
        if (pair != null) {
            fragment = (Fragment) pair.getSecond();
        }
        if (fragment != null) {
            defpackage.a.b("[theseus-united-TheseusPagerAdapter-getItem] ", C3259x.a(i7, "re-use existing fragment for "), "TheseusPagerAdapter-getItem");
            return fragment;
        }
        Fragment fragmentInstantiate = this.f103201a.getFragmentFactory().instantiate(dVarA.f19963a.getClassLoader(), dVarA.f19963a.getName());
        fragmentInstantiate.setArguments(dVarA.f19964b);
        this.f103203c.add(new Pair<>(dVarA, fragmentInstantiate));
        return fragmentInstantiate;
    }
}
