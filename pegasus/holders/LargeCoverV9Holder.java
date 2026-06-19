package com.bilibili.pegasus.holders;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4862g0;
import bp0.C5143a;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.common.data.LikeButtonItemV2;
import com.bilibili.app.comm.list.common.inline.InlineTripleGuideHelper;
import com.bilibili.app.comm.list.common.inline.InlineTripleLikeTask;
import com.bilibili.app.comm.list.common.inline.panel.UgcInlinePanel;
import com.bilibili.app.comm.list.common.inline.serviceV2.InlineUGCHistoryServiceV2;
import com.bilibili.app.comm.list.common.inline.view.InlineGestureSeekBarContainer;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTask;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTaskScheduler;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.app.comm.list.widget.image.ListPlaceHolderImageView;
import com.bilibili.app.comm.list.widget.tag.base.IImageTag;
import com.bilibili.app.comm.list.widget.tag.tagtinttext.TagSpanTextView;
import com.bilibili.app.comm.list.widget.tag.tagtinttext.TagTintTextView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.inline.biz.live.InlineToastTask;
import com.bilibili.inline.card.DefaultInlineProperty;
import com.bilibili.inline.card.PlayReason;
import com.bilibili.inline.control.IInlineControl;
import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.inline.panel.listeners.PanelDetachListener;
import com.bilibili.inline.plugin.DefaultCardPlayBehaviorWrap;
import com.bilibili.inline.utils.InlineExtensionKt;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.pegasus.HolderVisibleState;
import com.bilibili.pegasus.PegasusHolderData;
import com.bilibili.pegasus.common.inline.InterfaceC5583b;
import com.bilibili.pegasus.common.inline.l;
import com.bilibili.pegasus.data.base.BasePegasusData;
import com.bilibili.pegasus.data.base.BasePegasusPlayerData;
import com.bilibili.pegasus.data.component.DescButtonData;
import com.bilibili.pegasus.ext.router.SpecialSpmidType;
import com.bilibili.pegasus.ext.view.TagExtKt;
import com.bilibili.playerbizcommon.features.network.VideoEnvironment;
import java.util.List;
import jp0.C7716a;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import op0.C8250b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pp0.C8339C;
import pp0.C8340D;
import qp0.C8476b;
import sp0.C8614c;
import sp0.C8615d;
import tv.danmaku.bili.widget.FixedPopupAnchor;
import tv.danmaku.video.bilicardplayer.ICardPlayerContext;
import tv.danmaku.video.bilicardplayer.player.BiliCardPlayerScene;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/LargeCoverV9Holder.class */
@StabilityInferred(parameters = 0)
public final class LargeCoverV9Holder extends AbstractC5656f<fp0.m, UgcInlinePanel> implements InterfaceC5583b<fp0.m> {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f77583F = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final a f77584A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final b f77585B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @Nullable
    public com.bilibili.pegasus.common.n f77586C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final com.bilibili.biligame.ui.home.f f77587D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final com.bilibili.bililive.biz.livehome.indexfeed.ui.live.home.banner.items.e f77588E;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final C4862g0 f77589k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Lazy f77590l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Lazy f77591m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Lazy f77592n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Lazy f77593o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Lazy f77594p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Lazy f77595q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Lazy f77596r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Lazy f77597s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final aq0.S0 f77598t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Jh.q f77599u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final Lazy f77600v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final Lazy f77601w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Lazy f77602x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final Lazy f77603y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public com.bilibili.pegasus.common.inline.l<fp0.m> f77604z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/LargeCoverV9Holder$a.class */
    public static final class a implements l.a<fp0.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LargeCoverV9Holder f77605a;

        public a(LargeCoverV9Holder largeCoverV9Holder) {
            this.f77605a = largeCoverV9Holder;
        }

        @Override // com.bilibili.pegasus.common.inline.l.a
        public final void a() {
            LikeButtonItemV2 likeButton;
            LargeCoverV9Holder largeCoverV9Holder = this.f77605a;
            fp0.m mVar = (fp0.m) largeCoverV9Holder.getBindData();
            if (mVar == null || (likeButton = mVar.getLikeButton()) == null || likeButton.isSelected()) {
                return;
            }
            com.bilibili.pegasus.common.inline.v.f(largeCoverV9Holder.D0(), likeButton, (BasePegasusData) largeCoverV9Holder.getBindData(), 4);
        }

