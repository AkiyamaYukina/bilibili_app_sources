package com.bilibili.pegasus.holders.oversea;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.RecyclerView;
import aq0.Y0;
import aq0.f1;
import bilibili.live.app.service.constant.CardTypeKt;
import bilibili.live.app.service.provider.LivePlayerDataTracker;
import com.bilibili.app.comm.emoticon.emoji2.viewmodel.EmojiPanelViewModel;
import com.bilibili.app.comm.emoticon.ui.EmoticonSettingActivity;
import com.bilibili.app.comm.list.common.inline.SingleColumnInlineProperty;
import com.bilibili.app.comm.list.common.inline.view.RightTopLiveBadge;
import com.bilibili.app.comm.list.common.inline.widgetV3.Inline4GWarningWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineMuteWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTask;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTaskScheduler;
import com.bilibili.app.comm.list.common.inline.widgetV3.PegasusInlineMuteWidget;
import com.bilibili.app.comm.list.common.widget.ListLottieBadgeTagView;
import com.bilibili.app.comm.list.widget.image.ListPlaceHolderImageView;
import com.bilibili.app.comm.list.widget.tag.tagtinttext.TagSpanTextView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.bilipay.base.PaymentChannel;
import com.bilibili.inline.biz.InlinePlayerTrackerCallbackKt;
import com.bilibili.inline.biz.live.InlineToastTask;
import com.bilibili.inline.biz.live.LiveContainer;
import com.bilibili.inline.biz.live.LiveInlineBufferingCallback;
import com.bilibili.inline.biz.live.LiveInlineTrackerCallback;
import com.bilibili.inline.card.PlayReason;
import com.bilibili.inline.control.IInlineControl;
import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.lib.bilipay.BiliPay;
import com.bilibili.lib.bilipay.ui.recharge.v2.RechargeCoinMergeActivity;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.moduleservice.list.IPegasusLiveInlineCardReportService;
import com.bilibili.pegasus.HolderVisibleState;
import com.bilibili.pegasus.common.inline.InterfaceC5582a;
import com.bilibili.pegasus.common.inline.InterfaceC5583b;
import com.bilibili.pegasus.data.base.BasePegasusPlayerData;
import com.bilibili.pegasus.data.component.ArgsData;
import com.bilibili.pegasus.holders.AbstractC5656f;
import com.bilibili.playerbizcommon.features.network.VideoEnvironment;
import com.bilibili.upper.module.contribute.up.dialog.CreationConfirmDialog;
import com.bilibili.upper.module.contribute.up.dialog.CreationConfirmDialog$c;
import com.bilibili.videoshortcut.sidecenter.recent.r0;
import com.mall.ui.widget.spinner.SpinnerView;
import dp0.C6829b;
import ep0.C6963a;
import home.sidecenter.recent.b;
import ip0.C7608a;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import op0.C8250b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pp0.C8339C;
import pp0.C8340D;
import sp0.C8615d;
import tv.danmaku.bili.widget.VectorTextView;
import tv.danmaku.video.bilicardplayer.ICardPlaySateChangedCallback;
import tv.danmaku.video.bilicardplayer.ICardPlayerContext;
import tv.danmaku.video.bilicardplayer.player.BiliCardPlayerScene;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/oversea/q.class */
@StabilityInferred(parameters = 0)
public final class q extends AbstractC5656f<C7608a, K> implements InterfaceC5582a, InterfaceC5583b<C7608a>, LiveContainer {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Y0 f78048k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f78049l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final VectorTextView f78050m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final VectorTextView f78051n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final ListLottieBadgeTagView f78052o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public LiveInlineBufferingCallback f78053p;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/oversea/q$a.class */
    public static final class a implements ICardPlaySateChangedCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q f78054a;

        public a(q qVar) {
            this.f78054a = qVar;
        }

