package com.bilibili.pegasus.holders;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.imageviewer.utils.ImageExtentionKt;
import com.bilibili.pegasus.PegasusHolderData;
import com.bilibili.pegasus.compat.PegasusCoverStyle;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/U0.class */
@StabilityInferred(parameters = 1)
public final class U0 implements com.bilibili.pegasus.components.preload.images.a {
    @Override // com.bilibili.pegasus.components.preload.images.a
    @Nullable
    public final Unit a(@NotNull PegasusHolderData pegasusHolderData) {
        if (!(pegasusHolderData instanceof fp0.u)) {
            return Unit.INSTANCE;
        }
        fp0.u uVar = (fp0.u) pegasusHolderData;
        BLog.i("pegasus_images_preload", "image=" + uVar.getCover());
        Application fapp = FoundationAlias.getFapp();
        String cover = uVar.getCover();
        String strH = uVar.h();
        String str = uVar.t() ? "pegasus-android-v4" : "pegasus-android-v2";
        int i7 = T0.f77631a;
        ImageExtentionKt.preloadImageWithGif$default(fapp, (Lifecycle) null, cover, strH, new com.bilibili.ad.adview.pegasus.holders.inline.card133.h(str, 7), new L9.d(uVar.t() ? "pegasus-android-gif-v4" : "pegasus-android-gif", 6), i7, (int) (i7 / PegasusCoverStyle.INSTANCE.getCoverRatio()), false, 256, (Object) null);
        return Unit.INSTANCE;
    }
}