        @Override // com.bilibili.pegasus.common.inline.l.a
        public final void b(BasePegasusPlayerData basePegasusPlayerData) {
            Neurons.reportClick(false, "tm.recommend.inline.triplelike.click", C8340D.d((fp0.m) basePegasusPlayerData));
        }

        @Override // com.bilibili.pegasus.common.inline.l.a
        public final void c(BasePegasusPlayerData basePegasusPlayerData) {
            LikeButtonItemV2 likeButton;
            LikeButtonItemV2 likeButton2;
            fp0.m mVar = (fp0.m) basePegasusPlayerData;
            LargeCoverV9Holder largeCoverV9Holder = this.f77605a;
            fp0.m mVar2 = (fp0.m) largeCoverV9Holder.getBindData();
            if (mVar2 == null || mVar.getAid() != mVar2.getAid()) {
                return;
            }
            com.bilibili.pegasus.common.inline.v vVarD0 = largeCoverV9Holder.D0();
            fp0.m mVar3 = (fp0.m) largeCoverV9Holder.getBindData();
            boolean zIsSelected = (mVar3 == null || (likeButton2 = mVar3.getLikeButton()) == null) ? false : likeButton2.isSelected();
            fp0.m mVar4 = (fp0.m) largeCoverV9Holder.getBindData();
            vVarD0.e((mVar4 == null || (likeButton = mVar4.getLikeButton()) == null) ? null : likeButton.getFormatCount(), zIsSelected);
            largeCoverV9Holder.F0(mVar.getAid());
        }

