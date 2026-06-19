package com.bilibili.search2.main;

import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.search2.halfscreen.SearchCoreHostFragment;
import com.bilibili.search2.halfscreen.g;

/* JADX INFO: renamed from: com.bilibili.search2.main.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/g.class */
public final class C6040g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliMainSearchCoreFragment f86832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SearchCoreHostFragment f86833b;

    public C6040g(BiliMainSearchCoreFragment biliMainSearchCoreFragment, SearchCoreHostFragment searchCoreHostFragment) {
        this.f86832a = biliMainSearchCoreFragment;
        this.f86833b = searchCoreHostFragment;
    }

    public final void a(com.bilibili.search2.main.ogv.a aVar) {
        com.bilibili.search2.halfscreen.m mVarJf = this.f86832a.jf();
        if (mVarJf != null) {
            mVarJf.J0(new g.b(aVar));
        }
    }

    public final void b(boolean z6) {
        com.bilibili.search2.halfscreen.m mVarJf = this.f86832a.jf();
        if (mVarJf != null) {
            mVarJf.J0(new g.f(z6 ? false : !MultipleThemeUtils.isNightTheme(this.f86833b.requireContext())));
        }
    }

    public final void c(com.bilibili.search2.main.ogv.f fVar) {
        com.bilibili.search2.halfscreen.m mVarJf = this.f86832a.jf();
        if (mVarJf != null) {
            mVarJf.J0(new g.i(fVar));
        }
    }

    public final void d(com.bilibili.search2.main.ogv.d dVar) {
        com.bilibili.search2.halfscreen.m mVarJf = this.f86832a.jf();
        if (mVarJf != null) {
            mVarJf.J0(new g.C0579g(dVar));
        }
    }
}
