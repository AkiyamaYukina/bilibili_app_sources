package com.bilibili.studio.centerplus.ui.dialog;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bilibili.bililive.biz.prop.j;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.BiliImageLoaderHelper;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.studio.centerplus.network.entity.DialogFrequencyConfig;
import dw0.b;
import dw0.d;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.dialog.BaseDialogFragment;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/ui/dialog/FrequencyBaseDialog.class */
public abstract class FrequencyBaseDialog extends BaseDialogFragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Fragment f105254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public TextView f105255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public TextView f105256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public TextView f105257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public TextView f105258g;

    @Nullable
    public TextView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public ImageView f105259i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public BiliImageView f105260j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public BiliImageView f105261k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public TextView f105262l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public View f105263m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public View f105264n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f105265o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f105266p;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/ui/dialog/FrequencyBaseDialog$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f105267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f105268b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f105269c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f105270d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final String f105271e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final String f105272f;

        public a() {
            this(0, null, null, null, null, null, 63);
        }

        public a(int i7, String str, String str2, String str3, String str4, String str5, int i8) {
            i7 = (i8 & 1) != 0 ? 0 : i7;
            str = (i8 & 2) != 0 ? null : str;
            str2 = (i8 & 4) != 0 ? null : str2;
            str3 = (i8 & 8) != 0 ? null : str3;
            str4 = (i8 & 16) != 0 ? null : str4;
            str5 = (i8 & 32) != 0 ? "" : str5;
            this.f105267a = i7;
            this.f105268b = str;
            this.f105269c = str2;
            this.f105270d = str3;
            this.f105271e = str4;
            this.f105272f = str5;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f105267a == aVar.f105267a && Intrinsics.areEqual(this.f105268b, aVar.f105268b) && Intrinsics.areEqual(this.f105269c, aVar.f105269c) && Intrinsics.areEqual(this.f105270d, aVar.f105270d) && Intrinsics.areEqual(this.f105271e, aVar.f105271e) && Intrinsics.areEqual(this.f105272f, aVar.f105272f);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f105267a);
            int iHashCode2 = 0;
            String str = this.f105268b;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.f105269c;
            int iHashCode4 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.f105270d;
            int iHashCode5 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.f105271e;
            if (str4 != null) {
                iHashCode2 = str4.hashCode();
            }
            return this.f105272f.hashCode() + (((((((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode2) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("CoverInfo(type=");
            sb.append(this.f105267a);
            sb.append(", coverRes=");
            sb.append(this.f105268b);
            sb.append(", coverPic=");
            sb.append(this.f105269c);
            sb.append(", coverTitle=");
            sb.append(this.f105270d);
            sb.append(", coverSubTitle=");
            sb.append(this.f105271e);
            sb.append(", duration=");
            return C8770a.a(sb, this.f105272f, ")");
        }
    }

    public FrequencyBaseDialog(@Nullable Fragment fragment) {
        this.f105254c = fragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void dismissDialog() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null && parentFragment.isAdded() && isAdded()) {
            dismissAllowingStateLoss();
        }
        this.f105254c = null;
    }

    public final int getDialogViewRes() {
        return 2131501979;
    }

    public abstract boolean hf();

    @Nullable
    /* JADX INFO: renamed from: if */
    public abstract a mo9832if();

    /* JADX WARN: Multi-variable type inference failed */
    public final void initView(@NotNull View view) {
        this.f105255d = (TextView) view.findViewById(2131313945);
        this.f105256e = (TextView) view.findViewById(2131319262);
        this.f105257f = (TextView) view.findViewById(2131319263);
        this.f105258g = (TextView) view.findViewById(2131314047);
        this.h = (TextView) view.findViewById(2131312204);
        this.f105259i = (ImageView) view.findViewById(2131303999);
        this.f105260j = view.findViewById(2131303957);
        this.f105261k = view.findViewById(2131319254);
        this.f105262l = (TextView) view.findViewById(2131319255);
        this.f105263m = view.findViewById(2131319256);
        this.f105264n = view.findViewById(2131319257);
        TextView textView = this.f105256e;
        if (textView != null) {
            textView.setOnClickListener(new b(this, 0));
        }
        TextView textView2 = this.f105257f;
        if (textView2 != null) {
            textView2.setOnClickListener(new j(this, 1));
        }
        DialogFrequencyConfig.DialogInfoDTO dialogInfoDTOC = d.c(jf());
        if (dialogInfoDTOC != null) {
            TextView textView3 = this.f105255d;
            if (textView3 != null) {
                textView3.setText(dialogInfoDTOC.getDialogText());
            }
            TextView textView4 = this.f105256e;
            if (textView4 != null) {
                textView4.setText(dialogInfoDTOC.getDialogBtnCancel());
            }
            TextView textView5 = this.f105257f;
            if (textView5 != null) {
                textView5.setText(dialogInfoDTOC.getDialogBtnConfirm());
            }
        }
        a aVarMo9832if = mo9832if();
        if (aVarMo9832if == null) {
            ImageView imageView = this.f105259i;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            View view2 = this.f105263m;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            View view3 = this.f105264n;
            if (view3 != null) {
                view3.setVisibility(8);
                return;
            }
            return;
        }
        ImageView imageView2 = this.f105259i;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        String str = aVarMo9832if.f105268b;
        int i7 = aVarMo9832if.f105267a;
        if (i7 == 0) {
            View view4 = this.f105263m;
            if (view4 != null) {
                view4.setVisibility(0);
            }
            View view5 = this.f105264n;
            if (view5 != null) {
                view5.setVisibility(8);
            }
            TextView textView6 = this.h;
            if (textView6 != null) {
                textView6.setText(aVarMo9832if.f105270d);
            }
            TextView textView7 = this.f105258g;
            if (textView7 != null) {
                textView7.setText(aVarMo9832if.f105271e);
            }
            BiliImageView biliImageView = this.f105260j;
            if (biliImageView != null) {
                BiliImageLoader.INSTANCE.with(biliImageView.getContext()).url(BiliImageLoaderHelper.fileToUri(new File(str))).into(biliImageView);
                return;
            }
            return;
        }
        if (i7 != 1) {
            return;
        }
        View view6 = this.f105263m;
        if (view6 != null) {
            view6.setVisibility(8);
        }
        View view7 = this.f105264n;
        if (view7 != null) {
            view7.setVisibility(0);
        }
        String str2 = aVarMo9832if.f105272f;
        if (TextUtils.isEmpty(str2)) {
            TextView textView8 = this.f105262l;
            if (textView8 != null) {
                textView8.setText("00:00");
            }
        } else {
            TextView textView9 = this.f105262l;
            if (textView9 != null) {
                textView9.setText(str2);
            }
        }
        BiliImageView biliImageView2 = this.f105261k;
        if (biliImageView2 != null) {
            String str3 = aVarMo9832if.f105269c;
            if (!TextUtils.isEmpty(str3)) {
                BiliImageLoader.INSTANCE.with(requireContext()).url(str3).into(biliImageView2);
            } else if (TextUtils.isEmpty(str)) {
                BiliImageLoader.INSTANCE.with(requireContext()).url("").into(biliImageView2);
            } else {
                BiliImageLoader.INSTANCE.with(requireContext()).uri(Uri.fromFile(str != null ? new File(str) : null)).into(biliImageView2);
            }
        }
    }

    public abstract int jf();

    public abstract int kf();

    public abstract void lf();

    public abstract void mf();

    /* JADX WARN: Removed duplicated region for block: B:47:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean nf(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r8, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1151
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.centerplus.ui.dialog.FrequencyBaseDialog.nf(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0):boolean");
    }
}
