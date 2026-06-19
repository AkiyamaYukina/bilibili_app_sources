package com.bilibili.ogv.pub.payment.pay;

import Qj0.g;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.activity.ComponentDialog;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.accountinfo.model.AccountInfo;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.neuron.api.Neurons;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.util.AppResUtil;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/payment/pay/BangumiPayResultDialog.class */
public final class BangumiPayResultDialog extends ComponentDialog implements View.OnClickListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f71539i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final PayActivities f71540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final View f71541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TextView f71542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final TextView f71543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final BiliImageView f71544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final View f71545f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final CheckBox f71546g;

    @Nullable
    public final BiliImageView h;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/payment/pay/BangumiPayResultDialog$a.class */
    public static final class a {
        @JvmStatic
        @NotNull
        public static void a(@NotNull Context context, @Nullable PayActivities payActivities, @Nullable String str) {
            Neurons.reportExposure$default(false, "united.player-video-detail.dialog.pay-result.show", (Map) null, (List) null, 12, (Object) null);
            BangumiPayResultDialog bangumiPayResultDialog = new BangumiPayResultDialog(context, payActivities);
            if (bangumiPayResultDialog.f71540a == null) {
                BiliImageLoader.INSTANCE.with(bangumiPayResultDialog.getContext()).url(AppResUtil.getImageUrl("img_holder_pay_success.webp")).into(bangumiPayResultDialog.f71544e);
                bangumiPayResultDialog.f71542c.setText(2131835821);
                if (str == null || str.length() == 0) {
                    bangumiPayResultDialog.f71543d.setVisibility(8);
                } else {
                    bangumiPayResultDialog.f71543d.setText(str);
                    bangumiPayResultDialog.f71543d.setVisibility(0);
                }
            } else {
                bangumiPayResultDialog.f71542c.setText(2131835818);
                PendantInfo pendantInfo = (PendantInfo) CollectionsKt.firstOrNull(bangumiPayResultDialog.f71540a.f71548b);
                String str2 = pendantInfo != null ? pendantInfo.f71556c : null;
                if (str2 == null || str2.length() == 0) {
                    bangumiPayResultDialog.f71544e.setVisibility(8);
                } else {
                    BiliImageLoader.INSTANCE.with(bangumiPayResultDialog.getContext()).url(str2).into(bangumiPayResultDialog.f71544e);
                }
                if (str == null || str.length() == 0) {
                    bangumiPayResultDialog.f71543d.setVisibility(8);
                } else {
                    bangumiPayResultDialog.f71543d.setText(str);
                    bangumiPayResultDialog.f71543d.setVisibility(0);
                }
                AccountInfo accountInfoFromCache = BiliAccountInfo.Companion.get().getAccountInfoFromCache();
                String avatar = null;
                if (accountInfoFromCache != null) {
                    avatar = accountInfoFromCache.getAvatar();
                }
                BiliImageView biliImageView = bangumiPayResultDialog.h;
                if (avatar != null && biliImageView != null) {
                    BiliImageLoader.INSTANCE.with(bangumiPayResultDialog.getContext()).url(avatar).into(biliImageView);
                }
            }
            bangumiPayResultDialog.f71541b.setOnClickListener(bangumiPayResultDialog);
            bangumiPayResultDialog.f71545f.setOnClickListener(bangumiPayResultDialog);
            bangumiPayResultDialog.show();
        }
    }

    public BangumiPayResultDialog(@NotNull Context context, @Nullable PayActivities payActivities) {
        super(context, 0, 2, null);
        this.f71540a = payActivities;
        View viewInflate = LayoutInflater.from(context).inflate(payActivities != null ? 2131500301 : 2131500302, (ViewGroup) null);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.requestFeature(1);
            window.setContentView(viewInflate);
        }
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        this.f71541b = viewInflate.findViewById(2131308247);
        this.f71546g = (CheckBox) viewInflate.findViewById(2131315922);
        this.f71542c = (TextView) viewInflate.findViewById(2131299190);
        this.f71543d = (TextView) viewInflate.findViewById(2131300356);
        this.f71545f = viewInflate.findViewById(2131298371);
        this.h = viewInflate.findViewById(2131296796);
        this.f71544e = viewInflate.findViewById(2131308809);
    }

    public final void j() {
        List<PendantInfo> list;
        PendantInfo pendantInfo;
        PayActivities payActivities = this.f71540a;
        String str = (payActivities == null || (list = payActivities.f71548b) == null || (pendantInfo = (PendantInfo) CollectionsKt.firstOrNull(list)) == null) ? null : pendantInfo.f71554a;
        if (str != null) {
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new BangumiPayResultDialog$usePendant$1(str, this, null), 3, (Object) null);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        int id = this.f71541b.getId();
        if (numValueOf != null && numValueOf.intValue() == id) {
            CheckBox checkBox = this.f71546g;
            if (checkBox != null && checkBox.isChecked()) {
                j();
            }
            dismiss();
            return;
        }
        if (!Intrinsics.areEqual(numValueOf, (Object) null)) {
            int id2 = this.f71545f.getId();
            if (numValueOf != null && numValueOf.intValue() == id2) {
                dismiss();
                return;
            }
            return;
        }
        CheckBox checkBox2 = this.f71546g;
        if (checkBox2 != null && checkBox2.isChecked()) {
            j();
        }
        g.e(getContext(), Uri.parse("https://account.bilibili.com/mobile/pendant/"));
        dismiss();
    }
}
