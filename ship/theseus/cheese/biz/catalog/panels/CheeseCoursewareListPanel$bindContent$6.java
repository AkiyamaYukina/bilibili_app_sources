package com.bilibili.ship.theseus.cheese.biz.catalog.panels;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bu0.p;
import bu0.r;
import bu0.s;
import bu0.t;
import bu0.u;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.lib.foundation.Foundation;
import eu0.C6979B;
import eu0.C6985d;
import eu0.C6991j;
import eu0.C6992k;
import eu0.C6999r;
import eu0.C7000s;
import fu0.C7187i;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/panels/CheeseCoursewareListPanel$bindContent$6.class */
final class CheeseCoursewareListPanel$bindContent$6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final C7187i $binding;
    final Ref.ObjectRef<p> $listAdapter;
    private Object L$0;
    int label;
    final d this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.catalog.panels.CheeseCoursewareListPanel$bindContent$6$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/panels/CheeseCoursewareListPanel$bindContent$6$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Ref.ObjectRef<p> $listAdapter;
        int label;
        final d this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.catalog.panels.CheeseCoursewareListPanel$bindContent$6$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/panels/CheeseCoursewareListPanel$bindContent$6$1$1.class */
        public static final class C06011 extends SuspendLambda implements Function2<com.bilibili.ship.theseus.cheese.biz.catalog.c, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<p> $listAdapter;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06011(Ref.ObjectRef<p> objectRef, Continuation<? super C06011> continuation) {
                super(2, continuation);
                this.$listAdapter = objectRef;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06011 c06011 = new C06011(this.$listAdapter, continuation);
                c06011.L$0 = obj;
                return c06011;
            }

            public final Object invoke(com.bilibili.ship.theseus.cheese.biz.catalog.c cVar, Continuation<? super Unit> continuation) {
                return create(cVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [R, com.bilibili.ship.theseus.cheese.biz.catalog.c] */
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ?? r02 = (com.bilibili.ship.theseus.cheese.biz.catalog.c) this.L$0;
                if (r02 != 0) {
                    p pVar = (p) this.$listAdapter.element;
                    pVar.f57096a = r02;
                    ArrayList arrayList = new ArrayList();
                    C7000s c7000s = r02.f89161d;
                    boolean zIsEmpty = c7000s.f117575a.isEmpty();
                    C6992k c6992k = r02.f89160c;
                    if (!zIsEmpty || !c6992k.f117548a.isEmpty()) {
                        t tVar = new t(new s(Foundation.Companion.instance().getApp().getString(2131848802)));
                        Iterator<T> it = c7000s.f117575a.iterator();
                        while (it.hasNext()) {
                            u uVar = new u((C6999r) it.next(), 3);
                            uVar.f57104c = tVar;
                            ((ArrayList) tVar.f57101e).add(uVar);
                        }
                        Iterator<T> it2 = c6992k.f117548a.iterator();
                        while (it2.hasNext()) {
                            u uVar2 = new u((C6991j) it2.next(), 2);
                            uVar2.f57104c = tVar;
                            ((ArrayList) tVar.f57101e).add(uVar2);
                        }
                        arrayList.add(tVar);
                    }
                    if (!r02.f89158a.isEmpty()) {
                        Foundation.Companion companion = Foundation.Companion;
                        t tVar2 = new t(new s(companion.instance().getApp().getString(2131848873)));
                        t tVar3 = new t(new s(companion.instance().getApp().getString(2131848760)));
                        for (C6979B c6979b : r02.f89158a) {
                            Iterator<T> it3 = c6979b.f117495d.iterator();
                            while (it3.hasNext()) {
                                u uVar3 = new u((C6991j) it3.next(), 2);
                                uVar3.f57104c = tVar2;
                                ((ArrayList) tVar2.f57101e).add(uVar3);
                            }
                            Iterator<T> it4 = c6979b.f117496e.iterator();
                            while (it4.hasNext()) {
                                Iterator<T> it5 = ((C6985d) it4.next()).f117527w.iterator();
                                while (it5.hasNext()) {
                                    u uVar4 = new u((C6991j) it5.next(), 2);
                                    uVar4.f57104c = tVar3;
                                    ((ArrayList) tVar3.f57101e).add(uVar4);
                                }
                            }
                        }
                        if (!((ArrayList) tVar2.f57101e).isEmpty()) {
                            arrayList.add(tVar2);
                        }
                        if (!((ArrayList) tVar3.f57101e).isEmpty()) {
                            arrayList.add(tVar3);
                        }
                    }
                    pVar.f57097b = arrayList;
                    pVar.f57098c = r.N(arrayList);
                    pVar.notifyDataSetChanged();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d dVar, Ref.ObjectRef<p> objectRef, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = dVar;
            this.$listAdapter = objectRef;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$listAdapter, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<com.bilibili.ship.theseus.cheese.biz.catalog.c> stateFlow = this.this$0.f89201l;
                C06011 c06011 = new C06011(this.$listAdapter, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c06011, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.catalog.panels.CheeseCoursewareListPanel$bindContent$6$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/panels/CheeseCoursewareListPanel$bindContent$6$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C7187i $binding;
        int label;
        final d this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.catalog.panels.CheeseCoursewareListPanel$bindContent$6$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/panels/CheeseCoursewareListPanel$bindContent$6$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final C7187i $binding;
            int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C7187i c7187i, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$binding = c7187i;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, continuation);
                anonymousClass1.I$0 = ((Number) obj).intValue();
                return anonymousClass1;
            }

            public final Object invoke(int i7, Continuation<? super Unit> continuation) {
                return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i7 = this.I$0;
                RelativeLayout relativeLayout = this.$binding.f119551c;
                relativeLayout.setPaddingRelative(DimenUtilsKt.dpToPx(i7), relativeLayout.getPaddingTop(), DimenUtilsKt.dpToPx(i7), relativeLayout.getPaddingBottom());
                RecyclerView recyclerView = this.$binding.f119552d;
                recyclerView.setPaddingRelative(DimenUtilsKt.dpToPx(i7), recyclerView.getPaddingTop(), DimenUtilsKt.dpToPx(i7), recyclerView.getPaddingBottom());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(d dVar, C7187i c7187i, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = dVar;
            this.$binding = c7187i;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Integer> stateFlow = this.this$0.f89203n;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.catalog.panels.CheeseCoursewareListPanel$bindContent$6$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/panels/CheeseCoursewareListPanel$bindContent$6$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C7187i $binding;
        final Ref.ObjectRef<p> $listAdapter;
        int label;
        final d this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.catalog.panels.CheeseCoursewareListPanel$bindContent$6$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/panels/CheeseCoursewareListPanel$bindContent$6$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final C7187i $binding;
            final Ref.ObjectRef<p> $listAdapter;
            boolean Z$0;
            int label;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.catalog.panels.CheeseCoursewareListPanel$bindContent$6$3$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/panels/CheeseCoursewareListPanel$bindContent$6$3$1$a.class */
            public static final class a extends GridLayoutManager.SpanSizeLookup {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Ref.ObjectRef<p> f89196a;

                public a(Ref.ObjectRef<p> objectRef) {
                    this.f89196a = objectRef;
                }

                @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
                public final int getSpanSize(int i7) {
                    int itemViewType = ((p) this.f89196a.element).getItemViewType(i7);
                    int i8 = 1;
                    if (itemViewType == 1) {
                        i8 = 2;
                    }
                    return i8;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C7187i c7187i, Ref.ObjectRef<p> objectRef, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$binding = c7187i;
                this.$listAdapter = objectRef;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, this.$listAdapter, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            public final Object invokeSuspend(Object obj) {
                RecyclerView.LayoutManager linearLayoutManager;
                View viewFindViewByPosition;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                boolean z6 = this.Z$0;
                RecyclerView.LayoutManager layoutManager = this.$binding.f119552d.getLayoutManager();
                boolean z7 = layoutManager instanceof LinearLayoutManager;
                LinearLayoutManager linearLayoutManager2 = z7 ? (LinearLayoutManager) layoutManager : null;
                int iFindFirstVisibleItemPosition = linearLayoutManager2 != null ? linearLayoutManager2.findFirstVisibleItemPosition() : 0;
                LinearLayoutManager linearLayoutManager3 = z7 ? (LinearLayoutManager) layoutManager : null;
                int top = (linearLayoutManager3 == null || (viewFindViewByPosition = linearLayoutManager3.findViewByPosition(iFindFirstVisibleItemPosition)) == null) ? 0 : viewFindViewByPosition.getTop();
                C7187i c7187i = this.$binding;
                RecyclerView recyclerView = c7187i.f119552d;
                if (z6) {
                    GridLayoutManager gridLayoutManager = new GridLayoutManager(c7187i.f119549a.getContext(), 2);
                    gridLayoutManager.setSpanSizeLookup(new a(this.$listAdapter));
                    linearLayoutManager = gridLayoutManager;
                } else {
                    linearLayoutManager = new LinearLayoutManager(c7187i.f119549a.getContext(), 1, false);
                }
                recyclerView.setLayoutManager(linearLayoutManager);
                RecyclerView.LayoutManager layoutManager2 = this.$binding.f119552d.getLayoutManager();
                LinearLayoutManager linearLayoutManager4 = null;
                if (layoutManager2 instanceof LinearLayoutManager) {
                    linearLayoutManager4 = (LinearLayoutManager) layoutManager2;
                }
                if (linearLayoutManager4 != null) {
                    linearLayoutManager4.scrollToPositionWithOffset(iFindFirstVisibleItemPosition, top);
                }
                this.$binding.f119552d.invalidateItemDecorations();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(d dVar, C7187i c7187i, Ref.ObjectRef<p> objectRef, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = dVar;
            this.$binding = c7187i;
            this.$listAdapter = objectRef;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$binding, this.$listAdapter, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Boolean> stateFlow = this.this$0.f89204o;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, this.$listAdapter, null);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseCoursewareListPanel$bindContent$6(d dVar, Ref.ObjectRef<p> objectRef, C7187i c7187i, Continuation<? super CheeseCoursewareListPanel$bindContent$6> continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$listAdapter = objectRef;
        this.$binding = c7187i;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheeseCoursewareListPanel$bindContent$6 cheeseCoursewareListPanel$bindContent$6 = new CheeseCoursewareListPanel$bindContent$6(this.this$0, this.$listAdapter, this.$binding, continuation);
        cheeseCoursewareListPanel$bindContent$6.L$0 = obj;
        return cheeseCoursewareListPanel$bindContent$6;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$listAdapter, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$binding, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.$binding, this.$listAdapter, null), 3, (Object) null);
    }
}
