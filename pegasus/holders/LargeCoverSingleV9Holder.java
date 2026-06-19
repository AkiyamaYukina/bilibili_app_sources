package com.bilibili.pegasus.holders;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.material3.C4196s4;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.common.data.LikeButtonItemV2;
import com.bilibili.app.comm.list.common.inline.InlineTripleGuideHelper;
import com.bilibili.app.comm.list.common.inline.InlineTripleLikeTask;
import com.bilibili.app.comm.list.common.inline.SingleColumnInlineProperty;
import com.bilibili.app.comm.list.common.inline.panel.UgcInlinePanel;
import com.bilibili.app.comm.list.common.inline.serviceV2.InlineUGCHistoryServiceV2;
import com.bilibili.app.comm.list.common.inline.view.InlineGestureSeekBarContainer;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTask;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTaskScheduler;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.app.comm.list.widget.image.ListPlaceHolderImageView;
import com.bilibili.app.comm.list.widget.play.CardFragmentPlayerContainerLayout;
import com.bilibili.app.comm.list.widget.utils.ListConstKt;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.inline.biz.live.InlineToastTask;
import com.bilibili.inline.card.PlayReason;
import com.bilibili.inline.control.IInlineControl;
import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.inline.panel.listeners.PanelDetachListener;
import com.bilibili.inline.plugin.DefaultCardPlayBehaviorWrap;
import com.bilibili.inline.utils.InlineExtensionKt;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.pegasus.HolderVisibleState;
import com.bilibili.pegasus.PegasusHolderData;
import com.bilibili.pegasus.common.inline.InterfaceC5583b;
import com.bilibili.pegasus.common.inline.l;
import com.bilibili.pegasus.data.base.BasePegasusData;
import com.bilibili.pegasus.data.base.BasePegasusPlayerData;
import com.bilibili.pegasus.data.component.AvatarData;
import com.bilibili.pegasus.ext.router.SpecialSpmidType;
import com.bilibili.pegasus.ext.view.TagExtKt;
import com.bilibili.pegasus.widget.CardFragmentWithScrollContainer;
import com.bilibili.playerbizcommon.features.network.VideoEnvironment;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import op0.C8249a;
import op0.C8250b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pp0.C8339C;
import pp0.C8340D;
import qp0.C8476b;
import sp0.C8614c;
import sp0.C8615d;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.PendantAvatarFrameLayout;
import tv.danmaku.bili.widget.VectorTextView;
import tv.danmaku.video.bilicardplayer.ICardPlayerContext;
import tv.danmaku.video.bilicardplayer.player.BiliCardPlayerScene;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/LargeCoverSingleV9Holder.class */
@StabilityInferred(parameters = 0)
public final class LargeCoverSingleV9Holder extends AbstractC5656f<fp0.j, UgcInlinePanel> implements InterfaceC5583b<fp0.j> {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f77546z = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final aq0.D0 f77547k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Lazy f77548l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final VectorTextView f77549m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final VectorTextView f77550n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final VectorTextView f77551o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Lazy f77552p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Lazy f77553q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public com.bilibili.pegasus.common.inline.l<fp0.j> f77554r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final a f77555s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Lazy f77556t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Lazy f77557u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public com.bilibili.pegasus.common.n f77558v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final C4196s4 f77559w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final com.bilibili.app.comm.aphro.preview.page.f f77560x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final b f77561y;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/LargeCoverSingleV9Holder$a.class */
    public static final class a implements l.a<fp0.j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LargeCoverSingleV9Holder f77562a;

        public a(LargeCoverSingleV9Holder largeCoverSingleV9Holder) {
            this.f77562a = largeCoverSingleV9Holder;
        }

