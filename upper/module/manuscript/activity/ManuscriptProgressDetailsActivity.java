package com.bilibili.upper.module.manuscript.activity;

import Ob1.T;
import Ob1.Y;
import Ob1.g0;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.C4496a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import cf0.C5254b;
import com.bilibili.ad.core.click.I;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.BiliImageLoaderHelper;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.lib.ui.garb.Garb;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.studio.videoeditor.util.SimpleUtilKt;
import com.bilibili.upper.module.manuscript.bean.ManuscriptTranscodingEntity;
import com.bilibili.upper.module.manuscript.bean.ManuscriptVideosEntity;
import com.bilibili.upper.module.manuscript.bean.TranscodeTipsBean;
import com.bilibili.upper.module.manuscript.vm.ManuscriptProgressDetailsViewModel;
import gI0.H;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import nI0.C8076b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/ManuscriptProgressDetailsActivity.class */
@StabilityInferred(parameters = 0)
public final class ManuscriptProgressDetailsActivity extends BaseAppCompatActivity implements LF0.e {

    /* JADX INFO: renamed from: E1, reason: collision with root package name */
    public static final int f113427E1 = 0;

    /* JADX INFO: renamed from: A1, reason: collision with root package name */
    @Nullable
    public QF0.f f113428A1;

    /* JADX INFO: renamed from: B1, reason: collision with root package name */
    public boolean f113430B1;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ImageView f113431C;

    /* JADX INFO: renamed from: C1, reason: collision with root package name */
    public long f113432C1;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public TextView f113433D;

    /* JADX INFO: renamed from: D1, reason: collision with root package name */
    @Nullable
    public TranscodeTipsBean f113434D1;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public TextView f113435E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public SwipeRefreshLayout f113436F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ViewGroup f113437G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public LinearLayout f113438H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public TextView f113439I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public ImageView f113440J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public RecyclerView f113441K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public LinearLayout f113442L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public TextView f113443M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public ImageView f113444N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public ConstraintLayout f113445O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public TextView f113446P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public ProgressBar f113447Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public TextView f113448R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public LinearLayout f113449S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public TextView f113450T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public ImageView f113451U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextView f113452V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public RecyclerView f113453W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public ConstraintLayout f113454X;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public ConstraintLayout f113455X0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public TextView f113456Y;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public ConstraintLayout f113457Y0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public ProgressBar f113458Z;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public TextView f113459Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public TextView f113460a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public TextView f113461a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public TextView f113462b1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public LinearLayout f113463c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public TextView f113464c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public ConstraintLayout f113465d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public RecyclerView f113466e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public TextView f113467f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public TextView f113468g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public TextView f113469h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public ConstraintLayout f113470i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public TextView f113471j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public TextView f113472k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public TextView f113473l1;
    public TextView m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public ConstraintLayout f113474n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public TextView f113475o1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public LinearLayout f113476p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public TextView f113477p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public ConstraintLayout f113478q1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public TextView f113479r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public BiliImageView f113480r1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public gI0.G f113482t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    @Nullable
    public H f113483u1;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public ImageView f113484v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    @Nullable
    public C8076b f113485v1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public long f113486w1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public long f113487x1;
    public long y1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    @Nullable
    public String f113488z1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final String f113429B = "ManuscriptProgressDetailsActivity";

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    @NotNull
    public final Lazy f113481s1 = LazyKt.lazy(new ES0.m(this, 4));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/ManuscriptProgressDetailsActivity$a.class */
    public static final /* synthetic */ class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f113489a;

