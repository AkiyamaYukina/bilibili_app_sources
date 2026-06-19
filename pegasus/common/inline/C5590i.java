package com.bilibili.pegasus.common.inline;

import F3.C1756j;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.app.comm.list.common.utils.BiliCallLifeCycleObserverKt;
import com.bilibili.app.comm.list.common.widget.ListCommonMenuWindow;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.app.screen.adjust.widget.G;
import com.bilibili.app.screen.adjust.widget.InternalScreenAdjustDialog;
import com.bilibili.app.screen.adjust.widget.a;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.menu.BottomDialogMenu;
import com.bilibili.lib.ui.menu.CheckMenuItem;
import com.bilibili.pegasus.PegasusDDConfigKt;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.pegasus.common.inline.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/inline/i.class */
public final class C5590i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f75570a = LazyKt.lazy(new C1756j(11));

    /* JADX WARN: Type inference failed for: r4v2, types: [com.bilibili.pegasus.common.inline.e] */
    public static void a(final InterfaceC5583b interfaceC5583b, final Context context, Fragment fragment, final com.bilibili.bplus.im.aichat.conversation.j jVar) {
        FragmentActivity fragmentActivityP3;
        LifecycleCoroutineScope lifecycleScope;
        float playSpeed = interfaceC5583b.getPlaySpeed();
        float[] fArr = (float[]) f75570a.getValue();
        if (PegasusDDConfigKt.isWidthNormal(ScreenAdjustUtilsKt.windowSize(context)) || fragment == null) {
            ArrayList arrayList = new ArrayList(fArr.length);
            int length = fArr.length;
            for (int i7 = 0; i7 < length; i7++) {
                final float f7 = fArr[i7];
                arrayList.add(new CheckMenuItem(String.valueOf(f7), f7 == playSpeed, new CheckMenuItem.OnMenuClickListener(interfaceC5583b, f7, context, jVar) { // from class: com.bilibili.pegasus.common.inline.f

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final InterfaceC5583b f75560a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final float f75561b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final Context f75562c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final Function1 f75563d;

                    {
                        this.f75560a = interfaceC5583b;
                        this.f75561b = f7;
                        this.f75562c = context;
                        this.f75563d = jVar;
                    }

                    @Override // com.bilibili.lib.ui.menu.CheckMenuItem.OnMenuClickListener
                    public final void onMenuClick(View view) {
                        Context context2 = this.f75562c;
                        InterfaceC5583b interfaceC5583b2 = this.f75560a;
                        int playerState = interfaceC5583b2.getPlayerState();
                        float f8 = this.f75561b;
                        if (4 > playerState || playerState >= 7) {
                            PromoToast.showMidToast(context2, 2131841703);
                        } else {
                            interfaceC5583b2.setPlaySpeed(f8);
                        }
                        Function1 function1 = this.f75563d;
                        if (function1 != null) {
                            function1.invoke(Float.valueOf(f8));
                        }
                    }
                }));
            }
            ListCommonMenuWindow.showBottomUpMenu$default(context, arrayList, (BottomDialogMenu.OnCloseClickListener) null, 4, (Object) null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(fArr.length);
        int length2 = fArr.length;
        for (int i8 = 0; i8 < length2; i8++) {
            float f8 = fArr[i8];
            arrayList2.add(new B(f8, f8 == playSpeed));
        }
        final D d7 = new D(fragment, arrayList2, new Function1(interfaceC5583b, context, jVar) { // from class: com.bilibili.pegasus.common.inline.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InterfaceC5583b f75557a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Context f75558b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Function1 f75559c;

            {
                this.f75557a = interfaceC5583b;
                this.f75558b = context;
                this.f75559c = jVar;
            }

            public final Object invoke(Object obj) {
                Context context2 = this.f75558b;
                B b7 = (B) obj;
                InterfaceC5583b interfaceC5583b2 = this.f75557a;
                int playerState = interfaceC5583b2.getPlayerState();
                if (4 > playerState || playerState >= 7) {
                    PromoToast.showMidToast(context2, 2131841703);
                } else {
                    interfaceC5583b2.setPlaySpeed(b7.f75524a);
                }
                Function1 function1 = this.f75559c;
                if (function1 != null) {
                    function1.invoke(Float.valueOf(b7.f75524a));
                }
                return Unit.INSTANCE;
            }
        });
        Fragment fragment2 = d7.f75528a;
        if (fragment2 == null || (fragmentActivityP3 = fragment2.p3()) == null) {
            return;
        }
        ComposeView composeView = new ComposeView(fragmentActivityP3, null, 0, 6, null);
        final int i9 = 0;
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(329513280, true, new Function2(d7, i9) { // from class: com.bilibili.pegasus.common.inline.C

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f75526a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f75527b;

            {
                this.f75526a = i9;
                this.f75527b = d7;
            }

            /* JADX WARN: Removed duplicated region for block: B:35:0x0120  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r15, java.lang.Object r16) {
                /*
                    Method dump skipped, instruction units count: 342
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.common.inline.C.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }));
        new InternalScreenAdjustDialog(fragmentActivityP3, composeView, G.b.a, "", 0.5f, 0, true, true, false, 3, a.b.a, d7.f75531d, R$color.f64616Wh0, true).show();
        LifecycleOwner lifecycleOwner = BiliCallLifeCycleObserverKt.getLifecycleOwner(fragmentActivityP3);
        if (lifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
            return;
        }
        BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new PegasusSpeedSetDialog$show$1$2(fragmentActivityP3, d7, null), 3, (Object) null);
    }
}
