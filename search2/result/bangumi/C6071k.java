package com.bilibili.search2.result.bangumi;

import androidx.collection.C3270i;
import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.Placeable;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.lib.sharewrapper.online.ShareOnlineParams;
import com.bilibili.search2.api.SearchBangumiItem;
import kntr.common.comment.imageviewer.ImageViewerKt;
import kntr.common.share.domain.model.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.bilibili.search2.result.bangumi.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/k.class */
public final /* synthetic */ class C6071k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f87432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f87433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f87434c;

    public /* synthetic */ C6071k(int i7, Object obj, Object obj2) {
        this.f87432a = i7;
        this.f87433b = obj;
        this.f87434c = obj2;
    }

    public final Object invoke(Object obj) {
        float fFloatValue;
        int iE;
        int iC;
        switch (this.f87432a) {
            case 0:
                com.bilibili.search2.share.r rVar = com.bilibili.search2.share.r.f88699a;
                String str = ((b.a) obj).a;
                FragmentActivity fragmentActivity = (FragmentActivity) this.f87433b;
                C6072l c6072l = (C6072l) this.f87434c;
                C6075o c6075o = new C6075o(fragmentActivity, c6072l);
                ShareOnlineParams shareOnlineParamsD = com.bilibili.search2.utils.t.d((SearchBangumiItem) c6072l.getData());
                rVar.getClass();
                com.bilibili.search2.share.r.d(fragmentActivity, str, c6075o, shareOnlineParamsD);
                break;
            case 1:
                DrawScope drawScope = (DrawScope) obj;
                kntr.common.comment.imageviewer.B b7 = (kntr.common.comment.imageviewer.B) this.f87433b;
                int i7 = ImageViewerKt.b.a[b7.a().ordinal()];
                kntr.common.photonic.aphro.ui.preview.state.c cVar = (kntr.common.photonic.aphro.ui.preview.state.c) this.f87434c;
                if (i7 != 1) {
                    Animatable animatable = b7.a;
                    fFloatValue = (i7 == 2 || i7 == 3) ? Math.min(((Number) animatable.getValue()).floatValue(), ((Number) cVar.h.d.getValue()).floatValue()) : ((Number) animatable.getValue()).floatValue();
                } else {
                    fFloatValue = ((Number) cVar.h.d.getValue()).floatValue();
                }
                DrawScope.m2911drawRectnJ9OG0$default(drawScope, Color.Companion.m2655getBlack0d7_KjU(), 0L, 0L, fFloatValue, null, null, 0, 118, null);
                break;
            default:
                Placeable placeable = (Placeable) obj;
                if (placeable != null) {
                    androidx.compose.foundation.layout.j jVar = (androidx.compose.foundation.layout.j) this.f87434c;
                    iE = jVar.e(placeable);
                    iC = jVar.c(placeable);
                } else {
                    iE = 0;
                    iC = 0;
                }
                C3270i c3270i = new C3270i(C3270i.a(iE, iC));
                androidx.compose.foundation.layout.h hVar = (androidx.compose.foundation.layout.h) this.f87433b;
                hVar.f34058i = c3270i;
                hVar.f34057g = placeable;
                break;
        }
        return Unit.INSTANCE;
    }
}
