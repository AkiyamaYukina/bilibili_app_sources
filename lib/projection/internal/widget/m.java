package com.bilibili.lib.projection.internal.widget;

import android.widget.TextView;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import io.reactivex.rxjava3.functions.Consumer;
import kotlin.text.StringsKt;
import me0.C7985q;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/m.class */
public final class m<T> implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f64102a;

    public m(o oVar) {
        this.f64102a = oVar;
    }

    public final void accept(Object obj) {
        TextView textView;
        com.bilibili.lib.projection.internal.device.a aVar = (com.bilibili.lib.projection.internal.device.a) obj;
        if ((aVar.getDevice() instanceof ProjectionDeviceInternal.b) || (textView = this.f64102a.f64119q) == null) {
            return;
        }
        textView.setText(StringsKt.l(aVar.getDevice().getDisplayName(), "我的小电视tv") ? aVar.getDevice() instanceof C7985q ? "云视听小电视(云链接)" : "云视听小电视" : aVar.getDevice().getDisplayName());
    }
}
