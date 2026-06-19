package com.bilibili.playerbizcommonv2.danmaku.input.panel;

import com.bilibili.droid.ToastHelper;
import com.bilibili.playerbizcommonv2.danmaku.command.InteractDanmakuListWidget;
import com.bilibili.playerbizcommonv2.danmaku.command.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import tv.danmaku.biliplayerv2.service.interact.core.command.CommandsDanmaku;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/p.class */
public final class p implements a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f81159a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/p$a.class */
    public static final class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f81160a;

        public a(r rVar) {
            this.f81160a = rVar;
        }

        @Override // com.bilibili.playerbizcommonv2.danmaku.input.panel.d
        public final void a(Throwable th) {
            String message;
            defpackage.a.b("delete command danmaku fail -> ", th != null ? th.getMessage() : null, "InteractDanmakuListPanel");
            if (th == null || (message = th.getMessage()) == null) {
                return;
            }
            String str = null;
            if (!StringsKt.isBlank(message)) {
                str = message;
            }
            if (str != null) {
                ToastHelper.showToastShort(this.f81160a.getContext(), str);
            }
        }

        @Override // com.bilibili.playerbizcommonv2.danmaku.input.panel.d
        public final void b(CommandsDanmaku commandsDanmaku) {
            com.bilibili.playerbizcommonv2.danmaku.command.a aVar;
            r rVar = this.f81160a;
            InteractDanmakuListWidget interactDanmakuListWidget = rVar.f81167f;
            if (interactDanmakuListWidget != null && (aVar = interactDanmakuListWidget.f80828d) != null) {
                int iIndexOf = aVar.f80830a.indexOf(commandsDanmaku);
                if (aVar.f80830a.remove(commandsDanmaku)) {
                    aVar.notifyItemRemoved(iIndexOf);
                }
            }
            List mutableList = CollectionsKt.toMutableList(rVar.f81162a.c());
            com.bilibili.playerbizcommonv2.danmaku.input.a aVar2 = rVar.f81162a;
            List list = mutableList;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!Intrinsics.areEqual((CommandsDanmaku) obj, commandsDanmaku)) {
                    arrayList.add(obj);
                }
            }
            aVar2.b(arrayList);
        }
    }

    public p(r rVar) {
        this.f81159a = rVar;
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.command.a.b
    public final void H(CommandsDanmaku commandsDanmaku) {
        r rVar = this.f81159a;
        rVar.f81162a.e().O(commandsDanmaku, new a(rVar));
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.command.a.b
    public final void b(CommandsDanmaku commandsDanmaku) {
        r rVar = this.f81159a;
        rVar.f81162a.e().b(commandsDanmaku);
        rVar.dismiss();
    }
}
