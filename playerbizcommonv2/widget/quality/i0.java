package com.bilibili.playerbizcommonv2.widget.quality;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.media.resource.Badge;
import com.bilibili.lib.media.resource.PlayIndex;
import com.bilibili.lib.projection.ProjectionService;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import d3.C6781b;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/i0.class */
@StabilityInferred(parameters = 0)
public final class i0 extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final IReporterService f82831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final QualityItemStyle f82832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Function2<? super Q, ? super Boolean, Unit> f82833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public View.OnClickListener f82834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public List<PlayIndex> f82835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final List<Q> f82836f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f82837g = -1;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final r f82838i;

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bilibili.playerbizcommonv2.widget.quality.r, java.lang.Object] */
    public i0(@Nullable IReporterService iReporterService, @NotNull QualityItemStyle qualityItemStyle) {
        this.f82831a = iReporterService;
        this.f82832b = qualityItemStyle;
        ?? obj = new Object();
        obj.f82876a = false;
        this.f82838i = obj;
    }

    public final void N(@Nullable List list, int i7, @Nullable PlayIndex playIndex, boolean z6) {
        this.f82835e = list;
        this.h = z6;
        ((ArrayList) this.f82836f).clear();
        Q q7 = new Q();
        q7.f82707a = playIndex;
        q7.f82708b = true;
        q7.f82709c = -1;
        ((ArrayList) this.f82836f).add(q7);
        if (list != null) {
            int i8 = 0;
            for (Object obj : list) {
                if (i8 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                PlayIndex playIndex2 = (PlayIndex) obj;
                Q q8 = new Q();
                q8.f82707a = playIndex2;
                q8.f82708b = false;
                q8.f82709c = i8;
                if (playIndex2 != null && playIndex2.mQuality == i7) {
                    this.f82837g = i8;
                }
                ((ArrayList) this.f82836f).add(q8);
                i8++;
            }
        }
        if (i7 == 0) {
            this.f82837g = -1;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return ((ArrayList) this.f82836f).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i7) {
        return (i7 < 0 || i7 >= ((ArrayList) this.f82836f).size() || ((Q) ((ArrayList) this.f82836f).get(i7)).f82708b) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i7) {
        String str;
        Boolean boolValueOf;
        String string;
        String string2;
        Integer numN;
        Integer numN2;
        Drawable drawable;
        Integer numN3;
        Integer numN4;
        Drawable drawable2;
        Q q7 = (Q) ((ArrayList) this.f82836f).get(i7);
        boolean z6 = this.f82837g == q7.f82709c;
        PlayIndex playIndex = q7.f82707a;
        if (playIndex == null) {
            return;
        }
        View view = viewHolder.itemView;
        KProperty<Object>[] kPropertyArr = j0.f82844a;
        KProperty<Object> kProperty = kPropertyArr[1];
        view.setTag(j0.f82846c, q7);
        viewHolder.itemView.setOnClickListener(this);
        viewHolder.itemView.setSelected(z6);
        str = "";
        if (!(viewHolder instanceof P)) {
            if (viewHolder instanceof C5808e) {
                C5808e c5808e = (C5808e) viewHolder;
                String string3 = c5808e.f82812a.getResources().getString(2131845792);
                String str2 = playIndex.mDescription;
                str = str2 != null ? str2 : "";
                String strA = string3;
                if (z6) {
                    strA = string3;
                    if (str.length() > 0) {
                        strA = C6781b.a(string3, " (", str, ")");
                    }
                }
                c5808e.f82812a.setText(strA);
                c5808e.f82812a.setSelected(z6);
                return;
            }
            return;
        }
        P p7 = (P) viewHolder;
        boolean z7 = this.h;
        View.OnClickListener onClickListener = this.f82834d;
        r rVar = this.f82838i;
        QualityItemStyle qualityItemStyle = this.f82832b;
        String str3 = playIndex.mDescription;
        p7.f82702b.setSelected(z6);
        p7.f82706f.setSelected(z6);
        p7.f82702b.setText(str3);
        TextView textView = p7.f82703c;
        TextView textView2 = p7.f82704d;
        boolean zIsLogin = BiliAccounts.get(p7.f82701a).isLogin();
        boolean z8 = playIndex.mNeedVip && playIndex.mQuality != 126 && z7;
        Badge badge = playIndex.badge;
        boolean z9 = (badge == null || badge.i().length() <= 0 || z8 || (qualityItemStyle == QualityItemStyle.Dialog && !zIsLogin && playIndex.mNeedLogin)) ? false : true;
        boolean zIsNightTheme = MultipleThemeUtils.isNightTheme(p7.f82701a);
        boolean zIsEffectiveVip = BiliAccountInfo.Companion.get().isEffectiveVip();
        Badge badge2 = playIndex.badge;
        if (z9) {
            boolValueOf = Boolean.valueOf(badge2.c() == 1);
            string = badge2.i();
            string2 = badge2.i();
        } else {
            if (playIndex.mVipFree && zIsLogin) {
                boolValueOf = Boolean.TRUE;
                string2 = p7.f82701a.getString(2131847026);
            } else if (playIndex.mNeedVip) {
                if (playIndex.mQuality == 126 || !z7 || zIsEffectiveVip) {
                    boolValueOf = Boolean.TRUE;
                    string = p7.f82701a.getString(2131847094);
                    string2 = p7.f82701a.getString(2131841536);
                } else {
                    boolValueOf = Boolean.FALSE;
                    string2 = z6 ? p7.f82701a.getString(2131858111) : p7.f82701a.getString(2131858112);
                }
            } else if (!zIsLogin && playIndex.mNeedLogin && qualityItemStyle == QualityItemStyle.FunctionWidget) {
                boolValueOf = Boolean.FALSE;
                string2 = p7.f82701a.getString(2131841552);
            } else {
                boolValueOf = null;
                string = null;
                string2 = null;
            }
            string = null;
        }
        if (z9) {
            numN = com.bilibili.playerbizcommonv2.utils.p.n(!zIsNightTheme ? badge2.j() : badge2.m());
        } else {
            numN = null;
        }
        if (boolValueOf == null || string2 == null || string2.length() == 0) {
            textView.setVisibility(8);
            textView2.setVisibility(8);
        } else if (boolValueOf.booleanValue()) {
            textView.setVisibility(8);
            textView2.setText(string2);
            textView2.setContentDescription(string);
            textView2.setVisibility(0);
            if (z9) {
                numN4 = com.bilibili.playerbizcommonv2.utils.p.n(!zIsNightTheme ? badge2.a() : badge2.b());
            } else {
                numN4 = null;
            }
            if (numN4 != null) {
                GradientDrawable gradientDrawableA = e8.h.a(0);
                gradientDrawableA.setColor(numN4.intValue());
                gradientDrawableA.setCornerRadius(NewPlayerUtilsKt.toFloatPx(12.0f));
                drawable2 = gradientDrawableA;
            } else {
                drawable2 = p7.f82701a.getResources().getDrawable(2131239962, null);
            }
            textView2.setBackground(drawable2);
            textView2.setTextColor(numN != null ? numN.intValue() : ContextCompat.getColor(p7.f82701a, 2131103591));
        } else {
            textView2.setVisibility(8);
            textView.setText(string2);
            textView.setContentDescription(string);
            textView.setVisibility(0);
            if (string2.length() > 2) {
                textView.setPadding(NewPlayerUtilsKt.toPx(4.0f), NewPlayerUtilsKt.toPx(1.0f), NewPlayerUtilsKt.toPx(4.0f), NewPlayerUtilsKt.toPx(2.0f));
            } else {
                textView.setPadding(NewPlayerUtilsKt.toPx(8.5f), NewPlayerUtilsKt.toPx(1.0f), NewPlayerUtilsKt.toPx(8.5f), NewPlayerUtilsKt.toPx(2.0f));
            }
            if (z9) {
                numN2 = com.bilibili.playerbizcommonv2.utils.p.n(!zIsNightTheme ? badge2.d() : badge2.h());
            } else {
                numN2 = null;
            }
            if (numN2 != null) {
                GradientDrawable gradientDrawableA2 = e8.h.a(0);
                gradientDrawableA2.setStroke(NewPlayerUtilsKt.toPx(0.5f), numN2.intValue());
                gradientDrawableA2.setCornerRadius(NewPlayerUtilsKt.toFloatPx(12.0f));
                drawable = gradientDrawableA2;
            } else {
                drawable = p7.f82701a.getResources().getDrawable(2131239963, null);
            }
            textView.setBackground(drawable);
            if (z9) {
                numN3 = com.bilibili.playerbizcommonv2.utils.p.n(!zIsNightTheme ? badge2.j() : badge2.m());
            } else {
                numN3 = null;
            }
            textView.setTextColor(numN3 != null ? numN3.intValue() : ContextCompat.getColor(p7.f82701a, 2131102728));
        }
        ImageView imageView = p7.f82705e;
        TextView textView3 = p7.f82706f;
        if (P.f82700g.contains(Integer.valueOf(playIndex.mQuality))) {
            imageView.setVisibility(0);
            KProperty<Object> kProperty2 = kPropertyArr[0];
            imageView.setTag(j0.f82845b, playIndex);
            imageView.setOnClickListener(onClickListener);
        } else {
            imageView.setVisibility(8);
        }
        if (Intrinsics.areEqual(playIndex.mFrom, "downloaded")) {
            textView3.setText(p7.f82701a.getString(2131845722));
            textView3.setVisibility(0);
            return;
        }
        String str4 = playIndex.mSubtitle;
        if (str4 != null && str4.length() != 0) {
            textView3.setText(playIndex.mSubtitle);
            textView3.setVisibility(0);
            return;
        }
        if (playIndex.mQuality != 120) {
            textView3.setText("");
            textView3.setVisibility(8);
            return;
        }
        ConfigManager.Companion companion = ConfigManager.Companion;
        String strTake = str;
        if (companion.isHitFF("player.qn_4k_tip")) {
            ProjectionService projectionService = (ProjectionService) BLRouter.get$default(BLRouter.INSTANCE, ProjectionService.class, (String) null, 2, (Object) null);
            strTake = str;
            if (projectionService != null) {
                if (projectionService.hasProjectionDevice()) {
                    SharedPreferences bLKVSharedPreference = BiliGlobalPreferenceHelper.getBLKVSharedPreference(p7.f82701a);
                    long j7 = bLKVSharedPreference.getLong("last_4k_hint_show_timestamp", 0L);
                    Integer intOrNull = StringsKt.toIntOrNull(companion.getConfig("player.qn_4k_tip_repeat", "1"));
                    int iIntValue = intOrNull != null ? intOrNull.intValue() : 1;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (Math.abs(jCurrentTimeMillis - j7) <= TimeUnit.DAYS.toMillis(1L)) {
                        int i8 = bLKVSharedPreference.getInt("player.qn_4k_tip_repeat", 0);
                        if (i8 < iIntValue) {
                            strTake = StringsKt.take(companion.getConfig("player.qn_4k_tip_text", ""), 11);
                            bLKVSharedPreference.edit().putInt("player.qn_4k_tip_repeat", i8 + 1).apply();
                        } else {
                            strTake = str;
                        }
                    } else if (iIntValue >= 1) {
                        strTake = StringsKt.take(companion.getConfig("player.qn_4k_tip_text", ""), 11);
                        bLKVSharedPreference.edit().putInt("player.qn_4k_tip_repeat", 1).apply();
                        bLKVSharedPreference.edit().putLong("last_4k_hint_show_timestamp", jCurrentTimeMillis).apply();
                    } else {
                        strTake = str;
                    }
                } else {
                    strTake = str;
                }
            }
        }
        textView3.setText(strTake);
        boolean z10 = strTake.length() > 0;
        textView3.setVisibility(z10 ? 0 : 8);
        rVar.f82876a = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x014f  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onClick(@org.jetbrains.annotations.NotNull android.view.View r5) {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.quality.i0.onClick(android.view.View):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i7) {
        RecyclerView.ViewHolder p7;
        int i8 = 2131496498;
        if (i7 == 0) {
            Set<Integer> set = P.f82700g;
            if (this.f82832b == QualityItemStyle.Dialog) {
                i8 = 2131501557;
            }
            p7 = new P(p.a(viewGroup, i8, viewGroup, false));
        } else if (i7 != 1) {
            Set<Integer> set2 = P.f82700g;
            if (this.f82832b == QualityItemStyle.Dialog) {
                i8 = 2131501557;
            }
            p7 = new P(p.a(viewGroup, i8, viewGroup, false));
        } else {
            int i9 = C5808e.f82811b;
            p7 = new C5808e(p.a(viewGroup, this.f82832b == QualityItemStyle.Dialog ? 2131501556 : 2131496499, viewGroup, false));
        }
        return p7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(@NotNull RecyclerView.ViewHolder viewHolder) {
        PlayIndex playIndex;
        IReporterService iReporterService;
        View view = viewHolder.itemView;
        KProperty<Object> kProperty = j0.f82844a[1];
        Q q7 = (Q) view.getTag(j0.f82846c);
        if (q7 == null || !this.f82838i.f82876a || (playIndex = q7.f82707a) == null || playIndex.mQuality != 120 || (iReporterService = this.f82831a) == null) {
            return;
        }
        iReporterService.report(new NeuronsEvents.NormalEvent("player.player.clarity-subhead.show.player", new String[0]));
    }
}
