package com.bilibili.ship.theseus.playlist.selector;

import android.widget.FrameLayout;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bilibili.app.gemini.ui.UIComponentExtKt;
import com.bilibili.app.screen.adjust.widget.z;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import com.bilibili.ship.theseus.playlist.selector.k;
import com.bilibili.ship.theseus.playlist.uicomponent.PlaylistRecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/PlaylistSelectorUIComponent$bind$2.class */
final class PlaylistSelectorUIComponent$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final Pu0.d $binding;
    final FrameLayout $root;
    private Object L$0;
    int label;
    final k this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.selector.PlaylistSelectorUIComponent$bind$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/PlaylistSelectorUIComponent$bind$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final FrameLayout $root;
        int label;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.selector.PlaylistSelectorUIComponent$bind$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/PlaylistSelectorUIComponent$bind$2$1$1.class */
        public static final class C07961 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            final FrameLayout $root;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07961(FrameLayout frameLayout, Continuation<? super C07961> continuation) {
                super(2, continuation);
                this.$root = frameLayout;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07961(this.$root, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                z.a(this.$root);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FrameLayout frameLayout, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$root = frameLayout;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$root, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowA = UIComponentExtKt.a(this.$root);
                C07961 c07961 = new C07961(this.$root, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowA, c07961, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.selector.PlaylistSelectorUIComponent$bind$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/PlaylistSelectorUIComponent$bind$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final k this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.selector.PlaylistSelectorUIComponent$bind$2$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/PlaylistSelectorUIComponent$bind$2$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends k.d.b>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final k this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(k kVar, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = kVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(List<k.d.b> list, Continuation<? super Unit> continuation) {
                return create(list, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                List list = (List) this.L$0;
                b bVar = this.this$0.f95884f;
                bVar.getClass();
                ArrayList arrayList = new ArrayList(bVar.f95857c);
                DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new a(arrayList.size(), list.size(), arrayList, list));
                bVar.f95857c.clear();
                bVar.f95857c.addAll(list);
                diffResultCalculateDiff.dispatchUpdatesTo(bVar);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(k kVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = kVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                k kVar = this.this$0;
                Flow<List<k.d.b>> flow = kVar.f95879a.f95889a;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(kVar, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.selector.PlaylistSelectorUIComponent$bind$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/PlaylistSelectorUIComponent$bind$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Pu0.d $binding;
        int label;
        final k this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.selector.PlaylistSelectorUIComponent$bind$2$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/PlaylistSelectorUIComponent$bind$2$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<PlaylistRepository.b, Continuation<? super Unit>, Object> {
            final Pu0.d $binding;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Pu0.d dVar, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$binding = dVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(PlaylistRepository.b bVar, Continuation<? super Unit> continuation) {
                return create(bVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$binding.f19314b.f96006a = (PlaylistRepository.b) this.L$0;
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(k kVar, Pu0.d dVar, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = kVar;
            this.$binding = dVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<PlaylistRepository.b> stateFlow = this.this$0.f95879a.f95890b;
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.selector.PlaylistSelectorUIComponent$bind$2$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/PlaylistSelectorUIComponent$bind$2$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Pu0.d $binding;
        int label;
        final k this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(k kVar, Pu0.d dVar, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = kVar;
            this.$binding = dVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, this.$binding, continuation);
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
            final k kVar = this.this$0;
            final PlaylistRecyclerView playlistRecyclerView = this.$binding.f19314b;
            final PlaylistRepository.e eVar = kVar.f95879a.f95891c;
            playlistRecyclerView.post(new Runnable(eVar, kVar, playlistRecyclerView) { // from class: com.bilibili.ship.theseus.playlist.selector.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PlaylistRepository.e f95873a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final k f95874b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final PlaylistRecyclerView f95875c;

                {
                    this.f95873a = eVar;
                    this.f95874b = kVar;
                    this.f95875c = playlistRecyclerView;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PlaylistRepository.e eVar2 = this.f95873a;
                    k kVar2 = this.f95874b;
                    final PlaylistRecyclerView playlistRecyclerView2 = this.f95875c;
                    MultiTypeMedia multiTypeMedia = eVar2.f95137a;
                    Iterator<k.d.b> it = kVar2.f95884f.f95857c.iterator();
                    int i7 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i7 = -1;
                            break;
                        } else if (it.next().f95899c == multiTypeMedia.f95235i) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                    if (i7 == -1) {
                        return;
                    }
                    Ou0.c cVar = eVar2.f95138b;
                    int i8 = 0;
                    if (cVar != null) {
                        i8 = 0;
                        if (multiTypeMedia.f95250x) {
                            i8 = cVar.f18102p;
                        }
                    }
                    final int i9 = i7;
                    final int i10 = i8;
                    playlistRecyclerView2.post(new Runnable(playlistRecyclerView2, i9, i10) { // from class: com.bilibili.ship.theseus.playlist.selector.j

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final PlaylistRecyclerView f95876a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final int f95877b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final int f95878c;

                        {
                            this.f95876a = playlistRecyclerView2;
                            this.f95877b = i9;
                            this.f95878c = i10;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ((LinearLayoutManager) this.f95876a.getLayoutManager()).scrollToPositionWithOffset(RangesKt.coerceAtLeast(0, this.f95877b + this.f95878c), 0);
                        }
                    });
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistSelectorUIComponent$bind$2(FrameLayout frameLayout, k kVar, Pu0.d dVar, Continuation<? super PlaylistSelectorUIComponent$bind$2> continuation) {
        super(2, continuation);
        this.$root = frameLayout;
        this.this$0 = kVar;
        this.$binding = dVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlaylistSelectorUIComponent$bind$2 playlistSelectorUIComponent$bind$2 = new PlaylistSelectorUIComponent$bind$2(this.$root, this.this$0, this.$binding, continuation);
        playlistSelectorUIComponent$bind$2.L$0 = obj;
        return playlistSelectorUIComponent$bind$2;
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
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$root, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.$binding, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, this.$binding, null), 3, (Object) null);
    }
}