        public final void onError(ICardPlayerContext iCardPlayerContext) {
            IInlineControl inlineControl = this.f78054a.getInlineControl();
            if (inlineControl != null) {
                inlineControl.stopPlay();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(@NotNull Y0 y02) {
        super(y02.f53941a);
        this.f78048k = y02;
        this.f78049l = true;
        this.f78050m = this.itemView.findViewById(2131299631);
        this.f78051n = this.itemView.findViewById(2131299632);
        this.f78052o = this.itemView.findViewById(2131318539);
        this.itemView.setOnClickListener(new Fe.e(this, 2));
        View.OnLongClickListener onLongClickListener = new View.OnLongClickListener(this) { // from class: com.bilibili.pegasus.holders.oversea.o

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final q f78045a;

            {
                this.f78045a = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                q qVar = this.f78045a;
                rp0.p.c(qVar, true, ListExtentionsKt.getGlobalRect(qVar.f78048k.f53944d.f54012f));
                return true;
            }
        };
        ListPlaceHolderImageView listPlaceHolderImageView = y02.f53942b;
        listPlaceHolderImageView.setOnLongClickListener(onLongClickListener);
        this.itemView.setOnLongClickListener(onLongClickListener);
        z0().setOnLongClickListener(onLongClickListener);
        final int i7 = 2;
        listPlaceHolderImageView.setOnClickListener(new View.OnClickListener(this, i7) { // from class: HG0.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f8510a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f8511b;

            {
                this.f8510a = i7;
                this.f8511b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f8510a) {
                    case 0:
                        Context context = ((CreationConfirmDialog) this.f8511b).getContext();
                        if (context != null) {
                            eJ0.t.a(-1, "https://www.bilibili.com/blackboard/activity-xpWA0uj03W.html", context);
                        }
                        break;
                    case 1:
                        SpinnerView.a aVar = ((UO0.d) this.f8511b).d;
                        if (aVar != null) {
                            aVar.onClick();
                        }
                        break;
                    default:
                        ((com.bilibili.pegasus.holders.oversea.q) this.f8511b).D0("1");
                        break;
                }
            }
        });
        final int i8 = 4;
        y02.f53944d.f54012f.setOnClickListener(new View.OnClickListener(this, i8) { // from class: HG0.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f8516a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f8517b;

            {
                this.f8516a = i8;
                this.f8517b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f8516a) {
                    case 0:
                        CreationConfirmDialog creationConfirmDialog = (CreationConfirmDialog) this.f8517b;
                        bF0.Z z6 = creationConfirmDialog.b;
                        if (z6 == null || z6.f55322b.isChecked()) {
                            creationConfirmDialog.dismiss();
                            CreationConfirmDialog$c creationConfirmDialog$c = creationConfirmDialog.d;
                            if (creationConfirmDialog$c != null) {
                                creationConfirmDialog$c.a();
                            }
                        } else {
                            eJ0.H.a(2131850917, creationConfirmDialog.getContext());
                        }
                        break;
                    case 1:
                        EmoticonSettingActivity emoticonSettingActivity = (EmoticonSettingActivity) this.f8517b;
                        int i9 = EmoticonSettingActivity.X;
                        emoticonSettingActivity.Y6();
                        emoticonSettingActivity.S = 1;
                        ((EmojiPanelViewModel) emoticonSettingActivity.M.getValue()).L0(emoticonSettingActivity, emoticonSettingActivity.S6(), Integer.valueOf(emoticonSettingActivity.R), Integer.valueOf(emoticonSettingActivity.S));
                        break;
                    case 2:
                        com.bilibili.chatroom.widget.userDialog.f fVar = (com.bilibili.chatroom.widget.userDialog.f) this.f8517b;
                        Neurons.reportClick(false, "pgc.watch-together-cinema.more-operation.0.click", MapsKt.mapOf(TuplesKt.to("option", "2")));
                        fVar.dismiss();
                        if (fVar.c) {
                            fVar.b.a(fVar.a.getMid());
                            TextView textView = fVar.d;
                            if (textView != null) {
                                textView.setText(fVar.getContext().getString(2131824428));
                            }
                        } else {
                            fVar.b.b(fVar.a.getMid());
                            TextView textView2 = fVar.d;
                            if (textView2 != null) {
                                textView2.setText(fVar.getContext().getString(2131824424));
                            }
                        }
                        fVar.c = true ^ fVar.c;
                        break;
                    case 3:
                        RechargeCoinMergeActivity rechargeCoinMergeActivity = (RechargeCoinMergeActivity) this.f8517b;
                        rechargeCoinMergeActivity.z1.b();
                        Intent intent = new Intent();
                        intent.putExtra("callbackId", rechargeCoinMergeActivity.F1);
                        intent.putExtra(NotificationCompat.CATEGORY_MESSAGE, rechargeCoinMergeActivity.getString(2131845021));
                        PaymentChannel.PayStatus payStatus = PaymentChannel.PayStatus.SUC;
                        intent.putExtra("rechargeResultCode", payStatus.code());
                        intent.putExtra("rechargeResult", (String) null);
                        rechargeCoinMergeActivity.setResult(-1, intent);
                        rechargeCoinMergeActivity.finish();
                        BiliPay.BiliPayRechargeCallback biliPayRechargeCallbackPopRechargeCallback = BiliPay.popRechargeCallback(rechargeCoinMergeActivity.F1);
                        if (biliPayRechargeCallbackPopRechargeCallback != null) {
                            biliPayRechargeCallbackPopRechargeCallback.onRechargeResult(payStatus.code(), rechargeCoinMergeActivity.getString(2131845021), (String) null);
                        }
                        break;
                    case 4:
                        com.bilibili.pegasus.holders.oversea.q qVar = (com.bilibili.pegasus.holders.oversea.q) this.f8517b;
                        rp0.p.c(qVar, false, ListExtentionsKt.getGlobalRect(qVar.f78048k.f53944d.f54012f));
                        break;
                    default:
                        ((Function1) this.f8517b).invoke(view);
                        break;
                }
            }
        });
    }