        @Override // com.bilibili.pegasus.common.inline.l.a
        public final void d(BasePegasusPlayerData basePegasusPlayerData) {
            ((InlineTripleGuideHelper) this.f77605a.f77600v.getValue()).stopInlineTripleGuideAnim();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/LargeCoverV9Holder$b.class */
    public static final class b implements PanelDetachListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LargeCoverV9Holder f77606a;

        public b(LargeCoverV9Holder largeCoverV9Holder) {
            this.f77606a = largeCoverV9Holder;
        }

        public final void onDetach(InlinePanel inlinePanel) {
            InlineGestureSeekBarContainer inlineGestureSeekBarContainerC0 = this.f77606a.C0();
            inlineGestureSeekBarContainerC0.resetProgress();
            inlineGestureSeekBarContainerC0.setVisibility(8);
            inlinePanel.removeOnDetachListener(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LargeCoverV9Holder(@NotNull C4862g0 c4862g0) {
        super(c4862g0.f54043a);
        this.f77589k = c4862g0;
        Lazy lazyLazyUnsafe = ListExtentionsKt.lazyUnsafe(new H9.f(this, 5));
        this.f77590l = lazyLazyUnsafe;
        this.f77591m = ListExtentionsKt.lazyUnsafe(new com.bilibili.bililive.room.ui.matchcard.d(this, 1));
        this.f77592n = ListExtentionsKt.lazyUnsafe(new C5143a(this, 1));
        this.f77593o = ListExtentionsKt.lazyUnsafe(new PY0.h0(this, 3));
        this.f77594p = ListExtentionsKt.lazyUnsafe(new Rr0.c(this, 3));
        this.f77595q = ListExtentionsKt.lazyUnsafe(new Rr0.d(this, 5));
        this.f77596r = ListExtentionsKt.lazyUnsafe(new Da0.h(this, 1));
        this.f77597s = ListExtentionsKt.lazyUnsafe(new H61.e(this, 4));
        aq0.S0 s02 = c4862g0.f54045c;
        this.f77598t = s02;
        this.f77599u = Jh.q.bind(s02.f53856a);
        this.f77600v = ListExtentionsKt.lazyUnsafe(new Rr0.f(this, 5));
        this.f77601w = ListExtentionsKt.lazyUnsafe(new Function0(this) { // from class: com.bilibili.pegasus.holders.x0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LargeCoverV9Holder f78110a;

            {
                this.f78110a = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.pegasus.BasePegasusHolder, com.bilibili.pegasus.holders.LargeCoverV9Holder, java.lang.Object] */
            public final Object invoke() {
                ?? r02 = this.f78110a;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) r02.itemView.findViewById(2131315642);
                TintImageView tintImageView = (TintImageView) r02.f77596r.getValue();
                TintTextView tintTextView = (TintTextView) r02.f77597s.getValue();
                LargeCoverV9Holder$mInlineLikeButtonHelper$2$1 largeCoverV9Holder$mInlineLikeButtonHelper$2$1 = new LargeCoverV9Holder$mInlineLikeButtonHelper$2$1(r02);
                Fragment fragment = r02.getFragment();
                return new com.bilibili.pegasus.common.inline.v(lottieAnimationView, tintImageView, tintTextView, largeCoverV9Holder$mInlineLikeButtonHelper$2$1, fragment != null ? fragment.getLifecycle() : null);
            }
        });
        this.f77602x = ListExtentionsKt.lazyUnsafe(new com.bilibili.biligame.ui.home.d(this, 3));
        this.f77603y = ListExtentionsKt.lazyUnsafe(new com.bilibili.biligame.ui.home.e(this, 2));
        this.f77584A = new a(this);
        this.f77585B = new b(this);
        this.f77587D = new com.bilibili.biligame.ui.home.f(this, 1);
        this.f77588E = new com.bilibili.bililive.biz.livehome.indexfeed.ui.live.home.banner.items.e(this, 2);
        ((ViewStub) lazyLazyUnsafe.getValue()).setVisibility(0);
        this.itemView.setOnClickListener(new ViewOnClickListenerC5699t0(this, 0));
        ViewOnLongClickListenerC5701u0 viewOnLongClickListenerC5701u0 = new ViewOnLongClickListenerC5701u0(this, 0);
        ListPlaceHolderImageView listPlaceHolderImageView = c4862g0.f54044b;
        listPlaceHolderImageView.setOnLongClickListener(viewOnLongClickListenerC5701u0);
        this.itemView.setOnLongClickListener(viewOnLongClickListenerC5701u0);
        z0().setOnLongClickListener(viewOnLongClickListenerC5701u0);
        listPlaceHolderImageView.setOnClickListener(new bp.h(this, 2));
        E0().setOnClickListener(new bp.i(this, 3));
        E0().setOnLongClickListener(new ViewOnLongClickListenerC5703v0(this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final InlineGestureSeekBarContainer C0() {
        this.f77589k.f54046d.setVisibility(0);
        InlineGestureSeekBarContainer inlineGestureSeekBarContainerFindViewById = this.itemView.findViewById(2131303684);
        fp0.m mVar = (fp0.m) getBindData();
        inlineGestureSeekBarContainerFindViewById.setProgressBarData(mVar != null ? mVar.getInlineProgressBar() : null);
        return inlineGestureSeekBarContainerFindViewById;
    }

    public final com.bilibili.pegasus.common.inline.v D0() {
        return (com.bilibili.pegasus.common.inline.v) this.f77601w.getValue();
    }

    public final FixedPopupAnchor E0() {
        return (FixedPopupAnchor) this.f77595q.getValue();
    }

    public final void F0(long j7) {
        com.bilibili.pegasus.common.n nVar;
        fp0.m mVar = (fp0.m) getBindData();
        if (mVar == null || j7 != mVar.getAid() || (nVar = this.f77586C) == null) {
            return;
        }
        nVar.updateRepositoryData(mVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.pegasus.holders.AbstractC5656f, com.bilibili.pegasus.holders.AbstractC5652d
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public final void u0(@NotNull final fp0.m mVar) {
        super.u0(mVar);
        z0().setOnLongClickListener(new View.OnLongClickListener(this) { // from class: com.bilibili.pegasus.holders.w0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LargeCoverV9Holder f78109a;

            {
                this.f78109a = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                LargeCoverV9Holder largeCoverV9Holder = this.f78109a;
                rp0.p.c(largeCoverV9Holder, true, ListExtentionsKt.getGlobalRect(largeCoverV9Holder.E0()));
                return true;
            }
        });
        View view = this.itemView;
        String talkBack = mVar.getTalkBack();
        if (talkBack == null) {
            talkBack = mVar.getTitle();
        }
        view.setContentDescription(talkBack);
        ((DefaultCardPlayBehaviorWrap) this.f77603y.getValue()).reset(this);
        ((InlineUGCHistoryServiceV2) this.f77602x.getValue()).reset(mVar.getUri());
        fp0.m mVar2 = (fp0.m) getBindData();
        aq0.S0 s02 = this.f77598t;
        if (mVar2 != null) {
            C7716a c7716aJ = mVar2.j();
            if (c7716aJ == null) {
                s02.f53860e.setVisibility(8);
                C8614c.h(mVar2.getAvatar(), s02.f53862g, this.itemView, mVar2.isAtten(), mVar2.getOfficialIconV2());
            } else {
                s02.f53862g.setVisibility(8);
                TagExtKt.displayBadge(s02.f53860e, c7716aJ);
            }
        }
        C4862g0 c4862g0 = this.f77589k;
        C8614c.d(c4862g0.f54044b, mVar.getCover(), s02.f53859d, null, 8);
        Jh.q qVar = this.f77599u;
        ListExtentionsKt.setTextWithIcon$default(qVar.c, mVar.getCoverLeftText1(), mVar.getCoverLeftIcon1(), R$color.Wh0_u, 0.0f, 0.0f, 48, (Object) null);
        ListExtentionsKt.setTextWithIcon$default(qVar.d, mVar.getCoverLeftText2(), mVar.getCoverLeftIcon2(), R$color.Wh0_u, 0.0f, 0.0f, 48, (Object) null);
        ListExtentionsKt.setText(s02.f53858c, mVar.getCoverRightText());
        boolean zF = mVar.f();
        Lazy lazy = this.f77591m;
        Lazy lazy2 = this.f77594p;
        Lazy lazy3 = this.f77593o;
        Lazy lazy4 = this.f77592n;
        if (zF) {
            ((TagTintTextView) lazy4.getValue()).setVisibility(0);
            ((TextView) lazy2.getValue()).setVisibility(0);
            TintTextView tintTextView = (TintTextView) lazy3.getValue();
            DescButtonData descButton = mVar.getDescButton();
            String text = descButton != null ? descButton.getText() : null;
            tintTextView.setVisibility((text == null || StringsKt.isBlank(text)) ? 8 : 0);
            ((TagSpanTextView) lazy.getValue()).setVisibility(8);
            H0(mVar);
            TagTintTextView tagTintTextView = (TagTintTextView) lazy4.getValue();
            jp0.e eVarG = mVar.g();
            IImageTag imageTag$default = TagExtKt.toImageTag$default(mVar.g(), 0, 3, true, 1, null);
            IImageTag imageTag = imageTag$default;
            if (imageTag$default == null) {
                imageTag = TagExtKt.toImageTag(mVar.h());
            }
            TagExtKt.displayTag$default(tagTintTextView, eVarG, null, new com.bilibili.biligame.ui.home.dialog.a(this, 5), false, false, false, null, imageTag, null, true, 378, null);
            TintTextView tintTextView2 = (TintTextView) lazy3.getValue();
            DescButtonData descButton2 = mVar.getDescButton();
            tintTextView2.setText(descButton2 != null ? descButton2.getText() : null);
            ((TagTintTextView) lazy4.getValue()).setOnClickListener(new ViewOnClickListenerC5711z0(0, mVar, this));
            ((TintTextView) lazy3.getValue()).setOnClickListener(new A0(0, this, mVar));
        } else {
            ((TintTextView) lazy3.getValue()).setVisibility(8);
            ((TagTintTextView) lazy4.getValue()).setVisibility(8);
            ((TextView) lazy2.getValue()).setVisibility(8);
            ((TagSpanTextView) lazy.getValue()).setVisibility(0);
            H0(mVar);
        }
        final LikeButtonItemV2 likeButton = mVar.getLikeButton();
        Lazy lazy5 = this.f77596r;
        if (likeButton == null) {
            D0().a();
        } else {
            Lazy lazy6 = C8476b.f126257a;
            String strB = C8476b.b(SpecialSpmidType.DEFAULT);
            com.bilibili.pegasus.common.inline.v.d(D0(), likeButton, mVar, strB, strB);
            ((TintImageView) lazy5.getValue()).setOnClickListener(new View.OnClickListener(this, likeButton, mVar) { // from class: com.bilibili.pegasus.holders.y0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final LargeCoverV9Holder f78111a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final LikeButtonItemV2 f78112b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final fp0.m f78113c;

                {
                    this.f78111a = this;
                    this.f78112b = likeButton;
                    this.f78113c = mVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LargeCoverV9Holder largeCoverV9Holder = this.f78111a;
                    com.bilibili.pegasus.common.inline.v.f(largeCoverV9Holder.D0(), this.f78112b, this.f78113c, 4);
                }
            });
        }
        x0(E0());
        com.bilibili.pegasus.common.inline.v vVarD0 = D0();
        LikeButtonItemV2 likeButton2 = mVar.getLikeButton();
        boolean zIsSelected = likeButton2 != null ? likeButton2.isSelected() : false;
        LikeButtonItemV2 likeButton3 = mVar.getLikeButton();
        String formatCount = null;
        if (likeButton3 != null) {
            formatCount = likeButton3.getFormatCount();
        }
        vVarD0.e(formatCount, zIsSelected);
        com.bilibili.pegasus.common.inline.l<fp0.m> lVar = new com.bilibili.pegasus.common.inline.l<>(mVar, (LottieAnimationView) this.itemView.findViewById(2131313890), (TintImageView) lazy5.getValue(), true);
        lVar.f75575d = this.f77584A;
        this.f77604z = lVar;
        ListPlaceHolderImageView listPlaceHolderImageView = c4862g0.f54044b;
        PlayerArgs playerArgs = mVar.getPlayerArgs();
        boolean z6 = false;
        if (playerArgs != null) {
            z6 = playerArgs.hidePlayButton;
        }
        listPlaceHolderImageView.showPlaceHolderInnerDrawable(z6);
    }

    public final void H0(fp0.m mVar) {
        String translatedText;
        String title = (!Intrinsics.areEqual(mVar.getTranslatedStatus(), "TRANSLATED") || (translatedText = mVar.getTranslatedText()) == null || StringsKt.isBlank(translatedText)) ? mVar.getTitle() : mVar.getTranslatedText();
        if (mVar.f()) {
            ((TextView) this.f77594p.getValue()).setText(title);
        } else {
            TagExtKt.displaySpanTag$default((TagSpanTextView) this.f77591m.getValue(), mVar.g(), title, new H60.F(1, this, title), false, false, false, null, mVar.h(), C8614c.f127321c, 0, 0, 1656, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean S() {
        /*
            r3 = this;
            r0 = r3
            P extends com.bilibili.inline.panel.InlinePanel r0 = r0.f77861g
            com.bilibili.app.comm.list.common.inline.panel.UgcInlinePanel r0 = (com.bilibili.app.comm.list.common.inline.panel.UgcInlinePanel) r0
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L41
            r0 = r6
            com.bilibili.app.comm.list.common.inline.widgetV3.InlineDanmakuWidgetV3 r0 = r0.getDanmaku()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L41
            r0 = r6
            boolean r0 = r0.isVisible()
            r5 = r0
            r0 = 1
            r4 = r0
            r0 = r5
            r1 = 1
            if (r0 != r1) goto L41
            r0 = r3
            P extends com.bilibili.inline.panel.InlinePanel r0 = r0.f77861g
            com.bilibili.app.comm.list.common.inline.panel.UgcInlinePanel r0 = (com.bilibili.app.comm.list.common.inline.panel.UgcInlinePanel) r0
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L41
            r0 = r6
            com.bilibili.app.comm.list.common.inline.widgetV3.InlineDanmakuWidgetV3 r0 = r0.getDanmaku()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L41
            r0 = r6
            boolean r0 = r0.isSelected()
            r1 = 1
            if (r0 != r1) goto L41
            goto L43
        L41:
            r0 = 0
            r4 = r0
        L43:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.LargeCoverV9Holder.S():boolean");
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final void a(boolean z6) {
        IInlineControl inlineControl;
        ICardPlayerContext cardPlayerContext;
        if (z6) {
            UgcInlinePanel ugcInlinePanel = this.f77861g;
            if (((ugcInlinePanel == null || (cardPlayerContext = ugcInlinePanel.getCardPlayerContext()) == null) ? null : cardPlayerContext.getVideoEnvironment()) == VideoEnvironment.MOBILE_DATA) {
                PlayReason playReason = PlayReason.INLINE_MANUAL_PLAY;
                fp0.m mVar = (fp0.m) getBindData();
                PlayReason playReason2 = null;
                if (mVar != null) {
                    DefaultInlineProperty defaultInlineProperty = mVar.f118867a1;
                    playReason2 = null;
                    if (defaultInlineProperty != null) {
                        playReason2 = defaultInlineProperty.getPlayReason();
                    }
                }
                if (playReason == playReason2 || (inlineControl = getInlineControl()) == null) {
                    return;
                }
                inlineControl.stopPlay(this);
            }
        }
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final void c(long j7, boolean z6) {
        fp0.m mVar = (fp0.m) getBindData();
        if (mVar != null && j7 == mVar.getAid()) {
            mVar.setFav(z6);
            F0(j7);
        }
    }

    @NotNull
    public final BiliCardPlayerScene.CardPlayTask configCustomTaskBehavior(@NotNull BiliCardPlayerScene.CardPlayTask cardPlayTask, boolean z6) {
        fp0.m mVar = (fp0.m) getBindData();
        if (mVar == null) {
            return cardPlayTask;
        }
        InlineExtensionKt.addHistoryPlugin(cardPlayTask, (InlineUGCHistoryServiceV2) this.f77602x.getValue());
        InlineExtensionKt.addInlineBehavior(cardPlayTask, (DefaultCardPlayBehaviorWrap) this.f77603y.getValue());
        C8250b.b(cardPlayTask, z6);
        cardPlayTask.setChronosEnable(true);
        cardPlayTask.enablePreload(((Boolean) tv.danmaku.biliplayer.preload.strategy.a.b.getValue()).booleanValue());
        com.bilibili.pegasus.common.n nVar = new com.bilibili.pegasus.common.n(mVar);
        nVar.setVideoStateCallback(this.f77587D);
        nVar.setFollowStateCallback(this.f77588E);
        cardPlayTask.setTaskRepository(nVar);
        this.f77586C = nVar;
        return cardPlayTask;
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final boolean d() {
        fp0.m mVar = (fp0.m) getBindData();
        boolean z6 = false;
        if (mVar != null) {
            z6 = false;
            if (mVar.getShareMenuEnable()) {
                z6 = true;
            }
        }
        return z6;
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final BasePegasusPlayerData getData() {
        return (fp0.m) getBindData();
    }

    @NotNull
    public final Class<? extends UgcInlinePanel> getPanelType() {
        return UgcInlinePanel.class;
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final float getPlaySpeed() {
        ICardPlayerContext cardPlayerContext;
        UgcInlinePanel ugcInlinePanel = this.f77861g;
        return (ugcInlinePanel == null || (cardPlayerContext = ugcInlinePanel.getCardPlayerContext()) == null) ? -1.0f : cardPlayerContext.getPlaySpeed();
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final int getPlayerState() {
        ICardPlayerContext cardPlayerContext;
        UgcInlinePanel ugcInlinePanel = this.f77861g;
        return (ugcInlinePanel == null || (cardPlayerContext = ugcInlinePanel.getCardPlayerContext()) == null) ? 0 : cardPlayerContext.getPlayerState();
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final boolean isFavorite() {
        fp0.m mVar = (fp0.m) getBindData();
        boolean z6 = false;
        if (mVar != null) {
            z6 = false;
            if (mVar.isFav()) {
                z6 = true;
            }
        }
        return z6;
    }

    public final void onBind(PegasusHolderData pegasusHolderData, List list) {
        fp0.m mVar = (fp0.m) pegasusHolderData;
        if (list.contains("PAYLOAD_UPDATE_TRANSLATE")) {
            H0(mVar);
        } else {
            super/*com.bilibili.pegasus.PegasusHolder*/.onBind(mVar, list);
        }
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5656f
    public final void onBindPanel(InlinePanel inlinePanel) {
        UgcInlinePanel ugcInlinePanel = (UgcInlinePanel) inlinePanel;
        super.onBindPanel(ugcInlinePanel);
        fp0.m mVar = (fp0.m) getBindData();
        if (mVar == null) {
            return;
        }
        ugcInlinePanel.resetFromType("large_cover_v9");
        C8339C.g(ugcInlinePanel, mVar);
        ugcInlinePanel.getMute().setSupportGuidance(true);
        ugcInlinePanel.getAvatar().displayAvatar(mVar.getPendantAvatar());
        if (mVar.getHideDanmakuSwitch()) {
            ugcInlinePanel.getDanmaku().setVisible(false);
            ugcInlinePanel.getDanmaku().setVisibility(8);
        } else {
            ugcInlinePanel.getDanmaku().setVisible(true);
            ugcInlinePanel.getDanmaku().setVisibility(0);
        }
        C8615d.a(ugcInlinePanel.getCoverLeftText1(), mVar.getCoverLeftText1(), mVar.getCoverLeftIcon1());
        C8615d.a(ugcInlinePanel.getCoverLeftText2(), mVar.getCoverLeftText2(), mVar.getCoverLeftIcon2());
        InlineGestureSeekBarContainer inlineGestureSeekBarContainerC0 = C0();
        inlineGestureSeekBarContainerC0.setVisibility(0);
        inlineGestureSeekBarContainerC0.resetProgress();
        ugcInlinePanel.getGestureSeekWidget().setGestureSeekBarContainer(inlineGestureSeekBarContainerC0);
        ugcInlinePanel.setOnClickListener(new com.bilibili.bililive.room.ui.matchcard.g(this, 1));
        ugcInlinePanel.setOnLongClickListener(new H9.c(this, 2));
        ugcInlinePanel.addOnDetachListener(this.f77585B);
        InlineTask inlineTripleLikeTask = new InlineTripleLikeTask(new com.bilibili.lib.accounts.x(this, 1), new com.bilibili.ad.adview.videodetail.endpage.cards.j(this, 2));
        InlineTask inlineToastTask = new InlineToastTask(ugcInlinePanel);
        ((InlineTripleGuideHelper) this.f77600v.getValue()).getTranslateAnim().setAnimationListener(inlineTripleLikeTask.getAnimationListener());
        ugcInlinePanel.getInline4GWarningWidget().setDependsOn(CollectionsKt.listOf(new String[]{"TASK_TRIPLE_LIKE", "TASK_SEEK_GUIDE"}));
        new InlineTaskScheduler(CollectionsKt.listOf(new InlineTask[]{inlineTripleLikeTask, ugcInlinePanel.getInline4GWarningWidget(), ugcInlinePanel.getSeekGuideWidget(), inlineToastTask})).execute();
    }

    /* JADX INFO: renamed from: onHolderVisibleStateChanged-9yN0R78, reason: not valid java name */
    public final void m8112onHolderVisibleStateChanged9yN0R78(int i7, int i8) {
        super/*com.bilibili.pegasus.PegasusHolder*/.onHolderVisibleStateChanged-9yN0R78(i7, i8);
        if (HolderVisibleState.getAllVisible-impl(i8)) {
            return;
        }
        IInlineControl inlineControl = getInlineControl();
        if (inlineControl != null) {
            inlineControl.stopPlay(this);
        }
        ((InlineTripleGuideHelper) this.f77600v.getValue()).stopInlineTripleGuideAnim();
        com.bilibili.pegasus.common.inline.l<fp0.m> lVar = this.f77604z;
        com.bilibili.pegasus.common.inline.l<fp0.m> lVar2 = lVar;
        if (lVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tripleLikeHelper");
            lVar2 = null;
        }
        lVar2.f75573b.removeAllAnimatorListeners();
        lVar2.f75573b.cancelAnimation();
    }

    public final void onPageScrollStateChanged(@NotNull RecyclerView recyclerView, int i7) {
        UgcInlinePanel ugcInlinePanel;
        super/*com.bilibili.pegasus.PegasusHolder*/.onPageScrollStateChanged(recyclerView, i7);
        if (i7 != 1 || (ugcInlinePanel = this.f77861g) == null) {
            return;
        }
        ugcInlinePanel.showWidgets();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final void setPlaySpeed(float f7) {
        ICardPlayerContext cardPlayerContext;
        PromoToast.showMidToast(this.itemView.getContext(), f7 + "X");
        UgcInlinePanel ugcInlinePanel = this.f77861g;
        if (ugcInlinePanel == null || (cardPlayerContext = ugcInlinePanel.getCardPlayerContext()) == null) {
            return;
        }
        cardPlayerContext.setPlaySpeed(f7);
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final long w() {
        ICardPlayerContext cardPlayerContext;
        UgcInlinePanel ugcInlinePanel = this.f77861g;
        return (ugcInlinePanel == null || (cardPlayerContext = ugcInlinePanel.getCardPlayerContext()) == null) ? 0L : cardPlayerContext.getCurrentPosition();
    }
}
