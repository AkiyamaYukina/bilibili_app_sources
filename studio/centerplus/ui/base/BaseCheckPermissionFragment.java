package com.bilibili.studio.centerplus.ui.base;

import Ct0.i;
import Ct0.k;
import Ct0.o;
import GA0.a;
import IT0.n;
import Xz0.d;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.material3.U;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.bilibili.ad.adview.search.inline.card155.d0;
import com.bilibili.base.BiliContext;
import com.bilibili.biligame.bean.GameCenterBottomTabConfig;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.studio.centerplus.model.CenterPlusViewModel;
import com.bilibili.studio.centerplus.ui.base.BaseCheckPermissionFragment;
import com.bilibili.studio.centerplus.util.g;
import com.bilibili.studio.centerplus.widgets.GeneralModLoadingView;
import com.bilibili.studio.videoeditor.extension.ActivityExtKt;
import com.bilibili.studio.videoeditor.util.V;
import com.bilibili.upper.module.contribute.picker.v3.fragment.C;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/ui/base/BaseCheckPermissionFragment.class */
public abstract class BaseCheckPermissionFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f105235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GeneralModLoadingView f105236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Group f105237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f105238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f105239f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f105240g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f105241i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public ViewGroup f105242j;
    public boolean h = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f105243k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Lazy f105244l = LazyKt.lazy(new n(this, 4));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Lazy f105245m = LazyKt.lazy(new k(this, 9));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public String f105246n = "";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public String f105247o = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/ui/base/BaseCheckPermissionFragment$a.class */
    public static final /* synthetic */ class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f105248a;

        public a(Function1 function1) {
            this.f105248a = function1;
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
            return this.f105248a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f105248a.invoke(obj);
        }
    }

    public static /* synthetic */ void xf(BaseCheckPermissionFragment baseCheckPermissionFragment, String str, String str2, boolean z6, int i7) {
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        if ((i7 & 4) != 0) {
            z6 = false;
        }
        baseCheckPermissionFragment.wf(str, str2, z6, false);
    }

    public void jf(int i7, @Nullable Integer num) {
    }

    public void kf(boolean z6, boolean z7) {
    }

    public abstract void lf();

    /* JADX WARN: Type inference failed for: r0v7, types: [cw0.a, java.lang.Object] */
    public final void mf(@Nullable final Integer[] numArr) {
        CenterPlusViewModel centerPlusViewModel;
        this.f105240g = false;
        final FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 == null || this.f105241i) {
            return;
        }
        this.f105241i = true;
        ?? r02 = new Function0(this, fragmentActivityP3, numArr) { // from class: cw0.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BaseCheckPermissionFragment f116316a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final FragmentActivity f116317b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Integer[] f116318c;

            {
                this.f116316a = this;
                this.f116317b = fragmentActivityP3;
                this.f116318c = numArr;
            }

            public final Object invoke() {
                BaseCheckPermissionFragment baseCheckPermissionFragment = this.f116316a;
                BLog.d("BaseCheckPermissionFragment", "showLoading");
                if (!baseCheckPermissionFragment.activityDie()) {
                    GeneralModLoadingView generalModLoadingView = baseCheckPermissionFragment.f105236c;
                    GeneralModLoadingView generalModLoadingView2 = generalModLoadingView;
                    if (generalModLoadingView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cpPagePermissionLoading");
                        generalModLoadingView2 = null;
                    }
                    generalModLoadingView2.onLoading();
                    Group group = baseCheckPermissionFragment.f105237d;
                    if (group == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cpPagePermissionError");
                        group = null;
                    }
                    group.setVisibility(8);
                }
                baseCheckPermissionFragment.h = true;
                baseCheckPermissionFragment.qf().I0(this.f116317b, this.f116318c, baseCheckPermissionFragment.nf(), g.a(baseCheckPermissionFragment.getArguments()), baseCheckPermissionFragment.rf());
                return Unit.INSTANCE;
            }
        };
        GeneralModLoadingView generalModLoadingView = this.f105236c;
        GeneralModLoadingView generalModLoadingView2 = generalModLoadingView;
        if (generalModLoadingView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cpPagePermissionLoading");
            generalModLoadingView2 = null;
        }
        if (generalModLoadingView2.isSuccess() || ((centerPlusViewModel = (CenterPlusViewModel) this.f105245m.getValue()) != null && rf() == centerPlusViewModel.getInitTabIndex())) {
            r02.invoke();
            return;
        }
        String strPf = pf();
        if (strPf != null) {
            GeneralModLoadingView generalModLoadingView3 = this.f105236c;
            GeneralModLoadingView generalModLoadingView4 = generalModLoadingView3;
            if (generalModLoadingView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cpPagePermissionLoading");
                generalModLoadingView4 = null;
            }
            generalModLoadingView4.setLoadingText(strPf);
        }
        GeneralModLoadingView generalModLoadingView5 = this.f105236c;
        GeneralModLoadingView generalModLoadingView6 = generalModLoadingView5;
        if (generalModLoadingView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cpPagePermissionLoading");
            generalModLoadingView6 = null;
        }
        generalModLoadingView6.setShowClose(false);
        GeneralModLoadingView generalModLoadingView7 = this.f105236c;
        GeneralModLoadingView generalModLoadingView8 = generalModLoadingView7;
        if (generalModLoadingView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cpPagePermissionLoading");
            generalModLoadingView8 = null;
        }
        generalModLoadingView8.onLoading();
        Group group = this.f105237d;
        if (group == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cpPagePermissionError");
            group = null;
        }
        group.setVisibility(8);
        CenterPlusViewModel centerPlusViewModel2 = (CenterPlusViewModel) this.f105245m.getValue();
        if (centerPlusViewModel2 != null) {
            CenterPlusViewModel.a aVar = CenterPlusViewModel.Companion;
            int iRf = rf();
            aVar.getClass();
            centerPlusViewModel2.loadModAsync(CenterPlusViewModel.a.a(iRf), new C(1, this, (Object) r02));
        }
    }

    @NotNull
    public String nf() {
        return "";
    }

    @NotNull
    public abstract FrameLayout of();

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f105242j = null;
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f105242j = of();
        View viewInflate = LayoutInflater.from(getContext()).inflate(2131498281, this.f105242j);
        this.f105235b = (ImageView) viewInflate.findViewById(2131299696);
        this.f105236c = (GeneralModLoadingView) viewInflate.findViewById(2131299695);
        this.f105237d = (Group) viewInflate.findViewById(2131299694);
        this.f105238e = (TextView) viewInflate.findViewById(2131299698);
        this.f105239f = (TextView) viewInflate.findViewById(2131299697);
        ViewGroup viewGroup = this.f105242j;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        ImageView imageView = this.f105235b;
        ImageView imageView2 = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cpPermissionBack");
            imageView2 = null;
        }
        imageView2.setOnClickListener(new i(this, 2));
        qf().f105171b.observe(getViewLifecycleOwner(), new a(new U(this, 1)));
        qf().f105172c.observe(getViewLifecycleOwner(), new a(new o(this, 5)));
        qf().f105173d.observe(getViewLifecycleOwner(), new a(new d0(this, 4)));
        qf().f105174e.observe(getViewLifecycleOwner(), new a(new com.bilibili.pegasus.components.interest.ui.v35.page.i(this, 1)));
    }

    @Nullable
    public String pf() {
        return null;
    }

    public final com.bilibili.studio.centerplus.model.g qf() {
        return (com.bilibili.studio.centerplus.model.g) this.f105244l.getValue();
    }

    public abstract int rf();

    public void sf(boolean z6) {
    }

    public final boolean tf() {
        GeneralModLoadingView generalModLoadingView = this.f105236c;
        GeneralModLoadingView generalModLoadingView2 = generalModLoadingView;
        if (generalModLoadingView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cpPagePermissionLoading");
            generalModLoadingView2 = null;
        }
        return generalModLoadingView2.isFailed();
    }

    @NotNull
    public final Bundle uf(@Nullable Bundle bundle) {
        Bundle bundle2 = bundle;
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        bundle2.putBoolean("is_new_ui", true);
        bundle2.putBoolean("show_camera", false);
        bundle2.putBoolean("show_drafts", true);
        bundle2.putBoolean("use_bmm_gray", true);
        bundle2.putString("ARCHIVE_FROM", GameCenterBottomTabConfig.TAB_TYPE_ACT);
        bundle2.putString("video_picker_tip_content", this.f105246n);
        bundle2.putString("video_picker_tip_url", this.f105247o);
        return bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void vf(com.bilibili.studio.centerplus.network.entity.PreviewData r4) {
        /*
            r3 = this;
            java.lang.String r0 = "BaseCheckPermissionFragment"
            java.lang.String r1 = "showContentPage"
            tv.danmaku.android.log.BLog.d(r0, r1)
            r0 = r3
            boolean r0 = r0.activityDie()
            if (r0 == 0) goto L11
            return
        L11:
            r0 = r3
            r1 = 1
            r0.f105240g = r1
            java.lang.String r0 = ""
            r6 = r0
            r0 = r4
            if (r0 == 0) goto L34
            r0 = r4
            com.bilibili.studio.centerplus.network.entity.Tip r0 = r0.tip
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L34
            r0 = r5
            java.lang.String r0 = r0.content
            r7 = r0
            r0 = r7
            r5 = r0
            r0 = r7
            if (r0 != 0) goto L37
        L34:
            java.lang.String r0 = ""
            r5 = r0
        L37:
            r0 = r3
            r1 = r5
            r0.f105246n = r1
            r0 = r6
            r5 = r0
            r0 = r4
            if (r0 == 0) goto L5b
            r0 = r4
            com.bilibili.studio.centerplus.network.entity.Tip r0 = r0.tip
            r4 = r0
            r0 = r6
            r5 = r0
            r0 = r4
            if (r0 == 0) goto L5b
            r0 = r4
            java.lang.String r0 = r0.link
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L5b
            r0 = r6
            r5 = r0
            goto L5b
        L5b:
            r0 = r3
            r1 = r5
            r0.f105247o = r1
            r0 = r3
            r0.lf()
            r0 = r3
            android.view.ViewGroup r0 = r0.f105242j
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L73
            r0 = r4
            r1 = 8
            r0.setVisibility(r1)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.centerplus.ui.base.BaseCheckPermissionFragment.vf(com.bilibili.studio.centerplus.network.entity.PreviewData):void");
    }

    public final void wf(String str, final String str2, final boolean z6, boolean z7) {
        String string;
        BLog.d("BaseCheckPermissionFragment", "showErrorPage");
        if (activityDie()) {
            return;
        }
        Group group = this.f105237d;
        Group group2 = group;
        if (group == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cpPagePermissionError");
            group2 = null;
        }
        group2.setVisibility(0);
        GeneralModLoadingView generalModLoadingView = this.f105236c;
        GeneralModLoadingView generalModLoadingView2 = generalModLoadingView;
        if (generalModLoadingView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cpPagePermissionLoading");
            generalModLoadingView2 = null;
        }
        generalModLoadingView2.setVisibility(8);
        TextView textView = this.f105238e;
        TextView textView2 = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cpPermissionMsg");
            textView2 = null;
        }
        textView2.setText(str);
        if (z7) {
            TextView textView3 = this.f105239f;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cpPermissionGoto");
                textView3 = null;
            }
            textView3.setVisibility(8);
            return;
        }
        if (Intrinsics.areEqual(nf(), "upload")) {
            d.f28458a.getClass();
            Neurons.reportExposure$default(false, "creation.choose-matter.unauthorize.0.show", d.e(), (List) null, 8, (Object) null);
        }
        TextView textView4 = this.f105239f;
        TextView textView5 = textView4;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cpPermissionGoto");
            textView5 = null;
        }
        textView5.setVisibility(0);
        TextView textView6 = this.f105239f;
        TextView textView7 = textView6;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cpPermissionGoto");
            textView7 = null;
        }
        if (z6) {
            Activity activity = BiliContext.topActivity();
            boolean zIsActive = ActivityExtKt.isActive(activity);
            Context fapp = activity;
            if (!zIsActive) {
                fapp = FoundationAlias.getFapp();
            }
            string = fapp.getString(2131842346);
        } else {
            Activity activity2 = BiliContext.topActivity();
            boolean zIsActive2 = ActivityExtKt.isActive(activity2);
            Context fapp2 = activity2;
            if (!zIsActive2) {
                fapp2 = FoundationAlias.getFapp();
            }
            string = fapp2.getString(2131849631);
        }
        textView7.setText(string);
        TextView textView8 = this.f105239f;
        if (textView8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cpPermissionGoto");
            textView8 = null;
        }
        textView8.setOnClickListener(new View.OnClickListener(this, z6, str2) { // from class: cw0.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BaseCheckPermissionFragment f116319a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f116320b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f116321c;

            {
                this.f116319a = this;
                this.f116320b = z6;
                this.f116321c = str2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseCheckPermissionFragment baseCheckPermissionFragment = this.f116319a;
                boolean z8 = this.f116320b;
                String str3 = this.f116321c;
                FragmentActivity fragmentActivityP3 = baseCheckPermissionFragment.p3();
                if (fragmentActivityP3 != null) {
                    baseCheckPermissionFragment.sf(z8);
                    if (!z8) {
                        V.b(fragmentActivityP3);
                        return;
                    }
                    boolean zIsEmpty = TextUtils.isEmpty(str3);
                    a.C0040a c0040a = GA0.a.f6978a;
                    if (zIsEmpty) {
                        a.C0040a.b(c0040a, fragmentActivityP3, "https://passport.bilibili.com/mobile/index.html");
                    } else {
                        a.C0040a.b(c0040a, fragmentActivityP3, str3);
                    }
                }
            }
        });
    }
}
