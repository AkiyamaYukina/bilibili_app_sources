package com.bilibili.ogv.misc.sponsor;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseToolbarActivity;
import com.bilibili.ogv.infra.util.i;
import com.bilibili.ogv.misc.sponsor.BangumiSponsorRankFragment;
import com.bilibili.ogv.misc.sponsor.b;
import java.util.ArrayList;
import tv.danmaku.bili.widget.PagerSlidingTabStrip;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/sponsor/BangumiSponsorRankActivity.class */
public class BangumiSponsorRankActivity extends BaseToolbarActivity implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public com.bilibili.ogv.misc.sponsor.b f69336D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ViewPager f69337E;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/sponsor/BangumiSponsorRankActivity$a.class */
    public static final class a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public BangumiSponsorRankFragment f69338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f69339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f69340c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f69341d;

        @Override // com.bilibili.ogv.misc.sponsor.b.a
        public final CharSequence a(BangumiSponsorRankActivity bangumiSponsorRankActivity) {
            return bangumiSponsorRankActivity.getString(2131856721);
        }

        @Override // com.bilibili.ogv.misc.sponsor.b.a
        public final int getId() {
            return 2;
        }

        @Override // com.bilibili.ogv.misc.sponsor.b.a
        public final BangumiSponsorRankFragment getPage() {
            long j7 = this.f69339b;
            if (j7 > 0) {
                this.f69338a = BangumiSponsorRankFragment.nf(BangumiSponsorRankFragment.RankType.TOTAL, j7, null, 0);
            } else {
                String str = this.f69340c;
                if (!TextUtils.isEmpty(str)) {
                    this.f69338a = BangumiSponsorRankFragment.nf(BangumiSponsorRankFragment.RankType.TOTAL, 0L, str, this.f69341d);
                }
            }
            return this.f69338a;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/sponsor/BangumiSponsorRankActivity$b.class */
    public static final class b implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public BangumiSponsorRankFragment f69342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f69343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f69344c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f69345d;

        @Override // com.bilibili.ogv.misc.sponsor.b.a
        public final CharSequence a(BangumiSponsorRankActivity bangumiSponsorRankActivity) {
            return bangumiSponsorRankActivity.getString(2131856428);
        }

        @Override // com.bilibili.ogv.misc.sponsor.b.a
        public final int getId() {
            return 1;
        }

        @Override // com.bilibili.ogv.misc.sponsor.b.a
        public final BangumiSponsorRankFragment getPage() {
            if (this.f69342a == null) {
                long j7 = this.f69343b;
                if (j7 > 0) {
                    this.f69342a = BangumiSponsorRankFragment.nf(BangumiSponsorRankFragment.RankType.WEEK, j7, null, 0);
                } else {
                    String str = this.f69344c;
                    if (!TextUtils.isEmpty(str)) {
                        this.f69342a = BangumiSponsorRankFragment.nf(BangumiSponsorRankFragment.RankType.WEEK, 0L, str, this.f69345d);
                    }
                }
            }
            return this.f69342a;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [androidx.fragment.app.FragmentPagerAdapter, com.bilibili.ogv.misc.sponsor.b] */
    /* JADX WARN: Type inference failed for: r0v26, types: [com.bilibili.ogv.misc.sponsor.BangumiSponsorRankActivity$b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [com.bilibili.ogv.misc.sponsor.BangumiSponsorRankActivity$a, java.lang.Object] */
    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131493008);
        ensureToolbar();
        showBackButton();
        setTitle(2131856740);
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        long jE = i.e(intent.getStringExtra("sponsor_rank_avid"));
        String stringExtra = intent.getStringExtra("sponsor_rank_tab_index");
        String stringExtra2 = intent.getStringExtra("sponsor_rank_season_id");
        String stringExtra3 = intent.getStringExtra("sponsor_rank_season_type");
        ViewCompat.setElevation(findViewById(2131296646), getResources().getDimensionPixelSize(2131165832));
        this.f69337E = (ViewPager) findViewById(2131305458);
        int iC = i.c(stringExtra3);
        ?? fragmentPagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager());
        fragmentPagerAdapter.f69392a = new ArrayList();
        fragmentPagerAdapter.f69393b = this;
        this.f69336D = fragmentPagerAdapter;
        ?? obj = new Object();
        obj.f69343b = jE;
        obj.f69344c = stringExtra2;
        obj.f69345d = iC;
        obj.f69342a = (BangumiSponsorRankFragment) getSupportFragmentManager().findFragmentByTag("android:switcher:2131305458:1");
        ?? obj2 = new Object();
        obj2.f69339b = jE;
        obj2.f69340c = stringExtra2;
        obj2.f69341d = iC;
        obj2.f69338a = (BangumiSponsorRankFragment) getSupportFragmentManager().findFragmentByTag("android:switcher:2131305458:2");
        com.bilibili.ogv.misc.sponsor.b bVar = this.f69336D;
        ((ArrayList) bVar.f69392a).add(((ArrayList) bVar.f69392a).size(), obj);
        com.bilibili.ogv.misc.sponsor.b bVar2 = this.f69336D;
        ((ArrayList) bVar2.f69392a).add(((ArrayList) bVar2.f69392a).size(), obj2);
        this.f69337E.setAdapter(this.f69336D);
        PagerSlidingTabStrip pagerSlidingTabStripFindViewById = findViewById(2131308542);
        pagerSlidingTabStripFindViewById.setViewPager(this.f69337E);
        pagerSlidingTabStripFindViewById.setOnPageChangeListener(this);
        int iC2 = i.c(stringExtra);
        if (this.f69337E == null || iC2 < 0 || iC2 >= this.f69336D.getCount()) {
            return;
        }
        this.f69337E.setCurrentItem(iC2, true);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i7) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i7, float f7, int i8) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i7) {
    }
}
