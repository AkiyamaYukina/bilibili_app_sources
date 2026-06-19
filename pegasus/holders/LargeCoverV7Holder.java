package com.bilibili.pegasus.holders;

import Th.q;
import android.view.View;
import android.view.ViewStub;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4862g0;
import bo.C5126e;
import bo0.C5134d;
import bo0.C5136f;
import bo0.C5137g;
import bo0.C5138h;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.common.data.LikeButtonItemV2;
import com.bilibili.app.comm.list.common.data.PlayerWidget;
import com.bilibili.app.comm.list.common.inline.ListOgvCardPlayBehaviorWrap;
import com.bilibili.app.comm.list.common.inline.service.InlinePendantAvatar;
import com.bilibili.app.comm.list.common.inline.serviceV2.InlineOGVHistoryServiceV2;
import com.bilibili.app.comm.list.common.inline.view.InlineGestureSeekBarContainer;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineAvatarWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTask;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTaskScheduler;
import com.bilibili.app.comm.list.common.inline.widgetV3.PegasusInlineMuteWidget;
import com.bilibili.app.comm.list.common.widget.ListLottieBadgeTagView;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.app.comm.list.widget.image.ListPlaceHolderImageView;
import com.bilibili.app.comm.list.widget.image.TintBadgeView;
import com.bilibili.app.comm.list.widget.tag.tagtinttext.TagSpanTextView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.inline.biz.live.InlineToastTask;
import com.bilibili.inline.card.DefaultInlineProperty;
import com.bilibili.inline.card.PlayReason;
import com.bilibili.inline.control.IInlineControl;
import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.inline.utils.InlineExtensionKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.pegasus.HolderVisibleState;
import com.bilibili.pegasus.common.inline.InterfaceC5583b;
import com.bilibili.pegasus.data.base.BasePegasusPlayerData;
import com.bilibili.pegasus.ext.router.SpecialSpmidType;
import com.bilibili.pegasus.ext.view.TagExtKt;
import com.bilibili.playerbizcommon.features.network.VideoEnvironment;
import dp0.C6829b;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import op0.C8250b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pp0.C8339C;
import qp0.C8476b;
import sp0.C8614c;
import sp0.C8615d;
import tv.danmaku.bili.widget.FixedPopupAnchor;
import tv.danmaku.bili.widget.VectorTextView;
import tv.danmaku.video.bilicardplayer.ICardPlayerContext;
import tv.danmaku.video.bilicardplayer.player.BiliCardPlayerScene;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/LargeCoverV7Holder.class */
@StabilityInferred(parameters = 0)
public final class LargeCoverV7Holder extends AbstractC5656f<fp0.k, Th.q> implements InterfaceC5583b<fp0.k> {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f77564C = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final FJ.i f77565A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final VT.a f77566B;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Lazy f77567k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Lazy f77568l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Lazy f77569m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Lazy f77570n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Lazy f77571o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Lazy f77572p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Lazy f77573q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Lazy f77574r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Lazy f77575s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Lazy f77576t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Lazy f77577u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final ViewStub f77578v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final Lazy f77579w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Lazy f77580x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final Lazy f77581y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public com.bilibili.pegasus.common.h f77582z;

