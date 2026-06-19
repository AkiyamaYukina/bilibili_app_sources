package com.bilibili.ship.theseus.united.widget;

import Cv0.e;
import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/widget/DetailsShareAnimViewV2.class */
@StabilityInferred(parameters = 0)
public final class DetailsShareAnimViewV2 extends e {

    @Nullable
    public a h;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/widget/DetailsShareAnimViewV2$a.class */
    public interface a {
        void a();

        void b();
    }

    public DetailsShareAnimViewV2(@NotNull Context context) {
        super(context, null, 0);
    }

    public DetailsShareAnimViewV2(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // Cv0.e
    public final void q() {
        a aVar = this.h;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void setViewStateCallback(@Nullable a aVar) {
        this.h = aVar;
    }
}