        public a(Function1 function1) {
            this.f113489a = function1;
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
            return this.f113489a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f113489a.invoke(obj);
        }
    }

    @Override // LF0.e
    public final void Cb(long j7) {
        e7(1);
        U6(true);
    }

    @Override // LF0.e
    public final void De(long j7) {
        e7(14);
        U6(true);
    }

    @Override // LF0.e
    public final void J(long j7) {
    }

    public final ManuscriptProgressDetailsViewModel P6() {
        return (ManuscriptProgressDetailsViewModel) this.f113481s1.getValue();
    }

    @Override // LF0.e
    public final void Pa(long j7) {
        e7(12);
    }

    public final int Q6() {
        int i7;
        ArrayList<ManuscriptVideosEntity.ManuscriptVideoDetailsEntity> arrayList;
        ManuscriptVideosEntity manuscriptVideosEntity = (ManuscriptVideosEntity) P6().f113681c.getValue();
        if (manuscriptVideosEntity != null && (arrayList = manuscriptVideosEntity.videos) != null) {
            Iterator<ManuscriptVideosEntity.ManuscriptVideoDetailsEntity> it = arrayList.iterator();
            i7 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i7 = -1;
                    break;
                }
                if (this.y1 == it.next().cid) {
                    break;
                }
                i7++;
            }
        } else {
            i7 = 0;
        }
        if (i7 < 0) {
            i7 = 0;
        }
        return i7;
    }

    public final int R6() {
        return Q6() + 1;
    }

    public final void S6() {
        QF0.f fVar = this.f113428A1;
        if (fVar != null) {
            fVar.k1(true);
        }
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 1000;
        BLRouter.routeTo(new RouteRequest.Builder(Uri.parse(this.f113486w1 <= 0 ? "activity://uper/manuscript-up/" : "activity://uper/manuscript-edit/")).extras(new I(2, this, intRef)).requestCode(intRef.element).build(), this);
    }

    public final void T6(int i7) {
        if (TextUtils.isEmpty(this.f113488z1)) {
            P6().S0(i7, this.f113487x1, this.f113486w1);
        } else {
            V6();
        }
    }

    public final void U6(boolean z6) {
        try {
            Window window = getWindow();
            if (window != null) {
                if (z6) {
                    window.addFlags(128);
                } else {
                    window.clearFlags(128);
                }
            }
        } catch (Exception e7) {
            BLog.e(this.f113429B, C4496a.a("exec needKeepScreenOn method exception , message is ", e7.getMessage()));
        }
    }

    public final void V6() {
        SwipeRefreshLayout swipeRefreshLayout = this.f113436F;
        SwipeRefreshLayout swipeRefreshLayout2 = swipeRefreshLayout;
        if (swipeRefreshLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSwRefresh");
            swipeRefreshLayout2 = null;
        }
        swipeRefreshLayout2.setRefreshing(false);
        ViewGroup viewGroup = this.f113437G;
        ViewGroup viewGroup2 = viewGroup;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNvsContentRoot");
            viewGroup2 = null;
        }
        viewGroup2.setVisibility(8);
        ConstraintLayout constraintLayout = this.f113474n1;
        ConstraintLayout constraintLayout2 = constraintLayout;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCslErrorParent");
            constraintLayout2 = null;
        }
        constraintLayout2.setVisibility(0);
        TextView textView = this.f113477p1;
        TextView textView2 = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvErrorOperate");
            textView2 = null;
        }
        textView2.setVisibility(0);
        TextView textView3 = this.f113475o1;
        TextView textView4 = textView3;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvErrorDescription");
            textView4 = null;
        }
        textView4.setText(this.f113488z1);
        TextView textView5 = this.f113477p1;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvErrorOperate");
            textView5 = null;
        }
        textView5.setTag(Boolean.TRUE);
    }

    public final void X6(boolean z6) {
        ImageView imageView = this.f113484v0;
        ImageView imageView2 = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImvReviewExpandSwitch");
            imageView2 = null;
        }
        if (imageView2.getVisibility() != 0) {
            ConstraintLayout constraintLayout = this.f113455X0;
            if (constraintLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCslReviewParent");
                constraintLayout = null;
            }
            constraintLayout.setVisibility(8);
            return;
        }
        P6().f113694q = z6;
        ImageView imageView3 = this.f113484v0;
        ImageView imageView4 = imageView3;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImvReviewExpandSwitch");
            imageView4 = null;
        }
        imageView4.setImageResource(z6 ? 2131244830 : 2131244829);
        ConstraintLayout constraintLayout2 = this.f113455X0;
        if (constraintLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCslReviewParent");
            constraintLayout2 = null;
        }
        int i7 = 8;
        if (z6) {
            i7 = 0;
        }
        constraintLayout2.setVisibility(i7);
    }

    @Override // LF0.e
    public final void Y3(long j7, @Nullable String str, @Nullable String str2) {
        e7(3);
        U6(false);
    }

    public final void Y6(ManuscriptVideosEntity.ManuscriptVideoDetailsEntity manuscriptVideoDetailsEntity) {
        if (manuscriptVideoDetailsEntity.cid == this.y1) {
            return;
        }
        gI0.G g7 = this.f113482t1;
        gI0.G g8 = g7;
        if (g7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mManuscriptSubsetDetailsAdapter");
            g8 = null;
        }
        g8.f119770c = manuscriptVideoDetailsEntity;
        gI0.G g9 = this.f113482t1;
        if (g9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mManuscriptSubsetDetailsAdapter");
            g9 = null;
        }
        g9.notifyDataSetChanged();
        this.y1 = manuscriptVideoDetailsEntity.cid;
        ManuscriptTranscodingEntity manuscriptTranscodingEntity = (ManuscriptTranscodingEntity) ((HashMap) P6().f113701x.getValue()).get(Long.valueOf(this.y1));
        if (manuscriptTranscodingEntity != null) {
            c7(manuscriptTranscodingEntity);
        }
        H h = this.f113483u1;
        if (h != null) {
            ((LinkedHashMap) h.f119779d).clear();
        }
        P6().R0(this.f113487x1, this.f113486w1, (((long) Q6()) / 500) + 1);
        P6().O0(this.f113486w1, this.y1);
        P6().N0(this.f113486w1);
        P6().L0(this.f113486w1);
        b7();
    }

    @Override // LF0.e
    public final void Yb(long j7) {
        e7(5);
        U6(false);
    }

    @Override // LF0.e
    public final void a2(long j7, @Nullable String str) {
        e7(4);
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [com.bilibili.upper.module.manuscript.activity.n] */
    public final void a7(boolean z6) {
        ArrayList<ManuscriptVideosEntity.ManuscriptVideoDetailsEntity> arrayList;
        ManuscriptVideosEntity.ManuscriptVideoDetailsEntity manuscriptVideoDetailsEntity;
        Object next;
        ImageView imageView = this.f113440J;
        ImageView imageView2 = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImvSubsetExpandSwitch");
            imageView2 = null;
        }
        imageView2.setTag(Boolean.valueOf(z6));
        ImageView imageView3 = this.f113440J;
        ImageView imageView4 = imageView3;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImvSubsetExpandSwitch");
            imageView4 = null;
        }
        imageView4.setImageResource(z6 ? 2131244824 : 2131244823);
        if (!z6) {
            C8076b c8076b = this.f113485v1;
            if (c8076b != null) {
                c8076b.dismiss();
                return;
            }
            return;
        }
        ManuscriptVideosEntity manuscriptVideosEntity = (ManuscriptVideosEntity) P6().f113681c.getValue();
        if (manuscriptVideosEntity == null || (arrayList = manuscriptVideosEntity.videos) == null || arrayList.isEmpty()) {
            return;
        }
        if (this.f113485v1 == null) {
            final C8076b c8076b2 = new C8076b(this);
            ManuscriptVideosEntity.ManuscriptVideosPageEntity manuscriptVideosPageEntity = manuscriptVideosEntity.page;
            c8076b2.f124028e = (manuscriptVideosPageEntity != null ? manuscriptVideosPageEntity.total : 0L) <= ((long) arrayList.size());
            gI0.G g7 = c8076b2.f124026c;
            gI0.G g8 = g7;
            if (g7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mManuscriptSubsetDetailsAdapter");
                g8 = null;
            }
            g8.f119768a = arrayList;
            gI0.G g9 = c8076b2.f124026c;
            gI0.G g10 = g9;
            if (g9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mManuscriptSubsetDetailsAdapter");
                g10 = null;
            }
            g10.notifyDataSetChanged();
            c8076b2.f124027d = false;
            c8076b2.f124029f = new Function3(this, c8076b2) { // from class: com.bilibili.upper.module.manuscript.activity.n

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ManuscriptProgressDetailsActivity f113549a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final C8076b f113550b;

                {
                    this.f113549a = this;
                    this.f113550b = c8076b2;
                }

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit unit;
                    ManuscriptVideosEntity.ManuscriptVideoDetailsEntity manuscriptVideoDetailsEntity2 = (ManuscriptVideosEntity.ManuscriptVideoDetailsEntity) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    List<? extends ManuscriptVideosEntity.ManuscriptVideoDetailsEntity> list = (List) obj3;
                    int i7 = ManuscriptProgressDetailsActivity.f113427E1;
                    TE0.b bVar = TE0.b.f24088a;
                    ManuscriptProgressDetailsActivity manuscriptProgressDetailsActivity = this.f113549a;
                    long j7 = manuscriptProgressDetailsActivity.f113486w1;
                    long j8 = manuscriptVideoDetailsEntity2.cid;
                    bVar.getClass();
                    TE0.b.r0(iIntValue + 1, j7, j8);
                    C8076b c8076b3 = this.f113550b;
                    if (c8076b3.isShowing()) {
                        c8076b3.dismiss();
                    }
                    if (manuscriptVideoDetailsEntity2.cid == manuscriptProgressDetailsActivity.y1) {
                        unit = Unit.INSTANCE;
                    } else {
                        gI0.G g11 = manuscriptProgressDetailsActivity.f113482t1;
                        gI0.G g12 = g11;
                        if (g11 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mManuscriptSubsetDetailsAdapter");
                            g12 = null;
                        }
                        g12.f119768a = list;
                        manuscriptProgressDetailsActivity.Y6(manuscriptVideoDetailsEntity2);
                        unit = Unit.INSTANCE;
                    }
                    return unit;
                }
            };
            c8076b2.f124030g = new ES0.n(this, 5);
            c8076b2.setOnDismissListener(new PopupWindow.OnDismissListener(this) { // from class: com.bilibili.upper.module.manuscript.activity.o

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ManuscriptProgressDetailsActivity f113551a;

                {
                    this.f113551a = this;
                }

                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    ManuscriptProgressDetailsActivity manuscriptProgressDetailsActivity = this.f113551a;
                    int i7 = ManuscriptProgressDetailsActivity.f113427E1;
                    TE0.b bVar = TE0.b.f24088a;
                    long j7 = manuscriptProgressDetailsActivity.f113486w1;
                    long j8 = manuscriptProgressDetailsActivity.y1;
                    int iR6 = manuscriptProgressDetailsActivity.R6();
                    bVar.getClass();
                    TE0.b.s0(j7, j8, iR6, false, "分p稿件");
                    manuscriptProgressDetailsActivity.a7(false);
                    ImageView imageView5 = manuscriptProgressDetailsActivity.f113440J;
                    ImageView imageView6 = imageView5;
                    if (imageView5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mImvSubsetExpandSwitch");
                        imageView6 = null;
                    }
                    imageView6.postDelayed(new T(manuscriptProgressDetailsActivity, 3), 500L);
                }
            });
            c8076b2.setAnimationStyle(0);
            this.f113485v1 = c8076b2;
        }
        C8076b c8076b3 = this.f113485v1;
        if (c8076b3 != null) {
            long j7 = this.y1;
            gI0.G g11 = c8076b3.f124026c;
            gI0.G g12 = g11;
            if (g11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mManuscriptSubsetDetailsAdapter");
                g12 = null;
            }
            List<? extends ManuscriptVideosEntity.ManuscriptVideoDetailsEntity> list = g12.f119768a;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (((ManuscriptVideosEntity.ManuscriptVideoDetailsEntity) next).cid == j7) {
                            break;
                        }
                    }
                }
                manuscriptVideoDetailsEntity = (ManuscriptVideosEntity.ManuscriptVideoDetailsEntity) next;
            } else {
                manuscriptVideoDetailsEntity = null;
            }
            g12.f119770c = manuscriptVideoDetailsEntity;
            gI0.G g13 = c8076b3.f124026c;
            if (g13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mManuscriptSubsetDetailsAdapter");
                g13 = null;
            }
            g13.notifyDataSetChanged();
        }
        final int i7 = 0;
        getWindow().getDecorView().post(new Runnable(this, i7) { // from class: com.bilibili.upper.module.manuscript.activity.p

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f113552a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f113553b;

            {
                this.f113552a = i7;
                this.f113553b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C8076b c8076b4;
                Insets insets;
                switch (this.f113552a) {
                    case 0:
                        ManuscriptProgressDetailsActivity manuscriptProgressDetailsActivity = (ManuscriptProgressDetailsActivity) this.f113553b;
                        int i8 = ManuscriptProgressDetailsActivity.f113427E1;
                        if (SimpleUtilKt.isActivityAlive(manuscriptProgressDetailsActivity)) {
                            LinearLayout linearLayout = manuscriptProgressDetailsActivity.f113438H;
                            LinearLayout linearLayout2 = linearLayout;
                            if (linearLayout == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mLlSubsetHead");
                                linearLayout2 = null;
                            }
                            if (linearLayout2.getWindowToken() != null) {
                                int[] iArr = new int[2];
                                LinearLayout linearLayout3 = manuscriptProgressDetailsActivity.f113438H;
                                LinearLayout linearLayout4 = linearLayout3;
                                if (linearLayout3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mLlSubsetHead");
                                    linearLayout4 = null;
                                }
                                linearLayout4.getLocationInWindow(iArr);
                                int i9 = iArr[1];
                                LinearLayout linearLayout5 = manuscriptProgressDetailsActivity.f113438H;
                                LinearLayout linearLayout6 = linearLayout5;
                                if (linearLayout5 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mLlSubsetHead");
                                    linearLayout6 = null;
                                }
                                int height = linearLayout6.getHeight();
                                int measuredHeight = manuscriptProgressDetailsActivity.getWindow().getDecorView().getMeasuredHeight();
                                WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(manuscriptProgressDetailsActivity.getWindow().getDecorView());
                                int i10 = (measuredHeight - ((rootWindowInsets == null || (insets = rootWindowInsets.getInsets(WindowInsetsCompat.Type.navigationBars())) == null) ? 0 : insets.bottom)) - (height + i9);
                                ManuscriptProgressDetailsActivity manuscriptProgressDetailsActivity2 = i10 > 0 ? manuscriptProgressDetailsActivity : null;
                                if (manuscriptProgressDetailsActivity2 != null && (c8076b4 = manuscriptProgressDetailsActivity2.f113485v1) != null) {
                                    c8076b4.setHeight(i10);
                                }
                                C8076b c8076b5 = manuscriptProgressDetailsActivity.f113485v1;
                                if (c8076b5 != null) {
                                    LinearLayout linearLayout7 = manuscriptProgressDetailsActivity.f113438H;
                                    LinearLayout linearLayout8 = linearLayout7;
                                    if (linearLayout7 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mLlSubsetHead");
                                        linearLayout8 = null;
                                    }
                                    c8076b5.showAsDropDown(linearLayout8, 0, 0);
                                }
                                ImageView imageView5 = manuscriptProgressDetailsActivity.f113440J;
                                if (imageView5 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mImvSubsetExpandSwitch");
                                    imageView5 = null;
                                }
                                imageView5.setEnabled(false);
                            }
                        }
                        break;
                    default:
                        eH0.n nVar = (eH0.n) this.f113553b;
                        nVar.q();
                        nVar.r = false;
                        break;
                }
            }
        });
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    public final void b7() {
        QF0.f fVar = this.f113428A1;
        if (fVar != null) {
            fVar.T0(this);
        }
        if (this.f113487x1 <= 0 || this.y1 > 0) {
            i7();
        } else {
            QF0.f fVarK = LF0.d.j(getApplicationContext()).k(this.f113487x1);
            if (fVarK != null) {
                this.f113428A1 = fVarK;
                fVarK.n0(this);
                int taskStatus = fVarK.getTaskStatus();
                boolean z6 = true;
                if (taskStatus != 0) {
                    z6 = true;
                    if (taskStatus != 1) {
                        z6 = true;
                        if (taskStatus != 4) {
                            z6 = true;
                            if (taskStatus != 14) {
                                z6 = true;
                                if (taskStatus != 12) {
                                    z6 = taskStatus == 13;
                                }
                            }
                        }
                    }
                }
                U6(z6);
                ImageView imageView = this.f113444N;
                ImageView imageView2 = imageView;
                if (imageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mImvUploadExpandSwitch");
                    imageView2 = null;
                }
                imageView2.setVisibility(0);
                e7(fVarK.getTaskStatus());
            }
        }
        g7(P6().f113692o);
    }

    public final void c7(ManuscriptTranscodingEntity manuscriptTranscodingEntity) {
        ManuscriptProgressDetailsViewModel manuscriptProgressDetailsViewModelP6 = P6();
        Job job = manuscriptProgressDetailsViewModelP6.f113687j;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        manuscriptProgressDetailsViewModelP6.f113687j = null;
        ImageView imageView = this.f113451U;
        ImageView imageView2 = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImvTranscodingExpandSwitch");
            imageView2 = null;
        }
        imageView2.setVisibility(4);
        CharSequence charSequence = "未开始";
        if (manuscriptTranscodingEntity == null) {
            TextView textView = this.f113450T;
            TextView textView2 = textView;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvTranscodingStatus");
                textView2 = null;
            }
            textView2.setText("未开始");
            TextView textView3 = this.f113450T;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvTranscodingStatus");
                textView3 = null;
            }
            jI0.e.a(textView3);
            return;
        }
        int i7 = manuscriptTranscodingEntity.xcode_state;
        if (i7 == 0) {
            TextView textView4 = this.f113450T;
            TextView textView5 = textView4;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvTranscodingStatus");
                textView5 = null;
            }
            int i8 = manuscriptTranscodingEntity.xcode_state;
            if (i8 != 0) {
                if (i8 == 1) {
                    charSequence = "进行中";
                } else if (i8 == 2) {
                    charSequence = "转码完成";
                } else if (i8 == 3) {
                    charSequence = "转码失败";
                }
            }
            textView5.setText(charSequence);
            TextView textView6 = this.f113450T;
            if (textView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvTranscodingStatus");
                textView6 = null;
            }
            jI0.e.a(textView6);
        } else if (i7 == 1) {
            TextView textView7 = this.f113450T;
            TextView textView8 = textView7;
            if (textView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvTranscodingStatus");
                textView8 = null;
            }
            int i9 = manuscriptTranscodingEntity.xcode_state;
            if (i9 != 0) {
                if (i9 == 1) {
                    charSequence = "进行中";
                } else if (i9 == 2) {
                    charSequence = "转码完成";
                } else if (i9 == 3) {
                    charSequence = "转码失败";
                }
            }
            textView8.setText(charSequence);
            TextView textView9 = this.f113450T;
            TextView textView10 = textView9;
            if (textView9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvTranscodingStatus");
                textView10 = null;
            }
            jI0.e.d(textView10);
            if (this.f113483u1 == null) {
                RecyclerView recyclerView = this.f113453W;
                RecyclerView recyclerView2 = recyclerView;
                if (recyclerView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mRvTranscodingDetails");
                    recyclerView2 = null;
                }
                recyclerView2.setLayoutManager(new LinearLayoutManager(this, 1, false));
                this.f113483u1 = new H();
                RecyclerView recyclerView3 = this.f113453W;
                RecyclerView recyclerView4 = recyclerView3;
                if (recyclerView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mRvTranscodingDetails");
                    recyclerView4 = null;
                }
                recyclerView4.setAdapter(this.f113483u1);
            }
            H h = this.f113483u1;
            if (h != null) {
                h.f119776a = manuscriptTranscodingEntity.transcode_list;
            }
            if (h != null) {
                h.f119777b = new ES0.t(this, 5);
            }
            TextView textView11 = this.f113452V;
            TextView textView12 = textView11;
            if (textView11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvTranscodingVideoFormatTips");
                textView12 = null;
            }
            textView12.setText(manuscriptTranscodingEntity.xcode_tip);
            ConstraintLayout constraintLayout = this.f113454X;
            ConstraintLayout constraintLayout2 = constraintLayout;
            if (constraintLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCslTranscodingParent");
                constraintLayout2 = null;
            }
            constraintLayout2.setVisibility(0);
            RecyclerView recyclerView5 = this.f113453W;
            RecyclerView recyclerView6 = recyclerView5;
            if (recyclerView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRvTranscodingDetails");
                recyclerView6 = null;
            }
            recyclerView6.setVisibility(0);
            TextView textView13 = this.f113452V;
            TextView textView14 = textView13;
            if (textView13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvTranscodingVideoFormatTips");
                textView14 = null;
            }
            textView14.setVisibility(TextUtils.isEmpty(manuscriptTranscodingEntity.xcode_tip) ? 8 : 0);
            TextView textView15 = this.f113460a0;
            TextView textView16 = textView15;
            if (textView15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvTranscodingSwitch");
                textView16 = null;
            }
            textView16.setVisibility(8);
            LinearLayout linearLayout = this.f113463c0;
            LinearLayout linearLayout2 = linearLayout;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLlTranscodingFailedDetails");
                linearLayout2 = null;
            }
            linearLayout2.setVisibility(8);
            ProgressBar progressBar = this.f113458Z;
            ProgressBar progressBar2 = progressBar;
            if (progressBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPbTranscodingFailedProgress");
                progressBar2 = null;
            }
            progressBar2.setVisibility(8);
            TextView textView17 = this.f113456Y;
            TextView textView18 = textView17;
            if (textView17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvTranscodingFailedContent");
                textView18 = null;
            }
            textView18.setVisibility(8);
            H h7 = this.f113483u1;
            if (h7 != null) {
                h7.N(0L);
            }
            ManuscriptProgressDetailsViewModel.T0(P6());
            ArrayList<ManuscriptTranscodingEntity.TranscodingDetailsEntity> arrayList = manuscriptTranscodingEntity.transcode_list;
            if ((arrayList != null && !arrayList.isEmpty()) || !TextUtils.isEmpty(manuscriptTranscodingEntity.xcode_tip)) {
                ImageView imageView3 = this.f113451U;
                if (imageView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mImvTranscodingExpandSwitch");
                    imageView3 = null;
                }
                imageView3.setVisibility(0);
            }
        } else if (i7 == 2) {
            TextView textView19 = this.f113450T;
            TextView textView20 = textView19;
            if (textView19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvTranscodingStatus");
                textView20 = null;
            }
            int i10 = manuscriptTranscodingEntity.xcode_state;
            if (i10 != 0) {
                if (i10 == 1) {
                    charSequence = "进行中";
                } else if (i10 == 2) {
                    charSequence = "转码完成";
                } else if (i10 == 3) {
                    charSequence = "转码失败";
                }
            }
            textView20.setText(charSequence);
            TextView textView21 = this.f113450T;
            TextView textView22 = textView21;
            if (textView21 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvTranscodingStatus");
                textView22 = null;
            }
            jI0.e.d(textView22);
            ArrayList<ManuscriptTranscodingEntity.TranscodingDetailsEntity> arrayList2 = manuscriptTranscodingEntity.transcode_list;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                ImageView imageView4 = this.f113451U;
                ImageView imageView5 = imageView4;
                if (imageView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mImvTranscodingExpandSwitch");
                    imageView5 = null;
                }
                imageView5.setVisibility(0);
                RecyclerView recyclerView7 = this.f113453W;
                RecyclerView recyclerView8 = recyclerView7;
                if (recyclerView7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mRvTranscodingDetails");
                    recyclerView8 = null;
                }
                recyclerView8.setVisibility(0);
                TextView textView23 = this.f113460a0;
                TextView textView24 = textView23;
                if (textView23 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvTranscodingSwitch");
                    textView24 = null;
                }
                textView24.setVisibility(8);
                LinearLayout linearLayout3 = this.f113463c0;
                LinearLayout linearLayout4 = linearLayout3;
                if (linearLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLlTranscodingFailedDetails");
                    linearLayout4 = null;
                }
                linearLayout4.setVisibility(8);
                ProgressBar progressBar3 = this.f113458Z;
                ProgressBar progressBar4 = progressBar3;
                if (progressBar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPbTranscodingFailedProgress");
                    progressBar4 = null;
                }
                progressBar4.setVisibility(8);
                TextView textView25 = this.f113456Y;
                TextView textView26 = textView25;
                if (textView25 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvTranscodingFailedContent");
                    textView26 = null;
                }
                textView26.setVisibility(8);
                TextView textView27 = this.f113452V;
                TextView textView28 = textView27;
                if (textView27 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvTranscodingVideoFormatTips");
                    textView28 = null;
                }
                textView28.setVisibility(8);
                if (this.f113483u1 == null) {
                    RecyclerView recyclerView9 = this.f113453W;
                    RecyclerView recyclerView10 = recyclerView9;
                    if (recyclerView9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mRvTranscodingDetails");
                        recyclerView10 = null;
                    }
                    recyclerView10.setLayoutManager(new LinearLayoutManager(this, 1, false));
                    this.f113483u1 = new H();
                    RecyclerView recyclerView11 = this.f113453W;
                    if (recyclerView11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mRvTranscodingDetails");
                        recyclerView11 = null;
                    }
                    recyclerView11.setAdapter(this.f113483u1);
                }
                H h8 = this.f113483u1;
                if (h8 != null) {
                    h8.f119776a = manuscriptTranscodingEntity.transcode_list;
                }
                if (h8 != null) {
                    h8.notifyDataSetChanged();
                }
            }
        } else if (i7 == 3) {
            TextView textView29 = this.f113450T;
            TextView textView30 = textView29;
            if (textView29 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvTranscodingStatus");
                textView30 = null;
            }
            int i11 = manuscriptTranscodingEntity.xcode_state;
            if (i11 != 0) {
                if (i11 == 1) {
                    charSequence = "进行中";
                } else if (i11 == 2) {
                    charSequence = "转码完成";
                } else if (i11 == 3) {
                    charSequence = "转码失败";
                }
            }
            textView30.setText(charSequence);
            TextView textView31 = this.f113456Y;
            TextView textView32 = textView31;
            if (textView31 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvTranscodingFailedContent");
                textView32 = null;
            }
            textView32.setText(manuscriptTranscodingEntity.fail_tip);
            TextView textView33 = this.f113450T;
            TextView textView34 = textView33;
            if (textView33 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvTranscodingStatus");
                textView34 = null;
            }
            jI0.e.c(textView34);
            ProgressBar progressBar5 = this.f113458Z;
            ProgressBar progressBar6 = progressBar5;
            if (progressBar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPbTranscodingFailedProgress");
                progressBar6 = null;
            }
            progressBar6.setProgress(manuscriptTranscodingEntity.mockProgress);
            TextView textView35 = this.f113450T;
            TextView textView36 = textView35;
            if (textView35 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvTranscodingStatus");
                textView36 = null;
            }
            textView36.setSelected(true);
            RecyclerView recyclerView12 = this.f113453W;
            RecyclerView recyclerView13 = recyclerView12;
            if (recyclerView12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRvTranscodingDetails");
                recyclerView13 = null;
            }
            recyclerView13.setVisibility(8);
            TextView textView37 = this.f113452V;
            TextView textView38 = textView37;
            if (textView37 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvTranscodingVideoFormatTips");
                textView38 = null;
            }
            textView38.setVisibility(8);
            TextView textView39 = this.f113460a0;
            TextView textView40 = textView39;
            if (textView39 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvTranscodingSwitch");
                textView40 = null;
            }
            textView40.setVisibility(0);
            LinearLayout linearLayout5 = this.f113463c0;
            LinearLayout linearLayout6 = linearLayout5;
            if (linearLayout5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLlTranscodingFailedDetails");
                linearLayout6 = null;
            }
            linearLayout6.setVisibility(0);
            ProgressBar progressBar7 = this.f113458Z;
            ProgressBar progressBar8 = progressBar7;
            if (progressBar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPbTranscodingFailedProgress");
                progressBar8 = null;
            }
            progressBar8.setVisibility(0);
            TextView textView41 = this.f113456Y;
            TextView textView42 = textView41;
            if (textView41 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvTranscodingFailedContent");
                textView42 = null;
            }
            textView42.setVisibility(0);
            ConstraintLayout constraintLayout3 = this.f113454X;
            ConstraintLayout constraintLayout4 = constraintLayout3;
            if (constraintLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCslTranscodingParent");
                constraintLayout4 = null;
            }
            constraintLayout4.setVisibility(0);
            LinearLayout linearLayout7 = this.f113463c0;
            LinearLayout linearLayout8 = linearLayout7;
            if (linearLayout7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLlTranscodingFailedDetails");
                linearLayout8 = null;
            }
            linearLayout8.removeAllViews();
            ArrayList<ManuscriptTranscodingEntity.TranscodingDetailsEntity> arrayList3 = manuscriptTranscodingEntity.transcode_list;
            if (arrayList3 != null) {
                int i12 = 0;
                for (Object obj : arrayList3) {
                    if (i12 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    ManuscriptTranscodingEntity.TranscodingDetailsEntity transcodingDetailsEntity = (ManuscriptTranscodingEntity.TranscodingDetailsEntity) obj;
                    LinearLayout linearLayout9 = this.f113463c0;
                    LinearLayout linearLayout10 = linearLayout9;
                    if (linearLayout9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mLlTranscodingFailedDetails");
                        linearLayout10 = null;
                    }
                    TintTextView tintTextView = new TintTextView(this);
                    tintTextView.setText(transcodingDetailsEntity.failure_reason);
                    tintTextView.setTextSize(2, 10.0f);
                    tintTextView.setTextColor(ContextCompat.getColor(getApplicationContext(), 2131104286));
                    tintTextView.setMaxLines(1);
                    tintTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.topMargin = i12 == 0 ? Jf1.h.c(6) : Jf1.h.c(4);
                    layoutParams.setMarginStart(Jf1.h.c(6));
                    if (i12 == manuscriptTranscodingEntity.transcode_list.size() - 1) {
                        layoutParams.bottomMargin = Jf1.h.c(6);
                    }
                    tintTextView.setLayoutParams(layoutParams);
                    linearLayout10.addView(tintTextView);
                    i12++;
                }
            }
            ArrayList<ManuscriptTranscodingEntity.TranscodingDetailsEntity> arrayList4 = manuscriptTranscodingEntity.transcode_list;
            if ((arrayList4 != null && !arrayList4.isEmpty()) || !TextUtils.isEmpty(manuscriptTranscodingEntity.fail_tip)) {
                ImageView imageView6 = this.f113451U;
                if (imageView6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mImvTranscodingExpandSwitch");
                    imageView6 = null;
                }
                imageView6.setVisibility(0);
            }
        }
        d7(P6().f113693p);
    }

    public final void d7(boolean z6) {
        ImageView imageView = this.f113451U;
        ImageView imageView2 = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImvTranscodingExpandSwitch");
            imageView2 = null;
        }
        if (imageView2.getVisibility() != 0) {
            ConstraintLayout constraintLayout = this.f113454X;
            if (constraintLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCslTranscodingParent");
                constraintLayout = null;
            }
            constraintLayout.setVisibility(8);
            return;
        }
        P6().f113693p = z6;
        ImageView imageView3 = this.f113451U;
        ImageView imageView4 = imageView3;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImvTranscodingExpandSwitch");
            imageView4 = null;
        }
        imageView4.setImageResource(z6 ? 2131244830 : 2131244829);
        ConstraintLayout constraintLayout2 = this.f113454X;
        if (constraintLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCslTranscodingParent");
            constraintLayout2 = null;
        }
        int i7 = 8;
        if (z6) {
            i7 = 0;
        }
        constraintLayout2.setVisibility(i7);
    }

    public final void e7(int i7) {
        switch (i7) {
            case 0:
                ImageView imageView = this.f113444N;
                ImageView imageView2 = imageView;
                if (imageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mImvUploadExpandSwitch");
                    imageView2 = null;
                }
                imageView2.setVisibility(4);
                ConstraintLayout constraintLayout = this.f113445O;
                ConstraintLayout constraintLayout2 = constraintLayout;
                if (constraintLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCslUploadParent");
                    constraintLayout2 = null;
                }
                constraintLayout2.setVisibility(8);
                TextView textView = this.f113443M;
                TextView textView2 = textView;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvUploadStatus");
                    textView2 = null;
                }
                textView2.setText("未开始");
                TextView textView3 = this.f113443M;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvUploadStatus");
                    textView3 = null;
                }
                jI0.e.a(textView3);
                break;
            case 1:
            case 4:
                ImageView imageView3 = this.f113444N;
                ImageView imageView4 = imageView3;
                if (imageView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mImvUploadExpandSwitch");
                    imageView4 = null;
                }
                imageView4.setVisibility(0);
                TextView textView4 = this.f113443M;
                TextView textView5 = textView4;
                if (textView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvUploadStatus");
                    textView5 = null;
                }
                textView5.setText("进行中");
                TextView textView6 = this.f113443M;
                TextView textView7 = textView6;
                if (textView6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvUploadStatus");
                    textView7 = null;
                }
                jI0.e.d(textView7);
                TextView textView8 = this.f113446P;
                TextView textView9 = textView8;
                if (textView8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvUploadProgressDetails");
                    textView9 = null;
                }
                QF0.f fVar = this.f113428A1;
                textView9.setText(fVar != null ? fVar.C0() : null);
                ProgressBar progressBar = this.f113447Q;
                ProgressBar progressBar2 = progressBar;
                if (progressBar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPbUpload");
                    progressBar2 = null;
                }
                QF0.f fVar2 = this.f113428A1;
                int progress = 0;
                if (fVar2 != null) {
                    progress = fVar2.getProgress();
                }
                progressBar2.setProgress(progress);
                TextView textView10 = this.f113448R;
                TextView textView11 = textView10;
                if (textView10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvUploadSwitch");
                    textView11 = null;
                }
                textView11.setText("点击暂停");
                TextView textView12 = this.f113448R;
                if (textView12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvUploadSwitch");
                    textView12 = null;
                }
                textView12.setTag(4);
                break;
            case 2:
                ImageView imageView5 = this.f113444N;
                ImageView imageView6 = imageView5;
                if (imageView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mImvUploadExpandSwitch");
                    imageView6 = null;
                }
                imageView6.setVisibility(0);
                TextView textView13 = this.f113443M;
                TextView textView14 = textView13;
                if (textView13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvUploadStatus");
                    textView14 = null;
                }
                textView14.setText("进行中");
                TextView textView15 = this.f113443M;
                TextView textView16 = textView15;
                if (textView15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvUploadStatus");
                    textView16 = null;
                }
                jI0.e.d(textView16);
                TextView textView17 = this.f113446P;
                TextView textView18 = textView17;
                if (textView17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvUploadProgressDetails");
                    textView18 = null;
                }
                QF0.f fVar3 = this.f113428A1;
                textView18.setText(fVar3 != null ? fVar3.C0() : null);
                ProgressBar progressBar3 = this.f113447Q;
                ProgressBar progressBar4 = progressBar3;
                if (progressBar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPbUpload");
                    progressBar4 = null;
                }
                QF0.f fVar4 = this.f113428A1;
                int progress2 = 0;
                if (fVar4 != null) {
                    progress2 = fVar4.getProgress();
                }
                progressBar4.setProgress(progress2);
                TextView textView19 = this.f113448R;
                TextView textView20 = textView19;
                if (textView19 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvUploadSwitch");
                    textView20 = null;
                }
                textView20.setText("继续上传");
                TextView textView21 = this.f113448R;
                if (textView21 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvUploadSwitch");
                    textView21 = null;
                }
                textView21.setTag(2);
                break;
            case 3:
            case 6:
            case 9:
            case 10:
            case 11:
                ImageView imageView7 = this.f113444N;
                ImageView imageView8 = imageView7;
                if (imageView7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mImvUploadExpandSwitch");
                    imageView8 = null;
                }
                imageView8.setVisibility(0);
                TextView textView22 = this.f113443M;
                TextView textView23 = textView22;
                if (textView22 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvUploadStatus");
                    textView23 = null;
                }
                textView23.setText("上传失败");
                TextView textView24 = this.f113443M;
                TextView textView25 = textView24;
                if (textView24 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvUploadStatus");
                    textView25 = null;
                }
                jI0.e.c(textView25);
                ProgressBar progressBar5 = this.f113447Q;
                ProgressBar progressBar6 = progressBar5;
                if (progressBar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPbUpload");
                    progressBar6 = null;
                }
                progressBar6.setAlpha(0.5f);
                TextView textView26 = this.f113446P;
                TextView textView27 = textView26;
                if (textView26 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvUploadProgressDetails");
                    textView27 = null;
                }
                QF0.f fVar5 = this.f113428A1;
                textView27.setText(fVar5 != null ? fVar5.C0() : null);
                TextView textView28 = this.f113448R;
                TextView textView29 = textView28;
                if (textView28 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvUploadSwitch");
                    textView29 = null;
                }
                textView29.setText("重新上传");
                TextView textView30 = this.f113448R;
                if (textView30 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvUploadSwitch");
                    textView30 = null;
                }
                textView30.setTag(3);
                break;
            case 5:
                i7();
                break;
            case 12:
                ImageView imageView9 = this.f113444N;
                ImageView imageView10 = imageView9;
                if (imageView9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mImvUploadExpandSwitch");
                    imageView10 = null;
                }
                imageView10.setVisibility(0);
                TextView textView31 = this.f113443M;
                TextView textView32 = textView31;
                if (textView31 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvUploadStatus");
                    textView32 = null;
                }
                textView32.setText("进行中");
                TextView textView33 = this.f113443M;
                TextView textView34 = textView33;
                if (textView33 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvUploadStatus");
                    textView34 = null;
                }
                jI0.e.d(textView34);
                TextView textView35 = this.f113446P;
                TextView textView36 = textView35;
                if (textView35 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvUploadProgressDetails");
                    textView36 = null;
                }
                QF0.f fVar6 = this.f113428A1;
                textView36.setText(fVar6 != null ? fVar6.C0() : null);
                ProgressBar progressBar7 = this.f113447Q;
                ProgressBar progressBar8 = progressBar7;
                if (progressBar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPbUpload");
                    progressBar8 = null;
                }
                QF0.f fVar7 = this.f113428A1;
                int progress3 = 0;
                if (fVar7 != null) {
                    progress3 = fVar7.getProgress();
                }
                progressBar8.setProgress(progress3);
                TextView textView37 = this.f113448R;
                TextView textView38 = textView37;
                if (textView37 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvUploadSwitch");
                    textView38 = null;
                }
                textView38.setText("点击暂停");
                TextView textView39 = this.f113448R;
                if (textView39 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvUploadSwitch");
                    textView39 = null;
                }
                textView39.setTag(4);
                break;
            case 13:
                ImageView imageView11 = this.f113444N;
                ImageView imageView12 = imageView11;
                if (imageView11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mImvUploadExpandSwitch");
                    imageView12 = null;
                }
                imageView12.setVisibility(0);
                TextView textView40 = this.f113443M;
                TextView textView41 = textView40;
                if (textView40 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvUploadStatus");
                    textView41 = null;
                }
                textView41.setText("进行中");
                TextView textView42 = this.f113443M;
                TextView textView43 = textView42;
                if (textView42 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvUploadStatus");
                    textView43 = null;
                }
                jI0.e.d(textView43);
                TextView textView44 = this.f113446P;
                TextView textView45 = textView44;
                if (textView44 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvUploadProgressDetails");
                    textView45 = null;
                }
                QF0.f fVar8 = this.f113428A1;
                textView45.setText(fVar8 != null ? fVar8.C0() : null);
                ProgressBar progressBar9 = this.f113447Q;
                ProgressBar progressBar10 = progressBar9;
                if (progressBar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPbUpload");
                    progressBar10 = null;
                }
                QF0.f fVar9 = this.f113428A1;
                int progress4 = 0;
                if (fVar9 != null) {
                    progress4 = fVar9.getProgress();
                }
                progressBar10.setProgress(progress4);
                TextView textView46 = this.f113448R;
                TextView textView47 = textView46;
                if (textView46 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvUploadSwitch");
                    textView47 = null;
                }
                textView47.setText("点击暂停");
                TextView textView48 = this.f113448R;
                if (textView48 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvUploadSwitch");
                    textView48 = null;
                }
                textView48.setTag(4);
                break;
            case 14:
                ImageView imageView13 = this.f113444N;
                ImageView imageView14 = imageView13;
                if (imageView13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mImvUploadExpandSwitch");
                    imageView14 = null;
                }
                imageView14.setVisibility(0);
                TextView textView49 = this.f113443M;
                TextView textView50 = textView49;
                if (textView49 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvUploadStatus");
                    textView50 = null;
                }
                textView50.setText("排队中");
                TextView textView51 = this.f113443M;
                TextView textView52 = textView51;
                if (textView51 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvUploadStatus");
                    textView52 = null;
                }
                jI0.e.d(textView52);
                TextView textView53 = this.f113446P;
                TextView textView54 = textView53;
                if (textView53 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvUploadProgressDetails");
                    textView54 = null;
                }
                QF0.f fVar10 = this.f113428A1;
                bk.x.a(textView54, fVar10 != null ? fVar10.C0() : null, ",上传期间请勿关闭app");
                ProgressBar progressBar11 = this.f113447Q;
                ProgressBar progressBar12 = progressBar11;
                if (progressBar11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPbUpload");
                    progressBar12 = null;
                }
                QF0.f fVar11 = this.f113428A1;
                int progress5 = 0;
                if (fVar11 != null) {
                    progress5 = fVar11.getProgress();
                }
                progressBar12.setProgress(progress5);
                TextView textView55 = this.f113448R;
                TextView textView56 = textView55;
                if (textView55 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvUploadSwitch");
                    textView56 = null;
                }
                textView56.setText("点击暂停");
                TextView textView57 = this.f113448R;
                if (textView57 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvUploadSwitch");
                    textView57 = null;
                }
                textView57.setTag(14);
                break;
        }
    }

    @Override // LF0.e
    public final void f4(long j7) {
    }

    public final void g7(boolean z6) {
        ImageView imageView = this.f113444N;
        ImageView imageView2 = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImvUploadExpandSwitch");
            imageView2 = null;
        }
        if (imageView2.getVisibility() != 0) {
            ConstraintLayout constraintLayout = this.f113445O;
            if (constraintLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCslUploadParent");
                constraintLayout = null;
            }
            constraintLayout.setVisibility(8);
            return;
        }
        P6().f113692o = z6;
        ImageView imageView3 = this.f113444N;
        ImageView imageView4 = imageView3;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImvUploadExpandSwitch");
            imageView4 = null;
        }
        imageView4.setImageResource(z6 ? 2131244830 : 2131244829);
        ConstraintLayout constraintLayout2 = this.f113445O;
        if (constraintLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCslUploadParent");
            constraintLayout2 = null;
        }
        int i7 = 8;
        if (z6) {
            i7 = 0;
        }
        constraintLayout2.setVisibility(i7);
    }

    public final void i7() {
        ImageView imageView = this.f113444N;
        ImageView imageView2 = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImvUploadExpandSwitch");
            imageView2 = null;
        }
        imageView2.setVisibility(4);
        ConstraintLayout constraintLayout = this.f113445O;
        ConstraintLayout constraintLayout2 = constraintLayout;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCslUploadParent");
            constraintLayout2 = null;
        }
        constraintLayout2.setVisibility(8);
        TextView textView = this.f113443M;
        TextView textView2 = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvUploadStatus");
            textView2 = null;
        }
        textView2.setText("上传完成");
        TextView textView3 = this.f113443M;
        TextView textView4 = textView3;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvUploadStatus");
            textView4 = null;
        }
        jI0.e.d(textView4);
        TextView textView5 = this.f113448R;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvUploadSwitch");
            textView5 = null;
        }
        textView5.setTag(5);
    }

    @Override // LF0.e
    public final void l7(long j7) {
        int iQ6 = this.f113486w1 > 0 ? Q6() : -1;
        this.f113428A1 = null;
        this.f113487x1 = 0L;
        this.f113486w1 = j7;
        T6(iQ6);
    }

    @Override // LF0.e
    public final void ma(long j7) {
        e7(2);
        U6(false);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        super.onActivityResult(i7, i8, intent);
        if ((i7 == 1000 || i7 == 1002 || i7 == 1001) && i8 != 0) {
            setResult(-1);
            finish();
        }
    }

    /* JADX WARN: Type inference failed for: r0v176, types: [androidx.recyclerview.widget.RecyclerView$Adapter, gI0.G] */
    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        String queryParameter;
        Long longOrNull;
        super.onCreate(bundle);
        setContentView(2131502693);
        String dataString = getIntent().getDataString();
        long j7 = 0;
        if (dataString == null || !StringsKt.n(dataString, "/user_center/query_progress_link")) {
            Bundle bundleExtra = getIntent().getBundleExtra("param_control");
            this.f113486w1 = bundleExtra != null ? bundleExtra.getLong("key_video_aid", 0L) : 0L;
            Bundle bundleExtra2 = getIntent().getBundleExtra("param_control");
            if (bundleExtra2 != null) {
                j7 = bundleExtra2.getLong("INTENTE_DATA_TASKID", 0L);
            }
            this.f113487x1 = j7;
            Bundle bundleExtra3 = getIntent().getBundleExtra("param_control");
            this.f113488z1 = bundleExtra3 != null ? bundleExtra3.getString("key_manuscript_remind_text", null) : null;
        } else {
            Uri uri = Uri.parse(dataString);
            this.f113486w1 = (uri == null || (queryParameter = uri.getQueryParameter("aid")) == null || (longOrNull = StringsKt.toLongOrNull(queryParameter)) == null) ? 0L : longOrNull.longValue();
            long jLongValue = 0;
            if (uri != null) {
                String queryParameter2 = uri.getQueryParameter("task_id");
                jLongValue = 0;
                if (queryParameter2 != null) {
                    Long longOrNull2 = StringsKt.toLongOrNull(queryParameter2);
                    jLongValue = 0;
                    if (longOrNull2 != null) {
                        jLongValue = longOrNull2.longValue();
                    }
                }
            }
            this.f113487x1 = jLongValue;
            this.f113488z1 = uri != null ? uri.getQueryParameter("remind_text") : null;
        }
        this.f113431C = (ImageView) findViewById(2131302849);
        this.f113433D = (TextView) findViewById(2131310560);
        this.f113435E = (TextView) findViewById(2131320940);
        this.f113436F = (SwipeRefreshLayout) findViewById(2131320892);
        this.f113437G = (ViewGroup) findViewById(2131320872);
        this.f113438H = (LinearLayout) findViewById(2131320859);
        this.f113439I = (TextView) findViewById(2131320939);
        this.f113440J = (ImageView) findViewById(2131320836);
        this.f113441K = (RecyclerView) findViewById(2131320888);
        this.f113442L = (LinearLayout) findViewById(2131320862);
        this.f113443M = (TextView) findViewById(2131320705);
        this.f113444N = (ImageView) findViewById(2131320838);
        this.f113445O = (ConstraintLayout) findViewById(2131320826);
        this.f113446P = (TextView) findViewById(2131320948);
        this.f113447Q = (ProgressBar) findViewById(2131320877);
        this.f113448R = (TextView) findViewById(2131320949);
        this.f113449S = (LinearLayout) findViewById(2131320861);
        this.f113450T = (TextView) findViewById(2131320944);
        this.f113451U = (ImageView) findViewById(2131320837);
        this.f113452V = (TextView) findViewById(2131320947);
        this.f113453W = (RecyclerView) findViewById(2131320889);
        this.f113454X = (ConstraintLayout) findViewById(2131320825);
        this.f113456Y = (TextView) findViewById(2131320943);
        this.f113458Z = (ProgressBar) findViewById(2131320876);
        this.f113460a0 = (TextView) findViewById(2131320945);
        this.f113463c0 = (LinearLayout) findViewById(2131320860);
        this.f113476p0 = (LinearLayout) findViewById(2131320857);
        this.f113479r0 = (TextView) findViewById(2131320935);
        this.f113484v0 = (ImageView) findViewById(2131320835);
        this.f113455X0 = (ConstraintLayout) findViewById(2131320822);
        this.f113457Y0 = (ConstraintLayout) findViewById(2131320824);
        this.f113459Z0 = (TextView) findViewById(2131320916);
        this.f113461a1 = (TextView) findViewById(2131320915);
        this.f113462b1 = (TextView) findViewById(2131320917);
        this.f113464c1 = (TextView) findViewById(2131320906);
        this.f113465d1 = (ConstraintLayout) findViewById(2131320823);
        this.f113466e1 = (RecyclerView) findViewById(2131320887);
        this.f113467f1 = (TextView) findViewById(2131320934);
        this.f113468g1 = (TextView) findViewById(2131320932);
        this.f113469h1 = (TextView) findViewById(2131320933);
        this.f113470i1 = (ConstraintLayout) findViewById(2131320821);
        this.f113471j1 = (TextView) findViewById(2131320921);
        this.f113472k1 = (TextView) findViewById(2131320919);
        this.f113473l1 = (TextView) findViewById(2131320918);
        this.m1 = (TextView) findViewById(2131320920);
        this.f113474n1 = (ConstraintLayout) findViewById(2131320819);
        this.f113475o1 = (TextView) findViewById(2131320909);
        this.f113477p1 = (TextView) findViewById(2131320910);
        this.f113478q1 = (ConstraintLayout) findViewById(2131320820);
        this.f113480r1 = findViewById(2131320834);
        findViewById(2131321213).setOnClickListener(new com.bilibili.bililive.infra.widget.dialog.g(this, 1));
        ImageView imageView = this.f113431C;
        ImageView imageView2 = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImvBack");
            imageView2 = null;
        }
        imageView2.setOnClickListener(new com.bilibili.biligame.business.pegasus.view.c(this, 1));
        ImageView imageView3 = this.f113440J;
        ImageView imageView4 = imageView3;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImvSubsetExpandSwitch");
            imageView4 = null;
        }
        imageView4.setOnClickListener(new Yn.b(this, 2));
        LinearLayout linearLayout = this.f113442L;
        LinearLayout linearLayout2 = linearLayout;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLlUploadHead");
            linearLayout2 = null;
        }
        linearLayout2.setOnClickListener(new com.bilibili.biligame.business.pegasus.view.d(this, 1));
        LinearLayout linearLayout3 = this.f113449S;
        LinearLayout linearLayout4 = linearLayout3;
        if (linearLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLlTranscodingHead");
            linearLayout4 = null;
        }
        linearLayout4.setOnClickListener(new s(this, 0));
        LinearLayout linearLayout5 = this.f113476p0;
        LinearLayout linearLayout6 = linearLayout5;
        if (linearLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLlReviewHead");
            linearLayout6 = null;
        }
        linearLayout6.setOnClickListener(new g0(this, 3));
        TextView textView = this.f113448R;
        TextView textView2 = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvUploadSwitch");
            textView2 = null;
        }
        textView2.setOnClickListener(new Kq.m(this, 2));
        TextView textView3 = this.f113460a0;
        TextView textView4 = textView3;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvTranscodingSwitch");
            textView4 = null;
        }
        textView4.setOnClickListener(new Kq.n(this, 3));
        TextView textView5 = this.f113467f1;
        TextView textView6 = textView5;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvReviewOpen");
            textView6 = null;
        }
        textView6.setOnClickListener(new com.bilibili.search2.result.holder.comic.f(this, 1));
        TextView textView7 = this.f113468g1;
        TextView textView8 = textView7;
        if (textView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvReviewAppeal");
            textView8 = null;
        }
        textView8.setOnClickListener(new Kq.p(this, 3));
        TextView textView9 = this.f113469h1;
        TextView textView10 = textView9;
        if (textView9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvReviewModify");
            textView10 = null;
        }
        textView10.setOnClickListener(new com.bilibili.bililive.infra.widget.dialog.f(this, 1));
        TextView textView11 = this.m1;
        TextView textView12 = textView11;
        if (textView11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvOpenSwitch");
            textView12 = null;
        }
        textView12.setOnClickListener(new Y(this, 4));
        TextView textView13 = this.f113477p1;
        TextView textView14 = textView13;
        if (textView13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvErrorOperate");
            textView14 = null;
        }
        textView14.setOnClickListener(new QI0.a(this, 2));
        this.f113432C1 = System.currentTimeMillis();
        TextView textView15 = this.f113433D;
        TextView textView16 = textView15;
        if (textView15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvTabTitle");
            textView16 = null;
        }
        textView16.setText("稿件处理进度");
        TextView textView17 = this.f113435E;
        TextView textView18 = textView17;
        if (textView17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvTabPublish");
            textView18 = null;
        }
        textView18.setText("极速发布");
        TextView textView19 = this.f113435E;
        TextView textView20 = textView19;
        if (textView19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvTabPublish");
            textView20 = null;
        }
        textView20.setVisibility(8);
        ?? adapter = new RecyclerView.Adapter();
        adapter.f119769b = new Function2(this) { // from class: com.bilibili.upper.module.manuscript.activity.r

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ManuscriptProgressDetailsActivity f113555a;

            {
                this.f113555a = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                ManuscriptVideosEntity.ManuscriptVideoDetailsEntity manuscriptVideoDetailsEntity = (ManuscriptVideosEntity.ManuscriptVideoDetailsEntity) obj;
                ((Integer) obj2).getClass();
                int i7 = ManuscriptProgressDetailsActivity.f113427E1;
                ManuscriptProgressDetailsActivity manuscriptProgressDetailsActivity = this.f113555a;
                manuscriptProgressDetailsActivity.Y6(manuscriptVideoDetailsEntity);
                TE0.b bVar = TE0.b.f24088a;
                long j8 = manuscriptProgressDetailsActivity.f113486w1;
                long j9 = manuscriptVideoDetailsEntity.cid;
                int iR6 = manuscriptProgressDetailsActivity.R6();
                bVar.getClass();
                TE0.b.r0(iR6, j8, j9);
                return Unit.INSTANCE;
            }
        };
        this.f113482t1 = adapter;
        RecyclerView recyclerView = this.f113441K;
        RecyclerView recyclerView2 = recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRvSubsetDetails");
            recyclerView2 = null;
        }
        gI0.G g7 = this.f113482t1;
        gI0.G g8 = g7;
        if (g7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mManuscriptSubsetDetailsAdapter");
            g8 = null;
        }
        recyclerView2.setAdapter(g8);
        SwipeRefreshLayout swipeRefreshLayout = this.f113436F;
        SwipeRefreshLayout swipeRefreshLayout2 = swipeRefreshLayout;
        if (swipeRefreshLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSwRefresh");
            swipeRefreshLayout2 = null;
        }
        swipeRefreshLayout2.setColorSchemeColors(ThemeUtils.getColorById(getApplicationContext(), 2131103284));
        SwipeRefreshLayout swipeRefreshLayout3 = this.f113436F;
        SwipeRefreshLayout swipeRefreshLayout4 = swipeRefreshLayout3;
        if (swipeRefreshLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSwRefresh");
            swipeRefreshLayout4 = null;
        }
        swipeRefreshLayout4.setOnRefreshListener(new m(this));
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new ManuscriptProgressDetailsActivity$initObservers$1(this, null), 3, (Object) null);
        P6().f113696s.observe(this, new a(new X9.j(this, 2)));
        P6().f113697t.observe(this, new a(new Hj.l(this, 4)));
        P6().f113700w.observe(this, new a(new C5254b(this, 1)));
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        QF0.f fVar = this.f113428A1;
        if (fVar != null) {
            fVar.T0(this);
        }
        ManuscriptProgressDetailsViewModel manuscriptProgressDetailsViewModelP6 = P6();
        Job job = manuscriptProgressDetailsViewModelP6.f113687j;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        manuscriptProgressDetailsViewModelP6.f113687j = null;
        CoroutineScopeKt.cancel$default(ViewModelKt.getViewModelScope(manuscriptProgressDetailsViewModelP6), (CancellationException) null, 1, (Object) null);
        TE0.b bVar = TE0.b.f24088a;
        long j7 = this.f113486w1;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j8 = this.f113432C1;
        bVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("aid", String.valueOf(j7));
        linkedHashMap.put(EditCustomizeSticker.TAG_DURATION, String.valueOf(jCurrentTimeMillis - j8));
        Xz0.g.c(linkedHashMap);
        Neurons.trackT(false, "creation.archive.progress.show.track", linkedHashMap, 1, new Ee1.a(6));
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(@Nullable Bundle bundle) {
        super.onPostCreate(bundle);
        Garb curGarb = GarbManager.getCurGarb();
        if (curGarb.isPure() || curGarb.isPrimaryOnly()) {
            StatusBarCompat.tintStatusBar(this, ThemeUtils.getThemeAttrColor(this, 2130968986));
        } else {
            StatusBarCompat.tintStatusBar(this, curGarb.getSecondaryPageColor(), curGarb.isDarkMode() ? 1 : 2);
        }
        ViewGroup viewGroup = this.f113437G;
        ViewGroup viewGroup2 = viewGroup;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNvsContentRoot");
            viewGroup2 = null;
        }
        viewGroup2.setVisibility(8);
        ConstraintLayout constraintLayout = this.f113474n1;
        ConstraintLayout constraintLayout2 = constraintLayout;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCslErrorParent");
            constraintLayout2 = null;
        }
        constraintLayout2.setVisibility(8);
        ConstraintLayout constraintLayout3 = this.f113478q1;
        ConstraintLayout constraintLayout4 = constraintLayout3;
        if (constraintLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCslLoadingParent");
            constraintLayout4 = null;
        }
        constraintLayout4.setVisibility(0);
        ImageRequestBuilder imageRequestBuilderEnableAutoPlayAnimation$default = ImageRequestBuilder.enableAutoPlayAnimation$default(BiliImageLoader.INSTANCE.with(this).url(BiliImageLoaderHelper.assetToUri("ic_upper_small_tv_loading.webp")), true, false, 2, (Object) null);
        BiliImageView biliImageView = this.f113480r1;
        if (biliImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImvLoadingIcon");
            biliImageView = null;
        }
        imageRequestBuilderEnableAutoPlayAnimation$default.into(biliImageView);
        T6(-1);
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f113430B1) {
            P6().R0(this.f113487x1, this.f113486w1, (((long) Q6()) / 500) + 1);
            P6().O0(this.f113486w1, this.y1);
            P6().N0(this.f113486w1);
            P6().L0(this.f113486w1);
            this.f113430B1 = false;
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onStop() {
        super.onStop();
        this.f113430B1 = true;
    }

    @Override // LF0.e
    public final void t3(long j7, @Nullable String str) {
        e7(3);
        this.f113488z1 = str;
        V6();
    }
}
