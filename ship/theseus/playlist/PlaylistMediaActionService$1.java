package com.bilibili.ship.theseus.playlist;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.unit.IntOffset;
import com.bilibili.lib.fasthybrid.runtime.IRuntime;
import com.bilibili.playset.detail.widget.C5924i;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import com.mall.ui.page.search.MallSearchBindFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kntr.app.toy.core.ToyDetailViewModel;
import kntr.base.device.DeviceFormFactor;
import kntr.base.device.KDevice;
import kntr.common.trio.systemui.Orientation;
import kntr.common.trio.vertex.VertexContext;
import kntr.common.trio.vertex.VertexContextKt;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistMediaActionService$1.class */
final class PlaylistMediaActionService$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final y this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistMediaActionService$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y f95069a;

        public a(y yVar) {
            this.f95069a = yVar;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
            MutableStateFlow<PlaylistRepository.e> mutableStateFlow;
            Object value;
            PlaylistRepository.e eVar;
            Unit unit;
            final PlaylistRepository.c cVar = (PlaylistRepository.c) obj;
            boolean z6 = cVar instanceof PlaylistRepository.c.b;
            int i7 = 0;
            y yVar = this.f95069a;
            if (z6) {
                Iterator<MultiTypeMedia> it = yVar.f96138e.d().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i7 = -1;
                        break;
                    }
                    if (it.next().d() == ((PlaylistRepository.c.b) cVar).f95134a.d()) {
                        break;
                    }
                    i7++;
                }
                if (i7 == -1) {
                    unit = Unit.INSTANCE;
                } else {
                    yVar.f96138e.j(new A8.a<>(cVar, 3));
                    unit = Unit.INSTANCE;
                }
            } else {
                if (!(cVar instanceof PlaylistRepository.c.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                Iterator<MultiTypeMedia> it2 = yVar.f96138e.d().iterator();
                int i8 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i8 = -1;
                        break;
                    }
                    if (it2.next().d() == ((PlaylistRepository.c.a) cVar).f95132a.d()) {
                        break;
                    }
                    i8++;
                }
                if (i8 == -1) {
                    unit = Unit.INSTANCE;
                } else {
                    final int i9 = 0;
                    Function1<? super List<MultiTypeMedia>, ? extends List<MultiTypeMedia>> function1 = new Function1(cVar, i9) { // from class: com.bilibili.ship.theseus.playlist.x

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f96132a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Object f96133b;

                        {
                            this.f96132a = i9;
                            this.f96133b = cVar;
                        }

                        public final Object invoke(Object obj2) {
                            switch (this.f96132a) {
                                case 0:
                                    List<MultiTypeMedia> list = (List) obj2;
                                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                    for (MultiTypeMedia multiTypeMedia : list) {
                                        long jD = multiTypeMedia.d();
                                        PlaylistRepository.c.a aVar = (PlaylistRepository.c.a) ((PlaylistRepository.c) this.f96133b);
                                        MultiTypeMedia multiTypeMediaX = multiTypeMedia;
                                        if (jD == aVar.f95132a.d()) {
                                            multiTypeMediaX = multiTypeMedia.x(aVar.f95133b);
                                        }
                                        arrayList.add(multiTypeMediaX);
                                    }
                                    return arrayList;
                                case 1:
                                    ((MallSearchBindFragment) this.f96133b).tf((String) obj2);
                                    return Unit.INSTANCE;
                                case 2:
                                    VertexContext vertexContext = (VertexContext) obj2;
                                    String str = (String) ((Ref.ObjectRef) this.f96133b).element;
                                    return new kntr.app.toy.ui.E(vertexContext, VertexContextKt.getDefaultContentType(), VertexContextKt.getDefaultKey(), str, SnapshotStateKt.mutableStateOf$default(KDevice.INSTANCE.getFormFactor() == DeviceFormFactor.Pad ? Orientation.Unspecified : Orientation.User, null, 2, null), SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null), new ToyDetailViewModel("", str));
                                case 3:
                                    kntr.common.photonic.aphro.ui.preview.state.c cVar2 = (kntr.common.photonic.aphro.ui.preview.state.c) this.f96133b;
                                    return IntOffset.m3937boximpl(IntOffset.m3940constructorimpl((((long) ((int) ((Number) cVar2.h.a.getValue()).floatValue())) << 32) | (((long) ((int) ((Number) cVar2.h.b.getValue()).floatValue())) & 4294967295L)));
                                default:
                                    IRuntime.a aVar2 = (IRuntime.a) obj2;
                                    y60.j jVar = (y60.j) this.f96133b;
                                    v10.a aVarK = jVar.k();
                                    if (aVarK != null) {
                                        if ((aVar2 instanceof IRuntime.a.a) && aVarK.b() && !jVar.e) {
                                            jVar.e = true;
                                            aVarK.h();
                                        } else if ((aVar2 instanceof IRuntime.a.d) && aVarK.b() && jVar.e) {
                                            jVar.e = false;
                                            aVarK.j();
                                        }
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    PlaylistRepository playlistRepository = yVar.f96138e;
                    playlistRepository.j(function1);
                    long jD = playlistRepository.c().f95137a.d();
                    PlaylistRepository.c.a aVar = (PlaylistRepository.c.a) cVar;
                    if (jD == aVar.f95132a.d()) {
                        do {
                            mutableStateFlow = playlistRepository.f95110r;
                            value = mutableStateFlow.getValue();
                            PlaylistRepository.e eVar2 = (PlaylistRepository.e) value;
                            eVar = new PlaylistRepository.e(eVar2.f95137a.x(aVar.f95133b), eVar2.f95138b, eVar2.f95139c, eVar2.f95140d);
                            playlistRepository.j(new C5924i(1, eVar, eVar2));
                        } while (!mutableStateFlow.compareAndSet(value, eVar));
                    }
                    unit = Unit.INSTANCE;
                }
            }
            return unit;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistMediaActionService$1(y yVar, Continuation<? super PlaylistMediaActionService$1> continuation) {
        super(2, continuation);
        this.this$0 = yVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlaylistMediaActionService$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            y yVar = this.this$0;
            SharedFlow<PlaylistRepository.c> sharedFlow = yVar.f96138e.f95115w;
            a aVar = new a(yVar);
            this.label = 1;
            if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
