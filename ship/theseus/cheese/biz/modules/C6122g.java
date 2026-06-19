package com.bilibili.ship.theseus.cheese.biz.modules;

import By0.H0;
import com.bapis.bilibili.app.viewunite.common.Live;
import com.bapis.bilibili.app.viewunite.common.Owner;
import com.bapis.bilibili.app.viewunite.common.PugvSeasonCooperator;
import com.bapis.bilibili.app.viewunite.common.PugvSeasonPublisher;
import com.bapis.bilibili.app.viewunite.common.PugvSeasonPublisherSkuContent;
import com.bapis.bilibili.app.viewunite.common.PugvSeasonPublisherSkuContentItem;
import com.bapis.bilibili.app.viewunite.v1.ViewReply;
import com.bilibili.adcommon.data.model.ProductComment;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.ship.theseus.cheese.biz.intro.publisher.C6107c;
import com.bilibili.ship.theseus.cheese.biz.intro.publisher.C6112h;
import com.bilibili.ship.theseus.cheese.biz.intro.publisher.CheesePriceWeakenPublisherComponent;
import com.bilibili.ship.theseus.cheese.biz.intro.publisher.i;
import com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository$special$$inlined$map$1;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import eu0.C6982a;
import eu0.C6984c;
import eu0.C7004w;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.modules.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/g.class */
public final /* synthetic */ class C6122g implements nv0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6982a f90400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bilibili.ship.theseus.cheese.biz.intro.publisher.t f90401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewReply f90402c;

    public /* synthetic */ C6122g(C6982a c6982a, com.bilibili.ship.theseus.cheese.biz.intro.publisher.t tVar, ViewReply viewReply) {
        this.f90400a = c6982a;
        this.f90401b = tVar;
        this.f90402c = viewReply;
    }

    /* JADX WARN: Type inference failed for: r0v78, types: [com.bilibili.ship.theseus.cheese.biz.intro.publisher.CheesePublisherService$createPublisherOwner$$inlined$map$1] */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.bilibili.ship.theseus.cheese.biz.intro.publisher.CheesePublisherService$createPublisherCooperator$$inlined$map$1] */
    /* JADX WARN: Type inference failed for: r9v7, types: [com.bilibili.ship.theseus.cheese.biz.intro.publisher.q] */
    @Override // nv0.h
    public final void a(nv0.m mVar) {
        PugvSeasonPublisher pugvSeasonPublisher = mVar.f124400a.getPugvSeasonPublisher();
        C7004w c7004wA = C6984c.a(pugvSeasonPublisher.getNav());
        String publisherDesc = pugvSeasonPublisher.getPublisherDesc();
        List<PugvSeasonCooperator> cooperatorsList = pugvSeasonPublisher.getCooperatorsList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(cooperatorsList, 10));
        for (PugvSeasonCooperator pugvSeasonCooperator : cooperatorsList) {
            arrayList.add(new com.bilibili.ship.theseus.cheese.biz.intro.publisher.D(pugvSeasonCooperator.getMid(), pugvSeasonCooperator.getAvatar(), pugvSeasonCooperator.getNickname(), pugvSeasonCooperator.getIsOwner(), pugvSeasonCooperator.getRole(), pugvSeasonCooperator.getUserLink(), pugvSeasonCooperator.getFollowed()));
        }
        PugvSeasonPublisherSkuContent skuContent = pugvSeasonPublisher.getSkuContent();
        String title = skuContent.getTitle();
        List<PugvSeasonPublisherSkuContentItem> itemsList = skuContent.getItemsList();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(itemsList, 10));
        for (PugvSeasonPublisherSkuContentItem pugvSeasonPublisherSkuContentItem : itemsList) {
            arrayList2.add(new com.bilibili.ship.theseus.cheese.biz.intro.publisher.G(pugvSeasonPublisherSkuContentItem.getTitle(), pugvSeasonPublisherSkuContentItem.getSeasonId(), pugvSeasonPublisherSkuContentItem.getSelected()));
        }
        final com.bilibili.ship.theseus.cheese.biz.intro.publisher.E e7 = new com.bilibili.ship.theseus.cheese.biz.intro.publisher.E(c7004wA, publisherDesc, arrayList, new com.bilibili.ship.theseus.cheese.biz.intro.publisher.F(title, arrayList2));
        boolean zA = this.f90400a.a();
        final com.bilibili.ship.theseus.cheese.biz.intro.publisher.t tVar = this.f90401b;
        if (zA) {
            tVar.f89892a.f89880c.setValue(e7);
            mVar.a(new RunningUIComponent(new CheesePriceWeakenPublisherComponent(new C6112h(e7, tVar.h.f100021b, new Function1(0, tVar, e7) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.publisher.q

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f89884a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f89885b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f89886c;

                {
                    this.f89884a = i;
                    this.f89885b = tVar;
                    this.f89886c = e7;
                }

                public final Object invoke(Object obj) {
                    switch (this.f89884a) {
                        case 0:
                            int iIntValue = ((Integer) obj).intValue();
                            t tVar2 = (t) this.f89885b;
                            tVar2.a();
                            G g7 = (G) CollectionsKt.getOrNull(((E) this.f89886c).f89840d.f89842b, iIntValue);
                            if (g7 != null) {
                                tVar2.f89898g.b(g7.f89844b);
                            }
                            break;
                        default:
                            ProductComment.MessageUrl messageUrl = (ProductComment.MessageUrl) this.f89886c;
                            String callupUrl = messageUrl.getCallupUrl();
                            eb.h hVar = (eb.h) this.f89885b;
                            if (!hVar.q0(callupUrl)) {
                                hVar.q0(messageUrl.getJumpUrl());
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, new H0(tVar, 3))), 0, (Function1) null, 6));
            return;
        }
        if (!arrayList.isEmpty()) {
            if (arrayList.size() > 1) {
                tVar.f89892a.f89880c.setValue(e7);
                final Flow flowFilterNotNull = FlowKt.filterNotNull(tVar.f89896e.f90695y);
                mVar.a(new RunningUIComponent(new C6107c(new C6107c.C0625c(new Flow<com.bilibili.ship.theseus.cheese.biz.intro.publisher.u>(flowFilterNotNull, e7, tVar) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.publisher.CheesePublisherService$createPublisherCooperator$$inlined$map$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Flow f89816a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final E f89817b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final t f89818c;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.publisher.CheesePublisherService$createPublisherCooperator$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/CheesePublisherService$createPublisherCooperator$$inlined$map$1$2.class */
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final FlowCollector f89819a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final E f89820b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final t f89821c;

                        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.publisher.CheesePublisherService$createPublisherCooperator$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/CheesePublisherService$createPublisherCooperator$$inlined$map$1$2$1.class */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            Object result;
                            final AnonymousClass2 this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(AnonymousClass2 anonymousClass2, Continuation continuation) {
                                super(continuation);
                                this.this$0 = anonymousClass2;
                            }

                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return this.this$0.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector, E e7, t tVar) {
                            this.f89819a = flowCollector;
                            this.f89820b = e7;
                            this.f89821c = tVar;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r13, kotlin.coroutines.Continuation r14) {
                            /*
                                Method dump skipped, instruction units count: 205
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.intro.publisher.CheesePublisherService$createPublisherCooperator$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    {
                        this.f89816a = flowFilterNotNull;
                        this.f89817b = e7;
                        this.f89818c = tVar;
                    }

                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = this.f89816a.collect(new AnonymousClass2(flowCollector, this.f89817b, this.f89818c), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, tVar.h.f100021b)), 0, (Function1) null, 6));
                return;
            }
            return;
        }
        Owner owner = this.f90402c.getOwner();
        String url = owner.getUrl();
        String titleUrl = owner.getTitleUrl();
        String title2 = owner.getTitle();
        String fans = owner.getFans();
        int attention = owner.getAttention();
        long fansNum = owner.getFansNum();
        Live live = owner.getLive();
        final com.bilibili.ship.theseus.cheese.biz.intro.publisher.B b7 = new com.bilibili.ship.theseus.cheese.biz.intro.publisher.B(url, titleUrl, title2, fans, attention, fansNum, owner.getSeasonCount(), new com.bilibili.ship.theseus.cheese.biz.intro.publisher.A(live.getMid(), live.getRoomId(), live.getUri(), live.getEndpageUri()), owner.getFace(), owner.getMid());
        com.bilibili.ship.theseus.cheese.biz.intro.publisher.p pVar = tVar.f89892a;
        pVar.f89878a.setValue(b7);
        pVar.f89882e.setValue(Boolean.valueOf(b7.f89799e == 1));
        pVar.f89880c.setValue(e7);
        final CheesePlayRepository$special$$inlined$map$1 cheesePlayRepository$special$$inlined$map$1 = tVar.f89896e.f90695y;
        ?? r02 = new Flow<com.bilibili.ship.theseus.cheese.biz.intro.publisher.C>(cheesePlayRepository$special$$inlined$map$1, b7, e7, tVar) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.publisher.CheesePublisherService$createPublisherOwner$$inlined$map$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CheesePlayRepository$special$$inlined$map$1 f89822a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final B f89823b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final E f89824c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final t f89825d;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.publisher.CheesePublisherService$createPublisherOwner$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/CheesePublisherService$createPublisherOwner$$inlined$map$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f89826a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final B f89827b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final E f89828c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final t f89829d;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.publisher.CheesePublisherService$createPublisherOwner$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/CheesePublisherService$createPublisherOwner$$inlined$map$1$2$1.class */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    Object result;
                    final AnonymousClass2 this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(AnonymousClass2 anonymousClass2, Continuation continuation) {
                        super(continuation);
                        this.this$0 = anonymousClass2;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return this.this$0.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, B b7, E e7, t tVar) {
                    this.f89826a = flowCollector;
                    this.f89827b = b7;
                    this.f89828c = e7;
                    this.f89829d = tVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r14, kotlin.coroutines.Continuation r15) {
                    /*
                        Method dump skipped, instruction units count: 229
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.intro.publisher.CheesePublisherService$createPublisherOwner$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f89822a = cheesePlayRepository$special$$inlined$map$1;
                this.f89823b = b7;
                this.f89824c = e7;
                this.f89825d = tVar;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f89822a.collect(new AnonymousClass2(flowCollector, this.f89823b, this.f89824c, this.f89825d), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        IntroContentSizeRepository introContentSizeRepository = tVar.h;
        mVar.a(new RunningUIComponent(new com.bilibili.ship.theseus.cheese.biz.intro.publisher.i(new i.a(r02, introContentSizeRepository.f100021b, introContentSizeRepository.f100022c, tVar.f89897f.f102939c)), 0, (Function1) null, 6));
    }
}
