package com.bilibili.ship.theseus.ogv.pay.sponsor;

import Cx0.e;
import Lv.f;
import Qj0.g;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentDialog;
import androidx.appcompat.view.menu.d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.text.HtmlCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.commons.RandomUtils;
import com.bilibili.droid.SoftKeyBoardListener;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.accountinfo.model.AccountInfo;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.BiliImageLoaderHelper;
import com.bilibili.lib.image2.bean.IThumbnailSizeController;
import com.bilibili.lib.image2.bean.ThumbUrlTransformStrategyUtils;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.ogv.infra.util.i;
import com.bilibili.ogv.pub.sponsor.BangumiPendant;
import com.bilibili.ship.theseus.ogv.pay.OgvPayService;
import com.bilibili.ship.theseus.ogv.pay.OgvPayService$showSponsorDialog$1;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/sponsor/b.class */
@StabilityInferred(parameters = 0)
public final class b extends ComponentDialog implements View.OnClickListener, SoftKeyBoardListener.OnSoftKeyBoardChangeListener {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f94231x = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final BangumiSponsorRankSummary f94232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InputMethodManager f94233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f94234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public TextView f94235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public ImageView f94236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public View f94237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public BiliImageView f94238g;

    @Nullable
    public BiliImageView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public List<TextView> f94239i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public TextView f94240j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public TextView f94241k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public TextView f94242l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public View f94243m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public View f94244n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public List<BiliImageView> f94245o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public TextView f94246p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public TextView f94247q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public View f94248r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public View f94249s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public View f94250t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public EditText f94251u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final f f94252v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public OgvPayService$showSponsorDialog$1.a f94253w;

    public b(@NotNull Context context, @Nullable BangumiSponsorRankSummary bangumiSponsorRankSummary) {
        super(context, 0, 2, null);
        this.f94232a = bangumiSponsorRankSummary;
        this.f94233b = (InputMethodManager) context.getSystemService("input_method");
        this.f94234c = 10;
        this.f94239i = new ArrayList();
        this.f94245o = new ArrayList();
        setContentView(2131500304);
        Window window = getWindow();
        if (window != null) {
            Window window2 = getWindow();
            WindowManager.LayoutParams layoutParams = null;
            if (window2 != null) {
                WindowManager.LayoutParams attributes = window2.getAttributes();
                layoutParams = null;
                if (attributes != null) {
                    attributes.width = -1;
                    attributes.height = -2;
                    layoutParams = attributes;
                }
            }
            window.setAttributes(layoutParams);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setGravity(80);
        }
        this.f94252v = new f(this, 2);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        if (this.f94250t.getVisibility() == 0) {
            k(false);
        }
    }

