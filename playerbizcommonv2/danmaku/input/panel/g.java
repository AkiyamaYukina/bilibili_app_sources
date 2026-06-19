package com.bilibili.playerbizcommonv2.danmaku.input.panel;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.bplus.followingcard.widget.k0;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.moduleservice.ad.AdUIReportService;
import com.bilibili.playerbizcommonv2.danmaku.input.InputPanelContainer;
import com.bilibili.playerbizcommonv2.danmaku.view.PlayerAutoLineLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rr0.ViewOnClickListenerC8540a;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import tv.danmaku.biliplayerv2.service.interact.core.command.CommandsDanmaku;
import tv.danmaku.biliplayerv2.service.interact.core.command.CommandsPanel;
import xr0.C9001a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/g.class */
@StabilityInferred(parameters = 0)
public final class g extends a implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.bilibili.playerbizcommonv2.danmaku.input.a f81127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public com.bilibili.playerbizcommonv2.danmaku.input.e<c> f81128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public com.bilibili.playerbizcommonv2.danmaku.input.e<ViewOnClickListenerC8540a> f81129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public r f81130g;
    public TextView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f81131i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PlayerAutoLineLayout f81132j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public TextView f81133k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Lazy f81134l = LazyKt.lazy(new Jj1.b(8));

    @Override // com.bilibili.playerbizcommonv2.danmaku.input.panel.a
    public final void k() {
        ArrayList<CommandsPanel.Panel> panels;
        String listTitle;
        TextView textView;
        String title;
        TextView textView2 = this.h;
        TextView textView3 = textView2;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPanelTipView");
            textView3 = null;
        }
        CommandsPanel commandsPanelX = x();
        textView3.setText(commandsPanelX != null ? commandsPanelX.getTips() : null);
        CommandsPanel commandsPanelX2 = x();
        if (commandsPanelX2 != null && (title = commandsPanelX2.getTitle()) != null && !StringsKt.isBlank(title)) {
            TextView textView4 = this.f81131i;
            TextView textView5 = textView4;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCommandTitleView");
                textView5 = null;
            }
            textView5.setText(title);
        }
        CommandsPanel commandsPanelX3 = x();
        if (commandsPanelX3 != null && (listTitle = commandsPanelX3.getListTitle()) != null && !StringsKt.isBlank(listTitle) && (textView = this.f81133k) != null) {
            textView.setText(listTitle);
        }
        PlayerAutoLineLayout playerAutoLineLayout = this.f81132j;
        PlayerAutoLineLayout playerAutoLineLayout2 = playerAutoLineLayout;
        if (playerAutoLineLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCommandGroupView");
            playerAutoLineLayout2 = null;
        }
        if (Intrinsics.areEqual(playerAutoLineLayout2.getTag(), x())) {
            return;
        }
        PlayerAutoLineLayout playerAutoLineLayout3 = this.f81132j;
        PlayerAutoLineLayout playerAutoLineLayout4 = playerAutoLineLayout3;
        if (playerAutoLineLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCommandGroupView");
            playerAutoLineLayout4 = null;
        }
        playerAutoLineLayout4.removeAllViews();
        PlayerAutoLineLayout playerAutoLineLayout5 = this.f81132j;
        PlayerAutoLineLayout playerAutoLineLayout6 = playerAutoLineLayout5;
        if (playerAutoLineLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCommandGroupView");
            playerAutoLineLayout6 = null;
        }
        playerAutoLineLayout6.setTag(x());
        CommandsPanel commandsPanelX4 = x();
        if (commandsPanelX4 == null || (panels = commandsPanelX4.getPanels()) == null) {
            return;
        }
        for (CommandsPanel.Panel panel : panels) {
            PlayerAutoLineLayout playerAutoLineLayout7 = this.f81132j;
            PlayerAutoLineLayout playerAutoLineLayout8 = playerAutoLineLayout7;
            if (playerAutoLineLayout7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCommandGroupView");
                playerAutoLineLayout8 = null;
            }
            View viewInflate = LayoutInflater.from(playerAutoLineLayout8.getContext()).inflate(2131495189, (ViewGroup) null, false);
            viewInflate.setOnClickListener(this);
            BiliImageView biliImageViewFindViewById = viewInflate.findViewById(2131299177);
            TextView textView6 = (TextView) viewInflate.findViewById(2131299180);
            ViewGroup viewGroup = (ViewGroup) viewInflate.findViewById(2131299178);
            com.bilibili.playerbizcommonv2.danmaku.input.a aVar = this.f81127d;
            com.bilibili.playerbizcommonv2.danmaku.input.a aVar2 = aVar;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                aVar2 = null;
            }
            if (C9001a.a(aVar2)) {
                textView6.setTextColor(ContextCompat.getColor(textView6.getContext(), R$color.Text3));
                viewGroup.setBackgroundResource(2131238468);
            } else {
                textView6.setTextColor(ContextCompat.getColor(textView6.getContext(), 2131101219));
                viewGroup.setBackgroundResource(2131238467);
            }
            BiliImageLoader.INSTANCE.with(biliImageViewFindViewById.getContext()).url(panel.getIcon()).into(biliImageViewFindViewById);
            textView6.setText(panel.getTitle());
            viewInflate.setTag(panel);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(NewPlayerUtilsKt.toPx(85.0f), -2);
            PlayerAutoLineLayout playerAutoLineLayout9 = this.f81132j;
            PlayerAutoLineLayout playerAutoLineLayout10 = playerAutoLineLayout9;
            if (playerAutoLineLayout9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCommandGroupView");
                playerAutoLineLayout10 = null;
            }
            playerAutoLineLayout10.addView(viewInflate, layoutParams);
        }
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.input.panel.a
    public final void l(@NotNull com.bilibili.playerbizcommonv2.danmaku.input.a aVar) {
        this.f81127d = aVar;
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.input.panel.a
    @NotNull
    public final ViewGroup m(@NotNull Context context, @NotNull ViewGroup viewGroup) {
        return (ViewGroup) LayoutInflater.from(context).inflate(2131496603, viewGroup, false);
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.input.panel.a
    public final void n() {
        this.f81130g = null;
        CommandsPanel commandsPanelX = x();
        if ((commandsPanelX != null ? commandsPanelX.getPanels() : null) == null) {
            PlayerAutoLineLayout playerAutoLineLayout = this.f81132j;
            if (playerAutoLineLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCommandGroupView");
                playerAutoLineLayout = null;
            }
            playerAutoLineLayout.removeAllViews();
        }
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.input.panel.a
    public final void o() {
        this.f81130g = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a7  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onClick(@org.jetbrains.annotations.Nullable android.view.View r9) {
        /*
            Method dump skipped, instruction units count: 815
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.input.panel.g.onClick(android.view.View):void");
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.input.panel.a
    public final void r() {
        ArrayList panels;
        Object next;
        AdUIReportService adUIReportService;
        if (y().isEmpty()) {
            TextView textView = this.f81133k;
            if (textView != null) {
                textView.setVisibility(4);
            }
        } else {
            TextView textView2 = this.f81133k;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            TextView textView3 = this.f81133k;
            if (textView3 != null) {
                textView3.setOnClickListener(new k0(this, 1));
            }
        }
        CommandsPanel commandsPanelX = x();
        if (commandsPanelX == null || (panels = commandsPanelX.getPanels()) == null) {
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
        if (((CommandsPanel.Panel) next) == null || (adUIReportService = (AdUIReportService) this.f81134l.getValue()) == null) {
            return;
        }
        com.bilibili.playerbizcommonv2.danmaku.input.a aVar = this.f81127d;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputController");
            aVar = null;
        }
        adUIReportService.uiReport("engagement_create_show", MapsKt.hashMapOf(new Pair[]{TuplesKt.to(GameCardButton.extraAvid, String.valueOf(aVar.t().p())), TuplesKt.to("danmaku_type", "18")}));
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.input.panel.a
    public final void u(@NotNull ViewGroup viewGroup) {
        this.h = (TextView) viewGroup.findViewById(2131299179);
        this.f81131i = (TextView) viewGroup.findViewById(2131299180);
        this.f81132j = (PlayerAutoLineLayout) viewGroup.findViewById(2131299828);
        this.f81133k = (TextView) viewGroup.findViewById(2131303786);
        com.bilibili.playerbizcommonv2.danmaku.input.a aVar = this.f81127d;
        com.bilibili.playerbizcommonv2.danmaku.input.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputController");
            aVar2 = null;
        }
        if (C9001a.a(aVar2)) {
            viewGroup.setBackgroundColor(Color.parseColor("#0C0C0C"));
            TextView textView = this.h;
            TextView textView2 = textView;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPanelTipView");
                textView2 = null;
            }
            textView2.setTextColor(ThemeUtils.getColorById(viewGroup.getContext(), R$color.Ga7));
            TextView textView3 = this.f81131i;
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
            TextView textView7 = this.f81131i;
            TextView textView8 = textView7;
            if (textView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCommandTitleView");
                textView8 = null;
            }
            textView8.setTextColor(ThemeUtils.getColorById(viewGroup.getContext(), R$color.Ga10));
        }
        com.bilibili.playerbizcommonv2.danmaku.input.a aVar3 = this.f81127d;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputController");
            aVar3 = null;
        }
        if (C9001a.b(aVar3)) {
            viewGroup.setPadding(NewPlayerUtilsKt.toPx(60.0f), viewGroup.getPaddingTop(), NewPlayerUtilsKt.toPx(60.0f), viewGroup.getPaddingBottom());
        } else {
            viewGroup.setPadding(NewPlayerUtilsKt.toPx(12.0f), viewGroup.getPaddingTop(), NewPlayerUtilsKt.toPx(12.0f), viewGroup.getPaddingBottom());
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public final com.bilibili.playerbizcommonv2.danmaku.input.e<c> v() {
        if (this.f81128e == null) {
            com.bilibili.playerbizcommonv2.danmaku.input.a aVar = this.f81127d;
            com.bilibili.playerbizcommonv2.danmaku.input.a aVar2 = aVar;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                aVar2 = null;
            }
            InputPanelContainer panelContainer = aVar2.getPanelContainer();
            com.bilibili.playerbizcommonv2.danmaku.input.e<c> eVarE = null;
            if (panelContainer != null) {
                com.bilibili.playerbizcommonv2.danmaku.input.a aVar3 = this.f81127d;
                if (aVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                    aVar3 = null;
                }
                com.bilibili.playerbizcommonv2.danmaku.input.d dVar = new com.bilibili.playerbizcommonv2.danmaku.input.d(aVar3);
                com.bilibili.playerbizcommonv2.danmaku.input.d.a(dVar, c.class, new Object(), 2);
                dVar.f80983d = false;
                eVarE = panelContainer.e(dVar);
            }
            this.f81128e = eVarE;
        }
        return this.f81128e;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public final com.bilibili.playerbizcommonv2.danmaku.input.e<ViewOnClickListenerC8540a> w() {
        if (this.f81129f == null) {
            com.bilibili.playerbizcommonv2.danmaku.input.a aVar = this.f81127d;
            com.bilibili.playerbizcommonv2.danmaku.input.a aVar2 = aVar;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                aVar2 = null;
            }
            InputPanelContainer inputPanelContainerH = aVar2.h();
            com.bilibili.playerbizcommonv2.danmaku.input.e<ViewOnClickListenerC8540a> eVarE = null;
            if (inputPanelContainerH != null) {
                com.bilibili.playerbizcommonv2.danmaku.input.a aVar3 = this.f81127d;
                if (aVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                    aVar3 = null;
                }
                com.bilibili.playerbizcommonv2.danmaku.input.d dVar = new com.bilibili.playerbizcommonv2.danmaku.input.d(aVar3);
                com.bilibili.playerbizcommonv2.danmaku.input.d.a(dVar, ViewOnClickListenerC8540a.class, new Object(), 2);
                dVar.f80983d = false;
                eVarE = inputPanelContainerH.e(dVar);
            }
            this.f81129f = eVarE;
        }
        return this.f81129f;
    }

    public final CommandsPanel x() {
        com.bilibili.playerbizcommonv2.danmaku.input.a aVar = this.f81127d;
        return aVar != null ? aVar.t().E() : null;
    }

    public final List<CommandsDanmaku> y() {
        com.bilibili.playerbizcommonv2.danmaku.input.a aVar = this.f81127d;
        return aVar != null ? aVar.c() : CollectionsKt.emptyList();
    }
}
