package com.bilibili.upper.module.partitionTag.partitionTopic.activity;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.droid.BundleUtil;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.upper.api.bean.TypeMeta;
import com.bilibili.upper.module.contribute.up.util.j;
import com.bilibili.upper.module.contribute.up.util.m;
import com.bilibili.upper.module.partitionTag.partition.model.UpperManuscriptData;
import com.bilibili.upper.module.partitionTag.partition.model.UpperPartitionTagParam;
import com.bilibili.upper.module.partitionTag.partition.model.UpperTagBean;
import com.bilibili.upper.module.partitionTag.partitionTopic.activity.PartitionTagTopicActivity;
import com.bilibili.upper.module.partitionTag.partitionTopic.activity.a;
import com.bilibili.upper.module.partitionTag.partitionTopic.fragment.PartitionAFragment;
import com.bilibili.upper.module.partitionTag.partitionTopic.fragment.PartitionTagAFragment;
import com.bilibili.upper.module.partitionTag.partitionTopic.widget.TouchTitleView;
import j4.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tI0.C8649g;
import tv.danmaku.android.log.BLog;
import xI0.C8962a;
import zG0.a;
import zG0.h;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/activity/PartitionTagTopicActivity.class */
public class PartitionTagTopicActivity extends com.bilibili.upper.module.partitionTag.partitionTopic.activity.a {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final int f113725S = 0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public TextView f113726K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public TextView f113727L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public TextView f113728M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public ViewPager f113729N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final ArrayList<Fragment> f113730O = new ArrayList<>();

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public PartitionTagAFragment f113731P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public PartitionAFragment f113732Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public C8962a f113733R;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/activity/PartitionTagTopicActivity$a.class */
    public final class a implements a.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PartitionTagTopicActivity f113734a;

        public a(PartitionTagTopicActivity partitionTagTopicActivity) {
            this.f113734a = partitionTagTopicActivity;
        }

        @Override // com.bilibili.upper.module.partitionTag.partitionTopic.activity.a.d
        public final void a(boolean z6) {
            t.a("onChangedToHidden auto: ", "PartitionTagAActivity", z6);
            PartitionTagTopicActivity partitionTagTopicActivity = this.f113734a;
            ViewPager viewPager = partitionTagTopicActivity.f113729N;
            if (viewPager == null || viewPager.getCurrentItem() != 1) {
                return;
            }
            String strE = partitionTagTopicActivity.X6().e();
            zG0.a.r();
            a.a aVar = a.a.a;
            h.n(strE);
        }

        @Override // com.bilibili.upper.module.partitionTag.partitionTopic.activity.a.d
        public final void b(boolean z6) {
            t.a("onChangedToHalf auto: ", "PartitionTagAActivity", z6);
        }

