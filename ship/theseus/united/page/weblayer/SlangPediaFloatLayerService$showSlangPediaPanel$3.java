package com.bilibili.ship.theseus.united.page.weblayer;

import android.net.Uri;
import android.view.View;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.lib.jsbridge.common.ContainerStatusWatcher;
import com.bilibili.ogv.infra.coroutine.SelectKt$selectCancellingUnselected$scope$1;
import com.bilibili.playerbizcommon.utils.l;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.weblayer.SlangPediaFloatLayerService;
import com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/SlangPediaFloatLayerService$showSlangPediaPanel$3.class */
final class SlangPediaFloatLayerService$showSlangPediaPanel$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final boolean $needCloseIcon;
    final boolean $needKeyBoardListener;
    final boolean $needVerticalScrollbar;
    final Function0<Unit> $onLayerDismiss;
    final String $url;
    int label;
    final SlangPediaFloatLayerService this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/SlangPediaFloatLayerService$showSlangPediaPanel$3$a.class */
    public static final class a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SlangPediaFloatLayerService f104166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TheseusWebUIComponent f104167b;

        public a(SlangPediaFloatLayerService slangPediaFloatLayerService, TheseusWebUIComponent theseusWebUIComponent) {
            this.f104166a = slangPediaFloatLayerService;
            this.f104167b = theseusWebUIComponent;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            if (i10 - i8 != i14 - i12) {
                SlangPediaFloatLayerService slangPediaFloatLayerService = this.f104166a;
                int iB = slangPediaFloatLayerService.b(slangPediaFloatLayerService.f104159g.b());
                this.f104167b.i(iB);
                BLog.i("SlangPediaFloatLayerService", "updateRootHeight: " + iB);
                this.f104166a.f104154b.getWindow().getDecorView().removeOnLayoutChangeListener(this);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/SlangPediaFloatLayerService$showSlangPediaPanel$3$b.class */
    public static final class b implements l.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TheseusWebUIComponent f104168a;

        public b(TheseusWebUIComponent theseusWebUIComponent) {
            this.f104168a = theseusWebUIComponent;
        }

        @Override // com.bilibili.playerbizcommon.utils.l.a
        public final void keyBoardHide() {
            this.f104168a.j(0);
        }

        @Override // com.bilibili.playerbizcommon.utils.l.a
        public final void keyBoardShow(int i7) {
            this.f104168a.j(i7);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlangPediaFloatLayerService$showSlangPediaPanel$3(SlangPediaFloatLayerService slangPediaFloatLayerService, String str, boolean z6, boolean z7, boolean z8, Function0<Unit> function0, Continuation<? super SlangPediaFloatLayerService$showSlangPediaPanel$3> continuation) {
        super(2, continuation);
        this.this$0 = slangPediaFloatLayerService;
        this.$url = str;
        this.$needCloseIcon = z6;
        this.$needVerticalScrollbar = z7;
        this.$needKeyBoardListener = z8;
        this.$onLayerDismiss = function0;
    }

    private static final Unit invokeSuspend$lambda$0(final SlangPediaFloatLayerService slangPediaFloatLayerService, String str, a aVar, TheseusWebUIComponent theseusWebUIComponent, Ref.ObjectRef objectRef, com.bilibili.ogv.infra.coroutine.c cVar) {
        TheseusFloatLayerService.a aVar2 = new TheseusFloatLayerService.a(0, 0, 0, 0, new Function0(slangPediaFloatLayerService) { // from class: com.bilibili.ship.theseus.united.page.weblayer.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SlangPediaFloatLayerService f104251a;

            {
                this.f104251a = slangPediaFloatLayerService;
            }

            public final Object invoke() {
                return Integer.valueOf(SlangPediaFloatLayerService$showSlangPediaPanel$3.invokeSuspend$lambda$0$0(this.f104251a));
            }
        });
        cVar.b(new SlangPediaFloatLayerService$showSlangPediaPanel$3$1$1(slangPediaFloatLayerService, str, aVar, theseusWebUIComponent, aVar2, null));
        cVar.b(new SlangPediaFloatLayerService$showSlangPediaPanel$3$1$2(theseusWebUIComponent, objectRef, slangPediaFloatLayerService, aVar, str, null));
        cVar.b(new SlangPediaFloatLayerService$showSlangPediaPanel$3$1$3(slangPediaFloatLayerService, objectRef, theseusWebUIComponent, null));
        cVar.b(new SlangPediaFloatLayerService$showSlangPediaPanel$3$1$4(slangPediaFloatLayerService, theseusWebUIComponent, aVar2, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invokeSuspend$lambda$0$0(SlangPediaFloatLayerService slangPediaFloatLayerService) {
        return (slangPediaFloatLayerService.f104159g.i() || slangPediaFloatLayerService.f104159g.f()) ? 3 : 1;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SlangPediaFloatLayerService$showSlangPediaPanel$3(this.this$0, this.$url, this.$needCloseIcon, this.$needVerticalScrollbar, this.$needKeyBoardListener, this.$onLayerDismiss, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z6;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            SlangPediaFloatLayerService slangPediaFloatLayerService = this.this$0;
            slangPediaFloatLayerService.f104161j = false;
            slangPediaFloatLayerService.f104162k = 1;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            boolean zH = this.this$0.f104159g.h();
            String str = this.$url;
            SlangPediaFloatLayerService slangPediaFloatLayerService2 = this.this$0;
            slangPediaFloatLayerService2.getClass();
            com.bilibili.ogv.infra.jsb.d dVar = new com.bilibili.ogv.infra.jsb.d();
            for (Pair<String, com.bilibili.ogv.infra.jsb.f> pair : slangPediaFloatLayerService2.f104164m) {
                dVar.a((com.bilibili.ogv.infra.jsb.f) pair.component2(), (String) pair.component1());
            }
            if (this.$needCloseIcon) {
                String str2 = this.$url;
                boolean zAreEqual = Intrinsics.areEqual(Uri.parse(str2).getQueryParameter("na_close_hide"), "1");
                q4.r.a("url[", str2, "]", "H5Const");
                z6 = !zAreEqual;
            } else {
                z6 = false;
            }
            SlangPediaFloatLayerService slangPediaFloatLayerService3 = this.this$0;
            TheseusWebUIComponent theseusWebUIComponent = new TheseusWebUIComponent(str, dVar, new TheseusWebUIComponent.a(false, "", 0, 0, 0, z6, 0, this.$needVerticalScrollbar, slangPediaFloatLayerService3.b(slangPediaFloatLayerService3.f104159g.b()), DimenUtilsKt.dpToPx(com.bilibili.ship.theseus.united.page.intro.a.b(this.this$0.f104159g.b())), zH, true, this.this$0.f104159g.f102941e, 270268), null, new SlangPediaFloatLayerService.a(this.this$0), null, null, 104);
            SlangPediaFloatLayerService slangPediaFloatLayerService4 = this.this$0;
            a aVar = new a(slangPediaFloatLayerService4, theseusWebUIComponent);
            slangPediaFloatLayerService4.f104154b.getWindow().getDecorView().addOnLayoutChangeListener(aVar);
            if (this.$needKeyBoardListener) {
                com.bilibili.playerbizcommon.utils.l lVar = new com.bilibili.playerbizcommon.utils.l(this.this$0.f104154b, new b(theseusWebUIComponent), false);
                objectRef.element = lVar;
                lVar.b(this.this$0.f104154b.getWindow());
            }
            SlangPediaFloatLayerService slangPediaFloatLayerService5 = this.this$0;
            String str3 = this.$url;
            this.label = 1;
            ArrayList arrayList = new ArrayList();
            invokeSuspend$lambda$0(slangPediaFloatLayerService5, str3, aVar, theseusWebUIComponent, objectRef, new SelectKt$selectCancellingUnselected$scope$1(arrayList));
            if (FlowKt.first(FlowKt.merge(arrayList), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        SlangPediaFloatLayerService slangPediaFloatLayerService6 = this.this$0;
        Function0<Unit> function0 = this.$onLayerDismiss;
        slangPediaFloatLayerService6.f104162k = 2;
        slangPediaFloatLayerService6.f104161j = true;
        function0.invoke();
        if (slangPediaFloatLayerService6.f104160i) {
            ContainerStatusWatcher.INSTANCE.onChanged(slangPediaFloatLayerService6.f104162k);
        }
        return Unit.INSTANCE;
    }
}
