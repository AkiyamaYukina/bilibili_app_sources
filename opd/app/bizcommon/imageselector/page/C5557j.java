package com.bilibili.opd.app.bizcommon.imageselector.page;

import Jm0.C2423A;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.platform.ComposeView;
import com.bilibili.base.SharedPreferencesHelper;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.google.android.material.tabs.TabLayout;
import java.util.List;
import kntr.base.android.legacy.context.ContextUtilKt;
import kntr.base.utils.foundation.InputMethodManagerHelper;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* JADX INFO: renamed from: com.bilibili.opd.app.bizcommon.imageselector.page.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/j.class */
public final class C5557j implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MallMediaFragment f73904a;

    public C5557j(MallMediaFragment mallMediaFragment) {
        this.f73904a = mallMediaFragment;
    }

    public final void onTabReselected(TabLayout.Tab tab) {
    }

    public final void onTabSelected(TabLayout.Tab tab) {
        MutableIntState mutableIntState;
        MutableIntState mutableIntState2;
        int position = tab.getPosition();
        MallMediaFragment mallMediaFragment = this.f73904a;
        if (position != 0) {
            if (position == 1 && mallMediaFragment.getContext() != null) {
                LinearLayout linearLayout = mallMediaFragment.f73781c;
                if (linearLayout != null) {
                    linearLayout.setBackgroundColor(mallMediaFragment.getResources().getColor(R$color.Bg1));
                }
                RelativeLayout relativeLayout = mallMediaFragment.f73783e;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(8);
                }
                ComposeView mText2Img = mallMediaFragment.getMText2Img();
                if (mText2Img != null) {
                    mText2Img.setVisibility(0);
                }
                C2423A c2423a = mallMediaFragment.f73803z;
                if (c2423a != null && (mutableIntState2 = c2423a.f11507i) != null) {
                    mutableIntState2.setIntValue(1);
                }
                BiliImageView biliImageView = mallMediaFragment.f73785g;
                if (biliImageView != null) {
                    biliImageView.setVisibility(8);
                }
                new SharedPreferencesHelper(mallMediaFragment.getContext(), "bilibili.mall.share.preference").setBoolean("show_text2img_guide", false);
                Neurons.reportClick(false, "mall.circle-publish.album.tab-text-to-image.click", MapsKt.mapOf(new Pair[]{TuplesKt.to("is_need_text", String.valueOf(mallMediaFragment.getMmParams().isNeedText())), TuplesKt.to("tab_Index", "1")}));
                Neurons.reportExposure$default(false, "mall.circle-publish.album.text-to-image.show", MapsKt.mapOf(new Pair[]{TuplesKt.to("is_need_text", String.valueOf(mallMediaFragment.getMmParams().isNeedText())), TuplesKt.to("tab_Index", "1")}), (List) null, 8, (Object) null);
                return;
            }
            return;
        }
        if (mallMediaFragment.getContext() == null) {
            return;
        }
        View childAt = tab.view.getChildAt(1);
        TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
        if (textView == null) {
            return;
        }
        textView.setTypeface(Typeface.defaultFromStyle(1));
        LinearLayout linearLayout2 = mallMediaFragment.f73781c;
        if (linearLayout2 != null) {
            linearLayout2.setBackgroundColor(Color.parseColor("#212121"));
        }
        RelativeLayout relativeLayout2 = mallMediaFragment.f73783e;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(0);
        }
        ComposeView mText2Img2 = mallMediaFragment.getMText2Img();
        if (mText2Img2 != null) {
            mText2Img2.setVisibility(8);
        }
        Context context = mallMediaFragment.getContext();
        Activity activityRequireActivity = null;
        if (context != null) {
            activityRequireActivity = ContextUtilKt.requireActivity(context);
        }
        InputMethodManagerHelper.tryHideSoftInput(activityRequireActivity);
        C2423A c2423a2 = mallMediaFragment.f73803z;
        if (c2423a2 != null && (mutableIntState = c2423a2.f11507i) != null) {
            mutableIntState.setIntValue(0);
        }
        BiliImageView biliImageView2 = mallMediaFragment.f73785g;
        if (biliImageView2 != null) {
            biliImageView2.setVisibility(8);
        }
        new SharedPreferencesHelper(mallMediaFragment.getContext(), "bilibili.mall.share.preference").setBoolean("show_text2img_guide", false);
        Neurons.reportClick(false, "mall.circle-publish.album.tab-photo-list.click", MapsKt.mapOf(new Pair[]{TuplesKt.to("is_need_text", String.valueOf(mallMediaFragment.getMmParams().isNeedText())), TuplesKt.to("tab_Index", "0")}));
        Neurons.reportExposure$default(false, "mall.circle-publish.album.photo-list.show", MapsKt.mapOf(new Pair[]{TuplesKt.to("is_need_text", String.valueOf(mallMediaFragment.getMmParams().isNeedText())), TuplesKt.to("tab_Index", "0")}), (List) null, 8, (Object) null);
    }

    public final void onTabUnselected(TabLayout.Tab tab) {
        View childAt = tab.view.getChildAt(1);
        TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
        if (textView == null) {
            return;
        }
        textView.setTypeface(Typeface.defaultFromStyle(0));
    }
}
