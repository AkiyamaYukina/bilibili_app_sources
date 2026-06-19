package com.bilibili.upper.module.partitionTag.partitionTopic.activity;

import AI0.f;
import AI0.i;
import IR.g;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import bF0.C4949D;
import com.bilibili.droid.BundleUtil;
import com.bilibili.lib.fasthybrid.playlet.native.ui.t;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.pegasus.components.interest.ui.v32.page.n;
import com.bilibili.upper.api.bean.TypeMeta;
import com.bilibili.upper.module.contribute.up.util.m;
import com.bilibili.upper.module.partitionTag.partitionTopic.bean.UpperPartTagRequestParam;
import com.bilibili.upper.module.partitionTag.partitionTopic.bean.UpperTopicRequestParam;
import com.bilibili.upper.module.partitionTag.partitionTopic.fragment.PartitionFragment;
import com.bilibili.upper.module.partitionTag.partitionTopic.fragment.PartitionTagFragment;
import com.bilibili.upper.module.partitionTag.partitionTopic.widget.TouchTitleView;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tI0.C8644b;
import tI0.C8645c;
import tv.danmaku.bili.widget.NoScrollViewPager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/activity/PartitionTagActivity.class */
@StabilityInferred(parameters = 0)
public final class PartitionTagActivity extends com.bilibili.upper.module.partitionTag.partitionTopic.activity.a {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final int f113714Q = 0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @Nullable
    public C4949D f113715K;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @Nullable
    public PartitionTagFragment f113717M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    @Nullable
    public PartitionFragment f113718N;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @NotNull
    public final ArrayList<Fragment> f113716L = new ArrayList<>();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    @NotNull
    public final Lazy f113719O = LazyKt.lazy(new t(this, 1));

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f113720P = new ViewModelLazy(Reflection.getOrCreateKotlinClass(i.class), new c(this), new b(this), new d(this));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/activity/PartitionTagActivity$a.class */
    public static final /* synthetic */ class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f113721a;

