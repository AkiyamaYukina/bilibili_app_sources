package com.bilibili.ship.theseus.ugc.intro.ugcheadline;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.bililive.room.ui.matchcard.views.O;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.theme.R$color;
import com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcHeadlineService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.videopage.common.widget.view.ExpandableTextView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/m.class */
@StabilityInferred(parameters = 0)
public final class m implements UIComponent<com.bilibili.app.gemini.ui.n<Vu0.y>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C6266b f97353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Flow<a> f97354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f97355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f97356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final UgcHeadlineService.a f97357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f97358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f97359g;
    public boolean h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f97362k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f97363l;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final ExpandableTextView.e f97360i = new ExpandableTextView.c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final ExpandableTextView.e f97361j = new ExpandableTextView.c();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f97364m = new ExposureEntry(com.bilibili.ship.theseus.united.page.report.a.f102493a, new com.bilibili.ad.adview.videodetail.panel.mall.e(this, 3));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/m$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f97365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f97366b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f97367c;

        public a() {
            this(false, false, false);
        }

        public a(boolean z6, boolean z7, boolean z8) {
            this.f97365a = z6;
            this.f97366b = z7;
            this.f97367c = z8;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f97365a == aVar.f97365a && this.f97366b == aVar.f97366b && this.f97367c == aVar.f97367c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f97367c) + androidx.compose.animation.z.a(Boolean.hashCode(this.f97365a) * 31, 31, this.f97366b);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("State(expand=");
            sb.append(this.f97365a);
            sb.append(", titleOutline=");
            sb.append(this.f97366b);
            sb.append(", descOutline=");
            return androidx.appcompat.app.i.a(sb, this.f97367c, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/m$b.class */
    public static final class b extends ClickableSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f97368a;

        public b(m mVar) {
            this.f97368a = mVar;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            String str;
            UgcHeadlineService.a aVar = this.f97368a.f97357e;
            d dVar = aVar.f97252b.f97304b;
            if (dVar == null || (str = dVar.f97314b) == null) {
                return;
            }
            PageReportService.g(aVar.f97251a.f97250n, "united.player-video-detail.video-information.title-icon.click", dVar.f97320i, 4);
            BLRouter.routeTo$default(RouteRequestKt.toRouteRequest(str), (Context) null, 2, (Object) null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
        }
    }

    public m(@NotNull C6266b c6266b, @NotNull Flow flow, @NotNull MutableStateFlow mutableStateFlow, @NotNull StateFlow stateFlow, @NotNull UgcHeadlineService.a aVar) {
        this.f97353a = c6266b;
        this.f97354b = flow;
        this.f97355c = mutableStateFlow;
        this.f97356d = stateFlow;
        this.f97357e = aVar;
    }

    public final void a(ExpandableTextView expandableTextView, boolean z6) {
        expandableTextView.R(new ExpandableTextView.d(this.f97353a.f97303a), z6, !this.f97362k);
    }

    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, tv.danmaku.bili.videopage.common.widget.view.ExpandableTextView$d, tv.danmaku.bili.videopage.common.widget.view.ExpandableTextView$f] */
    public final void b(ExpandableTextView expandableTextView, d dVar, String str, boolean z6) {
        boolean zA = Cj0.a.a(expandableTextView.getContext());
        String str2 = zA ? dVar.f97316d : dVar.f97315c;
        if (zA) {
            String str3 = dVar.h;
        } else {
            String str4 = dVar.f97319g;
        }
        if (str2.length() != 0) {
            long j7 = dVar.f97317e;
            if (j7 > 0) {
                long j8 = dVar.f97318f;
                if (j8 > 0) {
                    float f7 = j7 / j8;
                    if (f7 > 8.0f) {
                        a(expandableTextView, z6);
                        return;
                    }
                    int iDpToPx = DimenUtilsKt.dpToPx(20.0f);
                    ColorDrawable colorDrawable = new ColorDrawable(0);
                    ImageSpan imageSpan = new ImageSpan(colorDrawable, 0);
                    ((yh1.g) imageSpan).b = 2.0f;
                    ((yh1.g) imageSpan).c = 10;
                    ((yh1.g) imageSpan).d = 10;
                    ((yh1.g) imageSpan).e = colorDrawable;
                    int iDpToPx2 = DimenUtilsKt.dpToPx(4.0f);
                    ((yh1.g) imageSpan).c = 0;
                    ((yh1.g) imageSpan).d = iDpToPx2;
                    ((yh1.g) imageSpan).b = f7;
                    ((yh1.g) imageSpan).a = iDpToPx;
                    BiliImageLoader.INSTANCE.acquire(expandableTextView).useOrigin().asDrawable().url(str2).submit().subscribe(new yh1.f(imageSpan, expandableTextView));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) ("    " + str));
                    spannableStringBuilder.setSpan(imageSpan, 0, 4, 33);
                    spannableStringBuilder.setSpan(new b(this), 0, 4, 33);
                    ?? obj = new Object();
                    ((ExpandableTextView.d) obj).a = spannableStringBuilder;
                    ((ExpandableTextView.d) obj).b = Boolean.TRUE;
                    expandableTextView.R((ExpandableTextView.f) obj, z6, !this.f97362k);
                    return;
                }
            }
        }
        a(expandableTextView, z6);
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        Vu0.y yVar = (Vu0.y) ((com.bilibili.app.gemini.ui.n) viewEntry).a;
        Context context = yVar.f25991a.getContext();
        ImageView imageView = yVar.f25992b;
        ExpandableTextView expandableTextView = yVar.f25993c;
        boolean z6 = false;
        expandableTextView.setEnableTouchToggle(false);
        expandableTextView.setExpandedDesc(this.f97360i);
        expandableTextView.setRetractedDesc(this.f97361j);
        expandableTextView.setExpandListener(new n(this));
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: com.bilibili.ship.theseus.ugc.intro.ugcheadline.l

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final m f97352a;

            {
                this.f97352a = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x00d9  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onClick(android.view.View r6) {
                /*
                    Method dump skipped, instruction units count: 231
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.ugcheadline.l.onClick(android.view.View):void");
            }
        };
        ConstraintLayout constraintLayout = yVar.f25991a;
        constraintLayout.setOnClickListener(onClickListener);
        constraintLayout.post(new O(this, 1));
        int iIntValue = ((Number) this.f97355c.getValue()).intValue();
        if (iIntValue != this.f97363l) {
            z6 = true;
        }
        this.f97363l = iIntValue;
        C6266b c6266b = this.f97353a;
        d dVar = c6266b.f97304b;
        if (dVar != null) {
            b(expandableTextView, dVar, c6266b.f97303a, z6);
        } else {
            a(expandableTextView, z6);
        }
        UgcHeadlineService ugcHeadlineService = this.f97357e.f97251a;
        if (ugcHeadlineService.f97245i.f99182c) {
            constraintLayout.setPadding(constraintLayout.getPaddingLeft(), DimenUtilsKt.dpToPx(12.0f), constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
        } else {
            constraintLayout.setPadding(constraintLayout.getPaddingLeft(), DimenUtilsKt.dpToPx(6.0f), constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
        }
        Integer numH = ugcHeadlineService.f97245i.h();
        expandableTextView.setTextColor(numH != null ? numH.intValue() : ContextCompat.getColor(context, R$color.Ga10));
        Integer numE = ugcHeadlineService.f97245i.e();
        imageView.setColorFilter(numE != null ? numE.intValue() : ContextCompat.getColor(context, R$color.Ga5));
        Integer numBoxInt = dVar != null ? Boxing.boxInt(dVar.f97313a) : null;
        String str = (numBoxInt != null && numBoxInt.intValue() == 1) ? "热门" : (numBoxInt != null && numBoxInt.intValue() == 2) ? "活动" : "互动视频";
        AX.g.a(expandableTextView, str + ", " + ((Object) expandableTextView.getText()));
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new UgcHeadlineComponent$bindToView$5(this, constraintLayout, expandableTextView, imageView, yVar, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        Vu0.y yVarInflate = Vu0.y.inflate(LayoutInflater.from(context), viewGroup, false);
        yVarInflate.f25993c.getPaint().setStrokeWidth(0.7f);
        ExpandableTextView expandableTextView = yVarInflate.f25993c;
        expandableTextView.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
        expandableTextView.setIncludeFontPadding(true);
        return new com.bilibili.app.gemini.ui.n(yVarInflate);
    }
}
