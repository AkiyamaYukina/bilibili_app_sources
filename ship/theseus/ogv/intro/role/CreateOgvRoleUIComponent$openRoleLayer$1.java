package com.bilibili.ship.theseus.ogv.intro.role;

import F3.U3;
import com.bilibili.biligame.ui.feed.widget.bottomtip.K;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/role/CreateOgvRoleUIComponent$openRoleLayer$1.class */
final class CreateOgvRoleUIComponent$openRoleLayer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final t $data;
    private Object L$0;
    Object L$1;
    int label;
    final CreateOgvRoleUIComponent this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/role/CreateOgvRoleUIComponent$openRoleLayer$1$a.class */
    public static final class a implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CoroutineScope f93424a;

        public a(CoroutineScope coroutineScope) {
            this.f93424a = coroutineScope;
        }

        public final Object invoke() {
            CoroutineScopeKt.cancel$default(this.f93424a, (CancellationException) null, 1, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/role/CreateOgvRoleUIComponent$openRoleLayer$1$b.class */
    public static final class b extends com.bilibili.ship.theseus.united.utils.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f93425b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CreateOgvRoleUIComponent f93426c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final CoroutineScope f93427d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ThemeStrategy themeStrategy, e eVar, CreateOgvRoleUIComponent createOgvRoleUIComponent, CoroutineScope coroutineScope) {
            super(themeStrategy);
            this.f93425b = eVar;
            this.f93426c = createOgvRoleUIComponent;
            this.f93427d = coroutineScope;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0081  */
        @Override // com.bilibili.ship.theseus.united.utils.a
        @androidx.compose.runtime.Composable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(androidx.compose.ui.Modifier.Companion r7, androidx.compose.runtime.Composer r8) {
            /*
                r6 = this;
                r0 = r8
                r1 = 1849522600(0x6e3d79a8, float:1.4659935E28)
                r0.startReplaceGroup(r1)
                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                if (r0 == 0) goto L18
                r0 = 1849522600(0x6e3d79a8, float:1.4659935E28)
                r1 = 6
                r2 = -1
                java.lang.String r3 = "com.bilibili.ship.theseus.united.utils.BiliComposeUIComponent.<no name provided>.Content (BiliComposeUIComponent.kt:18)"
                androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
            L18:
                r0 = r8
                r1 = -2145454940(0xffffffff801ef4a4, float:-2.842825E-39)
                r0.startReplaceGroup(r1)
                r0 = r6
                com.bilibili.ship.theseus.ogv.intro.role.CreateOgvRoleUIComponent r0 = r0.f93426c
                com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository r0 = r0.f93422g
                kotlinx.coroutines.flow.StateFlow<java.lang.Integer> r0 = r0.f100020a
                r1 = 0
                r2 = r8
                r3 = 0
                r4 = 1
                androidx.compose.runtime.State r0 = androidx.compose.runtime.SnapshotStateKt.collectAsState(r0, r1, r2, r3, r4)
                java.lang.Object r0 = r0.getValue()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                float r0 = (float) r0
                float r0 = androidx.compose.ui.unit.Dp.m3880constructorimpl(r0)
                r9 = r0
                r0 = r6
                com.bilibili.ship.theseus.ogv.intro.role.e r0 = r0.f93425b
                r13 = r0
                r0 = r13
                androidx.compose.runtime.MutableState r0 = r0.f93461e
                r1 = r9
                androidx.compose.ui.unit.Dp r1 = androidx.compose.ui.unit.Dp.m3878boximpl(r1)
                r0.setValue(r1)
                r0 = r6
                kotlinx.coroutines.CoroutineScope r0 = r0.f93427d
                r14 = r0
                r0 = r8
                r1 = r14
                boolean r0 = r0.changedInstance(r1)
                r10 = r0
                r0 = r8
                java.lang.Object r0 = r0.rememberedValue()
                r12 = r0
                r0 = r10
                if (r0 != 0) goto L81
                r0 = r12
                r11 = r0
                r0 = r12
                androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
                java.lang.Object r1 = r1.getEmpty()
                if (r0 != r1) goto L94
            L81:
                com.bilibili.ship.theseus.ogv.intro.role.CreateOgvRoleUIComponent$openRoleLayer$1$a r0 = new com.bilibili.ship.theseus.ogv.intro.role.CreateOgvRoleUIComponent$openRoleLayer$1$a
                r1 = r0
                r2 = r14
                r1.<init>(r2)
                r11 = r0
                r0 = r8
                r1 = r11
                r0.updateRememberedValue(r1)
            L94:
                r0 = r13
                r1 = r11
                kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
                r2 = r7
                r3 = r8
                r4 = 384(0x180, float:5.38E-43)
                com.bilibili.ship.theseus.ogv.intro.role.s.c(r0, r1, r2, r3, r4)
                r0 = r8
                r0.endReplaceGroup()
                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                if (r0 == 0) goto Lb2
                androidx.compose.runtime.ComposerKt.traceEventEnd()
            Lb2:
                r0 = r8
                r0.endReplaceGroup()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.role.CreateOgvRoleUIComponent$openRoleLayer$1.b.a(androidx.compose.ui.Modifier$Companion, androidx.compose.runtime.Composer):void");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateOgvRoleUIComponent$openRoleLayer$1(t tVar, CreateOgvRoleUIComponent createOgvRoleUIComponent, Continuation<? super CreateOgvRoleUIComponent$openRoleLayer$1> continuation) {
        super(2, continuation);
        this.$data = tVar;
        this.this$0 = createOgvRoleUIComponent;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CreateOgvRoleUIComponent$openRoleLayer$1 createOgvRoleUIComponent$openRoleLayer$1 = new CreateOgvRoleUIComponent$openRoleLayer$1(this.$data, this.this$0, continuation);
        createOgvRoleUIComponent$openRoleLayer$1.L$0 = obj;
        return createOgvRoleUIComponent$openRoleLayer$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        com.bilibili.ship.theseus.united.page.playingarea.g gVar;
        CreateOgvRoleUIComponent createOgvRoleUIComponent;
        Throwable th;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            createOgvRoleUIComponent = (CreateOgvRoleUIComponent) this.L$1;
            com.bilibili.ship.theseus.united.page.playingarea.g gVar2 = (com.bilibili.ship.theseus.united.page.playingarea.g) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                gVar = gVar2;
                gVar.j(createOgvRoleUIComponent);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                gVar = gVar2;
                th = th2;
                gVar.j(createOgvRoleUIComponent);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        e eVar = new e(new U3(8));
        List<Role> list = this.$data.f93507c;
        CreateOgvRoleUIComponent createOgvRoleUIComponent2 = this.this$0;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(createOgvRoleUIComponent2.b((Role) it.next(), true));
        }
        eVar.f93460d.setValue(arrayList);
        t tVar = this.$data;
        eVar.f93458b.setValue(K.b(((ArrayList) tVar.f93507c).size(), tVar.f93505a, "（", "）"));
        b bVar = new b(ThemeStrategy.FollowApp, eVar, this.this$0, coroutineScope);
        CreateOgvRoleUIComponent createOgvRoleUIComponent3 = this.this$0;
        gVar = createOgvRoleUIComponent3.f93421f;
        gVar.f(createOgvRoleUIComponent3);
        try {
            TheseusFloatLayerService theseusFloatLayerService = createOgvRoleUIComponent3.f93418c;
            this.L$0 = gVar;
            this.L$1 = createOgvRoleUIComponent3;
            this.label = 1;
            if (theseusFloatLayerService.h(bVar, theseusFloatLayerService.f99664n, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            createOgvRoleUIComponent = createOgvRoleUIComponent3;
            gVar.j(createOgvRoleUIComponent);
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            createOgvRoleUIComponent = createOgvRoleUIComponent3;
            th = th3;
            gVar.j(createOgvRoleUIComponent);
            throw th;
        }
    }
}