        public a(Function1 function1) {
            this.f113721a = function1;
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
            return this.f113721a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f113721a.invoke(obj);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/activity/PartitionTagActivity$b.class */
    public static final class b implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PartitionTagActivity f113722a;

        public b(PartitionTagActivity partitionTagActivity) {
            this.f113722a = partitionTagActivity;
        }

        public final Object invoke() {
            return this.f113722a.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/activity/PartitionTagActivity$c.class */
    public static final class c implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PartitionTagActivity f113723a;

        public c(PartitionTagActivity partitionTagActivity) {
            this.f113723a = partitionTagActivity;
        }

        public final Object invoke() {
            return this.f113723a.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/activity/PartitionTagActivity$d.class */
    public static final class d implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PartitionTagActivity f113724a;

        public d(PartitionTagActivity partitionTagActivity) {
            this.f113724a = partitionTagActivity;
        }

        public final Object invoke() {
            return this.f113724a.getDefaultViewModelCreationExtras();
        }
    }

    public final f U6() {
        return (f) this.f113719O.getValue();
    }

    public final void V6() {
        TintTextView tintTextView;
        TintTextView tintTextView2;
        TintTextView tintTextView3;
        NoScrollViewPager noScrollViewPager;
        U6().getClass();
        C4949D c4949d = this.f113715K;
        if (c4949d != null && (noScrollViewPager = c4949d.f54682f) != null) {
            noScrollViewPager.setCurrentItem(0, true);
        }
        C4949D c4949d2 = this.f113715K;
        if (c4949d2 != null && (tintTextView3 = c4949d2.f54681e) != null) {
            tintTextView3.setVisibility(0);
        }
        C4949D c4949d3 = this.f113715K;
        if (c4949d3 != null && (tintTextView2 = c4949d3.f54679c) != null) {
            tintTextView2.setVisibility(0);
        }
        C4949D c4949d4 = this.f113715K;
        if (c4949d4 == null || (tintTextView = c4949d4.f54680d) == null) {
            return;
        }
        tintTextView.setVisibility(0);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    @Override // com.bilibili.upper.module.partitionTag.partitionTopic.activity.a, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
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
        String str = m.a;
        System.currentTimeMillis();
        C4949D c4949dInflate = C4949D.inflate(getLayoutInflater());
        this.f113715K = c4949dInflate;
        setContentView(c4949dInflate != null ? c4949dInflate.f54677a : null);
        View view = this.f113740D;
        if (view != null) {
            view.setBackgroundResource(2131104211);
        }
        Bundle bundleExtra = getIntent().getBundleExtra(BundleUtil.KEY_DEFAULT_EXTRA_BUNDLE);
        if (bundleExtra != null) {
            f fVarU6 = U6();
            ArrayList<TypeMeta> parcelableArrayList = bundleExtra.getParcelableArrayList("PARTITION_TYPEMETA_LIST");
            ArrayList<TypeMeta> arrayList = parcelableArrayList;
            if (parcelableArrayList == null) {
                arrayList = new ArrayList<>();
            }
            fVarU6.f242i = arrayList;
            U6().Q0((UpperPartTagRequestParam) bundleExtra.getSerializable("PARTITION_TAG_PARAM"));
            UpperTopicRequestParam upperTopicRequestParam = (UpperTopicRequestParam) bundleExtra.getSerializable("TOPIC_REQUEST_PARAM");
            if (upperTopicRequestParam != null) {
                ((i) this.f113720P.getValue()).f260f = upperTopicRequestParam;
            }
        }
        U6().f240f.observe(this, new a(new bL0.f(this, 2)));
        U6().h.observe(this, new a(new n(this, 3)));
        U6().f241g.observe(this, new a(new Object()));
        C4949D c4949d = this.f113715K;
        if (c4949d != null) {
            TouchTitleView touchTitleView = c4949d.f54678b;
            int i7 = this.f113743G;
            int i8 = this.f113744H;
            touchTitleView.b(i7, i8, (int) ((i8 * 1.0f) / 4));
        }
        C4949D c4949d2 = this.f113715K;
        if (c4949d2 != null) {
            c4949d2.f54678b.setCallback(new C8644b(this));
        }
        C4949D c4949d3 = this.f113715K;
        if (c4949d3 != null) {
            c4949d3.f54679c.setOnClickListener(new IR.f(this, 2));
        }
        C4949D c4949d4 = this.f113715K;
        if (c4949d4 != null) {
            c4949d4.f54680d.setOnClickListener(new g(this, 4));
        }
        ArrayList<Fragment> arrayList2 = this.f113716L;
        PartitionTagFragment partitionTagFragment = new PartitionTagFragment();
        partitionTagFragment.setArguments(new Bundle());
        this.f113717M = partitionTagFragment;
        arrayList2.add(partitionTagFragment);
        ArrayList<Fragment> arrayList3 = this.f113716L;
        PartitionFragment partitionFragment = new PartitionFragment();
        this.f113718N = partitionFragment;
        arrayList3.add(partitionFragment);
        String[] strArr = {getString(2131851462), ""};
        C4949D c4949d5 = this.f113715K;
        if (c4949d5 != null) {
            c4949d5.f54681e.setText(strArr[0]);
        }
        C4949D c4949d6 = this.f113715K;
        if (c4949d6 != null) {
            c4949d6.f54682f.setAdapter(new NE0.c(getSupportFragmentManager(), this.f113716L, strArr));
        }
        C4949D c4949d7 = this.f113715K;
        if (c4949d7 != null) {
            c4949d7.f54682f.addOnPageChangeListener(new C8645c(this, strArr));
        }
        this.f113745I = new com.bilibili.upper.module.partitionTag.partitionTopic.activity.c(this);
        U6().O0(this, true);
        U6().K0();
    }
}
