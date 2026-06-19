package com.bilibili.pegasus.holders;

import android.view.View;
import androidx.appcompat.widget.C3246j;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.adcommon.basic.Motion;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.common.data.LikeButtonItemV2;
import com.bilibili.app.comm.list.common.data.PlayerWidget;
import com.bilibili.app.comm.list.common.inline.ListOgvCardPlayBehaviorWrap;
import com.bilibili.app.comm.list.common.inline.SingleColumnInlineProperty;
import com.bilibili.app.comm.list.common.inline.panel.OgvInlinePanel;
import com.bilibili.app.comm.list.common.inline.serviceV2.InlineOGVHistoryServiceV2;
import com.bilibili.app.comm.list.common.inline.view.InlineGestureSeekBarContainer;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTask;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTaskScheduler;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.app.comm.list.widget.image.ListPlaceHolderImageView;
import com.bilibili.app.comm.list.widget.tag.tagtinttext.TagSpanTextView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.inline.biz.live.InlineToastTask;
import com.bilibili.inline.biz.repository.VideoChronosMessage;
import com.bilibili.inline.card.PlayReason;
import com.bilibili.inline.control.IInlineControl;
import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.inline.utils.InlineExtensionKt;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.pegasus.HolderVisibleState;
import com.bilibili.pegasus.common.inline.InterfaceC5583b;
import com.bilibili.pegasus.data.base.BasePegasusPlayerData;
import com.bilibili.pegasus.data.component.AvatarData;
import com.bilibili.pegasus.ext.router.SpecialSpmidType;
import com.bilibili.pegasus.ext.view.TagExtKt;
import com.bilibili.playerbizcommon.features.network.VideoEnvironment;
import com.bilibili.upper.module.contribute.up.ai.title.AITitleFragment;
import com.bilibili.upper.module.contribute.up.ui.ManuscriptEditFragment;
import java.util.List;
import java.util.Map;
import kntr.app.ad.uikit.modifiers.TouchCapture;
import kntr.base.imageloader.ImageState;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import op0.C8250b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pp0.C8337A;
import pp0.C8340D;
import qp0.C8476b;
import sp0.C8614c;
import sp0.C8615d;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.VectorTextView;
import tv.danmaku.video.bilicardplayer.ICardPlayerContext;
import tv.danmaku.video.bilicardplayer.player.BiliCardPlayerScene;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/LargeCoverSingleV7Holder.class */
@StabilityInferred(parameters = 0)
public final class LargeCoverSingleV7Holder extends AbstractC5656f<fp0.h, OgvInlinePanel> implements InterfaceC5583b<fp0.h> {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f77535u = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final aq0.C0 f77536k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final VectorTextView f77537l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final VectorTextView f77538m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final VectorTextView f77539n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Lazy f77540o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Lazy f77541p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Lazy f77542q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public com.bilibili.pegasus.common.h f77543r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final G f77544s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final DL.e f77545t;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21, types: [com.bilibili.pegasus.holders.G] */
    public LargeCoverSingleV7Holder(@NotNull aq0.C0 c02) {
        super(c02.f53678a);
        this.f77536k = c02;
        this.f77537l = this.itemView.findViewById(2131299631);
        this.f77538m = this.itemView.findViewById(2131299632);
        this.f77539n = this.itemView.findViewById(2131299649);
        this.f77540o = ListExtentionsKt.lazyUnsafe(new Function0(this) { // from class: com.bilibili.pegasus.holders.F

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LargeCoverSingleV7Holder f77522a;

            {
                this.f77522a = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.pegasus.BasePegasusHolder, com.bilibili.pegasus.holders.LargeCoverSingleV7Holder, java.lang.Object] */
            public final Object invoke() {
                ?? r02 = this.f77522a;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) r02.itemView.findViewById(2131308211);
                aq0.K0 k02 = r02.f77536k.f53682e;
                TintImageView tintImageView = k02.f53739e;
                LargeCoverSingleV7Holder$mInlineLikeButtonHelper$2$1 largeCoverSingleV7Holder$mInlineLikeButtonHelper$2$1 = new LargeCoverSingleV7Holder$mInlineLikeButtonHelper$2$1(r02);
                Fragment fragment = r02.getFragment();
                return new com.bilibili.pegasus.common.inline.v(lottieAnimationView, tintImageView, k02.f53740f, largeCoverSingleV7Holder$mInlineLikeButtonHelper$2$1, fragment != null ? fragment.getLifecycle() : null);
            }
        });
        this.f77541p = ListExtentionsKt.lazyUnsafe(new Rd.h(this, 3));
        this.f77542q = ListExtentionsKt.lazyUnsafe(new A90.E(this, 2));
        final int i7 = 0;
        this.f77544s = new Function1(this, i7) { // from class: com.bilibili.pegasus.holders.G

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f77523a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f77524b;

            {
                this.f77523a = i7;
                this.f77524b = this;
            }

            public final Object invoke(Object obj) {
                PlayerArgs playerArgs;
                LikeButtonItemV2 likeButton;
                LikeButtonItemV2 likeButton2;
                switch (this.f77523a) {
                    case 0:
                        VideoChronosMessage videoChronosMessage = (VideoChronosMessage) obj;
                        LargeCoverSingleV7Holder largeCoverSingleV7Holder = (LargeCoverSingleV7Holder) this.f77524b;
                        fp0.h hVar = (fp0.h) largeCoverSingleV7Holder.getBindData();
                        if (hVar != null && (playerArgs = hVar.getPlayerArgs()) != null && videoChronosMessage.getId().longValue() == playerArgs.aid) {
                            BLog.i("LargeCoverSingleV7Card", "update data from card player chronos msg:" + videoChronosMessage);
                            fp0.h hVar2 = (fp0.h) largeCoverSingleV7Holder.getBindData();
                            if (hVar2 != null) {
                                hVar2.updateLikeState(videoChronosMessage.getLikeState(), videoChronosMessage.getLikeCount());
                            }
                            com.bilibili.pegasus.common.inline.v vVarD0 = largeCoverSingleV7Holder.D0();
                            fp0.h hVar3 = (fp0.h) largeCoverSingleV7Holder.getBindData();
                            boolean zIsSelected = (hVar3 == null || (likeButton2 = hVar3.getLikeButton()) == null) ? false : likeButton2.isSelected();
                            fp0.h hVar4 = (fp0.h) largeCoverSingleV7Holder.getBindData();
                            vVarD0.e((hVar4 == null || (likeButton = hVar4.getLikeButton()) == null) ? null : likeButton.getFormatCount(), zIsSelected);
                            com.bilibili.pegasus.common.h hVar5 = largeCoverSingleV7Holder.f77543r;
                            if (hVar5 != null) {
                                hVar5.updateRepositoryData(largeCoverSingleV7Holder.getBindData());
                            }
                        }
                        break;
                    case 1:
                        if (((ImageState) obj) instanceof ImageState.Error) {
                            ((MutableState) this.f77524b).setValue(Boolean.FALSE);
                        }
                        break;
                    default:
                        TouchCapture touchCapture = (TouchCapture) obj;
                        Motion motion = ((qa.b) this.f77524b).s;
                        motion.__width__ = touchCapture.getWidth();
                        motion.__height__ = touchCapture.getHeight();
                        motion.__downx__ = touchCapture.getDownX();
                        motion.__downy__ = touchCapture.getDownY();
                        motion.__upx__ = touchCapture.getUpX();
                        motion.__upy__ = touchCapture.getUpY();
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        this.f77545t = new DL.e(this, 2);
        this.itemView.setOnClickListener(new Ni.i(this, 3));
        View.OnClickListener nVar = new bk.n(this, 2);
        ListPlaceHolderImageView listPlaceHolderImageView = c02.f53679b;
        listPlaceHolderImageView.setOnClickListener(nVar);
        c02.f53682e.f53741g.setOnClickListener(new VO.r(this, 3));
        View.OnLongClickListener fVar = new bk.f(1, this);
        listPlaceHolderImageView.setOnLongClickListener(fVar);
        this.itemView.setOnLongClickListener(fVar);
        z0().setOnLongClickListener(fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final InlineGestureSeekBarContainer C0() {
        this.f77536k.f53681d.setVisibility(0);
        InlineGestureSeekBarContainer inlineGestureSeekBarContainerFindViewById = this.itemView.findViewById(2131303684);
        fp0.h hVar = (fp0.h) getBindData();
        inlineGestureSeekBarContainerFindViewById.setProgressBarData(hVar != null ? hVar.getInlineProgressBar() : null);
        return inlineGestureSeekBarContainerFindViewById;
    }

    public final com.bilibili.pegasus.common.inline.v D0() {
        return (com.bilibili.pegasus.common.inline.v) this.f77540o.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.pegasus.holders.AbstractC5656f, com.bilibili.pegasus.holders.AbstractC5652d
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public final void u0(@NotNull final fp0.h hVar) {
        super.u0(hVar);
        boolean z6 = true;
        z0().setOnLongClickListener(new bk.e(1, this));
        ((InlineOGVHistoryServiceV2) this.f77541p.getValue()).resetUri(hVar.getUri());
        aq0.C0 c02 = this.f77536k;
        C8614c.d(c02.f53679b, hVar.getCover(), c02.f53680c.f53871b, null, 8);
        ListOgvCardPlayBehaviorWrap listOgvCardPlayBehaviorWrap = (ListOgvCardPlayBehaviorWrap) this.f77542q.getValue();
        if (hVar.getPlayerWidget() == null) {
            z6 = false;
        }
        listOgvCardPlayBehaviorWrap.reset(this, z6);
        View view = this.itemView;
        String talkBack = hVar.getTalkBack();
        if (talkBack == null) {
            talkBack = hVar.getTitle();
        }
        view.setContentDescription(talkBack);
        ListExtentionsKt.setTextWithIcon$default(this.f77537l, hVar.getCoverLeftText1(), hVar.getCoverLeftIcon1(), R$color.Wh0_u, 0.0f, 0.0f, 48, (Object) null);
        ListExtentionsKt.setTextWithIcon$default(this.f77538m, hVar.getCoverLeftText2(), hVar.getCoverLeftIcon2(), R$color.Wh0_u, 0.0f, 0.0f, 48, (Object) null);
        ListExtentionsKt.setText(this.f77539n, hVar.getCoverRightText());
        aq0.K0 k02 = c02.f53682e;
        TagSpanTextView tagSpanTextView = k02.f53738d;
        List listListOf = CollectionsKt.listOf(new jp0.e[]{hVar.f(), hVar.k()});
        String title = hVar.getTitle();
        String str = title;
        if (title == null) {
            str = "";
        }
        final int i7 = 0;
        TagExtKt.displaySpanTags$default(tagSpanTextView, listListOf, str, 0, ListExtentionsKt.toPx(6), false, false, false, new Function0(i7, this, hVar) { // from class: com.bilibili.pegasus.holders.E

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f77519a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f77520b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f77521c;

            {
                this.f77519a = i7;
                this.f77520b = this;
                this.f77521c = hVar;
            }

            public final Object invoke() {
                Unit unit;
                boolean z7 = false;
                Object obj = this.f77521c;
                Object obj2 = this.f77520b;
                switch (this.f77519a) {
                    case 0:
                        ListExtentionsKt.setText(((LargeCoverSingleV7Holder) obj2).f77536k.f53682e.f53738d, ((fp0.h) obj).getTitle());
                        return Unit.INSTANCE;
                    case 1:
                        ManuscriptEditFragment manuscriptEditFragment = (ManuscriptEditFragment) obj2;
                        if (manuscriptEditFragment == null) {
                            unit = Unit.INSTANCE;
                        } else {
                            try {
                            } catch (Exception e7) {
                                C3246j.b("add ai title fragment : ", e7.getMessage(), "AITitlePresenter");
                            }
                            if (manuscriptEditFragment.isAdded()) {
                                com.bilibili.studio.editor.smarttitle.c cVar = com.bilibili.studio.editor.smarttitle.c.f108226a;
                                com.bilibili.upper.module.contribute.up.ui.a aVar = (com.bilibili.upper.module.contribute.up.ui.a) obj;
                                if (com.bilibili.studio.editor.smarttitle.c.a() && dA0.a.a()) {
                                    aVar.a.findViewById(2131317172).setVisibility(0);
                                    manuscriptEditFragment.getChildFragmentManager().beginTransaction().replace(2131317172, (Fragment) new AITitleFragment(), "AITitleFragment").commitAllowingStateLoss();
                                }
                                aVar.getClass();
                                aVar.c = manuscriptEditFragment;
                                unit = Unit.INSTANCE;
                            } else {
                                unit = Unit.INSTANCE;
                            }
                        }
                        return unit;
                    default:
                        dE0.u uVar = (dE0.u) obj2;
                        String str2 = (String) obj;
                        try {
                            uVar.b("TribeFawkes", "SplitCompat prepared before feature activation, feature=" + str2 + ", installed=" + PM0.a.d(uVar.a, false), (Throwable) null);
                            z7 = true;
                        } catch (Throwable th) {
                            uVar.b("TribeFawkes", "SplitCompat prepare failed before feature activation, feature=" + str2, th);
                        }
                        return Boolean.valueOf(z7);
                }
            }
        }, null, true, 372, null);
        ListExtentionsKt.setText(k02.f53737c, hVar.h());
        final fp0.h hVar2 = (fp0.h) getBindData();
        if (hVar2 != null) {
            final LikeButtonItemV2 likeButton = hVar2.getLikeButton();
            if (likeButton == null) {
                D0().a();
            } else {
                Lazy lazy = C8476b.f126257a;
                String strB = C8476b.b(SpecialSpmidType.DEFAULT);
                com.bilibili.pegasus.common.inline.v.d(D0(), likeButton, hVar2, strB, strB);
                k02.f53739e.setOnClickListener(new View.OnClickListener(this, likeButton, hVar2) { // from class: com.bilibili.pegasus.holders.C

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final LargeCoverSingleV7Holder f77510a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final LikeButtonItemV2 f77511b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final fp0.h f77512c;

                    {
                        this.f77510a = this;
                        this.f77511b = likeButton;
                        this.f77512c = hVar2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        LargeCoverSingleV7Holder largeCoverSingleV7Holder = this.f77510a;
                        com.bilibili.pegasus.common.inline.v.f(largeCoverSingleV7Holder.D0(), this.f77511b, this.f77512c, 4);
                    }
                });
                k02.f53739e.setOnLongClickListener(new View.OnLongClickListener(this, likeButton, hVar2) { // from class: com.bilibili.pegasus.holders.D

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final LargeCoverSingleV7Holder f77516a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final LikeButtonItemV2 f77517b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final fp0.h f77518c;

                    {
                        this.f77516a = this;
                        this.f77517b = likeButton;
                        this.f77518c = hVar2;
                    }

                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view2) {
                        LargeCoverSingleV7Holder largeCoverSingleV7Holder = this.f77516a;
                        com.bilibili.pegasus.common.inline.v.f(largeCoverSingleV7Holder.D0(), this.f77517b, this.f77518c, 4);
                        return true;
                    }
                });
            }
        }
        com.bilibili.pegasus.common.inline.v vVarD0 = D0();
        LikeButtonItemV2 likeButton2 = hVar.getLikeButton();
        boolean zIsSelected = false;
        if (likeButton2 != null) {
            zIsSelected = likeButton2.isSelected();
        }
        LikeButtonItemV2 likeButton3 = hVar.getLikeButton();
        vVarD0.e(likeButton3 != null ? likeButton3.getFormatCount() : null, zIsSelected);
        x0(k02.f53741g);
        F0(null);
        BiliImageView biliImageView = k02.f53736b;
        AvatarData avatar = hVar.getAvatar();
        String cover = avatar != null ? avatar.getCover() : null;
        AvatarData avatar2 = hVar.getAvatar();
        Integer numValueOf = null;
        if (avatar2 != null) {
            numValueOf = Integer.valueOf(avatar2.getType());
        }
        C8614c.a(biliImageView, cover, numValueOf, 0.0f, ListExtentionsKt.toPx(0.5d), R$color.Ga2, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F0(TagSpanTextView tagSpanTextView) {
        fp0.h hVar = (fp0.h) getBindData();
        if (hVar == null) {
            return;
        }
        jp0.e eVarG = hVar.g();
        String strL = eVarG != null ? eVarG.l() : null;
        aq0.C0 c02 = this.f77536k;
        if (strL == null || StringsKt.isBlank(strL)) {
            ListExtentionsKt.gone(c02.f53680c.f53873d);
            if (tagSpanTextView != null) {
                TagExtKt.displaySpanTag$default(tagSpanTextView, new jp0.e(0), null, null, false, false, false, null, null, null, 0, 0, 1534, null);
                return;
            }
            return;
        }
        if (tagSpanTextView == null) {
            ListExtentionsKt.visible(c02.f53680c.f53873d);
            tagSpanTextView = (TagSpanTextView) this.itemView.findViewById(2131303679);
        }
        TagExtKt.displaySpanTag$default(tagSpanTextView, hVar.g(), null, null, false, false, false, null, null, null, 0, 0, 1534, null);
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
            com.bilibili.app.comm.list.common.inline.panel.OgvInlinePanel r0 = (com.bilibili.app.comm.list.common.inline.panel.OgvInlinePanel) r0
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
            com.bilibili.app.comm.list.common.inline.panel.OgvInlinePanel r0 = (com.bilibili.app.comm.list.common.inline.panel.OgvInlinePanel) r0
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
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.LargeCoverSingleV7Holder.S():boolean");
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final void a(boolean z6) {
        IInlineControl inlineControl;
        ICardPlayerContext cardPlayerContext;
        if (z6) {
            OgvInlinePanel ogvInlinePanel = this.f77861g;
            if (((ogvInlinePanel == null || (cardPlayerContext = ogvInlinePanel.getCardPlayerContext()) == null) ? null : cardPlayerContext.getVideoEnvironment()) == VideoEnvironment.MOBILE_DATA) {
                PlayReason playReason = PlayReason.INLINE_MANUAL_PLAY;
                fp0.h hVar = (fp0.h) getBindData();
                PlayReason playReason2 = null;
                if (hVar != null) {
                    SingleColumnInlineProperty singleColumnInlineProperty = hVar.f118584p0;
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
        com.bilibili.pegasus.common.h hVar;
        fp0.h hVar2 = (fp0.h) getBindData();
        if (hVar2 != null && j7 == hVar2.getAid()) {
            hVar2.setFav(z6);
            fp0.h hVar3 = (fp0.h) getBindData();
            if (hVar3 == null || j7 != hVar3.getAid() || (hVar = this.f77543r) == null) {
                return;
            }
            hVar.updateRepositoryData(hVar3);
        }
    }

    @NotNull
    public final BiliCardPlayerScene.CardPlayTask configCustomTaskBehavior(@NotNull BiliCardPlayerScene.CardPlayTask cardPlayTask, boolean z6) {
        PlayerArgs playerArgs;
        InlineExtensionKt.addHistoryPlugin(cardPlayTask, (InlineOGVHistoryServiceV2) this.f77541p.getValue());
        InlineExtensionKt.addInlineBehavior(cardPlayTask, (ListOgvCardPlayBehaviorWrap) this.f77542q.getValue());
        C8250b.b(cardPlayTask, z6);
        fp0.h hVar = (fp0.h) getBindData();
        if (hVar != null && (playerArgs = hVar.getPlayerArgs()) != null) {
            cardPlayTask.setCustomFakeDuration(((long) playerArgs.fakeDuration) * 1000);
        }
        cardPlayTask.setChronosEnable(true);
        com.bilibili.pegasus.common.h hVar2 = new com.bilibili.pegasus.common.h((BasePegasusPlayerData) getBindData());
        hVar2.setVideoStateCallback(this.f77544s);
        hVar2.setFollowStateCallback(this.f77545t);
        cardPlayTask.setTaskRepository(hVar2);
        this.f77543r = hVar2;
        return cardPlayTask;
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final boolean d() {
        fp0.h hVar = (fp0.h) getBindData();
        boolean z6 = false;
        if (hVar != null) {
            z6 = false;
            if (hVar.getShareMenuEnable()) {
                z6 = true;
            }
        }
        return z6;
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final BasePegasusPlayerData getData() {
        return (fp0.h) getBindData();
    }

    @NotNull
    public final Class<OgvInlinePanel> getPanelType() {
        return OgvInlinePanel.class;
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final float getPlaySpeed() {
        ICardPlayerContext cardPlayerContext;
        OgvInlinePanel ogvInlinePanel = this.f77861g;
        return (ogvInlinePanel == null || (cardPlayerContext = ogvInlinePanel.getCardPlayerContext()) == null) ? -1.0f : cardPlayerContext.getPlaySpeed();
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final int getPlayerState() {
        ICardPlayerContext cardPlayerContext;
        OgvInlinePanel ogvInlinePanel = this.f77861g;
        return (ogvInlinePanel == null || (cardPlayerContext = ogvInlinePanel.getCardPlayerContext()) == null) ? 0 : cardPlayerContext.getPlayerState();
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final boolean isFavorite() {
        fp0.h hVar = (fp0.h) getBindData();
        boolean z6 = false;
        if (hVar != null) {
            z6 = false;
            if (hVar.isFav()) {
                z6 = true;
            }
        }
        return z6;
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5656f
    public final void onBindPanel(InlinePanel inlinePanel) {
        OgvInlinePanel ogvInlinePanel = (OgvInlinePanel) inlinePanel;
        super.onBindPanel(ogvInlinePanel);
        ogvInlinePanel.getMute().setSupportGuidance(true);
        final fp0.h hVar = (fp0.h) getBindData();
        if (hVar != null) {
            Map mapMutableMapOf = MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("from_type", hVar.getFromType()), TuplesKt.to("goto", hVar.getCardGoto()), TuplesKt.to("param", hVar.getParam()), TuplesKt.to("card_type", hVar.getCardType()), TuplesKt.to("style", C8340D.e())});
            ogvInlinePanel.getMute().setVolumeGuidanceListener(new pp0.g(hVar));
            ogvInlinePanel.getMute().setMuteStateChangeListener(new pp0.y(hVar, null));
            final String str = null;
            ogvInlinePanel.getDanmaku().setOnWidgetClickListener(new Function2(hVar, str) { // from class: pp0.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final fp0.h f125522a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f125523b;

                {
                    this.f125522a = hVar;
                    this.f125523b = str;
                }

                public final Object invoke(Object obj, Object obj2) {
                    C8339C.b(this.f125522a, ((Boolean) obj).booleanValue(), this.f125523b, (Map) obj2);
                    return Unit.INSTANCE;
                }
            });
            ogvInlinePanel.getGestureSeekWidget().setSeekReportListener(new pp0.z(mapMutableMapOf));
            ogvInlinePanel.getInline4GWarningWidget().setOnWidgetClickListener(new C8337A(mapMutableMapOf));
            ogvInlinePanel.getAvatar().setVisibility(0);
            if (hVar.getHideDanmakuSwitch()) {
                ogvInlinePanel.getDanmaku().setVisible(false);
                ogvInlinePanel.getDanmaku().setVisibility(8);
            } else {
                ogvInlinePanel.getDanmaku().setVisible(true);
                ogvInlinePanel.getDanmaku().setVisibility(0);
            }
            InlineGestureSeekBarContainer inlineGestureSeekBarContainerC0 = C0();
            inlineGestureSeekBarContainerC0.setVisibility(0);
            inlineGestureSeekBarContainerC0.resetProgress();
            ogvInlinePanel.setSupportShowEndPage(hVar.isPreview());
            PlayerWidget playerWidget = hVar.getPlayerWidget();
            String str2 = playerWidget != null ? playerWidget.title : null;
            if (str2 != null && !StringsKt.isBlank(str2)) {
                TintTextView endViewText = ogvInlinePanel.getEndViewText();
                PlayerWidget playerWidget2 = hVar.getPlayerWidget();
                endViewText.setText(playerWidget2 != null ? playerWidget2.title : null);
            }
            PlayerWidget playerWidget3 = hVar.getPlayerWidget();
            String str3 = playerWidget3 != null ? playerWidget3.desc : null;
            if (str3 != null && !StringsKt.isBlank(str3)) {
                TintTextView endViewGoDetail = ogvInlinePanel.getEndViewGoDetail();
                PlayerWidget playerWidget4 = hVar.getPlayerWidget();
                String str4 = null;
                if (playerWidget4 != null) {
                    str4 = playerWidget4.desc;
                }
                endViewGoDetail.setText(str4);
            }
            ogvInlinePanel.getGestureSeekWidget().setGestureSeekBarContainer(inlineGestureSeekBarContainerC0);
            ogvInlinePanel.addOnDetachListener(new H(this));
            F0(ogvInlinePanel.getOgvBadge());
            ogvInlinePanel.setOnClickListener(new UD.Y(this, 5));
            ogvInlinePanel.setOnLongClickListener(new A90.x(this, 3));
            ogvInlinePanel.getOgvPreviewEndView().setOnClickListener(new bk.h(this, 1));
            ogvInlinePanel.getBadge().setVisibility(0);
            C8615d.a(ogvInlinePanel.getCoverLeftText1(), hVar.getCoverLeftText1(), hVar.getCoverLeftIcon1());
            C8615d.a(ogvInlinePanel.getCoverLeftText2(), hVar.getCoverLeftText2(), hVar.getCoverLeftIcon2());
            new InlineTaskScheduler(CollectionsKt.listOf(new InlineTask[]{ogvInlinePanel.getInline4GWarningWidget(), ogvInlinePanel.getSeekGuideWidget(), new InlineToastTask(ogvInlinePanel)})).execute();
        }
    }

    /* JADX INFO: renamed from: onHolderVisibleStateChanged-9yN0R78, reason: not valid java name */
    public final void m8109onHolderVisibleStateChanged9yN0R78(int i7, int i8) {
        IInlineControl inlineControl;
        super/*com.bilibili.pegasus.PegasusHolder*/.onHolderVisibleStateChanged-9yN0R78(i7, i8);
        if (HolderVisibleState.getAllVisible-impl(i8) || (inlineControl = getInlineControl()) == null) {
            return;
        }
        inlineControl.stopPlay(this);
    }

    public final void onPageScrollStateChanged(@NotNull RecyclerView recyclerView, int i7) {
        OgvInlinePanel ogvInlinePanel;
        super/*com.bilibili.pegasus.PegasusHolder*/.onPageScrollStateChanged(recyclerView, i7);
        if (i7 != 1 || (ogvInlinePanel = this.f77861g) == null) {
            return;
        }
        ogvInlinePanel.showWidgets();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final void setPlaySpeed(float f7) {
        ICardPlayerContext cardPlayerContext;
        PromoToast.showMidToast(this.itemView.getContext(), f7 + "X");
        OgvInlinePanel ogvInlinePanel = this.f77861g;
        if (ogvInlinePanel == null || (cardPlayerContext = ogvInlinePanel.getCardPlayerContext()) == null) {
            return;
        }
        cardPlayerContext.setPlaySpeed(f7);
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final long w() {
        ICardPlayerContext cardPlayerContext;
        OgvInlinePanel ogvInlinePanel = this.f77861g;
        return (ogvInlinePanel == null || (cardPlayerContext = ogvInlinePanel.getCardPlayerContext()) == null) ? 0L : cardPlayerContext.getCurrentPosition();
    }
}
