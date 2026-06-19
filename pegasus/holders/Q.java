package com.bilibili.pegasus.holders;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import bilibili.live.app.service.constant.CardTypeKt;
import bilibili.live.app.service.provider.LivePlayerDataTracker;
import com.bilibili.adcommon.data.IAdInfo;
import com.bilibili.adcommon.data.IAdReportInfo;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.common.inline.SingleColumnInlineProperty;
import com.bilibili.app.comm.list.common.inline.view.InlineLiveBadgeWidget;
import com.bilibili.app.comm.list.common.inline.view.InlineLiveBadgeWidgetKt;
import com.bilibili.app.comm.list.common.inline.view.RightTopLiveBadge;
import com.bilibili.app.comm.list.common.inline.widgetV3.Inline4GWarningWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineMuteWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTask;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTaskScheduler;
import com.bilibili.app.comm.list.common.inline.widgetV3.PegasusInlineMuteWidget;
import com.bilibili.app.comm.list.widget.image.ListPlaceHolderImageView;
import com.bilibili.app.comm.list.widget.utils.ListConstKt;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.bililive.api.multivoice.ApplyUser;
import com.bilibili.bililive.room.ui.multivoicelink.LiveRoomMultiVoiceLinkViewModel;
import com.bilibili.chatroom.ui.ChatPlayerMsgFragment;
import com.bilibili.gripper.api.ad.core.GAdCoreKt;
import com.bilibili.gripper.api.ad.core.GAdReport;
import com.bilibili.gripper.api.ad.core.report.ReportPresetKt;
import com.bilibili.inline.biz.InlinePlayerTrackerCallbackKt;
import com.bilibili.inline.biz.live.InlineToastTask;
import com.bilibili.inline.biz.live.LiveContainer;
import com.bilibili.inline.biz.live.LiveInlineBufferingCallback;
import com.bilibili.inline.biz.live.LiveInlineTrackerCallback;
import com.bilibili.inline.card.PlayReason;
import com.bilibili.inline.control.IInlineControl;
import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.lib.biliwallet.ui.base.refresh.BaseLoadPageSwipeRecyclerViewFragment;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.moduleservice.list.IPegasusLiveInlineCardReportService;
import com.bilibili.pegasus.HolderVisibleState;
import com.bilibili.pegasus.PegasusHolderData;
import com.bilibili.pegasus.common.inline.InterfaceC5582a;
import com.bilibili.pegasus.common.inline.InterfaceC5583b;
import com.bilibili.pegasus.data.base.BasePegasusPlayerData;
import com.bilibili.pegasus.data.component.ArgsData;
import com.bilibili.pegasus.data.component.AvatarData;
import com.bilibili.pegasus.ext.view.TagExtKt;
import com.bilibili.playerbizcommon.features.network.VideoEnvironment;
import com.mall.ui.composePage.circlePublish.CirclePublishViewModel;
import ep0.C6963a;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import op0.C8249a;
import op0.C8250b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pp0.C8339C;
import pp0.C8340D;
import sp0.C8614c;
import sp0.C8615d;
import tv.danmaku.bili.splash.ad.model.SplashOrder;
import tv.danmaku.bili.widget.PendantAvatarFrameLayout;
import tv.danmaku.bili.widget.VectorTextView;
import tv.danmaku.video.bilicardplayer.ICardPlaySateChangedCallback;
import tv.danmaku.video.bilicardplayer.ICardPlayerContext;
import tv.danmaku.video.bilicardplayer.player.BiliCardPlayerScene;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/Q.class */
@StabilityInferred(parameters = 0)
public final class Q extends AbstractC5656f<fp0.i, Th.j> implements InterfaceC5582a, InterfaceC5583b<fp0.i>, LiveContainer {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final aq0.E0 f77622k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f77623l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final VectorTextView f77624m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final VectorTextView f77625n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public LiveInlineBufferingCallback f77626o;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/Q$a.class */
    public static final class a implements ICardPlaySateChangedCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Q f77627a;

        public a(Q q7) {
            this.f77627a = q7;
        }

