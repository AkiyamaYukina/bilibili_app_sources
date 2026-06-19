package com.bilibili.pegasus.holders.bannerv8.items;

import G3.P;
import Vn.A;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.OneShotPreDrawListener;
import androidx.media3.exoplayer.C4690e;
import androidx.recyclerview.widget.RecyclerView;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.image2.bean.ImageInfo;
import com.bilibili.lib.image2.bean.ImageLoadingListener;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.magicasakura.widgets.Tintable;
import com.bilibili.pegasus.FontSizeStrategy;
import com.bilibili.pegasus.holders.bannerv8.items.j;
import com.bilibili.pegasus.widget.PegasusCnyCountdownViewV2;
import gp0.C7373a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sp0.C8614c;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/items/j.class */
@StabilityInferred(parameters = 0)
public final class j extends com.bilibili.pegasus.holders.bannerv8.items.a<gp0.b, a> {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/items/j$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final BiliImageView f77773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final BiliImageView f77774b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final TextView f77775c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final PegasusCnyCountdownViewV2 f77776d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public View f77777e;

        public a(@NotNull View view) {
            super(view);
            this.f77773a = view.findViewById(2131301895);
            this.f77774b = view.findViewById(2131321077);
            this.f77775c = (TextView) view.findViewById(2131308958);
            this.f77776d = (PegasusCnyCountdownViewV2) view.findViewById(2131321046);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/items/j$b.class */
    public static final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f77778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f77779b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j f77780c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f77781d;

        public b(View view, a aVar, j jVar, String str) {
            this.f77778a = view;
            this.f77779b = aVar;
            this.f77780c = jVar;
            this.f77781d = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int adapterPosition = this.f77779b.getAdapterPosition();
            j jVar = this.f77780c;
            String str = this.f77781d;
            jVar.getClass();
            String strE = j.e(str);
            j jVar2 = this.f77780c;
            a aVar = this.f77779b;
            jVar2.getClass();
            bilibili.live.app.service.resolver.b.a(bilibili.live.app.service.resolver.a.b(adapterPosition, "loadImage preDraw, adapterPosition=", ", url=", strE, ", "), j.c(aVar), "ImageBannerItem");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/items/j$c.class */
    public static final class c implements ImageLoadingListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f77782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j f77783b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f77784c;

        public c(a aVar, j jVar, String str) {
            this.f77782a = aVar;
            this.f77783b = jVar;
            this.f77784c = str;
        }

        public final void onImageLoadFailed(Throwable th) {
            final a aVar = this.f77782a;
            int adapterPosition = aVar.getAdapterPosition();
            final j jVar = this.f77783b;
            jVar.getClass();
            final String str = this.f77784c;
            String strE = j.e(str);
            String strC = j.c(aVar);
            StringBuilder sbB = bilibili.live.app.service.resolver.a.b(adapterPosition, "loadImage failed, adapterPosition=", ", url=", strE, ", ");
            sbB.append(strC);
            BLog.w("ImageBannerItem", sbB.toString(), th);
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            View viewFindViewById = aVar.itemView.findViewById(2131301162);
            objectRef.element = viewFindViewById;
            View viewInflate = viewFindViewById instanceof ViewStub ? ((ViewStub) viewFindViewById).inflate() : aVar.itemView.findViewById(2131301163);
            if (viewInflate == null) {
                return;
            }
            objectRef.element = viewInflate;
            TintTextView tintTextView = (TintTextView) viewInflate.findViewById(2131310274);
            if (tintTextView == null) {
                return;
            }
            Object obj = objectRef.element;
            Tintable tintable = obj instanceof Tintable ? (Tintable) obj : null;
            if (tintable != null) {
                tintable.tint();
            }
            ((View) objectRef.element).setVisibility(0);
            tintTextView.tint();
            tintTextView.setOnClickListener(new View.OnClickListener(jVar, aVar, str, objectRef) { // from class: com.bilibili.pegasus.holders.bannerv8.items.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final j f77785a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final j.a f77786b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f77787c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Ref.ObjectRef f77788d;

                {
                    this.f77785a = jVar;
                    this.f77786b = aVar;
                    this.f77787c = str;
                    this.f77788d = objectRef;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    j jVar2 = this.f77785a;
                    j.a aVar2 = this.f77786b;
                    String str2 = this.f77787c;
                    Ref.ObjectRef objectRef2 = this.f77788d;
                    jVar2.d(aVar2, str2);
                    ((View) objectRef2.element).setVisibility(8);
                }
            });
            aVar.f77777e = (View) objectRef.element;
            aVar.itemView.setClickable(false);
        }

        public final void onImageSet(ImageInfo imageInfo) {
            a aVar = this.f77782a;
            int adapterPosition = aVar.getAdapterPosition();
            this.f77783b.getClass();
            String strE = j.e(this.f77784c);
            Integer numValueOf = null;
            Integer numValueOf2 = imageInfo != null ? Integer.valueOf(imageInfo.getWidth()) : null;
            if (imageInfo != null) {
                numValueOf = Integer.valueOf(imageInfo.getHeight());
            }
            String strC = j.c(aVar);
            StringBuilder sbB = bilibili.live.app.service.resolver.a.b(adapterPosition, "loadImage onImageSet, adapterPosition=", ", url=", strE, ", imageInfo=");
            Ul.a.a(sbB, numValueOf2, "x", numValueOf, ", ");
            bilibili.live.app.service.resolver.b.a(sbB, strC, "ImageBannerItem");
            aVar.itemView.setClickable(true);
            View view = aVar.f77777e;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    public static String c(a aVar) {
        ViewGroup.LayoutParams layoutParams = aVar.f77773a.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = aVar.itemView.getLayoutParams();
        int width = aVar.itemView.getWidth();
        int height = aVar.itemView.getHeight();
        int measuredWidth = aVar.itemView.getMeasuredWidth();
        int measuredHeight = aVar.itemView.getMeasuredHeight();
        Integer numValueOf = null;
        Integer numValueOf2 = layoutParams2 != null ? Integer.valueOf(layoutParams2.width) : null;
        Integer numValueOf3 = layoutParams2 != null ? Integer.valueOf(layoutParams2.height) : null;
        BiliImageView biliImageView = aVar.f77773a;
        int width2 = biliImageView.getWidth();
        int height2 = biliImageView.getHeight();
        int measuredWidth2 = biliImageView.getMeasuredWidth();
        int measuredHeight2 = biliImageView.getMeasuredHeight();
        Integer numValueOf4 = layoutParams != null ? Integer.valueOf(layoutParams.width) : null;
        if (layoutParams != null) {
            numValueOf = Integer.valueOf(layoutParams.height);
        }
        StringBuilder sbB = A.b(width, height, "item=", "x", "/measured=");
        C4690e.a(measuredWidth, measuredHeight, "x", "/lp=", sbB);
        Ul.a.a(sbB, numValueOf2, "x", numValueOf3, ", image=");
        C4690e.a(width2, height2, "x", "/measured=", sbB);
        C4690e.a(measuredWidth2, measuredHeight2, "x", "/lp=", sbB);
        sbB.append(numValueOf4);
        sbB.append("x");
        sbB.append(numValueOf);
        return sbB.toString();
    }

    public static String e(String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return "null";
        }
        String strTake = StringsKt.take(StringsKt.d0(str, "/"), 80);
        String strSubstringAfter = StringsKt.substringAfter(str, "@", "");
        return StringsKt.isBlank(strSubstringAfter) ? strTake : B0.a.a(strTake, "@", strSubstringAfter);
    }

    public final void b(final a aVar, gp0.b bVar, int i7) {
        long jCoerceAtLeast;
        aVar.f77776d.setY(i7 * 0.5609756f);
        gp0.g gVarN = bVar.n();
        C7373a c7373aG = gVarN != null ? gVarN.g() : null;
        if (c7373aG == null) {
            jCoerceAtLeast = -1;
        } else {
            jCoerceAtLeast = -1;
            if (c7373aG.d() > 0) {
                String strC = c7373aG.c();
                jCoerceAtLeast = -1;
                if (strC != null) {
                    jCoerceAtLeast = StringsKt.isBlank(strC) ? -1L : RangesKt.coerceAtLeast(c7373aG.d() - ij.d.b(), 0L);
                }
            }
        }
        long j7 = jCoerceAtLeast;
        PegasusCnyCountdownViewV2 pegasusCnyCountdownViewV2 = aVar.f77776d;
        if (j7 < 0 || c7373aG == null) {
            pegasusCnyCountdownViewV2.setVisibility(8);
            pegasusCnyCountdownViewV2.a(null, new P(7));
            return;
        }
        if (j7 != 0) {
            pegasusCnyCountdownViewV2.setVisibility(0);
            C8614c.d(aVar.f77774b, c7373aG.c(), null, null, 14);
            final C7373a c7373a = c7373aG;
            pegasusCnyCountdownViewV2.a(c7373aG, new Function0(this, aVar, c7373a) { // from class: com.bilibili.pegasus.holders.bannerv8.items.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final j f77770a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final j.a f77771b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final C7373a f77772c;

                {
                    this.f77770a = this;
                    this.f77771b = aVar;
                    this.f77772c = c7373a;
                }

                public final Object invoke() {
                    C7373a c7373a2 = this.f77772c;
                    String strC2 = c7373a2.c();
                    j jVar = this.f77770a;
                    j.a aVar2 = this.f77771b;
                    jVar.d(aVar2, strC2);
                    PegasusCnyCountdownViewV2 pegasusCnyCountdownViewV22 = aVar2.f77776d;
                    pegasusCnyCountdownViewV22.setVisibility(8);
                    pegasusCnyCountdownViewV22.a(null, new P(7));
                    TextView textView = aVar2.f77775c;
                    String strE = c7373a2.e();
                    if (strE == null) {
                        strE = "";
                    }
                    textView.setText(strE);
                    String strE2 = c7373a2.e();
                    if (strE2 == null) {
                        strE2 = "";
                    }
                    h.b(aVar2, strE2);
                    return Unit.INSTANCE;
                }
            });
            return;
        }
        pegasusCnyCountdownViewV2.setVisibility(8);
        pegasusCnyCountdownViewV2.a(null, new P(7));
        d(aVar, c7373aG.c());
        TextView textView = aVar.f77775c;
        String strE = c7373aG.e();
        if (strE == null) {
            strE = "";
        }
        textView.setText(strE);
        String strE2 = c7373aG.e();
        if (strE2 == null) {
            strE2 = "";
        }
        h.b(aVar, strE2);
    }

    @NotNull
    public final RecyclerView.ViewHolder createViewHolder(@NotNull ViewGroup viewGroup, int i7) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131498126, viewGroup, false);
        ListExtentionsKt.setChildrenAllAccessibilityNo(viewInflate);
        return new a(viewInflate);
    }

