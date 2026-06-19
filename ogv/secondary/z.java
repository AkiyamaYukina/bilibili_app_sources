package com.bilibili.ogv.secondary;

import com.bilibili.bplus.following.widget.l;
import com.bilibili.ogv.secondary.part.InterfaceC5544n;
import com.bilibili.ogv.secondary.part.PartReadyUiService;
import kntr.common.komponent.Komponent;
import kntr.common.komponent.KomponentKt;
import kntr.common.komponent.KomponentScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tv.danmaku.bili.fullscreen.FullscreenLoginActivity;
import tv.danmaku.bili.fullscreen.state.Z;
import tv.danmaku.bili.normal.ui.EulaTriggerType;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/z.class */
public final /* synthetic */ class z implements InterfaceC5544n, l.a, tv.danmaku.bili.eula.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f72956a;

    public /* synthetic */ z(Object obj) {
        this.f72956a = obj;
    }

    public void a(tv.danmaku.bili.eula.b bVar) {
        int i7 = FullscreenLoginActivity.H;
        ((FullscreenLoginActivity) this.f72956a).R6().J0(new Z(bVar, true, EulaTriggerType.Submit));
    }

    @Override // com.bilibili.ogv.secondary.part.InterfaceC5544n
    public Komponent b(final com.bilibili.ogv.secondary.api.c cVar, final String str, final String str2, final C5524e c5524e) {
        final C5525f c5525f = (C5525f) this.f72956a;
        return KomponentKt.Komponent(new Function1(c5525f, str, str2, cVar, c5524e) { // from class: com.bilibili.ogv.secondary.y

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C5525f f72951a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f72952b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f72953c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final com.bilibili.ogv.secondary.api.c f72954d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final C5524e f72955e;

            {
                this.f72951a = c5525f;
                this.f72952b = str;
                this.f72953c = str2;
                this.f72954d = cVar;
                this.f72955e = c5524e;
            }

            public final Object invoke(Object obj) {
                KomponentScope komponentScope = (KomponentScope) obj;
                C5525f c5525f2 = this.f72951a;
                yW0.b bVar = new C5526g(c5525f2.f72674a, this.f72952b, this.f72953c, this.f72954d, komponentScope, this.f72955e).f72685l;
                if (bVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("partReadyUiServiceProvider");
                    bVar = null;
                }
                return komponentScope.__setContent(new A(Unit.INSTANCE, komponentScope.getContext(), komponentScope, (PartReadyUiService) bVar.get()));
            }
        });
    }
}
