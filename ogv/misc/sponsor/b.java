package com.bilibili.ogv.misc.sponsor;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/sponsor/b.class */
public final class b extends FragmentPagerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<a> f69392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BangumiSponsorRankActivity f69393b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/sponsor/b$a.class */
    public interface a {
        CharSequence a(BangumiSponsorRankActivity bangumiSponsorRankActivity);

        int getId();

        BangumiSponsorRankFragment getPage();
    }

    public final a b(int i7) {
        return (a) ((ArrayList) this.f69392a).get(i7);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.f69392a).size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public final Fragment getItem(int i7) {
        if (b(i7) == null || b(i7).getPage() == null) {
            return null;
        }
        BangumiSponsorRankFragment page = b(i7).getPage();
        page.getClass();
        return page;
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public final long getItemId(int i7) {
        return b(i7).getId();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        Fragment fragment = (Fragment) obj;
        for (int i7 = 0; i7 < ((ArrayList) this.f69392a).size(); i7++) {
            if (b(i7).getPage() == fragment) {
                return i7;
            }
        }
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i7) {
        return b(i7).a(this.f69393b);
    }
}