    public final void j(int i7, View view) {
        List<BangumiPendant> list;
        this.f94234c = i7;
        int size = this.f94239i.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((TextView) ((ArrayList) this.f94239i).get(i8)).setSelected(false);
        }
        view.setSelected(true);
        if (this.f94234c > 0) {
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new BangumiSponsorDialog$requestPointInfo$1(this, null), 3, (Object) null);
        }
        l(null);
        BangumiSponsorRankSummary bangumiSponsorRankSummary = this.f94232a;
        if (((bangumiSponsorRankSummary == null || (list = bangumiSponsorRankSummary.f94213f) == null) ? null : (BangumiPendant) CollectionsKt.getOrNull(list, 0)) == null) {
            this.f94240j.setVisibility(8);
            return;
        }
        this.f94240j.setVisibility(0);
        BangumiSponsorRankSummary bangumiSponsorRankSummary2 = this.f94232a;
        BangumiThreshold bangumiThreshold = null;
        if (bangumiSponsorRankSummary2 != null) {
            bangumiThreshold = null;
            if (!bangumiSponsorRankSummary2.d().isEmpty()) {
                Iterator<BangumiThreshold> it = this.f94232a.d().iterator();
                BangumiThreshold bangumiThreshold2 = null;
                while (true) {
                    bangumiThreshold = bangumiThreshold2;
                    if (!it.hasNext()) {
                        break;
                    }
                    BangumiThreshold next = it.next();
                    int i9 = this.f94234c;
                    int i10 = next.f94221a;
                    if (i9 >= i10 && (bangumiThreshold2 == null || bangumiThreshold2.f94221a < i10)) {
                        bangumiThreshold2 = next;
                    }
                }
            }
        }
        if (bangumiThreshold == null) {
            this.f94240j.setText(getContext().getString(2131848955));
        } else {
            this.f94240j.setText(getContext().getString(2131854819, Integer.valueOf(bangumiThreshold.f94221a), bangumiThreshold.a()));
            this.f94251u.setHint(getContext().getString(2131848955));
        }
    }

    public final void k(boolean z6) {
        if (z6) {
            this.f94250t.setVisibility(0);
            this.f94249s.setVisibility(8);
            this.f94251u.requestFocus();
            this.f94233b.showSoftInput(this.f94251u, 0, null);
            return;
        }
        this.f94250t.setVisibility(8);
        this.f94249s.setVisibility(0);
        EditText editText = this.f94251u;
        if (editText != null) {
            editText.setText((CharSequence) null);
        }
        this.f94251u.clearFocus();
        this.f94233b.hideSoftInputFromWindow(this.f94251u.getWindowToken(), 0, null);
    }

    public final void keyBoardHide(int i7) {
        if (this.f94250t.getVisibility() == 0) {
            k(false);
        }
    }

    public final void keyBoardShow(int i7) {
    }

    public final void l(String str) {
        if (this.f94234c <= 0) {
            this.f94235d.setVisibility(8);
            return;
        }
        this.f94235d.setVisibility(0);
        if (str == null || str.length() == 0) {
            this.f94235d.setText(HtmlCompat.fromHtml(getContext().getString(2131854814, String.valueOf(this.f94234c)), 0));
        } else {
            this.f94235d.setText(HtmlCompat.fromHtml(getContext().getString(2131855874, String.valueOf(this.f94234c), str), 0));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        OgvPayService$showSponsorDialog$1.a aVar;
        BangumiSponsorRankSummary bangumiSponsorRankSummary;
        OgvPayService$showSponsorDialog$1.a aVar2;
        int id = view.getId();
        if (id == 2131311983 && (aVar2 = this.f94253w) != null) {
            aVar2.a(this.f94234c);
        }
        if ((id == 2131309825 || id == 2131309842) && (aVar = this.f94253w) != null) {
            OgvPayService ogvPayService = aVar.f94163a;
            OgvSeason ogvSeason = ogvPayService.f94156e;
            g.e(ogvPayService.f94154c, xl0.c.a(ogvSeason.f94450b, ogvSeason.f94449a, ogvPayService.h.f() == 0 ? 1 : 0));
        }
        if (id == 2131298371) {
            dismiss();
        }
        if (id == 2131297884) {
            k(false);
        }
        if (id == 2131298598) {
            int iC = i.c(this.f94251u.getText().toString());
            if (iC > 0) {
                j(iC, (View) d.a(1, (ArrayList) this.f94239i));
                k(false);
            } else {
                ToastHelper.showToastShort(getContext(), getContext().getString(2131854810));
            }
        }
        if (id != 2131311991 || (bangumiSponsorRankSummary = this.f94232a) == null || bangumiSponsorRankSummary.c().f71789c.length() <= 0) {
            return;
        }
        g.e(getContext(), Uri.parse(this.f94232a.c().f71789c));
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onCreate(@Nullable Bundle bundle) {
        List<BangumiPendant> list;
        super.onCreate(bundle);
        this.f94250t = findViewById(2131302153);
        this.f94251u = (EditText) findViewById(2131303711);
        findViewById(2131297884).setOnClickListener(this);
        findViewById(2131298598).setOnClickListener(this);
        findViewById(2131298371).setOnClickListener(this);
        this.f94249s = findViewById(2131299396);
        this.f94235d = (TextView) findViewById(2131311982);
        this.f94236e = (ImageView) findViewById(2131311985);
        this.f94237f = findViewById(2131296823);
        this.h = findViewById(2131296796);
        this.f94238g = findViewById(2131308809);
        ArrayList arrayList = new ArrayList();
        this.f94239i = arrayList;
        arrayList.add((TextView) findViewById(2131297434));
        ((ArrayList) this.f94239i).add((TextView) findViewById(2131297435));
        ((ArrayList) this.f94239i).add((TextView) findViewById(2131297436));
        ((ArrayList) this.f94239i).add((TextView) findViewById(2131297438));
        ((ArrayList) this.f94239i).add((TextView) findViewById(2131297439));
        this.f94240j = (TextView) findViewById(2131311990);
        TextView textView = (TextView) findViewById(2131311991);
        this.f94241k = textView;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        this.f94242l = (TextView) findViewById(2131311989);
        this.f94243m = findViewById(2131309825);
        this.f94244n = findViewById(2131309842);
        View view = this.f94243m;
        if (view != null) {
            view.setOnClickListener(this);
        }
        View view2 = this.f94244n;
        if (view2 != null) {
            view2.setOnClickListener(this);
        }
        ArrayList arrayList2 = new ArrayList();
        this.f94245o = arrayList2;
        arrayList2.add(findViewById(2131309820));
        ((ArrayList) this.f94245o).add(findViewById(2131309821));
        ((ArrayList) this.f94245o).add(findViewById(2131309822));
        ((ArrayList) this.f94245o).add(findViewById(2131309823));
        View viewFindViewById = findViewById(2131311983);
        this.f94248r = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(this);
        }
        int size = ((ArrayList) this.f94239i).size();
        for (int i7 = 0; i7 < size; i7++) {
            TextView textView2 = (TextView) ((ArrayList) this.f94239i).get(i7);
            textView2.setOnClickListener(this.f94252v);
            if (i7 == 1) {
                textView2.performClick();
            }
        }
        this.f94246p = (TextView) findViewById(2131298159);
        this.f94247q = (TextView) findViewById(2131298015);
        TextView textView3 = this.f94246p;
        if (textView3 != null) {
            textView3.setText(HtmlCompat.fromHtml(getContext().getString(2131855527), 0));
        }
        this.f94246p.setOnClickListener(new e(this, 1));
        TextView textView4 = this.f94247q;
        if (textView4 != null) {
            textView4.setText(HtmlCompat.fromHtml(getContext().getString(2131855528), 0));
        }
        this.f94247q.setOnClickListener(new Cx0.f(this, 2));
        BangumiSponsorRankSummary bangumiSponsorRankSummary = this.f94232a;
        BangumiPendant bangumiPendant = (bangumiSponsorRankSummary == null || (list = bangumiSponsorRankSummary.f94213f) == null) ? null : (BangumiPendant) CollectionsKt.getOrNull(list, 0);
        this.f94236e.setVisibility(bangumiPendant != null ? 8 : 0);
        this.f94237f.setVisibility(bangumiPendant != null ? 0 : 8);
        BangumiSponsorRankSummary bangumiSponsorRankSummary2 = this.f94232a;
        if (bangumiSponsorRankSummary2 != null) {
            this.f94241k.setVisibility(bangumiSponsorRankSummary2.c().f71788b.length() == 0 ? 8 : 0);
            this.f94241k.setText(this.f94232a.c().f71788b);
        } else {
            this.f94241k.setVisibility(8);
        }
        if (bangumiPendant != null) {
            int i8 = RandomUtils.nextInt(0, 2) == 0 ? 2131241017 : 2131241018;
            BiliImageView biliImageView = this.h;
            if (biliImageView != null) {
                BiliImageLoader.INSTANCE.with(getContext()).thumbnailUrlTransformStrategy(ThumbUrlTransformStrategyUtils.stylingStrategy$default("common-ogv", (IThumbnailSizeController) null, 2, (Object) null)).url(BiliImageLoaderHelper.resourceToUri$default((String) null, i8, 1, (Object) null)).into(biliImageView);
            }
            BiliImageView biliImageView2 = this.f94238g;
            if (biliImageView2 != null) {
                BiliImageLoader.INSTANCE.with(getContext()).thumbnailUrlTransformStrategy(ThumbUrlTransformStrategyUtils.stylingStrategy$default("common-ogv", (IThumbnailSizeController) null, 2, (Object) null)).url(bangumiPendant.f71785c).into(biliImageView2);
            }
        }
        BangumiSponsorRankSummary bangumiSponsorRankSummary3 = this.f94232a;
        if (bangumiSponsorRankSummary3 != null) {
            boolean z6 = bangumiSponsorRankSummary3.e() > 0;
            boolean z7 = this.f94232a.f() > 0 && !this.f94232a.a().isEmpty();
            if (!z6 || !z7) {
                if (z6) {
                    this.f94244n.setVisibility(0);
                    this.f94243m.setVisibility(8);
                    return;
                } else {
                    this.f94244n.setVisibility(8);
                    this.f94243m.setVisibility(8);
                    return;
                }
            }
            this.f94244n.setVisibility(8);
            this.f94243m.setVisibility(0);
            ArrayList arrayList3 = new ArrayList(this.f94232a.a().subList(0, this.f94232a.a().size() > 4 ? 4 : this.f94232a.a().size()));
            if (this.f94232a.b().f94206b > 4) {
                BangumiSponsorRankUser bangumiSponsorRankUser = new BangumiSponsorRankUser(0L, null, null, null, 15);
                AccountInfo accountInfoFromCache = BiliAccountInfo.Companion.get().getAccountInfoFromCache();
                if (accountInfoFromCache != null) {
                    bangumiSponsorRankUser.d(accountInfoFromCache.getAvatar());
                }
                arrayList3.set(arrayList3.size() - 1, bangumiSponsorRankUser);
            }
            int size2 = arrayList3.size();
            int i9 = 0;
            for (int i10 = 0; i10 < size2; i10++) {
                BangumiSponsorRankUser bangumiSponsorRankUser2 = (BangumiSponsorRankUser) arrayList3.get(i10);
                BiliImageView biliImageView3 = (BiliImageView) ((ArrayList) this.f94245o).get(i10);
                biliImageView3.setVisibility(0);
                BiliImageLoader.INSTANCE.with(getContext()).thumbnailUrlTransformStrategy(ThumbUrlTransformStrategyUtils.stylingStrategy$default("common-ogv", (IThumbnailSizeController) null, 2, (Object) null)).url(bangumiSponsorRankUser2.a()).into(biliImageView3);
                i9++;
            }
            int size3 = ((ArrayList) this.f94245o).size();
            while (i9 < size3) {
                ((BiliImageView) ((ArrayList) this.f94245o).get(i9)).setVisibility(8);
                i9++;
            }
            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf("");
            if (this.f94232a.f() > 4) {
                spannableStringBuilderValueOf.append((CharSequence) getContext().getString(2131848927, String.valueOf(this.f94232a.f())));
            }
            spannableStringBuilderValueOf.append((CharSequence) getContext().getString(2131848919));
            this.f94242l.setText(spannableStringBuilderValueOf);
        }
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(131080);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.addFlags(2);
            window.setSoftInputMode(18);
            new SoftKeyBoardListener(window).setOnSoftKeyBoardChangeListener(this);
        }
    }
}
