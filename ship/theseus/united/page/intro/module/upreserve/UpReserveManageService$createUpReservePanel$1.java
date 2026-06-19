package com.bilibili.ship.theseus.united.page.intro.module.upreserve;

import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import androidx.annotation.ColorInt;
import androidx.fragment.app.FragmentManager;
import com.bilibili.app.comm.bh.BiliWebView;
import com.bilibili.app.comm.rubick.api.ContainerInfo;
import com.bilibili.app.comm.rubick.api.ContainerStatus;
import com.bilibili.app.comm.rubick.api.ICommonContainer;
import com.bilibili.app.comm.rubick.api.ToastDuration;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.ogv.infra.coroutine.SelectKt$selectCancellingUnselected$scope$1;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kntr.base.jsb.api.common.Button;
import kntr.base.jsb.api.common.KeyboardStatusResp;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/upreserve/UpReserveManageService$createUpReservePanel$1.class */
final class UpReserveManageService$createUpReservePanel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final j this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/upreserve/UpReserveManageService$createUpReservePanel$1$a.class */
    public static final class a implements ICommonContainer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ICommonContainer f101979a = ICommonContainer.Companion.getEmpty();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Ref.ObjectRef<k> f101980b;

        public a(Ref.ObjectRef<k> objectRef) {
            this.f101980b = objectRef;
        }

        public final Object close(Continuation<? super Unit> continuation) {
            k kVar = (k) this.f101980b.element;
            if (kVar != null) {
                Boxing.boxBoolean(kVar.c());
            }
            return Unit.INSTANCE;
        }

        public final Object disableCloseGesture(boolean z6, Continuation<? super Unit> continuation) {
            return this.f101979a.disableCloseGesture(z6, continuation);
        }

        public final void disableTouchEventIntercept(boolean z6) {
            this.f101979a.disableTouchEventIntercept(z6);
        }

        public final Object getContainerInfo(Continuation<? super ContainerInfo> continuation) {
            return this.f101979a.getContainerInfo(continuation);
        }

        public final Object getCurContainerStatus(Continuation<? super ContainerStatus> continuation) {
            return this.f101979a.getCurContainerStatus(continuation);
        }

        public final Object getCurNavigationButton(Continuation<? super List<Button>> continuation) {
            return this.f101979a.getCurNavigationButton(continuation);
        }

        public final Object getSupportFragmentManager(Continuation<? super FragmentManager> continuation) {
            return this.f101979a.getSupportFragmentManager(continuation);
        }

        public final Object launch(Intent intent, Continuation<? super ActivityResult> continuation) {
            return this.f101979a.launch(intent, continuation);
        }

        public final Object launch(RouteRequest routeRequest, Continuation<? super com.bilibili.lib.blrouter.extra.ActivityResult> continuation) {
            return this.f101979a.launch(routeRequest, continuation);
        }

        public final Object observeContainerClick(Continuation<? super Flow<String>> continuation) {
            return this.f101979a.observeContainerClick(continuation);
        }

        public final Object observeContainerStatus(Continuation<? super Flow<? extends ContainerStatus>> continuation) {
            return this.f101979a.observeContainerStatus(continuation);
        }

        public final Object observeKeyBoardStatus(Continuation<? super Flow<KeyboardStatusResp>> continuation) {
            return this.f101979a.observeKeyBoardStatus(continuation);
        }

        public final Object reload(Uri uri, Map<String, String> map, Continuation<? super Unit> continuation) {
            return this.f101979a.reload(uri, map, continuation);
        }

        public final Object setContainerSize(String str, String str2, Continuation<? super Unit> continuation) {
            return this.f101979a.setContainerSize(str, str2, continuation);
        }

        public final Object setNavigationBarBackgroundColor(@ColorInt int i7, Continuation<? super Unit> continuation) {
            return this.f101979a.setNavigationBarBackgroundColor(i7, continuation);
        }

        public final Object setNavigationBarTitle(String str, Continuation<? super Unit> continuation) {
            return this.f101979a.setNavigationBarTitle(str, continuation);
        }

        public final Object setNavigationBarTitleColor(@ColorInt int i7, Continuation<? super Unit> continuation) {
            return this.f101979a.setNavigationBarTitleColor(i7, continuation);
        }

        public final Object setNavigationBarVisibility(boolean z6, Continuation<? super Unit> continuation) {
            return this.f101979a.setNavigationBarVisibility(z6, continuation);
        }

        public final Object setNavigationButton(List<Button> list, Continuation<? super Unit> continuation) {
            return this.f101979a.setNavigationButton(list, continuation);
        }

        public final Object setStatusBarMode(int i7, Continuation<? super Unit> continuation) {
            return this.f101979a.setStatusBarMode(i7, continuation);
        }

        public final Object setStatusBarVisibility(boolean z6, Continuation<? super Unit> continuation) {
            return this.f101979a.setStatusBarVisibility(z6, continuation);
        }

        public final Object showPageLoading(boolean z6, Continuation<? super Unit> continuation) {
            return this.f101979a.showPageLoading(z6, continuation);
        }

        public final Object switchBizModule(String str, Continuation<? super Unit> continuation) {
            return this.f101979a.switchBizModule(str, continuation);
        }

        public final Object toast(String str, ToastDuration toastDuration, Continuation<? super Unit> continuation) {
            return this.f101979a.toast(str, toastDuration, continuation);
        }

        public final Object updateNavigationButton(Button button, Continuation<? super Unit> continuation) {
            return this.f101979a.updateNavigationButton(button, continuation);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/upreserve/UpReserveManageService$createUpReservePanel$1$b.class */
    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f101981a;

        public b(j jVar) {
            this.f101981a = jVar;
        }

        @Override // com.bilibili.ship.theseus.united.page.intro.module.upreserve.c
        public final void y5(d dVar) {
            this.f101981a.h.setValue(dVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpReserveManageService$createUpReservePanel$1(j jVar, Continuation<? super UpReserveManageService$createUpReservePanel$1> continuation) {
        super(2, continuation);
        this.this$0 = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(j jVar, BiliWebView biliWebView) {
        biliWebView.registerPrivacyController(Reflection.getOrCreateKotlinClass(c.class), new b(jVar));
        return Unit.INSTANCE;
    }

    private static final Unit invokeSuspend$lambda$1(Ref.ObjectRef objectRef, final j jVar, com.bilibili.ogv.infra.coroutine.c cVar) {
        TheseusFloatLayerService.a aVar = new TheseusFloatLayerService.a(0, 0, 0, 0, new Function0(jVar) { // from class: com.bilibili.ship.theseus.united.page.intro.module.upreserve.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final j f101993a;

            {
                this.f101993a = jVar;
            }

            public final Object invoke() {
                return Integer.valueOf(UpReserveManageService$createUpReservePanel$1.invokeSuspend$lambda$1$0(this.f101993a));
            }
        });
        cVar.b(new UpReserveManageService$createUpReservePanel$1$3$1(jVar, objectRef, aVar, null));
        cVar.b(new UpReserveManageService$createUpReservePanel$1$3$2(jVar, objectRef, null));
        cVar.b(new UpReserveManageService$createUpReservePanel$1$3$3(jVar, objectRef, null));
        cVar.b(new UpReserveManageService$createUpReservePanel$1$3$4(jVar, objectRef, aVar, null));
        cVar.a(((TheseusWebUIComponent) ((k) objectRef.element).f102004m.getValue()).f104195o);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invokeSuspend$lambda$1$0(j jVar) {
        return jVar.f102001f.i() ? 3 : 1;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UpReserveManageService$createUpReservePanel$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [com.bilibili.ship.theseus.united.page.intro.module.upreserve.h] */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            String str = ((d) this.this$0.h.getValue()).f101987d;
            BLog.i("UpReserveManageService", "webUri = " + str);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            boolean zI = this.this$0.f102001f.i();
            com.bilibili.ogv.infra.jsb.d dVar = new com.bilibili.ogv.infra.jsb.d();
            TheseusWebUIComponent.a aVar = new TheseusWebUIComponent.a(false, null, 0, 0, 0, false, 0, false, 0, 0, zI, false, null, 716798);
            Map mapMapOf = MapsKt.mapOf(TuplesKt.to(Reflection.getOrCreateKotlinClass(ICommonContainer.class), new a(objectRef)));
            final j jVar = this.this$0;
            k kVar = new k(str, dVar, aVar, mapMapOf, new Function1(jVar) { // from class: com.bilibili.ship.theseus.united.page.intro.module.upreserve.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final j f101994a;

                {
                    this.f101994a = jVar;
                }

                public final Object invoke(Object obj2) {
                    return UpReserveManageService$createUpReservePanel$1.invokeSuspend$lambda$0(this.f101994a, (BiliWebView) obj2);
                }
            });
            objectRef.element = kVar;
            kVar.f99722f.setValue(Integer.valueOf(DimenUtilsKt.dpToPx(com.bilibili.ship.theseus.united.page.intro.a.b(this.this$0.f102001f.b()))));
            j jVar2 = this.this$0;
            this.label = 1;
            ArrayList arrayList = new ArrayList();
            invokeSuspend$lambda$1(objectRef, jVar2, new SelectKt$selectCancellingUnselected$scope$1(arrayList));
            if (FlowKt.first(FlowKt.merge(arrayList), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