        public final void onError(ICardPlayerContext iCardPlayerContext) {
            IInlineControl inlineControl = this.f77627a.getInlineControl();
            if (inlineControl != null) {
                inlineControl.stopPlay();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Q(@NotNull aq0.E0 e02) {
        super(e02.f53694a);
        this.f77622k = e02;
        this.f77623l = true;
        this.f77624m = this.itemView.findViewById(2131299631);
        this.f77625n = this.itemView.findViewById(2131299632);
        this.itemView.setOnClickListener(new VO.t(this, 1));
        View.OnLongClickListener onLongClickListener = new View.OnLongClickListener(this) { // from class: com.bilibili.pegasus.holders.L

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Q f77533a;

            {
                this.f77533a = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                Q q7 = this.f77533a;
                rp0.p.c(q7, true, ListExtentionsKt.getGlobalRect(q7.f77622k.f53697d.f53751e));
                return true;
            }
        };
        ListPlaceHolderImageView listPlaceHolderImageView = e02.f53695b;
        listPlaceHolderImageView.setOnLongClickListener(onLongClickListener);
        this.itemView.setOnLongClickListener(onLongClickListener);
        z0().setOnLongClickListener(onLongClickListener);
        final int i7 = 0;
        listPlaceHolderImageView.setOnClickListener(new View.OnClickListener(this, i7) { // from class: com.bilibili.pegasus.holders.M

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f77607a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f77608b;

            {
                this.f77607a = i7;
                this.f77608b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f77607a) {
                    case 0:
                        ((Q) this.f77608b).E0("1");
                        break;
                    case 1:
                        ((BaseLoadPageSwipeRecyclerViewFragment) this.f77608b).onLoadNextPage();
                        break;
                    default:
                        ChatPlayerMsgFragment chatPlayerMsgFragment = (ChatPlayerMsgFragment) this.f77608b;
                        fV.b bVar = chatPlayerMsgFragment.m;
                        fV.b bVar2 = bVar;
                        if (bVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("commonReport");
                            bVar2 = null;
                        }
                        Neurons.reportClick(false, "main.public-community.watch-together.im-emoji.click", bVar2.a);
                        if (!com.bilibili.ogv.infra.account.a.f67852b.isLogin()) {
                            BLRouter.routeTo(new RouteRequest.Builder(Uri.parse("activity://main/login/")).build(), view.getContext());
                        } else {
                            chatPlayerMsgFragment.lf();
                            com.bilibili.chatroom.widget.h hVar = chatPlayerMsgFragment.f;
                            if (hVar != null) {
                                hVar.e(true);
                            }
                        }
                        break;
                }
            }
        });
        e02.f53697d.f53751e.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.pegasus.holders.N

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Q f77609a;

            {
                this.f77609a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Q q7 = this.f77609a;
                rp0.p.c(q7, false, ListExtentionsKt.getGlobalRect(q7.f77622k.f53697d.f53751e));
            }
        });
    }

    public final Bundle C0() {
        Bundle bundle;
        fp0.i iVar = (fp0.i) getBindData();
        if (iVar != null) {
            String cardGoto = ((fp0.i) getBindData()).getCardGoto();
            Lazy lazy = C6963a.f117350a;
            Bundle bundle2 = new Bundle();
            bundle = bundle2;
            if (iVar.getPlayerArgs() != null) {
                if (iVar.getArgs() == null) {
                    bundle = bundle2;
                } else {
                    bundle2.putInt("liveInlineDanmuOn", 0);
                    C6963a.b(iVar.getArgs(), bundle2);
                    C6963a.d(iVar.getPlayerArgs(), bundle2);
                    C6963a.c(iVar, bundle2);
                    bundle2.putBoolean("is_manual", false);
                    bundle2.putString("card_goto", cardGoto);
                    bundle2.putBoolean("is_atten", iVar.isAtten());
                    bundle2.putInt("play_item_hash_code", iVar.hashCode());
                    bundle2.putInt("official_icon", iVar.getOfficialIconV2());
                    bundle2.putInt("cover_left_icon_1", iVar.getCoverLeftIcon1());
                    bundle2.putString("cover_left_text_1", iVar.getCoverLeftText1());
                    bundle2.putString("cover_left_text_2", iVar.getCoverLeftText2());
                    bundle2.putParcelable("right_top_live_badge", iVar.getRightTopLiveBadge());
                    bundle = bundle2;
                }
            }
        } else {
            bundle = null;
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.pegasus.holders.AbstractC5656f, com.bilibili.pegasus.holders.AbstractC5652d
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public final void u0(@NotNull fp0.i iVar) {
        super.u0(iVar);
        z0().setOnLongClickListener(new View.OnLongClickListener(this) { // from class: com.bilibili.pegasus.holders.P

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Q f77616a;

            {
                this.f77616a = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                Q q7 = this.f77616a;
                rp0.p.c(q7, true, ListExtentionsKt.getGlobalRect(q7.f77622k.f53697d.f53751e));
                return true;
            }
        });
        this.f77626o = new LiveInlineBufferingCallback(this, getInlineControl(), iVar.getOid(), Lh.i.a());
        View view = this.itemView;
        String talkBack = iVar.getTalkBack();
        if (talkBack == null) {
            talkBack = iVar.getTitle();
        }
        view.setContentDescription(talkBack);
        boolean z6 = false;
        if (iVar.isInlinePlayable()) {
            PlayerArgs playerArgs = iVar.getPlayerArgs();
            z6 = false;
            if (playerArgs != null ? playerArgs.clickToPlay() : false) {
                z6 = true;
            }
        }
        if (!z6) {
            z0().setOnClickListener(new com.bilibili.app.preferences.K(this, 1));
        }
        aq0.E0 e02 = this.f77622k;
        ListPlaceHolderImageView listPlaceHolderImageView = e02.f53695b;
        String cover = iVar.getCover();
        aq0.T0 t02 = e02.f53696c;
        String cover2 = null;
        C8614c.d(listPlaceHolderImageView, cover, t02.f53871b, null, 8);
        ListExtentionsKt.setTextWithIcon$default(this.f77624m, iVar.getCoverLeftText1(), iVar.getCoverLeftIcon1(), R$color.Wh0_u, 0.0f, 0.0f, 48, (Object) null);
        ListExtentionsKt.setTextWithIcon$default(this.f77625n, iVar.getCoverLeftText2(), iVar.getCoverLeftIcon2(), R$color.Wh0_u, 0.0f, 0.0f, 48, (Object) null);
        F0();
        aq0.L0 l02 = e02.f53697d;
        ListExtentionsKt.setText(l02.f53749c, iVar.g());
        final fp0.i iVar2 = (fp0.i) getBindData();
        if (iVar2 != null) {
            PendantAvatarFrameLayout pendantAvatarFrameLayout = l02.f53748b;
            PendantAvatarFrameLayout.ShowParams showParams = new PendantAvatarFrameLayout.ShowParams();
            showParams.mode(1);
            showParams.defaultAvatar(2131237005);
            AvatarData avatar = iVar2.getAvatar();
            if (avatar != null) {
                cover2 = avatar.getCover();
            }
            showParams.avatarImgUrl(cover2);
            showParams.borderWidth(0.5f);
            showParams.borderColor(R$color.Ga2);
            showParams.mIsBadgeShow = Boolean.TRUE;
            showParams.badgeImgRes(ListConstKt.getIconRes(iVar2.getOfficialIconV2()));
            pendantAvatarFrameLayout.show(showParams);
            final int i7 = 0;
            l02.f53748b.setOnClickListener(new View.OnClickListener(i7, this, iVar2) { // from class: com.bilibili.pegasus.holders.K

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f77530a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final RecyclerView.ViewHolder f77531b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f77532c;

                {
                    this.f77530a = i7;
                    this.f77531b = this;
                    this.f77532c = iVar2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (this.f77530a) {
                        case 0:
                            C8249a.c((Q) this.f77531b, (fp0.i) this.f77532c);
                            break;
                        default:
                            dI.b bVar = this.f77531b;
                            ApplyUser applyUser = (ApplyUser) this.f77532c;
                            LiveRoomMultiVoiceLinkViewModel.a aVar = bVar.d;
                            if (aVar != null) {
                                aVar.a(applyUser.uid, true, new com.bilibili.video.story.tab.t(1, bVar, applyUser));
                            }
                            break;
                    }
                }
            });
        }
        ViewStub viewStub = t02.f53872c;
        RightTopLiveBadge rightTopLiveBadge = iVar.getRightTopLiveBadge();
        View view2 = this.itemView;
        if (rightTopLiveBadge == null) {
            viewStub.setVisibility(8);
        } else {
            viewStub.setVisibility(0);
            InlineLiveBadgeWidget inlineLiveBadgeWidgetFindViewById = view2.findViewById(2131303674);
            InlineLiveBadgeWidget inlineLiveBadgeWidget = inlineLiveBadgeWidgetFindViewById;
            if (!(inlineLiveBadgeWidgetFindViewById instanceof InlineLiveBadgeWidget)) {
                inlineLiveBadgeWidget = null;
            }
            InlineLiveBadgeWidget inlineLiveBadgeWidget2 = inlineLiveBadgeWidget;
            if (inlineLiveBadgeWidget2 != null) {
                InlineLiveBadgeWidgetKt.displayBadge$default(inlineLiveBadgeWidget2, rightTopLiveBadge, true, true, false, 8, (Object) null);
            }
        }
        x0(l02.f53751e);
    }

    public final void E0(String str) {
        IPegasusLiveInlineCardReportService iPegasusLiveInlineCardReportServiceA;
        Bundle bundleC0 = C0();
        if (bundleC0 != null && (iPegasusLiveInlineCardReportServiceA = C8339C.a()) != null) {
            iPegasusLiveInlineCardReportServiceA.onCardClick(bundleC0);
        }
        fp0.i iVar = (fp0.i) getBindData();
        if (iVar != null) {
            C8340D.g(iVar, null, null, str, null, 27);
        }
    }

    public final void F0() {
        String translatedText;
        fp0.i iVar = (fp0.i) getBindData();
        if (iVar == null) {
            return;
        }
        String title = (!Intrinsics.areEqual(iVar.getTranslatedStatus(), "TRANSLATED") || (translatedText = iVar.getTranslatedText()) == null || StringsKt.isBlank(translatedText)) ? iVar.getTitle() : iVar.getTranslatedText();
        boolean zH = iVar.h();
        aq0.E0 e02 = this.f77622k;
        if (!zH) {
            TagExtKt.displaySpanTags$default(e02.f53697d.f53750d, CollectionsKt.listOf(new jp0.e[]{iVar.f(), iVar.l()}), title == null ? "" : title, 0, ListExtentionsKt.toPx(6), false, false, false, new com.bilibili.app.preferences.F(1, this, title), null, true, 372, null);
            return;
        }
        TagExtKt.displaySpanTag$default(e02.f53697d.f53752f, iVar.l(), null, null, false, false, false, null, TagExtKt.toImageTag$default(iVar.l(), 0, 3, false, 5, null), null, 0, 0, 1918, null);
        final int i7 = 0;
        final String str = title;
        TagExtKt.displaySpanTags$default(e02.f53697d.f53750d, CollectionsKt.listOf(iVar.f()), title == null ? "" : title, 0, ListExtentionsKt.toPx(6), false, false, false, new Function0(i7, this, str) { // from class: com.bilibili.pegasus.holders.O

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f77612a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f77613b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f77614c;

            {
                this.f77612a = i7;
                this.f77613b = this;
                this.f77614c = str;
            }

            public final Object invoke() {
                switch (this.f77612a) {
                    case 0:
                        ((Q) this.f77613b).f77622k.f53697d.f53750d.setText((String) this.f77614c);
                        return Unit.INSTANCE;
                    case 1:
                        CirclePublishViewModel.U0((CirclePublishViewModel) this.f77613b, (Context) this.f77614c, (Integer) null, (String) null, (Boolean) null, 14);
                        KQ0.e.e(2131839886, MapsKt.emptyMap());
                        return Unit.INSTANCE;
                    default:
                        tv.danmaku.bili.splash.ad.player.c cVar = ((tv.danmaku.bili.splash.ad.widget.j) this.f77613b).a;
                        Long lValueOf = cVar != null ? Long.valueOf(cVar.getCurrentPlayTime()) : null;
                        Long l7 = lValueOf;
                        if (lValueOf == null) {
                            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Long.class);
                            if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                                l7 = (Long) Double.valueOf(0.0d);
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                                l7 = (Long) Float.valueOf(0.0f);
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                                l7 = 0L;
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                                l7 = (Long) 0;
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Character.TYPE))) {
                                l7 = (Long) (char) 0;
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Short.TYPE))) {
                                l7 = (Long) (short) 0;
                            } else {
                                if (!Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Byte.TYPE))) {
                                    throw new RuntimeException("not primitive number type");
                                }
                                l7 = (Long) (byte) 0;
                            }
                        }
                        long jLongValue = l7.longValue();
                        GAdReport gAdReport = GAdCoreKt.getGAdReport();
                        IAdInfo iAdInfoA = Be1.b.a((SplashOrder) this.f77614c);
                        IAdReportInfo reportInfo = null;
                        if (iAdInfoA != null) {
                            reportInfo = iAdInfoA.getReportInfo();
                        }
                        gAdReport.uiEvent("splash_click_egg_close", ReportPresetKt.toReportPreset(reportInfo), new tv.danmaku.bili.splash.ad.widget.i(jLongValue));
                        return Unit.INSTANCE;
                }
            }
        }, null, true, 372, null);
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
            Th.j r0 = (Th.j) r0
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
            Th.j r0 = (Th.j) r0
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
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.Q.S():boolean");
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5582a
    public final void U() {
        IPegasusLiveInlineCardReportService iPegasusLiveInlineCardReportServiceA;
        Bundle bundleC0 = C0();
        if (bundleC0 == null || (iPegasusLiveInlineCardReportServiceA = C8339C.a()) == null) {
            return;
        }
        iPegasusLiveInlineCardReportServiceA.onCardShow(bundleC0);
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final void a(boolean z6) {
        IInlineControl inlineControl;
        ICardPlayerContext cardPlayerContext;
        if (z6) {
            Th.j jVar = this.f77861g;
            if (((jVar == null || (cardPlayerContext = jVar.getCardPlayerContext()) == null) ? null : cardPlayerContext.getVideoEnvironment()) == VideoEnvironment.MOBILE_DATA) {
                PlayReason playReason = PlayReason.INLINE_MANUAL_PLAY;
                fp0.i iVar = (fp0.i) getBindData();
                PlayReason playReason2 = null;
                if (iVar != null) {
                    SingleColumnInlineProperty singleColumnInlineProperty = iVar.f118627a1;
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
    }

    @NotNull
    public final BiliCardPlayerScene.CardPlayTask configCustomTaskBehavior(@NotNull BiliCardPlayerScene.CardPlayTask cardPlayTask, boolean z6) {
        long tid;
        long rid;
        C8250b.b(cardPlayTask, z6);
        fp0.i iVar = (fp0.i) getBindData();
        if (iVar != null) {
            ArgsData args = iVar.getArgs();
            if (args != null) {
                tid = args.getTid();
                rid = args.getRid();
            } else {
                tid = 0;
                rid = 0;
            }
            long oid = iVar.getOid();
            long jK = iVar.k();
            String uri = iVar.getUri();
            String str = uri;
            if (uri == null) {
                str = "";
            }
            InlinePlayerTrackerCallbackKt.addInlineTrackerCallback(cardPlayTask, new LiveInlineTrackerCallback(new LivePlayerDataTracker.TrackerRawData(oid, jK, tid, rid, str, CardTypeKt.getCARD_TYPE_PEGASUS_DOUBLE_LIVE_CARD_INLINE(), 5, iVar.getTrackId())));
        }
        cardPlayTask.setChronosEnable(false);
        cardPlayTask.addPlayerStateChangedCallback(new a(this));
        LiveInlineBufferingCallback liveInlineBufferingCallback = this.f77626o;
        if (liveInlineBufferingCallback != null) {
            cardPlayTask.addPlayerBufferingCallback(liveInlineBufferingCallback);
        }
        return cardPlayTask;
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final boolean d() {
        fp0.i iVar = (fp0.i) getBindData();
        boolean z6 = false;
        if (iVar != null) {
            z6 = false;
            if (iVar.getShareMenuEnable()) {
                z6 = true;
            }
        }
        return z6;
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final BasePegasusPlayerData getData() {
        return (fp0.i) getBindData();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.pegasus.common.inline.InterfaceC5582a
    @NotNull
    public final View getItemView() {
        return this.itemView;
    }

    @NotNull
    public final Class<Th.j> getPanelType() {
        return Th.j.class;
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final float getPlaySpeed() {
        return 0.0f;
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final int getPlayerState() {
        return 1;
    }

    @NotNull
    public final ViewGroup getVideoContainer() {
        return z0();
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final boolean isFavorite() {
        return false;
    }

    public final void onBind(PegasusHolderData pegasusHolderData, List list) {
        fp0.i iVar = (fp0.i) pegasusHolderData;
        if (list.contains("PAYLOAD_UPDATE_TRANSLATE")) {
            F0();
        } else {
            super/*com.bilibili.pegasus.PegasusHolder*/.onBind(iVar, list);
        }
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5656f
    public final void onBindPanel(InlinePanel inlinePanel) {
        Th.j jVar = (Th.j) inlinePanel;
        super.onBindPanel(jVar);
        final fp0.i iVar = (fp0.i) getBindData();
        if (iVar == null) {
            return;
        }
        PegasusInlineMuteWidget pegasusInlineMuteWidget = jVar.l;
        if (pegasusInlineMuteWidget == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mute");
            pegasusInlineMuteWidget = null;
        }
        pegasusInlineMuteWidget.setSupportGuidance(true);
        Map mapMutableMapOf = MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("from_type", iVar.getFromType()), TuplesKt.to("goto", iVar.getCardGoto()), TuplesKt.to("param", iVar.getParam()), TuplesKt.to("card_type", iVar.getCardType()), TuplesKt.to("style", C8340D.e())});
        InlineMuteWidgetV3 inlineMuteWidgetV3 = jVar.l;
        if (inlineMuteWidgetV3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mute");
            inlineMuteWidgetV3 = null;
        }
        inlineMuteWidgetV3.setVolumeGuidanceListener(new pp0.g(iVar));
        InlineMuteWidgetV3 inlineMuteWidgetV32 = jVar.l;
        if (inlineMuteWidgetV32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mute");
            inlineMuteWidgetV32 = null;
        }
        inlineMuteWidgetV32.setMuteStateChangeListener(new pp0.o(iVar, null));
        final String str = null;
        jVar.getDanmaku().setOnWidgetClickListener(new Function2(iVar, str) { // from class: pp0.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final fp0.i f125518a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f125519b;

            {
                this.f125518a = iVar;
                this.f125519b = str;
            }

            public final Object invoke(Object obj, Object obj2) {
                C8339C.b(this.f125518a, ((Boolean) obj).booleanValue(), this.f125519b, (Map) obj2);
                return Unit.INSTANCE;
            }
        });
        Inline4GWarningWidgetV3 inline4GWarningWidgetV3 = jVar.n;
        if (inline4GWarningWidgetV3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inline4GWarningWidget");
            inline4GWarningWidgetV3 = null;
        }
        inline4GWarningWidgetV3.setOnWidgetClickListener(new pp0.p(mapMutableMapOf));
        View view = jVar.h;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avatar");
            view = null;
        }
        ListExtentionsKt.gone(view);
        jVar.getDanmaku().setVisible(false);
        jVar.getDanmaku().setVisibility(8);
        VectorTextView vectorTextView = jVar.j;
        if (vectorTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverLeftText1");
            vectorTextView = null;
        }
        C8615d.a(vectorTextView, iVar.getCoverLeftText1(), iVar.getCoverLeftIcon1());
        VectorTextView vectorTextView2 = jVar.k;
        if (vectorTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverLeftText2");
            vectorTextView2 = null;
        }
        C8615d.a(vectorTextView2, iVar.getCoverLeftText2(), iVar.getCoverLeftIcon2());
        jVar.setOnClickListener(new com.bilibili.campus.manage.compose.A(this, 1));
        jVar.setOnLongClickListener(new A90.a0(this, 4));
        InlineLiveBadgeWidget inlineLiveBadgeWidget = jVar.m;
        if (inlineLiveBadgeWidget == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveBadge");
            inlineLiveBadgeWidget = null;
        }
        InlineLiveBadgeWidgetKt.displayBadge$default(inlineLiveBadgeWidget, iVar.getRightTopLiveBadge(), false, false, false, 14, (Object) null);
        InlineTask inlineToastTask = new InlineToastTask(jVar);
        InlineTask inlineTask = jVar.n;
        if (inlineTask == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inline4GWarningWidget");
            inlineTask = null;
        }
        new InlineTaskScheduler(CollectionsKt.listOf(new InlineTask[]{inlineTask, inlineToastTask})).execute();
        LiveInlineBufferingCallback liveInlineBufferingCallback = this.f77626o;
        if (liveInlineBufferingCallback != null) {
            liveInlineBufferingCallback.checkLiveCanPlay(iVar.getOid());
        }
    }

    /* JADX INFO: renamed from: onHolderVisibleStateChanged-9yN0R78, reason: not valid java name */
    public final void m8116onHolderVisibleStateChanged9yN0R78(int i7, int i8) {
        IInlineControl inlineControl;
        super/*com.bilibili.pegasus.PegasusHolder*/.onHolderVisibleStateChanged-9yN0R78(i7, i8);
        if (HolderVisibleState.getAllVisible-impl(i8) || (inlineControl = getInlineControl()) == null) {
            return;
        }
        inlineControl.stopPlay(this);
    }

    public final void onPageScrollStateChanged(@NotNull RecyclerView recyclerView, int i7) {
        Th.j jVar;
        super/*com.bilibili.pegasus.PegasusHolder*/.onPageScrollStateChanged(recyclerView, i7);
        if (i7 != 1 || (jVar = this.f77861g) == null) {
            return;
        }
        jVar.showWidgets();
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final void setPlaySpeed(float f7) {
    }

    public final void updateCardLive(boolean z6) {
        RightTopLiveBadge rightTopLiveBadge;
        this.f77623l = z6;
        Th.j jVar = this.f77861g;
        if (jVar != null) {
            LinearLayout linearLayout = jVar.m;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("liveBadge");
                linearLayout = null;
            }
            if (linearLayout != null) {
                linearLayout.setVisibility(z6 ? 0 : 8);
            }
        }
        ViewStub viewStub = this.f77622k.f53696c.f53872c;
        int i7 = 8;
        if (z6) {
            i7 = 0;
        }
        viewStub.setVisibility(i7);
        fp0.i iVar = (fp0.i) getBindData();
        if (iVar == null || (rightTopLiveBadge = iVar.getRightTopLiveBadge()) == null) {
            return;
        }
        rightTopLiveBadge.setLiveStatus(z6 ? 1 : 0);
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final long w() {
        ICardPlayerContext cardPlayerContext;
        Th.j jVar = this.f77861g;
        return (jVar == null || (cardPlayerContext = jVar.getCardPlayerContext()) == null) ? 0L : cardPlayerContext.getCurrentPosition();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    @Override // com.bilibili.pegasus.holders.AbstractC5656f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y0() {
        /*
            r7 = this;
            r0 = r7
            com.bilibili.pegasus.PegasusHolderData r0 = r0.getBindData()
            fp0.i r0 = (fp0.i) r0
            r13 = r0
            r0 = r13
            if (r0 != 0) goto Lf
            return
        Lf:
            r0 = r7
            com.bilibili.app.comm.list.widget.play.CardFragmentPlayerContainerLayout r0 = r0.z0()
            r11 = r0
            com.bilibili.pegasus.holders.J r0 = new com.bilibili.pegasus.holders.J
            r1 = r0
            r2 = r7
            r3 = 0
            r1.<init>(r2, r3)
            r12 = r0
            Nj.a r0 = new Nj.a
            r1 = r0
            r2 = r7
            r3 = 5
            r1.<init>(r2, r3)
            r14 = r0
            r0 = r13
            com.bilibili.app.comm.list.common.api.model.PlayerArgs r0 = r0.getPlayerArgs()
            r15 = r0
            r0 = 1
            r10 = r0
            r0 = r15
            if (r0 == 0) goto L46
            r0 = r15
            boolean r0 = r0.hidePlayButton
            if (r0 != 0) goto L46
            r0 = 1
            r8 = r0
            goto L48
        L46:
            r0 = 0
            r8 = r0
        L48:
            r0 = r13
            boolean r0 = r0.isInlinePlayable()
            if (r0 == 0) goto L72
            r0 = r13
            com.bilibili.app.comm.list.common.api.model.PlayerArgs r0 = r0.getPlayerArgs()
            r15 = r0
            r0 = r15
            if (r0 == 0) goto L67
            r0 = r15
            boolean r0 = r0.clickToPlay()
            r9 = r0
            goto L69
        L67:
            r0 = 0
            r9 = r0
        L69:
            r0 = r9
            if (r0 == 0) goto L72
            r0 = r10
            r9 = r0
            goto L74
        L72:
            r0 = 0
            r9 = r0
        L74:
            r0 = r11
            r1 = r12
            r2 = r14
            r3 = r8
            r4 = r9
            r5 = r13
            java.util.Map r5 = pp0.C8340D.d(r5)
            r0.bindViewPlay(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.Q.y0():void");
    }
}
