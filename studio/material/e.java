package com.bilibili.studio.material;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import qk0.ViewOnClickListenerC8443B;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/e.class */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f108518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f108519b;

    public /* synthetic */ e(Object obj, int i7) {
        this.f108518a = i7;
        this.f108519b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke() {
        switch (this.f108518a) {
            case 0:
                IMaterialProcessor iMaterialProcessor = (IMaterialProcessor) this.f108519b;
                return new zA0.b(iMaterialProcessor.getConfig().getFilePath(), iMaterialProcessor.getMaterialType(), (xA0.a) iMaterialProcessor.f108441a.getValue(), iMaterialProcessor.getSameDirWithZip());
            case 1:
                ((MutableState) this.f108519b).setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return Unit.INSTANCE;
            default:
                return ((ViewOnClickListenerC8443B) this.f108519b).f126033b.findViewById(2131304231);
        }
    }
}