        @Override // com.bilibili.upper.module.partitionTag.partitionTopic.activity.a.d
        public final void c(boolean z6) {
            BLog.i("PartitionTagAActivity", "onChangedToMax auto: " + z6);
            Neurons.reportClick(false, "creation.partition-lable.0.slide.click", new HashMap());
        }
    }

    public final void U6(final boolean z6, final String str, final boolean z7, final List list) {
        PartitionTagAFragment partitionTagAFragment = this.f113731P;
        if (partitionTagAFragment.f113780n == null) {
            this.f113729N.postDelayed(new Runnable(this, z6, list, str, z7) { // from class: tI0.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PartitionTagTopicActivity f127457a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f127458b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final List f127459c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final String f127460d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final boolean f127461e;

                {
                    this.f127457a = this;
                    this.f127458b = z6;
                    this.f127459c = list;
                    this.f127460d = str;
                    this.f127461e = z7;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PartitionTagTopicActivity partitionTagTopicActivity = this.f127457a;
                    boolean z8 = this.f127458b;
                    List list2 = this.f127459c;
                    partitionTagTopicActivity.f113731P.nf(z8, this.f127460d, this.f127461e, list2);
                }
            }, 100L);
        } else {
            partitionTagAFragment.nf(z6, str, z7, list);
        }
    }

    public final void V6() {
        if (this.f113729N == null) {
            return;
        }
        X6().f129148q = 1;
        C8962a c8962aX6 = X6();
        if (!c8962aX6.f129145n) {
            PageViewTracker.start("creation.partition-lable.0.0.pv", c8962aX6.f129148q, "", null);
        }
        this.f113729N.setCurrentItem(0, true);
        this.f113726K.setVisibility(0);
        this.f113727L.setVisibility(0);
        this.f113728M.setVisibility(0);
    }

    public final C8962a X6() {
        if (this.f113733R == null) {
            synchronized (PartitionTagTopicActivity.class) {
                try {
                    if (this.f113733R == null) {
                        this.f113733R = new C8962a(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f113733R;
    }

    public final void Y6(final boolean z6) {
        PartitionTagAFragment partitionTagAFragment = this.f113731P;
        if (partitionTagAFragment.f113779m == null) {
            this.f113729N.postDelayed(new Runnable(this, z6) { // from class: tI0.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PartitionTagTopicActivity f127455a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f127456b;

                {
                    this.f127455a = this;
                    this.f127456b = z6;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PartitionTagTopicActivity partitionTagTopicActivity = this.f127455a;
                    boolean z7 = this.f127456b;
                    TextView textView = partitionTagTopicActivity.f113731P.f113775i;
                    if (textView == null) {
                        return;
                    }
                    textView.setVisibility(z7 ? 0 : 8);
                }
            }, 100L);
            return;
        }
        TextView textView = partitionTagAFragment.f113775i;
        if (textView == null) {
            return;
        }
        textView.setVisibility(z6 ? 0 : 8);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.upper.module.partitionTag.partitionTopic.activity.a, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (bundle != null) {
            bundle.remove("android:support:fragments");
            Bundle bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (bundle2 != null) {
                bundle2.remove("android:support:fragments");
            }
        }
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        super.onCreate(bundle);
        setContentView(2131493798);
        String str = m.a;
        System.currentTimeMillis();
        this.f113726K = (TextView) findViewById(2131315912);
        this.f113727L = (TextView) findViewById(2131315904);
        this.f113728M = (TextView) findViewById(2131315906);
        TouchTitleView touchTitleView = (TouchTitleView) findViewById(2131315400);
        int i7 = this.f113743G;
        int i8 = this.f113744H;
        touchTitleView.b(i7, i8, (int) ((i8 * 1.0f) / 4.0f));
        touchTitleView.setCallback(new C8649g(this));
        this.f113727L.setOnClickListener(new RI.b(this, 1));
        this.f113728M.setOnClickListener(new RI.c(this, 5));
        this.f113729N = (ViewPager) findViewById(2131316429);
        ArrayList<Fragment> arrayList = this.f113730O;
        PartitionTagAFragment partitionTagAFragment = new PartitionTagAFragment();
        partitionTagAFragment.f113776j = this;
        partitionTagAFragment.setArguments(new Bundle());
        this.f113731P = partitionTagAFragment;
        arrayList.add(partitionTagAFragment);
        ArrayList<Fragment> arrayList2 = this.f113730O;
        PartitionAFragment partitionAFragment = new PartitionAFragment();
        partitionAFragment.f113751b = this;
        partitionAFragment.setArguments(new Bundle());
        this.f113732Q = partitionAFragment;
        arrayList2.add(partitionAFragment);
        this.f113729N.setAdapter(new NE0.c(getSupportFragmentManager(), this.f113730O, new String[]{getString(j.b ? 2131850866 : 2131851057), getString(2131850900)}));
        this.f113729N.addOnPageChangeListener(new tI0.h(this));
        C8962a c8962aX6 = X6();
        if (c8962aX6 != null) {
            Bundle bundleExtra = getIntent().getBundleExtra(BundleUtil.KEY_DEFAULT_EXTRA_BUNDLE);
            if (bundleExtra != null) {
                c8962aX6.f129139g = (UpperManuscriptData) bundleExtra.getSerializable("PARTITION_MANUSCRIPT");
                ArrayList<TypeMeta> parcelableArrayList = bundleExtra.getParcelableArrayList("PARTITION_TYPEMETA_LIST");
                ArrayList<TypeMeta> arrayList3 = parcelableArrayList;
                if (parcelableArrayList == null) {
                    arrayList3 = new ArrayList<>();
                }
                c8962aX6.f129134b = arrayList3;
                UpperPartitionTagParam upperPartitionTagParam = (UpperPartitionTagParam) bundleExtra.getSerializable("PARTITION_TAG_PARAM");
                UpperPartitionTagParam upperPartitionTagParam2 = upperPartitionTagParam;
                if (upperPartitionTagParam == null) {
                    upperPartitionTagParam2 = new UpperPartitionTagParam();
                }
                c8962aX6.f129135c = upperPartitionTagParam2;
                if (upperPartitionTagParam2.topicId > 0 && !TextUtils.isEmpty(upperPartitionTagParam2.topicName) && c8962aX6.f129135c.getTags() != null && c8962aX6.f129135c.getTags().size() > 0) {
                    UpperTagBean upperTagBean = c8962aX6.f129135c.getTags().get(0);
                    if (c8962aX6.f129135c.topicName.equals(upperTagBean.tagText) && !upperTagBean.isTopicTag) {
                        upperTagBean.isTopicTag = true;
                    }
                }
                c8962aX6.f129135c.syncInitTags();
                c8962aX6.f129142k = bundleExtra.getString("PARTITION_RELATION_FROM", "");
                c8962aX6.f129145n = bundleExtra.getBoolean("PARTITION_IS_V4", false);
                c8962aX6.f129146o = bundleExtra.getBoolean("PARTITION_HIDE_TYPE", false);
            }
            c8962aX6.h();
            c8962aX6.i(true);
            c8962aX6.c();
        }
        this.f113745I = new a(this);
        C8962a c8962aX62 = X6();
        if (!c8962aX62.f129145n) {
            PageViewTracker.start("creation.partition-lable.0.0.pv", c8962aX62.f129148q, "", null);
        }
        if (X6().f129145n && X6().f129146o) {
            this.f113726K.setText(2131849069);
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ViewPager viewPager = this.f113729N;
        if (viewPager == null || viewPager.getCurrentItem() != 0) {
            return;
        }
        C8962a c8962aX6 = X6();
        if (c8962aX6.f129145n) {
            return;
        }
        PageViewTracker.end("creation.partition-lable.0.0.pv", c8962aX6.f129148q, "", null);
    }
}