    public final void d(a aVar, String str) {
        int adapterPosition = aVar.getAdapterPosition();
        String strE = e(str);
        bilibili.live.app.service.resolver.b.a(bilibili.live.app.service.resolver.a.b(adapterPosition, "loadImage start, adapterPosition=", ", url=", strE, ", "), c(aVar), "ImageBannerItem");
        View view = aVar.itemView;
        OneShotPreDrawListener.add(view, new b(view, aVar, this, str));
        C8614c.d(aVar.f77773a, str, null, new c(aVar, this, str), 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onBindViewHolder(java.lang.Object r9, androidx.recyclerview.widget.RecyclerView.ViewHolder r10, androidx.fragment.app.Fragment r11, com.bilibili.app.comm.list.widget.banneradapter.BannerController r12) {
        /*
            r8 = this;
            r0 = r9
            gp0.b r0 = (gp0.b) r0
            r11 = r0
            r0 = r10
            com.bilibili.pegasus.holders.bannerv8.items.j$a r0 = (com.bilibili.pegasus.holders.bannerv8.items.j.a) r0
            r13 = r0
            r0 = r13
            android.widget.TextView r0 = r0.f77775c
            com.bilibili.pegasus.FontSizeStrategy r1 = com.bilibili.pegasus.FontSizeStrategy.INLINE_CARD_TITLE
            r2 = r13
            android.view.View r2 = r2.itemView
            android.content.Context r2 = r2.getContext()
            androidx.window.core.layout.WindowSizeClass r2 = com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt.windowSize(r2)
            float r1 = r1.get(r2)
            r0.setTextSize(r1)
            r0 = r13
            android.widget.TextView r0 = r0.f77775c
            r14 = r0
            r0 = r11
            gp0.g r0 = r0.n()
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = r9
            if (r0 == 0) goto L3e
            r0 = r9
            java.lang.String r0 = r0.getTitle()
            r9 = r0
            goto L40
        L3e:
            r0 = 0
            r9 = r0
        L40:
            r0 = r14
            r1 = r9
            r0.setText(r1)
            r0 = r11
            gp0.g r0 = r0.n()
            r14 = r0
            r0 = r10
            r9 = r0
            r0 = r14
            if (r0 == 0) goto L59
            r0 = r14
            java.lang.String r0 = r0.h()
            r9 = r0
        L59:
            r0 = r8
            r1 = r13
            r2 = r9
            r0.d(r1, r2)
            r0 = r13
            android.view.View r0 = r0.itemView
            com.bilibili.ogv.operation.modular.modules.banner.f r1 = new com.bilibili.ogv.operation.modular.modules.banner.f
            r2 = r1
            r3 = r11
            r4 = 1
            r5 = r12
            r6 = r13
            r2.<init>(r3, r4, r5, r6)
            r0.setOnClickListener(r1)
            r0 = r11
            gp0.g r0 = r0.n()
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L89
            r0 = r9
            java.lang.String r0 = r0.getTitle()
            r10 = r0
            r0 = r10
            r9 = r0
            r0 = r10
            if (r0 != 0) goto L8c
        L89:
            java.lang.String r0 = ""
            r9 = r0
        L8c:
            r0 = r13
            r1 = r9
            com.bilibili.pegasus.holders.bannerv8.items.h.b(r0, r1)
            r0 = r13
            android.view.View r0 = r0.itemView
            int r0 = r0.getHeight()
            if (r0 == 0) goto Laf
            r0 = r8
            r1 = r13
            r2 = r11
            r3 = r13
            android.view.View r3 = r3.itemView
            int r3 = r3.getHeight()
            r0.b(r1, r2, r3)
            goto Lc6
        Laf:
            r0 = r13
            android.view.View r0 = r0.itemView
            r9 = r0
            r0 = r9
            com.bilibili.pegasus.holders.bannerv8.items.l r1 = new com.bilibili.pegasus.holders.bannerv8.items.l
            r2 = r1
            r3 = r9
            r4 = r8
            r5 = r13
            r6 = r11
            r2.<init>(r3, r4, r5, r6)
            androidx.core.view.OneShotPreDrawListener r0 = androidx.core.view.OneShotPreDrawListener.add(r0, r1)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.bannerv8.items.j.onBindViewHolder(java.lang.Object, androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.fragment.app.Fragment, com.bilibili.app.comm.list.widget.banneradapter.BannerController):void");
    }

    public final void onWindowSizeChanged(RecyclerView.ViewHolder viewHolder, WindowSizeClass windowSizeClass) {
        a aVar = (a) viewHolder;
        super.onWindowSizeChanged(aVar, windowSizeClass);
        aVar.f77775c.setTextSize(FontSizeStrategy.INLINE_CARD_TITLE.get(windowSizeClass));
    }
}