    /* JADX WARN: Multi-variable type inference failed */
    public LargeCoverV7Holder(@NotNull C4862g0 c4862g0) {
        super(c4862g0.f54043a);
        Lazy lazyLazyUnsafe = ListExtentionsKt.lazyUnsafe(new Rj.j(this, 3));
        this.f77567k = lazyLazyUnsafe;
        this.f77568l = ListExtentionsKt.lazyUnsafe(new C5126e(this, 3));
        this.f77569m = ListExtentionsKt.lazyUnsafe(new PY0.f(this, 2));
        this.f77570n = ListExtentionsKt.lazyUnsafe(new C5134d(this, 3));
        this.f77571o = ListExtentionsKt.lazyUnsafe(new DY0.l(this, 5));
        this.f77572p = ListExtentionsKt.lazyUnsafe(new Nm.c(this, 3));
        this.f77573q = ListExtentionsKt.lazyUnsafe(new AI.m(this, 4));
        Lazy lazyLazyUnsafe2 = ListExtentionsKt.lazyUnsafe(new C5136f(this, 2));
        this.f77574r = lazyLazyUnsafe2;
        this.f77575s = ListExtentionsKt.lazyUnsafe(new C5137g(this, 2));
        this.f77576t = ListExtentionsKt.lazyUnsafe(new C5138h(this, 3));
        this.f77577u = ListExtentionsKt.lazyUnsafe(new FQ.m(this, 5));
        this.f77578v = (ViewStub) this.itemView.findViewById(2131303685);
        this.f77579w = ListExtentionsKt.lazyUnsafe(new Function0(this) { // from class: com.bilibili.pegasus.holders.k0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LargeCoverV7Holder f77886a;

            {
                this.f77886a = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.pegasus.BasePegasusHolder, com.bilibili.pegasus.holders.LargeCoverV7Holder, java.lang.Object] */
            public final Object invoke() {
                ?? r02 = this.f77886a;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) r02.itemView.findViewById(2131308211);
                TintImageView tintImageView = (TintImageView) r02.f77577u.getValue();
                TintTextView tintTextView = (TintTextView) r02.itemView.findViewById(2131308212);
                LargeCoverV7Holder$mInlineLikeButtonHelper$2$1 largeCoverV7Holder$mInlineLikeButtonHelper$2$1 = new LargeCoverV7Holder$mInlineLikeButtonHelper$2$1(r02);
                Fragment fragment = r02.getFragment();
                return new com.bilibili.pegasus.common.inline.v(lottieAnimationView, tintImageView, tintTextView, largeCoverV7Holder$mInlineLikeButtonHelper$2$1, fragment != null ? fragment.getLifecycle() : null);
            }
        });
        this.f77580x = ListExtentionsKt.lazyUnsafe(new PX0.d0(this, 3));
        this.f77581y = ListExtentionsKt.lazyUnsafe(new PX0.e0(this, 5));
        this.f77565A = new FJ.i(this, 2);
        this.f77566B = new VT.a(this, 5);
        ((ViewStub) lazyLazyUnsafe2.getValue()).setVisibility(0);
        View.OnLongClickListener onLongClickListener = new View.OnLongClickListener(this) { // from class: com.bilibili.pegasus.holders.f0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LargeCoverV7Holder f77866a;

            {
                this.f77866a = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                LargeCoverV7Holder largeCoverV7Holder = this.f77866a;
                rp0.p.c(largeCoverV7Holder, true, ListExtentionsKt.getGlobalRect(largeCoverV7Holder.D0()));
                return true;
            }
        };
        this.itemView.setOnClickListener(new bn.g(this, 2));
        this.itemView.setOnLongClickListener(onLongClickListener);
        z0().setOnLongClickListener(onLongClickListener);
        ListPlaceHolderImageView listPlaceHolderImageView = (ListPlaceHolderImageView) lazyLazyUnsafe.getValue();
        listPlaceHolderImageView.setOnClickListener(new com.bilibili.bplus.followinglist.page.search.topic.a(this, 1));
        listPlaceHolderImageView.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: com.bilibili.pegasus.holders.g0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LargeCoverV7Holder f77869a;

