package com.bilibili.pegasus.components;

import android.os.Build;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.PegasusHeaderManager;
import kntr.base.utils.foundation.RomUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/HDDownloadBarHeader.class */
@StabilityInferred(parameters = 0)
public final class HDDownloadBarHeader extends BasePegasusComponent {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f75783k = "PegasusHDDownloadBarHeader";

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.HDDownloadBarHeader$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/HDDownloadBarHeader$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final HDDownloadBarHeader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HDDownloadBarHeader hDDownloadBarHeader, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = hDDownloadBarHeader;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x0144  */
        /* JADX WARN: Type inference failed for: r1v2, types: [com.bilibili.okretro.converter.IParser, java.lang.Object] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 503
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.HDDownloadBarHeader.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static String b() {
        return RomUtils.isSamsungRom() ? "com.sec.android.app.samsungapps" : RomUtils.isHuaweiRom() ? "com.huawei.appmarket" : RomUtils.isMiuiRom() ? "com.xiaomi.market" : RomUtils.isVivoRom() ? "com.bbk.appstore" : RomUtils.isOppoRom() ? "com.oppo.market" : (RomUtils.isLenovoRom() || StringsKt.equals(Build.BRAND, "lenovo", true)) ? "com.lenovo.leos.appstore.pad" : null;
    }

    @NotNull
    public final String getComponentName() {
        return this.f75783k;
    }

    public final void onViewCreated(@NotNull View view, @NotNull RecyclerView recyclerView, @NotNull PegasusHeaderManager pegasusHeaderManager) {
        super.onViewCreated(view, recyclerView, pegasusHeaderManager);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getRequireViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
