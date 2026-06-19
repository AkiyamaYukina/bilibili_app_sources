package com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.mark;

import Hx.h;
import S3.n;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.foundation.text.C0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.Group;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.moduleservice.ad.AdUIReportService;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sr0.InterfaceC8621d;
import sr0.InterfaceC8622e;
import tv.danmaku.biliplayerv2.service.interact.core.command.CommandsPanel;
import xr0.C9002b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/commandsdetail/mark/f.class */
@StabilityInferred(parameters = 0)
public final class f extends FrameLayout implements InterfaceC8622e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CommandsPanel.Panel f81092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC8621d f81093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final TextView f81094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final ViewGroup f81095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final TextView f81096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final TextView f81097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final BiliImageView f81098g;

    @Nullable
    public final TextView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final Group f81099i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public String f81100j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Lazy f81101k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public Job f81102l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final CommandsPanel.Panel.Form f81103m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Lazy f81104n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final e f81105o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final com.bilibili.biligame.cloudgame.v2.ui.fragment.c f81106p;

    /* JADX WARN: Type inference failed for: r1v13, types: [com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.mark.e] */
    public f(@NotNull Context context, @NotNull CommandsPanel.Panel panel, @NotNull InterfaceC8621d interfaceC8621d) {
        super(context);
        this.f81092a = panel;
        this.f81093b = interfaceC8621d;
        this.f81100j = "";
        this.f81101k = LazyKt.lazy(new n(3));
        CommandsPanel.Panel.Form form = new CommandsPanel.Panel.Form();
        form.setLimit(12);
        form.setPlaceholder(context.getString(2131846850));
        this.f81103m = form;
        this.f81104n = LazyKt.lazy(new h(4));
        this.f81105o = new View.OnClickListener(this) { // from class: com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.mark.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final f f81091a;

            {
                this.f81091a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f fVar = this.f81091a;
                long avid = fVar.f81093b.getAvid();
                C0.c(avid, "mark goods request avid -> ", "MarkRelatedGoodItem");
                if (avid <= 0) {
                    return;
                }
                fVar.f81102l = BuildersKt.launch$default(CoroutineScopeKt.MainScope(), (CoroutineContext) null, (CoroutineStart) null, new MarkRelatedGoodsItem$requestGoodsList$1(fVar, avid, null), 3, (Object) null);
            }
        };
        this.f81106p = new com.bilibili.biligame.cloudgame.v2.ui.fragment.c(this, 1);
        FrameLayout.inflate(context, 2131496333, this);
        this.f81095d = (ViewGroup) findViewById(2131307212);
        this.f81094c = (TextView) findViewById(2131311067);
        this.f81096e = (TextView) findViewById(2131316665);
        this.f81097f = (TextView) findViewById(2131316664);
        this.f81099i = (Group) findViewById(2131308150);
        this.f81098g = findViewById(2131301546);
        this.h = (TextView) findViewById(2131304923);
    }

    private final AdUIReportService getMAdReportService() {
        return (AdUIReportService) this.f81104n.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.bilibili.playerbizcommonv2.api.a getMCommandApiService() {
        return (com.bilibili.playerbizcommonv2.api.a) this.f81101k.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    @Override // sr0.InterfaceC8622e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(@org.jetbrains.annotations.NotNull java.util.HashMap<java.lang.String, java.lang.Object> r5) {
        /*
            r4 = this;
            r0 = r4
            android.view.ViewGroup r0 = r0.f81095d
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L1b
            r0 = r6
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L1b
            r0 = r5
            java.lang.String r1 = "keyword"
            r2 = r4
            java.lang.String r2 = r2.f81100j
            java.lang.Object r0 = r0.put(r1, r2)
        L1b:
            r0 = r4
            androidx.constraintlayout.widget.Group r0 = r0.f81099i
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L38
            r0 = r6
            java.lang.Object r0 = r0.getTag()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L38
            r0 = r6
            java.lang.String r0 = r0.toString()
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            if (r0 != 0) goto L3b
        L38:
            java.lang.String r0 = ""
            r6 = r0
        L3b:
            r0 = r5
            java.lang.String r1 = "item_id_str"
            r2 = r6
            java.lang.Object r0 = r0.put(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.mark.f.a(java.util.HashMap):void");
    }

    @Override // sr0.InterfaceC8622e
    public final void b(@Nullable CommandsPanel.Panel.Form form, @NotNull String str) {
        if (form != this.f81103m || Intrinsics.areEqual(this.f81100j, str)) {
            return;
        }
        String strC = C9002b.c(12, str);
        this.f81100j = strC;
        TextView textView = this.f81096e;
        if (textView != null) {
            textView.setText(strC);
        }
        TextView textView2 = this.f81097f;
        if (textView2 != null) {
            textView2.setText(getContext().getString(2131827526, Integer.valueOf(C9002b.b(strC) / 2), 12));
        }
    }

    @Override // sr0.InterfaceC8622e
    public final boolean c() {
        Group group;
        ViewGroup viewGroup = this.f81095d;
        return ((viewGroup != null && viewGroup.getVisibility() == 0 && StringsKt.isBlank(this.f81100j)) || (group = this.f81099i) == null || group.getVisibility() != 0) ? false : true;
    }

    public final void e() {
        AdUIReportService mAdReportService = getMAdReportService();
        if (mAdReportService != null) {
            Pair pair = TuplesKt.to(GameCardButton.extraAvid, String.valueOf(this.f81093b.getAvid()));
            Pair pair2 = TuplesKt.to("danmaku_type", "18");
            Group group = this.f81099i;
            mAdReportService.uiReport("engagement_create_click", MapsKt.hashMapOf(new Pair[]{pair, pair2, TuplesKt.to("item_id", String.valueOf(group != null ? group.getTag() : null))}));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    @Override // sr0.InterfaceC8622e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onAttach() {
        /*
            r9 = this;
            r0 = r9
            android.view.ViewGroup r0 = r0.f81095d
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L22
            r0 = r9
            tv.danmaku.biliplayerv2.service.interact.core.command.CommandsPanel$Panel r0 = r0.f81092a
            int r0 = r0.getType()
            r1 = 18
            if (r0 != r1) goto L1a
            r0 = 0
            r10 = r0
            goto L1d
        L1a:
            r0 = 8
            r10 = r0
        L1d:
            r0 = r11
            r1 = r10
            r0.setVisibility(r1)
        L22:
            r0 = r9
            android.widget.TextView r0 = r0.f81094c
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L33
            r0 = r11
            r1 = r9
            com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.mark.e r1 = r1.f81105o
            r0.setOnClickListener(r1)
        L33:
            r0 = r9
            tv.danmaku.biliplayerv2.service.interact.core.command.CommandsPanel$Panel r0 = r0.f81092a     // Catch: java.lang.Exception -> L47
            java.lang.String r0 = r0.getExtra()     // Catch: java.lang.Exception -> L47
            java.lang.Class<tv.danmaku.biliplayerv2.service.interact.core.command.CommandsPanel$Panel$Extra> r1 = tv.danmaku.biliplayerv2.service.interact.core.command.CommandsPanel.Panel.Extra.class
            java.lang.Object r0 = com.alibaba.fastjson.JSON.parseObject(r0, r1)     // Catch: java.lang.Exception -> L47
            tv.danmaku.biliplayerv2.service.interact.core.command.CommandsPanel$Panel$Extra r0 = (tv.danmaku.biliplayerv2.service.interact.core.command.CommandsPanel.Panel.Extra) r0     // Catch: java.lang.Exception -> L47
            r11 = r0
            goto L4a
        L47:
            r11 = move-exception
            r0 = 0
            r11 = r0
        L4a:
            r0 = r11
            if (r0 == 0) goto L59
            r0 = r11
            java.lang.String r0 = r0.getDefaultKeyword()
            r12 = r0
            r0 = r12
            r11 = r0
            r0 = r12
            if (r0 != 0) goto L5e
        L59:
            r0 = r9
            java.lang.String r0 = r0.f81100j
            r11 = r0
        L5e:
            r0 = r9
            android.widget.TextView r0 = r0.f81096e
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L79
            r0 = r12
            r1 = r11
            r0.setText(r1)
            r0 = r9
            r1 = r11
            r0.f81100j = r1
            r0 = r12
            r1 = r9
            com.bilibili.biligame.cloudgame.v2.ui.fragment.c r1 = r1.f81106p
            r0.setOnClickListener(r1)
        L79:
            r0 = r9
            android.widget.TextView r0 = r0.f81097f
            r12 = r0
            r0 = r12
            if (r0 == 0) goto La7
            r0 = r12
            r1 = r9
            android.content.Context r1 = r1.getContext()
            r2 = 2131827526(0x7f111b46, float:1.9287967E38)
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r11
            int r6 = xr0.C9002b.b(r6)
            r7 = 2
            int r6 = r6 / r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 12
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4[r5] = r6
            java.lang.String r1 = r1.getString(r2, r3)
            r0.setText(r1)
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.mark.f.onAttach():void");
    }

    @Override // sr0.InterfaceC8622e
    public final void onDetach() {
        TextView textView = this.f81094c;
        if (textView != null) {
            textView.setOnClickListener(null);
        }
        Job job = this.f81102l;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f81102l = null;
    }
}