            {
                this.f77869a = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                LargeCoverV7Holder largeCoverV7Holder = this.f77869a;
                rp0.p.c(largeCoverV7Holder, true, ListExtentionsKt.getGlobalRect(largeCoverV7Holder.D0()));
                return true;
            }
        });
        D0().setOnClickListener(new Nl0.c(this, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final InlineGestureSeekBarContainer C0() {
        this.f77578v.setVisibility(0);
        InlineGestureSeekBarContainer inlineGestureSeekBarContainerFindViewById = this.itemView.findViewById(2131303684);
        fp0.k kVar = (fp0.k) getBindData();
        inlineGestureSeekBarContainerFindViewById.setProgressBarData(kVar != null ? kVar.getInlineProgressBar() : null);
        return inlineGestureSeekBarContainerFindViewById;
    }

    public final FixedPopupAnchor D0() {
        return (FixedPopupAnchor) this.f77576t.getValue();
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5656f, com.bilibili.pegasus.holders.AbstractC5652d
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public final void u0(@NotNull final fp0.k kVar) {
        super.u0(kVar);
        z0().setOnLongClickListener(new View.OnLongClickListener(this) { // from class: com.bilibili.pegasus.holders.h0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LargeCoverV7Holder f77874a;

            {
                this.f77874a = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                LargeCoverV7Holder largeCoverV7Holder = this.f77874a;
                rp0.p.c(largeCoverV7Holder, true, ListExtentionsKt.getGlobalRect(largeCoverV7Holder.D0()));
                return true;
            }
        });
        ((InlineOGVHistoryServiceV2) this.f77580x.getValue()).resetUri(kVar.getUri());
        ((ListOgvCardPlayBehaviorWrap) this.f77581y.getValue()).reset(this, kVar.getPlayerWidget() != null);
        TagExtKt.displayBadge((TintBadgeView) this.f77568l.getValue(), kVar.j());
        Lazy lazy = this.f77567k;
        Integer numValueOf = null;
        C8614c.d((ListPlaceHolderImageView) lazy.getValue(), kVar.getCover(), (ViewStub) this.f77569m.getValue(), null, 8);
        ListExtentionsKt.setTextWithIcon$default((VectorTextView) this.f77570n.getValue(), kVar.getCoverLeftText1(), kVar.getCoverLeftIcon1(), R$color.Wh0_u, 0.0f, 0.0f, 48, (Object) null);
        ListExtentionsKt.setTextWithIcon$default((VectorTextView) this.f77571o.getValue(), kVar.getCoverLeftText2(), kVar.getCoverLeftIcon2(), R$color.Wh0_u, 0.0f, 0.0f, 48, (Object) null);
        ListExtentionsKt.setText((VectorTextView) this.f77572p.getValue(), kVar.getCoverRightText());
        TagSpanTextView tagSpanTextView = (TagSpanTextView) this.f77575s.getValue();
        List listListOf = CollectionsKt.listOf(new jp0.e[]{kVar.f(), kVar.g()});
        String title = kVar.getTitle();
        String str = title;
        if (title == null) {
            str = "";
        }
        TagExtKt.displaySpanTags$default(tagSpanTextView, listListOf, str, 0, ListExtentionsKt.toPx(6), false, false, false, new Function0(this, kVar) { // from class: com.bilibili.pegasus.holders.i0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LargeCoverV7Holder f77877a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final fp0.k f77878b;

            {
                this.f77877a = this;
                this.f77878b = kVar;
            }

            public final Object invoke() {
                ((TagSpanTextView) this.f77877a.f77575s.getValue()).setText(this.f77878b.getTitle());
                return Unit.INSTANCE;
            }
        }, null, true, 372, null);
        ListLottieBadgeTagView listLottieBadgeTagView = (ListLottieBadgeTagView) this.f77573q.getValue();
        if (listLottieBadgeTagView != null) {
            C6829b c6829bB = kVar.b();
            String strB = c6829bB != null ? c6829bB.b() : null;
            C6829b c6829bB2 = kVar.b();
            String strC = c6829bB2 != null ? c6829bB2.c() : null;
            C6829b c6829bB3 = kVar.b();
            if (c6829bB3 != null) {
                numValueOf = Integer.valueOf(c6829bB3.a());
            }
            listLottieBadgeTagView.j0(numValueOf, strB, strC);
        }
        Lazy lazy2 = C8476b.f126257a;
        String strB2 = C8476b.b(SpecialSpmidType.DEFAULT);
        final LikeButtonItemV2 likeButton = kVar.getLikeButton();
        Lazy lazy3 = this.f77579w;
        if (likeButton == null) {
            ((com.bilibili.pegasus.common.inline.v) lazy3.getValue()).a();
        } else {
            com.bilibili.pegasus.common.inline.v.d((com.bilibili.pegasus.common.inline.v) lazy3.getValue(), likeButton, kVar, strB2, strB2);
            Lazy lazy4 = this.f77577u;
            ((TintImageView) lazy4.getValue()).setOnClickListener(new com.bilibili.bililive.biz.livehome.indexfeed.ui.live.home.L(1, this, likeButton));
            ((TintImageView) lazy4.getValue()).setOnLongClickListener(new View.OnLongClickListener(this, likeButton) { // from class: com.bilibili.pegasus.holders.j0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final LargeCoverV7Holder f77881a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final LikeButtonItemV2 f77882b;

                {
                    this.f77881a = this;
                    this.f77882b = likeButton;
                }

                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    LargeCoverV7Holder largeCoverV7Holder = this.f77881a;
                    com.bilibili.pegasus.common.inline.v.f((com.bilibili.pegasus.common.inline.v) largeCoverV7Holder.f77579w.getValue(), this.f77882b, null, 6);
                    return true;
                }
            });
        }
        ListPlaceHolderImageView listPlaceHolderImageView = (ListPlaceHolderImageView) lazy.getValue();
        PlayerArgs playerArgs = kVar.getPlayerArgs();
        boolean z6 = false;
        if (playerArgs != null) {
            z6 = playerArgs.hidePlayButton;
        }
        listPlaceHolderImageView.showPlaceHolderInnerDrawable(z6);
        x0(D0());
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
            Th.q r0 = (Th.q) r0
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
            Th.q r0 = (Th.q) r0
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
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.LargeCoverV7Holder.S():boolean");
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final void a(boolean z6) {
        IInlineControl inlineControl;
        ICardPlayerContext cardPlayerContext;
        if (z6) {
            Th.q qVar = this.f77861g;
            if (((qVar == null || (cardPlayerContext = qVar.getCardPlayerContext()) == null) ? null : cardPlayerContext.getVideoEnvironment()) == VideoEnvironment.MOBILE_DATA) {
                PlayReason playReason = PlayReason.INLINE_MANUAL_PLAY;
                fp0.k kVar = (fp0.k) getBindData();
                PlayReason playReason2 = null;
                if (kVar != null) {
                    DefaultInlineProperty defaultInlineProperty = kVar.f118763r0;
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
        com.bilibili.pegasus.common.h hVar;
        fp0.k kVar = (fp0.k) getBindData();
        if (kVar != null && j7 == kVar.getAid()) {
            kVar.setFav(z6);
            fp0.k kVar2 = (fp0.k) getBindData();
            if (kVar2 == null || j7 != kVar2.getAid() || (hVar = this.f77582z) == null) {
                return;
            }
            hVar.updateRepositoryData(kVar2);
        }
    }

    @NotNull
    public final BiliCardPlayerScene.CardPlayTask configCustomTaskBehavior(@NotNull BiliCardPlayerScene.CardPlayTask cardPlayTask, boolean z6) {
        fp0.k kVar = (fp0.k) getBindData();
        if (kVar == null) {
            return cardPlayTask;
        }
        InlineExtensionKt.addHistoryPlugin(cardPlayTask, (InlineOGVHistoryServiceV2) this.f77580x.getValue());
        InlineExtensionKt.addInlineBehavior(cardPlayTask, (ListOgvCardPlayBehaviorWrap) this.f77581y.getValue());
        C8250b.b(cardPlayTask, z6);
        PlayerArgs playerArgs = kVar.getPlayerArgs();
        if (playerArgs != null) {
            cardPlayTask.setCustomFakeDuration(((long) playerArgs.fakeDuration) * 1000);
        }
        cardPlayTask.setChronosEnable(true);
        com.bilibili.pegasus.common.h hVar = new com.bilibili.pegasus.common.h(kVar);
        hVar.setVideoStateCallback(this.f77565A);
        hVar.setFollowStateCallback(this.f77566B);
        cardPlayTask.setTaskRepository(hVar);
        this.f77582z = hVar;
        return cardPlayTask;
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final boolean d() {
        fp0.k kVar = (fp0.k) getBindData();
        boolean z6 = false;
        if (kVar != null) {
            z6 = false;
            if (kVar.getShareMenuEnable()) {
                z6 = true;
            }
        }
        return z6;
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final BasePegasusPlayerData getData() {
        return (fp0.k) getBindData();
    }

    @NotNull
    public final Class<? extends Th.q> getPanelType() {
        return Th.q.class;
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final float getPlaySpeed() {
        ICardPlayerContext cardPlayerContext;
        Th.q qVar = this.f77861g;
        return (qVar == null || (cardPlayerContext = qVar.getCardPlayerContext()) == null) ? -1.0f : cardPlayerContext.getPlaySpeed();
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final int getPlayerState() {
        ICardPlayerContext cardPlayerContext;
        Th.q qVar = this.f77861g;
        return (qVar == null || (cardPlayerContext = qVar.getCardPlayerContext()) == null) ? 0 : cardPlayerContext.getPlayerState();
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final boolean isFavorite() {
        fp0.k kVar = (fp0.k) getBindData();
        boolean z6 = false;
        if (kVar != null) {
            z6 = false;
            if (kVar.isFav()) {
                z6 = true;
            }
        }
        return z6;
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5656f
    public final void onBindPanel(InlinePanel inlinePanel) {
        Th.q qVar = (Th.q) inlinePanel;
        super.onBindPanel(qVar);
        fp0.k kVar = (fp0.k) getBindData();
        if (kVar == null) {
            return;
        }
        PegasusInlineMuteWidget pegasusInlineMuteWidget = qVar.m;
        if (pegasusInlineMuteWidget == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mute");
            pegasusInlineMuteWidget = null;
        }
        pegasusInlineMuteWidget.setSupportGuidance(true);
        C8339C.f(qVar, kVar);
        InlineAvatarWidgetV3 inlineAvatarWidgetV3 = qVar.h;
        if (inlineAvatarWidgetV3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avatar");
            inlineAvatarWidgetV3 = null;
        }
        inlineAvatarWidgetV3.displayAvatar((InlinePendantAvatar) null);
        if (kVar.getHideDanmakuSwitch()) {
            qVar.getDanmaku().setVisible(false);
            qVar.getDanmaku().setVisibility(8);
        } else {
            qVar.getDanmaku().setVisible(true);
            qVar.getDanmaku().setVisibility(0);
        }
        InlineGestureSeekBarContainer inlineGestureSeekBarContainerC0 = C0();
        inlineGestureSeekBarContainerC0.setVisibility(0);
        inlineGestureSeekBarContainerC0.resetProgress();
        boolean zIsPreview = kVar.isPreview();
        q.a aVar = qVar.C;
        qVar.removeCardPlayStateChangedCallback(aVar);
        if (zIsPreview) {
            qVar.addCardPlayStateChangedCallback(aVar);
        }
        PlayerWidget playerWidget = kVar.getPlayerWidget();
        String str = playerWidget != null ? playerWidget.title : null;
        if (str != null && !StringsKt.isBlank(str)) {
            TintTextView tintTextView = qVar.p;
            if (tintTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("endViewText");
                tintTextView = null;
            }
            PlayerWidget playerWidget2 = kVar.getPlayerWidget();
            tintTextView.setText(playerWidget2 != null ? playerWidget2.title : null);
        }
        PlayerWidget playerWidget3 = kVar.getPlayerWidget();
        String str2 = playerWidget3 != null ? playerWidget3.desc : null;
        if (str2 != null && !StringsKt.isBlank(str2)) {
            TintTextView tintTextView2 = qVar.q;
            if (tintTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("endViewGoDetail");
                tintTextView2 = null;
            }
            PlayerWidget playerWidget4 = kVar.getPlayerWidget();
            tintTextView2.setText(playerWidget4 != null ? playerWidget4.desc : null);
        }
        qVar.getGestureSeekWidget().setGestureSeekBarContainer(inlineGestureSeekBarContainerC0);
        qVar.addOnDetachListener(new C5669l0(this));
        qVar.setOnClickListener(new FJ.f(this, 3));
        qVar.setOnLongClickListener(new com.bilibili.biligame.ui.gift.v3.dialog.C(this, 3));
        qVar.o.setOnClickListener(new FQ.g(this, 2));
        C6829b c6829bB = kVar.b();
        String strB = c6829bB != null ? c6829bB.b() : null;
        C6829b c6829bB2 = kVar.b();
        String strC = c6829bB2 != null ? c6829bB2.c() : null;
        C6829b c6829bB3 = kVar.b();
        Integer numValueOf = c6829bB3 != null ? Integer.valueOf(c6829bB3.a()) : null;
        ListLottieBadgeTagView listLottieBadgeTagView = qVar.v;
        if (listLottieBadgeTagView != null) {
            listLottieBadgeTagView.j0(numValueOf, strB, strC);
        }
        TintBadgeView tintBadgeView = qVar.i;
        if (tintBadgeView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("badge");
            tintBadgeView = null;
        }
        TagExtKt.displayBadge(tintBadgeView, kVar.j());
        VectorTextView vectorTextView = qVar.k;
        if (vectorTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverLeftText1");
            vectorTextView = null;
        }
        C8615d.a(vectorTextView, kVar.getCoverLeftText1(), kVar.getCoverLeftIcon1());
        VectorTextView vectorTextView2 = qVar.l;
        if (vectorTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverLeftText2");
            vectorTextView2 = null;
        }
        C8615d.a(vectorTextView2, kVar.getCoverLeftText2(), kVar.getCoverLeftIcon2());
        InlineTask inlineToastTask = new InlineToastTask(qVar);
        InlineTask inline4GWarningWidget = qVar.getInline4GWarningWidget();
        InlineTask inlineTask = qVar.u;
        if (inlineTask == null) {
            Intrinsics.throwUninitializedPropertyAccessException("seekGuideWidget");
            inlineTask = null;
        }
        new InlineTaskScheduler(CollectionsKt.listOf(new InlineTask[]{inline4GWarningWidget, inlineTask, inlineToastTask})).execute();
    }

    /* JADX INFO: renamed from: onHolderVisibleStateChanged-9yN0R78, reason: not valid java name */
    public final void m8111onHolderVisibleStateChanged9yN0R78(int i7, int i8) {
        IInlineControl inlineControl;
        super/*com.bilibili.pegasus.PegasusHolder*/.onHolderVisibleStateChanged-9yN0R78(i7, i8);
        if (HolderVisibleState.getAllVisible-impl(i8) || (inlineControl = getInlineControl()) == null) {
            return;
        }
        inlineControl.stopPlay(this);
    }

    public final void onPageScrollStateChanged(@NotNull RecyclerView recyclerView, int i7) {
        Th.q qVar;
        super/*com.bilibili.pegasus.PegasusHolder*/.onPageScrollStateChanged(recyclerView, i7);
        if (i7 != 1 || (qVar = this.f77861g) == null) {
            return;
        }
        qVar.showWidgets();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final void setPlaySpeed(float f7) {
        ICardPlayerContext cardPlayerContext;
        PromoToast.showMidToast(this.itemView.getContext(), f7 + "X");
        Th.q qVar = this.f77861g;
        if (qVar == null || (cardPlayerContext = qVar.getCardPlayerContext()) == null) {
            return;
        }
        cardPlayerContext.setPlaySpeed(f7);
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final long w() {
        ICardPlayerContext cardPlayerContext;
        Th.q qVar = this.f77861g;
        return (qVar == null || (cardPlayerContext = qVar.getCardPlayerContext()) == null) ? 0L : cardPlayerContext.getCurrentPosition();
    }
}