        @Override // com.bilibili.pegasus.common.inline.l.a
        public final void a() {
            LikeButtonItemV2 likeButton;
            LargeCoverSingleV9Holder largeCoverSingleV9Holder = this.f77562a;
            fp0.j jVar = (fp0.j) largeCoverSingleV9Holder.getBindData();
            if (jVar == null || (likeButton = jVar.getLikeButton()) == null || likeButton.isSelected()) {
                return;
            }
            com.bilibili.pegasus.common.inline.v.f(largeCoverSingleV9Holder.E0(), likeButton, (BasePegasusData) largeCoverSingleV9Holder.getBindData(), 4);
        }

        @Override // com.bilibili.pegasus.common.inline.l.a
        public final void b(BasePegasusPlayerData basePegasusPlayerData) {
            Neurons.reportClick(false, "tm.recommend.inline.triplelike.click", C8340D.d((fp0.j) basePegasusPlayerData));
        }

        @Override // com.bilibili.pegasus.common.inline.l.a
        public final void c(BasePegasusPlayerData basePegasusPlayerData) {
            fp0.j jVar = (fp0.j) basePegasusPlayerData;
            LargeCoverSingleV9Holder largeCoverSingleV9Holder = this.f77562a;
            fp0.j jVar2 = (fp0.j) largeCoverSingleV9Holder.getBindData();
            if (jVar2 != null && jVar.getAid() == jVar2.getAid()) {
                com.bilibili.pegasus.common.inline.v vVarE0 = largeCoverSingleV9Holder.E0();
                LikeButtonItemV2 likeButton = jVar2.getLikeButton();
                boolean zIsSelected = likeButton != null ? likeButton.isSelected() : false;
                LikeButtonItemV2 likeButton2 = jVar2.getLikeButton();
                vVarE0.e(likeButton2 != null ? likeButton2.getFormatCount() : null, zIsSelected);
                largeCoverSingleV9Holder.F0(jVar.getAid());
            }
        }

