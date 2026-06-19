package com.bilibili.ogv.kmm.operation.vippreview;

import com.bilibili.ogv.kmm.operation.vippreview.VipOfflinePreviewActiveCard;
import kntr.base.router.Router;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import mk0.C8008d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/vippreview/e.class */
public final class e implements Function0<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f68931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f68932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Router f68933c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/vippreview/e$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f68934a;

        static {
            int[] iArr = new int[VipOfflinePreviewActiveCard.Type.values().length];
            try {
                iArr[VipOfflinePreviewActiveCard.Type.RESERVATION.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[VipOfflinePreviewActiveCard.Type.REGISTRATION.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[VipOfflinePreviewActiveCard.Type.RECALL.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f68934a = iArr;
        }
    }

    public e(i iVar, CoroutineScope coroutineScope, Router router) {
        this.f68931a = iVar;
        this.f68932b = coroutineScope;
        this.f68933c = router;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke() throws NoWhenBranchMatchedException {
        i iVar = this.f68931a;
        int i7 = a.f68934a[iVar.f68941a.f68897i.ordinal()];
        if (i7 == 1) {
            BuildersKt.launch$default(this.f68932b, (CoroutineContext) null, (CoroutineStart) null, new VipOfflinePreviewModuleSupportModule$provide$1$1$2$1$1$2$1$1(iVar, null), 3, (Object) null);
        } else {
            if (i7 != 2 && i7 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            C8008d.a(iVar.f68941a.f68892c, this.f68933c);
        }
        return Unit.INSTANCE;
    }
}
