package com.bilibili.ogv.filmlist;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.compose.VerticalAnchorable;
import com.bilibili.ogv.filmlist.part.PartReadyUiService;
import kntr.base.router.Router;
import kntr.common.komponent.KomponentScope;
import kntr.common.router.RouterKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/g.class */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f67702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f67703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f67704c;

    public /* synthetic */ g(int i7, Object obj, Object obj2) {
        this.f67702a = i7;
        this.f67703b = obj;
        this.f67704c = obj2;
    }

    public final Object invoke(Object obj) {
        switch (this.f67702a) {
            case 0:
                KomponentScope komponentScope = (KomponentScope) obj;
                yW0.b bVar = new C5435d(((C5434c) this.f67703b).f67689a, (com.bilibili.ogv.filmlist.api.c) this.f67704c, komponentScope, (Router) komponentScope.getContext().getCompositionLocal(RouterKt.getLocalRouter())).f67694e;
                if (bVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("partReadyUiServiceProvider");
                    bVar = null;
                }
                return komponentScope.__setContent(new h(Unit.INSTANCE, komponentScope.getContext(), komponentScope, (PartReadyUiService) bVar.get()));
            default:
                ConstrainScope constrainScope = (ConstrainScope) obj;
                VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getStart(), ((ConstrainedLayoutReference) this.f67703b).getEnd(), Dp.m3880constructorimpl(8), 0.0f, 4, null);
                VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getEnd(), ((ConstrainedLayoutReference) this.f67704c).getStart(), Dp.m3880constructorimpl(10), 0.0f, 4, null);
                constrainScope.setWidth(Dimension.Companion.getFillToConstraints());
                return Unit.INSTANCE;
        }
    }
}
