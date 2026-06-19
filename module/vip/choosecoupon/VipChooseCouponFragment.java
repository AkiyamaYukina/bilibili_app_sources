package com.bilibili.module.vip.choosecoupon;

import AX.f;
import Fh0.d;
import Fh0.e;
import Fh0.h;
import Fh0.j;
import Fh0.q;
import Gh0.C1976b;
import Pb.F;
import Pb.G;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.n;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.droid.BundleUtil;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.lib.ui.garb.Garb;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintToolbar;
import com.bilibili.module.vip.module.VipApiServiceNew;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.pvtracker.IPvTracker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.LoadingImageView;
import tv.danmaku.bili.widget.recycler.section.BaseSectionAdapter;
import tv.danmaku.bili.widget.recycler.section.Section;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/choosecoupon/VipChooseCouponFragment.class */
public class VipChooseCouponFragment extends BaseFragment implements View.OnClickListener, IPvTracker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LoadingImageView f66120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f66121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public VipCouponItemInfo f66122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Toolbar f66123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RecyclerView f66124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f66125g;
    public long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f66126i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public VipCouponGeneralInfo f66127j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f66128k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ConstraintLayout f66129l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f66130m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Garb f66131n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Fh0.c f66132o = new Fh0.c(this, 0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f66133p = new d(this);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a f66134q = new a(this);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f66135r = new b(this);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f66136s = new c(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/choosecoupon/VipChooseCouponFragment$a.class */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final VipChooseCouponFragment f66137a;

        public a(VipChooseCouponFragment vipChooseCouponFragment) {
            this.f66137a = vipChooseCouponFragment;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/choosecoupon/VipChooseCouponFragment$b.class */
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final VipChooseCouponFragment f66138a;

        public b(VipChooseCouponFragment vipChooseCouponFragment) {
            this.f66138a = vipChooseCouponFragment;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/choosecoupon/VipChooseCouponFragment$c.class */
    public final class c extends BiliApiDataCallback<VipCouponGeneralInfo> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final VipChooseCouponFragment f66139b;

        public c(VipChooseCouponFragment vipChooseCouponFragment) {
            this.f66139b = vipChooseCouponFragment;
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final boolean isCancel() {
            return this.f66139b.activityDie();
        }

        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(@Nullable VipCouponGeneralInfo vipCouponGeneralInfo) {
            VipCouponGeneralInfo vipCouponGeneralInfo2 = vipCouponGeneralInfo;
            VipChooseCouponFragment vipChooseCouponFragment = this.f66139b;
            VipChooseCouponFragment.jf(vipChooseCouponFragment);
            if (vipCouponGeneralInfo2 == null || !(q.a(vipCouponGeneralInfo2.usables) || q.a(vipCouponGeneralInfo2.disables))) {
                VipChooseCouponFragment.jf(vipChooseCouponFragment);
                LoadingImageView loadingImageView = vipChooseCouponFragment.f66120b;
                if (loadingImageView != null) {
                    if (!loadingImageView.isShown()) {
                        vipChooseCouponFragment.f66120b.setVisibility(0);
                    }
                    vipChooseCouponFragment.f66120b.showEmptyTips(2131857914);
                    vipChooseCouponFragment.f66120b.setImageResource(2131235613);
                }
                vipChooseCouponFragment.f66128k.setVisibility(8);
                vipChooseCouponFragment.f66129l.setVisibility(0);
                return;
            }
            vipChooseCouponFragment.f66127j = vipCouponGeneralInfo2;
            List<VipCouponItemInfo> list = vipCouponGeneralInfo2.usables;
            VipCouponItemInfo vipCouponItemInfo = vipChooseCouponFragment.f66122d;
            if (q.a(list)) {
                if (vipCouponItemInfo == null) {
                    int i7 = 0;
                    boolean z6 = false;
                    while (true) {
                        boolean z7 = z6;
                        if (i7 >= list.size()) {
                            break;
                        }
                        VipCouponItemInfo vipCouponItemInfo2 = list.get(i7);
                        boolean z8 = z7;
                        if (vipCouponItemInfo2 != null) {
                            if (z7 || vipChooseCouponFragment.f66130m || !vipCouponItemInfo2.isSelected()) {
                                vipCouponItemInfo2.setUnselected();
                                z8 = z7;
                            } else {
                                vipChooseCouponFragment.f66122d = vipCouponItemInfo2;
                                z8 = true;
                            }
                        }
                        i7++;
                        z6 = z8;
                    }
                } else {
                    int i8 = 0;
                    boolean z9 = false;
                    while (true) {
                        boolean z10 = z9;
                        if (i8 >= list.size()) {
                            break;
                        }
                        VipCouponItemInfo vipCouponItemInfo3 = list.get(i8);
                        boolean z11 = z10;
                        if (vipCouponItemInfo3 != null) {
                            if (z10 || vipChooseCouponFragment.f66130m) {
                                vipCouponItemInfo3.setUnselected();
                                z11 = z10;
                            } else if (TextUtils.equals(vipCouponItemInfo3.couponToken, vipCouponItemInfo.couponToken)) {
                                vipCouponItemInfo3.setSelected();
                                z11 = true;
                            } else {
                                vipCouponItemInfo3.setUnselected();
                                z11 = z10;
                            }
                        }
                        i8++;
                        z9 = z11;
                    }
                }
            }
            h hVar = vipChooseCouponFragment.f66121c;
            VipCouponGeneralInfo vipCouponGeneralInfo3 = vipChooseCouponFragment.f66127j;
            j jVar = hVar.f6148c;
            jVar.f6154c = vipCouponGeneralInfo3;
            if (vipCouponGeneralInfo3 != null) {
                ((ArrayList) jVar.f6153b).clear();
                List<VipCouponItemInfo> list2 = jVar.f6154c.usables;
                if (list2 != null) {
                    ((ArrayList) jVar.f6153b).addAll(list2);
                }
                List<VipCouponItemInfo> list3 = jVar.f6154c.disables;
                if (list3 != null) {
                    ((ArrayList) jVar.f6153b).addAll(list3);
                }
            }
            if (vipCouponGeneralInfo3.notEmpty()) {
                hVar.f6149d.f6193c = true;
            } else {
                hVar.f6149d.f6193c = false;
            }
            hVar.onSectionsChanged();
            vipChooseCouponFragment.f66128k.setVisibility(0);
            vipChooseCouponFragment.f66129l.setVisibility(8);
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            VipChooseCouponFragment vipChooseCouponFragment = this.f66139b;
            VipChooseCouponFragment.jf(vipChooseCouponFragment);
            LoadingImageView loadingImageView = vipChooseCouponFragment.f66120b;
            if (loadingImageView != null) {
                if (!loadingImageView.isShown()) {
                    vipChooseCouponFragment.f66120b.setVisibility(0);
                }
                vipChooseCouponFragment.f66120b.setRefreshError();
            }
            vipChooseCouponFragment.f66128k.setVisibility(8);
            vipChooseCouponFragment.f66129l.setVisibility(0);
        }
    }

    public static void jf(VipChooseCouponFragment vipChooseCouponFragment) {
        LoadingImageView loadingImageView = vipChooseCouponFragment.f66120b;
        if (loadingImageView != null) {
            loadingImageView.setRefreshComplete();
            vipChooseCouponFragment.f66120b.setVisibility(8);
        }
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    public final String getPvEventId() {
        return "vip.bigcoupon-choose.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    public final Bundle getPvExtra() {
        return null;
    }

    public final void kf() {
        mf();
        String accessKey = BiliAccounts.get(getContext()).getAccessKey();
        int i7 = this.f66125g;
        long j7 = this.h;
        String str = this.f66126i;
        c cVar = this.f66136s;
        if (TextUtils.isEmpty(str)) {
            ((VipApiServiceNew) ServiceGenerator.createService(VipApiServiceNew.class)).getCouponListWithProductId(accessKey, i7).enqueue(cVar);
        } else {
            ((VipApiServiceNew) ServiceGenerator.createService(VipApiServiceNew.class)).getCouponListWithProductIdV3(i7, j7, str).enqueue(cVar);
        }
    }

    public final void lf() {
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putParcelable("vip_coupon_item", this.f66122d);
            bundle.putString("vip_coupon_item", JsonUtilKt.toJson(this.f66122d));
            intent.putExtras(bundle);
            fragmentActivityP3.setResult(-1, intent);
            Contract contractAb = ConfigManager.Companion.ab();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.areEqual(contractAb.get("bgthread_ui_access_detect_enable", bool), bool)) {
                Thread threadCurrentThread = Thread.currentThread();
                if (!n.a(threadCurrentThread)) {
                    IllegalStateException illegalStateException = new IllegalStateException(F.b("Activity.finish() called from non-UI thread: ", threadCurrentThread, ", 请联系 Jackin"));
                    Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new Pair[]{TuplesKt.to("stacktrace", G.b("Activity.finish() called from non-UI thread: ", threadCurrentThread, "BgThreadUIAccess", illegalStateException, illegalStateException)), TuplesKt.to("threadName", threadCurrentThread.getName())}), 1, new AT0.c(8));
                }
            }
            fragmentActivityP3.finish();
        }
    }

    public final void mf() {
        LoadingImageView loadingImageView = this.f66120b;
        if (loadingImageView != null) {
            loadingImageView.setVisibility(0);
            this.f66120b.setRefreshing();
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (p3() != null) {
            if (this.f66131n.isPure() || this.f66131n.isPrimaryOnly()) {
                StatusBarCompat.tintStatusBar(p3(), ThemeUtils.getThemeAttrColor(p3(), 2130968986));
            } else {
                StatusBarCompat.tintStatusBar(p3(), this.f66131n.getSecondaryPageColor(), this.f66131n.isDarkMode() ? 1 : 2);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id != 2131311144) {
            if (id == 2131303783) {
                C1976b.a(getContext(), f.a("vip", "url_coupon_guide", "https://www.bilibili.com/blackboard/big-coupon-guide-m.html"));
                return;
            }
            return;
        }
        Neurons.reportClick(false, "vip.bigcoupon-choose.cancel-btn.0.click");
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putBoolean("vip_do_not_use_coupon", true);
            intent.putExtras(bundle);
            fragmentActivityP3.setResult(-1, intent);
            fragmentActivityP3.finish();
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Bundle bundle2 = arguments.getBundle(BundleUtil.KEY_DEFAULT_EXTRA_BUNDLE);
            if (bundle2 != null) {
                this.f66122d = (VipCouponItemInfo) bundle2.getParcelable("vip_coupon_item");
                this.f66125g = BundleUtil.getInteger(bundle2, "vip_package_id", new Integer[0]).intValue();
                this.h = BundleUtil.getLong(bundle2, "vip_discount_id", new long[]{0});
                this.f66126i = BundleUtil.getString(bundle2, "vip_scene", new String[]{""});
                this.f66130m = BundleUtil.getBoolean(bundle2, "vip_do_not_use_coupon", new boolean[]{false});
            } else {
                try {
                    this.f66122d = (VipCouponItemInfo) JsonUtilKt.parseJson(arguments.getString("vip_coupon_item"), VipCouponItemInfo.class);
                } catch (Exception e7) {
                    BLog.e(e7.getMessage(), e7);
                }
                this.f66125g = BundleUtil.getInteger(arguments, "vip_package_id", new Integer[]{0}).intValue();
                this.h = BundleUtil.getLong(arguments, "vip_discount_id", new long[]{0});
                this.f66126i = BundleUtil.getString(arguments, "vip_scene", new String[]{""});
                this.f66130m = BundleUtil.getBoolean(arguments, "vip_do_not_use_coupon", new boolean[]{false});
            }
        }
        this.f66131n = GarbManager.getCurGarb();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131500742, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [Fh0.h, androidx.recyclerview.widget.RecyclerView$Adapter, tv.danmaku.bili.widget.recycler.section.BaseSectionAdapter] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f66120b = view.findViewById(2131303590);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(2131310064);
        this.f66124f = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(p3()));
        b bVar = this.f66135r;
        boolean z6 = this.f66130m;
        ?? baseSectionAdapter = new BaseSectionAdapter();
        Section aVar = new tv.danmaku.bili.widget.recycler.section.a();
        aVar.f6153b = new ArrayList();
        aVar.f6155d = bVar;
        aVar.f6156e = !z6;
        baseSectionAdapter.f6148c = aVar;
        baseSectionAdapter.addSectionInternal(aVar);
        Section aVar2 = new tv.danmaku.bili.widget.recycler.section.a();
        aVar2.f6192b = 1;
        baseSectionAdapter.f6149d = aVar2;
        baseSectionAdapter.addSectionInternal(aVar2);
        this.f66121c = baseSectionAdapter;
        this.f66124f.setAdapter(baseSectionAdapter);
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(2131303783);
        this.f66129l = constraintLayout;
        constraintLayout.setOnClickListener(this);
        TextView textView = (TextView) view.findViewById(2131311144);
        this.f66128k = textView;
        textView.setOnClickListener(this);
        Toolbar toolbar = (Toolbar) view.findViewById(2131304944);
        this.f66123e = toolbar;
        toolbar.setTitle(2131857915);
        this.f66123e.setNavigationIcon(2131233551);
        this.f66123e.setOnMenuItemClickListener(this.f66133p);
        this.f66123e.inflateMenu(2131558454);
        this.f66123e.setNavigationOnClickListener(this.f66132o);
        if (p3() != null) {
            MultipleThemeUtils.refreshMenuIconTint(p3(), this.f66123e, this.f66131n.isPure() ? 0 : this.f66131n.getFontColor());
        }
        if (!this.f66131n.isPure()) {
            ((TintToolbar) this.f66123e).setBackgroundColorWithGarb(this.f66131n.getSecondaryPageColor());
            ((TintToolbar) this.f66123e).setTitleColorWithGarb(this.f66131n.getFontColor());
            ((TintToolbar) this.f66123e).setIconTintColorWithGarb(this.f66131n.getFontColor());
        }
        View view2 = getView();
        if (view2 != null) {
            view2.setFocusableInTouchMode(true);
            view2.requestFocus();
            view2.setOnKeyListener(new e(this));
        }
        RecyclerView recyclerView2 = this.f66124f;
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            recyclerView2.addItemDecoration(new Fh0.f(this, fragmentActivityP3));
        }
        kf();
    }
}