    public final Bundle C0() {
        Bundle bundle;
        C7608a c7608a = (C7608a) getBindData();
        if (c7608a != null) {
            String cardGoto = ((C7608a) getBindData()).getCardGoto();
            Lazy lazy = C6963a.f117350a;
            Bundle bundle2 = new Bundle();
            bundle = bundle2;
            if (c7608a.getPlayerArgs() != null) {
                if (c7608a.getArgs() == null) {
                    bundle = bundle2;
                } else {
                    bundle2.putInt("liveInlineDanmuOn", 0);
                    C6963a.b(c7608a.getArgs(), bundle2);
                    C6963a.d(c7608a.getPlayerArgs(), bundle2);
                    C6963a.c(c7608a, bundle2);
                    bundle2.putBoolean("is_manual", false);
                    bundle2.putString("card_goto", cardGoto);
                    bundle2.putBoolean("is_atten", c7608a.isAtten());
                    bundle2.putInt("play_item_hash_code", c7608a.hashCode());
                    bundle2.putInt("official_icon", c7608a.getOfficialIconV2());
                    bundle2.putInt("cover_left_icon_1", c7608a.getCoverLeftIcon1());
                    bundle2.putString("cover_left_text_1", c7608a.getCoverLeftText1());
                    bundle2.putString("cover_left_text_2", c7608a.getCoverLeftText2());
                    bundle2.putParcelable("right_top_live_badge", c7608a.getRightTopLiveBadge());
                    bundle = bundle2;
                }
            }
        } else {
            bundle = null;
        }
        return bundle;
    }

    public final void D0(String str) {
        IPegasusLiveInlineCardReportService iPegasusLiveInlineCardReportServiceA;
        Bundle bundleC0 = C0();
        if (bundleC0 != null && (iPegasusLiveInlineCardReportServiceA = C8339C.a()) != null) {
            iPegasusLiveInlineCardReportServiceA.onCardClick(bundleC0);
        }
        C7608a c7608a = (C7608a) getBindData();
        if (c7608a != null) {
            C8340D.g(c7608a, null, null, str, null, 27);
        }
    }

