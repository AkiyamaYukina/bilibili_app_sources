package com.bilibili.upper.module.partitionTag.partitiontopicv2;

import QK.x;
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
import bF0.C5006k2;
import com.bilibili.droid.BundleUtil;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.upper.api.bean.TypeMeta;
import com.bilibili.upper.api.service.ArchiveApiService;
import com.bilibili.upper.module.partitionTag.partitionTopic.bean.UpperPartTagRequestParam;
import com.bilibili.upper.module.partitionTag.partitionTopic.bean.UpperTopicRequestParam;
import com.bilibili.upper.module.partitionTag.partitionTopic.fragment.PartitionFragment;
import com.bilibili.upper.module.partitionTag.partitionTopic.fragment.PartitionHumanFragment;
import com.bilibili.upper.module.partitionTag.partitionTopic.widget.TouchTitleView;
import com.bilibili.upper.module.partitionTag.partitiontopicv2.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitiontopicv2/UpperFenquBiaoqianHuatiActivity.class */
@StabilityInferred(parameters = 0)
public final class UpperFenquBiaoqianHuatiActivity extends com.bilibili.upper.module.partitionTag.partitionTopic.activity.a {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final int f113890Q = 0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f113891K = new ViewModelLazy(Reflection.getOrCreateKotlinClass(AI0.f.class), new c(this), new b(this), new d(this));

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f113892L = new ViewModelLazy(Reflection.getOrCreateKotlinClass(AI0.i.class), new f(this), new e(this), new g(this));

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public C5006k2 f113893M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    @Nullable
    public UpperFenquBiaoqianHuatiFragment f113894N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    @Nullable
    public PartitionHumanFragment f113895O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    @Nullable
    public PartitionFragment f113896P;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitiontopicv2/UpperFenquBiaoqianHuatiActivity$a.class */
    public static final /* synthetic */ class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f113897a;

