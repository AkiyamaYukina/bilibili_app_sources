package com.bilibili.upper.module.honour.ui;

import GO.q;
import Nj.D;
import Nj.E;
import Nj.F;
import TE0.b;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bI0.C5090c;
import com.bilibili.ad.adview.story.heartbeatbox.f;
import com.bilibili.base.BiliContext;
import com.bilibili.droid.BundleUtil;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.blrouter.MutableBundleLike;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.studio.videoeditor.extension.ActivityExtKt;
import com.bilibili.upper.module.honour.bean.KingHonourDownloadBean;
import com.bilibili.upper.module.honour.bean.KingHonourPreviewClipBean;
import com.bilibili.upper.module.honour.bean.KingHonourVideoBean;
import com.bilibili.upper.module.honour.ui.KingHonourPreviewActivity;
import com.bilibili.upper.module.honour.vm.c;
import dI0.C6802j;
import dI0.TextureViewSurfaceTextureListenerC6806n;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.M;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.stepbystep.StepByStepBottomSheetLoginActivity;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/ui/KingHonourPreviewActivity.class */
@StabilityInferred(parameters = 0)
public final class KingHonourPreviewActivity extends BaseAppCompatActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final int f113250W = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ImageView f113253D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public TextView f113254E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public LinearLayout f113255F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public TextureView f113256G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public TextView f113257H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public RecyclerView f113258I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public C5090c f113259J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public ImageView f113260K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public TextView f113261L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public LinearLayout f113262M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f113263N;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    @Nullable
    public ArrayList<KingHonourVideoBean> f113268S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    @Nullable
    public ArrayList<Integer> f113269T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f113270U;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final String f113251B = "KingHonourPreview";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final Lazy f113252C = LazyKt.lazy(new D(this, 6));

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    @NotNull
    public final Lazy f113264O = LazyKt.lazy(new E(this, 5));

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    @NotNull
    public final Lazy f113265P = LazyKt.lazy(new F(this, 5));

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    @NotNull
    public final List<KingHonourDownloadBean> f113266Q = new ArrayList();

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    @NotNull
    public final List<KingHonourDownloadBean> f113267R = new ArrayList();

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    @NotNull
    public final ArrayList<KingHonourPreviewClipBean> f113271V = new ArrayList<>();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/ui/KingHonourPreviewActivity$a.class */
    public static final /* synthetic */ class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f113272a;

        public a(Function1 function1) {
            this.f113272a = function1;
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
            return this.f113272a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f113272a.invoke(obj);
        }
    }

    public final void P6() {
        Object[] objArr = {new DecimalFormat("##0.0").format(((double) this.f113263N) / ((double) 1000))};
        Activity activity = BiliContext.topActivity();
        boolean zIsActive = ActivityExtKt.isActive(activity);
        Context fapp = activity;
        if (!zIsActive) {
            fapp = FoundationAlias.getFapp();
        }
        String string = fapp.getString(2131850757, Arrays.copyOf(objArr, objArr.length));
        TextView textView = this.f113261L;
        TextView textView2 = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTimeView");
            textView2 = null;
        }
        textView2.setText(string);
    }

    @NotNull
    public final c Q6() {
        return (c) this.f113252C.getValue();
    }

    public final void R6(boolean z6) {
        ImageView imageView = null;
        if (z6) {
            ImageView imageView2 = this.f113260K;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSelectCheck");
            } else {
                imageView = imageView2;
            }
            imageView.setBackground(getDrawable(2131241282));
            return;
        }
        ImageView imageView3 = this.f113260K;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSelectCheck");
            imageView3 = null;
        }
        imageView3.setBackground(getDrawable(2131241285));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View view) {
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (numValueOf != null && numValueOf.intValue() == 2131315807) {
            finish();
            return;
        }
        int i7 = 0;
        if (numValueOf != null && numValueOf.intValue() == 2131315818) {
            if (((ArrayList) this.f113266Q).size() == 0) {
                ToastHelper.showToastLong(this, 2131849254);
                return;
            }
            Q6().K0();
            eI0.c cVar = (eI0.c) ((eI0.c) new eI0.c(this).autoDismiss(true)).autoDismissDelay(0L);
            cVar.f117245f = getString(2131850903);
            cVar.show();
            b bVar = b.f24088a;
            int size = ((ArrayList) this.f113266Q).size();
            int i8 = this.f113263N;
            boolean z6 = this.f113270U;
            HashMap mapA = VF0.b.a(bVar);
            P4.b.a(size, mapA, "select_num", i8, "total_time");
            mapA.put("is_game", z6 ? "1" : "0");
            Unit unit = Unit.INSTANCE;
            Neurons.reportClick(false, "creation.wangzhezhanbao.custom.select.click", mapA);
            M.b("first url is ", ((KingHonourDownloadBean) ((ArrayList) this.f113266Q).get(0)).getUrl(), this.f113251B);
            for (Object obj : (ArrayList) this.f113266Q) {
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                KingHonourDownloadBean kingHonourDownloadBean = (KingHonourDownloadBean) obj;
                ((ArrayList) this.f113267R).add(new KingHonourDownloadBean(kingHonourDownloadBean.getUrl(), kingHonourDownloadBean.getIndex(), false, 4, null));
                i7++;
            }
            com.bilibili.upper.module.honour.utils.b bVar2 = com.bilibili.upper.module.honour.utils.b.f113332a;
            bVar2.d(this.f113267R);
            com.bilibili.upper.module.honour.utils.b.f113337f = new Rf.b(cVar, this);
            bVar2.e();
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 2131315816) {
            Integer value = Q6().f113383d.getValue();
            if ((value != null && value.intValue() == 4) || !Q6().I0()) {
                return;
            }
            if (Q6().f113381b.f17106a.isPlaying()) {
                Q6().K0();
                return;
            } else {
                Q6().M0();
                return;
            }
        }
        if (numValueOf != null && numValueOf.intValue() == 2131315822) {
            R6(((ArrayList) this.f113266Q).size() != this.f113268S.size());
            boolean z7 = ((ArrayList) this.f113266Q).size() != this.f113268S.size();
            this.f113263N = 0;
            ((ArrayList) this.f113266Q).clear();
            if (z7) {
                ArrayList<KingHonourVideoBean> arrayList = this.f113268S;
                if (arrayList != null) {
                    int i9 = 0;
                    for (Object obj2 : arrayList) {
                        if (i9 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        KingHonourVideoBean kingHonourVideoBean = (KingHonourVideoBean) obj2;
                        ((ArrayList) this.f113266Q).add(new KingHonourDownloadBean(kingHonourVideoBean.videoUrl, i9, false, 4, null));
                        this.f113263N += kingHonourVideoBean.duration;
                        i9++;
                    }
                }
                Iterator<KingHonourPreviewClipBean> it = this.f113271V.iterator();
                while (it.hasNext()) {
                    it.next().isSelected = true;
                }
            } else {
                Iterator<KingHonourPreviewClipBean> it2 = this.f113271V.iterator();
                while (it2.hasNext()) {
                    it2.next().isSelected = false;
                }
            }
            C5090c c5090c = this.f113259J;
            if (c5090c == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                c5090c = null;
            }
            c5090c.f56425c = this.f113271V;
            c5090c.notifyDataSetChanged();
            P6();
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        View decorView;
        q.a(this, 2131104159);
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setSystemUiVisibility(4102);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(this, 2131104159)));
        }
        setContentView(2131500640);
        this.f113253D = (ImageView) findViewById(2131315807);
        this.f113254E = (TextView) findViewById(2131315809);
        this.f113256G = (TextureView) findViewById(2131315816);
        this.f113255F = (LinearLayout) findViewById(2131304677);
        this.f113257H = (TextView) findViewById(2131315818);
        this.f113258I = (RecyclerView) findViewById(2131315817);
        this.f113260K = (ImageView) findViewById(2131315820);
        this.f113261L = (TextView) findViewById(2131315825);
        this.f113262M = (LinearLayout) findViewById(2131315822);
        ImageView imageView = this.f113253D;
        ImageView imageView2 = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBackView");
            imageView2 = null;
        }
        imageView2.setOnClickListener(this);
        TextView textView = this.f113257H;
        TextView textView2 = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mConfirmView");
            textView2 = null;
        }
        textView2.setOnClickListener(this);
        TextureView textureView = this.f113256G;
        TextureView textureView2 = textureView;
        if (textureView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayView");
            textureView2 = null;
        }
        textureView2.setOnClickListener(this);
        LinearLayout linearLayout = this.f113262M;
        LinearLayout linearLayout2 = linearLayout;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSelectLayout");
            linearLayout2 = null;
        }
        linearLayout2.setOnClickListener(this);
        TextureView textureView3 = this.f113256G;
        TextureView textureView4 = textureView3;
        if (textureView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayView");
            textureView4 = null;
        }
        textureView4.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC6806n(this));
        Q6().f113383d.observe(this, new a(new f(this)));
        final int i7 = 0;
        Q6().f113385f.observe(this, new a(new Function1(this, i7) { // from class: dI0.k

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f116403a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f116404b;

            {
                this.f116403a = i7;
                this.f116404b = this;
            }

            public final Object invoke(Object obj) {
                Object obj2 = this.f116404b;
                switch (this.f116403a) {
                    case 0:
                        int i8 = KingHonourPreviewActivity.f113250W;
                        ((KingHonourPreviewActivity) obj2).Q6().L0((String) obj);
                        break;
                    default:
                        Bundle bundle2 = (Bundle) obj2;
                        MutableBundleLike mutableBundleLike = (MutableBundleLike) obj;
                        int i9 = StepByStepBottomSheetLoginActivity.C;
                        if (bundle2 != null) {
                            mutableBundleLike.put(BundleUtil.KEY_DEFAULT_EXTRA_BUNDLE, bundle2);
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        TextView textView3 = this.f113254E;
        TextView textView4 = textView3;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleView");
            textView4 = null;
        }
        textView4.setText(getString(2131850966));
        Bundle bundleExtra = getIntent().getBundleExtra("param_control");
        if (bundleExtra != null) {
            this.f113268S = (ArrayList) bundleExtra.getSerializable("king_honour_preview_data");
            Serializable serializable = bundleExtra.getSerializable("king_honour_local_video_index");
            this.f113269T = serializable instanceof ArrayList ? (ArrayList) serializable : null;
            this.f113270U = bundleExtra.getBoolean("king_honour_is_from_game_factory", false);
            String str = this.f113251B;
            ArrayList<Integer> arrayList = this.f113269T;
            BLog.e(str, "go preview number  is " + (arrayList != null ? Integer.valueOf(arrayList.size()) : null));
            ArrayList<KingHonourVideoBean> arrayList2 = this.f113268S;
            if (arrayList2 != null) {
                int i8 = 0;
                for (Object obj : arrayList2) {
                    if (i8 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    KingHonourVideoBean kingHonourVideoBean = (KingHonourVideoBean) obj;
                    KingHonourPreviewClipBean kingHonourPreviewClipBean = new KingHonourPreviewClipBean();
                    kingHonourPreviewClipBean.videoBean = kingHonourVideoBean;
                    ArrayList<Integer> arrayList3 = this.f113269T;
                    kingHonourPreviewClipBean.isSelected = arrayList3 != null ? arrayList3.contains(Integer.valueOf(i8)) : false;
                    this.f113271V.add(kingHonourPreviewClipBean);
                    i8++;
                }
            }
            ArrayList<Integer> arrayList4 = this.f113269T;
            if (arrayList4 != null) {
                int i9 = 0;
                for (Object obj2 : arrayList4) {
                    if (i9 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    int iIntValue = ((Number) obj2).intValue();
                    ((ArrayList) this.f113266Q).add(new KingHonourDownloadBean(this.f113268S.get(iIntValue).videoUrl, iIntValue, false, 4, null));
                    this.f113263N += this.f113268S.get(iIntValue).duration;
                    i9++;
                }
            }
        }
        ArrayList<KingHonourVideoBean> arrayList5 = this.f113268S;
        if (arrayList5 != null && !arrayList5.isEmpty()) {
            Q6().L0(this.f113268S.get(0).videoUrl);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(0);
        RecyclerView recyclerView = this.f113258I;
        RecyclerView recyclerView2 = recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mClipList");
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(linearLayoutManager);
        if (this.f113258I == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mClipList");
        }
        this.f113259J = new C5090c(this);
        RecyclerView recyclerView3 = this.f113258I;
        RecyclerView recyclerView4 = recyclerView3;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mClipList");
            recyclerView4 = null;
        }
        C5090c c5090c = this.f113259J;
        C5090c c5090c2 = c5090c;
        if (c5090c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            c5090c2 = null;
        }
        recyclerView4.setAdapter(c5090c2);
        C5090c c5090c3 = this.f113259J;
        C5090c c5090c4 = c5090c3;
        if (c5090c3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            c5090c4 = null;
        }
        c5090c4.f56425c = this.f113271V;
        c5090c4.notifyDataSetChanged();
        C5090c c5090c5 = this.f113259J;
        C5090c c5090c6 = c5090c5;
        if (c5090c5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            c5090c6 = null;
        }
        c5090c6.f56426d = new C6802j(this);
        TextView textView5 = this.f113261L;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTimeView");
            textView5 = null;
        }
        Activity activity = BiliContext.topActivity();
        boolean zIsActive = ActivityExtKt.isActive(activity);
        Context fapp = activity;
        if (!zIsActive) {
            fapp = FoundationAlias.getFapp();
        }
        textView5.setText(fapp.getString(2131850652));
        P6();
        ArrayList<KingHonourVideoBean> arrayList6 = this.f113268S;
        boolean z6 = false;
        if (arrayList6 != null) {
            z6 = false;
            if (((ArrayList) this.f113266Q).size() == arrayList6.size()) {
                z6 = true;
            }
        }
        R6(z6);
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        com.bilibili.upper.module.honour.utils.b.f113332a.a();
    }

    @Override // androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onPause() {
        super.onPause();
        Q6().K0();
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onResume() {
        super.onResume();
        ArrayList<KingHonourVideoBean> arrayList = this.f113268S;
        if (arrayList != null) {
            b bVar = b.f24088a;
            int size = arrayList.size();
            boolean z6 = this.f113270U;
            HashMap mapA = VF0.b.a(bVar);
            mapA.put("highlight_num", String.valueOf(size));
            mapA.put("is_game", z6 ? "1" : "0");
            Unit unit = Unit.INSTANCE;
            Neurons.reportExposure$default(false, "creation.wangzhezhanbao.custom.0.show", mapA, (List) null, 8, (Object) null);
        }
        Q6().M0();
    }
}