        @Override // com.bilibili.pegasus.common.inline.l.a
        public final void d(BasePegasusPlayerData basePegasusPlayerData) {
            ((InlineTripleGuideHelper) this.f77562a.f77552p.getValue()).stopInlineTripleGuideAnim();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/LargeCoverSingleV9Holder$b.class */
    public static final class b implements PanelDetachListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LargeCoverSingleV9Holder f77563a;

        public b(LargeCoverSingleV9Holder largeCoverSingleV9Holder) {
            this.f77563a = largeCoverSingleV9Holder;
        }

        public final void onDetach(InlinePanel inlinePanel) {
            InlineGestureSeekBarContainer inlineGestureSeekBarContainerD0 = this.f77563a.D0();
            inlineGestureSeekBarContainerD0.resetProgress();
            inlineGestureSeekBarContainerD0.setVisibility(8);
            inlinePanel.removeOnDetachListener(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LargeCoverSingleV9Holder(@NotNull aq0.D0 d02) {
        super(d02.f53685a);
        this.f77547k = d02;
        this.f77548l = ListExtentionsKt.lazyUnsafe(new Function0(this) { // from class: com.bilibili.pegasus.holders.a0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LargeCoverSingleV9Holder f77661a;

            {
                this.f77661a = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.pegasus.BasePegasusHolder, com.bilibili.pegasus.holders.LargeCoverSingleV9Holder, java.lang.Object] */
            public final Object invoke() {
                ?? r02 = this.f77661a;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) r02.itemView.findViewById(2131315642);
                aq0.M0 m02 = r02.f77547k.f53690f;
                TintImageView tintImageView = m02.f53765f;
                LargeCoverSingleV9Holder$mInlineLikeButtonHelper$2$1 largeCoverSingleV9Holder$mInlineLikeButtonHelper$2$1 = new LargeCoverSingleV9Holder$mInlineLikeButtonHelper$2$1(r02);
                Fragment fragment = r02.getFragment();
                return new com.bilibili.pegasus.common.inline.v(lottieAnimationView, tintImageView, m02.h, largeCoverSingleV9Holder$mInlineLikeButtonHelper$2$1, fragment != null ? fragment.getLifecycle() : null);
            }
        });
        this.f77549m = this.itemView.findViewById(2131299631);
        this.f77550n = this.itemView.findViewById(2131299632);
        this.f77551o = this.itemView.findViewById(2131299649);
        this.f77552p = ListExtentionsKt.lazyUnsafe(new PX0.a0(this, 4));
        this.f77553q = ListExtentionsKt.lazyUnsafe(new FJ.d(8));
        this.f77555s = new a(this);
        this.f77556t = ListExtentionsKt.lazyUnsafe(new DV.b(this, 6));
        this.f77557u = ListExtentionsKt.lazyUnsafe(new Nj.u(this, 2));
        this.f77559w = new C4196s4(this, 2);
        this.f77560x = new com.bilibili.app.comm.aphro.preview.page.f(this, 1);
        final int i7 = 3;
        this.itemView.setOnClickListener(new View.OnClickListener(this, i7) { // from class: FF0.k

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f6073a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f6074b;

            {
                this.f6073a = i7;
                this.f6074b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:105:0x038b  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x009a  */
            /* JADX WARN: Removed duplicated region for block: B:192:0x06a8  */
            /* JADX WARN: Removed duplicated region for block: B:95:0x02c0  */
            /* JADX WARN: Type inference failed for: r0v273, types: [android.content.DialogInterface$OnClickListener, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v296, types: [com.bilibili.upper.module.contribute.up.dialog.VideoReplaceDialog$a, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v17, types: [android.content.DialogInterface$OnClickListener, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onClick(android.view.View r14) {
                /*
                    Method dump skipped, instruction units count: 2067
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: FF0.k.onClick(android.view.View):void");
            }
        });
        FF0.l lVar = new FF0.l(this, 4);
        ListPlaceHolderImageView listPlaceHolderImageView = d02.f53686b;
        listPlaceHolderImageView.setOnClickListener(lVar);
        aq0.M0 m02 = d02.f53690f;
        m02.f53767i.setOnClickListener(new T(this, 0));
        m02.f53767i.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: com.bilibili.pegasus.holders.b0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LargeCoverSingleV9Holder f77671a;

            {
                this.f77671a = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                LargeCoverSingleV9Holder largeCoverSingleV9Holder = this.f77671a;
                rp0.p.c(largeCoverSingleV9Holder, true, ListExtentionsKt.getGlobalRect(largeCoverSingleV9Holder.f77547k.f53690f.f53767i));
                return true;
            }
        });
        View.OnLongClickListener onLongClickListener = new View.OnLongClickListener(this) { // from class: com.bilibili.pegasus.holders.c0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LargeCoverSingleV9Holder f77843a;

            {
                this.f77843a = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                LargeCoverSingleV9Holder largeCoverSingleV9Holder = this.f77843a;
                rp0.p.c(largeCoverSingleV9Holder, true, ListExtentionsKt.getGlobalRect(largeCoverSingleV9Holder.f77547k.f53690f.f53767i));
                return true;
            }
        };
        listPlaceHolderImageView.setOnLongClickListener(onLongClickListener);
        this.itemView.setOnLongClickListener(onLongClickListener);
        z0().setOnLongClickListener(onLongClickListener);
        this.f77561y = new b(this);
    }

    public static int C0(boolean z6, Rect rect, RecyclerView.ViewHolder viewHolder, Rect rect2) {
        int iHeight;
        if (z6) {
            iHeight = rect.top - rect2.top;
        } else {
            iHeight = rect.top - (rect2.height() + (rect2.top - viewHolder.itemView.getHeight()));
        }
        return iHeight;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final InlineGestureSeekBarContainer D0() {
        this.f77547k.f53688d.setVisibility(0);
        InlineGestureSeekBarContainer inlineGestureSeekBarContainerFindViewById = this.itemView.findViewById(2131303684);
        fp0.j jVar = (fp0.j) getBindData();
        inlineGestureSeekBarContainerFindViewById.setProgressBarData(jVar != null ? jVar.getInlineProgressBar() : null);
        return inlineGestureSeekBarContainerFindViewById;
    }

    public final com.bilibili.pegasus.common.inline.v E0() {
        return (com.bilibili.pegasus.common.inline.v) this.f77548l.getValue();
    }

    public final void F0(long j7) {
        com.bilibili.pegasus.common.n nVar;
        fp0.j jVar = (fp0.j) getBindData();
        if (jVar == null || j7 != jVar.getAid() || (nVar = this.f77558v) == null) {
            return;
        }
        nVar.updateRepositoryData(jVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.pegasus.holders.AbstractC5656f, com.bilibili.pegasus.holders.AbstractC5652d
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public final void u0(@NotNull final fp0.j jVar) {
        super.u0(jVar);
        z0().setOnLongClickListener(new View.OnLongClickListener(this) { // from class: com.bilibili.pegasus.holders.U

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LargeCoverSingleV9Holder f77632a;

            {
                this.f77632a = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                LargeCoverSingleV9Holder largeCoverSingleV9Holder = this.f77632a;
                rp0.p.c(largeCoverSingleV9Holder, true, ListExtentionsKt.getGlobalRect(largeCoverSingleV9Holder.f77547k.f53690f.f53767i));
                return true;
            }
        });
        aq0.D0 d02 = this.f77547k;
        C8614c.d(d02.f53686b, jVar.getCover(), d02.f53687c.f54032b, null, 8);
        View view = this.itemView;
        String talkBack = jVar.getTalkBack();
        if (talkBack == null) {
            talkBack = jVar.getTitle();
        }
        view.setContentDescription(talkBack);
        ((DefaultCardPlayBehaviorWrap) this.f77557u.getValue()).reset(this);
        ((InlineUGCHistoryServiceV2) this.f77556t.getValue()).reset(jVar.getUri());
        ListExtentionsKt.setTextWithIcon$default(this.f77549m, jVar.getCoverLeftText1(), jVar.getCoverLeftIcon1(), R$color.Wh0_u, 0.0f, 0.0f, 48, (Object) null);
        ListExtentionsKt.setTextWithIcon$default(this.f77550n, jVar.getCoverLeftText2(), jVar.getCoverLeftIcon2(), R$color.Wh0_u, 0.0f, 0.0f, 48, (Object) null);
        ListExtentionsKt.setText(this.f77551o, jVar.getCoverRightText());
        H0();
        aq0.M0 m02 = d02.f53690f;
        TagExtKt.setMultiplyDesc(m02.f53761b, m02.f53763d, jVar.h(), jVar.f());
        PendantAvatarFrameLayout pendantAvatarFrameLayout = m02.f53762c;
        PendantAvatarFrameLayout.ShowParams showParams = new PendantAvatarFrameLayout.ShowParams();
        showParams.mode(1);
        showParams.defaultAvatar(2131237005);
        AvatarData avatar = jVar.getAvatar();
        showParams.avatarImgUrl(avatar != null ? avatar.getCover() : null);
        showParams.borderWidth(0.5f);
        showParams.borderColor(R$color.Ga2);
        showParams.mIsBadgeShow = Boolean.TRUE;
        showParams.badgeImgRes(ListConstKt.getIconRes((!jVar.isAtten() || jVar.g()) ? jVar.getOfficialIconV2() : 24));
        pendantAvatarFrameLayout.show(showParams);
        m02.f53762c.setOnClickListener(new View.OnClickListener(this, jVar) { // from class: com.bilibili.pegasus.holders.V

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LargeCoverSingleV9Holder f77633a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final fp0.j f77634b;

            {
                this.f77633a = this;
                this.f77634b = jVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C8249a.c(this.f77633a, this.f77634b);
            }
        });
        if (jVar.getLikeButton() == null) {
            E0().a();
        } else {
            Lazy lazy = C8476b.f126257a;
            String strB = C8476b.b(SpecialSpmidType.DEFAULT);
            com.bilibili.pegasus.common.inline.v.d(E0(), jVar.getLikeButton(), jVar, strB, strB);
            m02.f53765f.setOnClickListener(new View.OnClickListener(this, jVar) { // from class: com.bilibili.pegasus.holders.X

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final LargeCoverSingleV9Holder f77641a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final fp0.j f77642b;

                {
                    this.f77641a = this;
                    this.f77642b = jVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LargeCoverSingleV9Holder largeCoverSingleV9Holder = this.f77641a;
                    fp0.j jVar2 = this.f77642b;
                    com.bilibili.pegasus.common.inline.v.f(largeCoverSingleV9Holder.E0(), jVar2.getLikeButton(), jVar2, 4);
                }
            });
        }
        com.bilibili.pegasus.common.inline.v vVarE0 = E0();
        LikeButtonItemV2 likeButton = jVar.getLikeButton();
        boolean zIsSelected = likeButton != null ? likeButton.isSelected() : false;
        LikeButtonItemV2 likeButton2 = jVar.getLikeButton();
        String formatCount = null;
        if (likeButton2 != null) {
            formatCount = likeButton2.getFormatCount();
        }
        vVarE0.e(formatCount, zIsSelected);
        com.bilibili.pegasus.common.inline.l<fp0.j> lVar = new com.bilibili.pegasus.common.inline.l<>(jVar, (LottieAnimationView) this.itemView.findViewById(2131313890), m02.f53765f, true);
        lVar.f75575d = this.f77555s;
        this.f77554r = lVar;
        m02.f53767i.setVisibility(0);
        ListPlaceHolderImageView listPlaceHolderImageView = d02.f53686b;
        PlayerArgs playerArgs = jVar.getPlayerArgs();
        boolean z6 = false;
        if (playerArgs != null) {
            z6 = playerArgs.hidePlayButton;
        }
        listPlaceHolderImageView.showPlaceHolderInnerDrawable(z6);
    }

    public final void H0() {
        String translatedText;
        fp0.j jVar = (fp0.j) getBindData();
        if (jVar == null) {
            return;
        }
        String title = (!Intrinsics.areEqual(jVar.getTranslatedStatus(), "TRANSLATED") || (translatedText = jVar.getTranslatedText()) == null || StringsKt.isBlank(translatedText)) ? jVar.getTitle() : jVar.getTranslatedText();
        boolean zG = jVar.g();
        aq0.D0 d02 = this.f77547k;
        if (!zG) {
            TagExtKt.displaySpanTag$default(d02.f53690f.f53764e, jVar.k(), title, new com.bilibili.ogv.kmm.operation.schedule.z(1, this, title), false, false, false, null, jVar.l(), C8614c.f127321c, 0, 0, 1656, null);
            return;
        }
        TagExtKt.displaySpanTag$default(d02.f53690f.f53766g, jVar.k(), null, null, false, false, false, null, TagExtKt.toImageTag$default(jVar.k(), 0, 3, false, 5, null), null, 0, 0, 1918, null);
        final String str = title;
        TagExtKt.displaySpanTag$default(d02.f53690f.f53764e, null, title, new Function0(this, str) { // from class: com.bilibili.pegasus.holders.W

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LargeCoverSingleV9Holder f77637a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f77638b;

            {
                this.f77637a = this;
                this.f77638b = str;
            }

            public final Object invoke() {
                ListExtentionsKt.setText(this.f77637a.f77547k.f53690f.f53764e, this.f77638b);
                return Unit.INSTANCE;
            }
        }, false, false, false, null, jVar.l(), C8614c.f127321c, 0, 0, 1656, null);
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
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.LargeCoverSingleV9Holder.S():boolean");
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final void a(boolean z6) {
        IInlineControl inlineControl;
        ICardPlayerContext cardPlayerContext;
        if (z6) {
            UgcInlinePanel ugcInlinePanel = this.f77861g;
            if (((ugcInlinePanel == null || (cardPlayerContext = ugcInlinePanel.getCardPlayerContext()) == null) ? null : cardPlayerContext.getVideoEnvironment()) == VideoEnvironment.MOBILE_DATA) {
                PlayReason playReason = PlayReason.INLINE_MANUAL_PLAY;
                fp0.j jVar = (fp0.j) getBindData();
                PlayReason playReason2 = null;
                if (jVar != null) {
                    SingleColumnInlineProperty singleColumnInlineProperty = jVar.f118684Y0;
                    playReason2 = null;
                    if (singleColumnInlineProperty != null) {
                        playReason2 = singleColumnInlineProperty.getPlayReason();
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
        fp0.j jVar = (fp0.j) getBindData();
        if (jVar != null && j7 == jVar.getAid()) {
            jVar.setFav(z6);
            F0(j7);
        }
    }

    @NotNull
    public final BiliCardPlayerScene.CardPlayTask configCustomTaskBehavior(@NotNull BiliCardPlayerScene.CardPlayTask cardPlayTask, boolean z6) {
        InlineExtensionKt.addHistoryPlugin(cardPlayTask, (InlineUGCHistoryServiceV2) this.f77556t.getValue());
        InlineExtensionKt.addInlineBehavior(cardPlayTask, (DefaultCardPlayBehaviorWrap) this.f77557u.getValue());
        C8250b.b(cardPlayTask, z6);
        cardPlayTask.setChronosEnable(true);
        com.bilibili.pegasus.common.n nVar = new com.bilibili.pegasus.common.n((BasePegasusPlayerData) getBindData());
        nVar.setVideoStateCallback(this.f77559w);
        nVar.setFollowStateCallback(this.f77560x);
        cardPlayTask.setTaskRepository(nVar);
        this.f77558v = nVar;
        return cardPlayTask;
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final boolean d() {
        fp0.j jVar = (fp0.j) getBindData();
        boolean z6 = false;
        if (jVar != null) {
            z6 = false;
            if (jVar.getShareMenuEnable()) {
                z6 = true;
            }
        }
        return z6;
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final BasePegasusPlayerData getData() {
        return (fp0.j) getBindData();
    }

    @NotNull
    public final Class<? extends UgcInlinePanel> getPanelType() {
        return UgcInlinePanel.class;
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final float getPlaySpeed() {
        ICardPlayerContext cardPlayerContext;
        UgcInlinePanel ugcInlinePanel = this.f77861g;
        return (ugcInlinePanel == null || (cardPlayerContext = ugcInlinePanel.getCardPlayerContext()) == null) ? 1.0f : cardPlayerContext.getPlaySpeed();
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final int getPlayerState() {
        ICardPlayerContext cardPlayerContext;
        UgcInlinePanel ugcInlinePanel = this.f77861g;
        return (ugcInlinePanel == null || (cardPlayerContext = ugcInlinePanel.getCardPlayerContext()) == null) ? 0 : cardPlayerContext.getPlayerState();
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final boolean isFavorite() {
        fp0.j jVar = (fp0.j) getBindData();
        boolean z6 = false;
        if (jVar != null) {
            z6 = false;
            if (jVar.isFav()) {
                z6 = true;
            }
        }
        return z6;
    }

    public final void onBind(PegasusHolderData pegasusHolderData, List list) {
        fp0.j jVar = (fp0.j) pegasusHolderData;
        if (list.contains("PAYLOAD_UPDATE_TRANSLATE")) {
            H0();
        } else {
            super/*com.bilibili.pegasus.PegasusHolder*/.onBind(jVar, list);
        }
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5656f
    public final void onBindPanel(InlinePanel inlinePanel) {
        UgcInlinePanel ugcInlinePanel = (UgcInlinePanel) inlinePanel;
        super.onBindPanel(ugcInlinePanel);
        fp0.j jVar = (fp0.j) getBindData();
        if (jVar == null) {
            return;
        }
        ugcInlinePanel.getMute().setSupportGuidance(true);
        ugcInlinePanel.resetFromType("large_cover_single_v9");
        C8339C.g(ugcInlinePanel, jVar);
        if (jVar.getHideDanmakuSwitch()) {
            ugcInlinePanel.getDanmaku().setVisible(false);
            ugcInlinePanel.getDanmaku().setVisibility(8);
        } else {
            ugcInlinePanel.getDanmaku().setVisible(true);
            ugcInlinePanel.getDanmaku().setVisibility(0);
        }
        C8615d.a(ugcInlinePanel.getCoverLeftText1(), jVar.getCoverLeftText1(), jVar.getCoverLeftIcon1());
        C8615d.a(ugcInlinePanel.getCoverLeftText2(), jVar.getCoverLeftText2(), jVar.getCoverLeftIcon2());
        InlineGestureSeekBarContainer inlineGestureSeekBarContainerD0 = D0();
        inlineGestureSeekBarContainerD0.setVisibility(0);
        inlineGestureSeekBarContainerD0.resetProgress();
        ugcInlinePanel.getGestureSeekWidget().setGestureSeekBarContainer(inlineGestureSeekBarContainerD0);
        ugcInlinePanel.setOnClickListener(new Re.c(this, 2));
        ugcInlinePanel.setOnLongClickListener(new aW.h(this, 2));
        ugcInlinePanel.addOnDetachListener(this.f77561y);
        InlineTask inlineTripleLikeTask = new InlineTripleLikeTask(new DR0.a(this, 2), new DR0.b(this, 2));
        InlineTask inlineToastTask = new InlineToastTask(ugcInlinePanel);
        ((InlineTripleGuideHelper) this.f77552p.getValue()).getTranslateAnim().setAnimationListener(inlineTripleLikeTask.getAnimationListener());
        new InlineTaskScheduler(CollectionsKt.listOf(new InlineTask[]{inlineTripleLikeTask, ugcInlinePanel.getInline4GWarningWidget(), ugcInlinePanel.getSeekGuideWidget(), inlineToastTask})).execute();
    }

    /* JADX INFO: renamed from: onHolderVisibleStateChanged-9yN0R78, reason: not valid java name */
    public final void m8110onHolderVisibleStateChanged9yN0R78(int i7, int i8) {
        super/*com.bilibili.pegasus.PegasusHolder*/.onHolderVisibleStateChanged-9yN0R78(i7, i8);
        if (HolderVisibleState.getAllVisible-impl(i8)) {
            return;
        }
        IInlineControl inlineControl = getInlineControl();
        if (inlineControl != null) {
            inlineControl.stopPlay(this);
        }
        ((InlineTripleGuideHelper) this.f77552p.getValue()).stopInlineTripleGuideAnim();
        com.bilibili.pegasus.common.inline.l<fp0.j> lVar = this.f77554r;
        com.bilibili.pegasus.common.inline.l<fp0.j> lVar2 = lVar;
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

    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    public final void x0(@Nullable View view) {
        view.setVisibility(0);
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5656f
    public final void y0() {
        super.y0();
        BLog.i("LargeCoverSingleV9Card", "bindViewPlay调用了！");
        CardFragmentPlayerContainerLayout cardFragmentPlayerContainerLayoutZ0 = z0();
        CardFragmentWithScrollContainer cardFragmentWithScrollContainer = cardFragmentPlayerContainerLayoutZ0 instanceof CardFragmentWithScrollContainer ? (CardFragmentWithScrollContainer) cardFragmentPlayerContainerLayoutZ0 : null;
        if (cardFragmentWithScrollContainer != null) {
            cardFragmentWithScrollContainer.f79105k = new Nj.I(this, 2);
        }
    }
}