        public a(Function1 function1) {
            this.f113897a = function1;
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
            return this.f113897a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f113897a.invoke(obj);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitiontopicv2/UpperFenquBiaoqianHuatiActivity$b.class */
    public static final class b implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UpperFenquBiaoqianHuatiActivity f113898a;

        public b(UpperFenquBiaoqianHuatiActivity upperFenquBiaoqianHuatiActivity) {
            this.f113898a = upperFenquBiaoqianHuatiActivity;
        }

        public final Object invoke() {
            return this.f113898a.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitiontopicv2/UpperFenquBiaoqianHuatiActivity$c.class */
    public static final class c implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UpperFenquBiaoqianHuatiActivity f113899a;

        public c(UpperFenquBiaoqianHuatiActivity upperFenquBiaoqianHuatiActivity) {
            this.f113899a = upperFenquBiaoqianHuatiActivity;
        }

        public final Object invoke() {
            return this.f113899a.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitiontopicv2/UpperFenquBiaoqianHuatiActivity$d.class */
    public static final class d implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UpperFenquBiaoqianHuatiActivity f113900a;

        public d(UpperFenquBiaoqianHuatiActivity upperFenquBiaoqianHuatiActivity) {
            this.f113900a = upperFenquBiaoqianHuatiActivity;
        }

        public final Object invoke() {
            return this.f113900a.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitiontopicv2/UpperFenquBiaoqianHuatiActivity$e.class */
    public static final class e implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UpperFenquBiaoqianHuatiActivity f113901a;

        public e(UpperFenquBiaoqianHuatiActivity upperFenquBiaoqianHuatiActivity) {
            this.f113901a = upperFenquBiaoqianHuatiActivity;
        }

        public final Object invoke() {
            return this.f113901a.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitiontopicv2/UpperFenquBiaoqianHuatiActivity$f.class */
    public static final class f implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UpperFenquBiaoqianHuatiActivity f113902a;

        public f(UpperFenquBiaoqianHuatiActivity upperFenquBiaoqianHuatiActivity) {
            this.f113902a = upperFenquBiaoqianHuatiActivity;
        }

        public final Object invoke() {
            return this.f113902a.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitiontopicv2/UpperFenquBiaoqianHuatiActivity$g.class */
    public static final class g implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UpperFenquBiaoqianHuatiActivity f113903a;

        public g(UpperFenquBiaoqianHuatiActivity upperFenquBiaoqianHuatiActivity) {
            this.f113903a = upperFenquBiaoqianHuatiActivity;
        }

        public final Object invoke() {
            return this.f113903a.getDefaultViewModelCreationExtras();
        }
    }

    public final AI0.i U6() {
        return (AI0.i) this.f113892L.getValue();
    }

    public final AI0.f V6() {
        return (AI0.f) this.f113891K.getValue();
    }

    public final void X6() {
        V6().getClass();
        C5006k2 c5006k2 = this.f113893M;
        C5006k2 c5006k22 = c5006k2;
        if (c5006k2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5006k22 = null;
        }
        c5006k22.f55753f.setCurrentItem(0, true);
        C5006k2 c5006k23 = this.f113893M;
        C5006k2 c5006k24 = c5006k23;
        if (c5006k23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5006k24 = null;
        }
        c5006k24.f55752e.setVisibility(0);
        C5006k2 c5006k25 = this.f113893M;
        C5006k2 c5006k26 = c5006k25;
        if (c5006k25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5006k26 = null;
        }
        c5006k26.f55750c.setVisibility(0);
        C5006k2 c5006k27 = this.f113893M;
        if (c5006k27 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5006k27 = null;
        }
        c5006k27.f55751d.setVisibility(0);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    @Override // com.bilibili.upper.module.partitionTag.partitionTopic.activity.a, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        String[] strArr;
        com.bilibili.upper.module.partitionTag.partitiontopicv2.e eVar;
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
        C5006k2 c5006k2Inflate = C5006k2.inflate(getLayoutInflater());
        setContentView(c5006k2Inflate.f55748a);
        this.f113893M = c5006k2Inflate;
        String str = com.bilibili.upper.module.contribute.up.util.m.a;
        System.currentTimeMillis();
        View view = this.f113740D;
        if (view != null) {
            view.setBackgroundResource(2131104211);
        }
        Bundle bundleExtra = getIntent().getBundleExtra(BundleUtil.KEY_DEFAULT_EXTRA_BUNDLE);
        if (bundleExtra != null) {
            AI0.f fVarV6 = V6();
            ArrayList<TypeMeta> parcelableArrayList = bundleExtra.getParcelableArrayList("PARTITION_TYPEMETA_LIST");
            ArrayList<TypeMeta> arrayList = parcelableArrayList;
            if (parcelableArrayList == null) {
                arrayList = new ArrayList<>();
            }
            fVarV6.f242i = arrayList;
            V6().Q0((UpperPartTagRequestParam) bundleExtra.getSerializable("PARTITION_TAG_PARAM"));
            UpperTopicRequestParam upperTopicRequestParam = (UpperTopicRequestParam) bundleExtra.getSerializable("TOPIC_REQUEST_PARAM");
            if (upperTopicRequestParam != null) {
                U6().f260f = upperTopicRequestParam;
            }
        }
        V6().f240f.observe(this, new a(new x(this, 4)));
        V6().h.observe(this, new a(new Jk0.c(this, 6)));
        V6().f241g.observe(this, new a(new Object()));
        V6().f243j.observe(this, new a(new GH0.g(this, 3)));
        UpperFenquBiaoqianHuatiFragment upperFenquBiaoqianHuatiFragment = this.f113894N;
        if (upperFenquBiaoqianHuatiFragment != null && (eVar = upperFenquBiaoqianHuatiFragment.f113908f) != null) {
            eVar.notifyItemChanged(0, b.C1232b.f113917a);
        }
        C5006k2 c5006k2 = this.f113893M;
        C5006k2 c5006k22 = c5006k2;
        if (c5006k2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5006k22 = null;
        }
        TouchTitleView touchTitleView = c5006k22.f55749b;
        int i7 = this.f113743G;
        int i8 = this.f113744H;
        touchTitleView.b(i7, i8, (int) ((i8 * 1.0f) / 4));
        C5006k2 c5006k23 = this.f113893M;
        C5006k2 c5006k24 = c5006k23;
        if (c5006k23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5006k24 = null;
        }
        c5006k24.f55749b.setCallback(new h(this));
        C5006k2 c5006k25 = this.f113893M;
        C5006k2 c5006k26 = c5006k25;
        if (c5006k25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5006k26 = null;
        }
        c5006k26.f55750c.setOnClickListener(new W9.k(this, 3));
        C5006k2 c5006k27 = this.f113893M;
        C5006k2 c5006k28 = c5006k27;
        if (c5006k27 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5006k28 = null;
        }
        c5006k28.f55751d.setOnClickListener(new Hv.c(this, 2));
        UpperFenquBiaoqianHuatiFragment upperFenquBiaoqianHuatiFragment2 = new UpperFenquBiaoqianHuatiFragment();
        upperFenquBiaoqianHuatiFragment2.setArguments(new Bundle());
        this.f113894N = upperFenquBiaoqianHuatiFragment2;
        Unit unit = Unit.INSTANCE;
        List listMutableListOf = CollectionsKt.mutableListOf(new Fragment[]{upperFenquBiaoqianHuatiFragment2});
        if (!V6().f246m.getHidType()) {
            int i9 = com.bilibili.upper.module.contribute.up.util.j.c;
            if (i9 == 0) {
                PartitionFragment partitionFragment = new PartitionFragment();
                this.f113896P = partitionFragment;
                listMutableListOf.add(partitionFragment);
            } else if (i9 == 2) {
                PartitionHumanFragment partitionHumanFragment = new PartitionHumanFragment();
                this.f113895O = partitionHumanFragment;
                listMutableListOf.add(partitionHumanFragment);
            }
        }
        int i10 = 2131850866;
        if (V6().f246m.getHidType()) {
            strArr = new String[]{getString(2131850866)};
        } else {
            if (!com.bilibili.upper.module.contribute.up.util.j.b) {
                i10 = 2131851057;
            }
            strArr = new String[]{getString(i10), com.bilibili.upper.module.contribute.up.util.j.a() ? getString(2131850909) : ""};
        }
        C5006k2 c5006k29 = this.f113893M;
        C5006k2 c5006k210 = c5006k29;
        if (c5006k29 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5006k210 = null;
        }
        c5006k210.f55752e.setText(strArr[0]);
        C5006k2 c5006k211 = this.f113893M;
        C5006k2 c5006k212 = c5006k211;
        if (c5006k211 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5006k212 = null;
        }
        c5006k212.f55753f.setAdapter(new NE0.c(getSupportFragmentManager(), listMutableListOf, strArr));
        C5006k2 c5006k213 = this.f113893M;
        if (c5006k213 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5006k213 = null;
        }
        c5006k213.f55753f.addOnPageChangeListener(new i(listMutableListOf, this, strArr));
        this.f113745I = new com.bilibili.upper.module.partitionTag.partitiontopicv2.g(this);
        AI0.f fVarV62 = V6();
        fVarV62.getClass();
        ((ArchiveApiService) ServiceGenerator.createService(ArchiveApiService.class)).getArchiveHumanPartitions(BiliAccounts.get(getApplicationContext()).mid()).enqueue(new AI0.e(fVarV62));
    }
}