    public final void E0() {
        C7608a c7608a = (C7608a) getBindData();
        String strK = null;
        Y0 y02 = this.f78048k;
        if (c7608a != null && Intrinsics.areEqual(c7608a.getTranslatedStatus(), "TRANSLATED")) {
            TagSpanTextView tagSpanTextView = y02.f53944d.f54011e;
            C7608a c7608a2 = (C7608a) getBindData();
            if (c7608a2 != null) {
                strK = c7608a2.k();
            }
            ListExtentionsKt.setText(tagSpanTextView, strK);
            return;
        }
        TagSpanTextView tagSpanTextView2 = y02.f53944d.f54011e;
        C7608a c7608a3 = (C7608a) getBindData();
        String title = null;
        if (c7608a3 != null) {
            title = c7608a3.getTitle();
        }
        ListExtentionsKt.setText(tagSpanTextView2, title);
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
            com.bilibili.pegasus.holders.oversea.K r0 = (com.bilibili.pegasus.holders.oversea.K) r0
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
            com.bilibili.pegasus.holders.oversea.K r0 = (com.bilibili.pegasus.holders.oversea.K) r0
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
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.oversea.q.S():boolean");
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
            K k7 = (K) this.f77861g;
            if (((k7 == null || (cardPlayerContext = k7.getCardPlayerContext()) == null) ? null : cardPlayerContext.getVideoEnvironment()) == VideoEnvironment.MOBILE_DATA) {
                PlayReason playReason = PlayReason.INLINE_MANUAL_PLAY;
                C7608a c7608a = (C7608a) getBindData();
                PlayReason playReason2 = null;
                if (c7608a != null) {
                    SingleColumnInlineProperty singleColumnInlineProperty = c7608a.f121976c1;
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
        C7608a c7608a = (C7608a) getBindData();
        if (c7608a != null) {
            ArgsData args = c7608a.getArgs();
            if (args != null) {
                tid = args.getTid();
                rid = args.getRid();
            } else {
                tid = 0;
                rid = 0;
            }
            long oid = c7608a.getOid();
            long jG = c7608a.g();
            String uri = c7608a.getUri();
            String str = uri;
            if (uri == null) {
                str = "";
            }
            InlinePlayerTrackerCallbackKt.addInlineTrackerCallback(cardPlayTask, new LiveInlineTrackerCallback(new LivePlayerDataTracker.TrackerRawData(oid, jG, tid, rid, str, CardTypeKt.getCARD_TYPE_PEGASUS_DOUBLE_LIVE_CARD_INLINE(), 5, c7608a.getTrackId())));
        }
        cardPlayTask.setChronosEnable(false);
        cardPlayTask.addPlayerStateChangedCallback(new a(this));
        LiveInlineBufferingCallback liveInlineBufferingCallback = this.f78053p;
        if (liveInlineBufferingCallback != null) {
            cardPlayTask.addPlayerBufferingCallback(liveInlineBufferingCallback);
        }
        return cardPlayTask;
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final boolean d() {
        C7608a c7608a = (C7608a) getBindData();
        boolean z6 = false;
        if (c7608a != null) {
            z6 = false;
            if (c7608a.getShareMenuEnable()) {
                z6 = true;
            }
        }
        return z6;
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final BasePegasusPlayerData getData() {
        return (C7608a) getBindData();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.pegasus.common.inline.InterfaceC5582a
    @NotNull
    public final View getItemView() {
        return this.itemView;
    }

    @NotNull
    public final Class<K> getPanelType() {
        return K.class;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onBind(com.bilibili.pegasus.PegasusHolderData r16, java.util.List r17) {
        /*
            Method dump skipped, instruction units count: 889
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.oversea.q.onBind(com.bilibili.pegasus.PegasusHolderData, java.util.List):void");
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5656f
    public final void onBindPanel(InlinePanel inlinePanel) {
        K k7 = (K) inlinePanel;
        super.onBindPanel(k7);
        final C7608a c7608a = (C7608a) getBindData();
        if (c7608a == null) {
            return;
        }
        PegasusInlineMuteWidget pegasusInlineMuteWidget = k7.f77925l;
        if (pegasusInlineMuteWidget == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mute");
            pegasusInlineMuteWidget = null;
        }
        pegasusInlineMuteWidget.setSupportGuidance(true);
        Map mapMutableMapOf = MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("from_type", c7608a.getFromType()), TuplesKt.to("goto", c7608a.getCardGoto()), TuplesKt.to("param", c7608a.getParam()), TuplesKt.to("card_type", c7608a.getCardType()), TuplesKt.to("style", C8340D.e())});
        InlineMuteWidgetV3 inlineMuteWidgetV3 = k7.f77925l;
        if (inlineMuteWidgetV3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mute");
            inlineMuteWidgetV3 = null;
        }
        inlineMuteWidgetV3.setVolumeGuidanceListener(new pp0.g(c7608a));
        InlineMuteWidgetV3 inlineMuteWidgetV32 = k7.f77925l;
        if (inlineMuteWidgetV32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mute");
            inlineMuteWidgetV32 = null;
        }
        inlineMuteWidgetV32.setMuteStateChangeListener(new pp0.t(c7608a, null));
        final String str = null;
        k7.getDanmaku().setOnWidgetClickListener(new Function2(c7608a, str) { // from class: pp0.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C7608a f125520a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f125521b;

            {
                this.f125520a = c7608a;
                this.f125521b = str;
            }

            public final Object invoke(Object obj, Object obj2) {
                C8339C.b(this.f125520a, ((Boolean) obj).booleanValue(), this.f125521b, (Map) obj2);
                return Unit.INSTANCE;
            }
        });
        Inline4GWarningWidgetV3 inline4GWarningWidgetV3 = k7.f77927n;
        if (inline4GWarningWidgetV3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inline4GWarningWidget");
            inline4GWarningWidgetV3 = null;
        }
        inline4GWarningWidgetV3.setOnWidgetClickListener(new pp0.u(mapMutableMapOf));
        View view = k7.h;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avatar");
            view = null;
        }
        ListExtentionsKt.gone(view);
        k7.getDanmaku().setVisible(false);
        k7.getDanmaku().setVisibility(8);
        VectorTextView vectorTextView = k7.f77923j;
        if (vectorTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverLeftText1");
            vectorTextView = null;
        }
        C8615d.a(vectorTextView, c7608a.getCoverLeftText1(), c7608a.getCoverLeftIcon1());
        VectorTextView vectorTextView2 = k7.f77924k;
        if (vectorTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverLeftText2");
            vectorTextView2 = null;
        }
        C8615d.a(vectorTextView2, c7608a.getCoverLeftText2(), c7608a.getCoverLeftIcon2());
        k7.setOnClickListener(new com.bilibili.bililive.room.ui.roomv3.voice.m(this, 2));
        final int i7 = 0;
        k7.setOnLongClickListener(new Function1(this, i7) { // from class: com.bilibili.pegasus.holders.oversea.p

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f78046a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f78047b;

            {
                this.f78046a = i7;
                this.f78047b = this;
            }

            public final Object invoke(Object obj) {
                switch (this.f78046a) {
                    case 0:
                        q qVar = (q) this.f78047b;
                        rp0.p.c(qVar, true, ListExtentionsKt.getGlobalRect(qVar.f78048k.f53944d.f54012f));
                        return Boolean.TRUE;
                    default:
                        ((Function1) this.f78047b).invoke(new r0(new b.b((home.sidecenter.recent.o) obj)));
                        return Unit.INSTANCE;
                }
            }
        });
        ListLottieBadgeTagView listLottieBadgeTagView = k7.f77926m;
        if (listLottieBadgeTagView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveBadge");
            listLottieBadgeTagView = null;
        }
        C6829b c6829bB = c7608a.b();
        String strB = c6829bB != null ? c6829bB.b() : null;
        C6829b c6829bB2 = c7608a.b();
        String strC = c6829bB2 != null ? c6829bB2.c() : null;
        C6829b c6829bB3 = c7608a.b();
        listLottieBadgeTagView.j0(c6829bB3 != null ? Integer.valueOf(c6829bB3.a()) : null, strB, strC);
        InlineTask inlineToastTask = new InlineToastTask(k7);
        InlineTask inlineTask = k7.f77927n;
        if (inlineTask == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inline4GWarningWidget");
            inlineTask = null;
        }
        new InlineTaskScheduler(CollectionsKt.listOf(new InlineTask[]{inlineTask, inlineToastTask})).execute();
        LiveInlineBufferingCallback liveInlineBufferingCallback = this.f78053p;
        if (liveInlineBufferingCallback != null) {
            liveInlineBufferingCallback.checkLiveCanPlay(c7608a.getOid());
        }
    }

    /* JADX INFO: renamed from: onHolderVisibleStateChanged-9yN0R78, reason: not valid java name */
    public final void m8128onHolderVisibleStateChanged9yN0R78(int i7, int i8) {
        IInlineControl inlineControl;
        super/*com.bilibili.pegasus.PegasusHolder*/.onHolderVisibleStateChanged-9yN0R78(i7, i8);
        if (HolderVisibleState.getAllVisible-impl(i8) || (inlineControl = getInlineControl()) == null) {
            return;
        }
        inlineControl.stopPlay(this);
    }

    public final void onPageScrollStateChanged(@NotNull RecyclerView recyclerView, int i7) {
        K k7;
        super/*com.bilibili.pegasus.PegasusHolder*/.onPageScrollStateChanged(recyclerView, i7);
        if (i7 != 1 || (k7 = (K) this.f77861g) == null) {
            return;
        }
        k7.showWidgets();
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final void setPlaySpeed(float f7) {
    }

    public final void updateCardLive(boolean z6) {
        RightTopLiveBadge rightTopLiveBadge;
        C7608a c7608a = (C7608a) getBindData();
        if (c7608a == null) {
            return;
        }
        boolean z7 = this.f78049l;
        this.f78049l = z6;
        Y0 y02 = this.f78048k;
        if (z7 && !z6) {
            z0().setIconVisible(false);
            ListExtentionsKt.visible(y02.f53943c.f54034b);
            f1 f1Var = y02.f53943c;
            ListExtentionsKt.gone(f1Var.f54035c);
            ListExtentionsKt.gone(f1Var.f54036d);
        } else if (z7 || !z6) {
            z0().setIconVisible(false);
            Unit unit = Unit.INSTANCE;
        } else {
            ListExtentionsKt.gone(y02.f53943c.f54034b);
            f1 f1Var2 = y02.f53943c;
            ListExtentionsKt.visible(f1Var2.f54035c);
            ListExtentionsKt.visible(f1Var2.f54036d);
        }
        K k7 = (K) this.f77861g;
        if (k7 != null) {
            ViewGroup viewGroup = k7.f77926m;
            if (viewGroup == null) {
                Intrinsics.throwUninitializedPropertyAccessException("liveBadge");
                viewGroup = null;
            }
            if (viewGroup != null) {
                viewGroup.setVisibility(z6 ? 0 : 8);
            }
        }
        this.f78052o.setVisibility(z6 ? 0 : 8);
        C7608a c7608a2 = (C7608a) getBindData();
        if (c7608a2 != null && (rightTopLiveBadge = c7608a2.getRightTopLiveBadge()) != null) {
            rightTopLiveBadge.setLiveStatus(z6 ? 1 : 0);
        }
        RightTopLiveBadge rightTopLiveBadge2 = c7608a.getRightTopLiveBadge();
        if (rightTopLiveBadge2 != null) {
            rightTopLiveBadge2.setLiveStatus(z6 ? 1 : 0);
        }
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final long w() {
        ICardPlayerContext cardPlayerContext;
        K k7 = (K) this.f77861g;
        return (k7 == null || (cardPlayerContext = k7.getCardPlayerContext()) == null) ? 0L : cardPlayerContext.getCurrentPosition();
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
            ip0.a r0 = (ip0.C7608a) r0
            r14 = r0
            r0 = r14
            if (r0 != 0) goto Lf
            return
        Lf:
            r0 = r7
            com.bilibili.app.comm.list.widget.play.CardFragmentPlayerContainerLayout r0 = r0.z0()
            r13 = r0
            Vn.b r0 = new Vn.b
            r1 = r0
            r2 = r7
            r3 = 3
            r1.<init>(r2, r3)
            r11 = r0
            com.bilibili.ad.adview.videodetail.pausedpage.m r0 = new com.bilibili.ad.adview.videodetail.pausedpage.m
            r1 = r0
            r2 = r7
            r3 = 3
            r1.<init>(r2, r3)
            r12 = r0
            r0 = r14
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
            r0 = r14
            boolean r0 = r0.isInlinePlayable()
            if (r0 == 0) goto L72
            r0 = r14
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
            r0 = r13
            r1 = r11
            r2 = r12
            r3 = r8
            r4 = r9
            r5 = r14
            java.util.Map r5 = pp0.C8340D.d(r5)
            r0.bindViewPlay(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.oversea.q.y0():void");
    }
}
