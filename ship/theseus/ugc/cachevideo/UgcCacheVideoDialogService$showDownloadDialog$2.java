package com.bilibili.ship.theseus.ugc.cachevideo;

import androidx.fragment.app.FragmentActivity;
import com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog;
import com.bilibili.playerbizcommonv2.widget.setting.channel.InterfaceC5833b;
import com.bilibili.ship.theseus.ugc.cachevideo.UgcCacheVideoDialogService$showDownloadDialog$2;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ugc.offline.download.AbstractVideoDownloadDelegateV3;
import com.bilibili.ugc.offline.download.NormalVideoDownloadDelegateV3;
import com.bilibili.ugc.offline.download.SeasonVideoDownloadDelegateV3;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import lv0.C7893a;
import mE0.d;
import mE0.e;
import mE0.g;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/cachevideo/UgcCacheVideoDialogService$showDownloadDialog$2.class */
final class UgcCacheVideoDialogService$showDownloadDialog$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final mE0.b $data;
    private Object L$0;
    int label;
    final UgcCacheVideoDialogService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.cachevideo.UgcCacheVideoDialogService$showDownloadDialog$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/cachevideo/UgcCacheVideoDialogService$showDownloadDialog$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final mE0.a $service;
        int label;
        final UgcCacheVideoDialogService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(UgcCacheVideoDialogService ugcCacheVideoDialogService, mE0.a aVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = ugcCacheVideoDialogService;
            this.$service = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$0(mE0.a aVar, boolean z6) {
            AbstractVideoDownloadDelegateV3 abstractVideoDownloadDelegateV3;
            VideoDownloadDialog videoDownloadDialog;
            AbstractVideoDownloadDelegateV3 abstractVideoDownloadDelegateV32 = aVar.a;
            boolean z7 = false;
            if (abstractVideoDownloadDelegateV32 != null ? abstractVideoDownloadDelegateV32.e() : false) {
                AbstractVideoDownloadDelegateV3 abstractVideoDownloadDelegateV33 = aVar.a;
                boolean zE = false;
                if (abstractVideoDownloadDelegateV33 != null) {
                    zE = abstractVideoDownloadDelegateV33.e();
                }
                if (zE && (abstractVideoDownloadDelegateV3 = aVar.a) != null && (videoDownloadDialog = abstractVideoDownloadDelegateV3.l) != null) {
                    videoDownloadDialog.dismiss();
                }
                z7 = true;
            }
            return z7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$service, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                BackActionRepository backActionRepository = this.this$0.f96347e;
                final mE0.a aVar = this.$service;
                Function1<? super Boolean, Boolean> function1 = new Function1(aVar) { // from class: com.bilibili.ship.theseus.ugc.cachevideo.a

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final mE0.a f96362a;

                    {
                        this.f96362a = aVar;
                    }

                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(UgcCacheVideoDialogService$showDownloadDialog$2.AnonymousClass2.invokeSuspend$lambda$0(this.f96362a, ((Boolean) obj2).booleanValue()));
                    }
                };
                this.label = 1;
                if (backActionRepository.b(function1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.cachevideo.UgcCacheVideoDialogService$showDownloadDialog$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/cachevideo/UgcCacheVideoDialogService$showDownloadDialog$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final mE0.b $data;
        final mE0.a $service;
        int label;
        final UgcCacheVideoDialogService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.cachevideo.UgcCacheVideoDialogService$showDownloadDialog$2$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/cachevideo/UgcCacheVideoDialogService$showDownloadDialog$2$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7893a.C1318a, Continuation<? super Unit>, Object> {
            final mE0.b $data;
            final mE0.a $service;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(mE0.a aVar, mE0.b bVar, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$service = aVar;
                this.$data = bVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$service, this.$data, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(C7893a.C1318a c1318a, Continuation<? super Unit> continuation) {
                return create(c1318a, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object next;
                AbstractVideoDownloadDelegateV3 abstractVideoDownloadDelegateV3;
                VideoDownloadDialog videoDownloadDialog;
                Object obj2;
                Object next2;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                C7893a.C1318a c1318a = (C7893a.C1318a) this.L$0;
                if (c1318a == null) {
                    return Unit.INSTANCE;
                }
                AbstractVideoDownloadDelegateV3 abstractVideoDownloadDelegateV32 = this.$service.a;
                if (abstractVideoDownloadDelegateV32 != null ? abstractVideoDownloadDelegateV32.e() : false) {
                    boolean zIsEmpty = this.$data.m.isEmpty();
                    long j7 = c1318a.f123395a.f123398b;
                    if (!zIsEmpty) {
                        Iterator it = this.$data.m.iterator();
                        while (true) {
                            next = null;
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next3 = it.next();
                            Iterator it2 = ((g) next3).d.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                Object next4 = it2.next();
                                Iterator it3 = ((d) next4).o.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        next2 = null;
                                        break;
                                    }
                                    next2 = it3.next();
                                    if (((e) next2).c == j7) {
                                        break;
                                    }
                                }
                                if (next2 != null) {
                                    obj2 = next4;
                                    break;
                                }
                            }
                            if (obj2 != null) {
                                next = next3;
                                break;
                            }
                        }
                    } else {
                        Iterator it4 = this.$data.l.iterator();
                        do {
                            next = null;
                            if (!it4.hasNext()) {
                                break;
                            }
                            next = it4.next();
                        } while (((e) next).c != j7);
                    }
                    if (next == null) {
                        mE0.a aVar = this.$service;
                        AbstractVideoDownloadDelegateV3 abstractVideoDownloadDelegateV33 = aVar.a;
                        boolean zE = false;
                        if (abstractVideoDownloadDelegateV33 != null) {
                            zE = abstractVideoDownloadDelegateV33.e();
                        }
                        if (zE && (abstractVideoDownloadDelegateV3 = aVar.a) != null && (videoDownloadDialog = abstractVideoDownloadDelegateV3.l) != null) {
                            videoDownloadDialog.dismiss();
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(UgcCacheVideoDialogService ugcCacheVideoDialogService, mE0.a aVar, mE0.b bVar, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = ugcCacheVideoDialogService;
            this.$service = aVar;
            this.$data = bVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$service, this.$data, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<C7893a.C1318a> stateFlow = this.this$0.f96346d.f123393f;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$service, this.$data, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/cachevideo/UgcCacheVideoDialogService$showDownloadDialog$2$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UgcCacheVideoDialogService f96350a;

        public a(UgcCacheVideoDialogService ugcCacheVideoDialogService) {
            this.f96350a = ugcCacheVideoDialogService;
        }

        public final void a() {
            this.f96350a.f96345c.i("UgcCacheVideoDialogService");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcCacheVideoDialogService$showDownloadDialog$2(UgcCacheVideoDialogService ugcCacheVideoDialogService, mE0.b bVar, Continuation<? super UgcCacheVideoDialogService$showDownloadDialog$2> continuation) {
        super(2, continuation);
        this.this$0 = ugcCacheVideoDialogService;
        this.$data = bVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UgcCacheVideoDialogService$showDownloadDialog$2 ugcCacheVideoDialogService$showDownloadDialog$2 = new UgcCacheVideoDialogService$showDownloadDialog$2(this.this$0, this.$data, continuation);
        ugcCacheVideoDialogService$showDownloadDialog$2.L$0 = obj;
        return ugcCacheVideoDialogService$showDownloadDialog$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        mE0.a aVar = (mE0.a) this.this$0.f96348f.getValue();
        AbstractVideoDownloadDelegateV3 abstractVideoDownloadDelegateV3 = aVar.a;
        if (!(abstractVideoDownloadDelegateV3 != null ? abstractVideoDownloadDelegateV3.e() : false)) {
            FragmentActivity fragmentActivity = this.this$0.f96344b;
            mE0.b bVar = this.$data;
            InterfaceC5833b.C0553b c0553b = InterfaceC5833b.C0553b.f83223a;
            NormalVideoDownloadDelegateV3 normalVideoDownloadDelegateV3 = ((ArrayList) bVar.m).isEmpty() ? new NormalVideoDownloadDelegateV3(fragmentActivity, bVar, c0553b) : new SeasonVideoDownloadDelegateV3(fragmentActivity, bVar, c0553b);
            aVar.a = normalVideoDownloadDelegateV3;
            normalVideoDownloadDelegateV3.show();
        }
        this.this$0.f96345c.h("UgcCacheVideoDialogService");
        UgcCacheVideoDialogService ugcCacheVideoDialogService = this.this$0;
        a aVar2 = new a(ugcCacheVideoDialogService);
        AbstractVideoDownloadDelegateV3 abstractVideoDownloadDelegateV32 = aVar.a;
        if (abstractVideoDownloadDelegateV32 != null) {
            abstractVideoDownloadDelegateV32.k = aVar2;
        }
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(ugcCacheVideoDialogService, aVar, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, aVar, this.$data, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new UgcCacheVideoDialogService$showDownloadDialog$2$invokeSuspend$$inlined$awaitCancel$1(null, aVar, this.this$0), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
