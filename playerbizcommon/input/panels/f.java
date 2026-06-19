package com.bilibili.playerbizcommon.input.panels;

import G3.C1;
import Kq.n;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.alibaba.fastjson.JSON;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.moduleservice.ad.AdUIReportService;
import com.bilibili.playerbizcommon.features.danmaku.view.PlayerAutoLineLayout;
import com.bilibili.playerbizcommon.input.InputPanelContainer;
import com.bilibili.playerbizcommon.playerinput.utils.InputExtensionsKt;
import im.session.w0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.interact.core.command.CommandsDanmaku;
import tv.danmaku.biliplayerv2.service.interact.core.command.CommandsPanel;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/input/panels/f.class */
public final class f extends Cq0.a implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Cq0.b f80179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Cq0.h<b> f80180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Cq0.h<Dq0.a> f80181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public InteractDanmakuListPanel f80182g;
    public TextView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f80183i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PlayerAutoLineLayout f80184j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public CommandsPanel f80185k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public List<CommandsDanmaku> f80186l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public TextView f80187m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Lazy f80188n = LazyKt.lazy(new C1(11));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/input/panels/f$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f80189a;

        static {
            int[] iArr = new int[ScreenModeType.values().length];
            try {
                iArr[ScreenModeType.LANDSCAPE_FULLSCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            f80189a = iArr;
        }
    }

    @Override // Cq0.a
    public final void k() {
        ArrayList<CommandsPanel.Panel> panels;
        TextView textView = this.h;
        TextView textView2 = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPanelTipView");
            textView2 = null;
        }
        CommandsPanel commandsPanel = this.f80185k;
        textView2.setText(commandsPanel != null ? commandsPanel.getTips() : null);
        PlayerAutoLineLayout playerAutoLineLayout = this.f80184j;
        PlayerAutoLineLayout playerAutoLineLayout2 = playerAutoLineLayout;
        if (playerAutoLineLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCommandGroupView");
            playerAutoLineLayout2 = null;
        }
        if (Intrinsics.areEqual(playerAutoLineLayout2.getTag(), this.f80185k)) {
            return;
        }
        PlayerAutoLineLayout playerAutoLineLayout3 = this.f80184j;
        PlayerAutoLineLayout playerAutoLineLayout4 = playerAutoLineLayout3;
        if (playerAutoLineLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCommandGroupView");
            playerAutoLineLayout4 = null;
        }
        playerAutoLineLayout4.removeAllViews();
        PlayerAutoLineLayout playerAutoLineLayout5 = this.f80184j;
        PlayerAutoLineLayout playerAutoLineLayout6 = playerAutoLineLayout5;
        if (playerAutoLineLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCommandGroupView");
            playerAutoLineLayout6 = null;
        }
        playerAutoLineLayout6.setTag(this.f80185k);
        CommandsPanel commandsPanel2 = this.f80185k;
        if (commandsPanel2 == null || (panels = commandsPanel2.getPanels()) == null) {
            return;
        }
        for (CommandsPanel.Panel panel : panels) {
            PlayerAutoLineLayout playerAutoLineLayout7 = this.f80184j;
            PlayerAutoLineLayout playerAutoLineLayout8 = playerAutoLineLayout7;
            if (playerAutoLineLayout7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCommandGroupView");
                playerAutoLineLayout8 = null;
            }
            View viewInflate = LayoutInflater.from(playerAutoLineLayout8.getContext()).inflate(2131495188, (ViewGroup) null, false);
            viewInflate.setOnClickListener(this);
            BiliImageView biliImageViewFindViewById = viewInflate.findViewById(2131299177);
            TextView textView3 = (TextView) viewInflate.findViewById(2131299180);
            ViewGroup viewGroup = (ViewGroup) viewInflate.findViewById(2131299178);
            Cq0.b bVar = this.f80179d;
            Cq0.b bVar2 = bVar;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                bVar2 = null;
            }
            if (InputExtensionsKt.isDarkTheme(bVar2)) {
                textView3.setTextColor(ContextCompat.getColor(textView3.getContext(), R$color.Text3));
                viewGroup.setBackgroundResource(2131238468);
            } else {
                textView3.setTextColor(ContextCompat.getColor(textView3.getContext(), 2131101219));
                viewGroup.setBackgroundResource(2131238467);
            }
            BiliImageLoader.INSTANCE.with(biliImageViewFindViewById.getContext()).url(panel.getIcon()).into(biliImageViewFindViewById);
            textView3.setText(panel.getTitle());
            viewInflate.setTag(panel);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(NewPlayerUtilsKt.toPx(85.0f), -2);
            PlayerAutoLineLayout playerAutoLineLayout9 = this.f80184j;
            PlayerAutoLineLayout playerAutoLineLayout10 = playerAutoLineLayout9;
            if (playerAutoLineLayout9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCommandGroupView");
                playerAutoLineLayout10 = null;
            }
            playerAutoLineLayout10.addView(viewInflate, layoutParams);
        }
    }

    @Override // Cq0.a
    public final void l(@NotNull Cq0.b bVar) {
        this.f80179d = bVar;
    }

    @Override // Cq0.a
    @NotNull
    public final ViewGroup n(@NotNull Context context, @NotNull ViewGroup viewGroup) {
        return (ViewGroup) LayoutInflater.from(context).inflate(2131496399, viewGroup, false);
    }

    @Override // Cq0.a
    public final void o() {
        this.f80182g = null;
        CommandsPanel commandsPanel = this.f80185k;
        if ((commandsPanel != null ? commandsPanel.getPanels() : null) == null) {
            PlayerAutoLineLayout playerAutoLineLayout = this.f80184j;
            if (playerAutoLineLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCommandGroupView");
                playerAutoLineLayout = null;
            }
            playerAutoLineLayout.removeAllViews();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        Object tag;
        CommandsPanel.Panel.Extra extra;
        b bVar;
        Dq0.a aVar;
        if (view == null || (tag = view.getTag()) == null || !(tag instanceof CommandsPanel.Panel)) {
            return;
        }
        CommandsPanel.Panel panel = (CommandsPanel.Panel) tag;
        int type = panel.getType();
        String str = type != 2 ? type != 5 ? type != 9 ? type != 11 ? type != 18 ? type != 19 ? null : "#GOODSLIKEVOTE#" : "#GOODSLIKE#" : "#GRADE#" : "#VOTE#" : "#ATTENTION#" : "#LINK#";
        if (str != null) {
            try {
                extra = (CommandsPanel.Panel.Extra) JSON.parseObject(panel.getExtra(), CommandsPanel.Panel.Extra.class);
            } catch (Exception e7) {
                extra = null;
            }
            int limit = extra != null ? extra.getLimit() : 0;
            if (limit > 0) {
                List<CommandsDanmaku> list = this.f80186l;
                int i7 = 0;
                if (list != null) {
                    List<CommandsDanmaku> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it = list2.iterator();
                        int i8 = 0;
                        while (true) {
                            i7 = i8;
                            if (!it.hasNext()) {
                                break;
                            }
                            if (Intrinsics.areEqual(((CommandsDanmaku) it.next()).getCommand(), str)) {
                                int i9 = i8 + 1;
                                i8 = i9;
                                if (i9 < 0) {
                                    CollectionsKt.throwCountOverflow();
                                    i8 = i9;
                                }
                            }
                        }
                    } else {
                        i7 = 0;
                    }
                }
                if (i7 >= limit) {
                    ToastHelper.showToastShort(view.getContext(), view.getContext().getString(2131845908));
                    return;
                }
            }
        }
        Cq0.b bVar2 = this.f80179d;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputController");
            bVar2 = null;
        }
        Qq0.a aVarE = bVar2.e();
        if (aVarE != null) {
            aVarE.R(panel.getType());
        }
        Cq0.h<Dq0.a> hVarX = x();
        if (hVarX != null && (aVar = (Dq0.a) hVarX.a()) != null) {
            aVar.f3013l = panel;
        }
        Cq0.h<Dq0.a> hVarX2 = x();
        if (hVarX2 != null) {
            hVarX2.b();
        }
        Cq0.h<b> hVarW = w();
        if (hVarW != null && (bVar = (b) hVarW.a()) != null) {
            bVar.h = panel;
        }
        Cq0.h<b> hVarW2 = w();
        if (hVarW2 != null) {
            hVarW2.b();
        }
    }

    @Override // Cq0.a
    public final void p() {
        this.f80182g = null;
    }

    @Override // Cq0.a
    public final void s() {
        ArrayList panels;
        Object next;
        AdUIReportService adUIReportService;
        List<CommandsDanmaku> list = this.f80186l;
        if (list == null || list.isEmpty()) {
            TextView textView = this.f80187m;
            if (textView != null) {
                textView.setVisibility(4);
            }
        } else {
            TextView textView2 = this.f80187m;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            TextView textView3 = this.f80187m;
            if (textView3 != null) {
                textView3.setOnClickListener(new n(this, 1));
            }
        }
        CommandsPanel commandsPanel = this.f80185k;
        if (commandsPanel == null || (panels = commandsPanel.getPanels()) == null) {
            return;
        }
        Iterator it = panels.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((CommandsPanel.Panel) next).getType() == 18) {
                    break;
                }
            }
        }
        if (((CommandsPanel.Panel) next) == null || (adUIReportService = (AdUIReportService) this.f80188n.getValue()) == null) {
            return;
        }
        Cq0.b bVar = this.f80179d;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputController");
            bVar = null;
        }
        adUIReportService.uiReport("engagement_create_show", MapsKt.hashMapOf(new Pair[]{TuplesKt.to(GameCardButton.extraAvid, String.valueOf(bVar.getAvid())), TuplesKt.to("danmaku_type", "18")}));
    }

    @Override // Cq0.a
    public final void v(@NotNull ViewGroup viewGroup) {
        this.h = (TextView) viewGroup.findViewById(2131299179);
        this.f80183i = (TextView) viewGroup.findViewById(2131299180);
        this.f80184j = (PlayerAutoLineLayout) viewGroup.findViewById(2131299828);
        this.f80187m = (TextView) viewGroup.findViewById(2131303786);
        Cq0.b bVar = this.f80179d;
        Cq0.b bVar2 = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputController");
            bVar2 = null;
        }
        if (InputExtensionsKt.isDarkTheme(bVar2)) {
            viewGroup.setBackgroundColor(Color.parseColor("#0C0C0C"));
            TextView textView = this.h;
            TextView textView2 = textView;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPanelTipView");
                textView2 = null;
            }
            textView2.setTextColor(ThemeUtils.getColorById(viewGroup.getContext(), R$color.Ga7));
            TextView textView3 = this.f80183i;
            TextView textView4 = textView3;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCommandTitleView");
                textView4 = null;
            }
            textView4.setTextColor(ThemeUtils.getColorById(viewGroup.getContext(), R$color.Ga5));
        } else {
            viewGroup.setBackgroundResource(2131100282);
            TextView textView5 = this.h;
            TextView textView6 = textView5;
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPanelTipView");
                textView6 = null;
            }
            textView6.setTextColor(ThemeUtils.getColorById(viewGroup.getContext(), R$color.Ga5));
            TextView textView7 = this.f80183i;
            TextView textView8 = textView7;
            if (textView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCommandTitleView");
                textView8 = null;
            }
            textView8.setTextColor(ThemeUtils.getColorById(viewGroup.getContext(), R$color.Ga10));
        }
        Cq0.b bVar3 = this.f80179d;
        if (bVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputController");
            bVar3 = null;
        }
        if (InputExtensionsKt.isLandscape(bVar3)) {
            viewGroup.setPadding(NewPlayerUtilsKt.toPx(60.0f), viewGroup.getPaddingTop(), NewPlayerUtilsKt.toPx(60.0f), viewGroup.getPaddingBottom());
        } else {
            viewGroup.setPadding(NewPlayerUtilsKt.toPx(12.0f), viewGroup.getPaddingTop(), NewPlayerUtilsKt.toPx(12.0f), viewGroup.getPaddingBottom());
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public final Cq0.h<b> w() {
        if (this.f80180e == null) {
            Cq0.b bVar = this.f80179d;
            Cq0.b bVar2 = bVar;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                bVar2 = null;
            }
            InputPanelContainer panelContainer = bVar2.getPanelContainer();
            Cq0.h<b> hVarD = null;
            if (panelContainer != null) {
                Cq0.b bVar3 = this.f80179d;
                if (bVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                    bVar3 = null;
                }
                Cq0.g gVar = new Cq0.g(bVar3);
                Cq0.g.a(gVar, b.class, new Object(), 2);
                gVar.f1712d = false;
                hVarD = panelContainer.d(gVar);
            }
            this.f80180e = hVarD;
        }
        return this.f80180e;
    }

    public final Cq0.h<Dq0.a> x() {
        if (this.f80181f == null) {
            Cq0.b bVar = this.f80179d;
            Cq0.b bVar2 = bVar;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                bVar2 = null;
            }
            InputPanelContainer inputPanelContainerH = bVar2.h();
            Cq0.h<Dq0.a> hVarD = null;
            if (inputPanelContainerH != null) {
                Cq0.b bVar3 = this.f80179d;
                if (bVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                    bVar3 = null;
                }
                Cq0.g gVar = new Cq0.g(bVar3);
                final int i7 = 0;
                Cq0.g.a(gVar, Dq0.a.class, new Function1(i7) { // from class: com.bilibili.playerbizcommon.input.panels.e

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f80178a;

                    {
                        this.f80178a = i7;
                    }

                    public final Object invoke(Object obj) {
                        switch (this.f80178a) {
                            case 0:
                                return Unit.INSTANCE;
                            default:
                                return Boolean.valueOf(!((w0) obj).h.b());
                        }
                    }
                }, 2);
                gVar.f1712d = false;
                hVarD = inputPanelContainerH.d(gVar);
            }
            this.f80181f = hVarD;
        }
        return this.f80181f;
    }
}
