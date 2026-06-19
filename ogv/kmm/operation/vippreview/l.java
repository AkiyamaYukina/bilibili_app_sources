package com.bilibili.ogv.kmm.operation.vippreview;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.bilibili.playset.editor.widget.EditorCommonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/vippreview/l.class */
public final /* synthetic */ class l implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f68955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f68956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f68957c;

    public /* synthetic */ l(Object obj, int i7, int i8) {
        this.f68955a = i8;
        this.f68956b = obj;
        this.f68957c = i7;
    }

    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.f68955a) {
            case 0:
                num.getClass();
                v.a((Modifier) this.f68956b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f68957c | 1));
                break;
            case 1:
                num.intValue();
                EditorCommonKt.d((Modifier) this.f68956b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f68957c | 1));
                break;
            default:
                num.intValue();
                g80.j.b(composer, RecomposeScopeImplKt.updateChangedFlags(this.f68957c | 1), (String) this.f68956b);
                break;
        }
        return Unit.INSTANCE;
    }
}
