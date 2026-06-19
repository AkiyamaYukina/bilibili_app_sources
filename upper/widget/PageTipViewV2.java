package com.bilibili.upper.widget;

import GA0.a;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.C4496a;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintLinearLayout;
import com.bilibili.moduleservice.account.AccountService;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import com.bilibili.upper.api.bean.PageTip;
import com.bilibili.upper.api.service.UpperCenterApiService;
import com.bilibili.upper.widget.PageTipView;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/PageTipViewV2.class */
@StabilityInferred(parameters = 0)
public final class PageTipViewV2 extends TintLinearLayout {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f114408g = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f114409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TintImageView f114410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public PageTip.PageTipItem f114411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public PageTipView.b f114412f;

    public PageTipViewV2(@NotNull Context context) {
        this(context, null);
    }

    public PageTipViewV2(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, -1);
        LayoutInflater.from(context).inflate(2131501904, (ViewGroup) this, true);
        setOrientation(0);
        setGravity(16);
        this.f114409c = (TextView) findViewById(2131310583);
        this.f114410d = (TintImageView) findViewById(2131302903);
    }

    @Nullable
    public final PageTipView.a getOnCloseListener() {
        return null;
    }

    @Nullable
    public final PageTipView.b getOnDismissListener() {
        return this.f114412f;
    }

    public final void setData(@NotNull PageTip.PageTipItem pageTipItem) {
        String str;
        String str2;
        this.f114411e = pageTipItem;
        if (pageTipItem == null || (((str = pageTipItem.content) == null || str.length() == 0) && ((str2 = this.f114411e.highlight) == null || str2.length() == 0))) {
            setVisibility(8);
            PageTipView.b bVar = this.f114412f;
            if (bVar != null) {
                bVar.k();
                return;
            }
            return;
        }
        setVisibility(0);
        final PageTip.PageTipItem pageTipItem2 = this.f114411e;
        TE0.b bVar2 = TE0.b.f24088a;
        int i7 = pageTipItem2.page;
        long j7 = pageTipItem2.id;
        bVar2.getClass();
        TE0.b.p0(i7, j7);
        String str3 = pageTipItem2.content;
        String strA = str3 != null ? str3.length() == 0 ? "" : C4496a.a("", pageTipItem2.content) : "";
        String str4 = pageTipItem2.highlight;
        String strA2 = strA;
        int length = 0;
        if (str4 != null) {
            if (str4.length() == 0) {
                strA2 = strA;
                length = 0;
            } else {
                length = strA.length();
                strA2 = G.p.a(strA, pageTipItem2.highlight);
            }
        }
        SpannableString spannableString = new SpannableString(strA2);
        String str5 = pageTipItem2.highlight;
        if (str5 != null && str5.length() != 0) {
            spannableString.setSpan(new UnderlineSpan(), length, pageTipItem2.highlight.length() + length, 18);
            String str6 = pageTipItem2.skipUrl;
            if (str6 != null && str6.length() != 0) {
                setOnClickListener(new View.OnClickListener(this, pageTipItem2) { // from class: com.bilibili.upper.widget.D

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final PageTipViewV2 f114384a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final PageTip.PageTipItem f114385b;

                    {
                        this.f114384a = this;
                        this.f114385b = pageTipItem2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PageTipViewV2 pageTipViewV2 = this.f114384a;
                        PageTip.PageTipItem pageTipItem3 = this.f114385b;
                        int i8 = PageTipViewV2.f114408g;
                        a.C0040a.b(GA0.a.f6978a, pageTipViewV2.getContext(), pageTipItem3.skipUrl);
                        TE0.b bVar3 = TE0.b.f24088a;
                        int i9 = pageTipItem3.page;
                        long j8 = pageTipItem3.id;
                        HashMap mapA = VF0.b.a(bVar3);
                        mapA.put("id", com.bilibili.app.preferences.fragment.K.a(i9, j8, MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE, mapA));
                        Neurons.reportClick(false, "creation.creation-center.y-notice.go.click", mapA);
                    }
                });
            }
        }
        TextView textView = this.f114409c;
        TextView textView2 = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvContent");
            textView2 = null;
        }
        textView2.setText(spannableString);
        TextView textView3 = this.f114409c;
        TextView textView4 = textView3;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvContent");
            textView4 = null;
        }
        textView4.setSelected(true);
        TintImageView tintImageView = this.f114410d;
        if (tintImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivClose");
            tintImageView = null;
        }
        tintImageView.setOnClickListener(new View.OnClickListener(this, pageTipItem2) { // from class: com.bilibili.upper.widget.E

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PageTipViewV2 f114386a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final PageTip.PageTipItem f114387b;

            {
                this.f114386a = this;
                this.f114387b = pageTipItem2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PageTipViewV2 pageTipViewV2 = this.f114386a;
                PageTip.PageTipItem pageTipItem3 = this.f114387b;
                int i8 = PageTipViewV2.f114408g;
                pageTipViewV2.setVisibility(8);
                PageTipView.b bVar3 = pageTipViewV2.f114412f;
                if (bVar3 != null) {
                    bVar3.k();
                }
                TE0.b bVar4 = TE0.b.f24088a;
                int i9 = pageTipItem3.page;
                long j8 = pageTipItem3.id;
                HashMap mapA = VF0.b.a(bVar4);
                mapA.put("id", com.bilibili.app.preferences.fragment.K.a(i9, j8, MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE, mapA));
                Neurons.reportClick(false, "creation.creation-center.y-notice.close.click", mapA);
                AccountService accountService = (AccountService) BLRouter.get$default(BLRouter.INSTANCE, AccountService.class, (String) null, 2, (Object) null);
                ((UpperCenterApiService) ServiceGenerator.createService(UpperCenterApiService.class)).postPageTipClose(accountService != null ? accountService.getAccessToken() : null, pageTipItem3.id).enqueue(null);
            }
        });
    }

    public final void setOnCloseListener(@Nullable PageTipView.a aVar) {
    }

    public final void setOnDismissListener(@Nullable PageTipView.b bVar) {
        this.f114412f = bVar;
    }
}
