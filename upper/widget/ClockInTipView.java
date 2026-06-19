package com.bilibili.upper.widget;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.base.SharedPreferencesHelper;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.magicasakura.widgets.TintLinearLayout;
import com.bilibili.studio.videoeditor.util.V;
import com.bilibili.upper.api.bean.ClockInTip;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/ClockInTipView.class */
@StabilityInferred(parameters = 0)
public final class ClockInTipView extends TintLinearLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f114379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f114380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f114381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public ClockInTip f114382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final SharedPreferencesHelper f114383g;

    public ClockInTipView(@NotNull Context context) {
        this(context, null);
    }

    public ClockInTipView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, -1);
        this.f114383g = new SharedPreferencesHelper(context, "upper_check_in_tip");
        LayoutInflater.from(context).inflate(2131494806, (ViewGroup) this, true);
        setOrientation(0);
        setBackgroundColor(getResources().getColor(2131104128));
        setGravity(16);
        this.f114379c = (TextView) findViewById(2131310583);
        View viewFindViewById = findViewById(2131302903);
        this.f114380d = viewFindViewById;
        View view = viewFindViewById;
        if (viewFindViewById == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivClose");
            view = null;
        }
        view.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.upper.widget.j

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ClockInTipView f114538a;

            {
                this.f114538a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ClockInTipView clockInTipView = this.f114538a;
                ClockInTip clockInTip = clockInTipView.f114382f;
                if (clockInTip != null) {
                    if (clockInTip.id > 0 && clockInTip.type == 1) {
                        clockInTipView.f114383g.setBoolean(ec.a.a(BiliAccounts.get(clockInTipView.getContext()).mid(), clockInTip.id, "-"), true);
                    }
                    clockInTipView.setVisibility(8);
                }
            }
        });
        this.f114381e = findViewById(2131304358);
        setOnClickListener(new Bs.z(this, 1));
    }

    public final void setData(@Nullable ClockInTip clockInTip) {
        this.f114382f = clockInTip;
        if (clockInTip == null || TextUtils.isEmpty(clockInTip.content)) {
            return;
        }
        String strA = ec.a.a(BiliAccounts.get(getContext()).mid(), clockInTip.id, "-");
        if (clockInTip.id > 0 && clockInTip.type == 1 && this.f114383g.optBoolean(strA, false)) {
            return;
        }
        setVisibility(0);
        HashMap map = new HashMap();
        map.put("id", android.support.v4.media.session.a.a(new StringBuilder(), clockInTip.id, ""));
        String str = clockInTip.business;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        map.put("business", str2);
        map.put("scene", android.support.v4.media.session.a.a(new StringBuilder(), clockInTip.scene, ""));
        Neurons.reportExposure(false, "creation.creation-contribution.top-info.0.show", map);
        List listR = StringsKt.R(clockInTip.content, new String[]{"<b>"}, 0, 6);
        if (V.d(clockInTip.highlight) && V.d(listR) && listR.size() >= clockInTip.highlight.size()) {
            clockInTip.content = "";
            int size = clockInTip.highlight.size();
            for (int i7 = 0; i7 < size; i7++) {
                clockInTip.content = clockInTip.content + listR.get(i7) + clockInTip.highlight.get(i7);
            }
            if (listR.size() > clockInTip.highlight.size()) {
                clockInTip.content = clockInTip.content + listR.get(clockInTip.highlight.size());
            }
            SpannableString spannableString = new SpannableString(clockInTip.content);
            int size2 = clockInTip.highlight.size();
            int length = 0;
            for (int i8 = 0; i8 < size2; i8++) {
                int length2 = ((String) listR.get(i8)).length() + length;
                length = ((String) clockInTip.highlight.get(i8)).length() + length2;
                if (length2 >= 0 && length <= clockInTip.content.length()) {
                    spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(2131104129)), length2, length, 17);
                }
            }
            TextView textView = this.f114379c;
            TextView textView2 = textView;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvContent");
                textView2 = null;
            }
            textView2.setText(spannableString);
        } else {
            TextView textView3 = this.f114379c;
            TextView textView4 = textView3;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvContent");
                textView4 = null;
            }
            textView4.setText(clockInTip.content);
        }
        if (clockInTip.type == 1) {
            View view = this.f114380d;
            View view2 = view;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivClose");
                view2 = null;
            }
            view2.setVisibility(0);
            View view3 = this.f114381e;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivNext");
                view3 = null;
            }
            view3.setVisibility(8);
            return;
        }
        View view4 = this.f114380d;
        View view5 = view4;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivClose");
            view5 = null;
        }
        view5.setVisibility(8);
        View view6 = this.f114381e;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivNext");
            view6 = null;
        }
        view6.setVisibility(0);
    }
}
